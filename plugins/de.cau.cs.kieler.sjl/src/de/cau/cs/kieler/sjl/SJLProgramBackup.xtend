/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sjl


/**
 * SJL.
 * 
 * @author cmot
 * @kieler.design 2013-03-01 proposed cmot
 * @kieler.rating 2013-03-01 proposed yellow
 */
import java.util.Hashtable
import java.util.List
import java.util.LinkedList

abstract class SJLProgramBackup<State extends Enum<?>> {

    State startState;
    int startPrio;
    
    private Hashtable<State, List<State>> childStatesHashtable = new Hashtable<State, List<State>>();
    
    State currentState;
    
	//-------------------------------------------------------------------------
	
   	def public void initialize (State startState, int startPrio) {
   	    this.startState = startState;
        this.startPrio = startPrio;
   	}

	//-------------------------------------------------------------------------
	
	def void tick() {
	    
	}
	
    //-------------------------------------------------------------------------

    def boolean isTickDone() {
        return false;
    }
    
    //-------------------------------------------------------------------------

    def State state() {
        return currentState;
    }
    
    //-------------------------------------------------------------------------
    
    def fork(State forkedState, int prio) {
        //val LinkedList<State> childStates = getChildStates(currentState);
        //childStates.add(currentState);
    }
    
    //-------------------------------------------------------------------------

    def termB() {
        
    }
    
    //-------------------------------------------------------------------------

    def abort() {
        
    }
    
    //-------------------------------------------------------------------------

    def gotoB(State resumeState) {
        
    }
    
    //-------------------------------------------------------------------------
    
    def pauseB(State resumeState) {
        
    }

    //-------------------------------------------------------------------------
    
    def void join(State elseResumeState) {
    }
        
    //-------------------------------------------------------------------------
    //--    CONVENIENT METHODS
    //-------------------------------------------------------------------------    

    def transB(State stateLabel) {
        abort();
        gotoB(stateLabel);
    }
    
    //-------------------------------------------------------------------------
    //--    INTERNAL METHODS
    //-------------------------------------------------------------------------
    
    def List<State> getChildStates(State state) {
//        // If not yet a hashtable exist create one
//        if (!childStatesHashtable.contains(state)) {
//            var childStates = new LinkedList<State>();
//            childStatesHashtable.put(state, childStates);
//        }
//        return childStatesHashtable.get(state);
    } 

    //-------------------------------------------------------------------------
}













