package com.pet.information.messaging;

import ch.qos.logback.core.util.ContentTypeUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author Amol Limaye
 **/
@Component
public class MessageSender {

    private final RabbitTemplate rabbitTemplate;
    static final String topicExchangeName = "pet-info-exchange";
    String ROUTING_KEY = "pet.info.#";

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    public MessageSender(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
        this.rabbitTemplate.setMessageConverter(producerJackson2MessageConverter1());
    }

    public void sendAuditInfoMessage(String auditInfoString) {
        AuditInfo auditInfo = new AuditInfo();
        auditInfo.setAuditContent(auditInfoString);
        this.rabbitTemplate.convertAndSend(topicExchangeName,ROUTING_KEY,auditInfo,
                m -> {
                        m.getMessageProperties().getHeaders().put("__TypeId__", "AuditInfo");
                        m.getMessageProperties().setContentType("application/json");
                        return m;
                });
    }

    @Autowired
    public Jackson2JsonMessageConverter producerJackson2MessageConverter1() {
        return new Jackson2JsonMessageConverter();
    }
}
