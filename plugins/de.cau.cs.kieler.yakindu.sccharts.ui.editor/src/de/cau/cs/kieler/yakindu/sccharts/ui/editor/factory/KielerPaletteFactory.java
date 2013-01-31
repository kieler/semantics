package de.cau.cs.kieler.yakindu.sccharts.ui.editor.factory;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteStack;
import org.eclipse.jface.resource.ImageDescriptor;
import org.yakindu.sct.ui.editor.providers.DefaultSCTPaletteFactory;

import de.cau.cs.kieler.yakindu.sccharts.ui.editor.editor.Activator;

public class KielerPaletteFactory extends DefaultSCTPaletteFactory {

	@Override
	protected void createTransitionEntry(PaletteContainer container) {
		PaletteStack stack = new PaletteStack("Stack", "", null);
		container.add(stack);

		stack.add(new ConnectionCreationToolEntry("Weak Abortion Transition",
				"Creates a weak abortion transition",
				getType(KielerMetaModelTypeFactory.WEAK_TRANSITION_ID),
				findIcon("icons/obj16/weak-abortion-16.png"),
				findIcon("icons/obj32/weak-abortion-32.png")));

		stack.add(new ConnectionCreationToolEntry(
				"Normal Termination Transition", "Creates a normal transition",
				getType(KielerMetaModelTypeFactory.NORMAL_TRANSITION_ID),
				findIcon("icons/obj16/normal-termination-16.png"),
				findIcon("icons/obj32/normal-termination-32.png")));

		stack.add(new ConnectionCreationToolEntry("Strong Abortion Transition",
				"Creates a strong abortion transition",
				getType(KielerMetaModelTypeFactory.STRONG_TRANSITION_ID),
				findIcon("icons/obj16/strong-abortion-16.png"),
				findIcon("icons/obj32/strong-abortion-32.png")));

	}

	@Override
	protected void createStateEntry(PaletteContainer container) {
		container.add(new CreationToolEntry("SCC State",
				"Creates a SyncCharts state",
				getType(KielerMetaModelTypeFactory.SYNC_STATE_ID),
				findIcon("icons/obj16/State-16.png"),
				findIcon("icons/obj32/State-32.png")));
	}

	private ImageDescriptor findIcon(String iconPath) {
		return super.getImageDescriptor(iconPath, Activator.getDefault()
				.getBundle());
	}

}
