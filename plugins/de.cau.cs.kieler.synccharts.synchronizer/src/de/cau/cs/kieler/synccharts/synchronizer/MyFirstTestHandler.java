package de.cau.cs.kieler.synccharts.synchronizer;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.internal.resources.File;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.diff.merge.service.MergeService;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.internal.Workbench;

import de.cau.cs.kieler.synccharts.Region;

/**
 * @kieler.ignore (excluded from review process)
 */
@SuppressWarnings("restriction")
public class MyFirstTestHandler extends AbstractHandler {

	@SuppressWarnings("unchecked")
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelectionService selService = Workbench.getInstance().getActiveWorkbenchWindow().getSelectionService();
		ISelection selection = selService.getSelection();
		
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structSelection = (IStructuredSelection) selection;
					
			File first = null, second = null;
			
			if (structSelection.size() == 2) {
				List<?> list = structSelection.toList();
//				System.out.println("Hier2");
				
				first = (list.get(0) instanceof File ? (File) list.get(0) : null);
				second = (list.get(1) instanceof File ? (File) list.get(1) : null);
				
				System.out.println(first.getClass().getCanonicalName());
				System.out.println(second.getClass().getCanonicalName());
			}
			
			if (first != null && second != null) {
			
				ResourceSet set = new ResourceSetImpl();
				
				Resource r_first = set.getResource(URI.createPlatformResourceURI(first.getFullPath().toOSString(),true), true);
				Resource r_second = set.getResource(URI.createPlatformResourceURI(second.getFullPath().toOSString(),true), true);
			
				System.out.println(r_first);
				
				Region model_first = (Region) r_first.getContents().get(0);
				Region model_second = (Region) r_second.getContents().get(0);
				
				MatchModel matchModel = null;
				DiffModel diffModel = null;
				
				try {
					matchModel = MatchService.doMatch(model_first, model_second, Collections.EMPTY_MAP);
					diffModel = DiffService.doDiff(matchModel, false);
					MergeService.merge(diffModel.getOwnedElements(), true);
					
					r_first.save(Collections.EMPTY_MAP);
					r_second.save(Collections.EMPTY_MAP);
					

					
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
				
		return null;
	}

}
