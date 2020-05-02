/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class Contas {
   //Manipulação dos calculos AQUI!!!
    
    
    
    
    public static double media(ArrayList<ArrayArquivo> dados){
           
        double media = 0;
       
        for(ArrayArquivo dado : dados){
            media += dado.getDensidade();
        }
        
        media = media/(dados.size());
        
        return media;
    }
    
    public static String mediana(ArrayList<ArrayArquivo> dados){
   
       String texto= "";
       
       String pais="";
       double densidade =0;
       String pais1="";
       double densidade1 =0;
       
       
        if(dados.size() % 2 == 0){
             
            int x = ((dados.size()-1)/2);
            
            int aux = 0;
            
            for(ArrayArquivo dado : dados){
                
                
                if(aux == x){
                    
                     pais = dado.getPais();
                     densidade = dado.getDensidade();
                     
                     texto = pais + " : " + densidade + System.lineSeparator();
                    
                     
                }else if(aux == x+1){
                    
                     pais1 = dado.getPais();
                     densidade1 = dado.getDensidade();
                     
                     texto = texto +pais1 + " : " + densidade1;
                }else{
                    
                }
                
                aux++;
            
            }
            
            
            
        }else if(dados.size() % 2 != 0){
                    int x = (((dados.size()-1)+1)/2);
                    
                    int aux = 0;
                    
                    for(ArrayArquivo dado : dados){
                         
                
                         if(aux == x){
                    
                              pais = dado.getPais();
                              densidade = dado.getDensidade();
                           
                              texto = pais + " : " + densidade;
                        }else{
                             
                        }
            
                         aux++;
            
                      }
            
        }

        return texto;
    }
    
    public static double variancia(ArrayList<ArrayArquivo> dados){
           double variancia = 0;
           
           for(ArrayArquivo dado : dados){
            variancia+= Math.pow(dado.getDensidade() - 120,2) /dados.size();
        }
           
        return variancia;
    }
    
    public static double desvioPadrao(ArrayList<ArrayArquivo> dados){
           double desvioPadrao = 0;
           double variancia = 0;
           for(ArrayArquivo dado : dados){
            variancia+= Math.pow(dado.getDensidade() - 120,2) /dados.size();
        }
           desvioPadrao = Math.sqrt(variancia);
        return desvioPadrao;
    }
    
    public static double coefVariacao(ArrayList<ArrayArquivo> dados){
        double coefVariacao = 0;
        double desvioPadrao = 0;
        double variancia = 0;
        for(ArrayArquivo dado : dados){
            variancia+= Math.pow(dado.getDensidade() - 120,2) /dados.size();
            desvioPadrao = Math.sqrt(variancia);
        }
           coefVariacao = desvioPadrao / variancia;
        return coefVariacao;
    }  
    
}
