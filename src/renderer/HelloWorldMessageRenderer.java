package renderer;

import provider.MessageProvider;

public class HelloWorldMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;

    @Override
    public void renderer() {
        if(messageProvider == null) {
            throw new RuntimeException("you must set the property message provider of class" + HelloWorldMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    public MessageProvider getMessageProvider() {
        return messageProvider;
    }

    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }
}
