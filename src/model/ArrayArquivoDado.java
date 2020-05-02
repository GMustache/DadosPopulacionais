/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import view.MainView;

/**
 *
 * @author andre
 */
public class ArrayArquivoDado extends MainView {
   
    public static ArrayList<ArrayArquivo> dadoArray = new ArrayList<>();

    public void addArrayList(String pais, double densidade){
        dadoArray.add(new ArrayArquivo(pais,densidade));
    }   
}
