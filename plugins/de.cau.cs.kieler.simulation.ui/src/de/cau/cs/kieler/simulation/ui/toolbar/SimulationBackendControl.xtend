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
package de.cau.cs.kieler.simulation.ui.toolbar

import de.cau.cs.kieler.simulation.backends.SimulationBackend
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.ComboViewer
import org.eclipse.jface.viewers.ISelectionChangedListener
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.SelectionChangedEvent
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.menus.WorkbenchWindowControlContribution

import static de.cau.cs.kieler.simulation.backends.SimulationBackend.*

/**
 * @author aas
 *
 */
class SimulationBackendControl extends WorkbenchWindowControlContribution {
    
    override protected createControl(Composite parent) {
        val viewer = new ComboViewer(parent)
        viewer.labelProvider = new LabelProvider() {
            override getText(Object element) {
                return (element as SimulationBackend).name
            }
        }
        viewer.addSelectionChangedListener(new ISelectionChangedListener(){
            
            override selectionChanged(SelectionChangedEvent event) {
                val sel = event.selection as StructuredSelection
                val backend = sel.firstElement as SimulationBackend
                SimulationBackend.currentBackend = backend
            }
            
        })
        viewer.contentProvider = ArrayContentProvider.instance
        viewer.input = SimulationBackend.backends
        viewer.selection = new StructuredSelection(SimulationBackend.currentBackend)
        viewer.control.toolTipText = "Default simulation backend"
        return viewer.control
    }
}