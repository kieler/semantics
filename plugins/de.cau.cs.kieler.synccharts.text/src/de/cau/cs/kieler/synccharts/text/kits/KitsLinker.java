package de.cau.cs.kieler.synccharts.text.kits;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.linking.lazy.LazyLinker;

import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;

/**
 *  @author chsch
 */

public class KitsLinker extends LazyLinker {
	
	public void afterModelLinked(EObject model, IDiagnosticConsumer diagnosticsConsumer) {
		Transition tr = null;
		State target = null;

		Iterator<EObject> it = model.eAllContents();
		for (EObject eo = null; it.hasNext(); ) {
			eo = it.next();
			if (eo instanceof Transition) {
				tr = (Transition) eo;
				
				/** the following access will the actual target to be resolved*/
				target = tr.getTargetState();
				
				if (target.getLabel().equals("S7"))
				{
					System.out.println("hier");
				}
				tr.setTargetState(null);
				tr.setTargetState(target);
			}				
		}
	}

}
