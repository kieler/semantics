/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.web.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import de.cau.cs.kieler.kico.web.KiCoWebPlugin;

/**
 * The dialog window for controlling the TCP server, i.e., starting, stopping and changeing its port.
 * 
 * @author cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 * 
 */
public class KiCoWebDialog extends Dialog {

    protected Object result;
    protected Shell shlDdd;
    private Text text;
    private Button button;
    static KiCoWebDialog instance;

    /**
     * Create the dialog.
     * 
     * @param parent
     * @param style
     */
    public KiCoWebDialog(Shell parent, int style) {
        super(parent, style);
        setText("SWT Dialog");
        instance = this;
    }

    /**
     * Open the dialog.
     * 
     * @return the result
     */
    public Object open() {
        createContents();
        shlDdd.open();

        text.setText(KiCoWebPlugin.loadPort() + "");
        button.setSelection(KiCoWebPlugin.loadEnabled());

        shlDdd.layout();
        Display display = getParent().getDisplay();
        while (!shlDdd.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
        return result;
    }

    /**
     * Create contents of the dialog.
     */
    private void createContents() {
        shlDdd = new Shell(getParent(), SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
        shlDdd.setSize(326, 195);
        shlDdd.setText("KIELER Compiler TCP Web Interface");

        Composite composite = new Composite(shlDdd, SWT.BORDER);
        composite.setBounds(10, 10, 300, 121);

        button = new Button(composite, SWT.CHECK);
        button.setText("Enable Server");
        button.setBounds(77, 24, 85, 16);

        CLabel lblPort = new CLabel(composite, SWT.NONE);
        lblPort.setText("Port :");
        lblPort.setBounds(77, 63, 33, 19);

        text = new Text(composite, SWT.BORDER);
        text.setBounds(114, 63, 76, 19);

        Button btnOk = new Button(shlDdd, SWT.NONE);
        btnOk.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                KiCoWebPlugin.saveEnabled(button.getSelection());
                int port = 5555;
                try {
                    port = Integer.parseInt(text.getText());
                } catch (Exception ee) {
                    port = 5555;
                }
                KiCoWebPlugin.savePort(port);

                if (KiCoWebPlugin.loadEnabled()) {
                    KiCoWebPlugin.stopServer();
                    KiCoWebPlugin.startServer();
                } else {
                    KiCoWebPlugin.stopServer();
                }
                shlDdd.close();
            }
        });
        btnOk.setBounds(161, 137, 75, 23);
        btnOk.setText("&Ok");

        Button btncancel = new Button(shlDdd, SWT.NONE);
        btncancel.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                shlDdd.close();
            }
        });
        btncancel.setBounds(242, 137, 68, 23);
        btncancel.setText("&Cancel");

    }
}
