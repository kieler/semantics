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
package de.cau.cs.kieler.kicool.ui.view

import de.cau.cs.kieler.kico.klighd.KiCoModelViewNotifier
import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import org.eclipse.ui.IEditorPart
import de.cau.cs.kieler.kicool.ui.synthesis.ProcessorDataManager

/**
 * @author ssm
 * @kieler.design 2017-02-24 proposed
 * @kieler.rating 2017-02-24 proposed yellow  
 */
class EditPartSystemManager implements EditorActionAdapter.EditorSaveListener, 
    EditorActionAdapter.EditorCloseListener {
    
    private val editPartSystemMap = <IEditorPart, System> newHashMap
    private val editPartCompilationContextMap = <IEditorPart, CompilationContext> newHashMap
    private val editorActionAdapters = <IEditorPart, EditorActionAdapter> newHashMap
    
    private var CompilerView view
    
    new(CompilerView view) {
        this.view = view
    }
    
    def attachSystemToEditPart(IEditorPart part, System system) {
        editPartSystemMap.put(part, system)
    }
    
    def System getSystem(IEditorPart part) {
        editPartSystemMap.get(part)
    }
    
    def removeSystem(IEditorPart part) {
        editPartSystemMap.remove(part)
    }
    
    def findEditorForSystem(System system) {
        for(key : editPartSystemMap.keySet) {
            if (editPartSystemMap.get(key).equals(system)) return key
        }
        
        return null
    }
    
    def attachCompilationContextToEditorPart(IEditorPart part, CompilationContext context) {
        removeAttachedContextFromEditor(part)
        editPartCompilationContextMap.put(part, context)
        editorActionAdapters.put(part, new EditorActionAdapter(this, this) => [ activate(part) ])
    }
    
    def removeAttachedContextFromEditor(IEditorPart part) {
        val context = editPartCompilationContextMap.get(part)
        if (context != null) {
            ProcessorDataManager.removeAllCompilationContextEntries(context)
        }
        
        editorActionAdapters.get(part)?.deactivate
        editorActionAdapters.remove(part)
        editPartCompilationContextMap.remove(part)
        KiCoModelViewNotifier.notifyCompilationChanged(part, null)
    }
    
    override onEditorSaved(IEditorPart editor) {
        removeAttachedContextFromEditor(editor)
        if (view.autoCompileToggle.checked) {
            view.compilationAction.invokeCompile
        }
    }
    
    override onEditorClosed(IEditorPart editor) {
        removeAttachedContextFromEditor(editor)
    }
    
}