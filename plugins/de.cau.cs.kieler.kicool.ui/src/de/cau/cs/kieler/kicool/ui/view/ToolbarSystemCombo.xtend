/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.view

import org.eclipse.jface.action.ControlContribution
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.events.SelectionListener
import org.eclipse.swt.widgets.Combo
import org.eclipse.swt.widgets.Composite
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.function.Function

/**
 * @author ssm
 * 
 */
class ToolbarSystemCombo extends ControlContribution {

    var private Combo combo
    var Composite parent;
    val items = <String>newArrayList
    
    @Accessors var String selectedText
    @Accessors var int selectedIndex
    @Accessors var SystemSelectionManager systemSelectionManager = null

    protected new(String id) {
        super(id)
    }

    override protected createControl(Composite parent) {
        this.parent = parent
        combo = new Combo(parent, SWT.NONE + SWT.DROP_DOWN + SWT.READ_ONLY)
        update(0)
        return combo
    }

    def getItems() {
        items
    }

    public def void update(int defaultIndex) {
        if (combo == null) return;
        
        combo.removeAll()
        items.forEach[ combo.add(it) ]
        combo.setTextLimit(26 + 10)
        combo.select(defaultIndex)
        selectedText = if (items.size > 0) items.get(defaultIndex)
        selectedIndex = 0
        combo.layout()
        combo.redraw()
        combo.update()

        combo.addSelectionListener(new SelectionListener() {

            public override void widgetSelected(SelectionEvent e) {
                selectedIndex = combo.selectionIndex
                selectedText = combo.text
                if (systemSelectionManager != null) {
                    systemSelectionManager.onSystemChange
                }
            }

            public override void widgetDefaultSelected(SelectionEvent e) {
            }
        });

    }
    
}    
