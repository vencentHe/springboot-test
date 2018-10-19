
package hello.littletest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * myPropApp
 */
@SpringBootApplication
public class myPropApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(myPropApp.class).
        properties("spring.config.location=classpath:/config/abc.properties").run(args);
    }
}