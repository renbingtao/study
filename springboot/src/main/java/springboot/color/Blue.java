package springboot.color;

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Data
@Component()
@Lazy
public class Blue implements InitializingBean{

    public Blue() {
        System.out.println("blue construct");
    }

    @Value("23423")
    private Integer id;

    //    @Value("${blue.name}")
    private String name;

    @Override
    public String toString() {
        return "Blue{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void init() {
        System.out.println("blue init");
    }

    public void destroy() {
        System.out.println("blue destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("blue afterPropertiesSet");
    }
}
