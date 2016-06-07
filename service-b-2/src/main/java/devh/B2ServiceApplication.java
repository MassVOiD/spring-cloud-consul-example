package devh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * User: Michael
 * Email: zhangyichen@xiaoniu66.com
 * Date: 2016/6/3
 */
@SpringBootApplication
@EnableDiscoveryClient
public class B2ServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(B2ServiceApplication.class, args);
    }
}
