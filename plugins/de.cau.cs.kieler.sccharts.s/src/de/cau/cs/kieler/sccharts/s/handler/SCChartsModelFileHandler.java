package de.cau.cs.kieler.sccharts.s.handler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.model.handlers.AbstractConvertModelHandler;
import de.cau.cs.kieler.s.SPlugin;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.s.SCCharts2STransformation;
import de.cau.cs.kieler.sccharts.text.sct.SctStandaloneSetup;

/**
 * The abstract handler for SCCharts file formats scc and sct.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed cmot
 * @kieler.rating 2013-09-05 proposed yellow
 */
public class SCChartsModelFileHandler extends AbstractConvertModelHandler {

    public static final String S_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.STransformation";

    // Create an injector to load the transformation via guice.
    private static Injector injector = new SctStandaloneSetup()
            .createInjectorAndDoEMFRegistration();
    
    // -------------------------------------------------------------------------

    public SCChartsModelFileHandler() {
        super();
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected Object transform(EObject model, ExecutionEvent event, ISelection selection) {
        String commandString = event.getCommand().getId().toString();
        EObject transformed = null;
        // Call the model transformation (this creates a copy of the model containing the
        // refactored model).
        transformed = model;
        if (commandString.equals(S_TRANSFORMATION)) {
            transformed = (new SCCharts2STransformation()).transformS((Region) model);
        } 
        return transformed;
    }

    // -------------------------------------------------------------------------

    public String getDiagramEditorID() {
        return SPlugin.EDITOR_ID;
    }

    // -------------------------------------------------------------------------

    protected boolean doOpenEditor(final Object modelObject, final ExecutionEvent event,
            final ISelection selection) {
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTargetExtension() {
        return "s";
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected Injector createResourceInjector() {
        // Force AbstractConvertModelHandler to use XMIResource (instead of Xtext Resources)
        return injector;
    }

    // -------------------------------------------------------------------------

}
