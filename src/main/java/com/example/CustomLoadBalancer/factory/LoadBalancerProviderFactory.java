package com.example.CustomLoadBalancer.factory;

import com.example.CustomLoadBalancer.LoadBalancer;
import com.example.CustomLoadBalancer.RoundRobinLoadBalancer;
import com.example.CustomLoadBalancer.WeightedRoundRobinLoadBalancer;
import com.example.CustomLoadBalancer.enums.LoadBalancingStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LoadBalancerProviderFactory {
    public static LoadBalancer getLoadBalancer(LoadBalancingStrategy strategy){
        switch (strategy){
            case ROUND_ROBIN:
                return new RoundRobinLoadBalancer();
            case WEIGHTED_ROUND_ROBIN:
                return new WeightedRoundRobinLoadBalancer();
            default:
                log.error("{} is not supported currently", strategy);
        }
        return null;
    }
}
