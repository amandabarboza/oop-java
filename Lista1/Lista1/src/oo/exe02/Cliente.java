/*
Exercício 2:

•	Crie uma classe em Java chamada Cliente contendo as variáveis de instância numeroConta (int), numeroAgencia (int), nome (String) e saldo (float), 

•	Crie os construtores 


•	Crie os métodos public  realizarDeposito() e realizarSaque() que, realizam depósito e saque, respectivamente, na conta do cliente. 

•	Crie um outro método public que retorna o numero da conta, nome do cliente e saldo atual. 

•	Criar uma classe TestaCliente para instanciação da classe Cliente como Fulano. Chamar os métodos realizarDeposito() e realizarSaque() nessa classe para que o saldo seja modificado  

•	Criar, também na classe TestaCliente, um outro cliente (Beltrano) e realizar as mesmas atividades do Fulano. 

*/


package oo.exe02;

import javax.swing.JOptionPane;

/**
 *
 * @author abarb
 */
public class Cliente {
    // declaração das variáveis
    int accountNumber;
    int branchNumber;
    String name;
    float balance;
    
    // método construtor
    Cliente()
    {
        
    }
    Cliente(int accountNumber, int branchNumber, String name, float balance)
    {
        this.accountNumber = accountNumber;
        this.branchNumber = branchNumber;
        this.name = name;
        this.balance = balance;
    }
    
    void toDeposit(float x)
    {
        this.balance += x;
    }
    void toWithdraw(float x)
    {
        this.balance -= x;
    }
    void toShow()
    {
        JOptionPane.showMessageDialog(null,"\nNúmero da conta: " + this.accountNumber + "\nNúmero da agência: " + this.branchNumber + "\nNome: " + this.name + "\nSaldo: R$" + this.balance);
    }
    
    
}
