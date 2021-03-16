package com.sample.kafka;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
public class IngestController {
    @PostMapping("/ingest")
    public void ingestMessage(@RequestBody String message){
        System.out.println("In ingest API " + message);
        MessageProducer producer = new MessageProducer();
        producer.produceMessage(message);
    }
}
