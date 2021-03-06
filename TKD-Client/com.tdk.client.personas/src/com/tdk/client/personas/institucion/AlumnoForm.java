/*
 * AlumnoForm.java
 *
 * Created on 8 de agosto de 2008, 19:05
 */

package com.tdk.client.personas.institucion;

/**
 *
 * @author  fernando
 */
public class AlumnoForm extends javax.swing.JPanel {

    /** Creates new form AlumnoForm */
    public AlumnoForm() {
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

        pnlAlumno = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPersona = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtInstitucion = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();

        pnlAlumno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, org.openide.util.NbBundle.getMessage(AlumnoForm.class, "AlumnoForm.pnlAlumno.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans", 1, 13), java.awt.SystemColor.activeCaption)); // NOI18N

        jLabel1.setText(org.openide.util.NbBundle.getMessage(AlumnoForm.class, "AlumnoForm.jLabel1.text")); // NOI18N

        txtPersona.setText(org.openide.util.NbBundle.getMessage(AlumnoForm.class, "AlumnoForm.txtPersona.text")); // NOI18N

        jLabel2.setText(org.openide.util.NbBundle.getMessage(AlumnoForm.class, "AlumnoForm.jLabel2.text")); // NOI18N

        txtInstitucion.setText(org.openide.util.NbBundle.getMessage(AlumnoForm.class, "AlumnoForm.txtInstitucion.text")); // NOI18N

        javax.swing.GroupLayout pnlAlumnoLayout = new javax.swing.GroupLayout(pnlAlumno);
        pnlAlumno.setLayout(pnlAlumnoLayout);
        pnlAlumnoLayout.setHorizontalGroup(
            pnlAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInstitucion, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addComponent(txtPersona, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlAlumnoLayout.setVerticalGroup(
            pnlAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlumnoLayout.createSequentialGroup()
                .addGroup(pnlAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelar.setText(org.openide.util.NbBundle.getMessage(AlumnoForm.class, "AlumnoForm.btnCancelar.text")); // NOI18N

        btnAceptar.setText(org.openide.util.NbBundle.getMessage(AlumnoForm.class, "AlumnoForm.btnAceptar.text")); // NOI18N

        lblMessage.setText(org.openide.util.NbBundle.getMessage(AlumnoForm.class, "AlumnoForm.lblMessage.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlAlumno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAceptar, btnCancelar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar)
                    .addComponent(lblMessage))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptar;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel lblMessage;
    public javax.swing.JPanel pnlAlumno;
    public javax.swing.JTextField txtInstitucion;
    public javax.swing.JTextField txtPersona;
    // End of variables declaration//GEN-END:variables

}
