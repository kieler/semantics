package de.tu_berlin.cs.tfs.muvitorkit.commands;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.commands.Command;

/**
 * The <code>SetEObjectFeatureValueCommand</code> is used for generically
 * changing an {@link EObject}'s value that is determined by a featureID. The
 * MuvitorKit's direct edit mechanism uses this class, but it may be freely used
 * to avoid repeated copy/paste of simple commands.
 */
public class SetEObjectFeatureValueCommand extends Command {

	private static final String LABEL = "set '";

	private final EObject editedElement;

	private Object oldValue;

	private Object newValue;

	private final EStructuralFeature feature;

	/**
	 * Create a {@link SetEObjectFeatureValueCommand} that changes the value of
	 * an {@link EObject}' feature.
	 * 
	 * @param editedElement
	 *            the element whose feature value should be changed
	 * @param newValue
	 *            the new value
	 * @param featureID
	 *            the featureID of the feature to be changed, should be
	 *            retrieved from the EMF model's @link EPackage.
	 */
	public SetEObjectFeatureValueCommand(final EObject editedElement,
			final String newValue, final int featureID) {
		this.editedElement = editedElement;
		feature = editedElement.eClass().getEStructuralFeature(featureID);
		oldValue = editedElement.eGet(feature);
		if (oldValue == null) {
			oldValue = "";
		}
		final String type = feature.getEType().getName();
		try {
			if (type.equals("EString")) {
				this.newValue = newValue;
			} else if (type.equals("EInt")) {
				this.newValue = Integer.valueOf(newValue);
			} else if (type.equals("EBoolean")) {
				this.newValue = Boolean.valueOf(newValue);
			} else if (type.equals("EDouble")) {
				this.newValue = Double.valueOf(newValue);
			} else if (type.equals("EFloat")) {
				this.newValue = Float.valueOf(newValue);
			} else if (type.equals("ELong")) {
				this.newValue = Long.valueOf(newValue);
			} else if (type.equals("EShort")) {
				this.newValue = Short.valueOf(newValue);
			}
		} catch (final Exception e) {
			this.newValue = null;
		}

		setLabel(LABEL + oldValue + "' -> '" + newValue + "'");
	}

	/**
	 * This command can be executed if a feature of the edited element
	 * corresponding to the featureID has been found.
	 */
	@Override
	public boolean canExecute() {
		return feature != null && newValue != null;
	}

	/*
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	@Override
	public void execute() {
		editedElement.eSet(feature, newValue);
	}

	/*
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	@Override
	public void undo() {
		editedElement.eSet(feature, oldValue);
	}

	/*
	 * @see org.eclipse.gef.commands.Command#redo()
	 */
	@Override
	public void redo() {
		editedElement.eSet(feature, newValue);
	}
}
