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
    static public String CVIEW_PREFERENCE_FILTER = "filter";
    static public String KLIGHD_MODEL_VIEW = "de.cau.cs.kieler.klighd.ui.view.diagram";

    /** The Constant EXTENSION_POINT_ID. */
    public static final String CONNECTION_HOOK_EXTENSION_POINT_ID =
            "de.cau.cs.kieler.cview.connection";
    
    // The plug-in ID
    public static final String PLUGIN_ID = "de.cau.cs.kieler.cview"; //$NON-NLS-1$
    

    static ArrayList<IConnectionHook> connectionHooks = null; 
    
    // -------------------------------------------------------------------------

    @Override
    public void start(BundleContext context) throws Exception {
    }

    @Override
    public void stop(BundleContext context) throws Exception {
    }

    // -------------------------------------------------------------------------
    
    public static boolean isEnabled(String hookId) {
        Preferences preferences = InstanceScope.INSTANCE.getNode(CVIEW_PREFERENCE_ID);
        return (preferences.get(CVIEW_PREFERENCE_ENABLED + hookId, "enabled").equals("enabled"));
    }

    
    public static void setEnabled(String hookId, boolean enabled) {
        IEclipsePreferences preferences = InstanceScope.INSTANCE.getNode(CVIEW_PREFERENCE_ID);

        if (enabled) {
            preferences.put(CVIEW_PREFERENCE_ENABLED + hookId, "enabled");
        } else {
            preferences.put(CVIEW_PREFERENCE_ENABLED + hookId, "disabled");
        }
        try {
            preferences.flush();
        } catch (Exception e) {
        }
    }

    // -------------------------------------------------------------------------

    public static void setFilter(String filter) {
        IEclipsePreferences preferences = InstanceScope.INSTANCE.getNode(CVIEW_PREFERENCE_ID);

        preferences.put(CVIEW_PREFERENCE_FILTER, filter);
        try {
            preferences.flush();
        } catch (Exception e) {
        }
    }

    public static String getFilter() {
        Preferences preferences = InstanceScope.INSTANCE.getNode(CVIEW_PREFERENCE_ID);
        return (preferences.get(CVIEW_PREFERENCE_FILTER, ""));
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

    public static void refreshCView(boolean forceRebuid) {
        AbstractKLighDController.controller.refreshCView(forceRebuid);
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
    
    public static void clearSelectionHooks() {
        connectionHooks = null;
    }
    
    public static String extractId(String item) {
        int start = item.lastIndexOf("(");
        if (start >= 0) {
            int end = item.lastIndexOf(")");
            if (end > start) {
                return item.substring(start+1, end);
            }
        }
        return "";
    }

    public static List<String> filterSelectedRegisteredConnectionHookIds(List<String> inputList) {
        ArrayList returnList = new ArrayList<String>();
        List<IConnectionHook> hooks = getRegisteredConnectionHooks(true);
        for (IConnectionHook hook: hooks) {
            for (String item : inputList) {
                String hookId = extractId(item);
                if (hookId.equals(hook.getId())) {
                    if (CViewPlugin.isEnabled(hook.getId())) {
                        returnList.add(item);
                    }
                }
            }
        }
        return returnList;
    }

    public static List<String> getAllRegisteredConnectionHookIds() {
        ArrayList returnList = new ArrayList<String>();
        List<IConnectionHook> hooks = getRegisteredConnectionHooks(true);
        for (IConnectionHook hook: hooks) {
                returnList.add(hook.getName() + " (" + hook.getId() + ")");
        }
        return returnList;
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
