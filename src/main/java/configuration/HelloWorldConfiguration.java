package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import provider.HelloWorldMessageProvider;
import provider.MessageProvider;
import renderer.HelloWorldMessageRenderer;
import renderer.MessageRenderer;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer renderer() {
        MessageRenderer renderer = new HelloWorldMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer();
    }

}
