package edu.aluismarte.diplomado.week8;

import edu.aluismarte.diplomado.model.week8.payment.PaymentGateway;

/**
 * Ejemplo funcional del uso apropiado de un ENUM en los diseños
 *
 * Preguntas para saber cuando usar un ENUM:
 *  - ¿Se comporta mi variable como una constante? (tengo valores fijos declarados?) (La respuesta debe ser SI)
 *  - ¿Adicionar valores permite usarlos sin modificar el código? (La respuesta debe ser NO)
 *
 * @author aluis on 6/4/2022.
 */
public class EnumDesign {

    public enum PaymentProvider {
        PAYPAL, STRIPE;

        public PaymentGateway getPaymentGateway() {
        }
    }

    public boolean isValidProvider(PaymentProvider paymentProvider) {
        return paymentProvider != null;
    }

}

