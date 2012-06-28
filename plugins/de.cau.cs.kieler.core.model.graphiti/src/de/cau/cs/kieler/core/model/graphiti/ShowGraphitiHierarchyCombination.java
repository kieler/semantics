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
package de.cau.cs.kieler.core.model.graphiti;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.kivi.menu.ButtonTrigger.ButtonState;

/**
 * Color the levels of hierarchy.
 * 
 * @author mmu
 */
public class ShowGraphitiHierarchyCombination extends AbstractCombination {

    private static final String ID =
            "de.cau.cs.kieler.core.model.graphiti.showhierarchy";

    private DiagramEditor editor;

    /**
     * Color the levels of hierarchy.
     * 
     * @param button
     *            kivi button trigger
     */
    @SuppressWarnings("restriction")
    public void execute(final ButtonState button/*
                                                 * , final SelectionState selection
                                                 * enables editing in color, causes some overhead
                                                 */) {
        if (ID.equals(button.getButtonId())
                && button.getEditor() instanceof DiagramEditor) {
            undoRecordedEffects();
            if (button.isPushedIn()) {
                editor = (DiagramEditor) button.getEditor();
                EObject root =
                        editor.getDiagramTypeProvider().getDiagram().getLink()
                                .getBusinessObjects().get(0);
                int maxLevel = getDepth(root, 0);
                paintRecursively(root, 0, maxLevel);
            }
        }
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

    private void paintRecursively(final EObject element, final int level,
            final int maxLevel) {
        for (EObject child : element.eContents()) {
            paintRecursively(child, level + 1, maxLevel);
        }
        if (level > 0) {
            // CHECKSTYLEOFF MagicNumber
            GraphitiHighlightEffect effect =
                    new GraphitiHighlightEffect(element, editor, new Color(
                            null, new RGB(360.0f / (maxLevel + 1) * level,
                                    1.0f, 0.9f)));
            // CHECKSTYLEON MagicNumber
            schedule(effect);
        }
    }
}
