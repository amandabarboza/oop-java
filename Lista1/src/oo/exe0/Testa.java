package oo.exe0;

import javax.swing.JOptionPane;

public class Testa {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        // criar objeto da classe Carro
        /*Carro obj1 = new Carro();
        obj1.modelo = "Onix";
        obj1.ano = 2019;
        obj1.velocidade = 0;
        obj1.motor = false;*/
        
        String auxModelo = JOptionPane.showInputDialog("Informe modelo");
        int auxAno = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano:"));
        float auxVel = Float.parseFloat(JOptionPane.showInputDialog("Informe a velocidade:"));
                //vai receber o que o usuário digitar
        int opcao = JOptionPane.showConfirmDialog(null, "Carro está ligado?");
        // pergunta de sim ou nao
        boolean auxMotor;
        auxMotor = (opcao == JOptionPane.OK_OPTION); //se é true ou false
        
        
        Carro obj1 = new Carro(auxModelo, auxAno, auxVel, auxMotor); // this representa obj1
        // chamar os métodos
        obj1.mostrar();
        
        obj1.ligar();
        obj1.mostrar();
        
        obj1.acelerar(50);
        obj1.mostrar();
        
        obj1.frear(20);
        obj1.mostrar();
        
        obj1.desligar();
        obj1.mostrar();
        
        
        // criar o objeto 2
        
        /*Carro obj2 = new Carro();
        obj2.modelo = "Palio";
        obj2.motor = false;
        obj2.ano = 2012;
        obj2.velocidade = 0;*/
        
        //n precisa da escrita 'String' pois ja foi declarada anteriormente
        auxModelo = JOptionPane.showInputDialog("Informe modelo");
        auxAno = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano:"));
        auxVel = Float.parseFloat(JOptionPane.showInputDialog("Informe a velocidade:"));
        opcao = JOptionPane.showConfirmDialog(null, "Carro está ligado?");
        
        Carro obj2 = new Carro(auxModelo, auxAno, auxVel, auxMotor); // this representa obj2
        
        obj2.mostrar();
        
        obj2.ligar();
        obj2.mostrar();
        
        obj2.acelerar(80);
        obj2.mostrar();
        
        obj2.frear(50);
        obj2.mostrar();
        
        obj2.desligar();
        obj2.mostrar();
              
        
    }
    
}
