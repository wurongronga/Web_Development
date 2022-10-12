package com.itheima.reflect;

import com.itheima.domain.Person;

public class ReflectDemo1 {
    /*
     * 获取class对象
    1. Class.forName("全类名")，将字节码文件加载进内存，返回class对象
    2. classname.class,通过类名的属性class获取
    3. 对象.getClass(),getClass()方法在Object类中定义着
     */

     public static void main(String[] args) throws ClassNotFoundException {
        // 1. Class.forName("全类名")，将字节码文件加载进内存，返回class对象
        Class cls1 = Class.forName("com.itheima.domain.Person");
        System.out.println(cls1);
        // 2. classname.class,通过类名的属性class获取
        Class cls2 = Person.class;
        System.out.println(cls2);
        // 3. 对象.getClass(),getClass()方法在Object类中定义着
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        // 比较三个对象
        System.out.println(cls1==cls2);
        System.out.println(cls2==cls3);
     }
}
