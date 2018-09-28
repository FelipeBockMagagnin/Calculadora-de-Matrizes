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
    
    //soma os valores seguindo a ordem normal
    void soma(Matriz matriz1, Matriz matriz2){
        System.out.println("***************************************************************");
        System.out.println("Realizando soma.....");
        if(verificador(matriz1, matriz2)){
            for (int l = 0; l < matriz2.linhas; l++){
                for(int c = 0; c < matriz1.colunas; c++){                
                    System.out.print((matriz1.matriz[c][l] + matriz2.matriz[c][l]));
                    System.out.print("  ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("***************************************************************");
            System.out.println("Não foi possivel realizar a soma");
            System.out.println("***************************************************************");
        }       
    }
    
    //subtrai os valores seguindo a ordem normal
    void subtracao(Matriz matriz1, Matriz matriz2){
        if(verificador(matriz1, matriz2)){
            System.out.println("***************************************************************");
            System.out.println("Realizando subtração......");
            for (int l = 0; l < matriz2.linhas; l++){
                for(int c = 0; c < matriz1.colunas; c++){                
                    System.out.print((matriz1.matriz[c][l] - matriz2.matriz[c][l]));
                    System.out.print("  ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("***************************************************************");
            System.out.println("Não foi possivel realizar a subtração");
            System.out.println("***************************************************************");
        }
    }
    
    //realiza a multiplicação
    //cada linha multiplica com sua coluna e depois o resultado é adicionado a soma
    //esse processo é realizado para cada linha com sua determinada coluna, gerando um elemento
    void multiplicacao(Matriz matriz1, Matriz matriz2){
        int result = 0, soma =0;
        
        if(verificadorMulti(matriz1, matriz2)){
            System.out.println("***************************************************************");
            System.out.println("Realizando multiplicação.....");
            for(int c = 0; c < matriz2.colunas; c++){       
                for(int l = 0; l < matriz1.linhas; l++){                            
                    for(int x = 0; x < matriz2.colunas; x++){
                        result = matriz1.matriz[l][x] * matriz2.matriz[x][c];
                        soma = soma + result;
                    }
                    System.out.print(soma);
                    System.out.print("  ");
                    soma = 0;
                }                
              System.out.println("");  
            }
        } else {
            System.out.println("***************************************************************");
            System.out.println("Não foi possivel realizar a multiplicaçao");
            System.out.println("***************************************************************");
        }
    }
    
    //multiplica cada elemento por um int determinado
    void multiplicacaoEscalar(Matriz matriz, int escalar){
        System.out.println("***************************************************************");
        System.out.println("Realizando Multiplicação por escalar....");
        for (int l = 0; l < matriz.linhas; l++){
            for(int c = 0; c < matriz.colunas; c++){            
                System.out.print(matriz.matriz[c][l]*escalar);
                System.out.print("  ");
            }
            System.out.println("");
        }       
    }
    
    //verifica se é possivel realizar a multiplicação
    boolean verificadorMulti(Matriz matriz1, Matriz matriz2){
        return matriz1.linhas == matriz2.colunas;
    }    
    
    //verifica se é possivel realizar soma/subtração
    boolean verificador(Matriz matriz1, Matriz matriz2){
        return matriz1.colunas == matriz2.colunas && matriz2.linhas == matriz1.linhas;
    }
}