package springboot.color;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Black {
    @Value("i am black")
    private String name;

}
