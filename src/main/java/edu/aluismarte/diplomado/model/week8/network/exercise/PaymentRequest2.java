package edu.aluismarte.diplomado.model.week8.network.exercise;

import edu.aluismarte.diplomado.model.week8.enums.PaymentProvider;
import edu.aluismarte.diplomado.week8.EnumDesign;
import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PaymentRequest2 {

    private EnumDesign.PaymentProvider provider;
    private BigDecimal amount;
}