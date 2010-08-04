package de.tu_berlin.cs.tfs.muvitorkit.ui;

import de.tu_berlin.cs.tfs.muvitorkit.ui.utils.MuvitorNotifierService;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.IPage;
import org.eclipse.ui.part.IPageBookViewPage;
import org.eclipse.ui.part.MessagePage;
import org.eclipse.ui.part.PageBook;
import org.eclipse.ui.part.PageBookView;

/**
 * This is a {@link PageBookView} for displaying some model {@link EObject} on
 * an {@link IPage}. It is merely a wrapper for the contained
 * {@link MuvitorPage} implementing {@link IPage}, as this is the only
 * possibility Eclipse offers to show a customized page in a workbench view. The
 * {@link GraphicalViewer}s for editing are hosted in this {@link MuvitorPage}.
 * 
 * <p>
 * <b> The user has to implement {@link #createPageForModel(EObject)} to
 * instantiate a {@link MuvitorPage} that is able to display or even edit the
 * model. </b>
 * </p>
 * 
 * <p>
 * The model to show is determined by the following mechanism: <br>
 * It is expected that this view is opened via a call
 * {@link MuvitorTreeEditor#showView(String, EObject)} where
 * <ul>
 * <li>the first string is the viewID to that this view has been registered with
 * in the plugin.xml.
 * <li>model is the model to be displayed.
 * </ul>
 * This call sets the EObject's unique ID for the model as secondary ID of this
 * view. So, the model to be shown can be determined by the secondary ID.
 * </p>
 * 
 * <p>
 * The AbstractTreeEditor instance will hide this view when its model is being
 * deleted (for details see how {@link IDUtil#getIDForModel(EObject)} employs
 * the Muvitor's {@link MuvitorNotifierService}).
 * </p>
 * 
 * <p>
 * Additionally this view registers itself an EMF adapter to the model
 * {@link EObject} that reacts on notifications of the EMF model. For this,
 * subclasses may override {#notifyChanged(Notification)}, especially to update
 * the name of this {@link IViewPart} according to the model. For this,
 * {@link #calculatePartName()} must be implemented to represent the model's
 * name as a string.
 * </p>
 * 
 * <p>
 * This class is based roughly on ContentOutline but does not provide selections
 * e.g. to {@link ISelectionService}s. Selection are handled by the
 * {@link MuvitorPage}s.
 * </p>
 * 
 * @author Tony Modica
 */
public abstract class MuvitorPageBookView extends PageBookView {

	/**
	 * Not very elegant but I do not see another possibility to check whether
	 * the page is shown
	 */
	private boolean pageShown = false;

	/**
	 * The EMF adapter listening to the EObject shown in this view.
	 */
	final private Adapter adapter = new AdapterImpl() {
		@Override
		public void notifyChanged(final Notification msg) {
			MuvitorPageBookView.this.notifyChanged(msg);
		}
	};

	/**
	 * The model to be displayed in the view's page.
	 */
	private EObject model;

	private IEditorPart editor;

	/**
	 * @return the model
	 */
	final public EObject getModel() {
		return model;
	}

	/**
	 * @return The name this part should be set to, e.g. the name of the shown
	 *         model accessible via {@link #getModel()}.
	 */
	abstract protected String calculatePartName();

	/**
	 * Subclasses must implement this method to create a {@link IPage} that
	 * displays the model. It may be advisable to ensure the model being an
	 * instance of the intended class(es) here.
	 * 
	 * @param forModel
	 *            The model to be displayed in the page.
	 * @return An {@link IPage} displaying the passed model.
	 */
	abstract protected IPage createPageForModel(EObject forModel);

	/**
	 * By default, {@link #notifyChanged(Notification)} calls
	 * <code>setPartName(calculatePartName())</code>.
	 * <p>
	 * Subclasses may override but must call super.
	 * {@link #notifyChanged(Notification)} if they do not handle changing the
	 * part name themselves.
	 */
	protected void notifyChanged(final Notification msg) {
		setPartName(calculatePartName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.part.PageBookView#createDefaultPage(org.eclipse.ui.part
	 * .PageBook)
	 */
	@Override
	final protected IPage createDefaultPage(final PageBook book) {
		final MessagePage defaultPage = new MessagePage();
		initPage(defaultPage);
		defaultPage.createControl(book);
		defaultPage.setMessage("The Editor did not return a model for ID: "
				+ getViewSite().getSecondaryId()
				+ " or some other nasty error has occured!");

		return defaultPage;
	}

	/**
	 * Subclasses may override but must call super.
	 * {@link #doCreatePage(IWorkbenchPart)}. Note that this method returns a
	 * PageRec only once and <code>null</code> afterwards!.
	 * 
	 * @return A PageRec with a new Page for the model determined by the
	 *         secondaryID which is being resolved via {@link IDUtil}.
	 * 
	 * @see #createPageForModel(Object)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.part.PageBookView#doCreatePage(org.eclipse.ui.IWorkbenchPart
	 * )
	 */
	@Override
	protected PageRec doCreatePage(final IWorkbenchPart editor) {
		if (pageShown) {
			// we already have a page shown (which will not be replaced)
			return null;
		}
		final String secondaryID = getViewSite().getSecondaryId();
		Assert
				.isNotNull(
						secondaryID,
						"Secondary ID must be set for AbstractPageBookViews to determine a model to be shown!");

		model = IDUtil.getModelForID(secondaryID);

		// show default error page if no model is returned by the editor
		if (null == model) {
			return null;
		}

		// register for listening for notifications on the model
		model.eAdapters().add(adapter);

		// create page for the model
		final IPage page = createPageForModel(model);
		initPage((IPageBookViewPage) page);
		page.createControl(getPageBook());

		// set the part's name for the first time
		setPartName(calculatePartName());

		return new PageRec(editor, page);
	}

	/**
	 * Subclasses may override but must call super.
	 * {@link #doDestroyPage(IWorkbenchPart, PageRec)}.
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.part.PageBookView#doDestroyPage(org.eclipse.ui.IWorkbenchPart
	 * , org.eclipse.ui.part.PageBookView.PageRec)
	 */
	@Override
	protected void doDestroyPage(final IWorkbenchPart part, final PageRec rec) {
		model.eAdapters().remove(adapter);
		final IPage page = rec.page;
		page.dispose();
		rec.dispose();
		/*
		 * This prevents the page to be layouted causing an SWTError on its
		 * disposed FlyoutComposite. We won't need the page book anyway after
		 * this.
		 */
		getPageBook().dispose();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.PageBookView#getBootstrapPart()
	 */
	@Override
	final protected IWorkbenchPart getBootstrapPart() {
		return getEditor();
	}

	/**
	 * @return
	 */
	final public IEditorPart getEditor() {
		/*
		 * TODO try new getEditor() FIXED this better has to be stored lazily,
		 * when disposing this view the model may already have been removed from
		 * the model so that no host editor can be found
		 */
		if (editor == null) {
			// if model has been determined we can get the editor via the model
			if (model != null) {
				// final IWorkbenchPart editor = IDUtil.getHostEditor(model);
				// if (editor != null)
				// return editor;
				editor = IDUtil.getHostEditor(model);
			}
			// otherwise this view is going to be opened now, so just get the
			// active editor
			final IWorkbenchPage page = getSite().getPage();
			if (page != null) {
				editor = page.getActiveEditor();
			}
		}
		return editor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IPartListener#partBroughtToTop(org.eclipse.ui.IWorkbenchPart
	 * )
	 */
	@Override
	final public void partActivated(final IWorkbenchPart part) {
		// bring parent editor to top
		if (part == this) {
			getSite().getPage().bringToTop(getBootstrapPart());
		} else {
			super.partActivated(part);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.ui.part.PageBookView#partBroughtToTop(org.eclipse.ui.
	 * IWorkbenchPart)
	 */
	@Override
	final public void partBroughtToTop(final IWorkbenchPart part) {
		// react on editor brought to top; page book views just work this way
		super.partActivated(part);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.part.PageBookView#showPageRec(org.eclipse.ui.part.PageBookView
	 * .PageRec)
	 */
	@Override
	final protected void showPageRec(final PageRec pageRec) {
		// change the active page just once for the first page
		if (model != null && !pageShown) {
			pageShown = true;
			super.showPageRec(pageRec);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.part.PageBookView#isImportant(org.eclipse.ui.IWorkbenchPart
	 * )
	 */
	@Override
	final protected boolean isImportant(final IWorkbenchPart part) {
		// could just return true, but this optimizes memory footprint a bit
		return part instanceof MuvitorTreeEditor;
	}

	@Override
	public void setFocus() {
		// FIXED avoid a strange SWTError that occurs only when closing an
		// editor after restoring it
		if (getPageBook() != null && !getPageBook().isDisposed()) {
			super.setFocus();
		}
	}

}
