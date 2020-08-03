package com.dute7liang.ribbonconfig;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>created on 2020-8-3</p>
 *
 * @author dute7liang
 */
@Configuration
public class DefaultRibbonConfig {

    @Bean
    public IRule ribbonRule(){
//        return new RoundRobinRule();
        return new RandomRule();
    }

}
