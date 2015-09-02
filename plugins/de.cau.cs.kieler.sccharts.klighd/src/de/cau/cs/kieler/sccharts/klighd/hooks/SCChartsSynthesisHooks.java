/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.klighd.hooks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.statushandlers.StatusManager;

import com.google.inject.Binding;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Key;

import de.cau.cs.kieler.core.kgraph.KEdge;
import de.cau.cs.kieler.core.kgraph.KGraphElement;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.Scope;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.Transition;
import de.cau.cs.kieler.sccharts.klighd.SCChartsKlighdPlugin;

/**
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 *
 */
@ViewSynthesisShared
public class SCChartsSynthesisHooks {

    public enum Type {
        NONE, STATE, TRANSITION, REGION
    };

    /** identifier of the extension point for hooks. */
    private static final String EXTP_ID_HOOKS = "de.cau.cs.kieler.sccharts.klighd.hooks";

    /** name of the 'hook' element. */
    private static final String ELEMENT_HOOK = "hook";

    /** Name of the 'class' attribute in the extension points. */
    private static final String ATTRIBUTE_CLASS = "class";

    private final static ArrayList<Class<? extends SCChartsSynthesisHook>> registeredHooks;
    
    private static Map<Key<?>, Binding<?>> bindings;

    /**
     * Initializes this class with the data from the extension point.
     */
    static {
        final IConfigurationElement[] extensions =
                Platform.getExtensionRegistry().getConfigurationElementsFor(EXTP_ID_HOOKS);

        registeredHooks = new ArrayList<Class<? extends SCChartsSynthesisHook>>(extensions.length);

        for (final IConfigurationElement element : extensions) {
            if (ELEMENT_HOOK.equals(element.getName())) {
                // initialize controller classes from the extension point
                try {
                    Class<? extends SCChartsSynthesisHook> hookClass =
                            (Class<? extends SCChartsSynthesisHook>) Class.forName(element
                                    .getAttribute(ATTRIBUTE_CLASS));
                    registeredHooks.add(hookClass);
                } catch (final Exception exception) {
                    StatusManager.getManager().handle(
                            new Status(IStatus.ERROR, SCChartsKlighdPlugin.PLUGIN_ID,
                                    SCChartsSynthesisHooks.class.getName()
                                            + ": Error while parsing controller extension point",
                                    exception));
                }
            }
        }
    }

    public static Type getType(Class<? extends EObject> clazz) {
        if (clazz != null) {
            if (State.class.isAssignableFrom(clazz)) {
                return Type.STATE;
            } else if (Transition.class.isAssignableFrom(clazz)) {
                return Type.TRANSITION;
            } else if (Region.class.isAssignableFrom(clazz)) {
                return Type.REGION;
            }
        }
        return Type.NONE;
    }

    private final ArrayList<SCChartsSynthesisHook> hooks;

    /**
     * This inject is the injector used for the injection of this class.
     */
    @Inject
    public SCChartsSynthesisHooks(Injector injector) {
        hooks = new ArrayList<SCChartsSynthesisHook>(registeredHooks.size());
        if (bindings == null) {
            bindings = new HashMap<Key<?>, Binding<?>>(injector.getAllBindings());
        }
        for (Class<? extends SCChartsSynthesisHook> hookClass : registeredHooks) {
            hooks.add(injector.getInstance(hookClass));
        }
    }

    public Iterable<SCChartsSynthesisHook> getAllHooks() {
        return Collections.unmodifiableList(hooks);
    }

    public void invokeStart(Scope scope, KNode node) {
        for (SCChartsSynthesisHook hook : hooks) {
            hook.start(scope, node);
        }
    }

    public void invokeFinish(Scope scope, KNode node) {
        for (SCChartsSynthesisHook hook : hooks) {
            hook.finish(scope, node);
        }
    }

    @SuppressWarnings("incomplete-switch")
    public void invokePre(Type type, EObject object) {
        for (SCChartsSynthesisHook hook : hooks) {
            switch (type) {
            case STATE:
                hook.preState((State) object);
                break;
            case TRANSITION:
                hook.preTransition((Transition) object);
                break;
            case REGION:
                hook.preRegion((Region) object);
                break;
            }
        }
    }

    @SuppressWarnings("incomplete-switch")
    public void invokePost(Type type, EObject object, KGraphElement elem) {
        for (SCChartsSynthesisHook hook : hooks) {
            switch (type) {
            case STATE:
                hook.postState((State) object, (KNode) elem);
                break;
            case TRANSITION:
                hook.postTransition((Transition) object, (KEdge) elem);
                break;
            case REGION:
                hook.postRegion((Region) object, (KNode) elem);
                break;
            }
        }
    }

    /**
     * @return the bindings
     */
    public static Map<Key<?>, Binding<?>> getBindings() {
        return bindings;
    }

}
