package com.itheima.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.itheima.junit.Calculator;

/**
 * Unit test for simple App.
 */
public class CalculatorTest 
{
    /*
     * @before 用于资源申请
     * 在测试方法开始之前自动执行
     */
    @Before
    public void init(){
        System.out.println("init...");
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void sumTest()
    {
        System.out.println("implemented!!");
        Calculator c = new Calculator();
        int result = c.sum(1,4);

        assertEquals( 5,result);
    }

    @Test
    public void subTest(){
        Calculator c = new Calculator();
        int result = c.sub(1,4);

        assertEquals( -3,result);
    }

    /*
     * @After 用于资源释放
     * 在所有测试方法执行后，会自动执行
     */
    @After
    public void close(){
        System.out.println("close...");
    }
}
