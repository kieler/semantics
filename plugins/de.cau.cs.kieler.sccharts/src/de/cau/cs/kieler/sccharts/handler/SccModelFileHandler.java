package de.cau.cs.kieler.sccharts.handler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
//import org.eclipse.xtext.Constants;
//import org.eclipse.xtext.resource.SaveOptions;
//import org.eclipse.xtext.serializer.ISerializer;

import com.google.inject.Injector;

import de.cau.cs.kieler.sccharts.SCChartsPlugin;

/**
 * The handler to register the context menu action for transformations on SCCharts (scc) including all
 * those that transform an extended SCChart into a core SCChart.
 * 
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed cmot
 * @kieler.rating 2013-09-05 proposed yellow
 */
public class SccModelFileHandler extends SCChartsModelFileHandler {

    // -------------------------------------------------------------------------

    public SccModelFileHandler() {
        super();
    }

    // -------------------------------------------------------------------------

    public String getDiagramEditorID() {
        return SCChartsPlugin.EDITOR_ID;
    }

    // -------------------------------------------------------------------------

    protected boolean doOpenEditor(final Object modelObject, final ExecutionEvent event,
            final ISelection selection) {
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTargetExtension(EObject model, ExecutionEvent event, ISelection selection) {
        return super.getTargetExtension(model, event, selection) + ".scc";
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected Injector createResourceInjector() {
        // Force AbstractConvertModelHandler to use XMIResource (instead of Xtext Resources)
        return null;
    }

    // -------------------------------------------------------------------------

}
