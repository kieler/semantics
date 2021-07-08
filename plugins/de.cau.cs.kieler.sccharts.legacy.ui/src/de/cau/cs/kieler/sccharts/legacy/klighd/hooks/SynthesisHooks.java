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
package de.cau.cs.kieler.sccharts.legacy.klighd.hooks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.statushandlers.StatusManager;

import com.google.inject.Inject;
import com.google.inject.Injector;

import de.cau.cs.kieler.klighd.kgraph.KEdge;
import de.cau.cs.kieler.klighd.kgraph.KGraphElement;
import de.cau.cs.kieler.klighd.kgraph.KNode;
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared;
import de.cau.cs.kieler.sccharts.legacy.klighd.synthesis.SCChartsSynthesis;
import de.cau.cs.kieler.sccharts.legacy.sccharts.Region;
import de.cau.cs.kieler.sccharts.legacy.sccharts.Scope;
import de.cau.cs.kieler.sccharts.legacy.sccharts.State;
import de.cau.cs.kieler.sccharts.legacy.sccharts.Transition;
import de.cau.cs.kieler.sccharts.legacy.text.ui.internal.SctActivator;

/**
 * This class provides new instances of all available hooks for the {@link SCChartsSynthesis}.
 * 
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 *
 */
@ViewSynthesisShared
public class SynthesisHooks implements ISynthesisHooks {

    /**
     * Enumeration for fast invocation of the correct hook method.
     * 
     * @author als
     */
    public enum Type {
        NONE, STATE, TRANSITION, REGION
    };

    /** Identifier of the extension point for hooks. */
    private static final String EXTP_ID_HOOKS = "de.cau.cs.kieler.sccharts.legacy.ui.hooks";

    /** Name of the 'hook' element. */
    private static final String ELEMENT_HOOK = "hook";

    /** Name of the 'class' attribute in the extension points. */
    private static final String ATTRIBUTE_CLASS = "class";

    /** The list of hooks classes registered in the extension point */
    private final static ArrayList<Class<? extends SynthesisHook>> registeredHooks;
    
    /** Priority order */
    private final static Comparator<SynthesisHook> decendingHookPriority = new Comparator<SynthesisHook>() {

        @Override
        public int compare(SynthesisHook hook1, SynthesisHook hook2) {
            return hook2.getPriority() - hook1.getPriority();
        }
        
    };

    /**
     * Initializes this class with the data from the extension point.
     */
    static {
        final IConfigurationElement[] extensions =
                Platform.getExtensionRegistry().getConfigurationElementsFor(EXTP_ID_HOOKS);

        registeredHooks = new ArrayList<Class<? extends SynthesisHook>>(extensions.length);

        for (final IConfigurationElement element : extensions) {
            if (ELEMENT_HOOK.equals(element.getName())) {
                try {
                    @SuppressWarnings("unchecked")
					Class<? extends SynthesisHook> hookClass = (Class<? extends SynthesisHook>) element
							.createExecutableExtension(ATTRIBUTE_CLASS).getClass();
                    registeredHooks.add(hookClass);
                } catch (final Exception exception) {
                    StatusManager.getManager().handle(
                            new Status(IStatus.ERROR, SctActivator.DE_CAU_CS_KIELER_SCCHARTS_LEGACY_TEXT_SCT,
                                    SynthesisHooks.class.getName()
                                            + ": Error while parsing hook extension point",
                                    exception));
                }
            }
        }
    }

    /**
     * Returns the type of the given class.
     * 
     * @param clazz
     *            the input class
     * @return the fast type
     */
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

    // -- NON-STATIC --

    /** The instances of the hooks. */
    private final ArrayList<SynthesisHook> hooksOnDemand = new ArrayList<>();

    @Inject private Injector injector;

    private java.util.List<SynthesisHook> getHooks() {
        if (hooksOnDemand.isEmpty()) {
            for (Class<? extends SynthesisHook> hook : registeredHooks) {
                SynthesisHook hookInstance = (SynthesisHook) injector.getInstance(hook);
                hooksOnDemand.add(hookInstance);
            }
            hooksOnDemand.sort(decendingHookPriority);
        }
        return hooksOnDemand;
    }

    /**
     * Returns the list of hooks.
     * 
     * @return the hooks
     */
    public Iterable<SynthesisHook> getAllHooks() {
        return Collections.unmodifiableList(getHooks());
    }

    /**
     * Invokes the start procedures for all hooks.
     * 
     * @param scope
     *            the input model.
     * @param node
     *            the empty diagram root node
     */
    @Override
    public void invokeStart(Scope scope, KNode node) {
        for (SynthesisHook hook : getHooks()) {
            hook.start(scope, node);
        }
    }

    /**
     * Invokes the finish procedures for all hooks.
     * 
     * @param scope
     *            the input model.
     * @param node
     *            the diagram root node
     */
    @Override
    public void invokeFinish(Scope scope, KNode node) {
        for (SynthesisHook hook : getHooks()) {
            hook.finish(scope, node);
        }
    }

    /**
     * Invokes the hook procedures for the given element.
     * 
     * @param type
     *            the element type.
     * @param element
     *            the element
     * @param result
     *            the translated element
     */
    @Override
    @SuppressWarnings("incomplete-switch")
    public void invokeHooks(Type type, EObject element, KGraphElement result) {
        for (SynthesisHook hook : getHooks()) {
            switch (type) {
            case STATE:
                hook.processState((State) element, (KNode) result);
                break;
            case TRANSITION:
                hook.processTransition((Transition) element, (KEdge) result);
                break;
            case REGION:
                hook.processRegion((Region) element, (KNode) result);
                break;
            }
        }
    }
}
