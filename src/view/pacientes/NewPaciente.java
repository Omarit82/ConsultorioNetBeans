package view;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import objetos.Institucion;
import objetos.Paciente;

public class NewPaciente extends javax.swing.JPanel {

    private Institucion inst;
    
    public NewPaciente(Institucion inst) {
        setOpaque(false);
        initComponents();
        this.inst = inst;
       
       
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        fieldLastName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        newId = new javax.swing.JTextField();
        newAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        newSocial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        newSessions = new javax.swing.JTextField();
        backNewPac = new javax.swing.JButton();
        newPacienteCrear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        newTel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(null);

        fieldName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldName.addActionListener(this::fieldNameActionPerformed);

        jLabel1.setText("NOMBRE");

        fieldLastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldLastName.addActionListener(this::fieldLastNameActionPerformed);

        jLabel2.setText("APELLIDO");

        jLabel3.setText("ID");

        newId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newId.addActionListener(this::newIdActionPerformed);

        newAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newAddress.setToolTipText("");
        newAddress.addActionListener(this::newAddressActionPerformed);

        jLabel4.setText("DIRECCION");

        newSocial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newSocial.addActionListener(this::newSocialActionPerformed);

        jLabel5.setText("OBRA SOCIAL");

        newSessions.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newSessions.addActionListener(this::newSessionsActionPerformed);

        backNewPac.setBackground(new java.awt.Color(0, 51, 153));
        backNewPac.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        backNewPac.setForeground(new java.awt.Color(255, 255, 255));
        backNewPac.setText("Atras");
        backNewPac.setToolTipText("");
        backNewPac.addActionListener(this::backNewPacActionPerformed);

        newPacienteCrear.setBackground(new java.awt.Color(203, 0, 0));
        newPacienteCrear.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        newPacienteCrear.setForeground(new java.awt.Color(255, 255, 255));
        newPacienteCrear.setText("Crear");
        newPacienteCrear.addActionListener(this::newPacienteCrearActionPerformed);

        jLabel7.setText("TELEFONO");

        newTel.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setText("SESIONES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(newSessions, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(newId, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                .addComponent(fieldLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                .addComponent(fieldName, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                .addComponent(newAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                .addComponent(newSocial, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                .addComponent(newTel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(newPacienteCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(319, 319, 319)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(315, 315, 315)
                                .addComponent(jLabel2)))
                        .addGap(0, 244, Short.MAX_VALUE)))
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(backNewPac, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(newAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(newPacienteCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(backNewPac, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(newSessions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fieldLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldLastNameActionPerformed
        
    }//GEN-LAST:event_fieldLastNameActionPerformed

    private void fieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNameActionPerformed
       
    }//GEN-LAST:event_fieldNameActionPerformed

    private void backNewPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backNewPacActionPerformed
        // TODO add your handling code here:
        MainFrame main = (MainFrame) SwingUtilities.getWindowAncestor(this);
        main.mostrarPanel(new PacientesMenu(inst));
    }//GEN-LAST:event_backNewPacActionPerformed

    private void newPacienteCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPacienteCrearActionPerformed
        try{
            if(fieldName.getText().isEmpty()||fieldLastName.getText().isEmpty()||newId.getText().isEmpty()||newAddress.getText().isEmpty()
                ||newTel.getText().isEmpty()||newSocial.getText().isEmpty()||newSessions.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Campos incompletos","Error",0);
            }
            Paciente paciente = new Paciente(newId.getText(),
                    fieldName.getText(),fieldLastName.getText(),newAddress.getText(),
                    Integer.parseInt(newTel.getText()),
                    newSocial.getText(),Integer.parseInt(newSessions.getText()),false);
            inst.agregarPaciente(paciente);
            JOptionPane.showMessageDialog(null,"Paciente Cargado","Success",1);
            MainFrame main = (MainFrame) SwingUtilities.getWindowAncestor(this);
            main.mostrarPanel(new PanelMenu(inst));
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
       
    }//GEN-LAST:event_newPacienteCrearActionPerformed

    private void newIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newIdActionPerformed
        
    }//GEN-LAST:event_newIdActionPerformed

    private void newAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAddressActionPerformed
        
    }//GEN-LAST:event_newAddressActionPerformed

    private void newSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newSocialActionPerformed
       
    }//GEN-LAST:event_newSocialActionPerformed

    private void newSessionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newSessionsActionPerformed
       
    }//GEN-LAST:event_newSessionsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backNewPac;
    private javax.swing.JTextField fieldLastName;
    private javax.swing.JTextField fieldName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField newAddress;
    private javax.swing.JTextField newId;
    private javax.swing.JButton newPacienteCrear;
    private javax.swing.JTextField newSessions;
    private javax.swing.JTextField newSocial;
    private javax.swing.JTextField newTel;
    // End of variables declaration//GEN-END:variables
}
