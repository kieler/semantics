package de.cau.cs.kieler.yakindu.sccharts.coresccharts.handler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.yakindu.sct.model.sgraph.Statechart;
import org.yakindu.sct.model.stext.STextStandaloneSetup;
import org.yakindu.sct.ui.editor.editor.StatechartDiagramEditor;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.model.handlers.AbstractConvertModelHandler;
import de.cau.cs.kieler.yakindu.sccharts.coresccharts.xtend.SCCToCoreTransformation;

/**
 * The handler to register the context menu action for transformations on SCCharts including all
 * those that transform an extended SCChart into a core SCChart.
 * 
 * @author cmot
 * @kieler.design 2013-07-01 proposed cmot
 * @kieler.rating 2013-07-01 proposed yellow
 */
public class SCCModelFileHandler extends AbstractConvertModelHandler {

    private static Injector injector = new STextStandaloneSetup()
            .createInjectorAndDoEMFRegistration();

    public static final String SCCTRANSFORMATIONCOMMAND = "de.cau.cs.kieler.yakindu.sccharts.coresccharts.commands.AllCoreTransformations";

    // -------------------------------------------------------------------------

    public String getDiagramEditorID() {
        return StatechartDiagramEditor.ID;
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
        return "core.scc";
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

    /**
     * {@inheritDoc}
     */
    @Override
    protected Object transform(EObject model, ExecutionEvent event, ISelection selection) {
        String commandString = event.getCommand().getId().toString();
        if (commandString.equals(SCCTRANSFORMATIONCOMMAND)) {
            System.out.println("scc core transformation: " + commandString);
            EObject transformed = (new SCCToCoreTransformation())
                    .transformSCCAborts((Statechart) model);
            transformed = (new SCCToCoreTransformation())
                    .transformSCCConditional((Statechart) transformed);
            return transformed;
        }

        return null;
    }

    // -------------------------------------------------------------------------
}
