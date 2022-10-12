# Javaweb

## day01
1. Junit单元内容
2. 反射
3. 注解

1.1 Junit
- 黑盒测试：不需要学代码，给输入，看输出是否符合期望
- 白盒测试：需要写代码，关注程序的执行流程

junit是白盒测试

- 步骤：
  1. 建立一个Maven project
      - 建议：
            - 测试类名： 被测试类名Test CalculatorTest
            - 包名：xx.xx.xx.test    cn.itheima.test
  2. 定义测试方法：可独立运行，测试程序放在src.test.java.cn.itheima下
  3. 给方法添加@Test
  4. 导入Junit依赖环境 

- 判定结果:
  - 通常使用assert.assertEquals(expected,result)比对期待结果和result

- 补充：
  - @Before 用于资源申请,在测试方法开始之前自动执行
  - @After 用于资源释放,在所有测试方法执行后，会自动执行

2.1 反射：框架设计的灵魂

- 框架：半成品软件，可以在框架的基础上尽享软件开发，简化编码
- 反射：将类的各个组成部分封装为其他对象，这就是反射机制
  - 好处：
    - 可以在程序运行过程中，操作这些对象
    - 可以解耦，提高程序的可扩展性
- 获取class对象
    1. Class.forName("全类名")，将字节码文件加载进内存，返回class对象：多用于配置文件，将类名定义在配置文件中。读取文件，加载类
    2. classname.class,通过类名的属性class获取：多用于参数的传递
    3. 对象.getClass(),getClass()方法在Object类中定义着：多用于对象的获取字节码的方式

  - 结论：
    - 同一个字节码文件(*.class)在一次程序运行过程中，只会被加载一次，不论通过哪一种方式获取的class对象都是同一个

- class对象功能：
  - 获取功能
      1. 获取成员变量们
         1. Field[] getFields() 获取所有 **public** 修饰的成员变量
         2. Field getField(String name) 获取指定名称的 **public** 修饰的成员变量
         3. Field[] getDeclaredFields() 获取所有的成员变量，不考虑修饰符
         4. Field[] getDeclaredField(String name)
      2. 获取构造方法们
      3. 获取成员方法们
      4. 获取类名
  
- Field：成员变量
  - 操作：
    1. 设置值  `void set(Object obj, Object value)`
    2. 获取值  `get(Object obj)`
    3. 忽略访问权限修饰符的安全检查
      - `serAccessible(true)`:暴力反射