package Q_CollectionFramework;

public class HashSetDemo {
    public static void main(String[] args) {
        /**HashSet集合的底层原理
         *  哈希值：一个int类型的数值，JAVA中每个对象都有一个哈希值。
         *        hashCodde:返回对象的哈希码值。
         *        特点：同一个对象多次调用hashCode()方法返回的哈希值是相同的。
         *             不同的对象，它们的哈希值一般不同，但也有可能会相同（哈希碰撞）。
         *  基于哈希表实现：哈希表是一种增删改查数据，性能都较好的数据结构。
         *               哈希表：JDK8之前，哈希表 = 数组 + 链表。
         *                              1.创建一个默认长度16的数组，默认加载因子0.75，数组名table
         *                              2.使用元素的哈希值对数组的长度求余计算应存入的位置
         *                              3.判断当前位置是否为null,如果是null直接存入
         *                              4.如果不为null,表示有元素，则调用equals方法比较，相等不存，不等则存
         *                                  JDK8之前，新元素存入数组，占老元素位置，老元素挂下面
         *                                  JDK8后，新元素直接挂在老元素下面
         *                      哈希表是一种增删改查数据性能都较好的结构。
         *                     JDK8开始，哈希表 = 数组 + 链表 + 红黑树。
         *                              当链表长度超过8，且数组长度>=64时，自动将链表转成红黑树
         *                数据结构（树）：二叉树，每个结点包含父节点地址，值，左子节点地址，右子节点地址。
         *                                   度：每一个节点的子节点数量，任意节点的度<=2。
         *                                   树高：数的总层数。
         *                                   根节点：最顶层的节点
         *                                   左子节点、右子节点、左子树、右子树
         *                              二叉查找树：小的存左边，大的存右边，一样的不存
         *                                      问题：当数据已经时排好序的，导致查询的性能与单链表一样，查询速度变慢。
         *                              平衡二叉树：在满足查找二叉树的大小规则下，让树尽可能矮小，以此提高查数据的性能
         *                              红黑树：可以自平衡的二叉树。
         * 深入理解HashSet集合去重复的机制
         *      HashSet集合默认不能对内容一样的两个不同对象去重复
         *        如果希望Set集合认为两个内容一样的对象是重复的，必须重写对象的hashCode()和equals()方法。
         */
    }
}
