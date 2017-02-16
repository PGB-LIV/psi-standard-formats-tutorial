/*
 * --------------------------------------------------------------------------
 * TestGUI.java
 * --------------------------------------------------------------------------
 * Description:       A tutorial for software developers on the development
 *                    of quantitative software using PSI standard formats
 * Developer:         Faviel Gonzalez
 * Created:           01 November 2012
 * Notes:             GUI generated using NetBeans IDE 7.0.1
 * SVN: http://code.google.com/p/psi-standard-formats-tutorial/
 * Project Website: http://code.google.com/p/psi-standard-formats-tutorial/
 * --------------------------------------------------------------------------
 */

package standards;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import uk.ac.ebi.jmzidml.model.mzidml.AnalysisData;
import uk.ac.ebi.jmzidml.model.mzidml.DBSequence;
import uk.ac.ebi.jmzidml.model.mzidml.DataCollection;
import uk.ac.ebi.jmzidml.model.mzidml.Peptide;
import uk.ac.ebi.jmzidml.model.mzidml.PeptideEvidence;
import uk.ac.ebi.jmzidml.model.mzidml.PeptideEvidenceRef;
import uk.ac.ebi.jmzidml.model.mzidml.SpectrumIdentificationItem;
import uk.ac.ebi.jmzidml.model.mzidml.SpectrumIdentificationList;
import uk.ac.ebi.jmzidml.model.mzidml.SpectrumIdentificationResult;
import uk.ac.ebi.jmzidml.xml.io.MzIdentMLUnmarshaller;
import uk.ac.ebi.jmzml.model.mzml.BinaryDataArray;
import uk.ac.ebi.jmzml.model.mzml.CVParam;
import uk.ac.ebi.jmzml.model.mzml.Spectrum;
import uk.ac.ebi.jmzml.xml.io.MzMLObjectIterator;
import uk.ac.ebi.jmzml.xml.io.MzMLUnmarshaller;
import uk.ac.ebi.jmzidml.MzIdentMLElement;

public class TestGUI extends javax.swing.JFrame {

    public TestGUI() {
        //... Setting standard look and feel ...//
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getStackTrace());
        } catch (InstantiationException ex) {
            System.out.println(ex.getStackTrace());
        } catch (IllegalAccessException ex) {
            System.out.println(ex.getStackTrace());
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println(ex.getStackTrace());
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("File:");

        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "ID", "MS level", "Retention time (sec)"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Run");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Example 1 - Test mzML", jPanel1);

        jLabel3.setText("File:");

        jButton5.setText("Browse");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Run");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RT", "Intensity"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel4.setText("RT Window [");

        jTextField4.setText("0");

        jLabel5.setText("-");

        jTextField5.setText("1000");

        jLabel6.setText("] secs");

        jLabel7.setText("] Da");

        jTextField6.setText("600");

        jLabel8.setText("-");

        jTextField7.setText("300");

        jLabel9.setText("m/z Window [");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Example 2 - Test XIC", jPanel3);

        jLabel2.setText("File:");

        jButton3.setText("Browse");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Run");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Peptide", "Rank", "Charge", "Protein"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 321, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Example 3 - Test mzIdentML", jPanel2);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        readSpectra(jTextField1.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        XIC(jTextField3.getText(), Double.parseDouble(jTextField4.getText()),
            Double.parseDouble(jTextField5.getText()),
            Double.parseDouble(jTextField7.getText()),
            Double.parseDouble(jTextField6.getText()));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //... Selecting file(s) ...//
        JFileChooser chooser = new JFileChooser("");
        chooser.setDialogTitle("Select the file(s) to analyze");

        //... Applying file extension filters ...//
        FileNameExtensionFilter filter1 = new FileNameExtensionFilter(
                "Raw Files (*.mzML)", "mzML");
        chooser.setFileFilter(filter1);
        chooser.setMultiSelectionEnabled(false);

        //... Retrieving selection from user ...//
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            if (file != null) {
                jTextField1.setText(file.getPath());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //... Selecting file(s) ...//
        JFileChooser chooser = new JFileChooser("");
        chooser.setDialogTitle("Select the file(s) to analyze");

        //... Applying file extension filters ...//
        FileNameExtensionFilter filter1 = new FileNameExtensionFilter(
                "Raw Files (*.mzML)", "mzML");

        //... Filters must be in descending order ...//
        chooser.setFileFilter(filter1);
        chooser.setMultiSelectionEnabled(false);

        //... Retrieving selection from user ...//
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            if (file != null) {
                jTextField3.setText(file.getPath());
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //... Selecting file(s) ...//
        JFileChooser chooser = new JFileChooser("");
        chooser.setDialogTitle("Select the file(s) to analyze");

        //... Applying file extension filters ...//
        FileNameExtensionFilter filter1 = new FileNameExtensionFilter(
                "Raw Files (*.mzid)", "mzid");

        //... Filters must be in descending order ...//
        chooser.setFileFilter(filter1);
        chooser.setMultiSelectionEnabled(false);

        //... Retrieving selection from user ...//
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            if (file != null) {
                jTextField2.setText(file.getPath());
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        parsePeptides(jTextField2.getText());
    }//GEN-LAST:event_jButton4ActionPerformed
    private void parsePeptides(String xmlFile) {

        final String xmlfile = xmlFile;
        final DefaultTableModel model = new DefaultTableModel();
        jTable3.setModel(model);
        model.addColumn("Index");
        model.addColumn("Peptide");
        model.addColumn("Rank");
        model.addColumn("Charge");
        model.addColumn("Protein");

        final ProgressBarDialog progressBarDialog = new ProgressBarDialog(this,
                                                                          true);
        final Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                //... Progress Bar ...//
                progressBarDialog.setTitle("Loading values");
                progressBarDialog.setVisible(true);
            }

        }, "ProgressBarDialog");
        thread.start();
        new Thread("LoadingThread") {

            @Override
            public void run() {

                File file = new File(xmlfile);
                if (file.exists()) {
                    MzIdentMLUnmarshaller unmarshaller
                            = new MzIdentMLUnmarshaller(file);
                    HashMap<String, Peptide> peptideIdHashMap = new HashMap();
                    HashMap<String, PeptideEvidence> peptideEvidHashMap
                            = new HashMap();

                    Iterator<Peptide> iterPeptide = unmarshaller.
                            unmarshalCollectionFromXpath(
                                    MzIdentMLElement.Peptide);
                    while (iterPeptide.hasNext()) {
                        Peptide peptide = iterPeptide.next();
                        peptideIdHashMap.put(peptide.getId(), peptide);
                    }

                    Iterator<PeptideEvidence> iterPeptideEvidence
                            = unmarshaller.unmarshalCollectionFromXpath(
                                    MzIdentMLElement.PeptideEvidence);
                    while (iterPeptideEvidence.hasNext()) {
                        PeptideEvidence peptideEvidence = iterPeptideEvidence.
                                next();
                        peptideEvidHashMap.put(peptideEvidence.getId(),
                                               peptideEvidence);
                    }

                    HashMap<String, DBSequence> dbseqMap = new HashMap();
                    Iterator<DBSequence> iterDbSeq = unmarshaller.
                            unmarshalCollectionFromXpath(
                                    MzIdentMLElement.DBSequence);
                    while (iterDbSeq.hasNext()) {
                        DBSequence dbseq = iterDbSeq.next();
                        dbseqMap.put(dbseq.getId(), dbseq);
                    }

                    AnalysisData ad = unmarshaller.unmarshal(
                            DataCollection.class).getAnalysisData();
                    List<SpectrumIdentificationList> sil = ad.
                            getSpectrumIdentificationList();
                    SpectrumIdentificationList sIdentList = sil.get(0);

                    for (SpectrumIdentificationResult spectrumIdentResult
                            : sIdentList.getSpectrumIdentificationResult()) {
                        String spectrumID = spectrumIdentResult.getSpectrumID();
                        for (SpectrumIdentificationItem sii
                                : spectrumIdentResult.
                                getSpectrumIdentificationItem()) {
                            int rank = sii.getRank();
                            int charge = sii.getChargeState();
                            Peptide pep = peptideIdHashMap.get(sii.
                                    getPeptideRef());
                            model.insertRow(model.getRowCount(), new Object[]{
                                spectrumID,
                                pep.getPeptideSequence(),
                                rank,
                                charge, ""});

                            for (PeptideEvidenceRef pepEvidRef : sii.
                                    getPeptideEvidenceRef()) {
                                PeptideEvidence pepEvid = peptideEvidHashMap.
                                        get(pepEvidRef.getPeptideEvidenceRef());
                                DBSequence dbSeq = dbseqMap.get(pepEvid.
                                        getDBSequenceRef());
                                model.insertRow(model.getRowCount(),
                                                new Object[]{"",
                                                    "",
                                                    "",
                                                    "",
                                                    dbSeq.getAccession()});
                            }
                        }
                    }
                    progressBarDialog.setVisible(false);
                    progressBarDialog.dispose();
                } else {
                    progressBarDialog.setVisible(false);
                    progressBarDialog.dispose();
                    JOptionPane.showMessageDialog(null, "File not found.",
                                                  "Error",
                                                  JOptionPane.ERROR_MESSAGE);
                }
            }

        }.start();
    }

    public void readSpectra(String xmlFile) {
        final String xmlfile = xmlFile;
        final DefaultTableModel model = new DefaultTableModel();
        jTable1.setModel(model);
        model.addColumn("Index");
        model.addColumn("ID");
        model.addColumn("MS level");
        model.addColumn("Retention time (sec)");

        final ProgressBarDialog progressBarDialog = new ProgressBarDialog(this,
                                                                          true);
        final Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                //... Progress Bar ...//
                progressBarDialog.setTitle("Loading values");
                progressBarDialog.setVisible(true);
            }

        }, "ProgressBarDialog");
        thread.start();
        new Thread("LoadingThread") {

            @Override
            public void run() {

                File file = new File(xmlfile);
                if (file.exists()) {
                    MzMLUnmarshaller unmarshaller = new MzMLUnmarshaller(file);
                    MzMLObjectIterator<Spectrum> spectrumIterator
                            = unmarshaller.unmarshalCollectionFromXpath(
                                    "/run/spectrumList/spectrum", Spectrum.class);
                    while (spectrumIterator.hasNext()) {
                        Spectrum spectrum = spectrumIterator.next();
                        String mslevel = "";
                        List<CVParam> specParam = spectrum.getCvParam();
                        for (Iterator lCVParamIterator = specParam.iterator();
                                lCVParamIterator.hasNext();) {
                            CVParam lCVParam = (CVParam) lCVParamIterator.next();
                            if (lCVParam.getAccession().equals("MS:1000511")) {
                                mslevel = lCVParam.getValue().trim();
                            }
                        }
                        double rt = 0.0;
                        String unitRT = "";
                        List<CVParam> scanParam = spectrum.getScanList().
                                getScan().get(0).getCvParam();
                        for (Iterator lCVParamIterator = scanParam.iterator();
                                lCVParamIterator.hasNext();) {
                            CVParam lCVParam = (CVParam) lCVParamIterator.next();
                            if (lCVParam.getAccession().equals("MS:1000016")) {
                                unitRT = lCVParam.getUnitAccession().trim();
                                if (unitRT.equals("UO:0000031")) //... Validating rt unit (mins or secs) ...//
                                {
                                    rt = Float.parseFloat(lCVParam.getValue().
                                            trim()) * 60;
                                } else {
                                    rt = Float.parseFloat(lCVParam.getValue().
                                            trim());
                                }
                            }
                        }
                        model.insertRow(model.getRowCount(), new Object[]{
                            spectrum.getIndex(),
                            spectrum.getId(),
                            mslevel,
                            Float.parseFloat(String.format("%.2f", rt))});
                    }

                    progressBarDialog.setVisible(false);
                    progressBarDialog.dispose();
                } else {
                    progressBarDialog.setVisible(false);
                    progressBarDialog.dispose();
                    JOptionPane.showMessageDialog(null, "File not found.",
                                                  "Error",
                                                  JOptionPane.ERROR_MESSAGE);
                }
            }

        }.start();
    }

    public void XIC(String xmlFile, double rtStarts, double rtEnds,
                    double mzStarts, double mzEnds) {
        final String xmlfile = xmlFile;
        final double frtStarts = rtStarts;
        final double frtEnds = rtEnds;
        final double fmzStarts = mzStarts;
        final double fmzEnds = mzEnds;

        final DefaultTableModel model = new DefaultTableModel();
        jTable2.setModel(model);
        model.addColumn("RT");
        model.addColumn("Intensity");

        final ProgressBarDialog progressBarDialog = new ProgressBarDialog(this,
                                                                          true);
        final Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                //... Progress Bar ...//
                progressBarDialog.setTitle("Loading values");
                progressBarDialog.setVisible(true);
            }

        }, "ProgressBarDialog");
        thread.start();
        new Thread("LoadingThread") {

            @Override
            public void run() {

                File file = new File(xmlfile);
                if (file.exists()) {
                    MzMLUnmarshaller unmarshaller = new MzMLUnmarshaller(file);

                    //... Iterate in the rt dimension ...//
                    MzMLObjectIterator<Spectrum> spectrumIterator
                            = unmarshaller.unmarshalCollectionFromXpath(
                                    "/run/spectrumList/spectrum", Spectrum.class);
                    while (spectrumIterator.hasNext()) {
                        Spectrum spectrum = spectrumIterator.next();

                        //... Identify MS1 data ...//
                        String mslevel = "";
                        List<CVParam> specParam = spectrum.getCvParam();
                        for (Iterator lCVParamIterator = specParam.iterator();
                                lCVParamIterator.hasNext();) {
                            CVParam lCVParam = (CVParam) lCVParamIterator.next();
                            if (lCVParam.getAccession().equals("MS:1000511")) {
                                mslevel = lCVParam.getValue().trim();
                            }
                        }
                        if (mslevel.equals("1")) {
                            //... Get rt from spectrum ...//
                            double rt = 0.0;
                            String unitRT = "";
                            List<CVParam> scanParam = spectrum.getScanList().
                                    getScan().get(0).getCvParam();
                            for (Iterator lCVParamIterator = scanParam.
                                    iterator(); lCVParamIterator.hasNext();) {
                                CVParam lCVParam = (CVParam) lCVParamIterator.
                                        next();
                                if (lCVParam.getAccession().equals("MS:1000016")) {
                                    unitRT = lCVParam.getUnitAccession().trim();
                                    if (unitRT.equals("UO:0000031")) //... Validating rt unit (mins or secs) ...//
                                    {
                                        rt = Float.parseFloat(lCVParam.
                                                getValue().trim()) * 60;
                                    } else {
                                        rt = Float.parseFloat(lCVParam.
                                                getValue().trim());
                                    }
                                }
                            }
                            //... Get XIC across intervals ...//
                            if (rt >= frtStarts && rt <= frtEnds) {
                                Number[] mzNumbers = null;
                                Number[] intenNumbers = null;
                                //... Reading mz Values ...//
                                List<BinaryDataArray> bdal = spectrum.
                                        getBinaryDataArrayList().
                                        getBinaryDataArray();
                                for (BinaryDataArray bda : bdal) {
                                    List<CVParam> cvpList = bda.getCvParam();
                                    for (CVParam cvp : cvpList) {
                                        if (cvp.getAccession().equals(
                                                "MS:1000514")) {
                                            mzNumbers = bda.
                                                    getBinaryDataAsNumberArray();
                                        }
                                        if (cvp.getAccession().equals(
                                                "MS:1000515")) {
                                            intenNumbers = bda.
                                                    getBinaryDataAsNumberArray();
                                        }
                                    }
                                }
                                //... Generating XIC ...//
                                double intensXIC = 0.0;
                                if (mzNumbers != null) {
                                    for (int iI = 0; iI < mzNumbers.length; iI++) {
                                        if (mzNumbers[iI].doubleValue()
                                                >= fmzStarts && mzNumbers[iI].
                                                doubleValue() <= fmzEnds) {
                                            intensXIC += intenNumbers[iI].
                                                    doubleValue();
                                        }
                                    }
                                    model.insertRow(model.getRowCount(),
                                                    new Object[]{
                                                        Float.parseFloat(String.
                                                                format("%.2f",
                                                                       rt)),
                                                        Float.parseFloat(String.
                                                                format("%.4f",
                                                                       intensXIC))});
                                }
                            }
                        }
                    }
                    progressBarDialog.setVisible(false);
                    progressBarDialog.dispose();
                } else {
                    progressBarDialog.setVisible(false);
                    progressBarDialog.dispose();
                    JOptionPane.showMessageDialog(null, "File not found.",
                                                  "Error",
                                                  JOptionPane.ERROR_MESSAGE);
                }
            }

        }.start();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TestGUI().setVisible(true);
            }

        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
}
