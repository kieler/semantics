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
package de.cau.cs.kieler.annotations.xtext

import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.xtext.generator.model.project.StandardProjectConfig

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class KielerProjectConfig extends StandardProjectConfig {
    
    /** 
     * If true the project will be used to define package names otherwise the gramma package.<br>
     * For example:<br>
     * Grammar: de.cau.cs.kieler.kexpressions.keffects.KEffects<br>
     * Project: de.cau.cs.kieler.kexpressions<br>
     * if true: de.cau.cs.kieler.kexpressions.ui.keffects
     * if false: de.cau.cs.kieler.kexpressions.keffects.ui
     */
    @Accessors
    var boolean projectRelatedPackageNames = false
    
    /**
     * The name of the grammar.
     */
    @Accessors
    var String grammar    
}