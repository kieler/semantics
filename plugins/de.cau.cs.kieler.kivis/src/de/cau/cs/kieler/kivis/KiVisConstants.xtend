/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kivis

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class KiVisConstants {
    
    public static val FILE_EXTENSION = ".kviz"
    public static val SIMULATION_CONTROL_CALLBACK = "java_callback_kivis_simulation_control"
    public static val ACTION_SETTER_CALLBACK = "java_callback_kivis_action_setter"
    public static val VISUALIZATION_FUNCTION = "js_function_kivis_visualize"
    
    public static val IProperty<String> VISUALIZATION = 
        new Property<String>("de.cau.cs.kieler.kivis.visualization", null)
    
}