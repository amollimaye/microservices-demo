package com.pet.information.messaging;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.lib.AuditInfo;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
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
    }

    public void sendAuditInfoMessage(String auditInfoString) {
        AuditInfo auditInfo = new AuditInfo();
        auditInfo.setAuditContent(auditInfoString);
        this.rabbitTemplate.convertAndSend(topicExchangeName,ROUTING_KEY,auditInfo);
    }
}
