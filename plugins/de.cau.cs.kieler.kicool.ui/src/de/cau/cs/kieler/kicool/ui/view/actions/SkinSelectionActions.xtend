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
package de.cau.cs.kieler.kicool.ui.view.actions

import org.eclipse.jface.action.Action
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kicool.ui.view.CompilerView
import java.util.List
import org.eclipse.jface.action.IAction
import de.cau.cs.kieler.kicool.ui.synthesis.styles.SkinSelector

/**
 * @author ssm
 * @kieler.design 2017-05-12 proposed
 * @kieler.rating 2017-05-12 proposed yellow  
 */
class SkinSelectionActions {

    public val static skins = #[new Pair<String, String>("Default Skin", "default/"),
                         new Pair<String, String>("SCCharts Skin", "scc/"),
                         new Pair<String, String>("Detailed Skin", "detailed/")
    ]

    @Accessors List<AbstractAction> actions = <AbstractAction> newLinkedList
    @Accessors private CompilerView view
    
    new(CompilerView view) {
        this.view = view 
        for(s : skins) {
            
            val action = new AbstractAction(view, 
                s.key, 
                IAction.AS_RADIO_BUTTON,
                "skinToggle" + s.key.replaceAll(" ", ""), 
                s.key,
                s.key, 
                null
            ) {
                override void invoke() {
                    if (action.isChecked) invokeFromActions(s.value)
                }
            }
            
            actions += action    
        } 
        
        actions.head.action.checked = true
    }
    
    protected def void invokeFromActions(String str) {
        SkinSelector.skinPrefix = "resources/skins/" + str
        view.updateView
    }
}