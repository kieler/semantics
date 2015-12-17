/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.comparison.ui.views;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import de.cau.cs.kieler.comparison.core.Comparison;
import de.cau.cs.kieler.comparison.core.ICompiler;
import de.cau.cs.kieler.comparison.core.ITestcase;
import de.cau.cs.kieler.comparison.core.Language;

/**
 * @author nfl
 *
 */
public class StartComparisonDialog extends Dialog {

    /**
     * @param parentShell
     */
    protected StartComparisonDialog(Shell parentShell) {
        super(parentShell);
    }

    private Button okayButton;
    private Button checkBoxCompSpeed;
    private Button checkBoxExecSpeed;
    private Button checkBoxCompSize;
    private Text txtCompAmount;
    private Text txtExecAmount;
    private Combo cmbSrcLng;
    private Combo cmbTrgLng;
    private List lstCompilerSelection;
    private Combo cmbTestcase;
    private List lstTestcaseSelection;
    private Text txtOutputPath;
    private int compAmount = 1;
    private int execAmount = 1;
    private boolean execSpeed;
    private boolean compSpeed;
    private boolean compSize;
    private Collection<ICompiler> compilers;
    private Collection<ITestcase> testcases;
    private String outputPath;

    /**
     * @return the execSpeed
     */
    public boolean compareExecSpeed() {
        return execSpeed;
    }

    /**
     * @return the compSpeed
     */
    public boolean compareCompSpeed() {
        return compSpeed;
    }

    /**
     * @return the compSize
     */
    public boolean compareCompSize() {
        return compSize;
    }

    /**
     * @return the compAmount
     */
    public int getCompAmount() {
        return compAmount;
    }

    /**
     * @return the execAmount
     */
    public int getExecAmount() {
        return execAmount;
    }
    
    /**
     * @return the compiler
     */
    public Collection<ICompiler> getCompilers() {
        return compilers;
    }
    
    /**
     * @return the compiler
     */
    public Collection<ITestcase> getTestcases() {
        return testcases;
    }

    /**
     * @return the outputPath
     */
    public String getOutputPath() {
        return outputPath;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Control createDialogArea(Composite parent) {
        Composite container = (Composite) super.createDialogArea(parent);

        GridLayout layout = new GridLayout(2, true);
        layout.marginRight = 5;
        layout.marginLeft = 10;
        container.setLayout(layout);

        createCompilerSelection(container);
        createTestcaseSelection(container);
        createConfigurationSelection(container);

        return container;
    }

    /**
     * @param container
     */
    private void createCompilerSelection(Composite container) {
        
        String[] languageStrings = getLanguageStrings(true);
        
        Group grp = new Group(container, SWT.BORDER);
        GridLayout layout = new GridLayout(2, true);
        grp.setLayout(layout);
        grp.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        grp.setText("Compiler Selection");
        
        new Label(grp, SWT.NONE).setText("Source Language:");
        
        cmbSrcLng = new Combo(grp, SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);
        cmbSrcLng.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        cmbSrcLng.setItems(languageStrings);
        cmbSrcLng.select(0);
        cmbSrcLng.addSelectionListener(new SelectionListener() {
            
            @Override
            public void widgetSelected(SelectionEvent e) {
                filterCompilerSelection();
            }
            
            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                
            }
        });

        new Label(grp, SWT.NONE).setText("Target Language:");
        
        cmbTrgLng = new Combo(grp, SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);
        cmbTrgLng.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        cmbTrgLng.setItems(languageStrings);
        cmbTrgLng.select(0);
        cmbTrgLng.addSelectionListener(new SelectionListener() {
            
            @Override
            public void widgetSelected(SelectionEvent e) {
                filterCompilerSelection();
            }
            
            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                
            }
        });

        lstCompilerSelection = new List(grp, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL);

        GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1);
        int listHeight = lstCompilerSelection.getItemHeight() * 5;
        gridData.heightHint = lstCompilerSelection.computeTrim(0, 0, 0, listHeight).height;
        lstCompilerSelection.setLayoutData(gridData);
        filterCompilerSelection();
    }

    /**
     * @return
     */
    private String[] getLanguageStrings(boolean withEmpty) {
        Language[] languages = Language.values();
        String[] languageStrings;
        if (withEmpty)
        {
            languageStrings = new String[languages.length + 1];
            languageStrings[0] = "";
        } 
        else {
            languageStrings = new String[languages.length];
        }
        for (int i = 0; i < languages.length; i++){
            languageStrings[i + (withEmpty ? 1 : 0)] = Language.values()[i].toString();
        }
        return languageStrings;
    }
    
    /**
     * 
     */
    private void filterCompilerSelection() {

        HashMap<String, ICompiler> registered = Comparison.getRegisteredCompilers(false);
        String srcString = cmbSrcLng.getItem(cmbSrcLng.getSelectionIndex());
        Language src = null;
        if (srcString != null && srcString != "")
            src = Language.valueOf(srcString);
        String trgString = cmbTrgLng.getItem(cmbTrgLng.getSelectionIndex());
        Language trg = null;
        if (trgString != null && trgString != "")
            trg = Language.valueOf(trgString);
        
        Collection<String> filtered = new ArrayList<String>();
        
        for (Entry<String, ICompiler> kv : registered.entrySet()) {
            if ( (kv.getValue().getSrcLanguage() == src || src == null) 
                && (kv.getValue().getTrgLanguage() == trg || trg == null)){
                filtered.add(kv.getKey());
            }
        }
        
        if (lstCompilerSelection != null)
            lstCompilerSelection.setItems(filtered.toArray(new String[filtered.size()]));
    }

    /**
     * @param container
     */
    private void createTestcaseSelection(Composite container) {
        Group grp = new Group(container, SWT.BORDER);
        GridLayout layout = new GridLayout(2, true);
        grp.setLayout(layout);
        grp.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        grp.setText("Testcase Selection");       

        new Label(grp, SWT.NONE).setText("Language:");

        cmbTestcase = new Combo(grp, SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);
        cmbTestcase.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        cmbTestcase.setItems(getLanguageStrings(false));
        cmbTestcase.select(0);
        cmbTestcase.addSelectionListener(new SelectionListener() {
            
            @Override
            public void widgetSelected(SelectionEvent e) {
                filterTestcaseSelection();
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                
            }
        });

        lstTestcaseSelection= new List(grp, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL);
        
        GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1);
        int listHeight = lstTestcaseSelection.getItemHeight() * 6;
        gridData.heightHint = lstTestcaseSelection.computeTrim(0, 0, 0, listHeight).height;
        lstTestcaseSelection.setLayoutData(gridData); 
        filterTestcaseSelection();
    }
    
    /**
     * 
     */
    private void filterTestcaseSelection() {

        HashMap<String, ITestcase> registered = Comparison.getRegisteredTestcases(false);
        Language lng = Language.valueOf(cmbTestcase.getItem(cmbTestcase.getSelectionIndex()));
        
        Collection<String> filtered = new ArrayList<String>();
        
        for (Entry<String, ITestcase> kv : registered.entrySet()) {
            if (kv.getValue().getLanguage() == lng){
                filtered.add(kv.getKey());
            }
        }
        
        if (lstTestcaseSelection != null)
            lstTestcaseSelection.setItems(filtered.toArray(new String[filtered.size()]));        
    }

    /**
     * @param container
     */
    private void createConfigurationSelection(Composite container) {

        Group grp = new Group(container, SWT.BORDER);
        GridLayout layout = new GridLayout(2, true);
        grp.setLayout(layout);
        grp.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
        grp.setText("Comparison Configuration");
        
        // Comp Speed
        checkBoxCompSpeed = new Button(grp, SWT.CHECK);
        checkBoxCompSpeed.setText("Compare Compilation Speed");
        checkBoxCompSpeed.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        checkBoxCompSpeed.setSelection(true);
        checkBoxCompSpeed.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                txtCompAmount.setEnabled(checkBoxCompSpeed.getSelection());
                checkOkayButton();
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
            }
        });

        txtCompAmount = new Text(grp, SWT.BORDER);
        txtCompAmount.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        txtCompAmount.setText(Integer.toString(compAmount));
        txtCompAmount.setEnabled(checkBoxCompSpeed.getSelection());
        txtCompAmount.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
                Text textWidget = (Text) e.getSource();
                int compText;
                try {
                    compText = Integer.parseInt(textWidget.getText());
                } catch (NumberFormatException nfe) {
                    compText = 1;
                }
                compAmount = compText;
            }
        });

        // Exec Speed
        checkBoxExecSpeed = new Button(grp, SWT.CHECK);
        checkBoxExecSpeed.setText("Compare Execution Speed");
        checkBoxExecSpeed.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        checkBoxExecSpeed.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                txtExecAmount.setEnabled(checkBoxExecSpeed.getSelection());
                checkOkayButton();
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
            }
        });

        txtExecAmount = new Text(grp, SWT.BORDER);
        txtExecAmount.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        txtExecAmount.setText(Integer.toString(execAmount));
        txtExecAmount.setEnabled(checkBoxExecSpeed.getSelection());
        txtExecAmount.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
                Text textWidget = (Text) e.getSource();
                int compText;
                try {
                    compText = Integer.parseInt(textWidget.getText());
                } catch (NumberFormatException nfe) {
                    compText = 1;
                }
                execAmount = compText;
            }
        });

        // Comp Size
        checkBoxCompSize = new Button(grp, SWT.CHECK);
        checkBoxCompSize.setText("Compare Compilation Size");
        checkBoxCompSize.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
        checkBoxCompSize.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                checkOkayButton();
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
            }
        }); 
        
        new Label(grp, SWT.NONE).setText("Output path");;
        txtOutputPath = new Text(grp, SWT.BORDER);
        txtOutputPath.setText(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + "/" );
        txtOutputPath.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void okPressed() {
        try {
            compAmount = Integer.parseInt(txtCompAmount.getText());
        } catch (NumberFormatException nfe) {
            compAmount = 1;
        }
        try {
            execAmount = Integer.parseInt(txtExecAmount.getText());
        } catch (NumberFormatException nfe) {
            execAmount = 1;
        }

        execSpeed = checkBoxExecSpeed.getSelection();
        compSpeed = checkBoxCompSpeed.getSelection();
        compSize = checkBoxCompSize.getSelection();
        saveCompilers();
        saveTestcases();
        outputPath = txtOutputPath.getText();

        super.okPressed();
    }

    /**
     * 
     */
    public void saveCompilers() {
        HashMap<String, ICompiler> map = Comparison.getRegisteredCompilers(false);
        String[] selection = lstCompilerSelection.getSelection();
        compilers = new ArrayList<ICompiler>();
        for (int i = 0; i < lstCompilerSelection.getSelectionCount(); i++){
            ICompiler comp = map.get(selection[i]); 
            if (comp == null) {
                // TODO besser machen
                System.out.println("Compiler "+selection[i]+" not found!");
                continue;
            }
            compilers.add(comp);
        }
    }

    /**
     * 
     */
    private void saveTestcases() {
        HashMap<String, ITestcase> map = Comparison.getRegisteredTestcases(false);
        String[] selection = lstTestcaseSelection.getSelection();
        testcases = new ArrayList<ITestcase>();
        for (int i = 0; i < lstTestcaseSelection.getSelectionCount(); i++){
            ITestcase test = map.get(selection[i]); 
            if (test == null) {
                // TODO besser machen
                System.out.println("Testcase "+selection[i]+" not found!");
                continue;
            }
            testcases.add(test);
        }        
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        okayButton = createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
    }

    /**
     * Enables and disables the OK Button
     */
    private void checkOkayButton() {
        boolean enabled = false;
        enabled |= checkBoxCompSpeed.getSelection();
        enabled |= checkBoxExecSpeed.getSelection();
        enabled |= checkBoxCompSize.getSelection();
        okayButton.setEnabled(enabled);
    }
}
