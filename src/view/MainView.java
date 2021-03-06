/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ArrayArquivo;
import model.ArrayArquivoDado;
import model.Contas;
import model.GraficoBarra;
import model.GraficoPizza;
import model.LerArquivo;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author andre
 */
public class MainView extends javax.swing.JFrame {
   
    /**
     * Creates new form mainJFrame
     */
    public MainView() {
        initComponents();
        jPGrafico.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem6 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPGrafico = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        JmDados = new javax.swing.JMenu();
        jmLerDados = new javax.swing.JMenuItem();
        jMgrafico = new javax.swing.JMenu();
        jMBarras = new javax.swing.JMenuItem();
        JMPizza = new javax.swing.JMenuItem();

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/fundo.jpg"))); // NOI18N

        jTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Países", "Densidades"
            }
        ));
        jScrollPane1.setViewportView(jTabela);

        javax.swing.GroupLayout jPGraficoLayout = new javax.swing.GroupLayout(jPGrafico);
        jPGrafico.setLayout(jPGraficoLayout);
        jPGraficoLayout.setHorizontalGroup(
            jPGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPGraficoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1205, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPGraficoLayout.setVerticalGroup(
            jPGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 146, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1069, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jMenu1.setText("Calculos");

        jMenuItem2.setText("Exibir todos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        JmDados.setText("Dados");

        jmLerDados.setText("Abrir");
        jmLerDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmLerDadosActionPerformed(evt);
            }
        });
        JmDados.add(jmLerDados);

        jMenuBar1.add(JmDados);

        jMgrafico.setText("Grafico");

        jMBarras.setText("Barras");
        jMBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMBarrasActionPerformed(evt);
            }
        });
        jMgrafico.add(jMBarras);

        JMPizza.setText("Pizza");
        JMPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMPizzaActionPerformed(evt);
            }
        });
        jMgrafico.add(JMPizza);

        jMenuBar1.add(jMgrafico);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmLerDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmLerDadosActionPerformed
        
        LerArquivo d = new LerArquivo(); 
        d.leArquivo();
        
         DefaultTableModel val = (DefaultTableModel) jTabela.getModel();      
                ArrayArquivoDado dados = new ArrayArquivoDado();
                String pais;
                Double densidade;
                for(ArrayArquivo dado : dados.dadoArray){
                    pais = dado.getPais();
                    densidade = dado.getDensidade();
                    val.addRow(new String[]{pais, densidade.toString()});
                }
         jPGrafico.setVisible(true);
    }//GEN-LAST:event_jmLerDadosActionPerformed

    private void jMBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMBarrasActionPerformed
        
    this.jPGrafico.removeAll();
     
     LerArquivo lido = new LerArquivo();
     
     GraficoBarra graficodebarra = new GraficoBarra();
     this.jPGrafico.setLayout(new BorderLayout()); 
     ArrayArquivoDado da = lido.dadoEnvia; 
     this.jPGrafico.add(graficodebarra.criarGrafico(da.dadoArray));
     
     pack();
        
    }//GEN-LAST:event_jMBarrasActionPerformed
                                      

    private void JMPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMPizzaActionPerformed
        // TODO add your handling code here:
        
        this.jPGrafico.removeAll();
        
  
         LerArquivo lido = new LerArquivo();
     
         GraficoPizza graficoPizza = new GraficoPizza();
         this.jPGrafico.setLayout(new BorderLayout()); 
         ArrayArquivoDado da = lido.dadoEnvia; 
         this.jPGrafico.add(graficoPizza.criarGrafico(da.dadoArray));
     
         pack();
    
    
   
    }//GEN-LAST:event_JMPizzaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        ContasView tela = new ContasView();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMPizza;
    private javax.swing.JMenu JmDados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMBarras;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenu jMgrafico;
    private javax.swing.JPanel jPGrafico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabela;
    private javax.swing.JMenuItem jmLerDados;
    // End of variables declaration//GEN-END:variables
}
