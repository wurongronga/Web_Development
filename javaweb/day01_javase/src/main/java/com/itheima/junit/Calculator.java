package com.itheima.junit;

/**
 * Hello world!
 *
 */
public class Calculator 
{
    public static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static int sub(int a,int b){
        int sub = a-b;
        return sub;
    }

    public static void main( String[] args )
    {
        System.out.println( sum(1,2) );
    }
}
