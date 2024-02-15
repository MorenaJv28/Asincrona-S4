
package ejercicio2_morena.g;

import javax.swing.JOptionPane;


public class Ejercicio2_MorenaG {

    /**
     * Escriba un programa que permita ingresar números del teclado y calcular si es un
número par, o impar hasta que el número ingresado sea menor o igual que 50.

     */
    public static void main(String[] args)
    {
        String strNumber;
        int number;

        do {
            strNumber = JOptionPane.showInputDialog("Introduzca un número: ");
            number = Integer.parseInt(strNumber);

            if (number <= 50) {
                if (number % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "El número " + number + " es par.");
                } else {
                    JOptionPane.showMessageDialog(null, "El número " + number + " es impar.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El número debe ser menor o igual que 50.");
            }
        } while (number > 50);
   
    }
    
}
