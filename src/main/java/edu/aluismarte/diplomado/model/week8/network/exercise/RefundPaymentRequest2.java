package edu.aluismarte.diplomado.model.week8.network.exercise;

import edu.aluismarte.diplomado.model.week8.enums.PaymentProvider;
import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RefundPaymentRequest2 {

    private String id;
    private PaymentProvider provider;
    private BigDecimal amount;
}