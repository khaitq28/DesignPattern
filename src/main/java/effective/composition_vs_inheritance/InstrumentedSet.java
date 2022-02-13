package effective.composition_vs_inheritance;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Quang-Khai TRAN
 * @date 13/02/2022
 */

public class  InstrumentedSet<E> extends CounterSet<E> {

    private final AtomicInteger count = new AtomicInteger(0);

    public InstrumentedSet(Set<E> set) {
        super(set);
    }

    @Override
    public boolean add(E e) {
        count.addAndGet(1);
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        count.addAndGet(collection.size());
        return super.addAll(collection);
    }

    public AtomicInteger getCount() {
        return count;
    }
}
