/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author bielm
 */
public class GraficoPizza{   
    
    public PieDataset createDataset(ArrayList<ArrayArquivo> dados){
        
       DefaultPieDataset dataset = new DefaultPieDataset();
       
       for(ArrayArquivo dado : dados){
            dataset.setValue(dado.getPais(),dado.getDensidade());
        }
        return dataset;
    }
 
     private static JFreeChart createChart(PieDataset dataset) {
        
        JFreeChart chart = ChartFactory.createPieChart(
            "Densidade Demográfica",  // chart title
            dataset,             // data
            true,               // include legend
            true,
            false
        );

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 12));
        plot.setNoDataMessage("No data available");
        plot.setCircular(false);
        plot.setLabelGap(0.02);
        return chart;
        
    }

      public ChartPanel criarGrafico(ArrayList<ArrayArquivo> dados){
        PieDataset dataSet = this.createDataset(dados);
        
        JFreeChart grafico = this.createChart(dataSet);
        
        ChartPanel painelDoGrafico = new ChartPanel(grafico);
        painelDoGrafico.setPreferredSize(new Dimension(1200,600));
        
        return painelDoGrafico;
    }
      
   

    
    
}
