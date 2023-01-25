package Tarea1;
import javax.swing.*;
public class tres {
    public static void main (String[] args){
        String tel=JOptionPane.showInputDialog(null,"Escriba número telefonico").trim();
        //String[] code = tel.split("(?<=.)");
        tel.split(" ");
        String newTel = tel.substring(tel.indexOf("(")+1, tel.indexOf(")"));
        JOptionPane.showMessageDialog(null,"la lada es: "+newTel+"\n el numero es: "+tel+" ojo:"+(tel.indexOf(newTel)));
        System.out.println(newTel);
    }
}