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
public class Matriz {
    int colunas,linhas;
    int [][] matriz;    
    
    //constroi a matriz definindo suas colunas e linhas
    Matriz(int c,int l){
        this.colunas = c;
        this.linhas = l;
        matriz = new int[c][l];
        System.out.println("Matriz criada com sucesso, Ordem: " + l + "x" + c);
    }

    //coloca os valores informados pelo usuario dentro da matriz,
    //também converte os numeros para romano utilizando do metodo decodificar
    void InputValores(String mtext){
        int  l =0, c =0;       
        for(int k = 0; k < (mtext.length()); k++){
            if(mtext.charAt(k) == ' '){
                c++;
                System.out.print("   ");
            } else if(mtext.charAt(k) == ','){
                l++; 
                c = 0;
                k++;
                System.out.println("");
            } else if(mtext.charAt(k) != ' ' && mtext.charAt(k) != ','){
                if(k < mtext.length() - 1){                    
                    if(decodificar(mtext.charAt(k)) >= decodificar(mtext.charAt(k + 1))){
                        matriz[c][l] = decodificar(mtext.charAt(k)) + matriz[c][l]; 
                    } else {
                        matriz[c][l] = matriz[c][l] - decodificar(mtext.charAt(k));
                    }
                    if(decodificar(mtext.charAt(k+1)) == 0){
                        System.out.print(matriz[c][l]);
                    }
                } else {
                    System.out.println("");
                }
            }           
        }
    }
    
    //retorna o valor referente a sua respectiva letra romana
    //caso a letra informada não for romana, ele retorna 0
    public int decodificar(char roman){
        switch(roman){
            case 'M' : return 1000;
            case 'C' : return 100;
            case 'L' : return 50;
            case 'X' : return 10;
            case 'V' : return 5;
            case 'I' : return 1;    
            default  : return 0;
        }
    }
}
