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
package de.cau.cs.kieler.sccharts.ui.synthesis.hooks.actions

import de.cau.cs.kieler.kexpressions.Schedulable
import de.cau.cs.kieler.kexpressions.ScheduleDeclaration
import de.cau.cs.kieler.kexpressions.ScheduleObjectReference
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.DataDependency
import de.cau.cs.kieler.kexpressions.kext.DeclarationScope
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.ide.klighd.KiCoDiagramViewProperties
import de.cau.cs.kieler.kicool.ui.view.CompilerViewPartListener
import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KGraphElement
import de.cau.cs.kieler.klighd.kgraph.KGraphPackage
import de.cau.cs.kieler.klighd.util.ModelingUtil
import de.cau.cs.kieler.sccharts.SCCharts
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.util.concurrent.IUnitOfWork

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * Toggle the dependency direction.
 * 
 * @author ssm
 * @kieler.design 2018-07-30 proposed 
 * @kieler.rating 2018-07-30 proposed yellow
 *
 */
class ToggleDependencyAction implements IAction {
    
    extension KExpressionsDeclarationExtensions decl = new KExpressionsDeclarationExtensions
    extension KExpressionsValuedObjectExtensions vo = new KExpressionsValuedObjectExtensions
    
    public static val IProperty<DataDependency> DATA_DEPENDENCY =
        new Property<DataDependency>("de.cau.cs.kieler.sccharts.ui.synthesis.hools.dataDependency", null)    
    
    public static val ID = "de.cau.cs.kieler.sccharts.ui.synthesis.hooks.actions.toggleDependencyAction"
    
    public static val AUTO_SCHEDULE_OBJECT_NAME = "_auto"
    
    override execute(ActionContext context) {
        val originalContext = context.viewContext.getProperty(KiCoDiagramViewProperties.COMPILATION_CONTEXT)
        val edge = context.KEdge
        val dependency = edge.getProperty(DATA_DEPENDENCY)

        var update = false
        val source = dependency.eContainer
        val target = dependency.target
        
        val rootModel = dependency.root
        
        if (source instanceof Schedulable) {
            if (target instanceof Schedulable) {
                val sSchedule = source.getSameScheduleObject(target)
                val tSchedule = target.getSameScheduleObject(source)

                if (sSchedule !== null && tSchedule !== null) {    
                    if (sSchedule.priority == tSchedule.priority) {
                        sSchedule.priority = 0
                        tSchedule.priority = 1
                    } else {         
                        val d = sSchedule.priority
                        sSchedule.priority = tSchedule.priority
                        tSchedule.priority = d
                    }
                } else {
                    val autoObject = source.getOrCreateAutoScheduleObject(rootModel)
                    var newPriority = 1
                    
                    val allSOReferences = autoObject.eContainer.eContainer.eAllContents.filter(ScheduleObjectReference).
                        filter[ it.valuedObject == autoObject ].toList
                    for (r : allSOReferences) {
                        if (r.priority > newPriority) newPriority = r.priority + 1
                    }
                    
                    if (sSchedule === null && source.schedule.forall[ valuedObject != autoObject ]) {
                        val newSSchedule = autoObject.createScheduleReference
                        newSSchedule.priority = newPriority++
                        source.schedule += newSSchedule
                    }
                    if (tSchedule === null && target.schedule.forall[ valuedObject != autoObject ]) {
                        val newTSchedule = autoObject.createScheduleReference
                        newTSchedule.priority = newPriority++
                        target.schedule += newTSchedule
                    }
                    
                }
                
                update = true                
            }
        }
        
        
        if (update) {
            rootModel.eAllContents.filter(DataDependency).toList.forEach[ remove ]
            
            val cc = compile(rootModel) 
            updateEditor(cc.result.model as EObject)
            updateDiagram(context, cc.result.model as SCCharts, cc)
            
            return ActionResult.createResult(true).dontAnimateLayout()
        }        
        
        return ActionResult.createResult(false).dontAnimateLayout()
    }
    
    private def updateEditor(EObject model) {
        val editor = CompilerViewPartListener.activeEditor
        
        if (editor instanceof XtextEditor) {
            val doc = editor.getDocument
            
            doc.modify(new IUnitOfWork<EObject, XtextResource>() {
                override exec(XtextResource state) throws Exception {
                    state.contents.clear
                    state.contents += model
                    model
                }
            });  
        }            
    }
    
    var autoCounter = 0
    
    private def ValuedObject getOrCreateAutoScheduleObject(EObject source, EObject rootModel) {
        if (source.eContainer == rootModel) {
            if (source instanceof DeclarationScope) {
                val sdo = source.declarations.filter(ScheduleDeclaration).map[ valuedObjects ].flatten.toList      
                if (sdo.exists[ it.name == AUTO_SCHEDULE_OBJECT_NAME ]) return sdo.filter[ it.name == AUTO_SCHEDULE_OBJECT_NAME ].head
                
                val so = createValuedObject(AUTO_SCHEDULE_OBJECT_NAME)
                source.declarations += createScheduleDeclaration => [
                    it.valuedObjects += so
                ]     
                return so
            }
        } else {
            return source.eContainer.getOrCreateAutoScheduleObject(rootModel)
        }
    } 
    
    private def compile(EObject obj) {
        val cc = Compile.createCompilationContext("de.cau.cs.kieler.sccharts.interactiveScheduling", obj)
        cc.compile
        cc
    }
    
    private def updateDiagram(ActionContext context, EObject model, CompilationContext compilationContext) {
//        val diagram = LightDiagramServices.translateModel(
//                        model,
//                        context.viewContext,
//                        new MapPropertyHolder => [ 
//                            setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS, "de.cau.cs.kieler.sccharts.ui.synthesis.SCChartsSynthesis") 
//                            setProperty(KiCoDiagramViewProperties.COMPILATION_CONTEXT, compilationContext)
//                        ]
//                    );
//          
//        val root = (context.KNode.root as KNode)
//        root.children.clear
//        root.children += diagram.children

        context.viewContext.setProperty(KiCoDiagramViewProperties.COMPILATION_CONTEXT, compilationContext)
        context.viewContext.update(model)    
    }
    
    private def ScheduleObjectReference getSameScheduleObject(Schedulable source, Schedulable target) {
        for (s : source.schedule) {
            if (target.schedule.exists[ s.valuedObject == it.valuedObject ]) return s
        }
        return null
    }
    
    
    private def EObject getRoot(EObject eObject) {
        if (eObject.eContainer === null) return eObject else return eObject.eContainer.getRoot
    }
    
    private def KEdge getKEdge(ActionContext context) {
         ModelingUtil.eContainerOrSelfOfType(context.getKGraphElement, KGraphPackage.eINSTANCE.getKEdge) as KEdge
    }
    
    private def KGraphElement getKGraphElement(ActionContext context) {
        if (context.getKGraphElement === null) {
            return ModelingUtil.eContainerOfType(context.getKRendering, KGraphPackage.eINSTANCE.getKGraphElement()) as KGraphElement
        }
        return context.getKGraphElement
    }    
    
}