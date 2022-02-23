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
    Cliente(int nC, int nA, String nm, float sd)
    {
        numeroConta = nC;
        numeroAgencia = nA;
        nome = nm;
        saldo = sd;
    }
    
    void realizarDeposito(float x)
    {
        saldo += x;
    }
    void realizarSaque(float x)
    {
        saldo -= x;
    }
    void mostrar()
    {
        JOptionPane.showMessageDialog(null,"\nNúmero da conta: " + numeroConta + "\nNúmero da agência: " + numeroAgencia + "\nNome: " + nome + "\nSaldo: R$" + saldo);
    }
    
    
}
