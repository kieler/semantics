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
package de.cau.cs.kieler.sccharts.text.ui.sctgenerator.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.text.sct.sctgenerator.ISCTGeneratorExtension
import de.cau.cs.kieler.sccharts.text.sct.sctgenerator.SCTGenerator
import de.cau.cs.kieler.sccharts.text.sct.sctgenerator.Value
import java.io.IOException
import org.eclipse.core.resources.IProject
import org.eclipse.elk.core.klayoutdata.KLayoutData
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

/**
 * @author ssm
 *
 */
class KGXExtension implements ISCTGeneratorExtension {
    
    /* Injections */
    @Inject extension SCTGenerator      // You can simply inject the SCT Generator.    
    
    private static val KGX_MODEL_EXTENSION = "kgx"
    
    /* Abort properties */
    public static val IProperty<Value<Double>> EXPORT_AS_KGX = 
        new Property<Value<Double>>(
            SCTGenerator.SCTGENERATOR_ID + ".exportAsKGX",
            new Value("Export as KGX", 0.0d)
        )    
    
    override onDeclarationCreate(Declaration declaration) {
        // Do nothing.
    }
    
    override onStateCreate(State state) {
        // Do nothing.
    }
    
    override onRegionCreate(Region region) {
        // Do nothing.
    }
    
    override onTransitionCreate(Transition transition) {
        // Do nothing.
    }
    
    override onExpressionCreate(Expression expression) {
        // Do nothing.
    }
    
    override onModelCreate(State rootState) {
        // Do nothing.
    }
    
    override getCategory() {
        SCTGenerator.SCTGENERATOR_EXTENSIONS_TAB
    }
    
    override getProperties() {
        <IProperty<?>>newArrayList(
            EXPORT_AS_KGX
        )
    }
    
    override onSaveModel(State rootState, IProject project) {
        val value = getProperty(EXPORT_AS_KGX)
        if (value.value > 0) {
            exportAsKGX(rootState, project)
        }
    }
    
    public def exportAsKGX(State rootState, IProject project) {
        val vc = LightDiagramServices.translateModel2(rootState, null, null)
        LightDiagramServices.layoutDiagram(vc);
        val node = vc.viewModel
        // Bugfix for label manager property bug
        node.eAllContents.filter(KLayoutData).toList.forEach[
            it.setProperty(new Property<Object>("de.cau.cs.kieler.labels.labelManager"), null)
        ]
        saveModel(rootState, project, node)
    }
    
    protected def saveModel(State rootState, IProject project, KNode node) {
        // Create output URI.
        var output = URI.createURI(project.locationURI.toString() + "/kgx/" + rootState.id);
        output = output.appendFileExtension(KGX_MODEL_EXTENSION);

        // Try to save the model.
        try {
            val saveRes = new ResourceSetImpl().createResource(output);
            saveRes.getContents().add(node);
            saveRes.save(null)
        } catch (IOException e) {
            throw new Exception("Cannot write output model file: " + e.getMessage());
        }
    }     
    
    
}