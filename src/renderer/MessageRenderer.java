package renderer;

import provider.MessageProvider;

public interface MessageRenderer {

    void renderer();

    default void setMessageProvider(MessageProvider provider) {
        MessageProvider getMessageProvider;
    }

}
