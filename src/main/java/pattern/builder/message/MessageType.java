package pattern.builder.message;

/**
 * Created by khaitq
 * Date: 13/05/2018
 * Github:  https://github.com/quangkhai88
 */

public enum MessageType {

    EMAIL("Email"), JMS("Jms");

    private String messageType;

    MessageType(String messageType) {
        this.messageType = messageType;
    }
}
