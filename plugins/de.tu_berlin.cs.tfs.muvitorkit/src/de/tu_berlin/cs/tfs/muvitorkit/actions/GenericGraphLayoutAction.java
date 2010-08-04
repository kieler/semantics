package de.tu_berlin.cs.tfs.muvitorkit.actions;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import de.tu_berlin.cs.tfs.muvitorkit.ui.utils.IconUtilTemplate;

import org.eclipse.draw2d.Animation;
import org.eclipse.draw2d.LayoutAnimator;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.graph.DirectedGraph;
import org.eclipse.draw2d.graph.DirectedGraphLayout;
import org.eclipse.draw2d.graph.Edge;
import org.eclipse.draw2d.graph.Node;
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
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;

/**
 * This action applies the Draw2d graph layouter to the EditPartViewer
 * containing some selected GraphicalEditPart.
 * 
 * @author "Tony Modica"
 */
public class GenericGraphLayoutAction extends SelectionAction {

	public static final String ID = "GenericGraphLayoutAction";

	private static final String LABEL = "Redistribute nodes";

	private static final String DESC = "Redistribute the nodes in a graphical viewer with a directed graph layout";

	/** Default padding for nodes in the graph (fixed spacing around nodes). */
	private static final int DEFAULT_PADDING = 25;

	/**
	 * The viewer containing the currently selected GraphicalEditPart
	 */
	private EditPartViewer viewer;

	/**
	 * @param part
	 *            the workbench part
	 */
	public GenericGraphLayoutAction(final IWorkbenchPart part) {
		super(part);
		setId(ID);
		setText(LABEL);
		setDescription(DESC);
		setToolTipText(DESC);
		setImageDescriptor(IconUtilTemplate.getDescriptor(
				IconUtilTemplate.GRAPH_LAYOUT, 16));
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

		// compute layout graph
		final DirectedGraph directedGraph = new DirectedGraph();
		directedGraph.setDefaultPadding(new Insets(DEFAULT_PADDING));
		// list to store the connection edit parts found between the nodes
		final Set<ConnectionEditPart> connections = new HashSet<ConnectionEditPart>();
		// a map to get the right source and target nodes for the edges in the
		// final graph
		final Map<NodeEditPart, Node> nodeEditPartToNodeMap = new HashMap<NodeEditPart, Node>();

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
				final Node node = new Node(nodeEditPart);
				node.x = bounds.x;
				node.y = bounds.y;
				node.height = bounds.height;
				node.width = bounds.width;
				nodeEditPartToNodeMap.put(nodeEditPart, node);
				directedGraph.nodes.add(node);

				// store connections adjacent to this node edit part
				// these must be converted to graph edges later
				connections.addAll(nodeEditPart.getSourceConnections());
				connections.addAll(nodeEditPart.getTargetConnections());
			}
		}

		// Convert connections to (Draw2d) Edges
		for (final ConnectionEditPart connection : connections) {
			// Graphs must not contain unresolvable cycles
			if (connection.getSource() != connection.getTarget()) {
				directedGraph.edges.add(new Edge(connection,
						nodeEditPartToNodeMap.get(connection.getSource()),
						nodeEditPartToNodeMap.get(connection.getTarget())));
			}
		}

		// perform layout
		new DirectedGraphLayout().visit(directedGraph);

		// combine commands that will apply the new node location values
		final CompoundCommand compCommand = new CompoundCommand();

		for (final Entry<NodeEditPart, Node> entry : nodeEditPartToNodeMap
				.entrySet()) {
			final NodeEditPart editPart = entry.getKey();
			final Rectangle bounds = editPart.getFigure().getBounds();
			final Node node = entry.getValue();
			final ChangeBoundsRequest request = new ChangeBoundsRequest(
					RequestConstants.REQ_MOVE);
			request
					.setMoveDelta(new Point(node.x - bounds.x, node.y
							- bounds.y));
			final Command command = editPart.getCommand(request);
			// Some edit parts may return unexecutable commands
			if (command != null && command.canExecute()) {
				compCommand.add(editPart.getCommand(request));
			}
		}

		// allow animation of the layout
		Animation.markBegin();
		((AbstractGraphicalEditPart) viewer.getContents()).getFigure()
				.addLayoutListener(LayoutAnimator.getDefault());

		// this allows to use this action independently from an editor
		if (getWorkbenchPart() == null || getCommandStack() == null) {
			compCommand.execute();
		} else {
			execute(compCommand);
		}

		// perform the layout animation
		Animation.run(500);
		((AbstractGraphicalEditPart) viewer.getContents()).getFigure()
				.removeLayoutListener(LayoutAnimator.getDefault());
	}

	/**
	 * This action is enabled if some graphical edit part is currently selected
	 * from which a viewer can be determined to be layout.
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
	 */
	public void setViewer(final EditPartViewer viewer) {
		this.viewer = viewer;
	}

}
