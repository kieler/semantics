package de.cau.cs.kieler.synccharts.codegen.dependencies.klighd.xtend

import de.cau.cs.kieler.core.kivi.AbstractCombination
import de.cau.cs.kieler.core.model.triggers.SelectionTrigger
import org.eclipse.emf.ecoretools.diagram.navigator.EcoreDomainNavigatorItem
import de.cau.cs.kieler.klighd.effects.KlighdUpdateDiagramEffect
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependencies;
import java.util.Collection
import org.eclipse.core.internal.resources.File
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import java.util.Collections

class DependencyDiagramSynthesisCombination extends AbstractCombination {
	
	def public void execute(SelectionTrigger$SelectionState triggerState) {
		
		val selection = triggerState.selectedObjects;
		
		if (!selection.nullOrEmpty &&
			    selection.size() == 1 && (selection.filter(typeof(File)).size > 0) && (selection.get(0) as File).fileExtension.equals("dependency")) {
			    	
			val uri = URI::createPlatformResourceURI((selection.get(0) as File).fullPath.toOSString, true);
			
//            Resource _resource = _resourceSetImpl.createResource(uri);
//          
//          final Resource resource = _resource;
//
//          try {
//			resource.load(Collections.EMPTY_MAP);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
			
			val resource = new ResourceSetImpl().createResource(uri);
			resource.load(Collections::EMPTY_MAP);
			if (resource != null && !resource.contents.nullOrEmpty) {
				val dependencies = resource.contents.get(0) as Dependencies;
					
	            this.schedule(new KlighdUpdateDiagramEffect(dependencies));
				
			}
			    	
		}
	}
}