/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tdk.client.llaves;

import com.thorplatform.swing.SwingControllerFactory;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.util.Lookup;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//com.tdk.client.llaves//TorneoLlaves//EN",
        autostore = false)
@TopComponent.Description(
        preferredID = "TorneoLlavesTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", 
        persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "editor", openAtStartup = false)
@ActionID(category = "Window", id = "com.tdk.client.llaves.TorneoLlavesTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_TorneoLlavesAction",
        preferredID = "TorneoLlavesTopComponent")
@Messages({
    "CTL_TorneoLlavesAction=TorneoLlaves",
    "CTL_TorneoLlavesTopComponent=Llaves del torneo",
    "HINT_TorneoLlavesTopComponent=Llaves del torneo"
})
public final class TorneoLlavesTopComponent extends TopComponent {
    private static TorneoLlavesTopComponent instance = new TorneoLlavesTopComponent();

    public TorneoLlavesTopComponent() {
        initComponents();
        setName(Bundle.CTL_TorneoLlavesTopComponent());
        setToolTipText(Bundle.HINT_TorneoLlavesTopComponent());
        
        SwingControllerFactory scf = Lookup.getDefault().lookup(SwingControllerFactory.class);
        TorneoLlavesController controller = scf.createController(TorneoLlavesController.class);
        add(controller.getForm());

    }
    
    public static TorneoLlavesTopComponent getDefault() {
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }
}
