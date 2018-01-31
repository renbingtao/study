package springboot.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyFirstAspect {

    @Before(value = "execution(* springboot.service.MyService.*(..))")
    public void beforeMethod() {
        System.out.println("before method");
    }

}
