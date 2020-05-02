/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author andre
 */
public class ArrayArquivo implements Comparable{
    private String pais;
    private double densidade;
    
    @Override
    
    public int compareTo (Object comparar)
    {
        ArrayArquivo comparar2 = (ArrayArquivo)comparar;
        if(this.densidade>comparar2.densidade)
            return 1;
        else{
            return -1;
        }
    }
   
    public ArrayArquivo(String pais, double densidade){
        this.pais = pais;
        this.densidade = densidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    public double getDensidade() {
        return densidade;
    }

    public void setDensidade(double densidade) {
        this.densidade = densidade;
    } 
}