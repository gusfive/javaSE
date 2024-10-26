package T_SpecialFile;

public class LoginbackDemo {
    public static void main(String[] args) {
        //Loginback日志框架有以下几个模块：1.logback-core基础模块。其他两个模块存在的基础。必须存在
        //                            2.logback-classic完整实现了slf4j API的模块。必须存在
        //                            3.logback-access 与Tomcat和Jetty等Servlet容器集成，以提供HTTP访问日志的功能。不必须存在。
        //想使用Logback日志框架，至少需要在项目中整合如下三个模块：slf4j-api logback-core logback-classic
        //      1.把logback-core和logback-classic和slf4j-api加入lib文件夹并add ad library
        //      2.把logback.xml加入到src文件夹中
        //      3.创建Lpgback框架提供的Logger对象，然后用Logger对象调用其提供的方法就可以记录系统的日志信息。

        //日志级别：日志信息的类型，日志都会分级别，常见的日志级别如下
        //        trace追踪，指程序运行轨迹
        //        debug调试，实际应用中一般将其作为最低级别，而trace很少用
        //        info输出重要的运行信息，数据连接、网络连接、IO操作等，使用较多
        //        warn警告信息，可能会发生问题，使用较多
        //        error错误信息，使用较多

//     <root level="级别">
//        <appender-ref ref="CONSOLE"/>
//        <appender-ref ref="FILE" />
//    </root>

        //只有日志级别大于或等于核心配置文件配置的日志级别，才会被记录，否则不记录

    }
}
