package org.yakindu.sct.ui.editor.providers;

import static org.yakindu.sct.ui.editor.editor.guice.StatechartMetaModelTypeFactory.STATE_ID;
import static org.yakindu.sct.ui.editor.editor.guice.StatechartMetaModelTypeFactory.TRANSITION_ID;
import static org.yakindu.sct.ui.editor.editor.guice.StatechartMetaModelTypeFactory.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.CombinedTemplateCreationEntry;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteStack;
import org.eclipse.gmf.runtime.diagram.ui.tools.ConnectionCreationTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.CreationTool;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.osgi.framework.Bundle;
import org.yakindu.sct.ui.editor.DiagramActivator;

public class DefaultSCTPaletteFactory implements ISCTPaletteFactory {

	public void createPaletteEntries(PaletteRoot root) {
		PaletteContainer container = createToolsCategory(root);
		createTransitionEntry(container);
		createStateEntry(container);
		PaletteContainer stack = createCompositeStatesStack(container);
		createCompositeStateEntry(stack);
		createOrthogonalStateEntry(stack);
		createSubmachineStateEntry(stack);
		createRegionEntry(container);
		createInitialStateEntry(container);
		createShallowHistoryEntry(container);
		createDeepHistoryEntry(container);
		createFinalStateEntry(container);
		createChoiceEntry(container);
		createSynchronizationEntry(container);
	}

	protected PaletteContainer createToolsCategory(PaletteRoot root) {
		PaletteDrawer drawer = new PaletteDrawer("Tools");
		root.add(drawer);
		return drawer;
	}

	protected void createTransitionEntry(PaletteContainer container) {
		container.add(new ConnectionCreationToolEntry("Transition",
				"Creates a transition", getType(TRANSITION_ID),
				findIcon("icons/obj16/transition-16.png"),
				findIcon("icons/obj32/transition-32.png")));
	}

	protected void createStateEntry(PaletteContainer container) {
		container.add(new CreationToolEntry("State", "Creates a state",
				getType(STATE_ID), findIcon("icons/obj16/State-16.png"),
				findIcon("icons/obj32/State-32.png")));
	}

	private PaletteContainer createCompositeStatesStack(
			PaletteContainer container) {
		PaletteStack stack = new PaletteStack("Stack", "", null);
		container.add(stack);
		return stack;
	}

	private void createCompositeStateEntry(PaletteContainer stack) {
		stack.add(new CreationToolEntry("Composite State",
				"Creates a composite state", getType(COMPOSITE_STATE_ID),
				findIcon("icons/obj16/Composite-State-16.png"),
				findIcon("icons/obj32/Composite-State-32.png")));
	}

	protected void createOrthogonalStateEntry(PaletteContainer stack) {
		stack.add(new CreationToolEntry("Orthogonal State",
				"Creates a orthogonal state", getType(ORTHOGONAL_STATE_ID),
				findIcon("icons/obj16/Orthogonal-State-16.png"),
				findIcon("icons/obj32/Orthogonal-State-32.png")));
	}

	protected void createSubmachineStateEntry(PaletteContainer stack) {
		stack.add(new CreationToolEntry("Submachine State",
				"Creates a submachine state", getType(SUBMACHINE_STATE_ID),
				findIcon("icons/obj16/Submachine-State-16.png"),
				findIcon("icons/obj32/Submachine-State-32.png")));
	}

	protected void createRegionEntry(PaletteContainer container) {
		container.add(new CreationToolEntry("Region", "Creates a region",
				getType(REGION_ID), findIcon("icons/obj16/Region-16.png"),
				findIcon("icons/obj32/Region-32.png")));
	}

	protected void createInitialStateEntry(PaletteContainer container) {
		container.add(new CreationToolEntry("Initial State",
				"Creates an initial state", getType(ENTRY_ID),
				findIcon("icons/obj16/Initial-State-16.png"),
				findIcon("icons/obj32/Initial-State-32.png")));
	}

	protected void createFinalStateEntry(PaletteContainer container) {
		container.add(new CreationToolEntry("Final State",
				"Creates a final state", getType(FINALSTATE_ID),
				findIcon("icons/obj16/Final-State-16.png"),
				findIcon("icons/obj32/Final-State-32.png")));
	}

	protected void createDeepHistoryEntry(PaletteContainer container) {
		container.add(new CreationToolEntry("Deep History",
				"Creates a deep history", getType(ENTRY_ID),
				findIcon("icons/obj16/Deep-History-16.png"),
				findIcon("icons/obj32/Deep-History-32.png")));
	}

	protected void createShallowHistoryEntry(PaletteContainer container) {
		container.add(new CreationToolEntry("Shallow History",
				"Creates a shallow state", getType(ENTRY_ID),
				findIcon("icons/obj16/Shallow-History-16.png"),
				findIcon("icons/obj32/Shallow-History-32.png")));
	}

	protected void createChoiceEntry(PaletteContainer container) {
		container.add(new CreationToolEntry("Choice", "Creates a choice",
				getType(CHOICE_ID), findIcon("icons/obj16/Choice-16.png"),
				findIcon("icons/obj32/Choice-32.png")));
	}

	protected void createSynchronizationEntry(PaletteContainer container) {
		container.add(new CreationToolEntry("Synchronization",
				"Creates a synchronization", getType(SYNCHRONIZATION_ID),
				findIcon("icons/obj16/Synchronization-16.png"),
				findIcon("icons/obj32/Synchronization-32.png")));
	}

	protected IElementType getType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	private ImageDescriptor findIcon(String iconPath) {
		return getImageDescriptor(iconPath, DiagramActivator.getDefault()
				.getBundle());
	}

	protected ImageDescriptor getImageDescriptor(String iconPath, Bundle bundle) {
		try {
			if (iconPath != null) {
				URL fullPathString = FileLocator.find(bundle,
						new Path(iconPath), null);
				fullPathString = fullPathString != null ? fullPathString
						: new URL(iconPath);
				if (fullPathString != null) {
					return ImageDescriptor.createFromURL(fullPathString);
				}
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static class CreationToolEntry extends CombinedTemplateCreationEntry {

		private IElementType elementType;

		public CreationToolEntry(String label, String shortDesc,
				IElementType elementType, ImageDescriptor iconSmall,
				ImageDescriptor iconLarge) {
			super(label, shortDesc, null, iconSmall, iconLarge);
			this.elementType = elementType;
		}

		@Override
		public Tool createTool() {
			return new CreationTool(elementType);
		}

	}

	public static class ConnectionCreationToolEntry extends
			CombinedTemplateCreationEntry {

		private IElementType elementType;

		public ConnectionCreationToolEntry(String label, String shortDesc,
				IElementType elementType, ImageDescriptor iconSmall,
				ImageDescriptor iconLarge) {
			super(label, shortDesc, null, iconSmall, iconLarge);
			this.elementType = elementType;
		}

		@Override
		public Tool createTool() {
			return new ConnectionCreationTool(elementType);
		}

	}

}
