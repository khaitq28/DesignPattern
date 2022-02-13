package effective.composition_vs_inheritance;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author Quang-Khai TRAN
 * @date 13/02/2022
 */

public class CountableSet<E> extends HashSet<E> {

    int count = 0;

    @Override
    public boolean add(E e){
        count ++;
        return super.add(e);
    }

    @Override
    public boolean  addAll(Collection<? extends E> collection){
        count += collection.size();
        return super.addAll(collection);
    }

    public int getCount() {
        return count;
    }
}
