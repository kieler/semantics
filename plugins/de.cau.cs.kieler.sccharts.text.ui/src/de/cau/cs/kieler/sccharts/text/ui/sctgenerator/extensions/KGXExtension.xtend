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
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.sccharts.text.sctgenerator.ISCTGeneratorExtension
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.text.sctgenerator.SCTGenerator
import de.cau.cs.kieler.sccharts.text.sctgenerator.Value
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kiml.klayoutdata.KLayoutData
import de.cau.cs.kieler.klighd.LightDiagramServices
import java.io.IOException
import org.eclipse.core.resources.IProject
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import de.cau.cs.kieler.sccharts.SCCharts

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
    
    override getCategory() {
        SCTGenerator.SCTGENERATOR_EXTENSIONS_TAB
    }
    
    override getProperties() {
        <IProperty<?>>newArrayList(
            EXPORT_AS_KGX
        )
    }
    
    override onSaveModel(SCCharts sccharts, IProject project) {
        val value = getProperty(EXPORT_AS_KGX)
        if (value.value > 0) {
            exportAsKGX(sccharts, project)
        }
    }
    
    public def exportAsKGX(SCCharts sccharts, IProject project) {
        val vc = LightDiagramServices.translateModel2(sccharts, null, null)
        LightDiagramServices.layoutDiagram(vc);
        val node = vc.viewModel
        // Bugfix for label manager property bug
        node.eAllContents.filter(KLayoutData).toList.forEach[
            it.setProperty(new Property<Object>("de.cau.cs.kieler.labels.labelManager"), null)
        ]
        saveModel(sccharts, project, node)
    }
    
    protected def saveModel(SCCharts sccharts, IProject project, KNode node) {
        // Create output URI.
        var output = URI.createURI(project.locationURI.toString() + "/kgx/" + sccharts.rootStates.head.id);
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
    
    override onModelCreate(SCCharts sccharts) {
    }
    
    override onRootStateCreate(State rootState) {
    }
    
}