/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.combinations;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.kivi.triggers.SelectionTrigger.SelectionState;
import de.cau.cs.kieler.core.model.effects.HighlightEffect;

/**
 * Color the levels of hierarchy.
 * 
 * @author mmu
 */
public class ShowHierarchyCombination extends AbstractCombination {

    private DiagramEditor editor;

    /**
     * Color the levels of hierarchy.
     * 
     * @param selection
     *            temporary testing trigger
     */
    public void execute(/* FIXME */final SelectionState selection) {
        if (selection != null) {
            return;
        }
        editor = selection.getDiagramEditor();
        EObject root = editor.getDiagram().getElement();
        int maxLevel = getDepth(root, 0);
        paintRecursively(root, 0, maxLevel);
    }

    private int getDepth(final EObject element, final int current) {
        int level = 0;
        for (EObject child : element.eContents()) {
            int childLevel = getDepth(child, current + 1);
            if (childLevel > level) {
                level = childLevel;
            }
        }
        return level + 1;
    }

    private void paintRecursively(final EObject element, final int level, final int maxLevel) {
        for (EObject child : element.eContents()) {
            paintRecursively(child, level + 1, maxLevel);
        }
        if (level > 0) {
            HighlightEffect effect = new HighlightEffect(element, editor, new Color(null, new RGB(
                    360.0f / (maxLevel + 1) * level, 1.0f, 1.0f)));
            effect.setChangeWidth(false);
            schedule(effect);
        }
    }
}
