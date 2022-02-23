package oo.exe02;

import javax.swing.JOptionPane;

/**
 *
 * @author abarb
 */
public class TestaCliente {
    public static void main(String[] args)
    {
        // criando o primeiro objeto
        int auxNumeroconta = Integer.parseInt(JOptionPane.showInputDialog("Infome o número da conta: "));
        int auxNumeroagencia = Integer.parseInt(JOptionPane.showInputDialog("Infome o número da agência: "));
        String auxNome = JOptionPane.showInputDialog("Informe o nome:");
        float auxSaldo = Float.parseFloat(JOptionPane.showInputDialog("Informe o saldo: "));
    
    Cliente client1 = new Cliente(auxNumeroconta, auxNumeroagencia, auxNome, auxSaldo);
    // chamar os métodos
    client1.mostrar();
    
    client1.realizarDeposito(50);
    client1.mostrar();
    
    client1.toWithdraw(30);
    client1.mostrar();
    
    
    // criar o objeto 2
    auxNumeroconta = Integer.parseInt(JOptionPane.showInputDialog("Infome o número da conta: "));
    auxNumeroagencia = Integer.parseInt(JOptionPane.showInputDialog("Infome o número da agência: "));
    auxNome = JOptionPane.showInputDialog("Informe o nome:");
    auxSaldo = Float.parseFloat(JOptionPane.showInputDialog("Informe o saldo: "));
    
    Cliente client2 = new Cliente(auxNumeroconta, auxNumeroagencia, auxNome, auxSaldo);
    
    client2.mostrar();
    
    client2.realizarDeposito(200);
    client2.mostrar();
    
    client2.toWithdraw(500);
    client2.mostrar();
    }
    
}
