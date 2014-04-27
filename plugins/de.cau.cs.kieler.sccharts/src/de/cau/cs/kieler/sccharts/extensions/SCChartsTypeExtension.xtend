/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.StateType
import de.cau.cs.kieler.sccharts.Transition
import java.util.List

import static de.cau.cs.kieler.sccharts.extensions.SCChartsFeature.*
import static de.cau.cs.kieler.sccharts.extensions.SCChartsType.*

/**
 * All Features in SCCharts
 *  
 * @author als
 * 
 */
enum SCChartsFeature {

    //--CORE--
    //SyncCharts
    SUSPEND,
    SIGNAL,
    COUNTDELAY,
    PRE,

    //SCADE / QUARTZ / ESTEREL 
    HISTORY,
    STATIC,
    WEAKSUSPEND,
    DEFERRED,

    //StateCharts
    COMPLEXFINALSTATE,
    ABORT,
    DURING,
    EXIT,
    INITIALIZATION,
    ENTRY,
    CONNECTOR,

    //--NORMALIZE--   
    TRIGGEREFFECT,
    SURFACEDEPTH
}

/**
 * Types of SCCharts
 *  
 * @author als
 * 
 */
enum SCChartsType {
    EXTENDED,
    CORE,
    NORMALIZED
}

/**
 * Extension to get the type of a SCChart by analyzing used features
 * 
 * @author als
 *
 */
class SCChartsTypeExtension {

    @Inject
    extension KExpressionsExtension

    @Inject
    extension SCChartsExtension

    //-------------------------------------------------------------------------
    //--                DEFINITION OF SCCHARTS TYPES                         --
    //-------------------------------------------------------------------------
    /**
     * Return a list of all features which should not be part of a SCChart with given type.
     */
    def List<SCChartsFeature> excludedFeatures(SCChartsType type) {
        switch (type) {
            case EXTENDED:
                return #[]
            case CORE:
                return #[HISTORY, STATIC, WEAKSUSPEND, DEFERRED, COMPLEXFINALSTATE, ABORT, DURING, EXIT, INITIALIZATION,
                    ENTRY, CONNECTOR, SUSPEND, SIGNAL, COUNTDELAY, PRE]
            case NORMALIZED:
                return #[HISTORY, STATIC, WEAKSUSPEND, DEFERRED, COMPLEXFINALSTATE, ABORT, DURING, EXIT, INITIALIZATION,
                    ENTRY, CONNECTOR, SUSPEND, SIGNAL, COUNTDELAY, PRE,
                    //Nomalize
                    TRIGGEREFFECT, SURFACEDEPTH]
        }
    }

    //-------------------------------------------------------------------------
    //--                BASIC INTERFACE                                      --
    //-------------------------------------------------------------------------
    /**
     * Returns true if the given SCChart has given type
     */
    def boolean isOfType(Region region, SCChartsType type) {
        type.excludedFeatures.findFirst[region.hasFeature(it)] == null;
    }

    /**
     * Returns true if the given SCChart contains given feature
     */
    def boolean hasFeature(Region region, SCChartsFeature feature) {
        switch (feature) {
            //CORE
            case HISTORY:
                return hasHistory(region)
            case STATIC:
                return hasStatic(region)
            case WEAKSUSPEND:
                return hasWeakSuspend(region)
            case DEFERRED:
                return hasDefered(region)
            case COMPLEXFINALSTATE:
                return hasComplexFinalState(region)
            case ABORT:
                return hasAbort(region)
            case DURING:
                return hasDuring(region)
            case EXIT:
                return hasExit(region)
            case INITIALIZATION:
                return hasInit(region)
            case ENTRY:
                return hasEntry(region)
            case CONNECTOR:
                return hasConnector(region)
            case SUSPEND:
                return hasSuspend(region)
            case SIGNAL:
                return hasSignal(region)
            case COUNTDELAY:
                return hasCountDelay(region)
            case PRE:
                return hasPre(region)
            //NORMALIZE    
            case TRIGGEREFFECT:
                return hasTriggerEffect(region)
            case SURFACEDEPTH:
                return hasSurfaceDepth(region)
        }
    }

    //-------------------------------------------------------------------------
    //--                FEATURE ANALYSERS                                    --
    //-------------------------------------------------------------------------
    // All checks are optimized in cases lazy execution in Xtend.
    // Thus a checks return immediately if a feature is found.
    //-------------------------------------------------------------------------
    // CORE
    private def boolean hasHistory(Region region) {
        return region.eAllContents.filter(Transition).findFirst[it.isHistory] != null;
    }

    private def boolean hasStatic(Region region) {
        return region.eAllContents.filter(State).findFirst[!it.valuedObjects.filter[isStatic].empty] != null;
    }

    private def boolean hasWeakSuspend(Region region) {
        return region.eAllContents.filter(State).findFirst[!it.suspendActions.filter[weak].empty] != null;
    }

    private def boolean hasDefered(Region region) {
        return region.eAllContents.filter(Transition).findFirst[it.deferred] != null;
    }

    private def boolean hasComplexFinalState(Region region) {
        return region.eAllContents.filter(State).findFirst[
            !it.allContainedStates.filter(
                e|
                    e.parentRegion.parentState == it && e.isFinal && (!e.outgoingTransitions.nullOrEmpty ||
                        e.allContainedStates.size > 0 || e.entryActions.size > 0 || e.duringActions.size > 0 ||
                        e.exitActions.size > 0)).empty] != null;
    }

    private def boolean hasAbort(Region region) {
        return region.eAllContents.filter(Transition).findFirst[!it.typeTermination] != null;
    }

    private def boolean hasDuring(Region region) {
        return region.eAllContents.filter(State).findFirst[!it.duringActions.nullOrEmpty] != null;
    }

    private def boolean hasExit(Region region) {
        return region.eAllContents.filter(State).findFirst[!it.exitActions.nullOrEmpty] != null;
    }

    private def boolean hasInit(Region region) {
        return region.eAllContents.filter(State).findFirst[!it.valuedObjects.filter[initialValue != null].empty] != null;
    }

    private def boolean hasEntry(Region region) {
        return region.eAllContents.filter(State).findFirst[!it.entryActions.nullOrEmpty] != null;
    }

    private def boolean hasConnector(Region region) {
        return region.eAllContents.filter(State).findFirst[it.type == StateType.CONNECTOR] != null;
    }

    private def boolean hasSuspend(Region region) {
        return region.eAllContents.filter(State).findFirst[!it.suspendActions.nullOrEmpty] != null;
    }

    private def boolean hasSignal(Region region) {
        return region.eAllContents.filter(State).findFirst[!it.signals.nullOrEmpty] != null;
    }

    private def boolean hasCountDelay(Region region) {
        return region.eAllContents.filter(Transition).findFirst[it.delay > 1] != null;
    }

    private def boolean hasPre(Region region) {
        return region.eAllContents.filter(OperatorExpression).findFirst[it.operator == OperatorType.PRE] != null;
    }

    //NORMALIZE
    private def boolean hasTriggerEffect(Region region) {
        return region.eAllContents.filter(Transition).findFirst[
            ((it.trigger != null || !it.immediate || it.typeTermination) && !it.effects.nullOrEmpty) ||
                it.effects.size > 1] != null;

    }

    private def boolean hasSurfaceDepth(Region region) {
        return region.eAllContents.filter(State).findFirst[
            it.outgoingTransitions.size > 0 && it.type == StateType::NORMAL &&
                !it.outgoingTransitions.get(0).typeTermination &&
                (it.outgoingTransitions.get(0).trigger != null || !it.outgoingTransitions.get(0).immediate)] != null;
    }
}
