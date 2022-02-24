package oo.exe03;

import javax.swing.JOptionPane;

/**
 *
 * @author Amanda Barboza
 */
public class TestaProduto {
    public static void main(String[] args)
    {
        // criando o primeiro objeto
        int auxId = Integer.parseInt(JOptionPane.showInputDialog("Informe a identificação do produto: "));
        String auxDescription = JOptionPane.showInputDialog("Informe a descrição: ");
        int auxQuantity = Integer.parseInt(JOptionPane.showInputDialog("Infome a quantidade em estoque: "));
        float auxPrice = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço: "));
        
    Produto product1 = new Produto(auxId, auxDescription, auxQuantity, auxPrice);
    
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
    auxDescription = JOptionPane.showInputDialog("Informe a descrição: ");
    auxQuantity = Integer.parseInt(JOptionPane.showInputDialog("Infome a quantidade em estoque: "));
    auxPrice = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço: "));
        
    Produto product2 = new Produto(auxId, auxDescription, auxQuantity, auxPrice);
    
    product2.toShow();
            
    product2.toBuy(10);
    product2.toShow();
    
    product2.toSell(20);
    product2.toShow();
    
    product2.priceUp(500);
    product2.toShow();
    
    product2.priceDown(70);
    product2.toShow();
            
    }
}
