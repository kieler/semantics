package de.cau.cs.kieler.cview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.prefs.Preferences;

import com.google.inject.Guice;

import de.cau.cs.kieler.cview.hooks.IConnectionHook;

public class CViewPlugin implements BundleActivator {

    static public String CVIEW_PREFERENCE_ID = "de.cau.cs.kieler.cview.preferences.active";
    static public String CVIEW_PREFERENCE_ENABLED = "active";
    static public String KLIGHD_MODEL_VIEW = "de.cau.cs.kieler.klighd.ui.view.diagram";

    /** The Constant EXTENSION_POINT_ID. */
    public static final String CONNECTION_HOOK_EXTENSION_POINT_ID =
            "de.cau.cs.kieler.cview.connection";

    static ArrayList<IConnectionHook> connectionHooks = null; 
    
    // -------------------------------------------------------------------------

    @Override
    public void start(BundleContext context) throws Exception {
    }

    @Override
    public void stop(BundleContext context) throws Exception {
    }

    // -------------------------------------------------------------------------

    public static void setEnabled(boolean enabled) {
        IEclipsePreferences preferences = InstanceScope.INSTANCE.getNode(CVIEW_PREFERENCE_ID);

        if (enabled) {
            preferences.put(CVIEW_PREFERENCE_ENABLED, "enabled");
        } else {
            preferences.put(CVIEW_PREFERENCE_ENABLED, "disabled");
        }
        try {
            preferences.flush();
        } catch (Exception e) {
        }
    }

    // -------------------------------------------------------------------------

    public static boolean isEnabled() {
        Preferences preferences = InstanceScope.INSTANCE.getNode(CVIEW_PREFERENCE_ID);
        return (preferences.get(CVIEW_PREFERENCE_ENABLED, "disabled").equals("enabled"));
    }

    public static void refreshCView() {
        AbstractKLighDController.controller.refreshCView();
    }

    // -------------------------------------------------------------------------

    public static void showModelView() {
        try {
            PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
                    .showView(KLIGHD_MODEL_VIEW);
        } catch (PartInitException e) {
            e.printStackTrace();
        }
    }

    // -------------------------------------------------------------------------

    public static List<IConnectionHook> getRegisteredConnectionHooks(boolean forceReload) {
        if (connectionHooks != null && !forceReload) {
            return connectionHooks;
        }
        if (connectionHooks == null || forceReload) {
            connectionHooks = new ArrayList<IConnectionHook>();
        }
        // Otherwise inspect the extensions
        IConfigurationElement[] extensions = Platform.getExtensionRegistry()
                .getConfigurationElementsFor(CONNECTION_HOOK_EXTENSION_POINT_ID);
        // Walk thru every extension and instantiate the declared class, then put it into the cache
        for (IConfigurationElement extension : extensions) {
            try {
                IConnectionHook instance =
                        (IConnectionHook) extension.createExecutableExtension("class");
                // Handle the case that wee need Google Guice for instantiation
                instance = (IConnectionHook) getGuiceInstance(instance);
                connectionHooks.add(instance);
            } catch (CoreException e) {
                e.printStackTrace();
            }
        }
        return connectionHooks;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the guice instance.
     * 
     * @param object
     *            the object
     * @return the guice instance
     */
    public static Object getGuiceInstance(Object object) {
        Object guiceInstance = Guice.createInjector().getInstance(object.getClass());
        return guiceInstance;
    }

    // -------------------------------------------------------------------------
}
