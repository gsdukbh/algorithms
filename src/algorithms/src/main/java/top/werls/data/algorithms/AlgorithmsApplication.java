package top.werls.data.algorithms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author lee
 */
@EnableAsync
@SpringBootApplication
public class AlgorithmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmsApplication.class, args);
    }

}
