package Test1;

public class num6Demo {
    public static void main(String[] args) {
        MyLinkedList<String> nb = new MyLinkedList<>();
        MyLinkedList.Node<String> head = nb.add();
        nb.reverse(head,1,2);
        nb.forEach(head);
    }
}
