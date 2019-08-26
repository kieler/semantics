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
package de.cau.cs.kieler.c.sccharts.view

import de.cau.cs.kieler.kicool.ui.klighd.KiCoModelUpdateController
import de.cau.cs.kieler.klighd.ui.view.controllers.XtextSelectionHighlighter
import org.eclipse.jface.viewers.SelectionChangedEvent
import com.google.common.collect.Iterators
import org.eclipse.emf.ecore.EObject
import java.util.Iterator
import de.cau.cs.kieler.klighd.KlighdTreeSelection

import org.eclipse.cdt.internal.ui.editor.CEditor
import org.eclipse.ui.texteditor.ITextEditor
import de.cau.cs.kieler.annotations.Annotatable
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.annotations.StringAnnotation

/**
 * @author lewe
 *
 */
class CDTModelUpdateController extends KiCoModelUpdateController {
    
    @Inject extension AnnotationsExtensions
    
    /** Controller ID. */
    private static val String ID = "de.cau.cs.kieler.c.sccharts.view.CDTModelUpdateController"
   
       /**
     * {@inheritDoc}
     */
    override String getID() {
        return ID
    }
    
    // -- Diagram Selection Change Event
    // -------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    override selectionChanged(SelectionChangedEvent event) {
        println("Selection made!")
        println("getEditor liefert: " + getEditor.toString)
        println("event.getSelection liefert: " + event.getSelection.toString)
        val editor = getEditor
        val selection = event.getSelection
        if (selection !== null) {
            println("selection !== null")
            val Iterator<EObject> itrt = Iterators.filter(
                (selection as KlighdTreeSelection).sourceElementIterator(), EObject)
            val element = Iterators.getNext(itrt, null)
            
            if (element !== null) {
                println("element !== null")
                println("element vom Iterator: " + element.toString)
                var offset = 0
                var length = 0
                
                if (element instanceof Annotatable) {
                    println("element is Annotatable")
                    val elementAnnotations = element.annotations
                    println("annotations: " + elementAnnotations.length)
                    if (elementAnnotations.length > 1) {
                        val offsetAnnotations = elementAnnotations.filter[
                            it.name !== null && it.name.equals("Offset")
                        ]
                        if (offsetAnnotations.length > 0) {
                            val offsetStr = (offsetAnnotations.head as StringAnnotation).values.head
                            println("offsetStr: " + offsetStr)
                            if (!offsetStr.equals("")) {
                                offset = Integer.parseInt(offsetStr)
                            }
                        }
                        
                        val lengthAnnotations = elementAnnotations.filter[
                            it.name !== null && it.name.equals("Length")
                        ]
                        if (lengthAnnotations.length > 0) {
                            val lengthStr = (lengthAnnotations.head as StringAnnotation).values.head
                            if (!lengthStr.equals("")) {
                                length = Integer.parseInt(lengthStr)
                            }
                        }
                    }
                                    


                }
                
                if (editor instanceof ITextEditor)
                editor.setHighlightRange(offset, length, true)
            } else {
                println("element === null")
            }
        }
    }
}