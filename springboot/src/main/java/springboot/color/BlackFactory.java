package springboot.color;

import lombok.Data;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Data
@Component
public class BlackFactory implements FactoryBean<Black> {

    public Black getObject() throws Exception {
        return new Black();
    }

    public Class<?> getObjectType() {
        return Black.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
