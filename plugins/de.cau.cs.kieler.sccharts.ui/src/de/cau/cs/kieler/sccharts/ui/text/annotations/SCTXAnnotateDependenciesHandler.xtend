/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.text.annotations

import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import com.google.inject.Injector
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import org.eclipse.xtext.ui.editor.utils.EditorUtils
import org.eclipse.xtext.ui.editor.XtextEditor
import de.cau.cs.kieler.kicool.ui.klighd.ModelReaderUtil
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.util.concurrent.IUnitOfWork
import org.eclipse.xtext.resource.XtextResource
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.compilation.CompilationSystem
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.kexpressions.keffects.DataDependency
import java.util.List
import de.cau.cs.kieler.kexpressions.keffects.DataDependencyType
import com.google.common.collect.HashMultimap

import static de.cau.cs.kieler.kexpressions.keffects.DataDependencyType.*
import de.cau.cs.kieler.annotations.registry.PragmaRegistry
import de.cau.cs.kieler.annotations.StringPragma
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.registry.AnnotationsRegistry
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.annotations.registry.AnnotationsType

/**
 * @author ssm
 * @kieler.design 2019-02-01 proposed
 * @kieler.rating 2019-02-01 proposed yellow  
 *
 */
class SCTXAnnotateDependenciesHandler extends AbstractHandler {
    
    extension PragmaExtensions pragmaExt = new PragmaExtensions
    extension AnnotationsExtensions annotationExt = new AnnotationsExtensions
    
    /** ID of the annotate command */
    public static final String SCTX_ANNOTATE_DEPENDENCIES =
            "de.cau.cs.kieler.sccharts.ui.text.annotations.dependencies";
            
    private val compilationSystemID = "de.cau.cs.kieler.sccharts.extended.core"
    private val scgTransformation = "de.cau.cs.kieler.sccharts.scg.processors.SCG"
    private val dependencyAnalysisV2 = "de.cau.cs.kieler.scg.processors.dependency"            

    /** The SCTX injector */
    private static Injector injector =
            new SCTXStandaloneSetup().createInjectorAndDoEMFRegistration();
            
            
    public static val DEPENDENCY_TEST_ANNOTATION = AnnotationsRegistry.register("dependencies", AnnotationsType.SYSTEM, StringAnnotation, SCCharts, 
        "Annotates dependencies inside the model for testing purposes.")
    
        
    
    override execute(ExecutionEvent event) throws ExecutionException {
        val xtextEditor = EditorUtils.getActiveXtextEditor(event)
        val model = ModelReaderUtil.readModelFromEditor(xtextEditor) as EObject
        
        if (model instanceof SCCharts) {
            val context = model.compile
            val dataDependencies = 
                (context.result.getModel as SCGraphs).scgs.head.nodes.map[ outgoingLinks ].flatten.
                filter(DataDependency).toList
            
            // Remove previous test annotations and update the editor to avoid unnecessary blank lines.     
            model.rootStates.head.annotations.removeIf[ name.equals(DEPENDENCY_TEST_ANNOTATION) ]
            xtextEditor.updateEditor(model)
                            
            model.annotateSCCharts(dataDependencies)    
            xtextEditor.updateEditor(model)
        }
        
        return this
    }
    
    protected def annotateSCCharts(SCCharts scc, List<DataDependency> dataDependencies) {
        
        val HashMultimap<DataDependencyType, DataDependency> dependencyMap = HashMultimap.create
        for (d : dataDependencies) {
            switch(d.getType()) {
                case WRITE_WRITE: dependencyMap.put(WRITE_WRITE, d)
                case WRITE_RELATIVEWRITE: dependencyMap.put(WRITE_RELATIVEWRITE, d)
                case WRITE_READ: dependencyMap.put(WRITE_READ, d)
                default: {}
            }
        } 
        
        for (t : #[WRITE_WRITE, WRITE_RELATIVEWRITE, WRITE_READ]) {
            val ds = dependencyMap.get(t)
            
            val vals = <String> newArrayList => [ add(t.toString) ]
            vals.add(ds.size.toString)
            vals.add(ds.filter[ concurrent ].size.toString)
            vals.add(ds.filter[ confluent ].size.toString)
            
            scc.rootStates.head.annotations += createStringAnnotation(DEPENDENCY_TEST_ANNOTATION, vals)
        }
        
    }
    
    private def updateEditor(XtextEditor editor, EObject model) {
        val doc = editor.getDocument
        
        doc.modify(new IUnitOfWork<EObject, XtextResource>() {
            override exec(XtextResource state) throws Exception {
                state.contents.clear
                state.contents += model
                model
            }
        });  
    }    
    
    private def compile(SCCharts scc) {
        val context = Compile.createCompilationContext(compilationSystemID, scc, newArrayList(scgTransformation))
        context.startEnvironment.setProperty(Environment.INPLACE, false)
        context.compile
        
        val v2Context = Compile.createCompilationContext(
            CompilationSystem.createCompilationSystem("dep2", newArrayList(dependencyAnalysisV2)),
            context.result.model
        )
        v2Context.compile
        
        return v2Context
    }    
    
}