/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.effects;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import de.cau.cs.kieler.core.kivi.AbstractEffect;
import de.cau.cs.kieler.core.kivi.IEffect;
import de.cau.cs.kieler.core.model.GraphicalFrameworkService;
import de.cau.cs.kieler.core.model.IGraphicalFrameworkBridge;

/**
 * An effect for reordering elements in a feature list.
 *
 * @author msp
 */
public class ReorderEffect extends AbstractEffect {

    /** the container object. */
    private EObject container;
    /** the structural feature to affect. */
    private EStructuralFeature feature;
    /** the old index of the object to reorder. */
    private int oldIndex;
    /** the new index of the object to reorder. */
    private int newIndex;
    /** alternatively, an array of new indices. */
    private int[] newIndices;
    
    /**
     * Create a reorder effect for one element.
     * 
     * @param container the container object
     * @param feature the structural feature to affect
     * @param oldIndex the old index of the object to reorder
     * @param newIndex the new index of the object to reorder
     */
    public ReorderEffect(final EObject container, final EStructuralFeature feature,
            final int oldIndex, final int newIndex) {
        this.container = container;
        this.feature = feature;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }
    
    /**
     * Create a reorder effect for all elements.
     * 
     * @param container the container object
     * @param feature the structural feature to affect
     * @param newIndices an array of new indices
     */
    public ReorderEffect(final EObject container, final EStructuralFeature feature,
            final int[] newIndices) {
        this.container = container;
        this.feature = feature;
        this.newIndices = newIndices;
        for (int i = 0; i < newIndices.length; i++) {
            if (newIndices[i] < 0 || newIndices[i] >= newIndices.length) {
                throw new IllegalArgumentException("Index no. " + i + " is out of bounds: "
                        + newIndices[i]);
            }
        }
    }
    
    /**
     * {@inheritDoc}
     */
    public void execute() {
        Object obj = container.eGet(feature);
        if (obj instanceof List<?>) {
            @SuppressWarnings("unchecked")
            final List<Object> list = (List<Object>) obj;
            // TODO generalize for other frameworks
            IGraphicalFrameworkBridge bridge = GraphicalFrameworkService.getInstance()
                    .getBridge(GraphicalFrameworkService.FW_GMF);
            if (bridge != null) {
                // get an editing domain and execute the command
                TransactionalEditingDomain editingDomain = (TransactionalEditingDomain)
                        bridge.getEditingDomain(container);
                editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain,
                        "Reorder Element") {
                    protected void doExecute() {
                        if (newIndices == null) {
                            // reorder only one element
                            Object element = list.remove(oldIndex);
                            list.add(newIndex, element);
                        } else {
                            // reorder all elements
                            Object[] elements = new Object[Math.min(list.size(), newIndices.length)];
                            for (int i = 0; i < elements.length; i++) {
                                elements[newIndices[i]] = list.get(i);
                            }
                            for (int i = 0; i < elements.length; i++) {
                                list.set(i, elements[i]);
                            }
                        }
                    }
                });
            }
        }
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public IEffect merge(final IEffect otherEffect) {
        if (otherEffect instanceof ReorderEffect) {
            ReorderEffect other = (ReorderEffect) otherEffect;
            if (this.container == other.container && this.feature == other.feature) {
                if (this.newIndices != null) {
                    return this;
                } else if (this.oldIndex == other.newIndex) {
                    this.oldIndex = other.oldIndex;
                    return this;
                }
            }
        }
        return null;
    }

}
