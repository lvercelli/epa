package org.lvh.tsbp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by lvercelli on 5/23/16.
 */
@SpringBootApplication
public class WebApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(WebApplication.class);
        app.run(args);
    }
}
