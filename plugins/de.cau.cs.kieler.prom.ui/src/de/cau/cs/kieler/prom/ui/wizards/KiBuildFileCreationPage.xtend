/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.prom.ui.wizards

import de.cau.cs.kieler.prom.ui.UIUtil
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Composite

/**
 * @author aas
 *
 */
class KiBuildFileCreationPage extends AdvancedNewFileCreationPage {
    
    private val String INITIAL_C_CONFIG = "platform:/plugin/de.cau.cs.kieler.prom/resources/default.kibuild"
    private val String INITIAL_JAVA_CONFIG = "platform:/plugin/de.cau.cs.kieler.prom/resources/default-java.kibuild"
    
    new(String pageName, IStructuredSelection selection, boolean fileCreationIsOptional) {
        super(pageName, selection, fileCreationIsOptional)
    }
    
    override createControl(Composite parent) {
        super.createControl(parent)
        
        // Add radio buttons to select which configuration should be loaded
        val group = UIUtil.createGroup(control as Composite, "Configuration Type", 2)
        val cButton = new Button(group, SWT.RADIO)
        cButton.text = "C"
        cButton.selection = true
        val javaButton = new Button(group, SWT.RADIO)
        javaButton.text = "Java"
        
        // Set initial contents url to the url of the first selected radio button
        initialContentsURL = INITIAL_C_CONFIG
        
        // Add listeners
        cButton.addSelectionListener(new SelectionAdapter() {
            override widgetSelected(SelectionEvent e) {
                initialContentsURL = INITIAL_C_CONFIG
            }
        })
        javaButton.addSelectionListener(new SelectionAdapter() {
            override widgetSelected(SelectionEvent e) {
                initialContentsURL = INITIAL_JAVA_CONFIG
            }
        })
    }
}