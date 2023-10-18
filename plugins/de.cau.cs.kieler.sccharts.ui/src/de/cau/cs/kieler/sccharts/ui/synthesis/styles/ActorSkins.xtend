/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2023 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.synthesis.styles

import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property

/**
 * @author als
 */
@ViewSynthesisShared
class ActorSkins {        
        
    public static final IProperty<String> SKINPATH = new Property<String>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.skinPath", "");

    public static final IProperty<Boolean> SKIN_STYLE_KEY_SCCHARTS = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.style.sccharts", false);
        
    def String getSkinPath(ViewContext context) {
        val rootNode = context.viewModel
        var sp = rootNode.getProperty(SKINPATH)
        if (sp.nullOrEmpty) {
            sp = context.getProperty(SKINPATH)
            if (!sp.nullOrEmpty) {
                sp.setSkinPath(context)
            }
        } 
        return sp 
    }
    
    def void setSkinPath(String sp, ViewContext context) {
        val rootNode = context.viewModel
        rootNode.setProperty(SKINPATH, sp) 
    }
}