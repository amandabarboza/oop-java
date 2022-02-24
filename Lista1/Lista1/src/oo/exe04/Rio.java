/*
Exercício 4
Implemente em Java uma classe chamada Rio contendo as variáveis nome(String), nível (float) e poluído (boolean). Essa classe deve possuir os dois métodos construtores, com e sem parâmetros, e ainda os métodos:
•	chover(float): que aumenta o nível atual do rio;
•	ensolarar(float): que diminui o nível atual do rio;
•	limpar(): que limpa o rio;
•	sujar(): que polui o rio;
•	mostra(): que mostra todas as informações do rio.

Finalmente, cria uma classe TestaRio, que cria dois Rios (cada um deve utilizar um construtor diferente) e teste os métodos criados.

*/

package oo.exe04;

import javax.swing.JOptionPane;

/**
 *
 * @author Amanda Barboza
 */
public class Rio {
    // declaração de variáveis
    String name;
    float waterlevel;
    boolean polluted;
    
    Rio()
    {
        
    }
    Rio(String name, float waterlevel, boolean polluted)
    {
        name = name;
        waterlevel = waterlevel;
        polluted = polluted;
    }
    void toRain(float x)
    {
        waterlevel += x;
    }
    void sunny(float x)
    {
        waterlevel -= x;
    }
    void toClean()
    {
        polluted = false;
    }
    void toDirty()
    {
        polluted = true;
    }
    void toShow()
    {
        JOptionPane.showMessageDialog(null,"\nNome do rio: " + name + "\nNível: " + waterlevel + "\nPoluído: " + polluted);
    }
}
