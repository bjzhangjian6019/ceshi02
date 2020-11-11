package cn.tedu.oop;

/**
 * 测试构造方法：
 *
 * @author:Administrator
 * @date:2020/11/11
 */
public class Demo04 {

    public static void main(String[] args) {

        Teacher teacher = new Teacher();//匹配无参构造
        teacher.name = "张老师";
        teacher.age = 30;
        System.out.println(teacher.name + ", " + teacher.age);

        Teacher teacher1 = new Teacher("张老师");
        Teacher teacher2 = new Teacher(30);
        Teacher teacher3 = new Teacher("张老师",30);

        //ctrl+D---快速复制一行
        System.out.println(teacher1.toString());
        System.out.println(teacher2.toString());
        System.out.println(teacher3.toString());
    }

}
