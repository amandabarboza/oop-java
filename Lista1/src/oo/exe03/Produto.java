package oo.exe03;

import javax.swing.JOptionPane;

/**
 *
 * @author abarb
 */
public class Produto {
    // declaração das variáveis
    int id;
    String descricao;
    int qtde;
    float preco;
    
    Produto()
    {
        
    }
    Produto(int id, String descricao, int qtde, float preco)
    {
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }
    
    void toBuy(int x)
    {
        qtde += x;
    }
    void toSell(int x)
    {
        qtde -= x;
    }
    void priceUp(float x)
    {
        preco += x;
    }
    void priceDown(float x)
    {
        preco -= x;
    }
    void toShow()
    {
        JOptionPane.showMessageDialog(null,"\nIdentificação do produto: " + id + "\nDescrição: " + descricao + "\nQuantidade em estoque: " + qtde + "\nPreço: R$" + preco);
    }
    
    
    
}
