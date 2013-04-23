/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
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
 * Initialize the palette. This class extends the DefaultSCTPaletteFactory to
 * add the SyncState (Initial State, State, and Final State) and the different
 * types of transitions (weak abort, strong abort, and normal termination) to
 * the palette.
 * 
 * @author wah
 * @kieler.rating green 2013-04-13
 * 
 */
public class SyncPaletteFactory extends DefaultSCTPaletteFactory {

	/** Palette Elements names **/
	public static final String NAME_STATE = "State";
	public static final String NAME_INIT_STATE = "Initial State";
	public static final String NAME_FINAL_STATE = "Final State";
	public static final String NAME_NORMAL_TRANSITION = "Normal Termination Transition";
	public static final String NAME_WEAK_TRANSITION = "Weak Abortion Transition";
	public static final String NAME_STRONG_TRANSITION = "Strong Abortion Transition";

	/** Palette Elements TEXT **/
	public static final String TEXT_STATE = "Create a state";
	public static final String TEXT_INIT_STATE = "Create an initial state";
	public static final String TEXT_FINAL_STATE = "Create a final state";
	public static final String TEXT_NORMAL_TRANSITION = "Create a normal termination transition";
	public static final String TEXT_WEAK_TRANSITION = "Create a weak abortion transition";
	public static final String TEXT_STRONG_TRANSITION = "Create a strong abortion transition";

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

		stack.add(new ConnectionCreationToolEntry(NAME_WEAK_TRANSITION,
				TEXT_WEAK_TRANSITION,
				getType(SyncMetaModelTypeFactory.WEAK_TRANSITION_ID),
				findIcon("icons/obj16/transition-16.png"),
				findIcon("icons/obj32/transition-32.png")));

		stack.add(new ConnectionCreationToolEntry(NAME_NORMAL_TRANSITION,
				TEXT_NORMAL_TRANSITION,
				getType(SyncMetaModelTypeFactory.NORMAL_TRANSITION_ID),
				findIcon("icons/obj16/normal-termination-16.png"),
				findIcon("icons/obj32/normal-termination-32.png")));

		stack.add(new ConnectionCreationToolEntry(NAME_STRONG_TRANSITION,
				TEXT_STRONG_TRANSITION,
				getType(SyncMetaModelTypeFactory.STRONG_TRANSITION_ID),
				findIcon("icons/obj16/strong-abortion-16.png"),
				findIcon("icons/obj32/strong-abortion-32.png")));

	}

	@Override
	protected void createStateEntry(PaletteContainer container) {
		container.add(new CreationToolEntry(NAME_STATE, TEXT_STATE,
				getType(SyncMetaModelTypeFactory.SYNC_STATE_ID),
				findIcon("icons/obj16/State-16.png"),
				findIcon("icons/obj32/State-32.png")));
	}

	@Override
	protected void createInitialStateEntry(PaletteContainer container) {
		container.add(new CreationToolEntry(NAME_INIT_STATE, TEXT_INIT_STATE,
				getType(SyncMetaModelTypeFactory.SYNC_INITIAL_STATE_ID),
				findIcon("icons/obj16/Initial-State-16.png"),
				findIcon("icons/obj32/Initial-State-32.png")));
	}

	@Override
	protected void createFinalStateEntry(PaletteContainer container) {
		container.add(new CreationToolEntry(NAME_FINAL_STATE, TEXT_FINAL_STATE,
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
