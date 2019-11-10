package renderer;

import org.springframework.beans.factory.annotation.Autowired;
import provider.MessageProvider;

public class HelloWorldMessageRenderer implements MessageRenderer {

    @Autowired
    private MessageProvider messageProvider;

    public HelloWorldMessageRenderer() {
    }

    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("you must set the property message provider of class" + HelloWorldMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }

    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

}
