/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package A;

/**
 *
 * @author Rednarf
 */
public class Soda_Fide_Inicio extends javax.swing.JFrame {

    /**
     * Creates new form S
     */
    public Soda_Fide_Inicio() {
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

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        END = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        Lavar = new javax.swing.JButton();
        VerO = new javax.swing.JButton();
        VerP = new javax.swing.JButton();
        Atender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setName(""); // NOI18N
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 204, 204));
        Titulo.setText("SODA FIDE");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        END.setBackground(new java.awt.Color(255, 255, 0));
        END.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        END.setForeground(new java.awt.Color(0, 0, 0));
        END.setText("SALIR");
        END.setName(""); // NOI18N
        END.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ENDMouseClicked(evt);
            }
        });
        END.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENDActionPerformed(evt);
            }
        });
        jPanel1.add(END, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, -1, -1));

        Agregar.setBackground(new java.awt.Color(255, 255, 0));
        Agregar.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        Agregar.setForeground(new java.awt.Color(0, 0, 0));
        Agregar.setText("AGREGAR ORDEN");
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarMouseClicked(evt);
            }
        });
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        jPanel1.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        Lavar.setBackground(new java.awt.Color(255, 255, 0));
        Lavar.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        Lavar.setForeground(new java.awt.Color(0, 0, 0));
        Lavar.setText("LAVAR PLATOS");
        Lavar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LavarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LavarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LavarMouseExited(evt);
            }
        });
        Lavar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LavarActionPerformed(evt);
            }
        });
        jPanel1.add(Lavar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        VerO.setBackground(new java.awt.Color(255, 255, 0));
        VerO.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        VerO.setForeground(new java.awt.Color(0, 0, 0));
        VerO.setText("VER ORDENES PENDIENTES");
        VerO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerOMouseClicked(evt);
            }
        });
        VerO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerOActionPerformed(evt);
            }
        });
        jPanel1.add(VerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        VerP.setBackground(new java.awt.Color(255, 255, 0));
        VerP.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        VerP.setForeground(new java.awt.Color(0, 0, 0));
        VerP.setText("VER PLATOS PARA LAVAR");
        VerP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerPMouseClicked(evt);
            }
        });
        VerP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerPActionPerformed(evt);
            }
        });
        jPanel1.add(VerP, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        Atender.setBackground(new java.awt.Color(255, 255, 0));
        Atender.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        Atender.setForeground(new java.awt.Color(0, 0, 0));
        Atender.setText("ATENDER ORDEN");
        Atender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtenderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AtenderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AtenderMouseExited(evt);
            }
        });
        Atender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtenderActionPerformed(evt);
            }
        });
        jPanel1.add(Atender, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ENDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENDActionPerformed
        
    }//GEN-LAST:event_ENDActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarActionPerformed

    private void LavarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LavarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LavarActionPerformed

    private void VerOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerOActionPerformed

    private void VerPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerPActionPerformed

    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked
        
        Ingresar_Orden abrir=new Ingresar_Orden();
        
        abrir.setVisible(true);
    }//GEN-LAST:event_AgregarMouseClicked

    private void ENDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ENDMouseClicked
       System.exit(0);
    }//GEN-LAST:event_ENDMouseClicked

    private void VerOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerOMouseClicked
        Ordenes_P abrir = new Ordenes_P();
        abrir.setVisible(true);
        
        abrir.setOrdenes(General.Ordenes.Mostrar());
    }//GEN-LAST:event_VerOMouseClicked

    private void VerPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerPMouseClicked
        Platos_P abrir = new Platos_P();
        abrir.setVisible(true);
        
        abrir.setPlatos(General.Platos.Mostrar());
    }//GEN-LAST:event_VerPMouseClicked

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
       
    }//GEN-LAST:event_formFocusGained

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained
        
    }//GEN-LAST:event_jPanel1FocusGained

    private void LavarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LavarMouseClicked
       if(General.Platos.getTop()!=null){
        Plato_Lavado abrir=new Plato_Lavado();
        
        abrir.setVisible(true);
        abrir.setPlato(String.valueOf(General.Platos.LavarPlato().getValue2().getID()));
       }
    }//GEN-LAST:event_LavarMouseClicked

    private void AtenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtenderMouseClicked
         if(General.Ordenes.getHead()!=null){
        Orden_Atendida abrir=new Orden_Atendida();
        
        abrir.setVisible(true);
        abrir.setOrden(General.Ordenes.AtenderOrder().getValue().getCliente());
        
         }
    }//GEN-LAST:event_AtenderMouseClicked

    private void AtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AtenderActionPerformed

    private void AtenderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtenderMouseEntered
        if(General.Ordenes.getHead()!=null){
            Atender.setEnabled(true);
        }
        else{
            Atender.setEnabled(false);
        }
    }//GEN-LAST:event_AtenderMouseEntered

    private void AtenderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtenderMouseExited
       if(General.Ordenes.getHead()!=null){
            Atender.setEnabled(true);
        }
        else{
            Atender.setEnabled(false);
        }
    }//GEN-LAST:event_AtenderMouseExited

    private void LavarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LavarMouseEntered
         if(General.Platos.getTop()!=null){
            Lavar.setEnabled(true);
        }
        else{
            Lavar.setEnabled(false);
        }
    }//GEN-LAST:event_LavarMouseEntered

    private void LavarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LavarMouseExited
         if(General.Platos.getTop()!=null){
            Lavar.setEnabled(true);
        }
        else{
            Lavar.setEnabled(false);
        }
    }//GEN-LAST:event_LavarMouseExited

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
            java.util.logging.Logger.getLogger(Soda_Fide_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Soda_Fide_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Soda_Fide_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Soda_Fide_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Soda_Fide_Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Atender;
    private javax.swing.JButton END;
    private javax.swing.JButton Lavar;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton VerO;
    private javax.swing.JButton VerP;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
