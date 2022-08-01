package edu.aluismarte.diplomado.model.week8.network.exercise;

import edu.aluismarte.diplomado.model.week8.enums.PaymentProvider;
import edu.aluismarte.diplomado.week8.EnumDesign;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CancelPaymentRequest2 {

    private String id;
    private EnumDesign.PaymentProvider provider;
}
