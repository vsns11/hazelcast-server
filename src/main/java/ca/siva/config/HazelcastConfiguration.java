package ca.siva.config;


import com.hazelcast.config.ClasspathYamlConfig;
import com.hazelcast.config.Config;
import com.hazelcast.config.MapConfig;
import com.hazelcast.config.MapStoreConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
//@EnableConfigurationProperties(HazelcastProperties.class)
public class HazelcastConfiguration {
//    private final HazelcastProperties hazelcastProperties;

//    public HazelcastConfiguration(HazelcastProperties hazelcastProperties) {
//        this.hazelcastProperties = hazelcastProperties;
//    }

    @Bean
    public Config config(){

        return new ClasspathYamlConfig("hazelcast.yml");
    }

    @Bean
    public HazelcastInstance hazelcastInstance(Config config) {
        log.info("Created hazelcastInstance bean");
        return Hazelcast.newHazelcastInstance(config);
    }
}
