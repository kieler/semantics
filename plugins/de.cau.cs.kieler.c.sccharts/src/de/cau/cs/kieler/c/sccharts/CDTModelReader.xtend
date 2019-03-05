/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.c.sccharts

import de.cau.cs.kieler.kicool.ui.klighd.IModelReader
import org.eclipse.ui.IEditorPart
import org.eclipse.cdt.internal.ui.editor.CEditor
import de.cau.cs.kieler.c.sccharts.CDTProcessor
import com.google.inject.Guice

/**
 * @author ssm
 *
 */
class CDTModelReader implements IModelReader {
    
    override readModel(IEditorPart editor) {
        if (editor instanceof CEditor) {
            val CDTProcessor = Guice.createInjector().getInstance(CDTProcessor);
            val scchart = CDTProcessor.createFromEditor(editor);
            return scchart;
        }
        return null;
    }
    
}