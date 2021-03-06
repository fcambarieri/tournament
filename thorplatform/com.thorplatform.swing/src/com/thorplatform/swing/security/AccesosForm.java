/*
 * AccesosForm.java
 *
 * Created on 29 de mayo de 2008, 19:56
 */

package com.thorplatform.swing.security;

/**
 *
 * @author  fernando
 */
public class AccesosForm extends javax.swing.JPanel {

    /** Creates new form AccesosForm */
    public AccesosForm() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        pnlCentral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblPerfilUsuario = new javax.swing.JLabel();
        txtPermiso = new javax.swing.JTextField();
        txtPerfil = new javax.swing.JTextField();
        pnlAccesos = new javax.swing.JPanel();
        chkAlta = new javax.swing.JCheckBox();
        chkBaja = new javax.swing.JCheckBox();
        chkModificacion = new javax.swing.JCheckBox();
        chkConsulta = new javax.swing.JCheckBox();
        lblMessage = new javax.swing.JLabel();

        btnCancelar.setText(org.openide.util.NbBundle.getMessage(AccesosForm.class, "AccesosForm.btnCancelar.text")); // NOI18N

        btnAceptar.setText(org.openide.util.NbBundle.getMessage(AccesosForm.class, "AccesosForm.btnAceptar.text")); // NOI18N

        pnlCentral.setBorder(javax.swing.BorderFactory.createTitledBorder(null, org.openide.util.NbBundle.getMessage(AccesosForm.class, "AccesosForm.pnlCentral.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans", 1, 13), java.awt.SystemColor.activeCaption)); // NOI18N

        jLabel1.setText(org.openide.util.NbBundle.getMessage(AccesosForm.class, "AccesosForm.jLabel1.text")); // NOI18N

        lblPerfilUsuario.setText(org.openide.util.NbBundle.getMessage(AccesosForm.class, "AccesosForm.lblPerfilUsuario.text")); // NOI18N

        txtPermiso.setText(org.openide.util.NbBundle.getMessage(AccesosForm.class, "AccesosForm.txtPermiso.text")); // NOI18N

        txtPerfil.setText(org.openide.util.NbBundle.getMessage(AccesosForm.class, "AccesosForm.txtPerfil.text")); // NOI18N

        pnlAccesos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, org.openide.util.NbBundle.getMessage(AccesosForm.class, "AccesosForm.pnlAccesos.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans", 1, 13), java.awt.SystemColor.activeCaption)); // NOI18N

        chkAlta.setText(org.openide.util.NbBundle.getMessage(AccesosForm.class, "AccesosForm.chkAlta.text")); // NOI18N

        chkBaja.setText(org.openide.util.NbBundle.getMessage(AccesosForm.class, "AccesosForm.chkBaja.text")); // NOI18N

        chkModificacion.setText(org.openide.util.NbBundle.getMessage(AccesosForm.class, "AccesosForm.chkModificacion.text")); // NOI18N

        chkConsulta.setText(org.openide.util.NbBundle.getMessage(AccesosForm.class, "AccesosForm.chkConsulta.text")); // NOI18N

        javax.swing.GroupLayout pnlAccesosLayout = new javax.swing.GroupLayout(pnlAccesos);
        pnlAccesos.setLayout(pnlAccesosLayout);
        pnlAccesosLayout.setHorizontalGroup(
            pnlAccesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccesosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkAlta)
                .addGap(48, 48, 48)
                .addComponent(chkBaja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(chkModificacion)
                .addGap(41, 41, 41)
                .addComponent(chkConsulta)
                .addGap(51, 51, 51))
        );
        pnlAccesosLayout.setVerticalGroup(
            pnlAccesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccesosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAccesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAlta)
                    .addComponent(chkConsulta)
                    .addComponent(chkModificacion)
                    .addComponent(chkBaja))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlCentralLayout = new javax.swing.GroupLayout(pnlCentral);
        pnlCentral.setLayout(pnlCentralLayout);
        pnlCentralLayout.setHorizontalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAccesos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblPerfilUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPermiso, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                            .addComponent(txtPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlCentralLayout.setVerticalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPermiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerfilUsuario)
                    .addComponent(txtPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlAccesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblMessage.setText(org.openide.util.NbBundle.getMessage(AccesosForm.class, "AccesosForm.lblMessage.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAceptar, btnCancelar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMessage)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptar;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JCheckBox chkAlta;
    public javax.swing.JCheckBox chkBaja;
    public javax.swing.JCheckBox chkConsulta;
    public javax.swing.JCheckBox chkModificacion;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel lblMessage;
    public javax.swing.JLabel lblPerfilUsuario;
    public javax.swing.JPanel pnlAccesos;
    public javax.swing.JPanel pnlCentral;
    public javax.swing.JTextField txtPerfil;
    public javax.swing.JTextField txtPermiso;
    // End of variables declaration//GEN-END:variables

}
