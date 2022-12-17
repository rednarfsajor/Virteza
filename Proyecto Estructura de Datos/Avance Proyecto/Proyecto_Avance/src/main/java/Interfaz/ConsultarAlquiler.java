
package Interfaz;
import Clases.*;
import java.util.*;

public class ConsultarAlquiler extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarAlquiler
     */
    public ConsultarAlquiler() {
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

        TYPE = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        EXIT = new javax.swing.JButton();
        ALL = new javax.swing.JRadioButton();
        P = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RESULT = new javax.swing.JTextArea();
        TXTID = new javax.swing.JTextField();
        SEARCH = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        EXIT.setText("Atrás");
        EXIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EXITMouseClicked(evt);
            }
        });

        TYPE.add(ALL);
        ALL.setText("Todos");
        ALL.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ALLStateChanged(evt);
            }
        });

        TYPE.add(P);
        P.setText("Pendientes");
        P.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PStateChanged(evt);
            }
        });

        RESULT.setColumns(20);
        RESULT.setRows(5);
        jScrollPane1.setViewportView(RESULT);

        SEARCH.setText("Buscar");
        SEARCH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SEARCHMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EXIT)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(P)
                        .addGap(70, 70, 70)
                        .addComponent(TXTID, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SEARCH))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ALL)
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(ALL)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TXTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SEARCH))
                    .addComponent(P))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void EXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITMouseClicked
        MenuAlquileres menu = new MenuAlquileres();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_EXITMouseClicked

    private void ALLStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ALLStateChanged
        if(ALL.isSelected()){
            String datos=General.Alquileres_Registrados.mostrar();
            RESULT.setText(datos);
        }
    }//GEN-LAST:event_ALLStateChanged

    private void PStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PStateChanged
       if(P.isSelected()){
            String datos=General.Alquileres_P.mostrar();
            RESULT.setText(datos);
        }
    }//GEN-LAST:event_PStateChanged

    private void SEARCHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SEARCHMouseClicked
        ALL.setSelected(false);
         P.setSelected(false);
         Alquiler a=General.Alquileres_Registrados.buscar(TXTID.getText()).getPrestamo();
         String datos="";
         datos+="\nID: ["+a.getID()+"]\n"
                        +"Cliente: [" + a.getPersona().getNombre_Completo() +"]\n"
                        +"Vehiculo: [" + a.getCarro().getPlaca()+"]\n"
                        +"Días de Alquiler: ["+a.getDias()+"]\n"
                        +"Estado de Alquiler:  "+ a.getEstado()+"]\n"
                        +"Precio a Paga: ["+a.getMonto()+"]\n";
         RESULT.setText(datos);
    }//GEN-LAST:event_SEARCHMouseClicked

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
            java.util.logging.Logger.getLogger(ConsultarAlquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarAlquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarAlquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarAlquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarAlquiler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ALL;
    private javax.swing.JButton EXIT;
    private javax.swing.JRadioButton P;
    private javax.swing.JTextArea RESULT;
    private javax.swing.JButton SEARCH;
    private javax.swing.JTextField TXTID;
    private javax.swing.ButtonGroup TYPE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
