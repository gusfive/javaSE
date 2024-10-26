package Test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyLinkedList<E> {
    private int size;

    public static class Node<E> {
        E data;
        Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    public Node<E> add() {
        Node<E> head = null;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入要添加的数据");
            String data = sc.next();
            if (data.equals("exit")){break;}
            if (head == null){
                head = new Node<E>((E)data,null);
                size++;
            }else{
                Node<E> temp = new Node<>((E)data,head);
                while (temp.next != null){
                    temp = temp.next;
                }
                temp.next = new Node<>((E)data,null);
                size++;
            }
        }
        return head;
    }

    public Node<E> reverse(Node<E> head,int left,int right){
        if (head == null || left < 1 || right > size || left > right){
            System.out.println("范围错误");
            return null;
        }
        int index = 0;
        Node<E> temp = null;
        List<E> reversePart = new ArrayList<>();
        while (index <= right){
            index++;
            head = head.next;
            if (index == left){
                temp = head;
                reversePart.add(head.data);
            }else if (index > left){reversePart.add(head.data);}
        }
        for (int i = reversePart.size() - 1; i >= 0; i--) {
            temp.data = reversePart.get(i);
            temp = temp.next;
        }
        return head;
    }

    public void forEach(Node<E> head){
        if (head == null) {
            System.out.println("无数据");
            return;
        }
        while (head != null){
            System.out.println(head.data+" ");
            head = head.next;
        }
    }
}
