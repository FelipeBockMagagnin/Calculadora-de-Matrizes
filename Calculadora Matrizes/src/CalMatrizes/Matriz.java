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
    
    Matriz(int c,int l){
        this.colunas = c;
        this.linhas = l;
        matriz = new int[c][l];
        System.out.println("Matriz criada com sucesso, numero de linhas: " + l + " numero de colunas: " + c);
    }

    void InputValores(String mtext){
        int  l =0, c =0;       
        for(int k = 0; k < (mtext.length()); k++){
            System.out.println("letra numero : " + k);
            if(mtext.charAt(k) == ' '){
                c++;
            } else if(mtext.charAt(k) == ','){
                l++; 
                c = 0;
            } else if(mtext.charAt(k) != ' ' && mtext.charAt(k) != ','){
                if(k < mtext.length() - 1){
                    if(decodificar(mtext.charAt(k)) >= decodificar(mtext.charAt(k + 1))){
                        matriz[c][l] = decodificar(mtext.charAt(k)) + matriz[c][l]; 
                    } else {
                        matriz[c][l] = matriz[c][l] - decodificar(mtext.charAt(k));
                    }
                    System.out.println(matriz[c][l]);
                } else {
                    matriz[c][l] = matriz[c][l] +decodificar(mtext.charAt(k));
                    System.out.println(matriz[c][l]);
                }
            }           
        }
    }
    
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
