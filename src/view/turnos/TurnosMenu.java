package view.turnos;

import javax.swing.SwingUtilities;
import objetos.Institucion;
import view.MainFrame;
import view.PanelFondo;
import view.PanelMenu;

public class TurnosMenu extends javax.swing.JPanel {
    private Institucion institucion;
    
    public TurnosMenu(Institucion institucion) {
        this.institucion = institucion;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new PanelFondo("/images/fondo.png");
        atras = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        nuevo = new javax.swing.JButton();
        ver = new javax.swing.JButton();
        seleccionar = new javax.swing.JButton();

        jPanel1.setMaximumSize(new java.awt.Dimension(720, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 500));

        atras.setBackground(new java.awt.Color(0, 51, 153));
        atras.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        atras.setForeground(new java.awt.Color(255, 255, 255));
        atras.setText("Atras");
        atras.setToolTipText("");
        atras.setAutoscrolls(true);
        atras.addActionListener(this::atrasActionPerformed);

        titulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Menu Turnos");

        nuevo.setBackground(new java.awt.Color(203, 0, 0));
        nuevo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nuevo.setForeground(new java.awt.Color(255, 255, 255));
        nuevo.setText("Agendar Turno");
        nuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nuevoMousePressed(evt);
            }
        });
        nuevo.addActionListener(this::nuevoActionPerformed);

        ver.setBackground(new java.awt.Color(203, 0, 0));
        ver.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ver.setForeground(new java.awt.Color(255, 255, 255));
        ver.setText("Visualizar Turnos");
        ver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                verMousePressed(evt);
            }
        });
        ver.addActionListener(this::verActionPerformed);

        seleccionar.setBackground(new java.awt.Color(203, 0, 0));
        seleccionar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        seleccionar.setForeground(new java.awt.Color(255, 255, 255));
        seleccionar.setText("Seleccionar Turno");
        seleccionar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        seleccionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                seleccionarMousePressed(evt);
            }
        });
        seleccionar.addActionListener(this::seleccionarActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(275, 275, 275)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ver, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(titulo)
                .addGap(69, 69, 69)
                .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ver, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        MainFrame main = (MainFrame) SwingUtilities.getWindowAncestor(this);
        main.mostrarPanel(new PanelMenu(institucion));
    }//GEN-LAST:event_atrasActionPerformed

    private void nuevoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoMousePressed

    }//GEN-LAST:event_nuevoMousePressed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed

    }//GEN-LAST:event_nuevoActionPerformed

    private void verMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_verMousePressed

    private void verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verActionPerformed

    private void seleccionarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccionarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_seleccionarMousePressed

    private void seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seleccionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton seleccionar;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton ver;
    // End of variables declaration//GEN-END:variables
}
