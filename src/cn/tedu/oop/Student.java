package cn.tedu.oop;

/**
 * @author:Administrator
 * @date:2020/11/11
 */
public class Student {
    //成员变量
    //使用private修饰
    private String name;//姓名，name只能在本类中使用，被private进行封装
    private int age;//年龄
    private char gender;//性别
    private double score;//分数

    //get和set方法
    //当属性被private封装后，需要获取值的时候，得通过getXXX方法来访问
    public String getName() {
        return name;//直接获取当前类中name值
    }
    //当属性被private封装后，可以使用setXXX方法进行设置值
    public void setName(String name) {//name=张三
        this.name = name;//给name赋值
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", score=" + score +
                '}';
    }

    //使用private封装的，只能在本类中访问。
    private void coding(){
        System.out.println("coding...........");
    }

    //方法
    public void study(){
        System.out.println("学习......");
        coding();
    }

}
