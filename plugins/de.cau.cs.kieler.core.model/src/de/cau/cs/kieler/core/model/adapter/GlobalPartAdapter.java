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
package de.cau.cs.kieler.core.model.adapter;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IPageListener;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWindowListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.model.CoreModelPlugin;

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
 * <li>Pass a {@link IPartListener} to the constructor which then is used as delegator.</li>
 * <li>Override any of the {@link IPartListener} methods to add the desired functionality.</li>
 * <ul>
 * 
 * @author uru
 * @author als
 */
public class GlobalPartAdapter implements IWindowListener, IPageListener, IPartListener2 {

    /** Holds all currently known workbench windows this instance is registered to as listener. */
    private List<IWorkbenchWindow> windows = new LinkedList<IWorkbenchWindow>();
    /** Holds all currently known workbench pages this instance is registered to as listener. */
    private List<IWorkbenchPage> pages = new LinkedList<IWorkbenchPage>();

    /** Either the listener to which the part events are delegated, or null. */
    private IPartListener2 delegateListener;
    private boolean initialNotifications;

    /**
     * 
     */
    public GlobalPartAdapter() {
        this(null, false);
    }

    /**
     * @param theDelegateListener
     *            a part listener to which all part events are delegated.
     * 
     * @param initialNotifications
     *            if true this listen will initially inform about past events
     */
    public GlobalPartAdapter(final IPartListener2 theDelegateListener, boolean initialNotifications) {
        this.delegateListener = theDelegateListener;
        this.initialNotifications = initialNotifications;

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
                    new Status(Status.ERROR, CoreModelPlugin.PLUGIN_ID,
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

        IWorkbenchPartReference part = page.getActivePartReference();
        if (part != null) {
            partOpened(part);
        }
        if (part == null || initialNotifications) {
            // Re-notify about already open editors
            IEditorReference[] edRefs = page.getEditorReferences();
            if (edRefs != null && edRefs.length > 0) {
                for (IEditorReference ref : edRefs) {
                    partOpened(ref);
                }
            }

            // Re-notify about already open view
            IViewReference[] viewRefs = page.getViewReferences();
            if (viewRefs != null && viewRefs.length > 0) {
                for (IViewReference ref : viewRefs) {
                    partOpened(ref);
                }
            }

            // Re-notify about activation of active editor
            if (page.getActiveEditor() != null && initialNotifications) {
                partActivated(page.getReference(page.getActiveEditor()));
            }

            // Re-notify about activation of active view
            if (page.getActivePartReference() != null
                    && page.getActivePart() instanceof IViewReference && initialNotifications) {
                partActivated(page.getActivePartReference());
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
     * Empty implementations of the IPartListener2 interface.
     */

    /**
     * {@inheritDoc}
     */
    public void partActivated(IWorkbenchPartReference partRef) {
        if (delegateListener != null) {
            delegateListener.partActivated(partRef);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void partBroughtToTop(IWorkbenchPartReference partRef) {
        if (delegateListener != null) {
            delegateListener.partBroughtToTop(partRef);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void partClosed(IWorkbenchPartReference partRef) {
        if (delegateListener != null) {
            delegateListener.partClosed(partRef);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void partDeactivated(IWorkbenchPartReference partRef) {
        if (delegateListener != null) {
            delegateListener.partDeactivated(partRef);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void partOpened(IWorkbenchPartReference partRef) {
        if (delegateListener != null) {
            delegateListener.partOpened(partRef);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void partHidden(IWorkbenchPartReference partRef) {
        if (delegateListener != null) {
            delegateListener.partHidden(partRef);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void partVisible(IWorkbenchPartReference partRef) {
        if (delegateListener != null) {
            delegateListener.partVisible(partRef);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void partInputChanged(IWorkbenchPartReference partRef) {
        if (delegateListener != null) {
            delegateListener.partInputChanged(partRef);
        }
    }
}
