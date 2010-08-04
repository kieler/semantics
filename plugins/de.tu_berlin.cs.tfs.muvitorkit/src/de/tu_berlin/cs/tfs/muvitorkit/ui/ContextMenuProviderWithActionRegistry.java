package de.tu_berlin.cs.tfs.muvitorkit.ui;

import de.tu_berlin.cs.tfs.muvitorkit.actions.ExportViewerImageAction;
import de.tu_berlin.cs.tfs.muvitorkit.actions.TrimViewerAction;

import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.actions.ActionFactory;

/**
 * This ContextMenuProvider gets an {@link ActionRegistry} in its constructor
 * which is used to resolve actions via some key, usually their IDs. Some
 * methods are provided to append (dynamically) an action to several standard
 * GEF action groups.
 * 
 * @author Tony Modica
 */
public abstract class ContextMenuProviderWithActionRegistry extends
		ContextMenuProvider {

	public ContextMenuProviderWithActionRegistry(final EditPartViewer viewer) {
		super(viewer);
	}

	/**
	 * The {@link ActionRegistry} used to resolve the actions.
	 */
	private ActionRegistry actionRegistry;

	void setActionRegistry(final ActionRegistry registry) {
		actionRegistry = registry;
	}

	/**
	 * This is for registering some standard Actions that are used in the
	 * framework. Subclasses should override
	 * {@link #buildContextMenu(IMenuManager)} as usual.
	 * 
	 * @see org.eclipse.gef.ContextMenuProvider#menuAboutToShow(IMenuManager)
	 */
	@Override
	public void menuAboutToShow(final IMenuManager menu) {
		GEFActionConstants.addStandardActionGroups(menu);

		// Actions in UNDO group
		String group = GEFActionConstants.GROUP_UNDO;
		appendActionToGroup(menu, ActionFactory.UNDO.getId(), group);
		appendActionToGroup(menu, ActionFactory.REDO.getId(), group);

		// Actions in EDIT group
		group = GEFActionConstants.GROUP_EDIT;
		dynamicAppendActionToGroup(menu, GEFActionConstants.DIRECT_EDIT, group);
		appendActionToGroup(menu, ActionFactory.DELETE.getId(), group);

		// Actions in Copy/Cut/Paste group
		group = GEFActionConstants.GROUP_COPY;
		dynamicAppendActionToGroup(menu, ActionFactory.COPY.getId(), group);
		dynamicAppendActionToGroup(menu, ActionFactory.CUT.getId(), group);
		dynamicAppendActionToGroup(menu, ActionFactory.PASTE.getId(), group);

		group = GEFActionConstants.GROUP_VIEW;
		dynamicAppendActionToGroup(menu, ExportViewerImageAction.ID, group);
		dynamicAppendActionToGroup(menu, TrimViewerAction.ID, group);
		dynamicAppendActionToGroup(menu, GEFActionConstants.ALIGN_LEFT, group);
		dynamicAppendActionToGroup(menu, GEFActionConstants.ALIGN_CENTER, group);
		dynamicAppendActionToGroup(menu, GEFActionConstants.ALIGN_RIGHT, group);
		dynamicAppendActionToGroup(menu, GEFActionConstants.ALIGN_TOP, group);
		dynamicAppendActionToGroup(menu, GEFActionConstants.ALIGN_MIDDLE, group);
		dynamicAppendActionToGroup(menu, GEFActionConstants.ALIGN_BOTTOM, group);
		dynamicAppendActionToGroup(menu,
				GEFActionConstants.TOGGLE_RULER_VISIBILITY, group);
		dynamicAppendActionToGroup(menu,
				GEFActionConstants.TOGGLE_GRID_VISIBILITY, group);

		super.menuAboutToShow(menu);
	}

	/**
	 * Appends the specified action to the specified group.
	 * 
	 * @param menu
	 *            The menu to be used.
	 * @param actionId
	 *            The id of the action to be put in the context menu.
	 * @param group
	 *            The group to put in the action.
	 */
	protected void appendActionToGroup(final IMenuManager menu,
			final String actionId, final String group) {
		final IAction action = actionRegistry.getAction(actionId);
		if (null != action) {
			menu.appendToGroup(group, action);
		}
	}

	/**
	 * Appends the specified action to the menu edit group if the action is
	 * enabled.
	 * 
	 * @param menu
	 *            The menu to be used.
	 * @param actionId
	 *            The id of the action to be put in the context menu.
	 * @param group
	 *            The group to put in the action.
	 */
	protected void dynamicAppendActionToGroup(final IMenuManager menu,
			final String actionId, final String group) {
		final IAction action = actionRegistry.getAction(actionId);
		if (null != action && action.isEnabled()) {
			menu.appendToGroup(group, action);
		}
	}
}
