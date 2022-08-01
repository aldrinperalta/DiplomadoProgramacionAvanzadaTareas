package edu.aluismarte.diplomado.week4;

import edu.aluismarte.diplomado.model.week4.Operation;

import java.io.*;

/**
 * Reescribir este código en piezas testeables y hacer los test cubriendo multiples escenarios
 * <p>
 * En vez de escribir directo a disco el archivo debería recibir donde escribirlo (el file directamente)
 * El cálculo no debe ser en la function, es una lógica separada
 *
 * @author aluis on 4/3/2022.
 * @implSpec La función existente debe quedarse ahi, pues la nueva se presume tendrá más parámetros
 */
public class Homework {

    public void calculateAndSave(Operation operation, Double a, Double b, PrintWriter file) throws IOException, FileNotFoundException {
        if (file ==null) {
            throw new NullPointerException();
        }
        calculateAndSave(operation, a, b, new PrintWriter(file));
    }

    public void calculateAndSave(Operation operation, Double a, Double b, Writer writer) {
        if (operation == null) {
            throw new OperationNullException();
        }
        Double result = switch (operation) {
            case SUM -> sum(a, b);
            case MULT -> multiplication(a, b);
            case DIV -> divide(a, b);
        };
        try {
            writer.write("Result is: " + result);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Double sum(Double a, Double b) {
        return a + b;
    }

    private Double multiplication(Double a, Double b) {
        return a * b;
    }

    private Double divide(Double a, Double b) {
        return a / b;
    }

    public static void calculateAndSave(Operation operation, int a, int b) throws Exception {
        Double result = switch (operation) {
            case SUM -> (double) (a + b);
            case MULT -> (double) a * b;
            case DIV -> (double) a / b;
            default -> null;
        };
        if (result == null) {
            throw new OperationNullException();
        }
        File file = new File("filename.txt");
        try (PrintWriter out = new PrintWriter(file)) {
            out.println("Result is: " + result);
        }
    }

    public void calculateAndSave(Operation sum, double v, double v1, File file) {
    }

    public void calculateAndSave(Operation operation, Double aDouble, Double aDouble1, File file) {
    }

    public static class OperationNullException extends RuntimeException {

        public OperationNullException() {
            super("No operation");
        }
    }
}
