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
package de.cau.cs.kieler.sccharts.ui.debug.breakpoints

import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.IAdapterFactory
import org.eclipse.debug.ui.actions.IToggleBreakpointsTarget
import org.eclipse.xtext.ui.editor.XtextEditor

/** 
 * Instances for {@link SCChartsBreakpointTargetAdapter} are created with this
 * class.
 * 
 * @author lgr
 */
class SCChartsBreakpointTargetAdapterFactory implements IAdapterFactory {
    
    /** 
     * {@inheritDoc}
     */
    @SuppressWarnings(#["unchecked"]) 
    override <T> T  getAdapter(Object adaptableObject, Class<T> adapterType) {
        if (adaptableObject instanceof XtextEditor) {
            val editorPart = adaptableObject as XtextEditor
            val resource = editorPart.editorInput.getAdapter(IResource) as IResource
            if (resource !== null) {
                var String ^extension = resource.fileExtension
                if (^extension !== null && ^extension.equals("sctx")) {
                    return new SCChartsBreakpointTargetAdapter() as T
                }
            }
        }
        return null
    }

    /** 
     * {@inheritDoc}
     */
    override Class<?>[] getAdapterList() {
        return #[IToggleBreakpointsTarget]
    }
}
