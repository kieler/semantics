package de.cau.cs.kieler.synccharts.dsl.kits.linking;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.linking.impl.XtextLinkingDiagnostic;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.NodeAdapter;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.parsetree.SyntaxError;
import org.eclipse.xtext.resource.XtextSyntaxDiagnostic;
import org.eclipse.xtext.util.Triple;

import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.StateType;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.impl.TransitionImpl;
import de.cau.cs.kieler.synccharts.labelparser.bridge.SyncchartsContentUtil;

public class KitsLazyLinkingResource extends LazyLinkingResource {
	private final Logger log = Logger.getLogger(getClass());

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
						t.getSourceState().getParentRegion().getInnerStates()
								.add(s);
						t.setTargetState(s);
						setDesiredTypeOrModifier(t, s);

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

					// create linking diagnostic if linked objects empty for all
					// other references
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

	protected static void setDesiredTypeOrModifier(Transition t, State s) {
		NodeAdapter nodeAdapter = NodeUtil.getNodeAdapter(t);
		if (nodeAdapter != null) {
			// from node adapter to parser node to check if the
			// semantic element was parsed
			CompositeNode parserNode = nodeAdapter.getParserNode();
			// open the editor whose ID is given above with the
			// selection set to the parserNode
			if (parserNode != null) {
				if (!(parserNode.getLeafNodes().isEmpty())) {
					for (LeafNode leaf : parserNode.getLeafNodes()) {
						if (leaf.getSyntaxError() != null
								&& leaf.getSyntaxError() instanceof SyntaxError) {
							String desiredStateModifier = leaf.getText();
							String desiredStateType = leaf.getText();
							System.out.println(desiredStateModifier);
							if (desiredStateType == "cond"
									|| desiredStateType.trim().equals("cond")) {
								System.out.println("found desired state type");
								if (!(leaf.getParent().getElement() == null)) {
									if (leaf.getParent().getElement() instanceof TransitionImpl) {
										Transition parentOfCurrentLeaf = null;
										parentOfCurrentLeaf = (Transition) leaf
												.getParent().getElement();
										if (parentOfCurrentLeaf
												.getTargetState().getId()
												.equals(
														t.getTargetState()
																.getId()))
											s.setType(StateType.CONDITIONAL);
										s.setId("conditional");
										s.setLabel("conditional");

									}
								}
							}
							if (desiredStateModifier == "init"
									|| desiredStateModifier.trim().equals(
											"init")) {
								System.out
										.println("found desired state modifier");
								if (!(leaf.getParent().getElement() == null)) {
									if (leaf.getParent().getElement() instanceof TransitionImpl) {
										Transition parentOfCurrentLeaf = null;
										parentOfCurrentLeaf = (Transition) leaf
												.getParent().getElement();
										if (parentOfCurrentLeaf
												.getTargetState().getId()
												.equals(
														t.getTargetState()
																.getId()))

											s.setIsInitial(true);
										s.setId(SyncchartsContentUtil
												.getNewId(s));
										s.setLabel(s.getId());
									}
								}
							}
							if (desiredStateModifier == "final"
									|| desiredStateModifier.trim().equals(
											"final")) {
								if (!(leaf.getParent().getElement() == null)) {
									if (leaf.getParent().getElement() instanceof TransitionImpl) {
										Transition parentOfCurrentLeaf = null;
										parentOfCurrentLeaf = (Transition) leaf
												.getParent().getElement();
										if (parentOfCurrentLeaf
												.getTargetState().getId()
												.equals(
														t.getTargetState()
																.getId()))

											s.setIsFinal(true);
										s.setId(SyncchartsContentUtil
												.getNewId(s));
										s.setLabel(s.getId());
									}
								}
							}

						}
					}
				}
			}
		}
	}



}
