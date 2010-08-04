package de.tu_berlin.cs.tfs.muvitorkit.commands;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.commands.Command;

/**
 * Document SimpleDeleteEObjectCommand
 *
 * @author Tony
 *
 */
public class SimpleDeleteEObjectCommand extends Command {

	final private EObject parent;

	final private EObject model;

	final private EStructuralFeature containingFeature;

	public SimpleDeleteEObjectCommand(final EObject model) {
		this.model = model;
		parent = model.eContainer();
		containingFeature = model.eContainingFeature();
	}

	@Override
	public boolean canExecute() {
		return model != null && parent != null;
	}

	@Override
	public void execute() {
		((List<?>) parent.eGet(containingFeature)).remove(model);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void undo() {
		((List<Object>) parent.eGet(containingFeature)).add(model);
	}
}
