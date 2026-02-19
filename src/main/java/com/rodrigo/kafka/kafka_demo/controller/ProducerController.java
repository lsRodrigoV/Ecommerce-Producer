package com.rodrigo.kafka.kafka_demo.controller;

import com.rodrigo.kafka.kafka_demo.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
@RequiredArgsConstructor
public class ProducerController {

    private final ProducerService producerService;

    @PostMapping
    public String enviar(@RequestParam String mensagem) {
        producerService.enviar(mensagem);
        return "Mensagem enviada!";
    }
}
