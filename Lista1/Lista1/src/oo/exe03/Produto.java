/* Exercício 3
Implemente em Java uma classe chamada Produto contendo as variáveis id (int), descrição (String), qtde (int) e preco (float). Essa classe deve possuir os dois métodos construtores, com e sem parâmetros, e ainda os métodos:
•	comprar(int x): que compra um produto aumentando em x a quantidade em estoque;
•	vender(int x): que vende um produto diminuindo em x a quantidade em estoque;
•	subir(float x): que aumenta o preço do produto em x unidades;
•	descer(float x): que diminui o preço do produto em x unidades;
•	mostra(): que mostra todas as informações do produto

Finalmente, cria uma classe TestaProduto, que cria dois Produtos (cada um deve utilizar um construtor diferente) e teste os métodos criados.
*/

package oo.exe03;

import javax.swing.JOptionPane;

/**
 *
 * @author Amanda Barboza
 */
public class Produto {
    // declaração das variáveis
    int id;
    String description;
    int quantity;
    float price;
    
    // métodos construtores
    Produto()
    {
        
    }
    Produto(int id, String description, int quantity, float price)
    {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }
    
    void toBuy(int x)
    {
        quantity += x;
    }
    void toSell(int x)
    {
        quantity -= x;
    }
    void priceUp(float x)
    {
        price += x;
    }
    void priceDown(float x)
    {
        price -= x;
    }
    void toShow()
    {
        JOptionPane.showMessageDialog(null,"\nIdentificação do produto: " + id + "\nDescrição: " + description + "\nQuantidade em estoque: " + quantity + "\nPreço: R$" + price);
    }
    
    
    
}
