package T_SpecialFile;

public class logTotal {
    public static void main(String[] args) {
        //日志：一个文件，里面记录的是程序运行中的各种信息。
        //之前的形式:日志会展示在控制台，不能方便的把日志记录在其他位置，想取消日志，需要修改源代码才可以完成
        //日志技术：可以将系统执行的信息，方便的记录到指定的位置（控制台、文件中、数据库中）
        //        可以随时以开关的形式控制日志的启停，无需侵入到源码中去进行修改
        //日志框架：JUL、Log4j、Logback、其他（Logback是基于slf4j的日志规范实现的框架）
        //日志接口：设计日志框架的一套标准，日志框架需要实现这些接口
        //        Commons Logging(JCL)[JUL实现]   Simple Logging Facade for Java(SLF4J)[Log4j和Logback实现]

        //注意：对Logback日志框架的控制，都是通过其核心配置文件logback.xml来实现的
        //日志的输出位置、输出格式的设置
        //通常可以设置2个输出日志的位置：一个是控制台、一个是系统文件中
//        <appender name="CONSOLE" class="ch.qos.logback.core.ConsoleAppender">
//        <appender name="FILE" class="ch.qos.logback.core.rolling.RollingFileAppender">

        //开启日志（ALL），取消日志(OFF)
//       <root level="ALL">
//        <appender-ref ref="CONSOLE"/>
//        <appender-ref ref="FILE" />
//      </root>

    }
}
