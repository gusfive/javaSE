package T_SpecialFile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogBackTest {
    //创建一个Logger日志对象
    public static final Logger LOGGER = LoggerFactory.getLogger("LogBackTest");

    public static void main(String[] args) {
        try{
            LOGGER.info("divide开始执行");
            divide(10,0);
            LOGGER.info("divide执行成功");
        }catch (Exception e){
            LOGGER.error("divide执行失败");
        }
    }

    public static void divide(int a,int b){
        LOGGER.debug("参数a"+a);
        LOGGER.debug("参数b"+b);
        int c = a/b;
        LOGGER.info("结果是"+c);
    }
}
