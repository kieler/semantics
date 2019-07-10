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
package de.cau.cs.kieler.simulation

/**
 * @author als
 */
class SimulationCommunicationAPI {
    
    public static val ACTION_KEY = "action"
    public static val EVENT_KEY = "event"
    public static val POOL_KEY = "pool"
    public static val TICK_KEY = "tick"
    
    public static val EVENT_START_KEY = "start"
    public static val EVENT_PAUSE_KEY = "pause"
    public static val EVENT_STOP_KEY = "stop"
    public static val EVENT_STEP_KEY = "step"    
    
    public static val ACTION_PLAY_KEY = "play"
    public static val ACTION_PAUSE_KEY = "pause"
    public static val ACTION_STOP_KEY = "stop"
    public static val ACTION_STEP_KEY = "step"
    public static val ACTION_SET_KEY = "set"
    public static val ACTION_PATCH_KEY = "patch"
    
}