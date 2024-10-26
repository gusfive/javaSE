package T_SpecialFile;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class XMLDemo {
    public static void main(String[] args) throws Exception {
        //XML：EXtensible Markup Language,可扩展标记语言
        //本质是一种数据格式，可以用来存储复杂的数据结构和数据关系
        //特点：1.XML中的"<标签名>"称为一个标签或一个元素，一般是成对出现的。
        //     2.XML中的标签名可以自己定义（可扩展），但必须要正确的嵌套。
        //     3.XML中只能有一个根标签。
        //     4.XML中的标签可以有属性。
        //     5.如果一个文件中放置的是XML格式的数据，这个文件就是XML文件，后缀一般要写成.xml。
        //XML中书写”<“、"&"等，可能会出现冲突导致报错，此时可以用如下特殊字符替代
        //&lt; == <  &gt; == >  &amp; == &  &apos; == '  &quot; == "
        //XML中可以写一个叫CDATA的数据区：<![CDATA[。。。内容。。。]]>，里面的内容可以随便写
        //应用场景：经常用来作为系统的配置文件；或者作为一种特殊的数据结构，在网络中进行传输。

        //解析XML文件：使用程序读取XML文件中的数据，Dom4j框架
        //DOM4J解析文件的思想：文档对象模型
        //                  通过SAXReader解析器，把xml文件解析为Document文件，然后划分为Element:元素（标签)，其下又可分为Attribute(属性)以及子元素、文本

        //构造器
        SAXReader saxReader = new SAXReader();

        //方法
        //使用saxReader对象把需要解析的XML文件读成一个Document对象。
        Document document = saxReader.read("javaLearn/src/src/T_SpecialFile/helloworld.xml");
        //从文档对象中解析XML文件的全部数据
        Element root = document.getRootElement();
        System.out.println(root.getName());
        //获取根元素下的全部一级子元素
        List<Element> elements = root.elements();
        for (Element element : elements) {
            System.out.println(element.getName());
        }
        //获取当前元素下的某个子元素（若有重复名称则选择第一个）
        Element elements2 = root.element("people");
        //获取该元素的文本内容
        System.out.println(elements2.getText());
        //获取当前元素下的指定名称的元素集合
        List<Element> elements1 = root.elements("user");
        //获取某元素下的指定元素的文本内容
        Element user = root.element("user");
        System.out.println(user.elementText("name"));
        //获取元素的属性信息
        System.out.println(user.attributeValue("id"));

        Attribute id = user.attribute("id");
        System.out.print(id.getName());
        System.out.println(id.getValue());
        //获取多个属性元素
        List<Attribute> attributes = user.attributes();
        for (Attribute attribute : attributes) {
            System.out.println(attribute.getName()+"="+attribute.getValue());
        }
        //获取全部的文本内容：获取当前元素下的子元素文本值
        Element data = user.element("data1");
        System.out.println(data.getText());
        System.out.println(data.getTextTrim());//取出文本去除前后空格


        //使用程序把数据写出到XML文件中，推荐直接把程序里的数据拼接成XML格式，然后用IO流写出去
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\">\r\n");
        sb.append("<book>\r\n");
        sb.append("\t<name>").append("从入门到跑路").append("</name>\r\n");
        sb.append("\t<author>").append("gs").append("</author>\r\n");
        sb.append("</book>");

        try (
                BufferedWriter bw = new BufferedWriter(new FileWriter("javaLearn/src/src/T_SpecialFile/xml.xml"));
        ){
            bw.write(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        //约束XML文件的编写
        //  限制XML文件只能按照某种格式书写
        //  约束文档：专门用来限制XML书写格式的文档，比如：限制标签、属性
        //          DTD文档、Schema文档

    }
}
