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
package de.cau.cs.kieler.yakindu.sccharts.kivi;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.yakindu.sct.model.sgraph.Statechart;

import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.model.gmf.util.GmfModelingUtil;
import de.cau.cs.kieler.core.model.triggers.SelectionTrigger.DiagramSelectionState;
import de.cau.cs.kieler.ksbase.core.KSBasETransformation;
import de.cau.cs.kieler.ksbase.ui.kivi.KSBasECombination;
import de.cau.cs.kieler.yakindu.sccharts.kivi.xtend.SCCFixPriorities;

/**
 * Fix transition priorities.
 * 
 * @author cmot
 */
public class TransitionPriorityCombination extends AbstractCombination {

	/**
	 * Apply automatic layout every time the model changed state is updated.
	 * 
	 * @param modelState
	 *            model changed
	 */
	public void execute(final DiagramSelectionState selection) {
	    
	    Object object = selection.getDiagramEditor();
	    if (object instanceof DiagramDocumentEditor) {
	        DiagramDocumentEditor diagramEditor = (DiagramDocumentEditor) object;
	         EObject model = GmfModelingUtil.getModelFromGmfEditor(diagramEditor);
	         if (model instanceof Statechart) {
	             KSBasETransformation transformation = new KSBasETransformation("FixPriorities", "FixPriorities");
	             transformation.setTransformation("fixPriorities");
	             transformation.setTransformationClass(new SCCFixPriorities());
	             
	             KSBasECombination combination = new KSBasECombination(null);
	             combination.executeTransformation(transformation, diagramEditor, null);
	         }
	    }

	}
	
}
