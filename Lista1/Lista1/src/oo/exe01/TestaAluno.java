package oo.exe01;

import javax.swing.JOptionPane;

/**
 *
 * @author abarb
 */
public class TestaAluno {
    public static void main(String[] args)
    {
        int auxStudentnumber = Integer.parseInt(JOptionPane.showInputDialog("Infome o número do aluno:"));
        String auxName = JOptionPane.showInputDialog("Informe o nome:");
        int auxAge = Integer.parseInt(JOptionPane.showInputDialog("Infome a idade:"));
        float auxTest1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da prova 1:"));
        float auxTest2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da prova 2:"));
    
    Aluno student1 = new Aluno(auxStudentnumber,auxName, auxAge, auxTest1, auxTest2);
    // chamar os métodos
    
    
    JOptionPane.showMessageDialog(null, student1.passed());
    
    student1.studentData();
    
    JOptionPane.showMessageDialog(null, "Média: " + student1.finalGrade());
    
    
    
    // criar o objeto 2
    auxStudentnumber = Integer.parseInt(JOptionPane.showInputDialog("Infome o número do aluno:"));
    auxName = JOptionPane.showInputDialog("Informe o nome:");
    auxAge = Integer.parseInt(JOptionPane.showInputDialog("Infome a idade:"));
    auxTest1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da prova 1:"));
    auxTest2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da prova 2:"));
    Aluno student2 = new Aluno(auxStudentnumber, auxName, auxAge, auxTest1, auxTest2);
    
    student2.finalGrade();
    student2.studentData();
    }
    
}
