package de.cau.cs.kieler.sccharts.scg.handler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.cau.cs.kieler.core.model.handlers.AbstractConvertModelHandler;
import de.cau.cs.kieler.sccharts.SCCharts;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.scg.SCGTransformation;
import de.cau.cs.kieler.sccharts.text.SCTStandaloneSetup;
import de.cau.cs.kieler.scg.SCGPlugin;

/**
 * The abstract handler for SCCharts file formats scc and sct.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed cmot
 * @kieler.rating 2013-09-05 proposed yellow
 */
public class SCChartsModelFileHandler extends AbstractConvertModelHandler {

    public static final String SCG_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.SCGTransformation";

    // Create an injector to load the transformation via guice.
    private static Injector injector = new SCTStandaloneSetup()
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

        SCGTransformation transformation =
        Guice.createInjector().getInstance(SCGTransformation.class);
        
        // Call the model transformation (this creates a copy of the model containing the
        // refactored model).
        transformed = model;
        if (commandString.equals(SCG_TRANSFORMATION)) {
            transformed = transformation.transform((SCCharts) model, null);
        } 
        return transformed;
    }

    // -------------------------------------------------------------------------

    public String getDiagramEditorID() {
        return SCGPlugin.EDITOR_ID;
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
        return "scg";
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
