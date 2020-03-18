package templateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class EntityReader<T extends  Entity> {

    public List<? extends Entity> extract(List<String> lines) {
        List<T> result = new ArrayList<>();
        lines.forEach(e -> {
            result.add(buildEntity(e));
        });
        return result;
    }

    protected abstract T buildEntity(String e);
}
