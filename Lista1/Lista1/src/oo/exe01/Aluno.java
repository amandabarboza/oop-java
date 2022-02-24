package oo.exe01;

import javax.swing.JOptionPane;

/**
 *
 * @author abarb
 */
public class Aluno 
{
    // declaração das variáveis
    int studentNumber, age;
    String name;
    float test1, test2;
    
    
    //método construtor
    public Aluno()
    {
        
    }
    public Aluno(int studentNumber, String name, int age, float test1, float test2)
    {
        this.studentNumber = studentNumber;
        this.name = name;
        this.age = age;
        this.test1 = test1;
        this.test2 = test2;              
    }
    
    float finalGrade()
    {
        return (this.test1 + this.test2)/2;
    }
    /* public void notaFinal()
    {
        float media = (prova1 + prova2)/2;
        JOptionPane.showMessageDialog(null,"Sua média foi:" + media);
    } */
    public void studentData()
    {
        JOptionPane.showMessageDialog(null,"\nNúmero do aluno " + this.studentNumber + "\nNome: " + this.name + "\nIdade: " + this.age);
    }
    
    String passed()
    {
        return (this.finalGrade() >= 6) ? "Aprovado" : "Reprovado";
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
