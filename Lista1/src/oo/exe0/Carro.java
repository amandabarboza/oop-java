/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo.exe0;

import javax.swing.JOptionPane;

/**
 *
 * @author 23710
 */
public class Carro 
{
    // declaração das variáveis
    String modelo;
    int ano;
    float velocidade;
    boolean motor; // true (ligado) ou false (desligado)
    
    
    //método construtor
    Carro ()
    {
        
    }
    Carro(String md, int an, float ve, boolean mt)
    {
        modelo = md;
        ano = an;
        velocidade = ve;
        motor = mt;
    }
    
    // métodos
    // void pois o metodo n retorna nd (n tem o 'return')
    void ligar() 
    {
        motor = true;
    }
    void desligar() 
    {
        motor = false;
    }
    void acelerar(float x)
    {
        velocidade += x;
    }
    void frear(float x)
    {
        velocidade -=x;
    }
    void mostrar()
    {
    //System.out.println("\nModelo: " + modelo + "\nAno: " + ano + "\nVel: " + velocidade + "\nMotor: " + motor); -> para printar na tela
        JOptionPane.showMessageDialog(null,"\nModelo: " + modelo + "\nAno: " + ano + "\nVel: " + velocidade + "\nMotor: " + motor);
    }
}