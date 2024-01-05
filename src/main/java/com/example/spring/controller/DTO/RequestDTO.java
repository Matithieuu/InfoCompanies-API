package com.example.spring.controller.DTO;

import com.stripe.model.Product;
import lombok.Getter;

@Getter
public class RequestDTO {
    String item;
    String customerName;
    String customerEmail;
    String subscriptionId;
}