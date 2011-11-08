package de.tu_berlin.cs.tfs.muvitorkit.ui;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import de.tu_berlin.cs.tfs.muvitorkit.actions.ExportViewerImageAction;
import de.tu_berlin.cs.tfs.muvitorkit.actions.GenericGraphLayoutAction;
import de.tu_berlin.cs.tfs.muvitorkit.actions.MoveNodeAction;
import de.tu_berlin.cs.tfs.muvitorkit.actions.MuvitorActionBarContributor;
import de.tu_berlin.cs.tfs.muvitorkit.actions.MuvitorToggleGridAction;
import de.tu_berlin.cs.tfs.muvitorkit.actions.MuvitorToggleRulerVisibilityAction;
import de.tu_berlin.cs.tfs.muvitorkit.actions.RevertAction;
import de.tu_berlin.cs.tfs.muvitorkit.actions.TrimViewerAction;
import de.tu_berlin.cs.tfs.muvitorkit.animation.ToggleAnimationAction;
import de.tu_berlin.cs.tfs.muvitorkit.ui.MuvitorPage.MultiViewerPageViewer;
import de.tu_berlin.cs.tfs.muvitorkit.ui.utils.EMFModelManager;
import de.tu_berlin.cs.tfs.muvitorkit.ui.utils.MuvitorNotifierService;
import de.tu_berlin.cs.tfs.muvitorkit.ui.utils.PartListenerAdapter;
import de.tu_berlin.cs.tfs.muvitorkit.ui.utils.SWTResourceManager;
import de.tu_berlin.cs.tfs.muvitorkit.ui.utils.test.EditorJob;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.KeyHandler;
import org.eclipse.gef.KeyStroke;
import org.eclipse.gef.TreeEditPart;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.commands.CommandStackListener;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.AlignmentAction;
import org.eclipse.gef.ui.actions.DeleteAction;
import org.eclipse.gef.ui.actions.DirectEditAction;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.gef.ui.actions.PrintAction;
import org.eclipse.gef.ui.actions.RedoAction;
import org.eclipse.gef.ui.actions.SaveAction;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.gef.ui.actions.UndoAction;
import org.eclipse.gef.ui.actions.UpdateAction;
import org.eclipse.gef.ui.actions.WorkbenchPartAction;
import org.eclipse.gef.ui.parts.SelectionSynchronizer;
import org.eclipse.gef.ui.parts.TreeViewer;
import org.eclipse.gef.ui.properties.UndoablePropertySheetEntry;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IPersistableEditor;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWindowListener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.presentations.IStackPresentationSite;
import org.eclipse.ui.views.properties.IPropertySheetEntry;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetSorter;

/**
 * <p>
 * This is a rich-featured abstract implementation of an {@link EditorPart} with
 * a GEF {@link TreeViewer}. Its purpose is to provide many generic features
 * available to GEF editors, or at least to make them easy to use by editor
 * programmers. Programmers only need to configure the editor by passing some
 * information by implementing the abstract methods.
 * </p>
 * 
 * <p>
 * Prerequisites:
 * <ul>
 * <li>As extensions in the plugin.xml there have to be defined <b>exactly</b>
 * one of each:
 * <ul>
 * <li>"org.eclipse.ui.editors", must be pointing to the concrete subclass. This
 * must have a unique file extension, which will be used for loading from and
 * saving to EMF files.
 * <li>"org.eclipse.ui.perspectives", must be pointing to a
 * {@link IPerspectiveFactory} that describes the perspective for this editor.
 * </ul>
 * </ul>
 * </p>
 * 
 * <p>
 * When instantiated (and in {@link #createPartControl(Composite)}) this class
 * does the following:
 * <ol>
 * <li>It creates a {@link DefaultEditDomain} and sets itself as the
 * {@link EditorPart}.
 * <li>Looks up the perspective defined for the plugin and opens it.
 * <li>A {@link TreeViewer} is created.
 * <li>The {@link TreeViewer}'s control is registered as resource user in
 * {@link SWTResourceManager} so that we can use this to manage color, fonts,
 * and images. These will then be automatically disposed when the editor gets
 * closed.
 * <li>Sets the TreeViewer in the EditDomain and listens to selection changes on
 * the workbench page. The TreeViewer is set as selection provider for this
 * editor.
 * <li>Installs a {@link SelectionSynchronizer} on the {@link TreeViewer}.
 * <li> {@link TreeViewer} is set as {@link ISelectionProvider} for this
 * {@link IEditorSite}.
 * <li>Sets the edit part factory, contents, and context menu for the TreeViewer
 * determined by abstract methods.
 * <li>Sets a standard {@link KeyHandler} for the {@link TreeViewer}.
 * </ol>
 * </p>
 * 
 * <p>
 * Additionally it provides the following features:
 * <ul>
 * <li>Errors and Exceptions should be logged for the plugin using
 * {@link MuvitorActivator#logError(String, Exception)}.
 * <li>Some default GEF actions (also as RetargetAction handlers) and useful
 * generic Muvitor actions are created and registered by default. See
 * {@link #createActions()} for details.
 * <li>The {@link CommandStack} of the {@link EditDomain} is watched. When it
 * changes all actions will be updated. <br>
 * <li>The {@link TreeViewer} is watched for selection changes. When such a
 * change occurs all actions are updated. <br>
 * <li>When {@link #firePropertyChange(int)} occurs all actions are updated. <br>
 * By default, this is done for {@link SaveAction}, as it is intended to react
 * on firing of {@link IEditorPart#PROP_DIRTY}.
 * <li>When the {@link CommandStack} is changed the editor checks its own dirty
 * state and fires {@link IEditorPart#PROP_DIRTY} if it changes.
 * <li>When closed, the editor closes the editor's perspective if no other
 * editor with the ID declared in plugin.xml is active.
 * <li>With {@link IDUtil#getIDForModel(EObject)} the passed model will be
 * registered with an unique ID that is used with {@link MuvitorPageBookView}s
 * to tell them with their secondary ID which model to show. These views make
 * use of {@link IDUtil} to resolve the ID to the model. <br>
 * It is expected that {@link MuvitorPageBookView}s are opened from within
 * {@link EditPart}s or actions via a call
 * {@link MuvitorTreeEditor#showView(EObject)}. See
 * {@link #registerViewID(EClass, String)}.
 * </ul>
 * <li>The editor will hide a {@link MuvitorPageBookView} automatically when its
 * model has been deleted (i.e. model.eResource() == <code>null</code>).
 * <li>When being disposed the editor stores information (IDs) about the opened
 * views to the plugin's preferences to reopen them when the editor is started
 * again. </ul>
 * </p>
 * 
 * <p>
 * This class offers several static methods to open and close
 * {@link MuvitorPageBookView}s: {@link #showView(EObject)} and
 * {@link #closeViewsShowing(EObject)} for closing views showing a specific
 * model and {@link #closeViews(MuvitorTreeEditor)} for closing all views
 * showing a model whose root container is this editor's model root.
 * </p>
 * 
 * <p>
 * The following methods have to be implemented by subclasses. See their
 * documentation for useful hints.
 * <ul>
 * <li> {@link #createDefaultModel()}: The default model that will be used if
 * loading from a file fails.
 * <li> {@link #createCustomActions()}: Register your own actions here.
 * <li> {@link #createContextMenuProvider(TreeViewer)}: The
 * {@link ContextMenuProviderWithActionRegistry} for the {@link TreeViewer}. By
 * default, it conveniently populates the context menu with many standard
 * actions but is meant to be subclassed.
 * <li> {@link #createTreeEditPartFactory()}: A suitable {@link EditPartFactory}
 * for the model elements.
 * <li>{@link #setupKeyHandler(KeyHandler)}: Define additional key shortcuts for
 * actions here. May do nothing.
 * </ul>
 * </p>
 * 
 * @author Tony Modica
 */
public abstract class MuvitorTreeEditor extends EditorPart implements
		CommandStackListener, ISelectionListener, IPersistableEditor,
		IGotoMarker {

	/**
	 * Some key constants for the memento.
	 */
	private static final String MODELURIFRAGMENT_KEY = "uriFragment_key";
	private static final String RESOURCE_URI = "resourceURI";

	/**
	 * The root element of the model.
	 */
	private List<EObject> modelRoots = null;

	/**
	 * The {@link EMFModelManager} for model persistence operations, using file
	 * extension specified in plugin.xml.
	 */
	private final EMFModelManager modelManager = new EMFModelManager(
			fileExtension);;

	/**
	 * The {@link EditDomain} of this editor.
	 */
	private final DefaultEditDomain editDomain;

	/**
	 * The {@link TreeViewer} in this editor.
	 */
	private final TreeViewer treeViewer = new EditorTreeViewer();

	/**
	 * The {@link ActionRegistry} containing the actions created by this editor.
	 */
	private ActionRegistry actionRegistry;

	/**
	 * The {@link SelectionSynchronizer} managing the selections for this editor
	 * and the views it can open. The synchronizer relates the selection of 2 or
	 * more EditPartViewers. This is a special synchronizer for EObjects: if the
	 * model itself has no counterpart edit part in the viewer, the synchronizer
	 * traverses the containment hierarchy upwards to find an edit part for some
	 * parent.
	 */
	private final SelectionSynchronizer selectionSynchronizer = new SelectionSynchronizer() {
		@Override
		protected final EditPart convert(final EditPartViewer viewer,
				final EditPart part) {
			// We assume that we have an EMF model
			final Object model = part.getModel();
			if (model instanceof EObject) {
				return convertEObject(viewer, (EObject) model);
			}
			/*
			 * else look if the (possibly existing) parent has an EObject as
			 * model
			 */
			return convert(viewer, part.getParent());
		}

		/**
		 * @param viewer
		 *            the viewer being mapped to
		 * @param model
		 *            the model element of a part from another viewer
		 * @return An edit part of an (in)direct parent of the model in the
		 *         viewer or <code>null</code>
		 */
		private final EditPart convertEObject(final EditPartViewer viewer,
				final EObject model) {
			if (model == null) {
				return null;
			}
			final Object temp = viewer.getEditPartRegistry().get(model);
			if (temp != null) {
				return (EditPart) temp;
			}
			return convertEObject(viewer, model.eContainer());
		}
	};

	/**
	 * A list to keep track of the actions that are put on the tool bar via
	 * {@link #registerActionOnToolBar(IAction)}.
	 */
	final List<IAction> toolbarActions = new ArrayList<IAction>();

	/**
	 * The key handler of this editor, enabling key shortcuts for actions and
	 * configures the {@link #keyHandler} with standard key strokes like DEL
	 * (for {@link DeleteAction}) and F2 (for direct edit).
	 */
	private KeyHandler keyHandler;

	/**
	 * A helper flag to decide if the save action should be enabled.
	 */
	private boolean previousDirtyState;

	/**
	 * When several editor instances are running at teh same time, each has its
	 * own action instances. This listener takes care of cleaning and
	 * repopulating the toolbar with this editor instance's actions that have
	 * been registered via {@link #registerActionOnToolBar(IAction)}.
	 */
	final private IPartListener2 partListener = new PartListenerAdapter() {

		@Override
		public final void partBroughtToTop(final IWorkbenchPartReference partRef) {
			// a Muvitor view might have brought this editor to top
			partActivated(partRef);
		}

		@Override
		public final void partActivated(final IWorkbenchPartReference partRef) {
			final IWorkbenchPart activatedPart = partRef.getPart(false);
			if (!(activatedPart instanceof MuvitorTreeEditor)) {
				return;
			}
			final IToolBarManager toolbarmgr = getEditorSite().getActionBars()
					.getToolBarManager();
			if (activatedPart == MuvitorTreeEditor.this
					&& !contains(toolbarmgr, toolbarActions.get(0))) {
				/*
				 * this editor has been activated or one of its views (which
				 * brought the editor to top) and this editor's toolbar actions
				 * are not present in the toolbar, repopulate the toolbar
				 */
				for (final IAction action : toolbarActions) {
					toolbarmgr.add(action);
				}
				toolbarmgr.update(true);
			} else if (activatedPart != MuvitorTreeEditor.this
					&& contains(toolbarmgr, toolbarActions.get(0))) {
				/*
				 * another editor has been activated or has been brought to top,
				 * clean up the toolbar
				 */
				for (final IAction action : toolbarActions) {
					toolbarmgr.remove(action.getId());
				}
				toolbarmgr.update(true);
			}
		}

		private final boolean contains(final IToolBarManager toolbarmgr,
				final IAction action) {
			// find candidate for equality with same ID
			final ActionContributionItem item = (ActionContributionItem) toolbarmgr
					.find(action.getId());
			// test actual object equality
			return item != null && item.getAction() == action;
		}
	};

	/**
	 * The file extension this editor reacts on as specified in plugin.xml
	 */
	static public final String fileExtension = MuvitorActivator
			.getUniqueExtensionAttributeValue("org.eclipse.ui.editors",
					"extensions");

	/**
	 * A map associating a class of EObjects with IDs of
	 * {@link MuvitorPageBookView}s being registered in plugin.xml.
	 * 
	 * @see #registerViewID(EClass, String)
	 */
	static private final Map<EClass, String> eClass2ViewIDMap = new HashMap<EClass, String>();

	/**
	 * The standard constructor creates a {@link DefaultEditDomain} and
	 * registers itself as a {@link CommandStackListener} on the domains
	 * {@link CommandStack}.
	 * 
	 * @throws PartInitException
	 */
	protected MuvitorTreeEditor() {
		editDomain = new DefaultEditDomain(this);
		getCommandStack().addCommandStackListener(this);
		previousDirtyState = false;
	}

	/**
	 * This method will create an {@link EMFModelManager} that handles loading
	 * and saving to the file the passed {@link IEditorInput} relies on. If
	 * loading fails (possibly because we created a file with the creation
	 * wizard) we create a new default model and put it to the file resource.
	 * 
	 * @see #createDefaultModel()
	 * @see org.eclipse.ui.part.EditorPart#setInput(org.eclipse.ui.IEditorInput)
	 */
	@Override
	protected final void setInput(final IEditorInput input) {
		super.setInput(input);
		final IFile file = ((IFileEditorInput) input).getFile();
		setPartName(file.getName());
		setContentDescription(file.getName());
		/*
		 * This must be called before trying to load the model, so that the EMF
		 * package has been initialized.
		 */
		final List<EObject> defaultModels = createDefaultModels();
		for (final EObject defaultModel : defaultModels) {
			defaultModel.eClass().getEPackage();
		}
		modelRoots = modelManager.load(file.getFullPath(), defaultModels);
		if (modelRoots == null || modelRoots.isEmpty()) {
			MuvitorActivator
					.logError(
							"The loaded or created model is corrupt and no default model could be created!",
							null);
		}

		// register the root model ID with the editor in the IDUtil
		IDUtil.registerEditor(this);
	}

	/**
	 * Subclasses have to generate a default model in this method. This will be
	 * called if loading from a file fails. For separate model roots override
	 * {@link #createDefaultModels()} instead and leave this method
	 * implementation empty.
	 * 
	 * @return the default model
	 * 
	 * @see #setInput(IEditorInput)
	 */
	abstract protected EObject createDefaultModel();

	/**
	 * By default, MuvitorTreeEditor uses a single model root, which will be
	 * created in {@link #createDefaultModel()}. But it is capable to handle
	 * multiple roots
	 * 
	 * @return
	 */
	protected List<EObject> createDefaultModels() {
		return Collections.singletonList(createDefaultModel());
	}

	/**
	 * When the command stack changes, the actions are updated. Additionally the
	 * editor checks if itself has changed its dirty state by comparing its
	 * <i>previous</i> dirty state with the actual command stack state.
	 * 
	 * @param event
	 *            the change event
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gef.commands.CommandStackListener#commandStackChanged(java
	 * .util.EventObject)
	 */
	public final void commandStackChanged(final EventObject event) {
		if (isDirty() != previousDirtyState) {
			previousDirtyState = isDirty();
			firePropertyChange(IEditorPart.PROP_DIRTY);
		} else {
			updateActions();
		}
	}

	/**
	 * Creates and registers some standard GEF actions and some generic Muvitor
	 * actions for this editor's {@link ActionRegistry}. See the code below for
	 * details. Instances of universal actions like DeleteAction are shared with
	 * the graphical {@link MuvitorPage}s of this editor. See there for more
	 * information about sharing action instances.
	 * 
	 * <p>
	 * Standard RetargetActions are declared in the MuvitorActionBarContributor
	 * for all views of this editor. You may subclass this in the rare case that
	 * you need own RetargetActions. There is no need to explicitly set handler
	 * actions that you create here (which will be used if the TreeEditor is the
	 * active part) for the RetargetActions here because this will be done by
	 * default in
	 * {@link MuvitorActionBarContributor#setActiveEditor(IEditorPart)}. This
	 * will work as long as the handle action has the same ID as the
	 * RetargetAction it is meant to handle.
	 * </p>
	 * 
	 * <p>
	 * <b>Keep in mind that RetargetAction handles for {@link MuvitorPage}s must
	 * be set explicitly!</b> See there for more information about registering
	 * (shared) handles for RetargetActions.
	 * </p>
	 * 
	 * @see #createCustomActions()
	 * @see MuvitorActionBarContributor
	 * @see MuvitorPage#createCustomActions()
	 */
	private final void createActions() {
		// standard GEF and Eclipse actions
		registerAction(new SaveAction(this));
		registerAction(new UndoAction(this));
		registerAction(new RedoAction(this));
		registerAction(new PrintAction(this));
		registerAction(new DirectEditAction((IWorkbenchPart) this));
		registerAction(new DeleteAction((IWorkbenchPart) this));
		registerAction(new RevertAction(this));

		// GEF alignment actions
		registerActionOnToolBar(new AlignmentAction((IWorkbenchPart) this,
				PositionConstants.LEFT));
		registerActionOnToolBar(new AlignmentAction((IWorkbenchPart) this,
				PositionConstants.RIGHT));
		registerActionOnToolBar(new AlignmentAction((IWorkbenchPart) this,
				PositionConstants.TOP));
		registerActionOnToolBar(new AlignmentAction((IWorkbenchPart) this,
				PositionConstants.BOTTOM));
		registerActionOnToolBar(new AlignmentAction((IWorkbenchPart) this,
				PositionConstants.CENTER));
		registerActionOnToolBar(new AlignmentAction((IWorkbenchPart) this,
				PositionConstants.MIDDLE));

		// some special shared actions for graphical sub views
		registerAction(new ExportViewerImageAction(this));
		registerAction(new TrimViewerAction(this));
		registerActionOnToolBar(new GenericGraphLayoutAction(this));
		registerActionOnToolBar(new MuvitorToggleRulerVisibilityAction(this));
		registerActionOnToolBar(new MuvitorToggleGridAction(this));

		// shared move node actions for graphical viewers,
		// the keystrokes are defined in MuvitorPage.getSharedKeyHandler()
		registerAction(new MoveNodeAction(this, MoveNodeAction.LEFT));
		registerAction(new MoveNodeAction(this, MoveNodeAction.RIGHT));
		registerAction(new MoveNodeAction(this, MoveNodeAction.UP));
		registerAction(new MoveNodeAction(this, MoveNodeAction.DOWN));
		registerAction(new MoveNodeAction(this, MoveNodeAction.PREC_LEFT));
		registerAction(new MoveNodeAction(this, MoveNodeAction.PREC_RIGHT));
		registerAction(new MoveNodeAction(this, MoveNodeAction.PREC_UP));
		registerAction(new MoveNodeAction(this, MoveNodeAction.PREC_DOWN));

		registerActionOnToolBar(new ToggleAnimationAction());
		// create custom actions
		createCustomActions();
	}

	/**
	 * Registers the action with the editor's action registry.
	 * 
	 * <p>
	 * There is no need to set handles that you register here (which will be
	 * used if the TreeEditor is the active part) for the RetargetActions here
	 * because this will be done by default in
	 * {@link MuvitorActionBarContributor#setActiveEditor(IEditorPart)}. This
	 * will work as long as the handle action has the same ID as the
	 * RetargetAction it is meant to handle.
	 * </p>
	 * 
	 * <p>
	 * <b>Keep in mind that RetargetAction handles for {@link MuvitorPage}s must
	 * be set explicitly!</b> See there for more information about registering
	 * (shared) handles for RetargetActions.
	 * </p>
	 * 
	 * @param action
	 *            the action to be registered in this editor's
	 *            {@link ActionRegistry}
	 */
	protected final IAction registerAction(final IAction action) {
		getActionRegistry().registerAction(action);
		return action;
	}

	/**
	 * Registers the action with the editor's action registry and puts it on
	 * this editor's tool bar.
	 * 
	 * <p>
	 * With this, you will rarely need to create RetargetActions. But if you do,
	 * use (subclass) {@link MuvitorActionBarContributor} for this purpose and
	 * check it and {@link #createActions()} for existing actions before.
	 * </p>
	 * 
	 * @param action
	 *            the action to be registered in this editor's
	 *            {@link ActionRegistry} and to be put on the editors tool bar.
	 * 
	 * @see #registerAction(IAction)
	 */
	protected final IAction registerActionOnToolBar(final IAction action) {
		registerAction(action);
		toolbarActions.add(action);
		getEditorSite().getActionBars().getToolBarManager().add(action);
		return action;
	}

	/**
	 * To be implemented by subclasses.
	 * 
	 * <p>
	 * To be available for the context menu, tool bar, key binding, or as shared
	 * action instance for this editor's {@link MuvitorPage}s (see there for
	 * information about sharing action instances), custom actions have to
	 * registered here via {@link #registerAction(IAction)}. Alternatively, you
	 * may use the convenient method {@link #registerActionOnToolBar(IAction)}
	 * to put an action on a tool bar. <br>
	 * With this, you will rarely need to create RetargetActions. But if you do,
	 * use (subclass) {@link MuvitorActionBarContributor} for this purpose and
	 * check it and {@link #createActions()} for existing actions before.
	 * </p>
	 * <p>
	 * {@link WorkbenchPartAction}s and {@link SelectionAction}s created here
	 * should get the editor (<code>this</code>) as workbench part in their
	 * constructor. <br>
	 * </p>
	 * 
	 * <p>
	 * There is no need to set handles that you create here (which will be used
	 * if the TreeEditor is the active part) for the RetargetActions here
	 * because this will be done by default in
	 * {@link MuvitorActionBarContributor#setActiveEditor(IEditorPart)}. This
	 * will work as long as the handle action has the same ID as the
	 * RetargetAction it is meant to handle.
	 * </p>
	 * 
	 * <p>
	 * <b>Keep in mind that RetargetAction handles for {@link MuvitorPage}s must
	 * be set explicitly!</b> See there for more information about registering
	 * (shared) handles for RetargetActions.
	 * </p>
	 * 
	 * @see #createActions
	 * @see #createContextMenuProvider(TreeViewer)
	 * @see MuvitorActionBarContributor
	 */
	abstract protected void createCustomActions();

	/**
	 * Creates the tree viewer on the specified <code>Composite</code>. The
	 * various abstract methods are used to configure the viewer. The model
	 * provided by {@link #getPrimaryModelRoot()} will be set as contents.
	 * 
	 * @param parent
	 *            the parent composite
	 * 
	 * @see #createTreeEditPartFactory()
	 * @see #createContextMenuProvider(TreeViewer)
	 * @see #getKeyHandler()
	 */
	private final void createTreeViewer(final Composite parent) {
		getTreeViewer().createControl(parent);
		getTreeViewer().getControl().setBackground(
				parent.getDisplay().getSystemColor(SWT.COLOR_LIST_BACKGROUND));
		getTreeViewer().getControl().setForeground(
				parent.getDisplay().getSystemColor(SWT.COLOR_LIST_FOREGROUND));

		// set the contents, edit part factory and context menu for the
		// TreeViewer
		getTreeViewer().setEditPartFactory(createTreeEditPartFactory());
		getTreeViewer().setContents(getPrimaryModelRoot());
		final ContextMenuProviderWithActionRegistry provider = createContextMenuProvider(getTreeViewer());
		provider.setActionRegistry(getActionRegistry());
		getTreeViewer().setContextMenu(provider);

		// configure the key handler
		getTreeViewer().setKeyHandler(getKeyHandler());

		/*
		 * register the tree viewer's control to SWTResourceManager so that we
		 * can use it to manage colors, font etc. and to let the manager dispose
		 * them when the editor gets closed.
		 */
		SWTResourceManager.registerResourceUser(getTreeViewer().getControl());
	}

	/**
	 * Realizes the editor by creating its {@link Control}. The tree viewer is
	 * added to the SelectionSynchronizer, which can be used to keep 2 or more
	 * EditPartViewers in sync. The viewer is also registered as the
	 * ISelectionProvider for the Editor's PartSite. The editor again registers
	 * itself as a listener to the global selection service to react on changes
	 * in this plugin's {@link MuvitorPageBookView}s.
	 * 
	 * <P>
	 * WARNING: This method may or may not be called by the workbench prior to
	 * {@link #dispose()}.
	 * 
	 * @param parent
	 *            the parent composite
	 * 
	 * @see org.eclipse.ui.IWorkbenchPart#createPartControl(org.eclipse.swt.widgets
	 *      .Composite)
	 */
	@Override
	public final void createPartControl(final Composite parent) {
		createTreeViewer(parent);
		selectionSynchronizer.addViewer(getTreeViewer());
		getSite().setSelectionProvider(getTreeViewer());
		getEditDomain().addViewer(getTreeViewer());
		getSite().getPage().addSelectionListener(this);
	}

	/**
	 * Tries to close views for all models of the resource that have possibly
	 * been opened. Stops listening to the command stack and selection service.
	 * Closes the perspective if the last editor instance is being closed.
	 * Subclasses may override but must call super implementation!
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	@Override
	public void dispose() {
		MuvitorNotifierService.clear(this);

		closeViews(this);
		getCommandStack().removeCommandStackListener(this);

		// FIXED do not listen only to tree viewer, but to general
		// selection service itself!
		getSite().getPage().removeSelectionListener(this);

		getSite().getPage().removePartListener(partListener);

		getEditDomain().setActiveTool(null);
		getActionRegistry().dispose();
		getCommandStack().dispose();

		// close perspective if the last editor instance is being closed
		if (!isAnotherEditorActive()) {
			final IWorkbenchPage page = getSite().getPage();
			final IPerspectiveDescriptor perspective = page.getPerspective();
			if (perspective.getId().equals(
					MuvitorActivator.getUniqueExtensionAttributeValue(
							"org.eclipse.ui.perspectives", "id"))) {
				page.closePerspective(perspective, true, false);
			}
		}
		EditorJob.cancelAll();

		IDUtil.deregisterEditor(this);

		super.dispose();
	}

	/**
	 * A helper method that looks for other active instances of this editor in
	 * the site's page.
	 * 
	 * @return <code>true</code> if another instance of this editor is active
	 */
	private final boolean isAnotherEditorActive() {
		final IEditorReference[] editorRefs = getSite().getPage()
				.getEditorReferences();
		final String editorID = MuvitorActivator
				.getUniqueExtensionAttributeValue("org.eclipse.ui.editors",
						"id");
		for (final IEditorReference editorRef : editorRefs) {
			if (editorRef.getId().equals(editorID)) {
				return true;
			}
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#firePropertyChange(int)
	 */
	@Override
	protected final void firePropertyChange(final int property) {
		super.firePropertyChange(property);
		updateActions();
	}

	/**
	 * Returns by default the first model in the list of {@link EObject} models
	 * that have been loaded by the {@link EMFModelManager}. This will be set as
	 * contents for the TreeViewer. Subclasses may override.
	 * 
	 * @return the element of the model roots to be set as the treeviewer's
	 *         contents
	 * @see #getModelRoots()
	 */
	public EObject getPrimaryModelRoot() {
		return modelRoots.get(0);
	}

	/**
	 * Returns the list of {@link EObject} models that have been loaded by the
	 * {@link EMFModelManager}. The first of this (see
	 * {@link #getPrimaryModelRoot()}) will be set as contents for the
	 * TreeViewer.
	 * 
	 * @return the modelRoots of this editor
	 */
	public final List<EObject> getModelRoots() {
		return modelRoots;
	}

	/**
	 * Lazily creates, initializes and returns the action registry. The
	 * keyhandler will be configured with custom key bindings here.
	 * 
	 * @return the action registry
	 * 
	 * @see #createActions()
	 * @see #updateActions()
	 */
	protected final ActionRegistry getActionRegistry() {
		if (actionRegistry == null) {
			actionRegistry = new ActionRegistry();
			createActions();

			// now that actions have been created, configure keyhandler
			// add key strokes defined by concrete subclasses
			setupKeyHandler(getKeyHandler());

			updateActions();
		}
		return actionRegistry;
	}

	/**
	 * Need to create key handler lazily because accessing the action registry
	 * creates the actions which needs the editor site etc.
	 * 
	 * @return the lazily created keyhandler with default key strokes
	 */
	protected final KeyHandler getKeyHandler() {
		if (keyHandler == null) {
			keyHandler = new KeyHandler();

			keyHandler
					.put(KeyStroke.getPressed(SWT.DEL, 127, 0),
							getActionRegistry().getAction(
									ActionFactory.DELETE.getId()));
			keyHandler.put(KeyStroke.getPressed(SWT.F2, 0), getActionRegistry()
					.getAction(GEFActionConstants.DIRECT_EDIT));

			// HOME/END/PGUP/PGDN run the correspondent MoveNodeActions
			keyHandler.put(KeyStroke.getPressed(SWT.HOME, 0),
					getActionRegistry().getAction(MoveNodeAction.LEFT));
			keyHandler.put(KeyStroke.getPressed(SWT.END, 0),
					getActionRegistry().getAction(MoveNodeAction.RIGHT));
			keyHandler.put(KeyStroke.getPressed(SWT.PAGE_UP, 0),
					getActionRegistry().getAction(MoveNodeAction.UP));
			keyHandler.put(KeyStroke.getPressed(SWT.PAGE_DOWN, 0),
					getActionRegistry().getAction(MoveNodeAction.DOWN));

			// SHIFT + HOME/END/PGUP/PGDN run the correspondent precise
			// MoveNodeActions
			keyHandler.put(KeyStroke.getPressed(SWT.HOME, SWT.SHIFT),
					getActionRegistry().getAction(MoveNodeAction.PREC_LEFT));
			keyHandler.put(KeyStroke.getPressed(SWT.END, SWT.SHIFT),
					getActionRegistry().getAction(MoveNodeAction.PREC_RIGHT));
			keyHandler.put(KeyStroke.getPressed(SWT.PAGE_UP, SWT.SHIFT),
					getActionRegistry().getAction(MoveNodeAction.PREC_UP));
			keyHandler.put(KeyStroke.getPressed(SWT.PAGE_DOWN, SWT.SHIFT),
					getActionRegistry().getAction(MoveNodeAction.PREC_DOWN));

			// // run the MoveNodeActions with keypad numbers
			// keyHandler.put(KeyStroke.getPressed('4', SWT.KEYPAD_4, 0),
			// getActionRegistry().getAction(MoveNodeAction.LEFT));
			// keyHandler.put(KeyStroke.getPressed('6', SWT.KEYPAD_6, 0),
			// getActionRegistry().getAction(MoveNodeAction.RIGHT));
			// keyHandler.put(KeyStroke.getPressed('8', SWT.KEYPAD_8, 0),
			// getActionRegistry().getAction(MoveNodeAction.UP));
			// keyHandler.put(KeyStroke.getPressed('2', SWT.KEYPAD_2, 0),
			// getActionRegistry().getAction(MoveNodeAction.DOWN));
			//
			// //run the precise MoveNodeActions with SHIFT + keypad numbers
			// keyHandler.put(KeyStroke.getPressed('4', SWT.KEYPAD_4, SWT.CTRL),
			// getActionRegistry().getAction(MoveNodeAction.PREC_LEFT));
			// keyHandler.put(KeyStroke.getPressed('6', SWT.KEYPAD_6, SWT.CTRL),
			// getActionRegistry().getAction(MoveNodeAction.PREC_RIGHT));
			// keyHandler.put(KeyStroke.getPressed('8', SWT.KEYPAD_8, SWT.CTRL),
			// getActionRegistry().getAction(MoveNodeAction.PREC_UP));
			// keyHandler.put(KeyStroke.getPressed('2', SWT.KEYPAD_2, SWT.CTRL),
			// getActionRegistry().getAction(MoveNodeAction.PREC_DOWN));
		}
		return keyHandler;
	}

	/**
	 * <em>IMPORTANT</em> certain requests, such as the property sheet, may be
	 * made before or after {@link #createPartControl(Composite)} is called. The
	 * order is unspecified by the Workbench. Subclasses may override but must
	 * call super implementation!
	 * 
	 * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
	 */
	@Override
	public Object getAdapter(@SuppressWarnings("unchecked") final Class type) {
		if (type == IPropertySheetPage.class) {
			/*
			 * The PropertySheetPage is extended so that a PropertySheetSorter
			 * that does nothing (compares everything as equal) is being set.
			 * This way the properties will be displayed in the order they are
			 * returned by the property sources instead of being sorted
			 * alphabetically.
			 */
			final PropertySheetPage page = new PropertySheetPage() {
				@Override
				public final void createControl(final Composite parent) {
					setSorter(new PropertySheetSorter() {
						@Override
						public int compare(final IPropertySheetEntry entryA,
								final IPropertySheetEntry entryB) {
							return 0;
						}
					});
					super.createControl(parent);
				}
			};
			// set the PropertySheetPage to use our command stack
			page
					.setRootEntry(new UndoablePropertySheetEntry(
							getCommandStack()));
			return page;
		}
		if (type == CommandStack.class) {
			return getCommandStack();
		}
		if (type == ActionRegistry.class) {
			return getActionRegistry();
		}
		if (type == EditPart.class && getTreeViewer() != null) {
			return getTreeViewer().getRootEditPart();
		}
		if (type == Widget.class && getTreeViewer() != null) {
			return ((TreeEditPart) getTreeViewer().getRootEditPart())
					.getWidget();
		}
		if (type == KeyHandler.class) {
			return keyHandler;
		}
		if (type == SelectionSynchronizer.class) {
			return selectionSynchronizer;
		}
		if (type == IEditorInput.class) {
			return getEditorInput();
		}
		return super.getAdapter(type);
	}

	/**
	 * @return this editor's command stack
	 */
	protected final CommandStack getCommandStack() {
		return getEditDomain().getCommandStack();
	}

	/**
	 * @return this editor's edit domain
	 */
	protected final DefaultEditDomain getEditDomain() {
		return editDomain;
	}

	/**
	 * @return The {@link EditorTreeViewer} in this editor.
	 */
	public final TreeViewer getTreeViewer() {
		return treeViewer;
	}

	/**
	 * This can be used to display messages in this page's status line.
	 * 
	 * @return The {@link IStatusLineManager} from the {@link IActionBars} of
	 *         this page's {@link IPageSite}
	 */
	public final IStatusLineManager getStatusLineManager() {
		return getEditorSite().getActionBars().getStatusLineManager();
	}

	/**
	 * Sets the site and input for this editor and opens the unique perspective
	 * defined in plugin.xml. Subclasses may extend this method but must call
	 * super implementation!
	 * 
	 * @see org.eclipse.ui.IEditorPart#init(IEditorSite, IEditorInput)
	 */
	@Override
	public void init(final IEditorSite site, final IEditorInput input) {
		setSite(site);

		site.getPage().addPartListener(partListener);

		setInput(input);

		/*
		 * Using the active page of the workbench is a workaround for that the
		 * page layout is corrupted if the perspective is set on
		 * getSite().getPage()
		 */
		final IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();

		if (null != page) {
			// open editor perspective
			final String perspectiveID = MuvitorActivator
					.getUniqueExtensionAttributeValue(
							"org.eclipse.ui.perspectives", "id");
			if (null != perspectiveID) {
				final IPerspectiveDescriptor editorPerspective = PlatformUI
						.getWorkbench().getPerspectiveRegistry()
						.findPerspectiveWithId(perspectiveID);
				if (page.getPerspective() != editorPerspective) {
					page.setPerspective(editorPerspective);
				}
			}
		}
	}

	/**
	 * Subclasses must implement to associate {@link KeyStroke}s with Actions in
	 * the passed {@link KeyHandler} which is the one used for the
	 * {@link TreeViewer}.
	 * 
	 * @see #getKeyHandler()
	 */
	abstract protected void setupKeyHandler(KeyHandler kh);

	/**
	 * Subclasses must implement to specify the
	 * {@link ContextMenuProviderWithActionRegistry} that should be used by this
	 * editor's {@link TreeViewer} and is responsible to show the created
	 * actions in the context menu.
	 * 
	 * @param viewer
	 *            The graphical viewer for context menu provider
	 * @return The {@link ContextMenuProviderWithActionRegistry} for the
	 *         specified {@link TreeViewer}.
	 * 
	 * @see #createTreeViewer(Composite)
	 */
	abstract protected ContextMenuProviderWithActionRegistry createContextMenuProvider(
			TreeViewer viewer);

	/**
	 * Subclasses must implement this to specify the {@link EditPartFactory}
	 * that should be used by this editor's {@link TreeViewer}.
	 * 
	 * @return The {@link EditPartFactory} for the GEF {@link TreeViewer}.
	 */
	abstract protected EditPartFactory createTreeEditPartFactory();

	/**
	 * Returns <code>true</code> if the command stack is dirty
	 * 
	 * @see org.eclipse.ui.ISaveablePart#isDirty()
	 */
	@Override
	public final boolean isDirty() {
		return getCommandStack().isDirty();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchPart#setFocus()
	 */
	@Override
	public final void setFocus() {
		getTreeViewer().getControl().setFocus();
		// I suppose this is needed for "focus follow mouse" as in Linux
		updateActions();
		getEditorSite().getActionBars().updateActionBars();
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
	 */
	@Override
	public final boolean isSaveAsAllowed() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.
	 * IProgressMonitor)
	 */
	@Override
	public final void doSave(final IProgressMonitor monitor) {
		try {
			final IFile file = ((IFileEditorInput) getEditorInput()).getFile();
			if (!file.exists()) {
				file.create(new ByteArrayInputStream(new byte[0]), true,
						new SubProgressMonitor(monitor, 5));
			}
			save(file, monitor);
			getCommandStack().markSaveLocation();
		} catch (final CoreException e) {
			ErrorDialog.openError(getSite().getShell(), "Error during save",
					"The current model could not be saved!", e.getStatus());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.EditorPart#doSaveAs()
	 */
	@Override
	public final void doSaveAs() {
		final SaveAsDialog dialog = new SaveAsDialog(getSite().getShell());
		dialog.setTitle("Save as...");
		dialog.setOriginalFile(((IFileEditorInput) getEditorInput()).getFile());
		dialog.open();

		final IPath path = dialog.getResult();
		if (dialog.getReturnCode() == Window.CANCEL || path == null) {
			return;
		}
		final IFile newFile = ResourcesPlugin.getWorkspace().getRoot().getFile(
				path);

		final Job job = new Job("Saving editor model to file") {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				try {
					monitor.beginTask("Save model to file", 1);
					save(newFile, monitor);
					/*
					 * FIXED: model URI presumably changed, so reregister editor
					 */
					IDUtil.registerEditor(MuvitorTreeEditor.this);
					return Status.OK_STATUS;
				} catch (final CoreException e) {
					ErrorDialog.openError(getSite().getShell(),
							"Error during save",
							"The current model could not be saved!", e
									.getStatus());
					return Status.CANCEL_STATUS;
				}
			}
		};
		job.schedule();
		try {
			job.join();
		} catch (final InterruptedException e) {
		}

		if (job.getResult().isOK()) {
			// setInput(new FileEditorInput(newFile))
			// do not call the whole setInput with model loading,
			// setting the input is enough
			getCommandStack().markSaveLocation();
			final FileEditorInput newInput = new FileEditorInput(newFile);
			super.setInput(newInput);
			setPartName(newInput.getFile().getName());
		}
	}

	public final void selectionChanged(final IWorkbenchPart part,
			final ISelection selection) {
		updateActions();
		/*
		 * FIXED: a little hack to keep the actions of this editor (possibly)
		 * enabled when some element is selected in another viewer, the
		 * workbench will respect the editor actions' calculateEnabled state
		 * instead of just disabling them just because the editor is not the
		 * active part any more.
		 */
		try {
			/*
			 * simulate ((EditorSite) getEditorSite()).activateActionBars(true);
			 * via reflection because this method is not public API.
			 */
			getEditorSite().getClass().getMethod("activateActionBars",
					boolean.class).invoke(getEditorSite(), Boolean.TRUE);
		} catch (final Exception e) {
			MuvitorActivator
					.logError(
							"Reflective method invocation failed due to possible change of internal class 'EditorSite'!",
							e);
		}
	}

	/**
	 * This method saves the model to a file using the {@link EMFModelManager}.
	 * Subclasses may extend but must call super implementation!
	 * 
	 * @param file
	 *            The {@link IFile} to save the model to.
	 * @param progressMonitor
	 *            A progress monitor that could be used to show the saving
	 *            status.
	 * @throws CoreException
	 *             This exception indicates that something went wrong during
	 *             saving.
	 */

	protected void save(final IFile file, final IProgressMonitor monitor)
			throws CoreException {
		monitor.beginTask("Saving " + file, 2);
		// save model to file
		try {
			modelManager.save(file.getFullPath());
			monitor.worked(1);
			file.refreshLocal(IResource.DEPTH_ZERO, new SubProgressMonitor(
					monitor, 1));
			monitor.done();
		} catch (final FileNotFoundException e) {
			MuvitorActivator.logError("Error writing file.", e);
		} catch (final IOException e) {
			MuvitorActivator.logError("Error writing file.", e);
		}
	}

	/**
	 * Associate a class of models with the ID of a {@link MuvitorPageBookView}
	 * that has been registered in plugin.xml.
	 * 
	 * @param modelClass
	 *            a class of EObjects
	 * @param viewID
	 *            the ID of a view to show the class of EObjects
	 * @see #showView(EObject)
	 */
	static public final void registerViewID(final EClass eClass,
			final String viewID) {
		eClass2ViewIDMap.put(eClass, viewID);
	}

	/**
	 * This is Muvitor's main method for opening a {@link MuvitorPageBookView}
	 * in the workbench displaying a model. It will check if the {@link EClass}
	 * of the passed model or of one of its ancestors has been registered with a
	 * view ID via {@link #registerViewID(EClass, String)} and will open a view
	 * of this type showing the corresponding model. *
	 * <p>
	 * If a view can be opened successfully it will be returned.
	 * 
	 * @param model
	 *            The model to be shown in the view
	 * @return the view part that has been opened or <code>null</code>
	 * @see #showView(String, EObject)
	 */
	static public final IViewPart showView(final EObject model) {
		final String viewID = eClass2ViewIDMap.get(model.eClass());
		if (viewID != null) {
			return showView(viewID, model);
		}
		final EObject parent = model.eContainer();
		if (parent != null) {
			return showView(parent);
		}
		final String message = "No view for " + model.eClass().getName()
				+ " or indirect container type could be found!";
		MuvitorActivator.logError(message, new IllegalArgumentException());
		return null;
	}

	/**
	 * This method does the actual work of opening a {@link MuvitorPageBookView}
	 * . An unique ID for the passed model is being created and set as secondary
	 * ID of the new view. The model for this ID will be resolved y the view via
	 * {@link IDUtil}.
	 * <p>
	 * If a view can be opened successfully it will be returned.
	 * <p>
	 * In the special case that Eclipse has just been started and there is not
	 * an active {@link IWorkbenchPage} the opening of the view will be delayed
	 * to when the {@link IWorkbenchWindow} is being activated. So, this method
	 * will return null, even if the view might be opened successfully later.
	 * 
	 * @param viewId
	 *            The primary ID of the view to be opened. This must correspond
	 *            to an org.eclipse.ui.views entry in plugin.xml
	 * @param model
	 *            The model to be shown in the view
	 * @return the view part that has been opened or <code>null</code>
	 */
	static protected final IViewPart showView(final String viewId,
			final EObject model) {
		try {
			final IWorkbench workbench = PlatformUI.getWorkbench();
			final IWorkbenchPage page = workbench.getActiveWorkbenchWindow()
					.getActivePage();
			// can't open views without active workbench window!
			if (page != null) {

				/*
				 * Unmaximize a possible maximized view before opening a new
				 * view, otherwise Eclipse would not know about the active
				 * editor
				 */
				final IWorkbenchPartReference activePartRef = page
						.getActivePartReference();
				final int state = page.getPartState(activePartRef);
				if (state == IStackPresentationSite.STATE_MAXIMIZED) {
					page.toggleZoom(activePartRef);
				}

				return page.showView(viewId, IDUtil.getIDForModel(model),
						IWorkbenchPage.VIEW_ACTIVATE);
			}
			/*
			 * this happens if Eclipse has been closed with an open editor,
			 * register a listener on the workbench and show the views when it
			 * has been opened
			 */
			workbench.addWindowListener(new IWindowListener() {
				public final void windowActivated(final IWorkbenchWindow window) {
					try {
						workbench.getActiveWorkbenchWindow().getActivePage()
								.showView(viewId, IDUtil.getIDForModel(model),
										IWorkbenchPage.VIEW_ACTIVATE);
					} catch (final PartInitException e) {
						final String message = "View with ID " + viewId
								+ " could not be initialized belatedly!";
						MuvitorActivator.logError(message, e);
						e.printStackTrace();
					}
					workbench.removeWindowListener(this);
				}

				public final void windowOpened(final IWorkbenchWindow window) {
				}

				public final void windowClosed(final IWorkbenchWindow window) {
				}

				public final void windowDeactivated(
						final IWorkbenchWindow window) {
				}
			});
		} catch (final PartInitException e) {
			final String message = "View with ID " + viewId
					+ " could not be initialized!";
			MuvitorActivator.logError(message, e);
		}
		return null;
	}

	/**
	 * This is Muvitor's main method for closing a view in the workbench showing
	 * a specific EObject. This is the view that has been opened with
	 * {@link #showView(EObject)} for this model.
	 */
	static public final void closeViewShowing(final EObject model) {
		final IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		if (page != null) {
			final IViewReference[] viewRefs = page.getViewReferences();
			for (final IViewReference viewRef : viewRefs) {
				final IViewPart view = viewRef.getView(false);
				if (view instanceof MuvitorPageBookView) {
					final MuvitorPageBookView mpbview = (MuvitorPageBookView) view;
					if (mpbview.getModel() == model) {
						page.hideView(viewRef);
						return;
					}
				}
			}
		}
	}

	/**
	 * Similar to {@link #closeViewShowing(EObject)} this method closes all
	 * views showing an EObject that belongs to the specified editor, according
	 * to {@link IDUtil#getHostEditor(EObject)}.
	 * 
	 * @param editor
	 *            the editor whose views should be closed
	 * @return a list of the EObjects that were shown in the closed views
	 */
	static public final ArrayList<EObject> closeViews(
			final MuvitorTreeEditor editor) {
		final ArrayList<EObject> models = new ArrayList<EObject>();
		final IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		if (page != null) {
			for (final IViewReference viewRef : page.getViewReferences()) {
				final IViewPart view = viewRef.getView(false);
				if (view instanceof MuvitorPageBookView) {
					final EObject model = ((MuvitorPageBookView) view)
							.getModel();
					if (IDUtil.getHostEditor(model) == editor) {
						models.add(model);
						page.hideView(viewRef);
					}
				}
			}
		}
		return models;
	}

	/**
	 * Closes all views of this editor. The model URIs for the currently open
	 * views are stored to the editor's {@link IMemento}. <br>
	 * To be called, when the editor is being closed. Subclasses may extend but
	 * must call super implementation!
	 * 
	 * @see #restoreState(IMemento)
	 * @see org.eclipse.ui.IPersistable#saveState(org.eclipse.ui.IMemento)
	 */
	public void saveState(final IMemento memento) {
		// store URI of the model root's resource and of the models whose views
		// have been closed
		final XMLResource res = (XMLResource) getPrimaryModelRoot().eResource();
		memento.putString(RESOURCE_URI, res.getURI().toString());
		for (final EObject model : closeViews(this)) {
			// get the real uriFragment, not the unique id
			final String uriFragment = IDUtil.getRealURIFragment(model);
			memento.createChild(MODELURIFRAGMENT_KEY, uriFragment);
		}
	}

	/**
	 * Restores the views that were opened when Eclipse was closed during an
	 * editor session if the editor is still able to work on the same file.
	 * Subclasses may extend but must call super implementation!
	 * 
	 * @see #saveState(IMemento)
	 * @see org.eclipse.ui.IPersistableEditor#restoreState(org.eclipse.ui.IMemento)
	 */
	public void restoreState(final IMemento memento) {
		final XMLResource res = (XMLResource) getPrimaryModelRoot().eResource();
		// test if the model opened by this editor instance is the one whose
		// element ID has been stored to the memento
		if (!res.getURI().toString().equals(memento.getString(RESOURCE_URI))) {
			return;
		}
		final ArrayList<EObject> objectsToShow = new ArrayList<EObject>();
		for (final IMemento modelMemento : memento
				.getChildren(MODELURIFRAGMENT_KEY)) {
			final String modelURI = modelMemento.getID();
			final EObject objectToShow = res.getEObject(modelURI);
			/*
			 * FIXED: memento could be inconsistent with model, but usually
			 * should not be
			 */
			if (objectToShow != null) {
				objectsToShow.add(objectToShow);
			}
		}
		/*
		 * FIXED:
		 */
		getSite().getPage().addPartListener(new PartListenerAdapter() {
			@Override
			public void partOpened(final IWorkbenchPartReference partRef) {
				if (partRef.getPart(false) == MuvitorTreeEditor.this) {
					for (final EObject objectToShow : objectsToShow) {
						showView(objectToShow);
					}
					getSite().getPage().removePartListener(this);
				}
			}
		});
	}

	/**
	 * This method implements support for the Muvitor's {@link RevertAction}.
	 * Subclasses may extend but must call super implementation!
	 * 
	 * Closes all views, resets the actual input, and updates all actions.
	 */
	public void revertToLastSaved() {
		closeViews(this);
		getCommandStack().flush();
		setInput(getEditorInput());
		getTreeViewer().setContents(getPrimaryModelRoot());
		updateActions();
	}

	/**
	 * Create an eclipse error marker for the currently edited file on given
	 * location with specified message. An EObject model's ID will be stored
	 * with in this marker, allowing {@link MuvitorTreeEditor} to "jump" to the
	 * error-causing model via {@link #gotoMarker(IMarker)}.
	 * 
	 * @param model
	 *            an EObject model as the problem cause
	 * 
	 * @param location
	 *            the location of the problem
	 * @param message
	 *            a message describing the problem
	 * @return the newly created marker for setting further attributes
	 * 
	 * @see #gotoMarker(IMarker)
	 */
	public final IMarker createErrorMarker(final EObject model,
			final String location, final String message) {
		final IResource resource = ((IFileEditorInput) getEditorInput())
				.getFile();
		try {
			final IMarker marker = resource.createMarker(IMarker.PROBLEM);
			marker.setAttribute(IMarker.MESSAGE, message);
			marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
			marker.setAttribute(IMarker.LOCATION, location);
			final XMLResource res = (XMLResource) model.eResource();
			marker.setAttribute(IMarker.SOURCE_ID, res.getID(model));
			return marker;
		} catch (final CoreException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Convenience method that collects all problem markers like
	 * {@link #findProblemMarkers(String, Object)} for which the attribute has
	 * been set with any value.
	 * 
	 * @param attrName
	 *            some custom attribute that has been set to a marker
	 * @return a list of problem markers for the currently opened file for which
	 *         the attribute has been set with any value
	 */
	public final ArrayList<IMarker> findProblemMarkers(final String attrName) {
		return findProblemMarkers(attrName, null);
	}

	/**
	 * Helper method to find problem markers with specific attribute values. The
	 * main purpose is to to allow checking facilities to manage (especially
	 * delete) problem markers they have created.
	 * 
	 * @param attrName
	 *            some custom attribute that has been set to a marker
	 * @param attrValue
	 *            a value for the attrName attribute to be matched; will be
	 *            ignored if <code>null</code>
	 * @return a list of problem markers for the currently opened file with the
	 *         specified attribute values
	 */
	public final ArrayList<IMarker> findProblemMarkers(final String attrName,
			final Object attrValue) {
		final ArrayList<IMarker> markers = new ArrayList<IMarker>();
		final IResource resource = ((IFileEditorInput) getEditorInput())
				.getFile();
		try {
			for (final IMarker marker : resource.findMarkers(IMarker.PROBLEM,
					false, 1)) {
				final Object actualAttrValue = marker.getAttribute(attrName);
				// is attribute defined for marker?
				if (actualAttrValue != null) {
					if (attrValue == null || attrValue.equals(actualAttrValue)) {
						markers.add(marker);
					}
				}
			}
		} catch (final CoreException e) {
			e.printStackTrace();
		}
		return markers;
	}

	/**
	 * This default implementation of {@link IGotoMarker} tries to resolve the
	 * marker's {@link IMarker#SOURCE_ID} attribute to an EObject model. If such
	 * a model exists it will be opened via {@link #showView(EObject)} (if
	 * possible) and set as the selection in the corresponding viewer.
	 * 
	 * @see org.eclipse.ui.ide.IGotoMarker#gotoMarker(org.eclipse.core.resources.
	 *      IMarker)
	 * 
	 * @see #createErrorMarker(EObject, String, String)
	 */
	public void gotoMarker(final IMarker marker) {
		try {
			final String sourceID = (String) marker
					.getAttribute(IMarker.SOURCE_ID);
			final EObject model = ((XMLResource) getPrimaryModelRoot()
					.eResource()).getEObject(sourceID);
			if (model != null) {
				final IViewPart viewPart = showView(model);
				if (viewPart != null && viewPart instanceof MuvitorPageBookView) {
					final MuvitorPage page = (MuvitorPage) ((MuvitorPageBookView) viewPart)
							.getCurrentPage();
					for (final MultiViewerPageViewer viewer : page.getViewers()) {
						final EditPart part = (EditPart) viewer
								.getEditPartRegistry().get(model);
						if (part != null) {
							viewer.setSelection(new StructuredSelection(part));
							return;
						}
					}
				}
			}
		} catch (final CoreException e) {
			MuvitorActivator.logError("Error while accessing problem marker!",
					e);
		}
	}

	/**
	 * This special TreeViewer is needed to allow the {@link EditPart}s to
	 * access the editor.
	 */
	public final class EditorTreeViewer extends TreeViewer {
		/**
		 * @return The editor that hosts this tree viewer.
		 */
		public MuvitorTreeEditor getEditor() {
			return MuvitorTreeEditor.this;
		}
	}
}
