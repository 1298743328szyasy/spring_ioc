package cn.imnu.ioc.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo1 {
    @Test
    /**
     * 传统方式开发
     */
    public void demo1(){
        UserService userService = new UserServiceImpl();
        userService.sayHello();
    }
    @Test
    /**
     * Spring
     */
    public void demo2(){
        //创建工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.Food();
    }
    @Test
    /**
     * 读取磁盘中的配置文件
     */
    public void demo3(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("c:\\applicationContext.xml");
        UserService userService = (UserService)applicationContext.getBean("userService");
        userService.sayHello();
    }
}
