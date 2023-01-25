package Tarea1;
import javax.swing.*;
public class dos {
    public static void main (String[] args){
        double umaB=Double.parseDouble(JOptionPane.showInputDialog(null,"¿Cuál fue el UMA del año anterior?")),umaA=Double.parseDouble(JOptionPane.showInputDialog(null,"¿Cuál fue el UMA del año actual?"));
        JOptionPane.showMessageDialog(null,"La inflación fue de "+(Math.round((((umaA-umaB)/umaB)*100) * 10) / 10.0)+"%");
    }
}