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
public class TestaAluno {
    public static void main(String[] args)
    {
        int auxNumeroaluno = Integer.parseInt(JOptionPane.showInputDialog("Infome o número do aluno:"));
        String auxNome = JOptionPane.showInputDialog("Informe o nome:");
        int auxIdade = Integer.parseInt(JOptionPane.showInputDialog("Infome a idade:"));
        float auxProva1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da prova 1:"));
        float auxProva2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da prova 2:"));
    
    Aluno obj1 = new Aluno(auxNumeroaluno,auxNome, auxIdade, auxProva1, auxProva2);
    // chamar os métodos
    obj1.notaFinal();
    obj1.dadosAluno();
    obj1.passou();
    
    
    
    // criar o objeto 2
    auxNumeroaluno = Integer.parseInt(JOptionPane.showInputDialog("Infome o número do aluno:"));
    auxNome = JOptionPane.showInputDialog("Informe o nome:");
    auxIdade = Integer.parseInt(JOptionPane.showInputDialog("Infome a idade:"));
    auxProva1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da prova 1:"));
    auxProva2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da prova 2:"));
    Aluno obj2 = new Aluno(auxNumeroaluno, auxNome, auxIdade, auxProva1, auxProva2);
    
    obj2.notaFinal();
    obj2.dadosAluno();
    }
    
}