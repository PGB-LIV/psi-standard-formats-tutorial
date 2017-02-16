//~ Formatted by Jindent --- http://www.jindent.com
package standards;

public class ProgressBarDialog extends javax.swing.JDialog {

    // Variables declaration - do not modify
    private javax.swing.JProgressBar jpbStatusBar;

    // End of variables declaration
    // ... Creates new form ProgressBarDialog ...//
    public ProgressBarDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
    }

    /**
     * This method is called from within the constructor to initialise the form.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        jpbStatusBar = new javax.swing.JProgressBar();
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        jpbStatusBar.setIndeterminate(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());

        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(jpbStatusBar,
                                                                      javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                      348,
                                                                      javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                         Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                      .addGroup(layout.createSequentialGroup()
                                                      .addContainerGap()
                                                      .addComponent(jpbStatusBar,
                                                                    javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                    javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                       Short.MAX_VALUE)));
        pack();
    }    // </editor-fold>
}
