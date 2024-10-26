package Q_CollectionFramework;

import java.util.LinkedList;

public class LinkedListUnderlyingPrinciples {
    public static void main(String[] args) {
        /**LinkedList集合的底层原理：
         *      基于双链表实现的。
         *      链表：链表中的结点是独立的对象，在内存中是不连续的，每个结点包含数据值和下一个结点的地址。
         *          特点：查询慢，无论查询哪个数据都要从头开始找。
         *               链表增删相对快。
         *      双链表：每个结点不仅包含数据值和下一个结点的地址，还包含上一个结点的地址。
         *             特点：查询满，增删相对较快，但对首位元素进行增删改查的速度是极快的。
         *      LinkList新增了很多首尾操作的特有方法。
         *      应用场景：1.设计队列（先进先出，后进后出）(addLast,removeFirst)
         *              2.设计栈（后进先出，先进后出）数据进入栈模型的过程称之为压/进栈(push：addFirst)。离开：弹/出栈（pop:removeFrist）。栈顶元素，栈底元素
         *
        */

        LinkedList<String> l1 = new LinkedList<>();
        l1.add("gs");
        l1.add("wqr");
        l1.add("nb");
        l1.add("666");

        l1.addFirst("0");//在列表开头插入指定的元素
        l1.addLast("1");//在列表结尾插入指定的元素

        System.out.println(l1.getFirst());//返回此列表的第一个元素
        System.out.println(l1.getLast());//返回此列表的最后一个元素

        System.out.println(l1.removeFirst());//从此列表中删除并返回第一个元素
        System.out.println(l1.removeLast());//从此列表中删除并返回最后一个元素

    }
}
