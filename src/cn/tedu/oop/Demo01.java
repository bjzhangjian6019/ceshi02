package cn.tedu.oop;
/**
 * 对象的内存结构分析：
 *    Phone和Demo01
 * @author:Administrator
 * @date:2020/11/11
 */
public class Demo01 {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.color = "海军蓝";
        p.brand = "iPhone 12 pro max";
        p.price = 9299.0;
        p.size = 6.7;
        System.out.println(p.color);
        System.out.println(p.brand);
        System.out.println(p.price);
        System.out.println(p.size);




    }
}