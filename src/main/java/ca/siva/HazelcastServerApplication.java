package ca.siva;


import com.hazelcast.config.Config;
import com.hazelcast.config.MapConfig;
import com.hazelcast.config.MapStoreConfig;
import com.hazelcast.core.HazelcastInstance;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Map;

@SpringBootApplication
@EnableJpaRepositories
public class HazelcastServerApplication {

    @Autowired
    HazelcastInstance hazelcastInstance;
    public static void main(String[] args) {
        SpringApplication.run(HazelcastServerApplication.class, args);
    }

    @PostConstruct
    public void logHazelcastConfig() {
        Config config = hazelcastInstance.getConfig();
        System.out.println("Current Hazelcast Configuration:");
        System.out.println("Cluster Name: " + config.getClusterName());

        Map<String, MapConfig> mapConfigs = config.getMapConfigs();
        mapConfigs.forEach((key, value) -> {
            System.out.println("Map Name: " + key);
            MapStoreConfig storeConfig = value.getMapStoreConfig();
            if (storeConfig != null) {
                System.out.println("  MapStore Enabled: " + storeConfig.isEnabled());
                System.out.println("  MapStore ClassName: " + storeConfig.getClassName());
                System.out.println("  Write-Delay-Seconds: " + storeConfig.getWriteDelaySeconds());
                System.out.println("  Write-Behind Enabled: " + (storeConfig.getWriteDelaySeconds() > 0));
            }
        });
    }
}
