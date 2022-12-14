
package Interfaz;
import Clases.*;
import javax.swing.*;

public class Devolucion extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarAlquiler
     */
    public Devolucion() {
        initComponents();
    }
    private Alquiler Prestamo;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        EXIT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXTCED = new javax.swing.JTextField();
        TXTCAR = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        RESULT = new javax.swing.JTextArea();
        DEVOLUTION = new javax.swing.JButton();
        ENTER = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        EXIT.setText("Atrás");
        EXIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EXITMouseClicked(evt);
            }
        });
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Cedula del cliente:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Placa de vehiculo:");

        TXTCED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTCEDActionPerformed(evt);
            }
        });

        TXTCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTCARActionPerformed(evt);
            }
        });

        RESULT.setColumns(20);
        RESULT.setRows(5);
        jScrollPane1.setViewportView(RESULT);

        DEVOLUTION.setText("Devolucion");
        DEVOLUTION.setEnabled(false);
        DEVOLUTION.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEVOLUTIONMouseClicked(evt);
            }
        });
        DEVOLUTION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEVOLUTIONActionPerformed(evt);
            }
        });

        ENTER.setText("Ingresar");
        ENTER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ENTERMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(EXIT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DEVOLUTION))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXTCED, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 95, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(ENTER)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TXTCED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TXTCAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(ENTER)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DEVOLUTION)
                    .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITMouseClicked
        MenuPrincipal menu = new MenuPrincipal();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_EXITMouseClicked

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EXITActionPerformed

    private void TXTCEDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTCEDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTCEDActionPerformed

    private void TXTCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTCARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTCARActionPerformed

    private void DEVOLUTIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEVOLUTIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEVOLUTIONActionPerformed

    private void ENTERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ENTERMouseClicked
        Prestamo=General.Alquileres_Registrados.devolucion(Integer.parseInt(TXTCED.getText()), TXTCAR.getText());
        if(Prestamo!=null){
             String datos="";
             datos+="\nID: ["+Prestamo.getID()+"]\n"
                            +"Cliente: [" + Prestamo.getPersona().getNombre_Completo() +"]\n"
                            +"Vehiculo: [" + Prestamo.getCarro().getPlaca()+"]\n"
                            +"Días de Alquiler: ["+Prestamo.getDias()+"]\n"
                            +"Estado de Alquiler:  "+ Prestamo.getEstado()+"]\n"
                            +"Precio a Paga: ["+Prestamo.getMonto()+"]\n";
             RESULT.setText(datos);
             DEVOLUTION.setEnabled(true);
        }
        else{
            RESULT.setText("No se hallaron alquileres procesados");
            DEVOLUTION.setEnabled(false);
        }
           
    }//GEN-LAST:event_ENTERMouseClicked

    private void DEVOLUTIONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEVOLUTIONMouseClicked
        if(DEVOLUTION.isEnabled()){
        Vehiculo carro=Prestamo.getCarro();
        carro.setStatus("DISPONIBLE");
        General.Vehiculos_Registrados.eliminar(carro);
        General.Vehiculos_Registrados.insertar(carro);
        General.Alquileres_Registrados.modificar(Prestamo.getID(), "FINALIZADO");
        JOptionPane.showMessageDialog(null, "Alquiler " + Prestamo.getID() + "Finalizado. \n Devolución exitosa");
        MenuPrincipal ventana = new MenuPrincipal();
        ventana.setVisible(true);
        this.setVisible(false);
        }
        
    }//GEN-LAST:event_DEVOLUTIONMouseClicked
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
            java.util.logging.Logger.getLogger(Devolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Devolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Devolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Devolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Devolucion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DEVOLUTION;
    private javax.swing.JButton ENTER;
    private javax.swing.JButton EXIT;
    private javax.swing.JTextArea RESULT;
    private javax.swing.JTextField TXTCAR;
    private javax.swing.JTextField TXTCED;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
