package effective.composition_vs_inheritance;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;


public class InstrumentedSetTest {


    @Test
    public void test() {

        InstrumentedSet<Integer> instrumentedSet = new InstrumentedSet<>(new HashSet<>());

        Assertions.assertThat(instrumentedSet.getCount().get()).isEqualTo(0);

        instrumentedSet.add(1);
        instrumentedSet.add(2);
        Assertions.assertThat(instrumentedSet.getCount().get()).isEqualTo(2);

        instrumentedSet.addAll(Arrays.asList(1,2,3));
        Assertions.assertThat(instrumentedSet.getCount().get()).isEqualTo(5);

        instrumentedSet.remove(3);
        Assertions.assertThat(instrumentedSet.getCount().get()).isEqualTo(5);
    }



}