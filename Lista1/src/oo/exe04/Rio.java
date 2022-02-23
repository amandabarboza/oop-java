package oo.exe04;

import javax.swing.JOptionPane;

/**
 *
 * @author abarb
 */
public class Rio {
    // declaração de variáveis
    String nome;
    float nivel;
    boolean poluido;
    
    Rio()
    {
        
    }
    Rio(String nm, float nl, boolean pd)
    {
        nome = nm;
        nivel = nl;
        poluido = pd;
    }
    void chover(float x)
    {
        nivel += x;
    }
    void ensolarar(float x)
    {
        nivel -= x;
    }
    void limpar()
    {
        poluido = false;
    }
    void sujar()
    {
        poluido = true;
    }
    void mostrar()
    {
        JOptionPane.showMessageDialog(null,"\nNome do rio: " + nome + "\nNível: " + nivel + "\nPoluído: " + poluido);
    }
}
