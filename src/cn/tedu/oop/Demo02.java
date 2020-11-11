package cn.tedu.oop;
/**
 * 对象的内存结构分析：
 *    Phone和Demo01
 *    多个对象使用同一个内存空间
 * @author:Administrator
 * @date:2020/11/11
 */
public class Demo02 {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.color = "海军蓝";
        p.brand = "iPhone 12 pro max";
        p.price = 9299.0;
        p.size = 6.7;

        System.out.println(p);
        System.out.println(p.color);
        System.out.println(p.brand);
        System.out.println(p.price);
        System.out.println(p.size);
        System.out.println("------------------------------------");
        Phone p1 = p;
        System.out.println(p1.brand);
        System.out.println(p1.price);
        p1.call();
        p1.price = 8999.0;
        System.out.println(p1.price);
        System.out.println(p.price);
    }
}
