
package Interfaz;
import Clases.*;
import javax.swing.*;

public class Generar_Alquiler extends javax.swing.JFrame {

    /**
     * Creates new form Generar_Alquiler
     */
    public Generar_Alquiler() {
        initComponents();
    }
    private Vehiculo Carro;
    private Cliente Persona;
    
    public void setVehiculo(Vehiculo carro){
        Carro=carro;
        CAR.setText(Carro.getPlaca());
    }
    public void setPersona(Cliente persona){
        Persona=persona;
        CLIENT.setText(persona.getNombre_Completo());
    }
    private void reset(){
        Persona=null;   Carro=null;
        CLIENT.setText("[Seleccione cliente]");
        CAR.setText("[Seleccione vehiculo]");
        TIME.setText(""); TIME.setEnabled(false); TIME.setEditable(false);
        MONEY.setText(""); 
        GENERATE.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SCREEN = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CLIENT = new javax.swing.JTextField();
        CAR = new javax.swing.JTextField();
        TIME = new javax.swing.JTextField();
        MONEY = new javax.swing.JTextField();
        EXIT = new javax.swing.JButton();
        GENERATE = new javax.swing.JButton();
        RESET = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SCREEN.setBackground(new java.awt.Color(0, 153, 153));
        SCREEN.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                SCREENComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Generar Alquiler");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Cliente:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Vehiculo:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Cantidad de días:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Monto:");

        CLIENT.setText("[Seleccione cliente]");
        CLIENT.setEnabled(false);
        CLIENT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CLIENTMouseClicked(evt);
            }
        });
        CLIENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLIENTActionPerformed(evt);
            }
        });

        CAR.setText("[Seleccione vehiculo]");
        CAR.setEnabled(false);
        CAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CARMouseClicked(evt);
            }
        });

        TIME.setEnabled(false);
        TIME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TIMEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TIMEMouseEntered(evt);
            }
        });
        TIME.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TIMEKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TIMEKeyTyped(evt);
            }
        });

        MONEY.setEnabled(false);

        EXIT.setText("Atrás");
        EXIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EXITMouseClicked(evt);
            }
        });

        GENERATE.setText("Generar");
        GENERATE.setEnabled(false);
        GENERATE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GENERATEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GENERATEMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GENERATEMousePressed(evt);
            }
        });

        RESET.setText("Vaciar");
        RESET.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RESETMouseClicked(evt);
            }
        });
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SCREENLayout = new javax.swing.GroupLayout(SCREEN);
        SCREEN.setLayout(SCREENLayout);
        SCREENLayout.setHorizontalGroup(
            SCREENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SCREENLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SCREENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SCREENLayout.createSequentialGroup()
                        .addComponent(EXIT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GENERATE))
                    .addGroup(SCREENLayout.createSequentialGroup()
                        .addGroup(SCREENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SCREENLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CAR, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SCREENLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TIME, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SCREENLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MONEY, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 103, Short.MAX_VALUE))
                    .addGroup(SCREENLayout.createSequentialGroup()
                        .addGroup(SCREENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(SCREENLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RESET)))
                .addContainerGap())
        );
        SCREENLayout.setVerticalGroup(
            SCREENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SCREENLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SCREENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(RESET))
                .addGap(18, 18, 18)
                .addGroup(SCREENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SCREENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SCREENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TIME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SCREENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(MONEY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(SCREENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GENERATE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SCREEN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SCREEN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CARMouseClicked
        if(Carro==null){
            Alquiler_Vehiculo ventana = new Alquiler_Vehiculo();
            ventana.Alquiler=this;
            ventana.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_CARMouseClicked

    private void CLIENTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLIENTMouseClicked
        if(Persona==null){
            Alquiler_Persona ventana = new Alquiler_Persona();
            ventana.Alquiler=this;
            ventana.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_CLIENTMouseClicked

    private void EXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITMouseClicked
        MenuAlquileres menu = new MenuAlquileres();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_EXITMouseClicked

    private void SCREENComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_SCREENComponentShown
    
        
    }//GEN-LAST:event_SCREENComponentShown

    private void TIMEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TIMEKeyTyped
        
    }//GEN-LAST:event_TIMEKeyTyped

    private void TIMEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TIMEKeyReleased
        try{
            int dias;
            dias=Integer.parseInt(TIME.getText());
            if(Carro!=null&&!TIME.getText().isBlank()){
            MONEY.setText(String.valueOf(Carro.getPrecio()*dias));
        }
        }
        catch(NumberFormatException ex){
            TIME.setText("");
            MONEY.setText("");
        }
    }//GEN-LAST:event_TIMEKeyReleased

    private void GENERATEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GENERATEMouseClicked
        if(GENERATE.isEnabled()){
        int dias=Integer.parseInt(TIME.getText());
        double monto=Double.parseDouble(MONEY.getText());
        Alquiler Nuevo = new Alquiler(Persona,Carro,dias,monto);
        
        General.Alquileres_Registrados.Insertar(Nuevo);
        General.Alquileres_P.insertar(Nuevo);
        if(dias>=30||monto>=70000){
             if(Persona.getCategoria().equals("BRONCE")){
                Persona.setCategoria("PLATA");
            }
            if(Persona.getCategoria().equals("PLATA")){
                Persona.setCategoria("ORO");
            }
           if(Persona.getCategoria().equals("ORO")){
                Persona.setCategoria("ZAFIRO");
            }
           
                    
                    
            }
            General.Clientes_Registrados.modificar(Persona);
        reset();
        JOptionPane.showMessageDialog(null, "Alquiler " + Nuevo.getID() + " creado con éxito");
        }
    }//GEN-LAST:event_GENERATEMouseClicked

    private void GENERATEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GENERATEMouseEntered
        if(!CLIENT.getText().isBlank()&&!CAR.getText().isBlank()&&!TIME.getText().isBlank()&&!MONEY.getText().isBlank()){
        GENERATE.setEnabled(true);
    }
        else{
            GENERATE.setEnabled(false);
        }
    }//GEN-LAST:event_GENERATEMouseEntered

    private void GENERATEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GENERATEMousePressed
        
    }//GEN-LAST:event_GENERATEMousePressed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RESETActionPerformed

    private void RESETMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RESETMouseClicked
        reset();
    }//GEN-LAST:event_RESETMouseClicked

    private void CLIENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLIENTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CLIENTActionPerformed

    private void TIMEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TIMEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TIMEMouseClicked

    private void TIMEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TIMEMouseEntered
        if(!CLIENT.getText().isBlank()&&!CAR.getText().isBlank()){
            TIME.setEnabled(true); TIME.setEditable(true);
        }
        else{
            TIME.setEnabled(false); TIME.setEditable(false);
        }
    }//GEN-LAST:event_TIMEMouseEntered

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
            java.util.logging.Logger.getLogger(Generar_Alquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Generar_Alquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Generar_Alquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Generar_Alquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Generar_Alquiler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CAR;
    private javax.swing.JTextField CLIENT;
    private javax.swing.JButton EXIT;
    private javax.swing.JButton GENERATE;
    private javax.swing.JTextField MONEY;
    private javax.swing.JButton RESET;
    private javax.swing.JPanel SCREEN;
    private javax.swing.JTextField TIME;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
