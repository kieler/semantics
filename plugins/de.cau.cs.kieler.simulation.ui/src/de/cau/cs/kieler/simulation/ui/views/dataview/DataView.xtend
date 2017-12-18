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

import de.cau.cs.kieler.prom.ui.PromUIPlugin
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.core.VariableType
import de.cau.cs.kieler.simulation.core.events.SimulationAdapter
import de.cau.cs.kieler.simulation.core.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.core.events.SimulationListener
import de.cau.cs.kieler.simulation.core.events.SimulationOperation
import de.cau.cs.kieler.simulation.ui.views.DataPoolView
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
    protected var Composite compositeParent
    
    protected val dataObservers = <DataObserver> newLinkedList
    
    protected var SimulationListener simulationListener = createSimulationListener
    
    new() {
        register
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
        val variable = pool.getVariable(name)
        val varType = variable.type               
        
        if (dataObservers.exists[ hasVariable(variable) ]) return;
        if (varType == VariableType.INT || varType == VariableType.FLOAT) {
            for (observer : dataObservers) {
                if (observer.hasDomain(varType)) {
                    observer.addVariable(variable)
                    return;
                }
            }
        }
        
        val dataObserver = new DataObserver(parent, this)
        dataObserver.setDomain(variable.type)
        dataObserver.createCanvas
        dataObserver.addVariable(variable)
        dataObservers += dataObserver
    }
    
    public def void updateValues(DataPool pool) {
        for (observer : dataObservers) {
            observer.updateValues(pool)
        }
    }
    
    public def void resetValues(DataPool pool) {
        val varNames = <String> newLinkedList
        for (observer : dataObservers) {
            observer.resetValues(pool)
            varNames += observer.variables.map[ name ]
        }
        
        for (observer : newLinkedList => [ addAll(dataObservers) ]) {
            observer.deleteDataObserver
        }
        
        for (name : varNames) {
            if (pool.getVariable(name) !== null) {
                pool.createDataObserver(name, compositeParent)
            }
        }
    }
    
    public def void deleteDataObserver(DataObserver observer) {
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
    
    protected def void register() {
        SimulationManager.add(simulationListener)
    }
    
    protected def void unregister() {
        SimulationManager.remove(simulationListener)
    }
    
    protected def SimulationListener createSimulationListener() {
        val listener = new SimulationAdapter("Data View") {
            override onSimulationControlEvent(SimulationControlEvent e) {
                switch(e.operation) {
                    case SimulationOperation.INITIALIZED : {
                        PromUIPlugin.asyncExecInUI[ resetValues(e.pool) ]
                    }
                    case SimulationOperation.STOP : {
                    }
                    case SimulationOperation.STEP_HISTORY_BACK,
                    case SimulationOperation.STEP_HISTORY_FORWARD : {
                    }
                    case SimulationOperation.MACRO_STEP: {
                        PromUIPlugin.asyncExecInUI[ updateValues(e.pool) ]
                    }
                    case SimulationOperation.PLAYING: {
                        PromUIPlugin.asyncExecInUI[ updateValues(e.pool) ]
                    }
                    default : {
                        
                    }
                }
            }
        }
        return listener
    }    
}