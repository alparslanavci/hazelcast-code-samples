package example;

import com.hazelcast.config.Config;
import com.hazelcast.config.UserCodeDeploymentConfig;
import com.hazelcast.core.Hazelcast;

public class Cluster {

    public static void main(String[] args) {
        Config config = new Config();
        UserCodeDeploymentConfig userCodeDeploymentConfig = new UserCodeDeploymentConfig();
        userCodeDeploymentConfig.setEnabled(true);
        config.setUserCodeDeploymentConfig(userCodeDeploymentConfig);
        Hazelcast.newHazelcastInstance(config);
        Hazelcast.newHazelcastInstance(config);
    }
}