package J_genericsDemo.genericsInterface;

import java.util.ArrayList;

//泛型接口
public interface Data<T> {
    void add(T t);
    ArrayList<T> getByName(String name);
}
