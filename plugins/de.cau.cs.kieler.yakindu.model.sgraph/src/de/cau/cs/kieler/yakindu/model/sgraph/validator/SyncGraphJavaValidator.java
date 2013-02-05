package de.cau.cs.kieler.yakindu.model.sgraph.validator;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.yakindu.sct.model.sgraph.Entry;
import org.yakindu.sct.model.sgraph.Transition;
import org.yakindu.sct.model.sgraph.Vertex;
import org.yakindu.sct.model.sgraph.validation.SGraphJavaValidator;

import de.cau.cs.kieler.yakindu.sccharts.ui.editor.syncgraph.SyncState;


/**
 * This validator is intended to be used by a compositeValidator (See
 * {@link org.eclipse.xtext.validation.ComposedChecks}) of another language
 * specific validator. It does not register itself as an EValidator.
 * 
 * This validator checks for common graphical constraints for all kinds of state
 * charts.
 * 
 * @author wah
 */
public class SyncGraphJavaValidator extends SGraphJavaValidator {

	@Check(CheckType.FAST)
	@Override
	public void vertexNotReachable(Vertex vertex) {
		if (!(vertex instanceof Entry)) {
			int incomingTransitions = 0;
			incomingTransitions += vertex.getIncomingTransitions().size();
			if (vertex instanceof org.yakindu.sct.model.sgraph.State) {
				SyncState state = (SyncState) vertex;
				// escape initial states
				if (!state.isIsInitial()) {
					TreeIterator<EObject> eAllContents = vertex.eAllContents();
					while (eAllContents.hasNext()) {
						EObject next = eAllContents.next();
						if (next instanceof org.yakindu.sct.model.sgraph.State) {
							for (Transition transition : ((org.yakindu.sct.model.sgraph.State) next)
									.getIncomingTransitions()) {
								if (!EcoreUtil.isAncestor(vertex,
										transition.getSource())) {
									incomingTransitions++;
								}
							}
						}
					}
				}
				if (incomingTransitions == 0) {
					error(ISSUE_NODE_NOT_REACHABLE, vertex, null, -1);
				}
			}
		}
	}
}
