package de.cau.cs.kieler.cview;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.prefs.Preferences;

public class CViewPlugin implements BundleActivator {

    static public String CVIEW_PREFERENCE_ID = "de.cau.cs.kieler.cview.preferences.active";
    static public String CVIEW_PREFERENCE_ENABLED = "active";
    static public String KLIGHD_MODEL_VIEW = "de.cau.cs.kieler.klighd.ui.view.diagram";

    @Override
    public void start(BundleContext context) throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public void stop(BundleContext context) throws Exception {
        // TODO Auto-generated method stub

    }

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

    public static boolean isEnabled() {
        Preferences preferences = InstanceScope.INSTANCE.getNode(CVIEW_PREFERENCE_ID);
        return (preferences.get(CVIEW_PREFERENCE_ENABLED, "disabled").equals("enabled"));
    }
    
    public static void refreshCView() {
        AbstractKLighDController.controller.refreshCView();
    }
    
    public static void showModelView() {
        try {
            PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(KLIGHD_MODEL_VIEW);
        } catch (PartInitException e) {
            e.printStackTrace();
        }
    }

}
