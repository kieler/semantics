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

import org.eclipse.xtext.xtext.generator.DefaultGeneratorModule
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming

/**
 * DefaultGeneratorModule with registered GeneratorNaming
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class KielerGeneratorModule extends DefaultGeneratorModule {
    
    def Class<? extends XtextGeneratorNaming> bindXtextGeneratorNaming() {
        KielerGeneratorNaming
    }
}
