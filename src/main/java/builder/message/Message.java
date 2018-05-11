package builder.message;

/**
 * Created by khaitq
 * Date: 11/05/2018
 * Github:  https://github.com/quangkhai88
 */

public abstract class Message {

    public abstract String getMessage();

    protected int font;

    protected String protocol;

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public int getFont() {
        return font;
    }

    public void setFont(int font) {
        this.font = font;
    }

    @Override
    public String toString() {
        return "Message{" +
                " message=" + getMessage() +
                ", font=" + font +
                ", protocol='" + protocol + '\'' +
                '}';
    }
}
