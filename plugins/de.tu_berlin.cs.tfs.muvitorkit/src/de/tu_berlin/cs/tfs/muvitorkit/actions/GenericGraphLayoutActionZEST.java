package de.tu_berlin.cs.tfs.muvitorkit.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import de.tu_berlin.cs.tfs.muvitorkit.ui.utils.IconUtilTemplate;

import org.eclipse.draw2d.Animation;
import org.eclipse.draw2d.LayoutAnimator;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.zest.layouts.InvalidLayoutConfiguration;
import org.eclipse.zest.layouts.LayoutAlgorithm;
import org.eclipse.zest.layouts.LayoutEntity;
import org.eclipse.zest.layouts.LayoutRelationship;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.DirectedGraphLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.GridLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.HorizontalLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.HorizontalTreeLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.RadialLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.SpringLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.VerticalLayoutAlgorithm;
import org.eclipse.zest.layouts.exampleStructures.SimpleGraph;

/**
 * This action applies the ZEST graph layouts to the EditPartViewer containing
 * some selected GraphicalEditPart. The user may select one of the ZEST layout
 * algorithms.
 * 
 * @author "Tony Modica"
 */
public class GenericGraphLayoutActionZEST extends SelectionAction {

	public static final String ID = "GenericGraphLayoutActionZEST";

	private static final String LABEL = "Redistribute nodes with a ZEST layout algortihm";

	private static final String DESC = "Redistribute the nodes in a graphical viewer with a ZEST layout algortihm";

	/**
	 * the algorithms ZEST provide
	 */
	static final ArrayList<LayoutAlgorithm> algorithms = new ArrayList<LayoutAlgorithm>();
	static {
		algorithms.add(new SpringLayoutAlgorithm(
				LayoutStyles.NO_LAYOUT_NODE_RESIZING));
		algorithms.add(new TreeLayoutAlgorithm(
				LayoutStyles.NO_LAYOUT_NODE_RESIZING));
		algorithms.add(new HorizontalTreeLayoutAlgorithm(
				LayoutStyles.NO_LAYOUT_NODE_RESIZING));
		algorithms.add(new RadialLayoutAlgorithm(
				LayoutStyles.NO_LAYOUT_NODE_RESIZING));
		algorithms.add(new GridLayoutAlgorithm(
				LayoutStyles.NO_LAYOUT_NODE_RESIZING));
		algorithms.add(new HorizontalLayoutAlgorithm(
				LayoutStyles.NO_LAYOUT_NODE_RESIZING));
		algorithms.add(new VerticalLayoutAlgorithm(
				LayoutStyles.NO_LAYOUT_NODE_RESIZING));
		algorithms.add(new DirectedGraphLayoutAlgorithm(
				LayoutStyles.NO_LAYOUT_NODE_RESIZING));
	}

	static final ArrayList<String> algorithmNames = new ArrayList<String>();
	static {
		algorithmNames.add("Spring");
		algorithmNames.add("Tree (vertical)");
		algorithmNames.add("Tree (horizontal)");
		algorithmNames.add("Radial");
		algorithmNames.add("Grid");
		algorithmNames.add("Horizontal");
		algorithmNames.add("Vertical");
		algorithmNames.add("Directed Graph (draw2D)");
	}

	/**
	 * the currently selected layout algorithm
	 */
	LayoutAlgorithm currentAlgorithm;

	/**
	 * the viewer containing the currently selected GraphicalEditPart
	 */
	private EditPartViewer viewer;

	/**
	 * The constructor prepares the menu to selected the layout algorithm from
	 * 
	 * @param part
	 *            the workbench part
	 */
	public GenericGraphLayoutActionZEST(final IWorkbenchPart part) {
		super(part);
		setId(ID);
		setText(LABEL);
		setDescription(DESC);
		setToolTipText(DESC);
		setImageDescriptor(IconUtilTemplate.getDescriptor(
				IconUtilTemplate.GRAPH_LAYOUT, 16));
		currentAlgorithm = algorithms.get(0);
		setMenuCreator(new IMenuCreator() {

			Menu menu;

			public void dispose() {
				if (menu != null) {
					menu.dispose();
					menu = null;
				}
			}

			public Menu getMenu(final Control parent) {
				if (menu == null) {
					menu = new Menu(parent);
					fillMenu();
				}
				return menu;
			}

			public Menu getMenu(final Menu parent) {
				// not intended as submenu
				return null;
			}

			private void fillMenu() {
				for (final String algorithmName : algorithmNames) {
					final MenuItem item = new MenuItem(menu, SWT.RADIO);
					item.setText(algorithmName);
					item.addSelectionListener(new SelectionAdapter() {
						@Override
						public void widgetSelected(final SelectionEvent e) {
							final int index = menu.indexOf((MenuItem) e.widget);
							currentAlgorithm = algorithms.get(index);
						}
					});
				}
				// select first item by default
				menu.getItem(0).setSelection(true);
			}
		});

	}

	/**
	 * Gets the Graph Layout Command and executes it.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void run() {
		// when invoking directly, a viewer must be set manually!
		if (viewer == null) {
			return;
		}

		final SimpleGraph graph = new SimpleGraph();
		final List<NodeEditPart> nodesToMove = new ArrayList<NodeEditPart>();
		final Set<ConnectionEditPart> connections = new HashSet<ConnectionEditPart>();

		// add nodes to the graph
		for (final EditPart editPart : (Collection<EditPart>) viewer
				.getContents().getChildren()) {
			if (editPart instanceof NodeEditPart) {
				final NodeEditPart nodeEditPart = (NodeEditPart) editPart;
				final Rectangle bounds = ((GraphicalEditPart) editPart)
						.getFigure().getBounds();
				// ignore figures without bounds
				if (bounds == null) {
					continue;
				}
				final LayoutEntity node = graph.addObjectNode(nodeEditPart);
				node.setLocationInLayout(bounds.x, bounds.y);
				node.setSizeInLayout(bounds.width, bounds.height);
				nodesToMove.add(nodeEditPart);
				// store connections adjacent to this node edit part
				// these must be converted to graph edges later
				connections.addAll(nodeEditPart.getSourceConnections());
				connections.addAll(nodeEditPart.getTargetConnections());
			}
		}

		// add connections to the graph
		for (final ConnectionEditPart connection : connections) {
			final NodeEditPart source = (NodeEditPart) connection.getSource();
			final NodeEditPart target = (NodeEditPart) connection.getTarget();
			// Graphs must not contain unresolvable cycles
			if (source != target && nodesToMove.contains(source)
					&& nodesToMove.contains(target)) {
				graph.addObjectRelationship(source, target, false, 1);
			}
		}

		// extract graph entities and relationships
		final List<?> entitiesList = graph.getEntities();
		final LayoutEntity[] entities = new LayoutEntity[entitiesList.size()];
		entitiesList.toArray(entities);
		final List<?> relationshipList = graph.getRelationships();
		final LayoutRelationship[] relationships = new LayoutRelationship[relationshipList
				.size()];
		relationshipList.toArray(relationships);

		// perform layout
		try {
			currentAlgorithm.applyLayout(entities, relationships, 15.0, 15.0,
					800, 600, false, false);
		} catch (final InvalidLayoutConfiguration e) {
			e.printStackTrace();
		}

		// combine commands that will apply the new node location values
		final CompoundCommand compCommand = new CompoundCommand();

		for (final NodeEditPart editPart : nodesToMove) {
			final LayoutEntity node = graph.addObjectNode(editPart);
			final Rectangle bounds = editPart.getFigure().getBounds();
			final ChangeBoundsRequest request = new ChangeBoundsRequest(
					RequestConstants.REQ_MOVE);
			request.setMoveDelta(new Point(node.getXInLayout() - bounds.x, node
					.getYInLayout()
					- bounds.y));
			final Command command = editPart.getCommand(request);
			// Some editparts may return unexecutable commands
			if (command != null && command.canExecute()) {
				compCommand.add(editPart.getCommand(request));
			}
		}

		Animation.markBegin();
		((AbstractGraphicalEditPart) viewer.getContents()).getFigure()
				.addLayoutListener(LayoutAnimator.getDefault());
		// this allows to use this action independently from an editor
		if (getWorkbenchPart() == null || getCommandStack() == null) {
			compCommand.execute();
		} else {
			execute(compCommand);
		}
		Animation.run(500);
		((AbstractGraphicalEditPart) viewer.getContents()).getFigure()
				.removeLayoutListener(LayoutAnimator.getDefault());
	}

	/**
	 * This action is enabled if some graphical edit part is currently selected
	 * from which a viewer can be determined to be trimmed.
	 */
	@Override
	protected boolean calculateEnabled() {
		viewer = null;
		if (getSelection() == null) {
			return false;
		}
		final IStructuredSelection selection = (IStructuredSelection) getSelection();
		for (final Object selectedObject : selection.toList()) {
			if (selectedObject instanceof GraphicalEditPart) {
				viewer = ((GraphicalEditPart) selectedObject).getViewer();
				return viewer != null;
			}
		}
		return false;
	}

	/**
	 * This setter allows universal usage of this action. Just call the
	 * constructor with <code>null</code> and set the viewer for layout
	 * manually.
	 * 
	 * @param viewer
	 * @see #setAlgorithm(String)
	 */
	public void setViewer(final EditPartViewer viewer) {
		this.viewer = viewer;
	}

	/**
	 * This setter allows universal usage of this action. Just call the
	 * constructor with <code>null</code> and set the algorithm for layout
	 * manually.
	 * 
	 * @param name
	 *            the name of the algorithm to use. Must be one of
	 *            {@value #algorithms}.
	 * @see #setViewer(EditPartViewer)
	 */
	public void setAlgorithm(final String name) {
		currentAlgorithm = algorithms.get(algorithmNames.indexOf(name));
	}

}
