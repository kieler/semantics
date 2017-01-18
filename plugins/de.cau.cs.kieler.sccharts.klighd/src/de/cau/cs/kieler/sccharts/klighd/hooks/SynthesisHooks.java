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
import java.util.Comparator;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.elk.graph.KEdge;
import org.eclipse.elk.graph.KGraphElement;
import org.eclipse.elk.graph.KNode;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.statushandlers.StatusManager;

import com.google.inject.Inject;
import com.google.inject.Injector;

import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared;
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.Scope;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.Transition;
import de.cau.cs.kieler.sccharts.klighd.SCChartsKlighdPlugin;

/**
 * This class provides new instances of all available hooks for the {@link SRTGSynthesis}.
 * 
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 *
 */
@ViewSynthesisShared
public class SynthesisHooks {

    /**
     * Enumeration for fast invocation of the correct hook method.
     * 
     * @author als
     */
    public enum Type {
        NONE, STATE, TRANSITION, REGION
    };

    /** Identifier of the extension point for hooks. */
    private static final String EXTP_ID_HOOKS = "de.cau.cs.kieler.sccharts.klighd.hooks";

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
                            new Status(IStatus.ERROR, SCChartsKlighdPlugin.PLUGIN_ID,
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
    private final ArrayList<SynthesisHook> hooks;

    /**
     * Standard constructor.
     * 
     * @param injector
     *            the injector used for the injection of this class.
     */
    @Inject
    public SynthesisHooks(Injector injector, AbstractDiagramSynthesis<?> synthesis) {
        hooks = new ArrayList<SynthesisHook>(registeredHooks.size());
        for (Class<? extends SynthesisHook> hook : registeredHooks) {
            hooks.add((SynthesisHook) injector.getInstance(hook));
        }
        hooks.sort(decendingHookPriority);
    }

    /**
     * Returns the list of hooks.
     * 
     * @return the hooks
     */
    public Iterable<SynthesisHook> getAllHooks() {
        return Collections.unmodifiableList(hooks);
    }

    /**
     * Invokes the start procedures for all hooks.
     * 
     * @param scope
     *            the input model.
     * @param node
     *            the empty diagram root node
     */
    public void invokeStart(Scope scope, KNode node) {
        for (SynthesisHook hook : hooks) {
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
    public void invokeFinish(Scope scope, KNode node) {
        for (SynthesisHook hook : hooks) {
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
    @SuppressWarnings("incomplete-switch")
    public void invokeHooks(Type type, EObject element, KGraphElement result) {
        for (SynthesisHook hook : hooks) {
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
