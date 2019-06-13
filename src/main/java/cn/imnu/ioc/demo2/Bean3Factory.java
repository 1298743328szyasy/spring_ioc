package cn.imnu.ioc.demo2;

public class Bean3Factory {
    public Bean3 creatBean3(){
        System.out.println("Bean3Factory已经执行...");
        return new Bean3();
    }
}
