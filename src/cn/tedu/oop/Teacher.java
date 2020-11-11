package cn.tedu.oop;

/**
 * @author:Administrator
 * @date:2020/11/11
 */
public class Teacher {

    String name;
    int age;

    //构造方法:
    //默认的无参构造
    public Teacher(){
        System.out.println("默认的无参构造...");
    }
    //自己创建一个有参构造
    public Teacher(String name){
        this.name = name;//完成初始化操作
    }
    public Teacher(int age){
        this.age = age;
    }
    //方法的重载：方法名相同，参数列表不同
    public Teacher(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
