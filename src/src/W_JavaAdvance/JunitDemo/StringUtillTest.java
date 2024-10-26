package W_JavaAdvance.JunitDemo;

import org.junit.*;

public class StringUtillTest {

    @Before
    public void test1(){
        System.out.println("---->test1 Before 执行成功----");
    }

    @BeforeClass
    public static void test11(){
        System.out.println("---->test11 BeforeClass 执行成功----");
    }


    @After
    public void test2(){
        System.out.println("---->test2 After 执行成功----");
    }

    @AfterClass
    public static void test22(){
        System.out.println("---->test22 AfterClass 执行成功----");
    }

    @Test  //测试方法
    public void testprintNumber(){
        StringUtill.printNumber("admin");
        StringUtill.printNumber(null);
    }

    @Test
    public void testgetMaxIndex(){
        int index1 = StringUtill.getMaxIndex("admin");
        System.out.println(index1);
        int index2 = StringUtill.getMaxIndex(null);
        System.out.println(index2);

        //断言机制：程序员可以通过预测业务方法的结果。
        Assert.assertEquals("方法内部存在问题",4,index1);
    }
}
