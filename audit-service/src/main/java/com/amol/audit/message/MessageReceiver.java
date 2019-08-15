package com.amol.audit.message;

import org.springframework.stereotype.Component;

/**
 * @author Amol Limaye
 **/
@Component
public class MessageReceiver {

    public void receiveMessage(Object message) {
        System.out.println("Received object");
    }

    public void receiveMessage(AuditInfo message) {
        System.out.println("Received <" + message.getAuditContent() + ">");
    }

    public void receiveMessage(String message) {
        System.out.println("Received String");
        System.out.println("Received <" + message + ">");
    }

}
