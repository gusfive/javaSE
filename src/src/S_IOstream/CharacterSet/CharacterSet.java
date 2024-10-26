package S_IOstream.CharacterSet;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharacterSet {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //字符集：ASCII字符集：使用一个字节存储，每个字符对应一个码点，然后转为对应的二进制，128个码点，转为二进制每个首尾补0
        //                  美国信息交换标准代码，包括了英文、符号等
        //      GBK：汉字内码扩展规范，汉字编码字符集，包含了2万多个汉字等字符，GBK中一个中文字符编码成两个字节的形式存储
        //          同时兼容了ASCII字符集
        //          GBK规定：汉字的第一个字节的第一位必须是1
        //      Unicode字符集：统一码，也叫万国码
        //                  国际组织制定的，可以容纳世界上所有文字、符号的字符集。
        //                  UTF-32 4个字节表示一个字符（占存储空间，通信效率变低）
        //                  UTF-8  是Unicode字符集的一种编码方案，采取可变长编码方案，共分为四个长度区：1个字节，2个字节，3个字节，4个字节
        //                          英文字符、数字等只占1个字节（兼容标准ASCII），汉字字符占用3个字节
        //                          编码方式：单字节：0XXXXXXX(ASCII码) 2字节：110XXXXX 10XXXXXX
        //                                  3字节：1110XXXX 10XXXXXX 10XXXXXX 4字节：11110XXX 10XXXXXX 10XXXXXX 10XXXXXX
        //                          技术人员在开发时都应该使用UTF-8编码
        //注意：字符编码时使用的字符集，和解码时使用的字符集必须一致，否则会出现乱码
        //      英文，数字一般不会乱码，因为很多字符集都兼容了ASCII编码

        //byte[] getBytes():使用平台默认字符集将该String编码为一系列字节，将结果存储到新的字节数组中
        byte[] test1 = "我是谁".getBytes();
        System.out.println(Arrays.toString(test1));

        //byte[] getBytes(String charsetName):使用指定的字符集将该String编码为一系列字节，将结果存储到新的字节数组中
        byte[] test2 = "谁是我".getBytes("GBK");
        System.out.println(Arrays.toString(test2));

        //String(byte[] bytes):通过使用平台的默认字符集解码指定的字节数组来构造新的String
        String s1 = new String(test1);
        System.out.println(s1);

        //String(byte[] bytes,String charsetName)：通过指定的字符集解码指定的字节数组来构造新的String
        String s2 = new String(test2,"UTF_16");
        System.out.println(s2);

    }
}
