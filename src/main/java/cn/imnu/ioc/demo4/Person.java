package cn.imnu.ioc.demo4;

public class Person {
    private String name;
    private String age;
    private Cat Cat;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public cn.imnu.ioc.demo4.Cat getCat() {
        return Cat;
    }

    public void setCat(cn.imnu.ioc.demo4.Cat cat) {
        Cat = cat;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", Cat=" + Cat +
                '}';
    }
}
