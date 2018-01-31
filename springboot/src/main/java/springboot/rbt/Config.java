package springboot.rbt;

import springboot.color.Blue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@EnableAspectJAutoProxy
@Configuration
@PropertySource(value = {"classpath:hello.properties", "classpath:hello2.properties"})
@ComponentScan(basePackages = {"springboot"}, excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION)})
//用下面这种也可以，PropertySources可以指定多个PropertySource
//@PropertySources(value = {@PropertySource(value = "classpath:hello.properties"), @PropertySource(value = "classpath:hello2.properties")})
public class Config {

    @Primary
    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Lazy
    public Blue blue1() {
        System.out.println("set blue1");
        return new Blue();
    }

    //spring在会调用这个方法返回blue对象(前提是)
    @Bean()
    @Lazy
    public Blue blue2(@Value("hehe") String name) {
        System.out.println("set blue2");
        Blue blue = new Blue();
        blue.setName(name);

        return blue;
    }

}

