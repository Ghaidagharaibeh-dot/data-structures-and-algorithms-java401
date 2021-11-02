package trees;

import java.util.ArrayList;
import java.util.List;

public class KaryTreeNode<T> {

    public T value;
    public List<KaryTreeNode<T>> list = new ArrayList<>();

    public KaryTreeNode(T value) {
        this.value = value;
    }


    public List<KaryTreeNode<T>> getList() {
        return list;
    }

    public void addChild(KaryTreeNode<T> child) {
        this.list.add(child);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(" ");
        result.append(value);
        result.append(" ");
        for (KaryTreeNode<T> ch : list) {
            result.append(" ");
            result.append(ch);
        }
        result.append(" ");

        return result.toString();
    }
}
