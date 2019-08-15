package com.pet.information.messaging;

import com.service.lib.AuditInfo;
import org.springframework.stereotype.Component;

/**
 * @author Amol Limaye
 **/
@Component
public class MessageReceiver {

    public void receiveMessage(AuditInfo message) {
        System.out.println("Received <" + message.getAuditContent() + ">");
    }

}
