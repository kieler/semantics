/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.targetman.ui;

// Source:
// http://www.programcreek.com/2010/11/add-a-file-chooserselector-for-eclipse-rcp-development/

import java.io.File;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Text;
 
public class FileChooser extends Composite {
 
        Text mText;
        Button mButton;
        String title = null;
 
        public FileChooser(Composite parent) {
                super(parent, SWT.NULL);
                createContent();
        }
 
        public void createContent() {
                GridLayout layout = new GridLayout(2, false);
                setLayout(layout);
 
                mText = new Text(this, SWT.SINGLE | SWT.BORDER);
                GridData gd = new GridData(GridData.FILL_BOTH);
                gd.grabExcessHorizontalSpace = true;
                gd.horizontalAlignment = GridData.FILL;
                mText.setLayoutData(gd);
 
 
                mButton = new Button(this, SWT.NONE);
                mButton.setText("...");
                mButton.addSelectionListener(new SelectionListener() {
 
                        public void widgetDefaultSelected(SelectionEvent e) {
                        }
 
                        public void widgetSelected(SelectionEvent e) {
                                FileDialog dlg = new FileDialog(mButton.getShell(),  SWT.OPEN  );
                                dlg.setText("Open");
                                String path = dlg.open();
                                if (path == null) return;
                                mText.setText(path);
                        }
                });
        }
 
        public String getText() {
                return mText.getText();
 
        }
 
        public Text getTextControl() {
                return mText;           
        }
 
        public File getFile() {
                String text = mText.getText();
                if (text.length() == 0) return null;
                return new File(text);
        }
 
        public String getTitle() {
                return title;
        }
 
        public void setTitle(String title) {
                this.title = title;
        }
}