package oo.exe04;

import javax.swing.JOptionPane;

/**
 *
 * @author Amanda Barboza
 */
public class TestaRio {
    public static void main(String[] args) 
    {
    
    String auxName = JOptionPane.showInputDialog("Informe o nome do rio:");
    float auxWaterlevel = Float.parseFloat(JOptionPane.showInputDialog("Informe o nível: "));
    int option = JOptionPane.showConfirmDialog(null, "O rio está poluído?");
    boolean auxPolluted;
    auxPolluted = (option == JOptionPane.OK_OPTION);
    
    Rio obj1 = new Rio (auxName, auxWaterlevel, auxPolluted);
    
    obj1.toShow();
    
    obj1.toRain(100);
    obj1.toShow();
    
    obj1.sunny(300);
    obj1.toShow();
    
    obj1.toClean();
    obj1.toShow();
    
    obj1.toDirty();
    obj1.toShow();
    
    obj1.toClean();
    obj1.toShow();
    
    }
    
}
