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
package de.cau.cs.kieler.simulation.ui.view.dataview

import de.cau.cs.kieler.simulation.DataPool
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.events.SimulationEvent
import de.cau.cs.kieler.simulation.ide.CentralSimulation
import de.cau.cs.kieler.simulation.ui.SimulationUI
import org.eclipse.swt.SWT
import org.eclipse.swt.dnd.DND
import org.eclipse.swt.dnd.DropTarget
import org.eclipse.swt.dnd.DropTargetEvent
import org.eclipse.swt.dnd.DropTargetListener
import org.eclipse.swt.dnd.TextTransfer
import org.eclipse.swt.layout.RowLayout
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.ui.part.ViewPart
import de.cau.cs.kieler.simulation.events.ISimulationListener

/**
 * Displays the data of a running simulation in graphical canvas panels.
 * 
 * @author ssm
 * @kieler.design 2017-12-04 proposed
 * @kieler.rating 2017-12-04 proposed yellow  
 */
class DataView extends ViewPart implements ISimulationListener {
    
    public static val BORDER_MARGIN = 4
    
    protected var DataPool dataPool
    protected var Composite compositeParent
    
    protected val dataObservers = <DataObserver> newLinkedList
    
    new() {
        CentralSimulation.addListener(this)
    }
    
    override createPartControl(Composite parent) {
        compositeParent = parent
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
//        val varName = if (name.startsWith("*")) name.substring(1) else name
        val varName = name 
        if (dataObservers.exists[ hasVariable(varName) ]) return;
        val entry = pool.entries.get(varName)
        if (entry !== null) {
            if (DataObserver.isNumberDomain(entry)) {
                for (observer : dataObservers) {
                    if (observer.isNumberDomain) {
                        observer.addVariable(varName, entry)
                        return;
                    }
                }
            }
        }
        
        val dataObserver = new DataObserver(parent, this)
        dataObserver.createCanvas
        dataObserver.addVariable(varName, entry)
        dataObservers += dataObserver
    }
    
    public def void updateValues(SimulationContext context) {
        for (observer : dataObservers) {
            observer.updateValues(context)
        }
    }
    
    public def void initDataObservers(DataPool pool) {
        // remaining
        val newObservers = dataObservers.map[
            val remainingVariables = variables.filter[pool.entries.keySet.contains(it)].toList
            if (!remainingVariables.empty) {
                remainingVariables
            } else {
                null
            }
        ].filterNull.flatten.toList;
        
        // delete
        (newArrayList => [addAll(dataObservers)]).forEach[deleteDataObserver]
        
        //recreate
        for (variable : newObservers) {
            createDataObserver(pool, variable, compositeParent)
        }
    }
    
    def deleteDataObserver(DataObserver observer) {
        val disposed = observer === null || observer.canvas === null || observer.canvas.disposed
        val parent = if (!disposed) observer.canvas.parent else null
        dataObservers.remove(observer)
        if (!disposed) {
            observer.canvas.dispose 
            parent.layout(true)
        }
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
                    dataPool = CentralSimulation.currentSimulation.dataPool
                    for (varName : (event.data as String).split(",")) {
                        createDataObserver(dataPool, varName, parent)
                    }
                    updateValues(CentralSimulation.currentSimulation)
                }
            }
            
            override dropAccept(DropTargetEvent event) {
            }
            
        })
    }
    
    override update(SimulationContext ctx, SimulationEvent e) {
        if (e instanceof SimulationControlEvent) {
            SimulationUI.updateUI[
                switch(e.operation) {
                    case START: SimulationUI.updateUI[ initDataObservers(ctx.dataPool) ]
                    case STEP: SimulationUI.updateUI[ updateValues(ctx) ]
                    case STOP: SimulationUI.updateUI[ updateValues(null) ]
                    default : {}
                }
            ]
        }
    }
    
    override getName() {
        this.class.simpleName
    }
    
}
