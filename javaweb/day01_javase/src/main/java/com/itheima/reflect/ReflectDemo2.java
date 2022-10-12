package com.itheima.reflect;

import java.lang.reflect.Field;

import com.itheima.domain.Person;

public class ReflectDemo2 {
    public static void main(String[] args) {
        Class personClass = Person.class;
        
        // Field[] getFields() 获取所有public的field
        Field[] fields = personClass.getFields();

        for(Field field: fields){
            System.out.println(field);
        }
    }
}
