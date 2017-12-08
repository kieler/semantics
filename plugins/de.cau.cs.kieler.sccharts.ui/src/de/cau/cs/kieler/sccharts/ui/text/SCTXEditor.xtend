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
package de.cau.cs.kieler.sccharts.ui.text

import java.util.Collection
import java.util.LinkedHashSet
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.jface.text.TextSelection

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SCTXEditor extends XtextEditor {
    
    interface CursorChangeListener {
        def void notifyCursorChange(SCTXEditor source, int pos)
    }
    
    val Collection<CursorChangeListener> cursorChangeListeners = new LinkedHashSet
    
    override handleCursorPositionChanged() {
        super.handleCursorPositionChanged();
        for (listener : cursorChangeListeners) {
            val selection = this.selectionProvider?.selection
            listener.notifyCursorChange(this, if (selection instanceof TextSelection) selection.offset else -1)
        }
    }
    
    def void addCursorChangeListener(CursorChangeListener listener) {
        cursorChangeListeners.add(listener)
    } 
       
    def void removeCursorChangeListener(CursorChangeListener listener) {
        cursorChangeListeners.remove(listener)
    }

}