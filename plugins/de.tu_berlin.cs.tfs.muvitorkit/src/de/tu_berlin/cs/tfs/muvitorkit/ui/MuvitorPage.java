package de.tu_berlin.cs.tfs.muvitorkit.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EventObject;
import java.util.Iterator;
import java.util.List;

import de.tu_berlin.cs.tfs.muvitorkit.actions.ExportViewerImageAction;
import de.tu_berlin.cs.tfs.muvitorkit.actions.MoveNodeAction;
import de.tu_berlin.cs.tfs.muvitorkit.actions.MuvitorActionBarContributor;
import de.tu_berlin.cs.tfs.muvitorkit.actions.SelectAllInMultiViewerAction;
import de.tu_berlin.cs.tfs.muvitorkit.actions.TrimViewerAction;
import de.tu_berlin.cs.tfs.muvitorkit.animation.IGraphicalViewerProvider;
import de.tu_berlin.cs.tfs.muvitorkit.gef.palette.MuvitorPaletteRoot;
import de.tu_berlin.cs.tfs.muvitorkit.ui.utils.MuvitorNotifierService;
import de.tu_berlin.cs.tfs.muvitorkit.ui.utils.SelectionProviderIntermediate;
import de.tu_berlin.cs.tfs.muvitorkit.ui.utils.ZoomManagerDelegate;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Preferences;
import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.Viewport;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.parts.ScrollableThumbnail;
import org.eclipse.draw2d.parts.Thumbnail;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.KeyHandler;
import org.eclipse.gef.KeyStroke;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.commands.CommandStackListener;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.rulers.RulerProvider;
import org.eclipse.gef.ui.actions.ActionBarContributor;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.DeleteAction;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.gef.ui.actions.UpdateAction;
import org.eclipse.gef.ui.actions.WorkbenchPartAction;
import org.eclipse.gef.ui.actions.ZoomComboContributionItem;
import org.eclipse.gef.ui.actions.ZoomInAction;
import org.eclipse.gef.ui.actions.ZoomOutAction;
import org.eclipse.gef.ui.palette.FlyoutPaletteComposite;
import org.eclipse.gef.ui.palette.PaletteViewer;
import org.eclipse.gef.ui.palette.PaletteViewerProvider;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.gef.ui.parts.GraphicalViewerKeyHandler;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.gef.ui.parts.SelectionSynchronizer;
import org.eclipse.gef.ui.rulers.RulerComposite;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.SubActionBars;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.RetargetAction;
import org.eclipse.ui.part.IPage;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.part.Page;
import org.eclipse.ui.part.PageBookView;
import org.eclipse.ui.views.properties.IPropertySheetPage;

/**
 * This is an {@link IPage} that contains some {@link GraphicalViewer}s as well
 * as a {@link FlyoutPaletteComposite} and that manages changing of the current
 * viewer. It is meant to be used in a {@link MuvitorPageBookView} like a
 * regular graphical GEF editor. Like an GEF editor this page has its own
 * {@link EditDomain} and {@link ActionRegistry} but uses the
 * {@link CommandStack} and some general action instances (which we call shared)
 * from the main {@link MuvitorTreeEditor}.
 * 
 * <p>
 * On calling {@link MuvitorTreeEditor#showView(String, EObject)}) with the ID
 * (as in plugin.xml) of this page's parent {@link MuvitorPageBookView}, the top
 * model element and a parent editor are set in the constructor. A
 * {@link ZoomManagerDelegate} for a {@link ZoomComboContributionItem} is
 * provided via {@link #getAdapter(Class)} to the workbench page's part service.
 * 
 * <p>
 * This class should be used in the MuvitorKit (with a central
 * {@link MuvitorTreeEditor}) only. But for documentation, the following
 * enumerates what the main editor provides to this page via getAdapter(): <br>
 * <ul>
 * <li>a shared central {@link CommandStack} which will be used for this page's
 * {@link EditDomain} and to update actions.
 * <li>a {@link SelectionSynchronizer} to synchronize this page's
 * {@link GraphicalViewer} with {@link EditPartViewer}s in other view components
 * of this editor that show parts of the main editor's model.
 * <li>a {@link KeyHandler} (optional, may be null) which will be set as parent
 * for the Keyhandler of this page's {@link GraphicalViewer}.
 * </ul>
 * </p>
 * 
 * <p>
 * When initialized and in {@link #createControl(Composite)} this class does the
 * following:
 * <ol>
 * <li>The page registers itself as an EMF eAdapter to the {@link EObject} model
 * to be able to react on notifications of the EMF model. Subclasses may use
 * this as described below.
 * <li>The page registers itself as an {@link CommandStackListener} on the
 * editor's {@link CommandStack} to update actions on command stack changes.
 * <li>A {@link FlyoutPaletteComposite} is being created which uses the
 * {@link Preferences} of the {@link Plugin} delivered by the parent editor.
 * <li>Some {@link MultiViewerPageViewer}s (the number depends on
 * {@link #getViewerContents()} are being created and added to the
 * {@link SelectionSynchronizer} delivered by the parent editor. The objects
 * returned by {@link #getViewerContents()} are set as contents of these
 * viewers. <br>
 * <li>A {@link ScrollableThumbnail} showing a miniature overview of the current
 * viewer is being installed below the palette.
 * <li>The first viewer is set as the current viewer.
 * <li>Actions are being created: {@link ZoomInAction}, {@link ZoomOutAction}
 * and custom Actions defined in the abstract method
 * {@link #createCustomActions()}. Handles for some standard
 * {@link RetargetAction}s from the {@link ActionFactory} besides zooming and
 * undo/redo are being registered if they have been created in
 * {@link #createCustomActions()}: COPY, CUT, PASTE, DELETE. <br>
 * </ol>
 * </p>
 * <b>For a guide on how to create custom actions have a look at the
 * documentation of {@link #createCustomActions()}.</b>
 * 
 * <p>
 * This page uses an own minimally modified kind of edit part viewer, the
 * {@link MultiViewerPageViewer}. Such a viewer notices if a mouse click occurs
 * on it and sets itself as the current viewer which performs the following
 * updates by calling {@link #setCurrentViewer(MultiViewerPageViewer)} for
 * itself:
 * <ol>
 * <li>The clicked viewer is set as {@link ISelectionProvider} of the
 * {@link IPageSite}, so all components and in particular all
 * {@link SelectionAction}s of the editor are aware of the current selection in
 * the current viewer.
 * <li>The page registers itself as an {@link ISelectionChangedListener} on the
 * viewer to be able to update the {@link UpdateAction}s in its
 * {@link ActionRegistry} on selection changes.
 * <li>The {@link ScrollableThumbnail} is being redirected to show the new
 * current viewer.
 * <li>The {@link ZoomManager} of the clicked viewer is set as delegating target
 * in the {@link ZoomManagerDelegate}, so the central
 * {@link ZoomComboContributionItem} in the editor's action bar acts on the
 * currently selected viewer.
 * </ol>
 * <b>The contents of an existing viewer may be replaced with another object via
 * {@link #setViewersContents(int, EObject)}. As well, you may hide or restore a
 * particular viewer on this page with
 * {@link #setViewerVisibility(int, boolean)}</b>
 * </p>
 * 
 * <p>
 * <b>The following methods have to be implemented by subclasses.</b> Consider
 * the documentation of each method as well, as they provide some hints!
 * <ul>
 * <li> {@link #createCustomActions()}: custom actions may be registered here.
 * <li> {@link #createContextMenuProvider(EditPartViewer)}: must return a
 * {@link ContextMenuProviderWithActionRegistry} defining the context menu for
 * the passed viewer.
 * <li> {@link #createEditPartFactory()}: must return a suitable
 * {@link EditPartFactory} to create edit parts for the model elements.
 * <li> {@link #createPaletteRoot()}: must return a {@link MuvitorPaletteRoot}
 * defining what the palette should contain.
 * <li> {@link #getThumbSashWeights()}: must return an array of two integers
 * describing the ratio of how the fly-out composite's space is divided between
 * the palette and the thumbnail.
 * <li> {@link #getViewerContents()} specifies the objects that will be set as
 * contents for the viewers.
 * <li> {@link #setupKeyHandler(KeyHandler)}: In this method {@link KeyStroke}s
 * may be associated with previously defined actions for the viewers.
 * <li>
 * {@link #notifyChanged(Notification)}: Optionally, this may be overridden for
 * reacting on model change notifications. See there for details on overriding.
 * </ul>
 * </p>
 * 
 * <p>
 * This page is prepared to work with the MuvitorKits animation package; it
 * implements the {@link IGraphicalViewerProvider} interface.
 * </p>
 * 
 * <p>
 * Originally, this class was considered to roughly work like
 * {@link GraphicalEditorWithFlyoutPalette}.
 * </p>
 * 
 * @author Tony Modica
 */
public abstract class MuvitorPage extends Page implements IAdaptable,
		CommandStackListener, IGraphicalViewerProvider, ISelectionListener {

	/**
	 * The action registry that holds the actions for this page.
	 */
	private final ActionRegistry actionRegistry = new ActionRegistry();

	/**
	 * The main {@link Control} of this page.
	 */
	private FlyoutPaletteComposite flyoutPaletteComposite;

	/**
	 * The list of viewers that are hosted by this page. Its length matches
	 * {@link #getNumberOfViewers()} and the length of viewerContents.
	 */
	private final List<MultiViewerPageViewer> viewers = new ArrayList<MultiViewerPageViewer>();

	/**
	 * The viewer that is
	 * <ul>
	 * <li>showed in the {@link Thumbnail},
	 * <li>the current {@link ISelectionProvider} for this page's
	 * {@link IPageSite} and
	 * <li>observed for selection changes
	 * <li>providing a {@link ZoomManager} for the zoom actions via a
	 * {@link ZoomManagerDelegate}.
	 * </ul>
	 * 
	 * @see #setCurrentViewer(roneditor.ui.part.createActions.MultiViewerPageViewer)
	 */
	private MultiViewerPageViewer currentViewer;

	/**
	 * A thumbnail showing a miniature of what the viewer contains.
	 */
	private ScrollableThumbnail thumbnail;

	/**
	 * The {@link EditDomain} managing this page like an encapsulated editor.
	 */
	private EditDomain editDomain;

	/**
	 * This subclassed {@link ZoomManager} is set for the zoom actions and the
	 * returned by {@link #getAdapter(Class)} for the
	 * {@link ZoomComboContributionItem} created in the
	 * {@link ActionBarContributor}. It delegates to the {@link ZoomManager} of
	 * {@link #currentViewer}.
	 * 
	 * @see #setCurrentViewer(MultiViewerPageViewer)
	 */
	private final ZoomManagerDelegate zoomManagerDelegate = new ZoomManagerDelegate();

	/**
	 * This enables this page to switch the actual selection-providing viewer.
	 * 
	 * @see #setCurrentViewer(MultiViewerPageViewer)
	 */
	private final SelectionProviderIntermediate selectionProvider = new SelectionProviderIntermediate();

	/**
	 * A shared {@link KeyHandler} for the viewers on this page.
	 */
	private KeyHandler keyHandler;

	/**
	 * The EMF adapter listening to this pages's model EObject.
	 */
	private final Adapter adapter = new AdapterImpl() {
		@Override
		public void notifyChanged(final Notification msg) {
			MuvitorPage.this.notifyChanged(msg);
			MuvitorNotifierService.notifyListeners(msg);
		}
	};

	private final MuvitorPageBookView view;

	/**
	 * @param view
	 *            the MuvitorPageBookView that hosts this page
	 */
	public MuvitorPage(final MuvitorPageBookView view) {
		this.view = view;
	}

	/**
	 * @return The model of this page (and its view)
	 */
	public final EObject getModel() {
		return view.getModel();
	}

	/**
	 * Registers this page as eAdapter listener on its model and as listener on
	 * the parent {@link MuvitorTreeEditor}'s {@link CommandStack}.
	 * 
	 * <p>
	 * Subclasses may extendto perform further initializations butm ust call
	 * super implementation! Remember to clean them up in {@link #dispose()} if
	 * needed!.
	 */
	@Override
	public void init(final IPageSite pageSite) {
		super.init(pageSite);
		getModel().eAdapters().add(adapter);
		((CommandStack) getEditor().getAdapter(CommandStack.class))
				.addCommandStackListener(this);
	}

	/**
	 * Creates and registers some standard GEF actions and some generic Muvitor
	 * actions for this page's {@link ActionRegistry}. See the code below for
	 * details. Instances of universal actions like DeleteAction are shared with
	 * the {@link MuvitorTreeEditor}.
	 * 
	 * <p>
	 * See the code below for generic and standard actions that are installed by
	 * default in Muvitors.
	 * 
	 * @see #createCustomActions()
	 */
	private final void createActions() {
		// create standard zoom actions for this page
		registerActionAsHandler(new ZoomInAction(zoomManagerDelegate));
		registerActionAsHandler(new ZoomOutAction(zoomManagerDelegate));

		// register shared standard GEF actions from the editor
		// save is treated specially and does not need this
		registerSharedActionAsHandler(ActionFactory.REVERT.getId());
		registerSharedActionAsHandler(ActionFactory.DELETE.getId());
		registerSharedActionAsHandler(ActionFactory.UNDO.getId());
		registerSharedActionAsHandler(ActionFactory.REDO.getId());

		registerActionAsHandler(new SelectAllInMultiViewerAction(this));

		// register shared actions from editor to put them in the local context
		// menu
		registerSharedAction(ExportViewerImageAction.ID);
		registerSharedAction(TrimViewerAction.ID);
		registerSharedAction(GEFActionConstants.TOGGLE_RULER_VISIBILITY);
		registerSharedAction(GEFActionConstants.TOGGLE_GRID_VISIBILITY);

		// register shared standard node-moving actions from the main editor for
		// the local key handler
		registerSharedAction(MoveNodeAction.LEFT);
		registerSharedAction(MoveNodeAction.RIGHT);
		registerSharedAction(MoveNodeAction.UP);
		registerSharedAction(MoveNodeAction.DOWN);
		registerSharedAction(MoveNodeAction.PREC_LEFT);
		registerSharedAction(MoveNodeAction.PREC_RIGHT);
		registerSharedAction(MoveNodeAction.PREC_UP);
		registerSharedAction(MoveNodeAction.PREC_DOWN);

		// register shared standard aligning actions from the main editor for
		// the context menu
		registerSharedAction(GEFActionConstants.ALIGN_LEFT);
		registerSharedAction(GEFActionConstants.ALIGN_CENTER);
		registerSharedAction(GEFActionConstants.ALIGN_RIGHT);
		registerSharedAction(GEFActionConstants.ALIGN_TOP);
		registerSharedAction(GEFActionConstants.ALIGN_MIDDLE);
		registerSharedAction(GEFActionConstants.ALIGN_BOTTOM);

		createCustomActions();
	}

	/**
	 * To be implemented by subclasses.
	 * 
	 * <p>
	 * In his method, you can create IAction instances to be used in this page;
	 * in the viewers' context menu, by keys, or on the page's tool bar. For
	 * this, there are four methods that should cover all needs:
	 * {@link #registerAction(IAction)},
	 * {@link #registerActionAsHandler(IAction)},
	 * {@link #registerSharedAction(String)}, and
	 * {@link #registerSharedActionAsHandler(String)}. See their documentation
	 * for a description, when to use which method.
	 * 
	 * <p>
	 * To put actions on the tool bar, you may add them to the tool bar manager
	 * (see {@link #getToolBarManager()}) after registering.
	 * 
	 * <p>
	 * {@link WorkbenchPartAction}s and {@link SelectionAction}s created here
	 * should get the editor ({@link #getEditor()}) as workbench part in their
	 * constructor.
	 * 
	 * <p>
	 * <b>Consider sharing actions instances with the main editor, if possible!
	 * </b>
	 * 
	 * @see #createActions()
	 */
	abstract protected void createCustomActions();

	/**
	 * Registers an {@link IAction} instance with this page's
	 * {@link ActionRegistry}.
	 * 
	 * <p>
	 * Call this method in {@link #createCustomActions()} if you want to use an
	 * action instance in the context menu or put it on the page's tool bar.
	 * 
	 * <p>
	 * <b>Do not use this method if you</b>
	 * <ul>
	 * <li>want to register a handle action instance for a
	 * {@link RetargetAction} defined in the {@link MuvitorActionBarContributor}
	 * (use {@link #registerActionAsHandler(IAction)} instead), or
	 * <li>if you want to or could reuse an action instance from the parent
	 * editor (use {@link #registerSharedAction(String)} instead), or
	 * <li>both together (like this page does already e.g. with the
	 * {@link DeleteAction}) (use {@link #registerSharedActionAsHandler(String)}
	 * instead).
	 * </ul>
	 * 
	 * @param action
	 *            the action to be registered
	 * @return the action for convenience
	 * 
	 * @see #createCustomActions()
	 * @see #createActions()
	 * @see #getToolBarManager()
	 */
	protected final IAction registerAction(final IAction action) {
		getActionRegistry().registerAction(action);
		return action;
	}

	/**
	 * Registers an {@link IAction} instance with this page's
	 * {@link ActionRegistry} and sets it as the handler action (in this page)
	 * for a {@link RetargetAction} that has been defined in the
	 * {@link MuvitorActionBarContributor} with the same ID as the action.
	 * 
	 * <p>
	 * Call this method in {@link #createCustomActions()} if you want to use an
	 * action instance (as a handler for a RetargetAction) in the context menu
	 * or put it on the page's tool bar.
	 * 
	 * <p>
	 * <b>Do not use this method if you</b>
	 * <ul>
	 * <li>just want to register a regular action not being a handle (use
	 * {@link #registerAction(IAction)} instead), or
	 * <li>if you want to or could reuse an action instance from the parent
	 * editor (use {@link #registerSharedAction(String)} instead), or
	 * <li>reuse a handler from the editor (like this page does already with the
	 * {@link DeleteAction}) (use {@link #registerSharedActionAsHandler(String)}
	 * instead).
	 * </ul>
	 * 
	 * <em>Technical remark: Registering handles has to be done only once since
	 * {@link PageBookView#partActivated(org.eclipse.ui.IWorkbenchPart)} takes
	 * care about refreshing the global action handlers for the ViewSite with
	 * the global action handlers defined for the {@link SubActionBars} of this
	 * {@link IPageSite}. </em>
	 * 
	 * @param action
	 *            the action to be registered
	 * @return the action for convenience
	 * 
	 * @see #createCustomActions()
	 * @see #createActions()
	 * @see #getToolBarManager()
	 */
	protected final IAction registerActionAsHandler(final IAction action) {
		final String id = action.getId();
		getSite().getActionBars().setGlobalActionHandler(id,
				registerAction(action));
		return action;
	}

	/**
	 * Registers an {@link IAction} instance from the parent
	 * {@link MuvitorTreeEditor}'s {@link ActionRegistry} with this page's
	 * action registry.
	 * 
	 * <p>
	 * Call this method in {@link #createCustomActions()} if you want to reuse
	 * an action instance from the editor in the context menu or put it on the
	 * page's tool bar. Considering this for most Actions is strongly advised!
	 * 
	 * <p>
	 * <b>Do not use this method if you</b>
	 * <ul>
	 * <li>just want to register a new action instance not being shared with the
	 * parent editor (use {@link #registerAction(IAction)} instead), or
	 * <li>want to register a handle action instance for a
	 * {@link RetargetAction} defined in the {@link MuvitorActionBarContributor}
	 * (use {@link #registerActionAsHandler(IAction)} instead), or
	 * <li>if you want to reuse a handler from the editor (like this page does
	 * already with the {@link DeleteAction}) (use
	 * {@link #registerSharedActionAsHandler(String)} instead).
	 * </ul>
	 * 
	 * @param id
	 *            the ID of the action to be retrieved from the parent editor's
	 *            action registry
	 * @return the action from the parent editor for convenience
	 * 
	 * @see #createCustomActions()
	 * @see #createActions()
	 * @see #getToolBarManager()
	 */
	protected final IAction registerSharedAction(final String id) {
		final ActionRegistry editorRegistry = (ActionRegistry) getEditor()
				.getAdapter(ActionRegistry.class);
		Assert
				.isNotNull(editorRegistry,
						"The editor did not deliver an ActionRegistry instance for the page!");

		final IAction action = editorRegistry.getAction(id);
		Assert.isNotNull(action,
				"The editor did not deliver an action with the id '" + id
						+ "' for the page!");
		return registerAction(action);
	}

	/**
	 * Registers an {@link IAction} instance from the parent editor's
	 * {@link ActionRegistry} with this page's action registry and sets it as
	 * the handler action (in this page) for a {@link RetargetAction} that has
	 * been defined in the {@link MuvitorActionBarContributor} with the same ID
	 * as the action.
	 * 
	 * <p>
	 * Call this method in {@link #createCustomActions()} if you want to reuse
	 * an action handler for a RetargetAction from the editor in the context
	 * menu or put it on the page's tool bar. Considering this for most handle
	 * Actions is strongly advised!
	 * 
	 * <p>
	 * <b>Do not use this method if you</b>
	 * <ul>
	 * <li>just want to register a regular action not being a handle (use
	 * {@link #registerAction(IAction)} instead), or
	 * <li>if you want to register a new action handler not being shared with
	 * the parent editor (use {@link #registerActionAsHandler(IAction)}
	 * instead), or
	 * <li>if you want to or could reuse an action instance from the parent
	 * editor (use {@link #registerSharedAction(String)} instead).
	 * </ul>
	 * 
	 * <em>Technical remark: Registering handles has to be done only once since
	 * {@link PageBookView#partActivated(org.eclipse.ui.IWorkbenchPart)} takes
	 * care about refreshing the global action handlers for the ViewSite with
	 * the global action handlers defined for the {@link SubActionBars} of this
	 * {@link IPageSite}. </em>
	 * 
	 * @param id
	 *            the ID of the action to be retrieved from the parent editor's
	 *            action registry
	 * @return the action from the parent editor for convenience
	 * 
	 * @see #createCustomActions()
	 * @see #createActions()
	 * @see #getToolBarManager()
	 */
	protected final IAction registerSharedActionAsHandler(final String id) {
		final IAction editorAction = registerSharedAction(id);
		getSite().getActionBars().setGlobalActionHandler(id, editorAction);
		return editorAction;
	}

	/**
	 * This method creates all the visual parts and configures them:
	 * 
	 * <ol>
	 * <li>A {@link FlyoutPaletteComposite} is created and associated with the
	 * {@link Preferences} of the {@link #editor}'s {@link Plugin}.
	 * <li>With {@link #createGraphicalViewerComposite()} a composite hosting
	 * the {@link MultiViewerPageViewer}s is being created and set as graphical
	 * control for the {@link #flyoutPaletteComposite}.
	 * <li>The {@link ScrollableThumbnail} is being created with
	 * {@link #installThumbnailInPalette()}.
	 * <li>The first viewer in {@link #viewers} is set with
	 * {@link #setCurrentViewer(MuvitorPage.MultiViewerPageViewer)} .
	 * <li>The {@link #selectionProvider} intermediate is set as selection
	 * provider for this page's site.
	 * <li>This page starts listening on the global selection service for
	 * selection changes.
	 * <li>
	 * Actions are being created via {@link #createActions()}.
	 * </ol>
	 * 
	 * @see org.eclipse.ui.part.Page#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public final void createControl(final Composite parent) {
		final Plugin plugin = MuvitorActivator.getDefault();
		flyoutPaletteComposite = new FlyoutPaletteComposite(parent, SWT.NONE,
				getSite().getPage(),
				new PaletteViewerProvider(getEditDomain()),
				FlyoutPaletteComposite.createFlyoutPreferences(plugin
						.getPluginPreferences()));

		// This sets the state of the flyout palette to "pinned open"
		plugin.getPluginPreferences().setValue("org.eclipse.gef.pstate", 4);

		// create actions, this is done here because zoom actions need a
		// viewer's zoom manager
		createActions();

		// add key strokes defined by concrete subclasses
		setupKeyHandler(getSharedKeyHandler());

		// create control that hosts graphical viewer
		final Composite viewerControl = createGraphicalViewerComposite();
		flyoutPaletteComposite.setGraphicalControl(viewerControl);

		// install thumbnail
		installThumbnailInPalette();

		// set first viewer as default current viewer
		setCurrentViewer(getViewers().get(0));

		// set selection provider intermediate for the page's site
		getSite().setSelectionProvider(selectionProvider);

		// a listener to the global selection service
		getSite().getPage().addSelectionListener(this);
	}

	/**
	 * @return A lazily created {@link EditDomain} with slightly modified
	 *         selection behavior.
	 */
	private final EditDomain getEditDomain() {
		if (null == editDomain) {
			editDomain = new EditDomain();
			editDomain.setPaletteRoot(createPaletteRoot());
			final CommandStack commandStack = (CommandStack) getEditor()
					.getAdapter(CommandStack.class);
			Assert
					.isNotNull(commandStack,
							"The editor did not deliver a command stack instance for the page!");
			editDomain.setCommandStack(commandStack);
		}
		return editDomain;
	}

	/**
	 * Subclasses must implement to specify the PaletteRoot that should be used
	 * by this page's {@link EditDomain} and which defines the contents of the
	 * palette.
	 * <p>
	 * Use a {@link MuvitorPaletteRoot} for convenience.
	 * 
	 * @return The {@link MuvitorPaletteRoot} for the {@link EditDomain} of this
	 *         page.
	 */
	abstract protected MuvitorPaletteRoot createPaletteRoot();

	/**
	 * Creates a {@link Thumbnail} on the {@link Control} of this page's
	 * {@link PaletteViewer}.
	 * 
	 * @see #getThumbSashWeights()
	 */
	private final void installThumbnailInPalette() {
		// get the FigureCanvas of the PaletteViewer
		final FigureCanvas figureCanvas = (FigureCanvas) getEditDomain()
				.getPaletteViewer().getControl();

		// install a SashForm on the parent of the FigureCanvas
		final SashForm sashForm = new SashForm(figureCanvas.getParent(),
				SWT.VERTICAL);

		// move the original figureCanvas onto the SashForm
		figureCanvas.setParent(sashForm);

		// create a new FigureCanvas and put a new Thumbnail on it
		final FigureCanvas thumbCanvas = new FigureCanvas(sashForm);

		thumbnail = new ScrollableThumbnail();
		thumbnail.setBorder(new MarginBorder(3));
		thumbCanvas.setContents(thumbnail);

		// adjust the position of the thumbnail on the canvas
		sashForm.setWeights(getThumbSashWeights());
	}

	/**
	 * The two values in the returned array specify how the fly-out composite's
	 * space is being divided between the palette entries and the thumbnail in
	 * the palette. When implementing, this template should be used: <br>
	 * <code> return new int[] { Palette_Weight, Thumb_Weight }; </code> The
	 * pair (3,1) is a good default value, but you may override this method.
	 * 
	 * @return An array of 2 integers describing the ratio of the palette to the
	 *         thumbnail.
	 */
	protected int[] getThumbSashWeights() {
		return new int[] { 3, 1 };
	}

	/**
	 * This method creates an configures some {@link MultiViewerPageViewer}
	 * according to {@link #getNumberOfViewers()} and adds them to a
	 * {@link SashForm}:
	 * 
	 * <p>
	 * For each newly created graphical viewer
	 * <ol>
	 * <li>the shared {@link #editDomain} is set,
	 * <li>a shared {@link KeyHandler} (configured via
	 * {@link #setupKeyHandler(KeyHandler)}) is set,
	 * <li>it is registered with the {@link #editor}'s
	 * {@link SelectionSynchronizer},
	 * <li>a shared {@link EditPartFactory} returned by
	 * {@link #createEditPartFactory()} is set,
	 * <li>a unique {@link ContextMenuProviderWithActionRegistry} returned by
	 * {@link #createContextMenuProvider(EditPartViewer)},
	 * <li>an object of the array {@link #getViewerContents()} returns is set as
	 * the contents of the viewers. This depends on the viewers' position.
	 * <li>The {@link ZoomManager} of the viewer is configured with some zoom
	 * levels.
	 * </ol>
	 * </p>
	 * 
	 * @return The {@link SashForm} composite holding all the viewers.
	 */
	private final Composite createGraphicalViewerComposite() {
		// create composite that hold the graphical viewers
		final Composite viewerComposite = new SashForm(flyoutPaletteComposite,
				SWT.BORDER);
		viewerComposite.setLayout(new FillLayout());
		viewerComposite.setBackground(flyoutPaletteComposite.getDisplay()
				.getSystemColor(SWT.COLOR_LIST_BACKGROUND));
		viewerComposite.setForeground(flyoutPaletteComposite.getDisplay()
				.getSystemColor(SWT.COLOR_LIST_FOREGROUND));
		viewerComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

		// prepare shared edit part factory
		final EditPartFactory editPartFactory = createEditPartFactory();

		// prepare contents to set
		final EObject[] contents = getViewerContents();
		final int contentsSize = contents.length;

		// create viewers
		for (int i = 0; i < contentsSize; i++) {
			final MultiViewerPageViewer viewer = new MultiViewerPageViewer();
			getEditDomain().addViewer(viewer);

			final RulerComposite rulerComp = new RulerComposite(
					viewerComposite, SWT.NONE);
			// set the new viewer on the ruler composite
			viewer.createControl(rulerComp);

			viewers.add(viewer);

			// create a GraphicalViewerKeyhandler with the shared keyhandler as
			// parent
			final KeyHandler graphicalViewerKeyHandler = new GraphicalViewerKeyHandler(
					viewer);
			graphicalViewerKeyHandler.setParent(getSharedKeyHandler());
			viewer.setKeyHandler(graphicalViewerKeyHandler);
			getSelectionSynchronizer().addViewer(viewer);
			final ScalableFreeformRootEditPart rootEditPart = new ScalableFreeformRootEditPart();
			viewer.setRootEditPart(rootEditPart);
			viewer.setEditPartFactory(editPartFactory);
			setViewersContents(i, contents[i]);

			final ContextMenuProviderWithActionRegistry cmp = createContextMenuProvider(viewer);
			cmp.setActionRegistry(getActionRegistry());
			viewer.setContextMenu(cmp);

			// set antialias on connection layer, this may be turned off if
			// causing trouble
			((ConnectionLayer) rootEditPart
					.getLayer(LayerConstants.CONNECTION_LAYER))
					.setAntialias(SWT.ON);

			// initialize viewer's ZoomManager
			final ZoomManager zoomManager = (ZoomManager) viewer
					.getProperty(ZoomManager.class.toString());
			final List<String> zoomLevels = new ArrayList<String>(3);
			zoomLevels.add(ZoomManager.FIT_ALL);
			zoomLevels.add(ZoomManager.FIT_WIDTH);
			zoomLevels.add(ZoomManager.FIT_HEIGHT);
			zoomManager.setZoomLevelContributions(zoomLevels);
			zoomManager.setZoomAnimationStyle(ZoomManager.ANIMATE_ZOOM_IN_OUT);

			// some optional coloring
			viewer.getControl().setBackground(
					PlatformUI.getWorkbench().getDisplay().getSystemColor(
							SWT.COLOR_LIST_BACKGROUND));
			viewer.getControl().setForeground(
					PlatformUI.getWorkbench().getDisplay().getSystemColor(
							SWT.COLOR_LIST_FOREGROUND));

			// prepare viewer for showing rulers and grid
			rulerComp.setGraphicalViewer(viewer);
			viewer.setProperty(RulerProvider.PROPERTY_HORIZONTAL_RULER,
					new MuvitorRulerProvider());
			viewer.setProperty(RulerProvider.PROPERTY_VERTICAL_RULER,
					new MuvitorRulerProvider());
			viewer.setProperty(RulerProvider.PROPERTY_RULER_VISIBILITY,
					Boolean.FALSE);
			viewer.setProperty(SnapToGrid.PROPERTY_GRID_SPACING, new Dimension(
					20, 20));
		}
		return viewerComposite;
	}

	/**
	 * Configures the {@link #keyHandler} with standard key strokes like DEL
	 * (for {@link DeleteAction}) and F2 (for direct edit).
	 * 
	 * @return A lazily created shared {@link KeyHandler} for the viewers on
	 *         this page.
	 * 
	 * @see #setupKeyHandler(KeyHandler)
	 */
	protected final KeyHandler getSharedKeyHandler() {
		if (keyHandler == null) {
			keyHandler = new KeyHandler();
			// this may be null
			keyHandler.setParent((KeyHandler) getEditor().getAdapter(
					KeyHandler.class));
		}
		return keyHandler;
	}

	/**
	 * @return The number of viewers that are hosted on this page.
	 * 
	 * @see #getViewerContents()
	 * @see #createGraphicalViewerComposite()
	 */
	public final int getNumberOfViewers() {
		return viewers.size();
	}

	/**
	 * @return The current viewer of this page
	 * 
	 * @see #setCurrentViewer(MultiViewerPageViewer)
	 */
	public final MultiViewerPageViewer getCurrentViewer() {
		return currentViewer;
	}

	/**
	 * The viewer's are arranged horizontally and will be showing these objects
	 * in the order of the returned array from left to right. The length of the
	 * array determines the value of {@link #getNumberOfViewers()}!
	 * 
	 * @return The objects that will be set as contents in each of
	 *         {@link #viewers}.
	 * 
	 * @see #setViewersContents(int, EObject)
	 * @see #createGraphicalViewerComposite()
	 */
	abstract protected EObject[] getViewerContents();

	/**
	 * A method to access the object which is being displayed in a specific
	 * viewer.
	 * 
	 * @param viewerPosition
	 *            the position (starting with 0) of the viewer
	 * @return the model of the top edit part of viewers[viewerPosition]
	 * @see #setViewersContents(int, EObject)
	 */
	public final EObject getViewersContents(final int viewerPosition) {
		Assert.isTrue(viewerPosition < getNumberOfViewers(),
				"AbstractMultiViewerPage tried to retrieve contents for viewer on position"
						+ viewerPosition + " but has only "
						+ getNumberOfViewers() + "viewers!");
		return (EObject) getViewers().get(viewerPosition).getContents()
				.getModel();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * muvitorkit.animation.IGraphicalViewerProvider#getViewer(org.eclipse.emf
	 * .ecore.EObject)
	 */
	public final GraphicalViewer getViewer(final EObject forModel) {
		for (final MultiViewerPageViewer viewer : viewers) {
			if (viewer.getContents() != null
					&& viewer.getContents().getModel() == forModel) {
				return viewer;
			}
		}
		return null;
	}

	/**
	 * A method to set a new object to be shown in a specific viewer.
	 * 
	 * @param viewerPosition
	 *            the position (starting with 0) of the viewer
	 * @see #getViewerContents()
	 */
	public final void setViewersContents(final int viewerPosition,
			final EObject model) {
		Assert.isTrue(viewerPosition < getNumberOfViewers(),
				"AbstractMultiViewerPage tried to set contents for viewer on position"
						+ viewerPosition + " but has only "
						+ getNumberOfViewers() + "viewers!");
		getViewers().get(viewerPosition).setContents(model);
		// hide empty viewers
		if (model == null) {
			setViewerVisibility(viewerPosition, false);
		}
	}

	/**
	 * This method sets the visibility of a viewer's control and relayouts the
	 * SashForm so that the visible viewers on it occupy the remaining space.
	 * 
	 * @param viewerPosition
	 *            the position (starting with 0) of the viewer
	 */
	public final void setViewerVisibility(final int viewerPosition,
			final boolean visible) {
		Assert.isTrue(viewerPosition < getNumberOfViewers(),
				"AbstractMultiViewerPage tried to switch visibility of viewer on position"
						+ viewerPosition + " but has only "
						+ getNumberOfViewers() + "viewers!");
		final Control control = getViewers().get(viewerPosition).getControl();
		final Control rulercomposite = control.getParent();
		rulercomposite.setVisible(visible);
		final SashForm sashForm = (SashForm) rulercomposite.getParent();
		sashForm.layout(true);
	}

	/**
	 * Subclasses must implement to associate {@link KeyStroke}s with Actions in
	 * the passed {@link KeyHandler} which is the one used for the
	 * {@link GraphicalViewers}.
	 * <p>
	 * May be left empty.
	 * 
	 * @see #createControl(Composite)
	 */
	abstract protected void setupKeyHandler(KeyHandler kh);

	/**
	 * Subclasses must implement to specify the
	 * {@link ContextMenuProviderWithActionRegistry} that should be used by this
	 * page's {@link GraphicalViewer}s and is responsible to show the created
	 * actions in the context menu.
	 * 
	 * @param viewer
	 *            The graphical viewer for context menu provider
	 * @return The {@link ContextMenuProviderWithActionRegistry} for the
	 *         specified {@link GraphicalViewer}.
	 * 
	 * @see #createGraphicalViewerComposite()
	 */
	abstract protected ContextMenuProviderWithActionRegistry createContextMenuProvider(
			EditPartViewer viewer);

	/**
	 * Subclasses must implement to specify the {@link EditPartFactory} that
	 * should be used by this page's {@link GraphicalViewer}s.
	 * 
	 * @return The {@link EditPartFactory} for the {@link GraphicalViewer}s of
	 *         this page.
	 * 
	 * @see #createGraphicalViewerComposite()
	 */
	abstract protected EditPartFactory createEditPartFactory();

	/**
	 * @return The {@link #editor}'s {@link SelectionSynchronizer}
	 * 
	 * @see MuvitorTreeEditor#getSelectionSynchronizer()
	 */
	private final SelectionSynchronizer getSelectionSynchronizer() {
		final SelectionSynchronizer synchronizer = (SelectionSynchronizer) getEditor()
				.getAdapter(SelectionSynchronizer.class);
		Assert
				.isNotNull(synchronizer,
						"The editor did not deliver a selection synchronizer instance for the page!");
		return synchronizer;
	}

	/**
	 * Stops listening to the model, removes viewers from the {@link #editor}'s
	 * {@link SelectionSynchronizer}, stops listening to the global selection
	 * service, and deactivates the {@link #thumbnail}.
	 * <p>
	 * May be extended by subclasses to perform further cleaning up for
	 * initializations done in {@link #init(IPageSite)} but super implementation
	 * must be called!
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.Page#dispose()
	 */
	@Override
	public void dispose() {
		getModel().eAdapters().remove(adapter);
		getActionRegistry().dispose();
		((CommandStack) getEditor().getAdapter(CommandStack.class))
				.removeCommandStackListener(this);

		for (final GraphicalViewer viewer : getViewers()) {
			getSelectionSynchronizer().removeViewer(viewer);
		}

		getSite().getPage().removeSelectionListener(this);

		if (thumbnail != null) {
			thumbnail.deactivate();
			thumbnail = null;
		}
		super.dispose();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.Page#getControl()
	 */
	@Override
	public final Control getControl() {
		return flyoutPaletteComposite;
	}

	/**
	 * Sets focus to a part in the page.
	 */
	@Override
	public final void setFocus() {
		if (currentViewer != null) {
			currentViewer.getControl().setFocus();
		}
	}

	/**
	 * If a selection change occurs in the one of the editor components
	 * (possibly in the current viewer) the {@link UpdateAction}s in this page's
	 * {@link ActionRegistry} are being updated.
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.ui.ISelectionListener#selectionChanged(org.eclipse.ui.
	 * IWorkbenchPart, org.eclipse.jface.viewers.ISelection)
	 */
	public final void selectionChanged(final IWorkbenchPart part,
			final ISelection selection) {
		updateActions();
	}

	/**
	 * Updates all {@link UpdateAction}s registered in the
	 * {@link #actionRegistry}.
	 */
	protected final void updateActions() {
		for (@SuppressWarnings("unchecked")
		final Iterator<IAction> iter = getActionRegistry().getActions(); iter
				.hasNext();) {
			final IAction action = iter.next();
			if (action instanceof UpdateAction) {
				((UpdateAction) action).update();
			}
		}
	}

	/**
	 * Extended to provide {@link #zoomManagerDelegate} as {@link ZoomManager}.
	 * 
	 * Subclasses may extend further, but must call super implementation!
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
	 */
	@SuppressWarnings("unchecked")
	public Object getAdapter(final Class clazz) {
		if (clazz == ZoomManager.class) {
			return zoomManagerDelegate;
		} else if (clazz == IPropertySheetPage.class) {
			return getEditor().getAdapter(clazz);
		}
		return null;
	}

	/**
	 * @return the actionRegistry
	 */
	protected final ActionRegistry getActionRegistry() {
		return actionRegistry;
	}

	/**
	 * @return the parent editor
	 */
	public final MuvitorTreeEditor getEditor() {
		return (MuvitorTreeEditor) view.getEditor();
	}

	/**
	 * This method sets the current graphical viewer of this page which implies
	 * that the passed viewer
	 * 
	 * <ul>
	 * <li>will be shown in the {@link Thumbnail},
	 * <li>becomes the current {@link ISelectionProvider} in the
	 * {@link SelectionProviderIntermediate} for this page's {@link IPageSite}
	 * and
	 * <li>provides the {@link ZoomManager} for the zoom actions the
	 * {@link ZoomManagerDelegate} delegates to.
	 * </ul>
	 * 
	 * @param viewer
	 */
	protected final void setCurrentViewer(final MultiViewerPageViewer viewer) {
		Assert.isNotNull(viewer,
				"AbstractMultiViewerPage can not be set to viewer 'null'!");

		// update current viewer only if the passed is different to it
		if (currentViewer == viewer) {
			// this may happen if we switch from the tree viewer to this viewer,
			// so we have to update the actions
			updateActions();
			return;
		}

		currentViewer = viewer;

		// if (getSite().getPage().getActiveEditor() == getEditor()) {
		currentViewer.getControl().setFocus();
		// }

		// set current viewer as actual selection provider for this page's site
		selectionProvider.setSelectionProviderDelegate(currentViewer);

		updateActions();

		// update current viewer as source of Thumbnail
		final ScalableFreeformRootEditPart rootEditPart = (ScalableFreeformRootEditPart) currentViewer
				.getRootEditPart();

		thumbnail.setViewport((Viewport) rootEditPart.getFigure());
		thumbnail.setSource(rootEditPart
				.getLayer(LayerConstants.PRINTABLE_LAYERS));
		thumbnail.setVisible(true);

		// update current viewer's ZoomManager for ZoomManagerDelegate
		zoomManagerDelegate.setCurrentZoomManager((ZoomManager) currentViewer
				.getProperty(ZoomManager.class.toString()));
	}

	/**
	 * Method to get the list of viewers if needed to implement advanced editor
	 * features. This list is unmodifiable.
	 * 
	 * <p>
	 * To set new contents for a viewer
	 * {@link #setViewersContents(int, EObject)} should be used!
	 * <p>
	 * 
	 * @return the viewers
	 * @see #setViewersContents(int, EObject)
	 */
	protected final List<MultiViewerPageViewer> getViewers() {
		return Collections.unmodifiableList(viewers);
	}

	/**
	 * This can be used to display messages in this page's status line.
	 * 
	 * @return The {@link IStatusLineManager} from the {@link IActionBars} of
	 *         this page's {@link IPageSite}
	 */
	public final IStatusLineManager getStatusLineManager() {
		return getSite().getActionBars().getStatusLineManager();
	}

	/**
	 * This can be used to add actions to this page's tool bar.
	 * 
	 * @return The {@link IToolBarManager} from the {@link IActionBars} of this
	 *         page's {@link IPageSite}
	 */
	public final IToolBarManager getToolBarManager() {
		return getSite().getActionBars().getToolBarManager();
	}

	/**
	 * If some command manipulates the model and is put to the command stack the
	 * actions are updated. Remember that the command stack is shared with the
	 * parent {@link MuvitorTreeEditor}!
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gef.commands.CommandStackListener#commandStackChanged(java
	 * .util.EventObject)
	 */
	public final void commandStackChanged(final EventObject event) {
		updateActions();
	}

	/**
	 * By default, an Adapter will be registered with this page's model that
	 * passes notifications to this method, which subclasses are expected to
	 * override.
	 */
	protected void notifyChanged(final Notification msg) {
	}

	/**
	 * This local class extends {@link ScrollingGraphicalViewer} by a
	 * {@link MouseListener} that sets this viewer as the page's current viewer
	 * when a mouse click occurs on this viewer.
	 * 
	 * @author Tony Modica
	 */
	final public class MultiViewerPageViewer extends ScrollingGraphicalViewer {

		/**
		 * A listener that notices when the mouse acts on this viewer.
		 */
		private final MouseListener mouseListener;

		public MultiViewerPageViewer() {
			mouseListener = new MouseAdapter() {
				@Override
				public final void mouseDown(final MouseEvent e) {
					setCurrentViewer(MultiViewerPageViewer.this);
				}
			};
		}

		/**
		 * @return The page that hosts this graphical viewer.
		 */
		public final MuvitorPage getHostPage() {
			return MuvitorPage.this;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.gef.ui.parts.GraphicalViewerImpl#hookControl()
		 */
		@Override
		protected final void hookControl() {
			super.hookControl();
			super.getControl().addMouseListener(mouseListener);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.gef.ui.parts.GraphicalViewerImpl#unhookControl()
		 */
		@Override
		protected final void unhookControl() {
			super.getControl().removeMouseListener(mouseListener);
			super.unhookControl();
		}
	}

	static public final class MuvitorRulerProvider extends RulerProvider {
		@Override
		public final int getUnit() {
			return RulerProvider.UNIT_PIXELS;
		}

		@Override
		public final Object getRuler() {
			return MuvitorRulerProvider.this;
		}
	}
}
