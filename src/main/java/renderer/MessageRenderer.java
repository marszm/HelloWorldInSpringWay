package renderer;

import provider.MessageProvider;

public interface MessageRenderer {

    void render();

    MessageProvider getMessageProvider();

    void setMessageProvider(MessageProvider messageProvider);

}
