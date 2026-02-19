package com.rodrigo.kafka.kafka_demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PedidoService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void enviarPedido(String pedidoId, String mensagem) {

        // KEY = pedidoId
        kafkaTemplate.send("pedido-topic", pedidoId, mensagem);

        System.out.println("Evento publicado com key: " + pedidoId);
    }
}
