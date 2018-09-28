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
public class DescobrirLeC { 
    
    //descobre o numero de linhas da matriz informada
    public int descobLinhas(String mTxt){           
        int l=1,c=1;        
        for (int k =0; k < mTxt.length(); k++){
            if(mTxt.charAt(k) == ' '){
                c++;                
            }else if(mTxt.charAt(k) == ','){
                l++;
                c = 1;
                k++;
            }            
        }        
        //System.out.println("coluna: " + c + " linha: " + l);        
        return l;        
    }    
    
    //descobre o numero de colunas da matriz
    public int descobColunas(String mTxt){           
        int l=1,c=1;        
        for (int k =0; k < mTxt.length(); k++){
            if(mTxt.charAt(k) == ' '){
                c++;                
            }else if(mTxt.charAt(k) == ','){
                l++;
                c = 1;
                k++;
            }         
        }        
        //System.out.println("coluna: " + c + " linha: " + l);        
        return c;        
    }        
}

