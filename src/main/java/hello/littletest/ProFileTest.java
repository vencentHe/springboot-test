
package hello.littletest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * ProFileTest
 */
@SpringBootApplication
public class ProFileTest {
    
    public static void main(String[] args) {
        //new SpringApplicationBuilder(ProFileTest.class).properties("spring.profiles.active=linux").run(args);

        new SpringApplicationBuilder(ProFileTest.class).
        properties("spring.profiles.active=windows","server.port=9999").run(args);
    }
    
}