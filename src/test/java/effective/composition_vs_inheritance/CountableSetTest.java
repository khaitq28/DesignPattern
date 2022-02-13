package effective.composition_vs_inheritance;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;


public class CountableSetTest {

    private final CountableSet<Integer> counter = new CountableSet<>();

    @Test
    public void add() {


        Assertions.assertThat(counter.getCount()).isEqualTo(0);
        counter.add(1);
        counter.add(2);

        Assertions.assertThat(counter.getCount()).isEqualTo(2);
        counter.addAll(Arrays.asList(2,4,6));

        Assertions.assertThat(counter.getCount()).isEqualTo(8);// OK but it should be 5
    }


}