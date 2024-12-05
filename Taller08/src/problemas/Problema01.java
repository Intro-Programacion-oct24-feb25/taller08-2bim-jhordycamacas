/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num;
       int operacion;
       String cadenafinal = "";
       String cadenafinal2 = "";
       for (num = 30; num >= 10;num--){
           
        for (int contador = 1; contador <= 4; contador ++){
           operacion = num * contador;
           cadenafinal = String.format("%s%d-",cadenafinal,operacion);
           
        }
        cadenafinal2 = String.format("%s%s\n",cadenafinal2, cadenafinal);
        cadenafinal = "";
       }
       System.out.printf("%s\n",cadenafinal2);
    }
}
