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
package de.cau.cs.kieler.cview

import de.cau.cs.kieler.cview.model.cViewModel.Component
import de.cau.cs.kieler.cview.hooks.ICViewLanguage
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.cview.model.cViewModel.CViewModel
import de.cau.cs.kieler.cview.hooks.AbstractCViewLanguage
import org.eclipse.core.runtime.IProgressMonitor

/**
 * The default language implementation if no language can be found for a custom component type.
 * 
 * @author cmot
 * 
 */
class DefaultLanguage extends AbstractCViewLanguage implements ICViewLanguage {

    public static String LANGUAGE_ID = "de.cau.cs.kieler.cview.default.language"

    override diagramColor(Component component) {
       return "red"
    }

    override diagramIsHierarchical(Component component) {
        return false
    }

    override diagramLabel(Component component) {
        return ""
    }

    override diagramOpensInEditor(Component component) {
        return false
    }

    override diagramToolTip(Component component) {
        return ""
    }

    override getId() {
        return LANGUAGE_ID
    }

    
    override diagramIsVisible(Component component) {
        return true
    }
    
    override diagramSynthesisOptions() {
        return null
    }
    
    override reparsingRequired() {
       return null
    }
    
    override diagramHandleComponentCustomTypes() {
        return null
    }
    
    override modelCreateFileSubComponents(CViewModel model, Component fileComponent, boolean parseContent) {
        return
    }
    
    override parseFile(char[] fileContent) {
        return null
    }
    
    override fileExtensions() {
        return null
    }
    
    override provideConnections(CViewModel model, IProgressMonitor monitor) {
        return null
    }

}
