package de.cau.cs.kieler.sccharts.handler;

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

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;

import de.cau.cs.kieler.core.model.handlers.AbstractConvertModelHandler;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.SCChartsPlugin;
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreTransformation;

/**
 * The abstract handler for SCCharts file formats scc and sct.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed cmot
 * @kieler.rating 2013-09-05 proposed yellow
 */
public abstract class SCChartsModelFileHandler extends AbstractConvertModelHandler {

    public static final String ALLCORE_TRANSFORMATIONS =
            "de.cau.cs.kieler.sccharts.commands.AllCoreTransformations";

    public static final String ABORT_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.AbortTransformation";

    public static final String SURFACEDEPTH_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.SurfaceDepthTransformation";

    public static final String TRIGGEREFFECT_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.TriggerEffectTransformation";

    public static final String SIGNAL_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.SignalTransformation";

    public static final String INPUTOUTPUTSIGNAL_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.InputOutputSignalTransformation";

    public static final String ENTRY_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.EntryTransformation";

    public static final String DURING_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.DuringTransformation";

    public static final String EXIT_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.ExitTransformation";

    public static final String CONNECTOR_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.ConnectorTransformation";

    public static final String HISTORY_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.HistoryTransformation";

    public static final String SUSPEND_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.SuspendTransformation";

    public static final String COUNTDELAY_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.CountDelayTransformation";

    public static final String DEFERRED_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.DeferredTransformation";

    public static final String PRE_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.PreTransformation";

    public static final String EXPOSELOCALSIGNALS_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.ExposeLocalSignalsTransformation";

    public static final String NORMALTERMINATION_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.NormalTerminationTransformation";

    public static final String COMPLEXFINALSTATES_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.ComplexFinalStatesTransformation";

    // -------------------------------------------------------------------------

    public SCChartsModelFileHandler() {
        super();
    }

    // -------------------------------------------------------------------------

    // public String getDiagramEditorID() {
    // return SCChartsPlugin.EDITOR_ID;
    // }
    //
    // -------------------------------------------------------------------------

    protected boolean doOpenEditor(final Object modelObject, final ExecutionEvent event,
            final ISelection selection) {
        return true;
    }

    // -------------------------------------------------------------------------

    // /**
    // * {@inheritDoc}
    // */
    // @Override
    // protected String getTargetExtension() {
    // return "transformed.scc";
    // }

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
        // Use commandString for Scc and Sct Transformation
        commandString = commandString.replace("commands.Scc", "commands.");
        commandString = commandString.replace("commands.Sct", "commands.");
        System.out.println(commandString);

        SCChartsCoreTransformation transformation =
                Guice.createInjector().getInstance(SCChartsCoreTransformation.class);

        transformed = model;
        if (commandString.equals(ALLCORE_TRANSFORMATIONS)) {
            // TODO
        } else if (commandString.equals(ABORT_TRANSFORMATION)) {
            // There are TWO options for the Aborts transformation
            // 1. transformAborts1() and 2. transformAborts2()
            transformed = transformation.transformAborts2((Region) model);
        } else if (commandString.equals(SURFACEDEPTH_TRANSFORMATION)) {
            transformed = transformation.transformSurfaceDepth((Region) model);
        } else if (commandString.equals(TRIGGEREFFECT_TRANSFORMATION)) {
            transformed = transformation.transformTriggerEffect((Region) model);
        } else if (commandString.equals(SIGNAL_TRANSFORMATION)) {
            transformed = transformation.transformSignal((Region) model);
        } else if (commandString.equals(INPUTOUTPUTSIGNAL_TRANSFORMATION)) {
            // TODO
            // transformed = transformation.transformInputOutputSignal((Region) model);
        } else if (commandString.equals(ENTRY_TRANSFORMATION)) {
            transformed = transformation.transformEntry((Region) model);
        } else if (commandString.equals(DURING_TRANSFORMATION)) {
            transformed = transformation.transformDuring((Region) model);
        } else if (commandString.equals(EXIT_TRANSFORMATION)) {
            transformed = transformation.transformExit((Region) model);
        } else if (commandString.equals(CONNECTOR_TRANSFORMATION)) {
            transformed = transformation.transformConnector((Region) model);
        } else if (commandString.equals(HISTORY_TRANSFORMATION)) {
            transformed = transformation.transformHistory((Region) model);
        } else if (commandString.equals(SUSPEND_TRANSFORMATION)) {
            transformed = transformation.transformSuspend((Region) model);
        } else if (commandString.equals(COUNTDELAY_TRANSFORMATION)) {
            transformed = transformation.transformCountDelay((Region) model);
        } else if (commandString.equals(DEFERRED_TRANSFORMATION)) {
            transformed = transformation.transformDeferred((Region) model);
        } else if (commandString.equals(PRE_TRANSFORMATION)) {
            transformed = transformation.transformPre((Region) model);
        } else if (commandString.equals(EXPOSELOCALSIGNALS_TRANSFORMATION)) {
            transformed = transformation.transformExposeLocalValuedObject((Region) model);
        } else if (commandString.equals(NORMALTERMINATION_TRANSFORMATION)) {
            transformed = transformation.transformNormalTermination((Region) model);
        } else if (commandString.equals(COMPLEXFINALSTATES_TRANSFORMATION)) {
            transformed = transformation.transformComplexFinalStates((Region) model);
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
