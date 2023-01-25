package Tarea1;
import javax.swing.*;
public class uno {
    public static void main(String[] args){
        int day;
        do {
            day= Integer.parseInt((JOptionPane.showInputDialog(null,"Día [1-31]")));
        } while(day <= 0 || day>31);
        String month=(JOptionPane.showInputDialog(null,"Mes con letra").toLowerCase().trim());
        String season =switch (month){
            case "abril","mayo","junio":
                yield month.equals("abril")?"primavera":month.equals("mayo")?"primavera":month.equals("junio")&&day<21?"primavera":month.equals("junio")&&day>20?"verano":null;
            case "julio","agosto","septiembre":
                yield month.equals("julio")?"verano":month.equals("agosto")?"verano":month.equals("septiembre")&&day<21?"verano":month.equals("septiembre")&&day>20?"otoño":null;
            case "octubre","noviembre","diciembre":
                yield month.equals("octubre")?"verano":month.equals("noviembre")?"otoño":month.equals("diciembre")&&day<21?"otoño":month.equals("diciembre")&&day>20?"invierno":null;
            case "enero","febrero","marzo":
                yield month.equals("enero")?"invierno":month.equals("febrero")?"invierno":month.equals("marzo")&&day<21?"invierno":month.equals("marzo")&&day>20?"primavera":null;
            default:
                yield null;
        };
        JOptionPane.showMessageDialog(null,season!=null?"El día "+day+" de "+month+" es en "+season:"El mes '"+month+"' no existe");
    }
}