/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.gui;

import com.gt.modo_oscuro.Letrista;
import com.gt.modo_oscuro.Pintor;
import com.gt.modo_oscuro.PintorBT;
import com.pe.logica.Correo;
import com.pe.logica.Nombre;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.basic.BasicToggleButtonUI;

/**
 *
 * @author User
 */
public class View extends javax.swing.JFrame {

    ArrayList <String []> datos = new ArrayList();
    
    public void modOsc(){
        new Pintor(new Color (25,24,24)).pintar(rootPanel);
        new Letrista(Color.white).pintar(rootPanel);
        new PintorBT(new Color (40, 40, 60), Color.white).pintar(rootPanel);
        switchModo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pe/icons/dia.png")));
    }
    
    public void modCla(){
        new Pintor(Color.LIGHT_GRAY).pintar(rootPanel);
        new Letrista(Color.black).pintar(rootPanel);
        new PintorBT(new Color (40, 20, 100), Color.white).pintar(rootPanel);
        switchModo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pe/icons/noche.png")));
    }
    public View() {
        initComponents();
        modOsc();
        switchModo.setUI(new BasicToggleButtonUI());
        switchModo.setOpaque(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        rootPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        switchModo = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        txtAoellidos = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        txtGrado = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        txtEdad = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        txtCorreo = new javax.swing.JTextField();
        jPanel30 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rootPanel.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

        title.setFont(new java.awt.Font("Orbitron", 1, 14)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("REGISTRO");
        jPanel2.add(title, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.BorderLayout());

        switchModo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pe/icons/dia.png"))); // NOI18N
        switchModo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                switchModoMouseClicked(evt);
            }
        });
        jPanel3.add(switchModo, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel4.setPreferredSize(new java.awt.Dimension(60, 100));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, java.awt.BorderLayout.LINE_START);

        rootPanel.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.GridLayout(6, 1));

        jPanel22.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Orbitron", 1, 14)); // NOI18N
        jLabel5.setText("         Nombres");
        jLabel5.setPreferredSize(new java.awt.Dimension(150, 15));
        jPanel22.add(jLabel5, java.awt.BorderLayout.LINE_START);

        jPanel23.setLayout(new java.awt.BorderLayout());

        jPanel24.setPreferredSize(new java.awt.Dimension(532, 30));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel23.add(jPanel24, java.awt.BorderLayout.PAGE_START);

        jPanel25.setPreferredSize(new java.awt.Dimension(0, 30));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel23.add(jPanel25, java.awt.BorderLayout.PAGE_END);

        txtNombre.setFont(new java.awt.Font("Orbitron", 1, 14)); // NOI18N
        txtNombre.setPreferredSize(new java.awt.Dimension(55, 30));
        jPanel23.add(txtNombre, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        jPanel23.add(jPanel5, java.awt.BorderLayout.LINE_END);

        jPanel22.add(jPanel23, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel22);

        jPanel26.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(new java.awt.Font("Orbitron", 1, 14)); // NOI18N
        jLabel6.setText("        Apellidos");
        jLabel6.setPreferredSize(new java.awt.Dimension(150, 15));
        jPanel26.add(jLabel6, java.awt.BorderLayout.LINE_START);

        jPanel27.setLayout(new java.awt.BorderLayout());

        jPanel28.setPreferredSize(new java.awt.Dimension(532, 30));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel27.add(jPanel28, java.awt.BorderLayout.PAGE_START);

        jPanel29.setPreferredSize(new java.awt.Dimension(0, 30));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel27.add(jPanel29, java.awt.BorderLayout.PAGE_END);

        txtAoellidos.setFont(new java.awt.Font("Orbitron", 1, 14)); // NOI18N
        txtAoellidos.setPreferredSize(new java.awt.Dimension(55, 30));
        txtAoellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAoellidosActionPerformed(evt);
            }
        });
        jPanel27.add(txtAoellidos, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        jPanel27.add(jPanel6, java.awt.BorderLayout.LINE_END);

        jPanel26.add(jPanel27, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel26);

        jPanel18.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Orbitron", 1, 14)); // NOI18N
        jLabel4.setText("         Grado");
        jLabel4.setPreferredSize(new java.awt.Dimension(150, 15));
        jPanel18.add(jLabel4, java.awt.BorderLayout.LINE_START);

        jPanel19.setLayout(new java.awt.BorderLayout());

        jPanel20.setPreferredSize(new java.awt.Dimension(532, 30));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel19.add(jPanel20, java.awt.BorderLayout.PAGE_START);

        jPanel21.setPreferredSize(new java.awt.Dimension(0, 30));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel19.add(jPanel21, java.awt.BorderLayout.PAGE_END);

        txtGrado.setFont(new java.awt.Font("Orbitron", 1, 14)); // NOI18N
        txtGrado.setPreferredSize(new java.awt.Dimension(55, 30));
        jPanel19.add(txtGrado, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        jPanel19.add(jPanel7, java.awt.BorderLayout.LINE_END);

        jPanel18.add(jPanel19, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel18);

        jPanel14.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Orbitron", 1, 14)); // NOI18N
        jLabel3.setText("        Edad");
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 15));
        jPanel14.add(jLabel3, java.awt.BorderLayout.LINE_START);

        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel16.setPreferredSize(new java.awt.Dimension(532, 30));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel16, java.awt.BorderLayout.PAGE_START);

        jPanel17.setPreferredSize(new java.awt.Dimension(0, 30));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel17, java.awt.BorderLayout.PAGE_END);

        txtEdad.setFont(new java.awt.Font("Orbitron", 1, 14)); // NOI18N
        txtEdad.setPreferredSize(new java.awt.Dimension(55, 30));
        jPanel15.add(txtEdad, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel8, java.awt.BorderLayout.LINE_END);

        jPanel14.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel14);

        jPanel10.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Orbitron", 1, 14)); // NOI18N
        jLabel2.setText("         Correo");
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 15));
        jPanel10.add(jLabel2, java.awt.BorderLayout.LINE_START);

        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel13.setPreferredSize(new java.awt.Dimension(532, 30));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel13, java.awt.BorderLayout.PAGE_START);

        jPanel12.setPreferredSize(new java.awt.Dimension(0, 30));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel12, java.awt.BorderLayout.PAGE_END);

        txtCorreo.setFont(new java.awt.Font("Orbitron", 1, 14)); // NOI18N
        txtCorreo.setPreferredSize(new java.awt.Dimension(55, 30));
        jPanel11.add(txtCorreo, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel30, java.awt.BorderLayout.LINE_END);

        jPanel10.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel10);

        jPanel9.setLayout(new java.awt.GridLayout(1, 2));
        jPanel9.add(jButton1);

        jButton2.setFont(new java.awt.Font("Orbitron", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pe/icons/check.png"))); // NOI18N
        jButton2.setText("Matricular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton2);

        jPanel1.add(jPanel9);

        rootPanel.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(rootPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void switchModoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchModoMouseClicked
        
        int valor = (switchModo.isSelected())? 1:0;
        switch (valor){
            case 0:
                modOsc();
                break;
            case 1:
                modCla();
                break;
       
        } 
                
    }//GEN-LAST:event_switchModoMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Nombre nombre = new Nombre(txtNombre.getText());
        Nombre apellidos = new Nombre(txtAoellidos.getText());
        Correo correo = new Correo(txtCorreo.getText());
        String [] dato = new String [3];
        String mensaje ="";
        if (nombre.Validar()) {
            dato[0] = nombre.getNombre();
        }else{
            mensaje+="nombre inv??lido\n";
        }
        if (apellidos.Validar()){
            dato[1] = apellidos.getNombre();
        }else{
            mensaje+="apellido inv??lido\n";
            
        }
        if (correo.Validar()){
            dato[2] = correo.getCorreo();
        }else{
            mensaje+="correo inv??lido\n";
        }
        if (mensaje.isEmpty()){
            
            System.out.println("No hay errores");
            datos.add(dato);
        }else{
            JOptionPane.showMessageDialog(this, mensaje);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtAoellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAoellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAoellidosActionPerformed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JToggleButton switchModo;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtAoellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtGrado;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
