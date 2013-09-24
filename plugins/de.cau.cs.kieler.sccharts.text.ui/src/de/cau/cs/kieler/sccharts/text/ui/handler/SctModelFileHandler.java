package de.cau.cs.kieler.sccharts.text.ui.handler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ISelection;
//import org.eclipse.xtext.Constants;
//import org.eclipse.xtext.resource.SaveOptions;
//import org.eclipse.xtext.serializer.ISerializer;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;

import de.cau.cs.kieler.core.model.handlers.AbstractConvertModelHandler;
import de.cau.cs.kieler.sccharts.SCChartsPlugin;
import de.cau.cs.kieler.sccharts.handler.SCChartsModelFileHandler;
import de.cau.cs.kieler.sccharts.text.sct.SctStandaloneSetup;

/**
 * The handler to register the context menu action for transformations on SCCharts (sct) including all
 * those that transform an extended SCChart into a core SCChart.
 * 
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed cmot
 * @kieler.rating 2013-09-05 proposed yellow
 */
public class SctModelFileHandler extends SCChartsModelFileHandler {
    
    // Create an injector to load the transformation via guice.
    private static Injector injector = new SctStandaloneSetup()
            .createInjectorAndDoEMFRegistration();

    // -------------------------------------------------------------------------

    public SctModelFileHandler() {
        super();
    }

    // -------------------------------------------------------------------------

    public String getDiagramEditorID() {
        return SCChartsPlugin.TEXT_EDITOR_ID;
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
        return "transformed.sct";
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected Injector createResourceInjector() {
        return injector;
    }

    // -------------------------------------------------------------------------

}
