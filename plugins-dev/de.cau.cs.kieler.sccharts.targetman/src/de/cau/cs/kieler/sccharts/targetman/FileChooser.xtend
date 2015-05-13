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
package de.cau.cs.kieler.sccharts.targetman

// Original Java code:
// http://www.programcreek.com/2010/11/add-a-file-chooserselector-for-eclipse-rcp-development/
import java.io.File
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.events.SelectionListener
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.FileDialog
import org.eclipse.swt.widgets.Text

public class FileChooser extends Composite {

    var Text mText
    var Button mButton
    var String title = null

    new(Composite parent) {
        super(parent, SWT.NULL)
        createContent()
    }

    def void createContent() {
        var layout = new GridLayout(2, false)
        setLayout(layout)

        mText = new Text(this, SWT.SINGLE.bitwiseOr(SWT.BORDER))
        var gd = new GridData(GridData.FILL_BOTH)
        gd.grabExcessHorizontalSpace = true
        gd.horizontalAlignment = GridData.FILL
        mText.setLayoutData(gd)

        mButton = new Button(this, SWT.NONE)
        mButton.setText("...")
        mButton.addSelectionListener(new SelectionListener() {

            override void widgetDefaultSelected(SelectionEvent e) {
            }

            override void widgetSelected(SelectionEvent e) {
                val dlg = new FileDialog(mButton.getShell(), SWT.SAVE)
                dlg.setText("Open")
                val path = dlg.open()
                if (path == null)
                    return;
                mText.setText(path)

            /* // Eclipse Resource dialog
             * val dialog = new ResourceSelectionDialog(shell, ResourcesPlugin.getWorkspace().getRoot(), "Open Stuff")
             * dialog.open();
             * val Object[] results = dialog.getResult();
             * if (results == null || results.length < 1) {
             *     return;
             * }
             * // Is it possible to access arrays via [index] e.g. results[0] ?
             * val resource= results.get(0) as IResource
             * mText.text = resource.fullPath.toString
             */
            }
        })
    }

    def String getText() {
        return mText.getText()
    }

    def Text getTextControl() {
        return mText
    }

    def File getFile() {
        val text = mText.getText()
        if(text.length() == 0) return null
        return new File(text)
    }

    def String getTitle() {
        return title
    }

    def void setTitle(String title) {
        this.title = title
    }
}