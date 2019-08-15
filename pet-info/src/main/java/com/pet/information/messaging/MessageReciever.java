package com.pet.information.messaging;

import org.springframework.stereotype.Component;

/**
 * @author Amol Limaye
 **/
@Component
public class MessageReciever {

    public void receiveMessage(Object message) {
        System.out.println("Recieved object");
    }

    public void receiveMessage(AuditInfo message) {
        System.out.println("Received <" + message.getAuditContent() + ">");
    }

    public void receiveMessage(String message) {
        System.out.println("Recieved String");
        System.out.println("Received <" + message + ">");
    }

}
