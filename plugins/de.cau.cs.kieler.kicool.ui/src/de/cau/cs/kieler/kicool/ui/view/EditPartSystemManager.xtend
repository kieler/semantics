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

import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import org.eclipse.ui.IEditorPart
import de.cau.cs.kieler.core.model.properties.Property
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration

/**
 * The EditPartSystemManager keeps track of the active editors and associated systems. 
 * It is important to clean up no longer used references to avoid memory leaks.
 * 
 * @author ssm
 * @kieler.design 2017-02-24 proposed
 * @kieler.rating 2017-02-24 proposed yellow  
 */
class EditPartSystemManager implements EditorActionAdapter.EditorSaveListener, 
    EditorActionAdapter.EditorCloseListener {
    
    private static val EDITOR = new Property<IEditorPart>("de.cau.cs.kieler.kicool.ui.view.editor", null)
    private val editorSystemMap = <String, String> newHashMap
    @Accessors private val editPartCompilationContextMap = <IEditorPart, CompilationContext> newHashMap
    private val editorActionAdapters = <IEditorPart, EditorActionAdapter> newHashMap
    @Accessors IEditorPart activeEditor = null
    
    private var CompilerView view
    
    new(CompilerView view) {
        this.view = view
    }
    
    def getActiveSystemId() {
        val systemId = editorSystemMap.get(activeEditor?.site?.id)
        // If the selection is null, set the first one for this editor and proceed.
        if (systemId === null && activeEditor !== null) {
            view.systemSelectionManager.widgetSelectFirst(false)
            return editorSystemMap.get(activeEditor?.site?.id)
        }
        return systemId
    }
    
    def getActiveSystem() {
        val id = activeSystemId
        if (!id.nullOrEmpty) {
            if (view.systemSelectionManager.temporarySystem.containsKey(id)) {
                return view.systemSelectionManager.temporarySystem.get(id)
            } else {
                return KiCoolRegistration.getSystemById(id)
            }
        }
        return null
    }

    def setActiveSystem(String sys) {
        if (activeEditor !== null && activeEditor.site !== null && !activeEditor.site.id.nullOrEmpty) {
            editorSystemMap.put(activeEditor.site.id, sys)
        }
    }
    
    def static getInputEditor(CompilationContext context) {
        context.startEnvironment.getProperty(EDITOR)
    }
    
    def static setInputEditor(CompilationContext context, IEditorPart part) {
        context.startEnvironment.setProperty(EDITOR, part)
    }
    
    def attachCompilationContextToEditorPart(IEditorPart part, CompilationContext context) {
        removeAttachedContextFromEditor(part)
        editPartCompilationContextMap.put(part, context)
        editorActionAdapters.put(part, new EditorActionAdapter(this, this) => [ activate(part) ])
    }
    
    def removeAttachedContextFromEditor(IEditorPart part) {
        editPartCompilationContextMap.get(part)
        
        editorActionAdapters.get(part)?.deactivate
        editorActionAdapters.remove(part)
        editPartCompilationContextMap.remove(part)
        // You have to set it to null manually if you want to because to many updates will cause NPEs in the thread pool.
//        KiCoModelViewNotifier.notifyCompilationChanged(part, null)
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