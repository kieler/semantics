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

import de.cau.cs.kieler.kicool.ide.synthesis.styles.SkinSelector
import de.cau.cs.kieler.kicool.ide.view.actions.AbstractSkinSelectionActions
import de.cau.cs.kieler.kicool.ui.view.CompilerView
import java.util.List
import org.eclipse.jface.action.IAction
import org.eclipse.xtend.lib.annotations.Accessors

import static de.cau.cs.kieler.kicool.ide.synthesis.styles.SkinSelector.*

/**
 * @author ssm
 * @kieler.design 2017-05-12 proposed
 * @kieler.rating 2017-05-12 proposed yellow  
 */
class SkinSelectionActions extends AbstractSkinSelectionActions {

    @Accessors List<AbstractAction> actions = <AbstractAction> newLinkedList
    @Accessors private CompilerView view
    
    new(CompilerView view) {
        this.view = view 
        for(s : SKINS.indexed) {
            
            val action = new AbstractAction(view, 
                s.value.key, 
                IAction.AS_RADIO_BUTTON,
                "skinToggle" + s.value.key.replaceAll(" ", ""), 
                s.value.key,
                s.value.key, 
                null
            ) {
                override void invoke() {
                    if (action.isChecked) invokeFromActions(s.key)
                }
            }
            
            actions += action    
        } 
        
        actions.head.action.checked = true
    }
    
    protected def void invokeFromActions(int index) {
        SkinSelector.skinPrefix = "resources/skins/" + SKINS.get(index).value
        SkinSelector.skinMaxNameSize = SKINS_MAX_NAME_SIZE.get(index)
        view.updateView
    }
}