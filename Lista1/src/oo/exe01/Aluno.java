package oo.exe01;

import javax.swing.JOptionPane;

/**
 *
 * @author abarb
 */
public class Aluno 
{
    // declaração das variáveis
    int numeroAluno, idade;
    String nome;
    float prova1, prova2;
    
    
    //método construtor
    public Aluno()
    {
        
    }
    public Aluno(int numeroAluno, String nome, int idade, float prova1, float prova2)
    {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.prova1 = prova1;
        this.prova2 = prova2;              
    }
    
    float notaFinal()
    {
        return (this.prova1 + this.prova2)/2;
    }
    /* public void notaFinal()
    {
        float media = (prova1 + prova2)/2;
        JOptionPane.showMessageDialog(null,"Sua média foi:" + media);
    } */
    public void dadosAluno()
    {
        JOptionPane.showMessageDialog(null,"\nNúmero do aluno " + this.numeroAluno + "\nNome: " + this.nome + "\nIdade: " + this.idade);
    }
    
    String passou()
    {
        return (this.notaFinal() >= 6) ? "Aprovado" : "Reprovado";
    }
    /*public void passou()
    {
        if (((prova1 + prova2)/2)>= 6)
        {
            JOptionPane.showMessageDialog(null,"Você passou! :D");
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"Você não passou! :c");
        }
    } */  
            
}
