/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.ui.util;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IPageListener;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IPerspectiveListener;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWindowListener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.ui.CoreUIPlugin;

/**
 * This listener keeps track of all windows, pages, parts... etc that are
 * currently existing on the workbench. It allows for listeners to be registered
 * to all objects of one of these types. It makes sure that newly opened views
 * are kept track of as well as removing listeners from closed objects. It also
 * contains methods to be notified of all currently opened objects as if they
 * had just opened.
 * 
 * FIXME this class makes heavy use of static hash sets without thinking about synchronization!
 * 
 * @author soh
 */
public class CombinedWorkbenchListener implements IStartup, IWindowListener,
        IWorkbenchListener, IPageListener, IPerspectiveListener, IPartListener,
        ISelectionListener, IPropertyListener {

    private static CombinedWorkbenchListener instance;

    private static IWorkbench theWorkbench;

    private static Set<IWorkbenchWindow> windows = new HashSet<IWorkbenchWindow>();

    private static Set<IWorkbenchPage> pages = new HashSet<IWorkbenchPage>();

    private static Set<IWorkbenchPart> parts = new HashSet<IWorkbenchPart>();

    private static Set<IWorkbenchListener> workbenchListeners = new HashSet<IWorkbenchListener>();

    private static Set<IWindowListener> windowListeners = new HashSet<IWindowListener>();

    private static Set<IPageListener> pageListeners = new HashSet<IPageListener>();

    private static Set<IPerspectiveListener> perspectiveListeners = new HashSet<IPerspectiveListener>();

    private static Set<IPartListener> partListeners = new HashSet<IPartListener>();

    private static Set<ISelectionListener> selectionListeners = new HashSet<ISelectionListener>();

    private static Set<IPropertyListener> propertyListeners = new HashSet<IPropertyListener>();

    /**
     * 
     * Creates a new CombinedWorkbenchListener.
     * 
     */
    public CombinedWorkbenchListener() {
        instance = this;
    }

    /**
     * Add a new WorkbenchListener to the list of listeners.
     * 
     * @param listener
     *            the new listener.
     */
    public static void addWorkbenchListener(final IWorkbenchListener listener) {
        workbenchListeners.add(listener);
    }

    /**
     * Remove a WorkbenchListener from the list of listeners.
     * 
     * @param listener
     *            the listener to remove
     */
    public static void removeWorkbenchListener(final IWorkbenchListener listener) {
        workbenchListeners.remove(listener);
    }

    /**
     * Add a new WindowListener to the list of listeners.
     * 
     * @param listener
     *            the new listener.
     */
    public static void addWindowListener(final IWindowListener listener) {
        windowListeners.add(listener);
    }

    /**
     * Remove a WindowListener from the list of listeners.
     * 
     * @param listener
     *            the listener to remove
     */
    public static void removeWindowListener(final IWindowListener listener) {
        windowListeners.remove(listener);
    }

    /**
     * Notify the given WindowListener with a windowOpened() event for all
     * windows that are already open.
     * 
     * @param listener
     *            the listener to notify
     */
    public static void receiveAlreadyOpenedWindows(
            final IWindowListener listener) {
        for (IWorkbenchWindow window : windows) {
            listener.windowOpened(window);
        }
    }

    /**
     * Add a new PerspectiveListener to the list of listeners.
     * 
     * @param listener
     *            the new listener.
     */
    public static void addPerspectiveListener(
            final IPerspectiveListener listener) {
        perspectiveListeners.add(listener);
    }

    /**
     * Remove a PerspectiveListener from the list of listeners.
     * 
     * @param listener
     *            the listener to remove
     */
    public static void removePerspectiveListener(
            final IPerspectiveListener listener) {
        perspectiveListeners.remove(listener);
    }

    /**
     * Add a new PageListener to the list of listeners.
     * 
     * @param listener
     *            the new listener.
     */
    public static void addPageListener(final IPageListener listener) {
        pageListeners.add(listener);
    }

    /**
     * Remove a PageListener from the list of listeners.
     * 
     * @param listener
     *            the listener to remove
     */
    public static void removePageListener(final IPageListener listener) {
        pageListeners.remove(listener);
    }

    /**
     * Notify the given PageListener with a pageOpened() event for all pages
     * that are already open.
     * 
     * @param listener
     *            the listener to notify
     */
    public static void receiveAlreadyOpenedPages(final IPageListener listener) {
        for (IWorkbenchPage page : pages) {
            listener.pageOpened(page);
        }
    }

    /**
     * Add a new PartListener to the list of listeners.
     * 
     * @param listener
     *            the new listener.
     */
    public static void addPartListener(final IPartListener listener) {
        partListeners.add(listener);
    }

    /**
     * Remove a PartListener from the list of listeners.
     * 
     * @param listener
     *            the listener to remove
     */
    public static void removePartListener(final IPartListener listener) {
        partListeners.remove(listener);
    }

    /**
     * Notify the given PartListener with a partOpened() event for all parts
     * that are already open.
     * 
     * @param listener
     *            the listener to notify
     */
    public static void receiveAlreadyOpenedParts(final IPartListener listener) {
        for (IWorkbenchPart part : parts) {
            listener.partOpened(part);
        }
    }

    /**
     * Add a new SelectionListener to the list of listeners.
     * 
     * @param listener
     *            the new listener.
     */
    public static void addSelectionListener(final ISelectionListener listener) {
        selectionListeners.add(listener);
    }

    /**
     * Remove a SelectionListener from the list of listeners.
     * 
     * @param listener
     *            the listener to remove
     */
    public static void removeSelectionListener(final ISelectionListener listener) {
        selectionListeners.remove(listener);
    }

    /**
     * Add a new PropertyListener to the list of listeners.
     * 
     * @param listener
     *            the new listener.
     */
    public static void addPropertyListener(final IPropertyListener listener) {
        propertyListeners.add(listener);
    }

    /**
     * Remove a PropertyListener from the list of listeners.
     * 
     * @param listener
     *            the listener to remove
     */
    public static void removePropertyListener(final IPropertyListener listener) {
        propertyListeners.remove(listener);
    }

    /**
     * {@inheritDoc}
     */
    public void earlyStartup() {
        try {
            theWorkbench = PlatformUI.getWorkbench();
            theWorkbench.addWindowListener(this);
            theWorkbench.addWorkbenchListener(this);

            IWorkbenchWindow window = theWorkbench.getActiveWorkbenchWindow();

            if (window != null) {
                windowOpened(window);
            } else {
                try {
                    IWorkbenchWindow[] openWindows = theWorkbench
                            .getWorkbenchWindows();
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
            StatusManager.getManager().handle(new Status(Status.ERROR, CoreUIPlugin.PLUGIN_ID,
                    "Unable to register the combined workbench listener.", exception));
        }
    }

    /**
     * {@inheritDoc}
     */
    public boolean preShutdown(final IWorkbench workbench, final boolean forced) {
        boolean result = true;
        for (IWorkbenchListener listener : workbenchListeners) {
            result = listener.preShutdown(workbench, forced) && result;
        }
        return result;
    }

    /**
     * {@inheritDoc}
     */
    public void postShutdown(final IWorkbench workbench) {
        for (IWorkbenchListener listener : workbenchListeners) {
            listener.postShutdown(workbench);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void windowActivated(final IWorkbenchWindow window) {
        if (!windows.contains(window)) {
            windowOpened(window);
        } else {
            for (IWindowListener listener : windowListeners) {
                listener.windowActivated(window);
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    public void windowDeactivated(final IWorkbenchWindow window) {
        for (IWindowListener listener : windowListeners) {
            listener.windowDeactivated(window);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void windowClosed(final IWorkbenchWindow window) {
        windows.remove(window);
        window.removePerspectiveListener(this);
        window.removePageListener(this);
        for (IWindowListener listener : windowListeners) {
            listener.windowClosed(window);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void windowOpened(final IWorkbenchWindow window) {
        windows.add(window);
        window.addPerspectiveListener(this);
        window.addPageListener(this);

        for (IWindowListener listener : windowListeners) {
            listener.windowOpened(window);
        }

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
    public void perspectiveActivated(final IWorkbenchPage page,
            final IPerspectiveDescriptor perspective) {
        for (IPerspectiveListener listener : perspectiveListeners) {
            listener.perspectiveActivated(page, perspective);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void perspectiveChanged(final IWorkbenchPage page,
            final IPerspectiveDescriptor perspective, final String changeId) {
        for (IPerspectiveListener listener : perspectiveListeners) {
            listener.perspectiveChanged(page, perspective, changeId);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void pageActivated(final IWorkbenchPage page) {
        if (!pages.contains(page)) {
            pageOpened(page);
        } else {
            for (IPageListener listener : pageListeners) {
                listener.pageActivated(page);
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    public void pageClosed(final IWorkbenchPage page) {
        pages.remove(page);
        page.removePartListener(this);
        page.addSelectionListener(this);

        for (IPageListener listener : pageListeners) {
            listener.pageClosed(page);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void pageOpened(final IWorkbenchPage page) {
        pages.add(page);
        page.addPartListener(this);
        page.addSelectionListener(this);

        for (IPageListener listener : pageListeners) {
            listener.pageOpened(page);
        }

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
    public void selectionChanged(final IWorkbenchPart part,
            final ISelection selection) {
        for (ISelectionListener listener : selectionListeners) {
            listener.selectionChanged(part, selection);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void partActivated(final IWorkbenchPart part) {
        if (!parts.contains(part)) {
            partOpened(part);
        } else {
            for (IPartListener listener : partListeners) {
                listener.partActivated(part);
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    public void partBroughtToTop(final IWorkbenchPart part) {
        for (IPartListener listener : partListeners) {
            listener.partBroughtToTop(part);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void partClosed(final IWorkbenchPart part) {
        parts.remove(part);
        part.removePropertyListener(this);
        for (IPartListener listener : partListeners) {
            listener.partClosed(part);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void partDeactivated(final IWorkbenchPart part) {
        for (IPartListener listener : partListeners) {
            listener.partDeactivated(part);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void partOpened(final IWorkbenchPart part) {
        parts.add(part);
        part.addPropertyListener(this);

        for (IPartListener listener : partListeners) {
            listener.partOpened(part);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void propertyChanged(final Object source, final int propId) {
        for (IPropertyListener listener : propertyListeners) {
            listener.propertyChanged(source, propId);
        }
    }

    /**
     * Getter for the instance.
     * 
     * @return the instance
     */
    public static CombinedWorkbenchListener getInstance() {
        if (instance == null) {
            instance = new CombinedWorkbenchListener();
        }
        return instance;
    }

}
