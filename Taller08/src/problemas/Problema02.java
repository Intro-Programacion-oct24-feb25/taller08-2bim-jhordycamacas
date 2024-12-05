/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        double farenheit = 20;
        int operacion = 20;
        String cadenaFinal = "";
        double celsius;

        for (int i = 0; i <= operacion; i++) {
            celsius = (5.0 / 9) * (farenheit - 32);
            cadenaFinal =  String.format("%sOperacion(%d)Farenheit: %.2f ===> Celsius: "
                            + "%.2f\n",cadenaFinal, i, farenheit, celsius);
            farenheit = farenheit + 4;

        }
        System.out.println(cadenaFinal);
    }
}

