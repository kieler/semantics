package de.cau.cs.kieler.synccharts.dsl.kits.resource;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.linking.impl.XtextLinkingDiagnostic;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.resource.XtextSyntaxDiagnostic;
import org.eclipse.xtext.util.Triple;

import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.impl.TransitionImpl;
import de.cau.cs.kieler.synccharts.labelparser.bridge.SyncchartsContentUtil;

public class KitsEagerResolverResource extends LazyLinkingResource {
	private final Logger log = Logger.getLogger(getClass());
//	private XtextSyntaxDiagnostic syndiag = null;

	// @Override
	// protected void doLoad(InputStream inputStream, Map<?, ?> options)
	// throws IOException {
	// super.doLoad(inputStream, options);
	// // if (options != null &&
	// // Boolean.TRUE.equals(options.get(OPTION_RESOLVE_ALL)))
	// EcoreUtil.resolveAll(this);
	// }

	@Override
	public EObject getEObject(String uriFragment) {
		try {
			if (getEncoder().isCrossLinkFragment(this, uriFragment)) {
				Triple<EObject, EReference, AbstractNode> triple = getEncoder()
						.decode(this, uriFragment);
				EReference reference = triple.getSecond();
				List<EObject> linkedObjects = getLinkingService()
						.getLinkedObjects(triple.getFirst(), reference,
								triple.getThird());
				if (linkedObjects.isEmpty()) {
					System.out.println("linked objects empty");
					if (triple.getFirst() instanceof TransitionImpl
							&& triple.getSecond().getName().equals(
									"targetState")) {
						SyncchartsFactory syncFac = SyncchartsFactory.eINSTANCE;
						State s = syncFac.createState();
						// find out what attached is for?
						this.attached(s);
						Transition t = (Transition) triple.getFirst();
						// set new id with sync util
						s.setId(SyncchartsContentUtil.getNewId(s));
						s.setLabel(s.getId());

						if (!(this.getParseResult().getRootNode()
								.getLeafNodes().isEmpty())) {
							for (LeafNode leaf : this.getParseResult()
									.getRootNode().getLeafNodes()) {
								if (leaf.getSyntaxError() != null
										&& leaf.getSyntaxError() instanceof XtextSyntaxDiagnostic) {
									String desiredStateType = leaf.getText();
									if (desiredStateType == "init") {
										s.setIsInitial(true);
									}
								}
							}
						}
						t.setTargetState(s);
						t.getSourceState().getParentRegion().getInnerStates()
								.add(s);

						// if (!(triple.getThird().getLeafNodes()
						// .isEmpty())) {
						// for (LeafNode n : triple.getThird()
						// .getLeafNodes())
						// System.out.println(n.getText());
						//
						// }
						System.out.println("dolly injected");
						if ((!(this.errors.isEmpty()))) {
							Diagnostic diag = this.errors.get(0);
							if (diag instanceof XtextSyntaxDiagnostic)
								this.errors.remove(0);
						}
						// return the newly created state as the result
						// of the linking
						return s;
					}
					// create linking diagnostic if linked objects empty
					XtextLinkingDiagnostic diag = createDiagnostic(triple);
					if (!getErrors().contains(diag))
						getErrors().add(diag);

				}
				if (linkedObjects.size() > 1)
					throw new IllegalStateException(
							"linkingService returned more than one object for fragment "
									+ uriFragment);
				EObject result = linkedObjects.get(0);
				if (!reference.getEReferenceType().isSuperTypeOf(
						result.eClass())
						&& EcorePackage.Literals.EOBJECT != reference
								.getEReferenceType()) {
				}
				// remove previously added error markers, since everything
				// should be fine now
				XtextLinkingDiagnostic diag = createDiagnostic(triple);
				getErrors().remove(diag);
				return result;
			}
		} catch (RuntimeException e) {
			// wrapped because the javaDoc of this method states that
			// WrappedExceptions are thrown
			// logged because EcoreUtil.resolve will ignore any exceptions.
			log.warn("resolution of uriFragment '" + uriFragment + "' failed.",
					e);
			throw new WrappedException(e);
		}
		return super.getEObject(uriFragment);
	}
	// @Override
	// protected XtextLinkingDiagnostic createDiagnostic(
	// Triple<EObject, EReference, AbstractNode> triple) {
	//		
	//
	// String msg = "Couldn't resolve reference to "
	// + triple.getSecond().getEType().getName() + " "
	// + triple.getThird().serialize();
	// return new XtextLinkingDiagnostic(triple.getThird(), msg);
	// }
}
