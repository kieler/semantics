/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.yakindu.ui.editor.factory;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteStack;
import org.eclipse.jface.resource.ImageDescriptor;
import org.osgi.framework.FrameworkUtil;
import org.yakindu.sct.ui.editor.providers.DefaultSCTPaletteFactory;

/**
 * Initialize the palette.
 * 
 * @author wah
 * 
 */
public class SyncPaletteFactory extends DefaultSCTPaletteFactory {

	/**
	 * Create the palette entries.
	 */
	public void createPaletteEntries(PaletteRoot root) {
		PaletteContainer container = createToolsCategory(root);
		createTransitionEntry(container);
		createStateEntry(container);
		createInitialStateEntry(container);
		createFinalStateEntry(container);
		createRegionEntry(container);
		createChoiceEntry(container);
	}

	@Override
	protected void createTransitionEntry(PaletteContainer container) {
		PaletteStack stack = new PaletteStack("Stack", "", null);
		container.add(stack);

		stack.add(new ConnectionCreationToolEntry("Weak Abortion Transition",
				"Creates a weak abortion transition",
				getType(SyncMetaModelTypeFactory.WEAK_TRANSITION_ID),
				findIcon("icons/obj16/transition-16.png"),
				findIcon("icons/obj32/transition-32.png")));

		stack.add(new ConnectionCreationToolEntry(
				"Normal Termination Transition",
				"Creates a normal termination transition",
				getType(SyncMetaModelTypeFactory.NORMAL_TRANSITION_ID),
				findIcon("icons/obj16/normal-termination-16.png"),
				findIcon("icons/obj32/normal-termination-32.png")));

		stack.add(new ConnectionCreationToolEntry("Strong Abortion Transition",
				"Creates a strong abortion transition",
				getType(SyncMetaModelTypeFactory.STRONG_TRANSITION_ID),
				findIcon("icons/obj16/strong-abortion-16.png"),
				findIcon("icons/obj32/strong-abortion-32.png")));

	}

	@Override
	protected void createStateEntry(PaletteContainer container) {
		container.add(new CreationToolEntry("State", "Creates a state",
				getType(SyncMetaModelTypeFactory.SYNC_STATE_ID),
				findIcon("icons/obj16/State-16.png"),
				findIcon("icons/obj32/State-32.png")));
	}

	@Override
	protected void createInitialStateEntry(PaletteContainer container) {
		container.add(new CreationToolEntry("Initial State",
				"Creates an initial state",
				getType(SyncMetaModelTypeFactory.SYNC_INITIAL_STATE_ID),
				findIcon("icons/obj16/Initial-State-16.png"),
				findIcon("icons/obj32/Initial-State-32.png")));
	}

	@Override
	protected void createFinalStateEntry(PaletteContainer container) {
		container.add(new CreationToolEntry("Final State",
				"Creates a final state",
				getType(SyncMetaModelTypeFactory.SYNC_FINAL_STATE_ID),
				findIcon("icons/obj16/Final-State-16.png"),
				findIcon("icons/obj32/Final-State-32.png")));
	}

	/**
	 * Returns an image descriptor from a given icon.
	 * 
	 * @param iconPath
	 * @return an image descriptor
	 */
	protected ImageDescriptor findIcon(String iconPath) {
		return super.getImageDescriptor(iconPath,
				FrameworkUtil.getBundle(this.getClass()).getBundleContext()
						.getBundle());
	}

}
