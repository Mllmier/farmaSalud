/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package farmasalud.view;

import java.awt.Color;

/**
 *
 * @author usuario
 */
public class admin extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    public admin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Panel_inicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Panel_gestionDoc = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Panel_gestionRecepcionista = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Panel_gestionSalas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Panel_salir = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Paneles = new javax.swing.JTabbedPane();
        Inicio = new javax.swing.JPanel();
        Gestionar_doc = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        Gestionar_recep = new javax.swing.JPanel();
        Gestionar_salas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(10, 92, 184));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_inicio.setBackground(new java.awt.Color(10, 92, 184));
        Panel_inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_inicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_inicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_inicioMouseExited(evt);
            }
        });
        Panel_inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INICIO");
        Panel_inicio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 65, 56));

        jPanel1.add(Panel_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 280, 80));

        Panel_gestionDoc.setBackground(new java.awt.Color(10, 92, 184));
        Panel_gestionDoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_gestionDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_gestionDocMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_gestionDocMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_gestionDocMouseExited(evt);
            }
        });
        Panel_gestionDoc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GESTION DOCTORES");
        Panel_gestionDoc.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 187, 57));

        jPanel1.add(Panel_gestionDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 280, 90));

        Panel_gestionRecepcionista.setBackground(new java.awt.Color(10, 92, 184));
        Panel_gestionRecepcionista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_gestionRecepcionista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_gestionRecepcionistaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_gestionRecepcionistaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_gestionRecepcionistaMouseExited(evt);
            }
        });
        Panel_gestionRecepcionista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("GESTION RECEPCIONISTAS");
        Panel_gestionRecepcionista.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 240, 57));

        jPanel1.add(Panel_gestionRecepcionista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 280, 100));

        Panel_gestionSalas.setBackground(new java.awt.Color(10, 92, 184));
        Panel_gestionSalas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_gestionSalas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_gestionSalasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_gestionSalasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_gestionSalasMouseExited(evt);
            }
        });
        Panel_gestionSalas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(10, 92, 184));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GESTION SALAS");
        Panel_gestionSalas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, 57));

        jPanel1.add(Panel_gestionSalas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 280, 100));

        Panel_salir.setBackground(new java.awt.Color(10, 92, 184));
        Panel_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_salirMouseExited(evt);
            }
        });
        Panel_salir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(10, 92, 184));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SALIR");
        Panel_salir.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, 57));

        jPanel1.add(Panel_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 280, 110));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 770));

        jPanel3.setBackground(new java.awt.Color(10, 92, 184));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1060, -1));

        javax.swing.GroupLayout InicioLayout = new javax.swing.GroupLayout(Inicio);
        Inicio.setLayout(InicioLayout);
        InicioLayout.setHorizontalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        InicioLayout.setVerticalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );

        Paneles.addTab("INICIO", Inicio);

        Gestionar_doc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "FORMULARIO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("ESPECIALIDAD:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 90, 30));

        jLabel7.setText("NOMBRE:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 30));

        jLabel8.setText("APELLIDO:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 60, 30));

        jLabel9.setText("TELEFONO:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 60, 30));

        jLabel10.setText("NO. CEDULA:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 80, 30));

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 230, -1));

        jTextField2.setText("jTextField1");
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 230, -1));

        jTextField3.setText("jTextField1");
        jPanel4.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 230, -1));

        jTextField4.setText("jTextField1");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 230, -1));

        jTextField5.setText("jTextField1");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 230, -1));

        Gestionar_doc.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 365, 340));

        Paneles.addTab("GESTIONAR_DOC", Gestionar_doc);

        javax.swing.GroupLayout Gestionar_recepLayout = new javax.swing.GroupLayout(Gestionar_recep);
        Gestionar_recep.setLayout(Gestionar_recepLayout);
        Gestionar_recepLayout.setHorizontalGroup(
            Gestionar_recepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        Gestionar_recepLayout.setVerticalGroup(
            Gestionar_recepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );

        Paneles.addTab("GESTIONAR_RECEP", Gestionar_recep);

        Gestionar_salas.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Gestionar_salasLayout = new javax.swing.GroupLayout(Gestionar_salas);
        Gestionar_salas.setLayout(Gestionar_salasLayout);
        Gestionar_salasLayout.setHorizontalGroup(
            Gestionar_salasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        Gestionar_salasLayout.setVerticalGroup(
            Gestionar_salasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );

        Paneles.addTab("GESTIONAR_SALAS", Gestionar_salas);

        jPanel2.add(Paneles, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 1020, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Panel_inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_inicioMouseClicked
    Paneles.setSelectedIndex(0);           
    }//GEN-LAST:event_Panel_inicioMouseClicked

    private void Panel_gestionDocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_gestionDocMouseClicked
    Paneles.setSelectedIndex(1);  
    }//GEN-LAST:event_Panel_gestionDocMouseClicked

    private void Panel_gestionRecepcionistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_gestionRecepcionistaMouseClicked
    Paneles.setSelectedIndex(2);  
    }//GEN-LAST:event_Panel_gestionRecepcionistaMouseClicked

    private void Panel_gestionSalasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_gestionSalasMouseClicked
    Paneles.setSelectedIndex(3);  
    }//GEN-LAST:event_Panel_gestionSalasMouseClicked

    private void Panel_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_salirMouseClicked
 
    }//GEN-LAST:event_Panel_salirMouseClicked

    private void Panel_inicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_inicioMouseEntered
    Panel_inicio.setBackground(new Color(52,152,219));
    }//GEN-LAST:event_Panel_inicioMouseEntered

    private void Panel_gestionDocMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_gestionDocMouseEntered
    Panel_gestionDoc.setBackground(new Color(52,152,219));
    }//GEN-LAST:event_Panel_gestionDocMouseEntered

    private void Panel_gestionRecepcionistaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_gestionRecepcionistaMouseEntered
    Panel_gestionRecepcionista.setBackground(new Color(52,152,219));
    }//GEN-LAST:event_Panel_gestionRecepcionistaMouseEntered

    private void Panel_gestionSalasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_gestionSalasMouseEntered
    Panel_gestionSalas.setBackground(new Color(52,152,219));
    }//GEN-LAST:event_Panel_gestionSalasMouseEntered

    private void Panel_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_salirMouseEntered
    Panel_salir.setBackground(new Color(52,152,219));
    }//GEN-LAST:event_Panel_salirMouseEntered

    private void Panel_inicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_inicioMouseExited
    Panel_inicio.setBackground(new Color(10,92,184));
    }//GEN-LAST:event_Panel_inicioMouseExited

    private void Panel_gestionDocMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_gestionDocMouseExited
    Panel_gestionDoc.setBackground(new Color(10,92,184));
    }//GEN-LAST:event_Panel_gestionDocMouseExited

    private void Panel_gestionRecepcionistaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_gestionRecepcionistaMouseExited
    Panel_gestionRecepcionista.setBackground(new Color(10,92,184));
    }//GEN-LAST:event_Panel_gestionRecepcionistaMouseExited

    private void Panel_gestionSalasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_gestionSalasMouseExited
    Panel_gestionSalas.setBackground(new Color(10,92,184));
    }//GEN-LAST:event_Panel_gestionSalasMouseExited

    private void Panel_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_salirMouseExited
    Panel_salir.setBackground(new Color(10,92,184));
    }//GEN-LAST:event_Panel_salirMouseExited

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Gestionar_doc;
    private javax.swing.JPanel Gestionar_recep;
    private javax.swing.JPanel Gestionar_salas;
    private javax.swing.JPanel Inicio;
    private javax.swing.JPanel Panel_gestionDoc;
    private javax.swing.JPanel Panel_gestionRecepcionista;
    private javax.swing.JPanel Panel_gestionSalas;
    private javax.swing.JPanel Panel_inicio;
    private javax.swing.JPanel Panel_salir;
    private javax.swing.JTabbedPane Paneles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
