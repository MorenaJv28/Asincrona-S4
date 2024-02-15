
package ejercicio1_morenag;

import javax.swing.JOptionPane;

public class Ejercicio1_Morenag 
{

    
    public static void main(String[] args)
    {
           String añoStr = JOptionPane.showInputDialog("Introduzca un año: ");
        int year = Integer.parseInt(añoStr);

        boolean b= (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));

        String mensaje;
        if (b) {
            mensaje = "El año " + year + " es bisiesto.";
        } else {
            mensaje = "El año " + year + " no es bisiesto.";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    
}
