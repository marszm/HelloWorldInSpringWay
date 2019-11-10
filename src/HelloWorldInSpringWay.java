import provider.HelloWorldMessageProvider;
import provider.MessageProvider;
import renderer.HelloWorldMessageRenderer;
import renderer.MessageRenderer;

public class HelloWorldInSpringWay {

    public static void main(String[] args) {

        MessageRenderer messageRenderer = new HelloWorldMessageRenderer();
        MessageProvider messageProvider = new HelloWorldMessageProvider();
        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.renderer();
    }

}
