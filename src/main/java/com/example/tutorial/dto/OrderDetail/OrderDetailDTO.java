package com.example.tutorial.dto.OrderDetail;

import com.example.tutorial.dto.Product.ProductInOrderDTO;
import com.example.tutorial.entity.OrderDetail;
import com.example.tutorial.enumeration.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailDTO {
    private ProductInOrderDTO product;
    private String type;
    private Size size;
    private float price;
    private float subTotal;

    public OrderDetailDTO(OrderDetail entity) {
        this.product = new ProductInOrderDTO(entity.getProduct());
        this.type = entity.getType();
        this.size = entity.getSize();
        this.price = entity.getPrice();
        this.subTotal = entity.getSubTotal();
    }
}
