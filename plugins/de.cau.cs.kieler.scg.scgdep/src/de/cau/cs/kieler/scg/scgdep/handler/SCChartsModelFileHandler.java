package de.cau.cs.kieler.scg.scgdep.handler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.cau.cs.kieler.core.model.handlers.AbstractConvertModelHandler;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.scg.SCGTransformation;
import de.cau.cs.kieler.sccharts.text.sct.SctStandaloneSetup;
import de.cau.cs.kieler.scg.SCGPlugin;
import de.cau.cs.kieler.scg.SCGraph;
//import org.eclipse.xtext.Constants;
//import org.eclipse.xtext.resource.SaveOptions;
//import org.eclipse.xtext.serializer.ISerializer;
import de.cau.cs.kieler.scg.scgdep.SCGToSCGDEPTransformation;

/**
 * The abstract handler for SCCharts file formats scc and sct.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed cmot
 * @kieler.rating 2013-09-05 proposed yellow
 */
public class SCChartsModelFileHandler extends AbstractConvertModelHandler {

    public static final String SCC2SCGDEP_TRANSFORMATION =
            "de.cau.cs.kieler.scg.scgdep.commands.SCCToSCGDEPTransformation";

    // Create an injector to load the transformation via guice.
    private static Injector injector = new SctStandaloneSetup()
            .createInjectorAndDoEMFRegistration();

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected Object transform(EObject model, ExecutionEvent event, ISelection selection) {
        String commandString = event.getCommand().getId().toString();
        EObject transformed = null;

        SCGTransformation transformationA =
        Guice.createInjector().getInstance(SCGTransformation.class);
        SCGToSCGDEPTransformation transformationB =
        Guice.createInjector().getInstance(SCGToSCGDEPTransformation.class);
        
        // Call the model transformation (this creates a copy of the model containing the
        // refactored model).
        transformed = model;
        if (commandString.equals(SCC2SCGDEP_TRANSFORMATION)) {
            SCGraph scg = transformationA.transformSCG((Region) model);
            transformed = transformationB.transformSCGToSCGDEP(scg);
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
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTargetExtension() {
        return "scgdep";
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
