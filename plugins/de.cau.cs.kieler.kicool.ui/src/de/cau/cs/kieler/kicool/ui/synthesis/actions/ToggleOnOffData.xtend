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
package de.cau.cs.kieler.kicool.ui.synthesis.actions

import org.eclipse.xtend.lib.annotations.Data
import de.cau.cs.kieler.kicool.ui.view.CompilerView
import de.cau.cs.kieler.kicool.compilation.CompilationContext

/**
 * @author ssm
 * @kieler.design 2017-06-19 proposed 
 * @kieler.rating 2017-06-19 proposed yellow
 */
 @Data
class ToggleOnOffData {
    de.cau.cs.kieler.kicool.Processor metaProcessor
}