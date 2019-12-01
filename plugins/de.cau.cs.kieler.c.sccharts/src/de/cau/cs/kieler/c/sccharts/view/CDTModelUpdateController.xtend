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
import de.cau.cs.kieler.kexpressions.impl.ValuedObjectReferenceImpl
import de.cau.cs.kieler.kexpressions.impl.ValuedObjectImpl
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.impl.VariableDeclarationImpl

/**
 * @author lewe
 *
 */
class CDTModelUpdateController extends KiCoModelUpdateController {
    
    @Inject extension AnnotationsExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    
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
        val editor = getEditor
        val selection = event.getSelection
        if (selection !== null) {
            val Iterator<EObject> itrt = Iterators.filter(
                (selection as KlighdTreeSelection).sourceElementIterator(), EObject)
            val element = Iterators.getNext(itrt, null)
            var ValuedObject elementVO
            
            if (element !== null) {
                var offset = 0
                var length = 0
                var Annotatable aElement
                
                if (!(element instanceof Annotatable)) {
                    if (element instanceof ValuedObjectReferenceImpl) {
                        aElement = element.getValuedObject
                        elementVO = element.getValuedObject
                    }
                } else {
                    aElement = element as Annotatable
                }
                
                if (aElement !== null) {
                    var elementAnnotations = aElement.annotations
                    if (elementVO !== null && elementAnnotations.length == 0 ) {
                        var Declaration aElementDecl
                        if (elementVO.eContainer instanceof Declaration) {
                            aElementDecl = elementVO.eContainer as Declaration
                            
                        }
                        if (aElementDecl !== null) {
                            if (aElementDecl instanceof ReferenceDeclaration) {
                                val reference = aElementDecl.getReference
                                if (reference instanceof Annotatable) {
                                    elementAnnotations = reference.annotations
                                }
                            } else if (aElementDecl instanceof VariableDeclarationImpl) {
                                for (annota : aElementDecl.annotations) {
                                }
                                if (aElementDecl.annotations.length > 0) {
                                    elementAnnotations = aElementDecl.annotations
                                }
                            }
                        }
                    }
                    if (elementAnnotations.length > 1) {
                        val offsetAnnotations = elementAnnotations.filter[
                            it.name !== null && it.name.equals("Offset")
                        ]
                        if (offsetAnnotations.length > 0) {
                            val offsetStr = (offsetAnnotations.head as StringAnnotation).values.head
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
                
                if (editor instanceof ITextEditor) {
                    editor.selectAndReveal(offset, length)
                }
            }
        }
    }
}