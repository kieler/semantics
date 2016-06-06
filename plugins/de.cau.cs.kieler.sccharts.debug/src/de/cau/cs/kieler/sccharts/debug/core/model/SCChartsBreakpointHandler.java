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
package de.cau.cs.kieler.sccharts.debug.core.model;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import de.cau.cs.kieler.sccharts.debug.ui.breakpoints.SCChartsBreakpointTargetAdapter;
import de.cau.cs.kieler.sccharts.debug.ui.breakpoints.SCChartsBreakpointTargetAdapterFactory;
import de.cau.cs.kieler.sccharts.debug.ui.presentation.SCChartsDebugModelPresentation;

/**
 * @author lgr
 *
 */
public class SCChartsBreakpointHandler extends AbstractHandler {
        
    /**
     * {@inheritDoc}
     */
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
                .getActiveEditor();

        SCChartsBreakpointTargetAdapterFactory factory = new SCChartsBreakpointTargetAdapterFactory();
        SCChartsBreakpointTargetAdapter target = (SCChartsBreakpointTargetAdapter) factory.getAdapter(editor, SCChartsBreakpointTargetAdapter.class);
        try{
        target.toggleLineBreakpoints(HandlerUtil.getActivePart(event), HandlerUtil.getActiveMenuSelection(event));
        } catch(CoreException e) {}  
        IBreakpoint[] bs = DebugPlugin.getDefault().getBreakpointManager().getBreakpoints(SCChartsDebugModelPresentation.ID);
        for (int i = 0; i < bs.length; i++) {
            System.out.print(bs[i] + " ");
        }
        
        
        return null; // must be null
    }
}