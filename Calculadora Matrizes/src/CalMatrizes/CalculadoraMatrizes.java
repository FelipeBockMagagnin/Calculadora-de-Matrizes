package CalMatrizes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Felpi
 */

public class CalculadoraMatrizes {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DescobrirLeC decod = new DescobrirLeC();
        Operações op = new Operações();
        Menu me = new Menu();        
        
        int input;                      //contem a alternativa selecionada pelo usuario
        boolean terminou = false;       //define se o programa terminou sua execução
        String matriztxt;               //contem a matriz digitada pelo usuario
            
        me.start();      
        
      
        System.out.println("escreva uma matriz");
        matriztxt = scan.nextLine();        
        Matriz matriz1 = new Matriz(decod.descobColunas(matriztxt),decod.descobLinhas(matriztxt));
        matriz1.InputValores(matriztxt);

        System.out.println("escreva a segunda matriz");
        matriztxt = scan.nextLine();
        Matriz matriz2 = new Matriz(decod.descobColunas(matriztxt),decod.descobLinhas(matriztxt));
        matriz2.InputValores(matriztxt);      

        while(!terminou){ 
            me.escolhas();
            input = scan.nextInt();
            switch(input){
                case 1: 
                    op.soma(matriz1, matriz2); 
                break;
                case 2: 
                    op.subtracao(matriz1, matriz2); 
                break;
                case 3: 
                    System.out.println("Qual matriz deseja realizar essa operação?");
                    System.out.println("1 - matriz 1");
                    System.out.println("2 - matriz 2");
                    int inputEscalar = 0;
                    int multi = 0;
                    inputEscalar = scan.nextInt();
                    switch(inputEscalar){                        
                        case 1: 
                            System.out.println("Por qual numero deseja multiplicar?");                            
                            multi = scan.nextInt();
                            op.multiplicacaoEscalar(matriz1, multi);
                        break;
                        case 2: 
                            System.out.println("Por qual numero deseja multiplicar?");
                            multi = scan.nextInt();
                            op.multiplicacaoEscalar(matriz2, multi);
                        break;
                    }
                break;
                case 4:
                    op.multiplicacao(matriz1, matriz2);
                break;
                default: 
                    System.out.println("error");
                break;
            }

            me.pergFinalizacao();
            input = scan.nextInt();

            switch(input){
                case 1: 
                    terminou = false;
                break;
                case 2:
                    terminou = true;
                break;
                default: 
                    System.out.println("error");
                    terminou = true;
                break;
            }
        }
        me.Finalizar();
    }    
}
