package builder.message;

/**
 * Created by khaitq
 * Date: 11/05/2018
 * Github:  https://github.com/quangkhai88
 */

public class JmsMessageBuilder extends MessageBuilder {

    public JmsMessageBuilder() {
        this.message = new JmsMessage();
    }


    @Override
    void buidMessageProtocol() {
        this.message.setProtocol("HTTP");
    }


    @Override
    void buildMessageFormat() {
        this.message.setFont(10);
    }
}
