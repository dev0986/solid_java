package org.example.single.responsibility;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Account {

    private String name;
    private int accountNumber;
    private BigDecimal totalAmount;
}
