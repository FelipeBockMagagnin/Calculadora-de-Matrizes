/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalMatrizes;

/**
 *
 * @author Felpi
 */
public class Menu {
    void escolhas(){
        System.out.println("Qual operação deseja realizar");
        System.out.println("1 - soma");
        System.out.println("2 - subtração");
        System.out.println("3 - multiplicação por escalar");
        System.out.println("4 - multiplicação");
    }   
    
    void start(){
        System.out.println("Bem vindo ao Super matriz calculator extreme");
        System.out.println("Nesse programa voce pode realizar operações envolvendo matrizes");
        System.out.println("Lembre que voce deve usar apenas numeros romanos...");
    }
    
    void pergFinalizacao(){
        System.out.println("Obrigado por utilizar nosso programa");
        System.out.println("Agora vocÊ deseja....");
        System.out.println("1 - realizar outra operaçao");
        System.out.println("2 - finalizar o  programa");
    }
}
