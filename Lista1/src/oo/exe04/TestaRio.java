package oo.exe04;

import javax.swing.JOptionPane;

/**
 *
 * @author abarb
 */
public class TestaRio {
    public static void main(String[] args) 
    {
    
    String auxNome = JOptionPane.showInputDialog("Informe o nome do rio:");
    float auxNivel = Float.parseFloat(JOptionPane.showInputDialog("Informe o nível: "));
    int opcao = JOptionPane.showConfirmDialog(null, "O rio está poluído?");
    boolean auxPoluido;
    auxPoluido = (opcao == JOptionPane.OK_OPTION);
    
    Rio obj1 = new Rio (auxNome, auxNivel, auxPoluido);
    
    obj1.mostrar();
    
    obj1.chover(100);
    obj1.mostrar();
    
    obj1.ensolarar(300);
    obj1.mostrar();
    
    obj1.limpar();
    obj1.mostrar();
    
    obj1.sujar();
    obj1.mostrar();
    
    obj1.limpar();
    obj1.mostrar();
    
    }
    
}
