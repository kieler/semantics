package de.cau.cs.kieler.synccharts.fixBugs;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.contentadapter.SyncchartsContentUtil;
import de.cau.cs.kieler.synccharts.contentadapter.UniqueStringCache;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "de.cau.cs.kieler.synccharts.fixBugs";

    // The shared instance
    private static Activator plugin;

    private static List<UniqueStringCache> caches = new LinkedList<UniqueStringCache>();

    /**
     * The constructor
     */
    public Activator() {
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    @Override
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    /**
     * Debug output for xtend code.
     * 
     * @param object
     *            the message
     */
    public final static void debug(final Object object) {
        System.out.println("BUGFIX DEBUG: " + object.toString());
    }

    public static List<State> getStateList() {
        return new LinkedList<State>();
    }

    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static Activator getDefault() {
        return plugin;
    }

    public static void clearCache() {
        caches.clear();
    }

    public static void generateStateId(final State state) {
        if (state.getId() == null || state.getId().trim().equals("")) {
            String anonymousId = getUniqueString(state,
                    SyncchartsPackage.eINSTANCE.getState_Id(), "_S");
            state.setId(anonymousId);
            return;
        }

        // check whether ID is unique
        Region parentRegion = state.getParentRegion();
        if (parentRegion != null) {
            for (State sibling : parentRegion.getInnerStates()) {
                String siblingId = sibling.getId();
                if (siblingId != null && siblingId.equals(state.getId())
                        && sibling != state) {
                    // resolve conflict by changing auto generated IDs (for
                    // anonymous states)

                    String dummyId = getUniqueString(sibling,
                            SyncchartsPackage.eINSTANCE.getState_Id(), sibling
                                    .getLabel());
                    sibling.setId(dummyId);

                }
            }
        }
    }

    public static void generateRegionId(final Region region) {
        if (region.getId() == null || region.getId().trim().equals("")) {
            String anonymousId = getUniqueString(region,
                    SyncchartsPackage.eINSTANCE.getRegion_Id(), "_R");
            region.setId(anonymousId);
            return;
        }

        // check whether ID is unique
        State parentState = region.getParentState();
        if (parentState != null) {
            for (Region sibling : parentState.getRegions()) {
                String siblingId = sibling.getId();
                if (siblingId != null && siblingId.equals(region.getId())) {
                    // resolve conflict by changing auto generated IDs (for
                    // anonymous states)
                    if (sibling.getId() == null
                            || sibling.getId().trim().equals("")) {
                        String dummyId = getUniqueString(sibling,
                                SyncchartsPackage.eINSTANCE.getRegion_Id(),
                                "_R");
                        sibling.setId(dummyId);
                    }
                }
            }
        }
    }

    private static String getUniqueString(final EObject target,
            final EAttribute attribute, final String prefix) {
        EObject parent = target.eContainer();
        UniqueStringCache cache = null;
        for (UniqueStringCache c : caches) {
            if (c != null && (parent == null && c.getParent() == null)
                    || (c.getParent() != null && c.getParent().equals(parent))
                    && c.getAttribute().equals(attribute)) {
                cache = c;
            }
        }
        if (cache == null) {
            cache = new UniqueStringCache(parent, attribute);
            caches.add(cache);
        }
        String temp = SyncchartsContentUtil.getNewUniqueString(target,
                attribute, prefix, cache);
        cache.add(temp);
        return temp;
    }
}
