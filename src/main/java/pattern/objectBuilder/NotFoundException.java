package pattern.objectBuilder;

public class NotFoundException extends AbstractException {


    public static class Builder extends  AbstractException.Builder<NotFoundException> {

        @Override
        protected NotFoundException createObjectThis() {
            return new NotFoundException();
        }

    }

}
