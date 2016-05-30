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
package de.cau.cs.kieler.sccharts.debug;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.xtext.ui.editor.XtextEditor;

/**
 * @author lgr
 *
 */
public class SCChartsBreakpointTargetAdapterFactory implements IAdapterFactory {

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getAdapter(Object adaptableObject, Class adapterType) {
        if (adaptableObject instanceof XtextEditor) {
            XtextEditor editorPart = (XtextEditor) adaptableObject;
            IResource resource =
                    (IResource) editorPart.getEditorInput().getAdapter(IResource.class);
            if (resource != null) {
                String extension = resource.getFileExtension();
                if (extension != null && extension.equals("sct")) {
                    return new SCChartsBreakpointTarget();
                }
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getAdapterList() {
        // TODO Auto-generated method stub
        return null;
    }

}
