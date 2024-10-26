package Test1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.function.Consumer;

public class MyArrayList<E> {
    private int num = 10;
    private Object[] al = {};
    private int size;

    public MyArrayList(){}
    public MyArrayList(Collection<? extends E> e) {
        al = e.toArray();
    }

    public boolean add(E e){
        while (al.length > num*0.75){
            num = (int) (num *1.5);
        }
        Object[] temp = new Object[num];
        if (al.length != 0){
            for (int i = 0; i < al.length; i++) {
                temp[i] = al[i];
            }
        }
        temp[al.length] = e;
        al = Arrays.copyOfRange(temp,0,al.length + 1);
        return true;
    }

    public E get(int i){
        if (i < al.length && i >= 0){
            return (E)al[i];
        }else{
            System.out.println("索引范围错误");
            return null;
        }
    }

    public E remove(int i){
        if (i < al.length && i >= 0){
            E e = (E)al[i];
            for (int j = 0; j < al.length - 1; j++) {
                if (j >= i){
                    al[j] = al[j + 1];
                }
            }
            al = Arrays.copyOfRange(al,0,al.length - 1);
            return e;
        }else{
            System.out.println("索引范围错误");
            return null;
        }
    }

    public int size(){
        return al.length;
    }

    public void eachFor(Consumer<? super E> action){
        Objects.requireNonNull(action);
        for (int i = 0; i < al.length; i++) {
            action.accept((E) al[i]);
        }

    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "al=" + Arrays.toString(al) +
                '}';
    }
}
