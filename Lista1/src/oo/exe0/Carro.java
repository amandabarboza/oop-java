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
    Carro(String modelo, int ano, float velocidade, boolean motor)
    {
        this.modelo = modelo; //this representa o objeto q chama o método, o separando do segundo 'modelo' q eh parametro
        this.ano = ano;
        this.velocidade = velocidade;
        this.motor = motor;
    }
    
    // métodos
    // void pois o metodo n retorna nd (n tem o 'return')
    void ligar() 
    {
        this.motor = true;
    }
    void desligar() 
    {
        this.motor = false;
        this.velocidade =0;
    }
    void acelerar(float x)
    {
        this.velocidade += x;
    }
    void frear(float x)
    {
        this.velocidade -=x;
    }
    void mostrar()
    {
    //System.out.println("\nModelo: " + modelo + "\nAno: " + ano + "\nVel: " + velocidade + "\nMotor: " + motor); -> para printar na tela
        JOptionPane.showMessageDialog(null,"\nModelo: " + this.modelo + "\nAno: " + this.ano + "\nVel: " + this.velocidade + "\nMotor: " + this.motor);
    }
}