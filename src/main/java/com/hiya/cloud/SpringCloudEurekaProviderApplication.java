package com.hiya.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Tips:如果使用Eureka, 可以使用@EnableEurekaClient注解，但是推荐使用@EnableDiscoveryClient代替@EnableEurekaClient注解，
 * 因为@EnableDiscoveryClient是一个高度的抽象， 来自于spring-cloud-commons， 由于Spring Cloud选型是中立的因此抽象出该接
 * 口当服务注册中心选型改变为Eureka，ZK，Consul时，不需要修改原有代码中的注解。
 * @author zjq
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
//@EnableEurekaClient
public class SpringCloudEurekaProviderApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SpringCloudEurekaProviderApplication.class, args);
    }
}
