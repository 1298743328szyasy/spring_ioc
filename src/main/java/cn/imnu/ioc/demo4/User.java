package cn.imnu.ioc.demo4;

public class User {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

}