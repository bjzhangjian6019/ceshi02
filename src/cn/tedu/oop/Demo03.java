package cn.tedu.oop;

/**
 * 总结：
 *      1、封装主要使用private关键字来实现的
 *      2、被封装的资源，提高了使用中安全性；只能在本类中进行访问，别的类访问不了
 *      3、如果在别的类里，非要访问私有资源，只能提供公共的方法
 *      4、当方法被私有化之后，外界是无法访问直接访问，只能间接去访问
 *      5、当属性被私有化之后，外界也是无法访直接访问的，只能通过getXXX方法进行获取值，
 *          通过setXXX方法设置值。
 * @author:Administrator
 * @date:2020/11/11
 */
public class Demo03 {

    public static void main(String[] args) {

        Student stu = new Student();
        stu.study();//公共的修饰public
        //stu.coding();//coding()方法已经被private修饰封装了，只能本类中使用
        //stu.name = "张三";//name属性被封装了，只能在本类中使用
        stu.setName("张三");//可以利用set方法进行修改值
        System.out.println(stu.getName());//通过get方法来进行获取值
        stu.setAge(19);
       //System.out.println(stu.age);
        System.out.println(stu.getAge());
        stu.setGender('男');//设置gender性别
        System.out.println(stu.getGender());
        stu.setScore(98.0);//设置分数 score
        System.out.println(stu.getScore());
        System.out.println("-------------------------------");
        System.out.println(stu.toString());
    }
}
