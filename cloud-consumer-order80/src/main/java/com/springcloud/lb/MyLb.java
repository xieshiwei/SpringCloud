package com.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * LoadBalance实现类
 */
@Component
public class MyLb implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement() {
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            //整形最大值为2147483647，如果越界了从0开始
            next = current >= 2147483647 ? 0 : current + 1;
        }
        while (!this.atomicInteger.compareAndSet(current, next));
        System.out.println("第几次访问next:" + next);
        return next;
    }


    /**
     * 获取服务器实力
     *
     * @param serviceInstances
     * @return
     */
    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
