package cn.imnu.ioc.demo1;

public class UserServiceImpl implements UserService{
    private String name;
    public void sayHello(){
        System.out.println("Hello Spring");

    }
    public String taste;
    public String kind;
    public void Food(){
        System.out.println(name+"属于"+kind+",口味"+taste);
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "name='" + name + '\'' +
                ", taste='" + taste + '\'' +
                ", kind='" + kind + '\'' +
                '}';
    }
}
