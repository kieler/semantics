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
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import de.cau.cs.kieler.sccharts.debug.ui.breakpoints.SCChartsBreakpointTargetAdapter;
import de.cau.cs.kieler.sccharts.debug.ui.breakpoints.SCChartsBreakpointTargetAdapterFactory;

/**
 * This class is used as the Handler for the TextRulerContext command 'Toggle Breakpoint'.
 * 
 * @author lgr
 *
 */
public class SCChartsBreakpointHandler extends AbstractHandler {

    /**
     * {@inheritDoc}
     * 
     * This class is the entry point when starting a 'Toggle Breakpoint' event from the editor's
     * ruler context.
     */
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
                .getActiveEditor();

        SCChartsBreakpointTargetAdapterFactory factory =
                new SCChartsBreakpointTargetAdapterFactory();
        SCChartsBreakpointTargetAdapter target = (SCChartsBreakpointTargetAdapter) factory
                .getAdapter(editor, SCChartsBreakpointTargetAdapter.class);

        try {
            target.toggleLineBreakpoints(HandlerUtil.getActivePart(event),
                    HandlerUtil.getActiveMenuSelection(event));
        } catch (CoreException e) {
            e.printStackTrace();
        }
        /*
         * Just some experimenting with the input file and the root model 
         * IPath p = KiemPlugin.getCurrentModelFile(); List<IPath> lp = KiemPlugin.getOpenedModelFiles();
         * EObject e = KiemPlugin.getOpenedModelRootObjects().get(p);
         * 
         * ICompositeNode node = NodeModelUtils.findActualNodeFor(e); StringBuffer text = new
         * StringBuffer(); Iterable<ILeafNode> leafs = node.getLeafNodes(); int counter = 0; for
         * (ILeafNode leaf : leafs) { counter++; System.out.println(leaf.getSemanticElement());
         * System.out.println(leaf.getText() + " " + leaf.getStartLine() + " \n");
         * text.append(leaf.getText()); }
         * 
         * System.out.println(counter); System.out.println(KiemPlugin.DEBUG);
         * System.out.println(text);
         */

        return null; // Reserved for future use, must be null.
    }
}
