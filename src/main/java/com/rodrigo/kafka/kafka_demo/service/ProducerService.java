package com.rodrigo.kafka.kafka_demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "pedido-topic";

    public void enviar(String mensagem) {
        kafkaTemplate.send(TOPIC, mensagem);
    }
}
