/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.ochotorres.interfazgrafica;

import com.unmsm.ochotorres.FueraLimiteException;
import com.unmsm.ochotorres.Tablero;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author pc
 */
public class Aplicacion8Torres extends javax.swing.JFrame {

    /**
     * Creates new form Aplicacion8Torres
     */
    
   
    public Aplicacion8Torres() {
        initComponents();
        setImagen(anterior,"anterior.jpg");
        setImagen(posterior,"posterior.jpg");
   
    }
    
        public void setImagen(JButton boton ,String imagePath){
        ImageIcon icono=new ImageIcon(imagePath);     
        ImageIcon iconAjustado= new ImageIcon(icono.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        boton.setIcon(iconAjustado);   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        tableroPresenter = new com.unmsm.ochotorres.interfazgrafica.TableroPresenter();
        jPanel1 = new javax.swing.JPanel();
        anterior = new javax.swing.JButton();
        posterior = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        fila = new javax.swing.JLabel();
        dimension = new javax.swing.JTextField();
        crearTablero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout tableroPresenterLayout = new javax.swing.GroupLayout(tableroPresenter);
        tableroPresenter.setLayout(tableroPresenterLayout);
        tableroPresenterLayout.setHorizontalGroup(
            tableroPresenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tableroPresenterLayout.setVerticalGroup(
            tableroPresenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(anterior, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(posterior, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(posterior, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tableroPresenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(tableroPresenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        getContentPane().add(panel, java.awt.BorderLayout.CENTER);

        jToolBar1.setBackground(new java.awt.Color(204, 204, 255));
        jToolBar1.setRollover(true);

        fila.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        fila.setText("DIMENSION DEL TABLERO  ");
        jToolBar1.add(fila);

        dimension.setMinimumSize(new java.awt.Dimension(6, 30));
        dimension.setPreferredSize(new java.awt.Dimension(30, 30));
        dimension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dimensionActionPerformed(evt);
            }
        });
        jToolBar1.add(dimension);

        crearTablero.setBackground(new java.awt.Color(0, 59, 60));
        crearTablero.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        crearTablero.setForeground(new java.awt.Color(255, 255, 255));
        crearTablero.setText("CREAR TABLERO");
        crearTablero.setFocusable(false);
        crearTablero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        crearTablero.setPreferredSize(new java.awt.Dimension(100, 21));
        crearTablero.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        crearTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearTableroActionPerformed(evt);
            }
        });
        jToolBar1.add(crearTablero);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);
        jToolBar1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dimensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dimensionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dimensionActionPerformed

    private void crearTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearTableroActionPerformed
        // TODO add your handling code here:
        String n = dimension.getText();
        int dimensionTablero = Integer.parseInt(n);
        Tablero.DIMENSION= dimensionTablero;
        Tablero tableroModelo = new Tablero();
        try {
            tableroPresenter.construirEnBaseA(tableroModelo);
        } catch (FueraLimiteException ex) {
            Logger.getLogger(Aplicacion8Torres.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_crearTableroActionPerformed
  
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
            java.util.logging.Logger.getLogger(Aplicacion8Torres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacion8Torres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacion8Torres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacion8Torres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacion8Torres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JButton crearTablero;
    private javax.swing.JTextField dimension;
    private javax.swing.JLabel fila;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel panel;
    private javax.swing.JButton posterior;
    private com.unmsm.ochotorres.interfazgrafica.TableroPresenter tableroPresenter;
    // End of variables declaration//GEN-END:variables
}
