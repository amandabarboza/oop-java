package oo.exe02;

import javax.swing.JOptionPane;

/**
 *
 * @author Amanda Barboza
 */
public class TestaCliente {
    public static void main(String[] args)
    {
        // criando o primeiro objeto
        int auxAccountnumber = Integer.parseInt(JOptionPane.showInputDialog("Infome o número da conta: "));
        int auxBranchnumber = Integer.parseInt(JOptionPane.showInputDialog("Infome o número da agência: "));
        String auxName = JOptionPane.showInputDialog("Informe o nome:");
        float auxBalance = Float.parseFloat(JOptionPane.showInputDialog("Informe o saldo: "));
    
    Cliente client1 = new Cliente(auxAccountnumber, auxBranchnumber, auxName, auxBalance);
    // chamar os métodos
    client1.toShow();
    
    client1.toDeposit(50);
    client1.toShow();
    
    client1.toWithdraw(30);
    client1.toShow();
    
    
    // criar o objeto 2
    auxAccountnumber = Integer.parseInt(JOptionPane.showInputDialog("Infome o número da conta: "));
    auxBranchnumber = Integer.parseInt(JOptionPane.showInputDialog("Infome o número da agência: "));
    auxName = JOptionPane.showInputDialog("Informe o nome:");
    auxBalance = Float.parseFloat(JOptionPane.showInputDialog("Informe o saldo: "));
    
    Cliente client2 = new Cliente(auxAccountnumber, auxBranchnumber, auxName, auxBalance);
    
    client2.toShow();
    
    client2.toDeposit(200);
    client2.toShow();
    
    client2.toWithdraw(500);
    client2.toShow();
    }
    
}
