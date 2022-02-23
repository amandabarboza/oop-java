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
    Produto(int ic, String dc, int qt, float pc)
    {
        id = ic;
        descricao = dc;
        qtde = qt;
        preco = pc;
    }
    
    void comprar(int x)
    {
        qtde += x;
    }
    void vender(int x)
    {
        qtde -= x;
    }
    void subir(float x)
    {
        preco += x;
    }
    void descer(float x)
    {
        preco -= x;
    }
    void mostrar()
    {
        JOptionPane.showMessageDialog(null,"\nIdentificação do produto: " + id + "\nDescrição: " + descricao + "\nQuantidade em estoque: " + qtde + "\nPreço: R$" + preco);
    }
    
    
    
}
