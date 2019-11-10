package provider;

public class HelloWorldMessageProvider implements MessageProvider {

    public HelloWorldMessageProvider() {
    }

    public String getMessage() {
        return "hello world";
    }
}
