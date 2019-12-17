/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.providers

import de.cau.cs.kieler.kicool.registration.IProcessorProvider

/**
 * Provider to make processors available to KiCool.
 * 
 * @author Wechselberg
 */
class SCChartsProcessorProvider implements IProcessorProvider {
    
    override getProcessors() {
        #[
            de.cau.cs.kieler.sccharts.processors.scg.SCGTransformation,
            de.cau.cs.kieler.sccharts.processors.scg.SCG2SCCProcessor,
            de.cau.cs.kieler.sccharts.processors.scg.SCGCircuitDataflowProcessor,
            de.cau.cs.kieler.sccharts.processors.ArrayAssignment,
            de.cau.cs.kieler.sccharts.processors.SurfaceDepth,
            de.cau.cs.kieler.sccharts.processors.TriggerEffect,
            de.cau.cs.kieler.sccharts.processors.Abort,
            de.cau.cs.kieler.sccharts.processors.ComplexFinalState,
            de.cau.cs.kieler.sccharts.processors.Connector,
            de.cau.cs.kieler.sccharts.processors.WeakSuspend,
            de.cau.cs.kieler.sccharts.processors.Suspend,
            de.cau.cs.kieler.sccharts.processors.Static,
            de.cau.cs.kieler.sccharts.processors.Signal,
            de.cau.cs.kieler.sccharts.processors.Reference,
            de.cau.cs.kieler.sccharts.processors.Pre,
            de.cau.cs.kieler.sccharts.processors.Map,
            de.cau.cs.kieler.sccharts.processors.FollowedBy,
            de.cau.cs.kieler.sccharts.processors.Initialization,
            de.cau.cs.kieler.sccharts.processors.History,
            de.cau.cs.kieler.sccharts.processors.For,
            de.cau.cs.kieler.sccharts.processors.Exit,
            de.cau.cs.kieler.sccharts.processors.Entry,
            de.cau.cs.kieler.sccharts.processors.During,
            de.cau.cs.kieler.sccharts.processors.Deferred,
            de.cau.cs.kieler.sccharts.processors.CountDelay,
            de.cau.cs.kieler.sccharts.processors.Const,
            de.cau.cs.kieler.sccharts.processors.Reference,
            de.cau.cs.kieler.sccharts.processors.For,
            de.cau.cs.kieler.sccharts.processors.TakenTransitionSignaling,
            de.cau.cs.kieler.sccharts.processors.dataflow.Dataflow,
            de.cau.cs.kieler.sccharts.processors.PrTransitions,
            de.cau.cs.kieler.sccharts.processors.UserSchedule,
            de.cau.cs.kieler.sccharts.processors.SequentialFollowedBy,
            de.cau.cs.kieler.sccharts.processors.InitOperator,
            de.cau.cs.kieler.sccharts.processors.FinalRegion,
            de.cau.cs.kieler.sccharts.processors.ValuedObjectRise,
            de.cau.cs.kieler.sccharts.processors.Period,
            de.cau.cs.kieler.sccharts.processors.TimedAutomata,
            de.cau.cs.kieler.sccharts.processors.RegionActionsAndDeclarations,
            de.cau.cs.kieler.sccharts.processors.Inheritance,
            de.cau.cs.kieler.sccharts.processors.statebased.DeSurfaceDepth,
            de.cau.cs.kieler.sccharts.processors.statebased.DeConditionalize,
            de.cau.cs.kieler.sccharts.processors.statebased.DeImmediateDelay,
            de.cau.cs.kieler.sccharts.processors.statebased.DeTriggerEffect,
            de.cau.cs.kieler.sccharts.processors.statebased.SuperfluousSuperstateRemover,
            de.cau.cs.kieler.sccharts.processors.statebased.codegen.StatebasedCCodeGenerator,
            de.cau.cs.kieler.sccharts.processors.statebased.lean.codegen.c.StatebasedLeanCCodeGenerator,
            de.cau.cs.kieler.sccharts.processors.statebased.lean.codegen.java.StatebasedLeanJavaCodeGenerator,
            de.cau.cs.kieler.sccharts.processors.dataflow.ToHybridDataflow,
            de.cau.cs.kieler.sccharts.processors.dataflow.ToSimpleDataflow,
            de.cau.cs.kieler.sccharts.processors.dataflow.RegionDependencies,
            de.cau.cs.kieler.sccharts.processors.dataflow.RegionDependencySort,
            de.cau.cs.kieler.sccharts.processors.dataflow.DeLoopRegions,
            de.cau.cs.kieler.sccharts.processors.dataflow.StateDependencies,
            de.cau.cs.kieler.sccharts.processors.dataflow.ControlDependencies,
            de.cau.cs.kieler.sccharts.processors.csv.CSVToSCTX,
            de.cau.cs.kieler.sccharts.processors.ArduinoTemplateGenerator,
            de.cau.cs.kieler.sccharts.processors.NXJTemplateGenerator,
            de.cau.cs.kieler.sccharts.processors.ValuedObjectRise,
            de.cau.cs.kieler.sccharts.processors.SclCodeEffect
        ]
    }
    
}
