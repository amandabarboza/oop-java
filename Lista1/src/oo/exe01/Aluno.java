/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.exe01;

import javax.swing.JOptionPane;

/**
 *
 * @author abarb
 */
public class Aluno 
{
    // declaração das variáveis
    int numeroAluno;
    String nome;
    int idade;
    float prova1;
    float prova2;
    
    
    //método construtor
    Aluno()
    {
        
    }
    Aluno(int nA, String nm, int id, float p1, float p2)
    {
        numeroAluno = nA;
        nome = nm;
        idade = id;
        prova1 = p1;
        prova2 = p2;              
    }
    
    void notaFinal()
    {
        float media = (prova1 + prova2)/2;
        JOptionPane.showMessageDialog(null,"Sua média foi:" + media);
    }
    void dadosAluno()
    {
        JOptionPane.showMessageDialog(null,"\nNúmero do aluno " + numeroAluno + "\nNome: " + nome + "\nIdade: " + idade);
    }
    void passou()
    {
        if (((prova1 + prova2)/2)>= 6)
        {
            JOptionPane.showMessageDialog(null,"Você passou! :D");
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"Você não passou! :c");
        }
    }

    
            
}
