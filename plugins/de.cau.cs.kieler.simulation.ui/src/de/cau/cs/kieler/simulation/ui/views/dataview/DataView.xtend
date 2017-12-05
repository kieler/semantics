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
package de.cau.cs.kieler.simulation.ui.views.dataview

import org.eclipse.ui.part.ViewPart
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.dnd.DropTarget
import org.eclipse.swt.dnd.DND
import org.eclipse.swt.dnd.DropTargetListener
import org.eclipse.swt.dnd.DropTargetEvent
import org.eclipse.swt.dnd.TextTransfer
import org.eclipse.swt.widgets.Control
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.ui.views.DataPoolView
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.RowLayout
import org.eclipse.swt.SWT
import org.eclipse.swt.layout.RowData

/**
 * Displays the data of a running simulation in graphical canvas panels.
 * 
 * @author ssm
 * @kieler.design 2017-12-04 proposed
 * @kieler.rating 2017-12-04 proposed yellow  
 */
class DataView extends ViewPart {
    
    public static val BORDER_MARGIN = 4
    
    protected var DataPool dataPool
    
    protected val dataObservers = <DataObserver> newLinkedList
    
    override createPartControl(Composite parent) {
        createMenu
        createToolbar
        
        val rowLayout = new RowLayout(SWT.VERTICAL) => [
            marginTop = marginBottom = marginRight = marginLeft = BORDER_MARGIN
            spacing = BORDER_MARGIN
        ] 
        parent.setLayout(rowLayout)
        
        createDropTarget(parent, parent)
    }
    
    override setFocus() {
    }
    
    protected def void createMenu() {
        val mgr = getViewSite.getActionBars.getMenuManager
    }    
    
    protected def void createToolbar() {
        val mgr = getViewSite.getActionBars.getToolBarManager
    }    
    
    public def void createDataObserver(DataPool pool, String name, Composite parent) {
        println(name)
        
        val dataObserver = new DataObserver(parent, this)
        dataObserver.variables += pool.getVariable(name)
        
        dataObserver.createCanvas
        
        dataObservers += dataObserver
    }
    
    public def void deleteDataObserver(DataObserver observer) {
        val parent = observer.canvas.parent
        dataObservers.remove(observer)
        observer.canvas.dispose 
        parent.layout(true)
    }
    
    protected def void createDropTarget(Control dropControl, Composite parent) {
        val DropTarget dndTarget = new DropTarget(dropControl, DND.DROP_MOVE + DND.DROP_COPY + DND.DROP_DEFAULT)
        dndTarget.setTransfer(#[TextTransfer.getInstance])
        
        dndTarget.addDropListener(new DropTargetListener () {
            
            override dragEnter(DropTargetEvent event) {
            }
            
            override dragLeave(DropTargetEvent event) {
            }
            
            override dragOperationChanged(DropTargetEvent event) {
            }
            
            override dragOver(DropTargetEvent event) {
            }
            
            override drop(DropTargetEvent event) {
                if (event.data instanceof String) {
                    dataPool = DataPoolView.instance.internalDataPool
                    for (varName : (event.data as String).split(",")) {
                        createDataObserver(dataPool, varName, parent)
                    }
                }
            }
            
            override dropAccept(DropTargetEvent event) {
            }
            
        })
    }
}