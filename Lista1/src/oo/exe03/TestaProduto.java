package oo.exe03;

import javax.swing.JOptionPane;

/**
 *
 * @author abarb
 */
public class TestaProduto {
    public static void main(String[] args)
    {
        // criando o primeiro objeto
        int auxId = Integer.parseInt(JOptionPane.showInputDialog("Informe a identificação do produto: "));
        String auxDescricao = JOptionPane.showInputDialog("Informe a descrição: ");
        int auxQtde = Integer.parseInt(JOptionPane.showInputDialog("Infome a quantidade em estoque: "));
        float auxPreco = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço: "));
        
    Produto product1 = new Produto(auxId, auxDescricao, auxQtde, auxPreco);
    
    //chamar os métodos
    product1.toShow();
    
    product1.toBuy(5);
    product1.toShow();
    
    product1.toSell(10);
    product1.toShow();
    
    product1.priceUp(20);
    product1.toShow();
    
    product1.priceDown(40);
    product1.toShow();
    
    
    // criando o segundo objeto
    auxId = Integer.parseInt(JOptionPane.showInputDialog("Informe a identificação do produto: "));
    auxDescricao = JOptionPane.showInputDialog("Informe a descrição: ");
    auxQtde = Integer.parseInt(JOptionPane.showInputDialog("Infome a quantidade em estoque: "));
    auxPreco = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço: "));
        
    Produto obj2 = new Produto(auxId, auxDescricao, auxQtde, auxPreco);
    
    obj2.toShow();
            
    obj2.toBuy(10);
    obj2.toShow();
    
    obj2.toSell(20);
    obj2.toShow();
    
    obj2.priceUp(500);
    obj2.toShow();
    
    obj2.priceDown(70);
    obj2.toShow();
            
    }
}
