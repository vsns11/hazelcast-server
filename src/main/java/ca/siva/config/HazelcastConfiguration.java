package ca.siva.config;


import ca.siva.mapstore.PostRequestMapStore;
import com.hazelcast.config.ClasspathYamlConfig;
import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import com.hazelcast.core.ManagedContext;
import com.hazelcast.spring.context.SpringManagedContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.*;


@Configuration
@Slf4j
public class HazelcastConfiguration {


    @Bean
    public SpringManagedContext managedContext() {
        return new SpringManagedContext();
    }

    @Bean
    public Config config(ManagedContext managedContext) {
        Config config = new ClasspathYamlConfig("hazelcast.yml");
        config.setManagedContext(managedContext);
        return config;
    }

    @Bean
    public HazelcastInstance hazelcastInstance(Config config) {
        log.info("Created hazelcastInstance bean");
        return Hazelcast.newHazelcastInstance(config);
    }
}
