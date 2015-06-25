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
package de.cau.cs.kieler.sccharts.projectwizard

import org.eclipse.jface.wizard.WizardPage
import org.eclipse.swt.SWT
import org.eclipse.swt.layout.RowLayout
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Label

/**
 * @author aas
 * 
 */
class MainPage extends WizardPage {

    protected new(String pageName) {
        super(pageName)
        title = pageName
    }
    
    override createControl(Composite parent) {
        var Composite comp = new Composite(parent, SWT.NONE)
        setControl(comp)

        comp.setLayout(new RowLayout(SWT.VERTICAL))
        comp.setFont(parent.getFont())

        createComponent(comp)
        
        pageComplete = true
    }

    private def createComponent(Composite parent){
        val lbl = new Label(parent, SWT.NONE);
        lbl.text = "LaLiLu"
    }
}