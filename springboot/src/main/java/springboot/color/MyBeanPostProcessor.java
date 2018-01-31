package springboot.color;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object object, String s) throws BeansException {
        System.out.println("yellow init");
        return object;
    }

    public Object postProcessAfterInitialization(Object object, String s) throws BeansException {
        System.out.println("yellow after");
        return object;
    }
}
