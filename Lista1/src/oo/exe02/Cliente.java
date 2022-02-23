/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.exe02;

import javax.swing.JOptionPane;

/**
 *
 * @author abarb
 */
public class Cliente {
    // declaração das variáveis
    int numeroConta;
    int numeroAgencia;
    String nome;
    float saldo;
    
    // método construtor
    Cliente()
    {
        
    }
    Cliente(int numeroConta, int numeroAgencia, String nome, float saldo)
    {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    void realizarDeposito(float x)
    {
        this.saldo += x;
    }
    void toWithdraw(float x)
    {
        this.saldo -= x;
    }
    void mostrar()
    {
        JOptionPane.showMessageDialog(null,"\nNúmero da conta: " + this.numeroConta + "\nNúmero da agência: " + this.numeroAgencia + "\nNome: " + this.nome + "\nSaldo: R$" + this.saldo);
    }
    
    
}
