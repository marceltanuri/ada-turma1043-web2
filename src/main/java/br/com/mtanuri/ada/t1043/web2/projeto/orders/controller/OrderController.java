package br.com.mtanuri.ada.t1043.web2.projeto.orders.controller;

import br.com.mtanuri.ada.t1043.web2.projeto.orders.service.OrderServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController("/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderServiceImpl orderService;
}
