/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tdk.client.personas;

import com.thorplatform.swing.SwingControllerFactory;
import java.awt.BorderLayout;
import java.io.Serializable;
import java.util.logging.Logger;
import org.openide.util.Lookup;
import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;
import org.openide.util.Utilities;

/**
 * Top component which displays something.
 */
final class PersonasTopComponent extends TopComponent {

    private static PersonasTopComponent instance;
    /** path to the icon used by the component and its open action */
    static final String ICON_PATH = "com/tdk/client/personas/persona-16x16.png";

    private static final String PREFERRED_ID = "PersonasTopComponent";

    private PersonasTopComponent() {
        initComponents();
        afterInitComponents();
        setName(NbBundle.getMessage(PersonasTopComponent.class, "CTL_PersonasTopComponent"));
        setToolTipText(NbBundle.getMessage(PersonasTopComponent.class, "HINT_PersonasTopComponent"));
        setIcon(Utilities.loadImage(ICON_PATH, true));
    }

    private void afterInitComponents() {
        SwingControllerFactory scf = Lookup.getDefault().lookup(SwingControllerFactory.class);
        PersonasController controller = scf.createController(PersonasController.class);
        add(controller.getPanel(), BorderLayout.CENTER);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    /**
     * Gets default instance. Do not use directly: reserved for *.settings files only,
     * i.e. deserialization routines; otherwise you could get a non-deserialized instance.
     * To obtain the singleton instance, use {@link findInstance}.
     */
    public static synchronized PersonasTopComponent getDefault() {
        if (instance == null) {
            instance = new PersonasTopComponent();
        }
        return instance;
    }

    /**
     * Obtain the PersonasTopComponent instance. Never call {@link #getDefault} directly!
     */
    public static synchronized PersonasTopComponent findInstance() {
        TopComponent win = WindowManager.getDefault().findTopComponent(PREFERRED_ID);
        if (win == null) {
            Logger.getLogger(PersonasTopComponent.class.getName()).warning(
                    "Cannot find " + PREFERRED_ID + " component. It will not be located properly in the window system.");
            return getDefault();
        }
        if (win instanceof PersonasTopComponent) {
            return (PersonasTopComponent) win;
        }
        Logger.getLogger(PersonasTopComponent.class.getName()).warning(
                "There seem to be multiple components with the '" + PREFERRED_ID +
                "' ID. That is a potential source of errors and unexpected behavior.");
        return getDefault();
    }

    @Override
    public int getPersistenceType() {
        return TopComponent.PERSISTENCE_ALWAYS;
    }

    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    /** replaces this in object stream */
    @Override
    public Object writeReplace() {
        return new ResolvableHelper();
    }

    @Override
    protected String preferredID() {
        return PREFERRED_ID;
    }

    final static class ResolvableHelper implements Serializable {

        private static final long serialVersionUID = 1L;

        public Object readResolve() {
            return PersonasTopComponent.getDefault();
        }
    }
}
