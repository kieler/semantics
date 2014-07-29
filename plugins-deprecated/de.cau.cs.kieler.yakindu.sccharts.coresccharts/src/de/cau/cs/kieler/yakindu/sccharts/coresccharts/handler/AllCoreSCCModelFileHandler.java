package de.cau.cs.kieler.yakindu.sccharts.coresccharts.handler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.yakindu.sct.model.sgraph.Statechart;
import org.yakindu.sct.model.stext.STextStandaloneSetup;
import org.yakindu.sct.ui.editor.editor.StatechartDiagramEditor;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.model.handlers.AbstractConvertModelHandler;
import de.cau.cs.kieler.yakindu.sccharts.coresccharts.xtend.SCCTransformations;

/**
 * The handler to register the context menu action for transformations on SCCharts including all
 * those that transform an extended SCChart into a core SCChart.
 * 
 * @author cmot
 * @kieler.design 2013-07-01 proposed cmot
 * @kieler.rating 2013-07-01 proposed yellow
 */
public class AllCoreSCCModelFileHandler extends AbstractConvertModelHandler {

    private static Injector injector = new STextStandaloneSetup()
            .createInjectorAndDoEMFRegistration();

    public static final String ALLCORE_TRANSFORMATIONS = "de.cau.cs.kieler.yakindu.sccharts.coresccharts.commands.AllCoreTransformations";

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
        if (commandString.equals(ALLCORE_TRANSFORMATIONS)) {
            EObject transformed = (new SCCTransformations())
                    .transformAborts((Statechart) model);
            transformed = (new SCCTransformations())
                    .transformConditional((Statechart) transformed);
            return transformed;
        }
        return null;
    }

    // -------------------------------------------------------------------------
}
