package com.rodrigo.kafka.kafka_demo.controller;

import com.rodrigo.kafka.kafka_demo.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
@RequiredArgsConstructor
public class PedidoController {

    private final PedidoService pedido;

    @PostMapping("/{id}")
    public ResponseEntity<String> criarPedido(@PathVariable String id) {

        pedido.enviarPedido(id, "Pedido criado com sucesso");

        return ResponseEntity.ok("Pedido enviado ao Kafka");
    }
}
