package builder.message;

/**
 * Created by khaitq
 * Date: 11/05/2018
 * Github:  https://github.com/quangkhai88
 */

public class EmailMessageBuilder extends MessageBuilder {

    public EmailMessageBuilder() {
        this.message = new EmailMessage();
    }

    @Override
    void buidMessageProtocol() {
        this.message.setFont(12);
    }

    @Override
    void buildMessageFormat() {
        this.message.setProtocol("IMAP");
    }
}
