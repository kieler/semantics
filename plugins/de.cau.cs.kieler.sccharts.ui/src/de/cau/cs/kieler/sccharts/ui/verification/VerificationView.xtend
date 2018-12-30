/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.verification

import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.klighd.ui.view.DiagramView
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.verification.SCChartsVerificationPropertyAnalyzer
import de.cau.cs.kieler.sccharts.verification.VerificationContext
import de.cau.cs.kieler.sccharts.verification.VerificationProperty
import de.cau.cs.kieler.sccharts.verification.backend.NuxmvVerificationBackend
import de.cau.cs.kieler.sccharts.verification.backend.VerificationBackend
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.action.Action
import org.eclipse.jface.action.IAction
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.TableViewer
import org.eclipse.jface.viewers.TableViewerColumn
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Table
import org.eclipse.ui.IWorkbenchPart
import org.eclipse.ui.part.ViewPart
import org.eclipse.xtend.lib.annotations.Accessors

import static extension de.cau.cs.kieler.simulation.ui.view.pool.DataPoolView.createTableColumn

/** 
 * @author aas
 */
class VerificationView extends ViewPart {
    
    /**
     * The single instance
     */
    public static var VerificationView instance
    
    private val scchartsVerificationPropertyAnalyzer = new SCChartsVerificationPropertyAnalyzer
    private var VerificationContext runningVerificationContext = null
    
    // == UI ELEMENTS ==
    /**
     * The table that shows the data pool view of the simulation.
     */
    @Accessors(PUBLIC_GETTER)
    private var TableViewer viewer
    
    private var TableViewerColumn nameColumn
    private var TableViewerColumn formulaColumn
    private var TableViewerColumn resultColumn
    
    // -- Menu --
    private var IAction runCheck
    private var IAction stopCheck
    private var IAction runCounterexample
    private var IAction readModel
    
     /**
     * @see IWorkbenchPart#createPartControl(Composite)
     */
    override createPartControl(Composite parent) {
        // Remember the instance
        instance = this
        // Create controls
        viewer = createTable(parent)
        createMenu
    }
    
    /**
     * {@inheritDoc}
     */
    override setFocus() {
        viewer.refresh
        viewer.control.setFocus
    }
    
    /**
     * Creates the menu.
     */
    private def void createMenu() {
        runCheck = new Action("Start Check", IAction.AS_PUSH_BUTTON) {
            override run() {
                val property = selectedProperty
                if(property === null) {
                    return
                }
                val model = currentDiagramModel
                if(model === null || !(model instanceof EObject)) {
                    return
                }
                if(runningVerificationContext !== null) {
                    runningVerificationContext.stop
                }
                runningVerificationContext = new VerificationContext()
                runningVerificationContext.verificationProperties = #[property]
                runningVerificationContext.model = model as EObject
                runningVerificationContext.backend = selectedBackend
                runningVerificationContext.start(true)
            }
        }
        stopCheck = new Action("Stop Check", IAction.AS_PUSH_BUTTON) {
            override run() {
                if(runningVerificationContext !== null) {
                    runningVerificationContext.stop
                    runningVerificationContext = null
                }
            }
        }
        runCounterexample = new Action("Run Counterexample", IAction.AS_PUSH_BUTTON) {
            override run() {
                
            }
        }
        readModel = new Action("Read Model", IAction.AS_PUSH_BUTTON) {
            override run() {
               val currentModel = getCurrentDiagramModel
               if(currentModel === null) {
                   return
               }
               if(currentModel instanceof SCCharts) {
                   val properties = scchartsVerificationPropertyAnalyzer.getVerificationProperties(currentModel)
                   viewer.input = properties
               }
            }
        }
        
        getViewSite().getActionBars().getMenuManager() => [
            add(runCheck)
            add(stopCheck)
            add(runCounterexample)
            add(readModel)
        ]
    }
    
    /**
     * Creates the table to show verification properties.
     */
    private def TableViewer createTable(Composite parent) {
        val table = new Table(parent, SWT.BORDER.bitwiseOr(SWT.FULL_SELECTION).bitwiseOr(SWT.MULTI))
        table.setHeaderVisible(true)
        table.setLinesVisible(true)

        // Create viewer
        val viewer = new TableViewer(table)
        
        // Create columns
        nameColumn = viewer.createTableColumn("Name", 128, true)
        nameColumn.labelProvider = new AbstractVerificationViewColumnLabelProvider(this) {
            override String getText(Object element) {
                return element.asVerificationProperty.name
            }
        };
        
        formulaColumn = viewer.createTableColumn("Formula", 256, true)
        formulaColumn.labelProvider = new AbstractVerificationViewColumnLabelProvider(this) {
            override String getText(Object element) {
                return element.asVerificationProperty.formula
            }
        };
        
        resultColumn = viewer.createTableColumn("Result", 256, true)
        resultColumn.labelProvider = new AbstractVerificationViewColumnLabelProvider(this) {
            override String getText(Object element) {
                return element.asVerificationProperty.result.status.toString
            }
        };

        // Create content
        viewer.setContentProvider(ArrayContentProvider.instance);
        viewer.input = null

        return viewer
    }
    
    private def VerificationBackend getSelectedBackend() {
        // TODO: add ui control to set this
        return new NuxmvVerificationBackend()
    }
    
    private def VerificationProperty getSelectedProperty() {
        return viewer.structuredSelection?.firstElement as VerificationProperty
    }
    
    /**
     * Returns the current model in the diagram.
     * 
     * @param the current model in the diagram
     */
    private def Object getCurrentDiagramModel() {
        val diagramViewContext = getDiagramViewContext
        if(diagramViewContext === null) {
            return null
        }
        return diagramViewContext.inputModel
    }
    
    /**
     * Returns the diagram view context.
     * 
     * @return the diagram view context
     */
    private def ViewContext getDiagramViewContext() {
        val diagramViews = DiagramView.getAllDiagramViews
        if (!diagramViews.isNullOrEmpty) {
            val DiagramView viewPart = diagramViews.head
            val viewer = viewPart.getViewer()
            return viewer.getViewContext();
        }
    }
}
