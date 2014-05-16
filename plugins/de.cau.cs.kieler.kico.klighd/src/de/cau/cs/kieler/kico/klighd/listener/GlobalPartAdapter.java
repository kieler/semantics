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
package de.cau.cs.kieler.kico.klighd.listener;

import java.util.List;

import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IPageListener;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWindowListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.statushandlers.StatusManager;

import com.google.common.collect.Lists;

import de.cau.cs.kieler.core.kivi.KiViPlugin;

/**
 * Use this class to listen to part changes of any opened part in the workbench.
 * 
 * The initial registration happens upon construction of this class. The listener is registered as a
 * {@link IWindowListener} in the workbench. Already opened windows are considered as well.
 * 
 * Call {@link #unregister()} as soon as this listener is not required anymore.
 * 
 * <emph>Implementation Notes</emph> There are two possibilities to use this listener.
 * <ul>
 *      <li>Pass a {@link IPartListener} to the constructor which then is used as delegator.</li>
 *      <li>Override any of the {@link IPartListener} methods to add the desired functionality.</li>
 * <ul>
 * 
 * @author uru
 */
public class GlobalPartAdapter implements IWindowListener, IPageListener, IPartListener {

    /** Holds all currently known workbench windows this instance is registered to as listener. */
    private List<IWorkbenchWindow> windows = Lists.newLinkedList();
    /** Holds all currently known workbench pages this instance is registered to as listener. */
    private List<IWorkbenchPage> pages = Lists.newLinkedList();

    /** Either the listener to which the part events are delegated, or null. */
    private IPartListener delegateListener;

    /**
     * 
     */
    public GlobalPartAdapter() {
        this(null);
    }

    /**
     * @param theDelegateListener
     *            a part listener to which all part events are delegated.
     */
    public GlobalPartAdapter(final IPartListener theDelegateListener) {
        this.delegateListener = theDelegateListener;

        // register as window listener
        PlatformUI.getWorkbench().addWindowListener(this);

        // collect all parts that are already opened in the active workbench window
        try {
            IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
            if (window != null) {
                windowOpened(window);
            } else {
                try {
                    IWorkbenchWindow[] openWindows =
                            PlatformUI.getWorkbench().getWorkbenchWindows();
                    if (openWindows != null && openWindows.length > 0) {
                        for (IWorkbenchWindow w : openWindows) {
                            windowOpened(w);
                        }
                    }
                } catch (NullPointerException e0) {
                    // in some cases of errors during early startup
                    // the window manager might be null causing
                    // getWorkbenchWindows() to throw a NPE
                }
            }
        } catch (IllegalStateException exception) {
            // the workbench is not present yet
            StatusManager.getManager().handle(
                    new Status(Status.ERROR, KiViPlugin.PLUGIN_ID,
                            "Unable to register a global part adapter.", exception));
        }
    }

    /*
     * --------------------------------------------------------------------------------------------
     * IWindowListener - upon window open/close, register as IPageListener
     */

    /**
     * {@inheritDoc}
     */
    public void windowOpened(final IWorkbenchWindow window) {
        windows.add(window);
        window.addPageListener(this);

        IWorkbenchPage page = window.getActivePage();
        if (page != null) {
            pageOpened(page);
        } else {
            IWorkbenchPage[] openPages = window.getPages();
            if (openPages != null && openPages.length > 0) {
                for (IWorkbenchPage p : openPages) {
                    pageOpened(p);
                }
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    public void windowClosed(final IWorkbenchWindow window) {
        windows.remove(window);
        window.removePageListener(this);
    }

    /**
     * {@inheritDoc}
     */
    public void windowActivated(final IWorkbenchWindow window) {
    }

    /**
     * {@inheritDoc}
     */
    public void windowDeactivated(final IWorkbenchWindow window) {
    }

    /*
     * ---------------------------------------------------------------------------------------------
     * IPageListener - upon window open/close, register as IPartListener
     */
    /**
     * {@inheritDoc}
     */
    public void pageOpened(final IWorkbenchPage page) {
        pages.add(page);
        page.addPartListener(this);

        IWorkbenchPart part = page.getActivePart();
        if (part != null) {
            partOpened(part);
        } else {
            IEditorReference[] edRefs = page.getEditorReferences();
            if (edRefs != null && edRefs.length > 0) {
                for (IEditorReference ref : edRefs) {
                    IEditorPart editor = ref.getEditor(false);
                    if (editor != null) {
                        partOpened(editor);
                    }
                }
            }

            IViewReference[] viewRefs = page.getViewReferences();
            if (viewRefs != null && viewRefs.length > 0) {
                for (IViewReference ref : viewRefs) {
                    IViewPart view = ref.getView(false);
                    if (view != null) {
                        partOpened(view);
                    }
                }
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    public void pageClosed(final IWorkbenchPage page) {
        pages.remove(page);
        page.removePartListener(this);
    }

    /**
     * {@inheritDoc}
     */
    public void pageActivated(final IWorkbenchPage page) {
    }

    /*
     * --------------------------------------------------------------------------------------------
     * Unregister
     */

    /**
     * Call this method once this {@link GlobalPartAdapter} is not required anymore. As a result, it
     * is removed from all {@link IWorkbenchPage}s and {@link IWorkbenchWindow}s it listens to.
     */
    public void unregister() {
        for (IWorkbenchPage page : pages) {
            page.removePartListener(this);
        }
        pages.clear();

        for (IWorkbenchWindow window : windows) {
            window.removePageListener(this);
        }
        windows.clear();
    }

    /*
     * --------------------------------------------------------------------------------------------
     * Empty implementations of the IPartListener interface.
     */

    /**
     * {@inheritDoc}
     */
    public void partBroughtToTop(final IWorkbenchPart part) {
        if (delegateListener != null) {
            delegateListener.partBroughtToTop(part);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void partActivated(final IWorkbenchPart part) {
        if (delegateListener != null) {
            delegateListener.partActivated(part);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void partClosed(final IWorkbenchPart part) {
        if (delegateListener != null) {
            delegateListener.partClosed(part);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void partDeactivated(final IWorkbenchPart part) {
        if (delegateListener != null) {
            delegateListener.partDeactivated(part);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void partOpened(final IWorkbenchPart part) {
        if (delegateListener != null) {
            delegateListener.partOpened(part);
        }
    }
}
