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
        
    Produto obj1 = new Produto(auxId, auxDescricao, auxQtde, auxPreco);
    
    //chamar os métodos
    obj1.mostrar();
    
    obj1.comprar(5);
    obj1.mostrar();
    
    obj1.vender(10);
    obj1.mostrar();
    
    obj1.subir(20);
    obj1.mostrar();
    
    obj1.descer(40);
    obj1.mostrar();
    
    
    // criando o segundo objeto
    auxId = Integer.parseInt(JOptionPane.showInputDialog("Informe a identificação do produto: "));
    auxDescricao = JOptionPane.showInputDialog("Informe a descrição: ");
    auxQtde = Integer.parseInt(JOptionPane.showInputDialog("Infome a quantidade em estoque: "));
    auxPreco = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço: "));
        
    Produto obj2 = new Produto(auxId, auxDescricao, auxQtde, auxPreco);
    
    obj2.mostrar();
            
    obj2.comprar(10);
    obj2.mostrar();
    
    obj2.vender(20);
    obj2.mostrar();
    
    obj2.subir(500);
    obj2.mostrar();
    
    obj2.descer(70);
    obj2.mostrar();
            
    }
}
