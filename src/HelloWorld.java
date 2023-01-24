import javax.swing.*;

/*
Esto es la clase principal
*/
public class HelloWorld{
    /**
     * @param args almacena los argumentosdel programa
     *             este es el metodo de arranque de toda aplicaion java
     * */

    public static void main (String[] args){
        /*int hola = 1;
        byte num= (byte) 2234;
        System.out.println("hola mundo");
        System.out.println("pepe\n"+hola);
        System.out.println(num);
        for(int i=0; i<10;i++){
            System.out.println("num:"+i);
       }*/
        String nombre= JOptionPane.showInputDialog(null,"¿Cual es tu nombre?");
        String apellidoPaterno=JOptionPane.showInputDialog(null,"¿Cuál es tu apellido paterno?");
        String apellidoMaterno=JOptionPane.showInputDialog(null,"¿Cuál es tu apellido materno?");
        nombre=nombre==null?"":nombre;
        apellidoPaterno=apellidoPaterno==null?"":apellidoPaterno;
        apellidoMaterno=apellidoMaterno==null?"":apellidoMaterno;
        String nombreCompleto=( apellidoPaterno+" "+apellidoMaterno+","+nombre);
        System.out.println(nombreCompleto.toUpperCase());
        String number="123";
        System.out.println("el numero es: "+Integer.parseInt(number));
        JOptionPane.showMessageDialog(null,nombreCompleto.toUpperCase());
    }
}
