package springboot.color;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
@Component
@Lazy
public class Red {

    public Red() {
        System.out.println("red contructor");
    }

    @Value("${red.name}")
    private String name;

    @Autowired
    private Blue blue;

    public static void main(String[] args) {
        Red red = new Red();
        System.out.println(red.getClass().toString());
    }

    @PostConstruct
    public void init() {
        System.out.println("red init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("red destroy");
    }

}
