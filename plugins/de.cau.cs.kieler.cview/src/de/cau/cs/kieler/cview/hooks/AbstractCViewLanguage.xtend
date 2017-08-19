/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.cview.hooks

import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.ViewContext

/**
 * @author cmot
 * 
 */
abstract class AbstractCViewLanguage {
    private static ViewContext lastViewContext = null

    def setLastViewContext(ViewContext lastViewContext) {
        AbstractCViewLanguage.lastViewContext = lastViewContext
    }

    def public getLastViewContext() {
        return lastViewContext
    }

    def boolean getBooleanValue(SynthesisOption option) {
        if (lastViewContext == null) {
            return false
        }
        return option.getBooleanValue(lastViewContext)
    }

    def boolean getBooleanValue(SynthesisOption option, ViewContext viewContext) {
        val result = viewContext.getOptionValue(option);
        if (result == null) {
            return false;
        } else if (result instanceof Boolean) {
            return result;
        } else {
            throw new IllegalArgumentException(
                "KLighD transformation option handling: " + "The transformation " + this +
                    " attempted to evaluate the non-Boolean valued transformation option " + option.getName() +
                    " expecting a Boolean value.");
                }
            }

        }
        