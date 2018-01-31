/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.processors.transformators

import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.kexpressions.keffects.Effect
import de.cau.cs.kieler.kexpressions.ScheduleObjectReference
import java.util.List
import de.cau.cs.kieler.kexpressions.Schedulable

/**
 * 
 * @author ssm
 * @kieler.design 2017-12-12 proposed
 * @kieler.rating 2017-12-12 proposed yellow  
 */
class UserSchedule extends SCChartsProcessor {
    
    @Inject extension SCChartsStateExtensions
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.userSchedule"
    }
    
    override getName() {
        "User Schedule"
    }
    
    override process() {
        val model = getModel
        
        for (rootState : model.rootStates) {
            rootState.transformUserSchedule   
        }
    }
    
    protected def void transformUserSchedule(State rootState) {
        val userSchedules = rootState.eAllContents.filter(Scope).filter[ !schedule.nullOrEmpty ].toList
        
        for (s : userSchedules) {
            switch(s) {
            State: s.transformUserScheduleState
            ControlflowRegion: s.transformUserScheduleControlflowRegion 
            }
            
        }
    }
    
    protected def void transformUserScheduleState(State state) {
        val schedule = state.schedule
        
        for (t : state.outgoingTransitions) {
            t.applyUserSchedule(schedule)    
        }
        
        if (state.simple) return;
        
        
        for (a : state.actions) {
            a.applyUserSchedule(schedule)
        }
        
        
        // Dataflow regions are not necessary because they are already transformed.
        for (r : state.regions.filter(ControlflowRegion).toList) {
            r.applyUserSchedule(schedule)
            r.transformUserScheduleControlflowRegion
        }
        
        for (s : state.schedule.immutableCopy) {
            s.remove
        }
    }

    protected def void transformUserScheduleControlflowRegion(ControlflowRegion cfRegion) {
        val schedule = cfRegion.schedule
        
        for (a : cfRegion.actions) {
            a.applyUserSchedule(schedule)
        }    
        
        for (s : cfRegion.states) {
            s.applyUserSchedule(schedule) 
        }    

        for (s : cfRegion.schedule.immutableCopy) {
            s.remove
        }

    }
    
    protected def void applyUserSchedule(Action action, List<ScheduleObjectReference> schedule) {
        action.trigger?.addScheduleCopy(schedule)
        for (e : action.effects) {
            e.applyUserSchedule(schedule)
        }
    }
    
    protected def void applyUserSchedule(Effect effect, List<ScheduleObjectReference> schedule) {
        effect.addScheduleCopy(schedule)
        
    }
    
    protected def void applyUserSchedule(State state, List<ScheduleObjectReference> schedule) {
        if (state.simple) {
            for (t : state.outgoingTransitions) {
                t.applyUserSchedule(schedule)
            }
        } else {
            state.addScheduleCopy(schedule)
            state.transformUserScheduleState
        }
    }
    
    protected def void applyUserSchedule(ControlflowRegion cfRegion, List<ScheduleObjectReference> schedule) {
        cfRegion.addScheduleCopy(schedule)
    }
    
    protected def void addScheduleCopy(Schedulable schedulable, List<ScheduleObjectReference> schedule) {
        for (s : schedule) {
            schedulable.schedule += s.copy
        }
    }
    
}
