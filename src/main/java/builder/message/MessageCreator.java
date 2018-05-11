package builder.message;

/**
 * Created by khaitq
 * Date: 11/05/2018
 * Github:  https://github.com/quangkhai88
 */

public class MessageCreator {

    private MessageBuilder messageBuilder;

    public MessageCreator(MessageBuilder messageBuilder) {
        this.messageBuilder = messageBuilder;
    }

    public Message getMessage() {
       return this.messageBuilder.buidMessage();
    }


}
