package org.eclipse.papyrus.diagram.statemachine.custom.parsers;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserEditStatus;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.papyrus.core.utils.EditorUtils;
import org.eclipse.papyrus.ui.toolbox.LookForElement;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.UMLFactory;

public class TransitionPropertiesParser implements IParser {

	protected Constraint guardConstraint = null;

	public IContentAssistProcessor getCompletionProcessor(IAdaptable element) {
		return null;
	}

	public String getEditString(IAdaptable element, int flags) {
		if(element instanceof EObjectAdapter) {
			final Transition transition = ((Transition)((EObjectAdapter)element).getRealObject());
		}
		return "";
	}

	public ICommand getParseCommand(IAdaptable element, String newString, int flags) {
		final Transition transition = ((Transition)((EObjectAdapter)element).getRealObject());
		final String result = newString;

		AbstractTransactionalCommand tc = new AbstractTransactionalCommand(LookForElement.getTransactionalEditingDomain(), "Edit Transition Properties", (List)null) {

			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				SafeRunnable.run(new SafeRunnable() {

					public void run() {
						RecordingCommand rc = new RecordingCommand(LookForElement.getTransactionalEditingDomain()) {

							protected void doExecute() {
								// 1. Cherchez dans le model, si une contrainst
								// avec le meme nom existe

								EList<Element> elements = (transition.getModel()).allOwnedElements();
								Iterator<Element> modelElement = elements.iterator();
								while(modelElement.hasNext()) {
									Element pElement = (Element)modelElement.next();
									if(pElement instanceof Constraint && (result.equals(((NamedElement)pElement).getName()))) {
										guardConstraint = (Constraint)pElement;
										transition.setGuard(guardConstraint);
									}
								}

								// 2.Si aucune constraint n'existe deja
								if(guardConstraint == null) {
									guardConstraint = UMLFactory.eINSTANCE.createConstraint();
									guardConstraint.setName(result);
									guardConstraint.setContext(transition.getNamespace());
									transition.setGuard(guardConstraint);
								}
								// transition.setName(result);
							}
						};
						EditorUtils.getTransactionalEditingDomain().getCommandStack().execute(rc);
					}
				});
				return CommandResult.newOKCommandResult();

			};
		};
		return tc;
	}

	public String getPrintString(IAdaptable element, int flags) {
		String guardConstraintDisplay = "";
		if(guardConstraint != null) {
			guardConstraintDisplay = "/< " + guardConstraint.getName() + " >";
			guardConstraint = null;
			return guardConstraintDisplay;
		}
		return guardConstraintDisplay;

	}

	public boolean isAffectingEvent(Object event, int flags) {
		if(event instanceof Notification) {
			int notificationType = ((Notification)event).getEventType();
			if(4 == notificationType) {
				if(((Notification)event).getNewValue() instanceof Constraint)
					guardConstraint = (Constraint)((Notification)event).getNewValue();
				/*
				 * EObjectAdapter essaiadapter = null;
				 * essaiadapter.setRealObject(((Notification)
				 * event).getNotifier()); getPrintString((EObjectAdapter)
				 * ((Notification) event).getNotifier(),flags);
				 */

			}
		}
		return false;
	}

	public IParserEditStatus isValidEditString(IAdaptable element, String editString) {

		return new ParserEditStatus(org.eclipse.papyrus.diagram.statemachine.part.UMLDiagramEditorPlugin.ID, IParserEditStatus.OK, "");
	}

}
