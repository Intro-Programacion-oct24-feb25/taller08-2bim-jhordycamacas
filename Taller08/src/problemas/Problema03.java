/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             // TODO code application logic here
        int limite = 5;
        String impresion = "";
        for (int n = 1; n <= limite; n++) {
            for (int i = 1; i <= n; i++) {
                impresion = impresion + "*";
            }
            impresion = impresion + "\n";
        }
        for (int n = 5 ; n >= 1; n--) {
            for (int i = 1; i<= n; i++) {
                impresion = impresion + "*";
            }
            impresion = impresion + "\n";
        }
        System.out.printf("%s", impresion);
    }
}
