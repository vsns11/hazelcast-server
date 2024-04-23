//package ca.siva.config;
//
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.List;
//
//@Configuration
//@ConfigurationProperties(prefix = "hazelcast")
//public class HazelcastProperties {
//
//    private String clusterName;
//    private List<MapStoreConfig> mapstores;
//
//    // Getters and setters
//
//    public String getClusterName() {
//        return clusterName;
//    }
//
//    public void setClusterName(String clusterName) {
//        this.clusterName = clusterName;
//    }
//
//    public List<MapStoreConfig> getMapstores() {
//        return mapstores;
//    }
//
//    public void setMapstores(List<MapStoreConfig> mapstores) {
//        this.mapstores = mapstores;
//    }
//
//    public static class MapStoreConfig {
//        private String mapName;
//        private String mapstoreClass;
//        private String keyType;
//        private String valueType;
//        private int writeDelaySeconds;
//        private int timeToLiveSeconds;
//        private int batchSize;
//
//        // Getters and setters
//        public String getMapName() {
//            return mapName;
//        }
//
//        public void setMapName(String mapName) {
//            this.mapName = mapName;
//        }
//
//        public String getMapstoreClass() {
//            return mapstoreClass;
//        }
//
//        public void setMapstoreClass(String mapstoreClass) {
//            this.mapstoreClass = mapstoreClass;
//        }
//
//        public String getKeyType() {
//            return keyType;
//        }
//
//        public void setKeyType(String keyType) {
//            this.keyType = keyType;
//        }
//
//        public String getValueType() {
//            return valueType;
//        }
//
//        public void setValueType(String valueType) {
//            this.valueType = valueType;
//        }
//
//        public int getWriteDelaySeconds() {
//            return writeDelaySeconds;
//        }
//
//        public void setWriteDelaySeconds(int writeDelaySeconds) {
//            this.writeDelaySeconds = writeDelaySeconds;
//        }
//
//        public int getTimeToLiveSeconds() {
//            return timeToLiveSeconds;
//        }
//
//        public void setTimeToLiveSeconds(int timeToLiveSeconds) {
//            this.timeToLiveSeconds = timeToLiveSeconds;
//        }
//
//        public int getBatchSize() {
//            return batchSize;
//        }
//
//        public void setBatchSize(int batchSize) {
//            this.batchSize = batchSize;
//        }
//    }
//}
//
