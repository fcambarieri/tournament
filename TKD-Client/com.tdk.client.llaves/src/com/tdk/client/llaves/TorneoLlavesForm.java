/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tdk.client.llaves;

/**
 *
 * @author sabon
 */
public class TorneoLlavesForm extends javax.swing.JPanel {

    /**
     * Creates new form TorneoLlavesForm
     */
    public TorneoLlavesForm() {
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

        pnlFiltros = new javax.swing.JPanel();
        lblTorneo = new javax.swing.JLabel();
        cboTorneo = new javax.swing.JComboBox();
        cboCategoriaLucha = new javax.swing.JComboBox();
        cboCinturon = new javax.swing.JComboBox();
        cboCategoriaForma = new javax.swing.JComboBox();
        chkCategoriaLucha = new javax.swing.JCheckBox();
        chkCinturon = new javax.swing.JCheckBox();
        chkCategoriaForma = new javax.swing.JCheckBox();
        pnlResultados = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        xtbCompetencias = new org.jdesktop.swingx.JXTreeTable();
        btnCrearLlaves = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        btnSeleccionarTodo = new javax.swing.JButton();
        btnPreVisualizar = new javax.swing.JButton();

        pnlFiltros.setBorder(javax.swing.BorderFactory.createTitledBorder(null, org.openide.util.NbBundle.getMessage(TorneoLlavesForm.class, "TorneoLlavesForm.pnlFiltros.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), java.awt.SystemColor.activeCaption)); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(lblTorneo, org.openide.util.NbBundle.getMessage(TorneoLlavesForm.class, "TorneoLlavesForm.lblTorneo.text")); // NOI18N

        cboTorneo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboCategoriaLucha.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboCinturon.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboCategoriaForma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.openide.awt.Mnemonics.setLocalizedText(chkCategoriaLucha, org.openide.util.NbBundle.getMessage(TorneoLlavesForm.class, "TorneoLlavesForm.chkCategoriaLucha.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(chkCinturon, org.openide.util.NbBundle.getMessage(TorneoLlavesForm.class, "TorneoLlavesForm.chkCinturon.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(chkCategoriaForma, org.openide.util.NbBundle.getMessage(TorneoLlavesForm.class, "TorneoLlavesForm.chkCategoriaForma.text")); // NOI18N

        javax.swing.GroupLayout pnlFiltrosLayout = new javax.swing.GroupLayout(pnlFiltros);
        pnlFiltros.setLayout(pnlFiltrosLayout);
        pnlFiltrosLayout.setHorizontalGroup(
            pnlFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiltrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTorneo)
                    .addComponent(chkCategoriaLucha))
                .addGap(5, 5, 5)
                .addGroup(pnlFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboTorneo, 0, 235, Short.MAX_VALUE)
                    .addComponent(cboCategoriaLucha, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(pnlFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlFiltrosLayout.createSequentialGroup()
                        .addComponent(chkCinturon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboCinturon, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFiltrosLayout.createSequentialGroup()
                        .addComponent(chkCategoriaForma)
                        .addGap(8, 8, 8)
                        .addComponent(cboCategoriaForma, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        pnlFiltrosLayout.setVerticalGroup(
            pnlFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiltrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTorneo)
                    .addComponent(cboTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCinturon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkCinturon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(pnlFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboCategoriaLucha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCategoriaForma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkCategoriaLucha)
                    .addComponent(chkCategoriaForma))
                .addContainerGap())
        );

        pnlResultados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, org.openide.util.NbBundle.getMessage(TorneoLlavesForm.class, "TorneoLlavesForm.pnlResultados.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), java.awt.SystemColor.activeCaption)); // NOI18N

        jScrollPane2.setViewportView(xtbCompetencias);

        javax.swing.GroupLayout pnlResultadosLayout = new javax.swing.GroupLayout(pnlResultados);
        pnlResultados.setLayout(pnlResultadosLayout);
        pnlResultadosLayout.setHorizontalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        pnlResultadosLayout.setVerticalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadosLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addContainerGap())
        );

        org.openide.awt.Mnemonics.setLocalizedText(btnCrearLlaves, org.openide.util.NbBundle.getMessage(TorneoLlavesForm.class, "TorneoLlavesForm.btnCrearLlaves.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(lblMessage, org.openide.util.NbBundle.getMessage(TorneoLlavesForm.class, "TorneoLlavesForm.lblMessage.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(btnSeleccionarTodo, org.openide.util.NbBundle.getMessage(TorneoLlavesForm.class, "TorneoLlavesForm.btnSeleccionarTodo.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(btnPreVisualizar, org.openide.util.NbBundle.getMessage(TorneoLlavesForm.class, "TorneoLlavesForm.btnPreVisualizar.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlResultados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlFiltros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSeleccionarTodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPreVisualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCrearLlaves)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCrearLlaves, btnSeleccionarTodo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCrearLlaves)
                        .addComponent(btnSeleccionarTodo)
                        .addComponent(btnPreVisualizar)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCrearLlaves;
    public javax.swing.JButton btnPreVisualizar;
    public javax.swing.JButton btnSeleccionarTodo;
    public javax.swing.JComboBox cboCategoriaForma;
    public javax.swing.JComboBox cboCategoriaLucha;
    public javax.swing.JComboBox cboCinturon;
    public javax.swing.JComboBox cboTorneo;
    public javax.swing.JCheckBox chkCategoriaForma;
    public javax.swing.JCheckBox chkCategoriaLucha;
    public javax.swing.JCheckBox chkCinturon;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lblMessage;
    public javax.swing.JLabel lblTorneo;
    public javax.swing.JPanel pnlFiltros;
    public javax.swing.JPanel pnlResultados;
    public org.jdesktop.swingx.JXTreeTable xtbCompetencias;
    // End of variables declaration//GEN-END:variables
}
