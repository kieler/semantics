/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.klighd.server.ui;

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

import de.cau.cs.kieler.klighd.server.KlighdServerPlugin;
import org.eclipse.swt.widgets.Link;

/**
 * The dialog window for controlling the HTTP server, i.e., starting, stopping and changing its port.
 *
 * @author cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 *
 */
public class KlighdServerDialog extends Dialog {

    protected Object result;
    protected Shell shlDdd;
    private Text text;
    private Button button;
    static KlighdServerDialog instance;

    /**
     * Create the dialog.
     *
     * @param parent
     * @param style
     */
    public KlighdServerDialog(Shell parent, int style) {
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

        text.setText(KlighdServerPlugin.loadPort() + "");
        button.setSelection(KlighdServerPlugin.loadEnabled());

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
        shlDdd.setSize(326, 224);
        shlDdd.setText("KIELER KLighD HTTP Server");

        Composite composite = new Composite(shlDdd, SWT.BORDER);
        composite.setBounds(10, 10, 300, 151);

        button = new Button(composite, SWT.CHECK);
        button.setText("Enable Server");
        button.setBounds(78, 10, 85, 16);

        CLabel lblPort = new CLabel(composite, SWT.NONE);
        lblPort.setText("Port :");
        lblPort.setBounds(78, 43, 33, 19);

        text = new Text(composite, SWT.BORDER);
        text.setBounds(116, 43, 76, 19);

        Link link = new Link(composite, SWT.NONE);
        link.setBounds(27, 95, 259, 42);
        link.setText("<a>http://www.sccharts.com</a>");

        CLabel lblMoreInformation = new CLabel(composite, SWT.NONE);
        lblMoreInformation.setText("More Information:");
        lblMoreInformation.setBounds(27, 78, 104, 21);

        Button btnOk = new Button(shlDdd, SWT.NONE);
        btnOk.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                KlighdServerPlugin.saveEnabled(button.getSelection());
                int port = 4444;
                try {
                    port = Integer.parseInt(text.getText());
                } catch (Exception ee) {
                    port = 4444;
                }
                KlighdServerPlugin.savePort(port);

                if (KlighdServerPlugin.loadEnabled()) {
                    KlighdServerPlugin.stopServer();
                    KlighdServerPlugin.startServer(false);
                } else {
                    KlighdServerPlugin.stopServer();
                }
                shlDdd.close();
            }
        });
        btnOk.setBounds(159, 167, 75, 23);
        btnOk.setText("&Ok");

        Button btncancel = new Button(shlDdd, SWT.NONE);
        btncancel.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                shlDdd.close();
            }
        });
        btncancel.setBounds(240, 167, 68, 23);
        btncancel.setText("&Cancel");

    }
}
