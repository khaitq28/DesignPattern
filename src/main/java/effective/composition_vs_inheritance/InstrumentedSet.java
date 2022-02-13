package effective.composition_vs_inheritance;

import java.util.Collection;
import java.util.Set;

/**
 * @author Quang-Khai TRAN
 * @date 13/02/2022
 */

public class  InstrumentedSet<E> extends CounterSet<E> {

    private volatile int count;

    public InstrumentedSet(Set<E> set) {
        super(set);
    }

    @Override
    public boolean add(E e) {
        count ++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        count += collection.size();
        return super.addAll(collection);
    }

    public int getCount() {
        return count;
    }
}
