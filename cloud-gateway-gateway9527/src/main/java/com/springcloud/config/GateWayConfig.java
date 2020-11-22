package com.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * gateway配置类
 */
@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        //构建yml中的routes节点
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        //http://news.baidu.com/guonei
        //path_route_springcloud 相当于yml中routes.id
        // localhost:9527/guonei 直接跳转到  http://news.baidu.com/guone
        routes.route("path_route_springcloud",
                r -> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei"));
        return routes.build();
    }
}
