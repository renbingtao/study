package springboot.rbt;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springboot.color.Blue;
import springboot.color.MyBeanPostProcessor;
import springboot.color.Red;
import springboot.service.MyService;

public class IOCTest {

    //传入一个普通的类，即加入ioc容器中
    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Red.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames
                ) {
            System.out.println(name);
        }
    }

    @Test
    public void test02() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames
                ) {
            System.out.println(name);
        }
        System.out.println("=====" + applicationContext.getBean("blue1", Blue.class));
        applicationContext.close();
    }

    @Test
    public void test03() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames
                ) {
            System.out.println(name);
        }
        System.out.println("=====" + applicationContext.getBean(Red.class));
        applicationContext.close();
    }

    @Test
    public void test04() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames
                ) {
            System.out.println(name);
        }
        System.out.println("=====" + applicationContext.getBean(MyBeanPostProcessor.class));
        applicationContext.close();
    }

    @Test
    public void test05() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        System.out.println("=====" + applicationContext.getBean("blackFactory"));
        applicationContext.close();
    }

    @Test
    public void test06() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        System.out.println("=====" + applicationContext.getBean("&blackFactory"));
        applicationContext.close();
    }

    @Test
    public void testAop() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        MyService myService = applicationContext.getBean(MyService.class);
        myService.service();
    }
}
