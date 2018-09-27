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
public class Operações {
    
    void soma(Matriz matriz1, Matriz matriz2){
        System.out.println("***************************************************************");
        System.out.println("Realizando soma.....");
        if(verificador(matriz1, matriz2)){
            for(int c = 0; c < matriz1.colunas; c++){
                for (int l = 0; l < matriz2.linhas; l++){
                    System.out.println("linha: " + l + " coluna: " + c + " resultado: " + (matriz1.matriz[c][l] + matriz2.matriz[c][l]));
                }
            }
        } else {
            System.out.println("***************************************************************");
            System.out.println("Não foi possivel realizar a soma");
            System.out.println("***************************************************************");
        }       
    }
    
    void subtracao(Matriz matriz1, Matriz matriz2){
        if(verificador(matriz1, matriz2)){
            System.out.println("***************************************************************");
            System.out.println("Realizando subtração......");
            for(int c = 0; c < matriz1.colunas; c++){
                for (int l = 0; l < matriz2.linhas; l++){
                    System.out.println("linha: " + l + " coluna: " + c + " resultado: " + (matriz1.matriz[c][l] - matriz2.matriz[c][l]));
                }
            }
        } else {
            System.out.println("***************************************************************");
            System.out.println("Não foi possivel realizar a subtração");
            System.out.println("***************************************************************");
        }
    }
    
    int multiplicacao(Matriz matriz1, Matriz matriz2){
        if(verificadorMulti(matriz1, matriz2)){
            
        }
        return 0;
    }   
    
    void multiplicacaoEscalar(Matriz matriz, double escalar){
        System.out.println("***************************************************************");
        System.out.println("Realizando Multiplicação por escalar....");
        for(int c = 0; c < matriz.colunas; c++){
            for (int l = 0; l < matriz.linhas; l++){
                System.out.println("linha: " + l + " coluna: " + c + " resultado: " + matriz.matriz[c][l]*escalar);
            }
        }       
    }
    
    boolean verificadorMulti(Matriz matriz1, Matriz matriz2){
        return matriz1.linhas == matriz2.colunas;
    }    
    
    boolean verificador(Matriz matriz1, Matriz matriz2){
        return matriz1.colunas == matriz2.colunas && matriz2.linhas == matriz1.linhas;
    }
}