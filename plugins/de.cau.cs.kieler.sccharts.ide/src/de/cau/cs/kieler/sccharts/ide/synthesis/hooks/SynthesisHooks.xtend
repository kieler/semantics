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
package de.cau.cs.kieler.sccharts.ide.synthesis.hooks

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KGraphElement
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.ide.synthesis.srtg.SRTGSynthesis
import java.util.ArrayList
import java.util.Collections
import java.util.Comparator
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.core.services.KielerServiceLoader

/** 
 * This class provides new instances of all available hooks for the {@link SRTGSynthesis}.
 * @author als ssm
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 */
@ViewSynthesisShared
class SynthesisHooks implements ISynthesisHooks {

    /** 
     * Enumeration for fast invocation of the correct hook method.
     * @author als
     */
	enum Type {NONE, STATE, TRANSITION, REGION}

    /** 
     * The list of hooks classes registered in the extension point 
     */
    final static ArrayList<Class<? extends SynthesisHook>> registeredHooks = <Class<? extends SynthesisHook>>newArrayList

    /** 
     * Priority order 
     */
    final static Comparator<SynthesisHook> decendingHookPriority = [SynthesisHook hook1, SynthesisHook hook2 |
        return hook2.getPriority() - hook1.getPriority()
    ]

    /** 
     * Initializes this class with the data from all SynthesisHook implementations found by the ServiceLoader.
     */
    def static loadHooks() {
        KielerServiceLoader.load(SynthesisHook).forEach[ hook |
            registeredHooks.add(hook.class)
        ]
    }

    /** 
     * Returns the type of the given class.
     * @param clazz the input class
     * @return the fast type
     */
    def static Type getType(Class<? extends EObject> clazz) {
        if (clazz !== null) {
            if (State.isAssignableFrom(clazz)) {
                return Type.STATE 
            } else if (Transition.isAssignableFrom(clazz)) {
                return Type.TRANSITION 
            } else if (Region.isAssignableFrom(clazz)) {
                return Type.REGION 
            }
        }
        return Type.NONE 
    }

    // -- NON-STATIC --

    @Inject Injector injector
    val ArrayList<SynthesisHook> hooksOnDemand = newArrayList()

    private def getHooks() {
        if (hooksOnDemand.empty) {
            if (registeredHooks.empty) {
                loadHooks
            }
            for (Class<? extends SynthesisHook> hook : registeredHooks) {
                var SynthesisHook hookInstance = (injector.getInstance(hook) as SynthesisHook) 
                hooksOnDemand.add(hookInstance) 
            }
            hooksOnDemand.sort(decendingHookPriority) 
        }
        return hooksOnDemand
    }

    /** 
     * Returns the list of hooks.
     * @return the hooks
     */
    def Iterable<SynthesisHook> getAllHooks() {
        return Collections.unmodifiableList(hooks) 
    }

    /** 
     * Invokes the start procedures for all hooks.
     * @param scope the input model.
     * @param node the empty diagram root node
     */
    override void invokeStart(Scope scope, KNode node) {
        for (SynthesisHook hook : hooks) {
            hook.start(scope, node) 
        }
    }

    /** 
     * Invokes the finish procedures for all hooks.
     * @param scope the input model.
     * @param node the diagram root node
     */
    override void invokeFinish(Scope scope, KNode node) {
        for (SynthesisHook hook : hooks) {
            hook.finish(scope, node) 
        }
    }

    /** 
     * Invokes the hook procedures for the given element.
     * @param type the element type.
     * @param element the element
     * @param result the translated element
     */
    override void invokeHooks(Type type, EObject element, KGraphElement result) {
        for (SynthesisHook hook : hooks) {
            switch (type) {
                case STATE: hook.processState((element as State), (result as KNode))
                case TRANSITION: hook.processTransition((element as Transition), (result as KEdge))
                case REGION: hook.processRegion((element as Region), (result as KNode))
                default: {}
            }
        }
    }
}