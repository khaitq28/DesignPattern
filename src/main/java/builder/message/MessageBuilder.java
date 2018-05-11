package builder.message;

/**
 * Created by khaitq
 * Date: 11/05/2018
 * Github:  https://github.com/quangkhai88
 */

public abstract class MessageBuilder {

    protected Message message;

    protected Message buidMessage() {

        buidMessageProtocol();
        buildMessageFormat();

        return message;
    }

    abstract void buidMessageProtocol();

    abstract void buildMessageFormat();



}
