package br.com.mtanuri.ada.t1043.web2.projeto.service;

import br.com.mtanuri.ada.t1043.web2.projeto.dto.OrderItemDTO;
import br.com.mtanuri.ada.t1043.web2.projeto.entity.OrderItem;

public interface OrderItemService {

    OrderItem insertOrderItem(OrderItemDTO orderItemDTO);

}
