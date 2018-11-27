package com.hiya.cloud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController
{

    // @Autowired
    // private OrderService orderService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(@PathVariable String applicationName)
    {
        return this.discoveryClient.getInstances(applicationName);
    }

    @RequestMapping(value ="/hiya/order/{id}",method = RequestMethod.GET)
    public OrderModel findOrderById(@PathVariable Integer id)
    {
        OrderModel orderModel = new OrderModel(id, "唐订单", "genhngtai 4S", "Tang");
        return orderModel;
    }
}