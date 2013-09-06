package de.cau.cs.kieler.sccharts.ui;

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

/**
 * The handler to register the context menu action for transformations on SCCharts including all
 * those that transform an extended SCChart into a core SCChart.
 * 
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed cmot
 * @kieler.rating 2013-09-05 proposed yellow
 */
public class KixsModelFileHandler extends AbstractConvertModelHandler {

    public static final String ALLCORE_TRANSFORMATIONS =
            "de.cau.cs.kieler.sccharts.coresccharts.commands.AllCoreTransformations";

    public static final String SIGNAL_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.coresccharts.commands.SignalTransformation";

    public static final String INPUTOUTPUTSIGNAL_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.coresccharts.commands.InputOutputSignalTransformation";

    public static final String ABORT_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.coresccharts.commands.AbortTransformation";

    public static final String SURFACEDEPTH_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.coresccharts.commands.SurfaceDepthTransformation";

    public static final String SPLITTRANSITION_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.coresccharts.commands.SplitTransitionTransformation";

    public static final String FINALSTATETRANSITION_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.coresccharts.commands.FinalStateTransitionTransformation";

    public static final String NORMALTERMINATION_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.coresccharts.commands.NormalTerminationTransformation";

    public static final String COUNTDELAY_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.coresccharts.commands.CountDelayTransformation";

    public static final String SUSPEND_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.coresccharts.commands.SuspendTransformation";

    public static final String HISTORY_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.coresccharts.commands.HistoryTransformation";

    public static final String ENTRY_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.coresccharts.commands.EntryTransformation";

    public static final String DURING_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.coresccharts.commands.DuringTransformation";

    public static final String EXIT_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.coresccharts.commands.ExitTransformation";

    public static final String PRE_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.coresccharts.commands.PreTransformation";

    public static final String EXPOSELOCALSIGNALS_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.coresccharts.commands.ExposeLocalSignalsTransformation";

    // -------------------------------------------------------------------------

    public KixsModelFileHandler() {
        super();
    }

    // -------------------------------------------------------------------------

    public String getDiagramEditorID() {
        return SCChartsPlugin.EDITOR_ID;
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
        return "transformed.kixs";
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
        System.out.println(commandString);
        if (commandString.equals(SIGNAL_TRANSFORMATION)) {
//            transformed = (new Co()).transformSignal((Statechart) model);
//        } else if (commandString.equals(INPUTOUTPUTSIGNAL_TRANSFORMATION)) {
//            transformed = (new SCCTransformations()).transformInputOutputSignal((Statechart) model);
//        } else if (commandString.equals(DURING_TRANSFORMATION)) {
//            transformed = (new SCCTransformations()).transformDuring((Statechart) model);
        }

        return transformed;
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
