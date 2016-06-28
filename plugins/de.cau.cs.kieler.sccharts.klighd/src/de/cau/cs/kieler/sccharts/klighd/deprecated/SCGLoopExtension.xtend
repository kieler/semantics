/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.klighd.deprecated

import com.google.inject.Inject
import de.cau.cs.kieler.core.kgraph.KGraphElement
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.Colors
import de.cau.cs.kieler.core.krendering.KRendering
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kitt.tracing.Tracing
import de.cau.cs.kieler.klighd.internal.util.SourceModelTrackingAdapter
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.features.SCGFeatures
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.core.krendering.KPolyline
import de.cau.cs.kieler.kitt.tracing.internal.TracingMapping
import de.cau.cs.kieler.scg.processors.analyzer.PotentialInstantaneousLoopResult

/**
 * @author als
 *
 */
class SCGLoopExtension {

    @Inject
    extension KRenderingExtensions

    def addSCGLoopHighlighting(KNode rootNode, State scc, SourceModelTrackingAdapter tracking) {

        //TODO This transformation selection should be sensetive to the user selection in KiCoSelectionView regarding its editor
        val context = new KielerCompilerContext(SCGFeatures.GUARD_EXPRESSIONS_ID + ",*T_ABORT,*T_INITIALIZATION,*T_scg.basicblock.sc,*T_s.c,*T_sccharts.scg,*T_NOSIMULATIONVISUALIZATION", scc);
        context.setProperty(Tracing.ACTIVE_TRACING, true);
        context.advancedSelect = true;
        val result = KielerCompiler.compile(context);
        val compiledModel = result.object;
        val scg = compiledModel as SCGraph;
        val loops = result.getAuxiliaryData(PotentialInstantaneousLoopResult)
        val mapping = result.getAuxiliaryData(Tracing).head?.getMapping(scg, scc);
        val equivalenceClasses = new TracingMapping(null);

        scc.eAllContents.forEach [
            var elements = tracking.getTargetElements(it);
            //If no diagram element is associated with the given model element its container is used to find an appropriate representation
            if (elements.empty && it instanceof EObject) {
                var next = (it as EObject)
                while (elements.empty && next != null) {
                    next = next.eContainer;
                    elements = tracking.getTargetElements(next);
                }
                equivalenceClasses.putAll(it, elements);
            }
        ];
        if (mapping != null) {
            for (PotentialInstantaneousLoopResult loop : loops) {
                val criticalSCGEelements = <Object>newArrayList();
                criticalSCGEelements.addAll(loop.criticalNodes)
                for (Node node : loop.criticalNodes) {
                    criticalSCGEelements.addAll(node.incoming.filter[
                        loop.criticalNodes.contains(it.eContainer)
                    ]);
                }
                for (Object crit : criticalSCGEelements) {
                    for (Object source : mapping.get(crit)) {
                        val elements = newArrayList();
                        elements.addAll(tracking.getTargetElements(source))
                        elements.addAll(equivalenceClasses.getTargets(source).filter(EObject))
                        for (EObject element : elements) {
                            if (element instanceof KRendering) {
                                (element as KRendering).highlight
                            } else if (element instanceof KGraphElement) {
                                (element as KGraphElement).data.filter(KRendering).forEach[highlight]
                            }
                        }
                    }
                }
            }
        }
        return rootNode
    }

    private def void highlight(KRendering rendering) {
        rendering.foreground = Colors.RED
        if (rendering instanceof KPolyline) {
            rendering.foreground.propagateToChildren = true;
        }
    }
}
