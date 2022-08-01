package edu.aluismarte.diplomado.ejercicio;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aluis on 4/24/2022.
 */
public class Demo {

    /*
    Parejas que suman igual
    Escribir un método que returne la lista de parejas que sumados (cada numero separado por una coma en un string) sea igual a el resultado esperado
    Ejemplo:
    resultado = 5
    numeros=[1,4,5,0]

    1,4
    5,0
     */

    public static List<String> pairOfSumToTarget(List<Integer> numbers, int target) {
        List<String> results = new ArrayList<>();
        // TODO Solve the problem

        for (int x = 0; x < numbers.size() - 1; x++)
        {
            for (int y = x; y < numbers.size(); y++)
            {
                if ((numbers.get(x) + numbers.get(y)) == target) {

                    results.add("Pares que suman " + target + " es " + numbers.get(x) + " y " + numbers.get(y));

                }
            }
        }

        return results;
    }

    public static void main(String[] args) {

        List<String> results = pairOfSumToTarget(List.of(1, 4, 5, 0), 5);

        for (String result : results) {
            System.out.println(result);
        }


    }
}

