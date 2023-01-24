import javax.swing.*;
public class Tarea1 {
    public static void main(String[] args){
        int day;
        do {
            day= Integer.parseInt((JOptionPane.showInputDialog(null,"Día [1-31]")));
        } while(day == 0 || day>31);
        String month=(JOptionPane.showInputDialog(null,"Mes con letra").toLowerCase().trim());
        JOptionPane.showMessageDialog(null,"El día "+day+" de "+month+" es: "+season(day,month));
    }
    public static String season(int day, String month){
        switch (month){
            case  "marzo","abril":
                return "Primavera";
            case "mayo","junio","julio","agosto":
                return "Verano";
            case "septiembre","octubre":
                return "Otoño";
            case "noviembre","diciembre","enero","febrero":
                return "Invierno";
            default:
                return month + " no existe";
        }
    }
}