package de.cau.cs.kieler.yakindu.sccharts.sim.scl.klighd.scg

import de.cau.cs.kieler.core.kivi.AbstractCombination
import de.cau.cs.kieler.core.model.triggers.SelectionTrigger$SelectionState
import de.cau.cs.kieler.klighd.effects.KlighdDiagramEffect
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program
import java.util.Collections
import org.eclipse.core.internal.resources.File
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

class SCGDiagramSynthesisCombination extends AbstractCombination {
	
	def public void execute(SelectionTrigger$SelectionState triggerState) {
		val selection = triggerState.selectedObjects;

		// If this is a file selection then visualize the complete dependency graph
		if (!selection.nullOrEmpty &&
			    selection.size() == 1 && (selection.filter(typeof(File)).size > 0) && 
			    (selection.get(0) as File).fileExtension.equals("scl")) {
			val modelOSString = (selection.get(0) as File).fullPath.toOSString;
			val uri = URI::createPlatformResourceURI(modelOSString, true);
			val resource = new ResourceSetImpl().createResource(uri);
			resource.load(Collections::EMPTY_MAP);
			if (resource != null && !resource.contents.nullOrEmpty) {
				val sclProgram = resource.contents.get(0) as Program;
					
	            this.schedule(new KlighdDiagramEffect(sclProgram));
			}
			    	
		}
		else {
			scheduleKlightEffect
		}
	}
	
	def scheduleKlightEffect() {
//            this.schedule(new KlighdUpdateDiagramEffect(sclProgram));
	}
	
}