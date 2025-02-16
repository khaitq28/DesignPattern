package pattern.builder.message;


import lombok.Data;

@Data
public abstract class Message {

    public abstract String getMessage();

    protected int font;

    protected String protocol;


    @Override
    public String toString() {
        return "Message{" +
                " message=" + getMessage() +
                ", font=" + font +
                ", protocol='" + protocol + '\'' +
                '}';
    }
}
