package cn.imnu.ioc.demo4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo4 {
    /**
     *构造方法属性注入
     */
    @Test
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
    }
    @Test
    /**
     * set方法属性注入
     */
    public void demo2(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
    @Test
    /**
     * spel方法属性注入
     */
    public void demo3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Product product=(Product) applicationContext.getBean("product");
        System.out.println(product);
    }
}
