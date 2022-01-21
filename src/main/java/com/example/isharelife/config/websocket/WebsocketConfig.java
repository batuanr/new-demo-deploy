package com.example.isharelife.config.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
@Configuration
@EnableWebSocketMessageBroker
public class WebsocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws") // đăng kí endpoint là tiền tố mapping của websocket của mình
                .setAllowedOrigins("https://kasawoauuuu.herokuapp.com/").withSockJS(); //khai báo các đường dẫn của front-end có thể gọi được socket của mình
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic","/queue"); //khai báo ra các tiền tố phòng thì tiền tố phòng là gì
        registry.setApplicationDestinationPrefixes("/app"); // app là tiền tố gửi dữ liệu lên
    }
}
