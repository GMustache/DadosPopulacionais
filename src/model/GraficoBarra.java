/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Collections;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author bielm
 */
public class GraficoBarra{   
    
   
    
    public CategoryDataset createDataset(ArrayList<ArrayArquivo> dados){
        
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        for(ArrayArquivo dado : dados){
            dataSet.addValue(dado.getDensidade(),dado.getPais(), "");
        }
        return dataSet;
    }
    
    public JFreeChart createBarChart(CategoryDataset dataSet){
        
        JFreeChart graficodeBarras = ChartFactory.createBarChart(
                "Densidade Demográfica",
                "",
                "calculo",
                dataSet,
                PlotOrientation.VERTICAL,
                true,
                false, 
                false
                );
    return graficodeBarras;
    }
    
    public ChartPanel criarGrafico(ArrayList<ArrayArquivo> dados){
        Collections.sort(dados);
        CategoryDataset dataSet = this.createDataset(dados);
        
        JFreeChart grafico = this.createBarChart(dataSet);
        
        ChartPanel painelDoGrafico = new ChartPanel(grafico);
        painelDoGrafico.setPreferredSize(new Dimension(1200,600));
        
        return painelDoGrafico;
    }
    
    //////////////////////////////////////////////////////////////////////////////////
    
  
   

    
    
}
