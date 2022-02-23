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
    
    Cliente obj1 = new Cliente(auxNumeroconta, auxNumeroagencia, auxNome, auxSaldo);
    // chamar os métodos
    obj1.mostrar();
    
    obj1.realizarDeposito(50);
    obj1.mostrar();
    
    obj1.realizarSaque(30);
    obj1.mostrar();
    
    
    // criar o objeto 2
    auxNumeroconta = Integer.parseInt(JOptionPane.showInputDialog("Infome o número da conta: "));
    auxNumeroagencia = Integer.parseInt(JOptionPane.showInputDialog("Infome o número da agência: "));
    auxNome = JOptionPane.showInputDialog("Informe o nome:");
    auxSaldo = Float.parseFloat(JOptionPane.showInputDialog("Informe o saldo: "));
    
    Cliente obj2 = new Cliente(auxNumeroconta, auxNumeroagencia, auxNome, auxSaldo);
    
    obj2.mostrar();
    
    obj2.realizarDeposito(200);
    obj2.mostrar();
    
    obj2.realizarSaque(500);
    obj2.mostrar();
    }
    
}
