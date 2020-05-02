/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import view.MainView;

/**
 *
 * @author bielm
 * @co-author Andre
 */
public class LerArquivo extends MainView{
   
    public ArrayArquivoDado dadoEnvia = new ArrayArquivoDado();
    
    Contas fazContas = new Contas();
    
    public void processaArquivo(File file){  
     
       BufferedReader conteudo = null;
       String linha ="";
       String separaCampo=";";
     
        try{
            conteudo = new BufferedReader(new FileReader(file));
            
            while((linha=conteudo.readLine()) !=null){
             String[] dados = linha.split(separaCampo);
             String pais = dados[0];
             double densidade = Double.parseDouble(dados[1]);
                             
            
              
            //Envia os dados normais.  
             dadoEnvia.addArrayList(pais, densidade);
          
            }
       } catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"Arquivo não encontrado:\n"+e.getMessage());
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.print ("bug relacionado ao valor ordenado.");
        } catch(IOException e){
            JOptionPane.showMessageDialog(null,"IO Erro: \n"+e.getMessage());
        }finally{
            if(conteudo != null){
                try{
                    conteudo.close();
                }catch(IOException e){
                    JOptionPane.showMessageDialog(null,"IO Erro: \n"+ e.getMessage());
                }
            }
        }
    }
    
    public void leArquivo(){
        JFileChooser fileChosChooser = new JFileChooser();
        int resposta = fileChosChooser.showOpenDialog(new JDialog());
        File file = new File("");
        
        if(resposta == JFileChooser.APPROVE_OPTION){
            file = fileChosChooser.getSelectedFile();
            JOptionPane.showMessageDialog(null,"Arquivo selecionado com sucesso.");
            processaArquivo(file);
        }else if(resposta == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null,"Cancelado.");
        }
    }
}