package springboot.starter;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootStarter {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(SpringBootStarter.class, args);

    }

    @Test
    public void test() {
        System.out.println("中文");
    }

}
