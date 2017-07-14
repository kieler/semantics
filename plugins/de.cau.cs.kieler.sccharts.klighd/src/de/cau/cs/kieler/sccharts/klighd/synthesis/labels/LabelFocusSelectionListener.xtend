/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.klighd.synthesis.labels

import com.google.inject.Guice
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.klighd.IKlighdSelection
import de.cau.cs.kieler.klighd.KlighdOptions
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.ZoomStyle
import de.cau.cs.kieler.klighd.kgraph.KLabel
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.klighd.synthesis.hooks.LabelShorteningHook
import java.lang.ref.WeakReference
import java.util.HashSet
import java.util.Set
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property
import org.eclipse.jface.viewers.ISelectionChangedListener
import org.eclipse.jface.viewers.SelectionChangedEvent
import org.eclipse.ui.PlatformUI
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions

/**
 * Manages focusing of shortened labels. A label is focused if it is selected or the declaration of a 
 * variable is selected and the underlying transition of the label references this valued object.
 * 
 * @author als
 * @kieler.design 2015-12-08 proposed
 * @kieler.rating 2015-12-08 proposed yellow
 */
class LabelFocusSelectionListener implements ISelectionChangedListener {

    private final static IProperty<Set<WeakReference<KLabel>>> FOCUSED_LABELS = new Property<Set<WeakReference<KLabel>>>(
        "de.cau.cs.kieler.sccharts.klighd.synthesis.labels.focus", emptySet)

    @Inject extension SCChartsScopeExtensions

    new() { // Handle injection
        Guice.createInjector().injectMembers(this);
    }

    /**
     * {@inheritDoc}
     */
    override selectionChanged(SelectionChangedEvent event) {
        val selection = event.getSelection() as IKlighdSelection
        val viewContext = selection.getViewContext()
        val labelShortening = viewContext.getOptionValue(LabelShorteningHook.SHORTEN_LABEL_STRATEGY)
        val focusedLabels = newHashSet()
        var focusRemoved = false

        if (labelShortening != null && labelShortening != LabelShorteningStrategies.NO &&
            viewContext.inputModel instanceof Scope) {
            // Unfocus all focused labels
            for (WeakReference<KLabel> labelRef : viewContext.getProperty(FOCUSED_LABELS)) {
                val label = labelRef.get()
                if (label != null) {
                    label.setProperty(KlighdOptions.LABELS_ELEMENT_IN_FOCUS, false)
                    focusRemoved = true
                }
            }
            viewContext.setProperty(FOCUSED_LABELS, FOCUSED_LABELS.^default)
            
            // Focus all selected labels
            selection.diagramElementsIterator.filter(KText).filter[eContainer() instanceof KLabel].forEach [
                val label = it.eContainer as KLabel
                label.setProperty(KlighdOptions.LABELS_ELEMENT_IN_FOCUS, true)
                focusedLabels.add(new WeakReference(label))
            ]

            // Focus all labels using variables of selected valued object
            val focusedVOs = selection.diagramElementsIterator.filter(KRendering).map [
                viewContext.getSourceElement(it)
            ].filterNull.filter(Declaration).fold(new HashSet<ValuedObject>()) [ voSet, decl |
                voSet.addAll(decl.valuedObjects)
                return voSet
            ].toList
            if (!focusedVOs.empty) {
                (viewContext.inputModel as Scope).allStates.forEach [
                    it.outgoingTransitions.forEach [
                        if (it.eAllContents.filter(ValuedObjectReference).map[valuedObject].exists [
                            focusedVOs.contains(it)
                        ]) {
                            viewContext.getTargetElements(it).filter(KLabel).forEach [
                                it.setProperty(KlighdOptions.LABELS_ELEMENT_IN_FOCUS, true)
                                focusedLabels.add(new WeakReference(it))
                            ]
                        }
                    ]
                ]
            }

            // Save focused labels
            if (!focusedLabels.empty) {
                viewContext.setProperty(FOCUSED_LABELS, focusedLabels)
            }

            // Layout
            if (focusRemoved || !focusedLabels.empty) {
                PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
                    override run() {
                        LightDiagramServices.layoutDiagram(viewContext, true, ZoomStyle.NONE);
                    }
                });
            }
        }
    }
}