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

    public static final String ALLNORMALIZE_TRANSFORMATIONS =
            "de.cau.cs.kieler.sccharts.commands.AllNormalizeTransformations";

    public static final String ABORT_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.AbortTransformation";

    public static final String SURFACEDEPTH_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.SurfaceDepthTransformation";

    public static final String TRIGGEREFFECT_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.TriggerEffectTransformation";

    public static final String SIGNAL_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.SignalTransformation";

    public static final String INPUTOUTPUTVARIABLE_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.InputOutputVariableTransformation";

    public static final String ENTRY_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.EntryTransformation";

    public static final String DURING_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.DuringTransformation";

    public static final String STATIC_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.StaticTransformation";

    public static final String EXIT_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.ExitTransformation";

    public static final String CONNECTOR_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.ConnectorTransformation";

    public static final String HISTORY_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.HistoryTransformation";

    public static final String SUSPEND_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.SuspendTransformation";

    public static final String WEAKSUSPEND_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.WeakSuspendTransformation";

    public static final String COUNTDELAY_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.CountDelayTransformation";

    public static final String DEFERRED_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.DeferredTransformation";

    public static final String PRE_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.PreTransformation";

    public static final String INITIALIZATION_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.InitializationTransformation";

    public static final String EXPOSELOCALVARIABLE_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.ExposeLocalVariableTransformation";

    public static final String TERMINATION_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.TerminationTransformation";

    public static final String COMPLEXFINALSTATE_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.ComplexFinalStateTransformation";

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

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTargetExtension(EObject model, ExecutionEvent event, ISelection selection) {
        String commandString = getCommandString(event);
        if (commandString.equals(ALLCORE_TRANSFORMATIONS)) {
            return "core";
        } else if (commandString.equals(ALLNORMALIZE_TRANSFORMATIONS)) {
            return "normalized";
        } else {
            return "transformed";
        }
    }


    // -------------------------------------------------------------------------

    /**
     * Gets the command string.
     *
     * @param event the event
     * @return the command string
     */
    protected String getCommandString(ExecutionEvent event) {
        String commandString = event.getCommand().getId().toString();
        // Call the model transformation (this creates a copy of the model containing the
        // refactored model).
        // Use commandString for Scc and Sct Transformation
        commandString = commandString.replace("commands.Scc", "commands.");
        commandString = commandString.replace("commands.Sct", "commands.");
        return commandString;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected Object transform(EObject model, ExecutionEvent event, ISelection selection) {
        String commandString = getCommandString(event);
        EObject transformed = null;

        SCChartsCoreTransformation transformation =
                Guice.createInjector().getInstance(SCChartsCoreTransformation.class);

        transformed = model;
        if (commandString.equals(ALLCORE_TRANSFORMATIONS)) {
            transformed = transformation.transformHistory((Region) model);
            transformed = transformation.transformWeakSuspend((Region) transformed);
            transformed = transformation.transformDeferred((Region) transformed);
            transformed = transformation.transformStatic((Region) transformed);
            transformed = transformation.transformSignal((Region) transformed);
            transformed = transformation.transformCountDelay((Region) transformed);
            transformed = transformation.transformPre((Region) transformed);
            transformed = transformation.transformSuspend((Region) transformed);
            //transformed = transformation.transformComplexFinalState((Region) transformed);
            // There are TWO options for the Aborts transformation
            // 1. transformAborts1() and 2. transformAborts2()
            transformed = transformation.transformAborts2((Region) transformed);
            transformed = transformation.transformDuring((Region) transformed);
            transformed = transformation.transformInitialization((Region) transformed);
            transformed = transformation.transformEntry((Region) transformed);
            transformed = transformation.transformExit((Region) transformed);
            transformed = transformation.transformConnector((Region) transformed);
        } else if (commandString.equals(ALLNORMALIZE_TRANSFORMATIONS)) {
            transformed = transformation.transformTriggerEffect((Region) model);
            transformed = transformation.transformSurfaceDepth((Region) transformed);
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
        } else if (commandString.equals(INPUTOUTPUTVARIABLE_TRANSFORMATION)) {
            transformed = transformation.transformInputOutputVariable((Region) model);
        } else if (commandString.equals(ENTRY_TRANSFORMATION)) {
            transformed = transformation.transformEntry((Region) model);
        } else if (commandString.equals(DURING_TRANSFORMATION)) {
            transformed = transformation.transformDuring((Region) model);
        } else if (commandString.equals(STATIC_TRANSFORMATION)) {
            transformed = transformation.transformStatic((Region) model);
        } else if (commandString.equals(EXIT_TRANSFORMATION)) {
            transformed = transformation.transformExit((Region) model);
        } else if (commandString.equals(CONNECTOR_TRANSFORMATION)) {
            transformed = transformation.transformConnector((Region) model);
        } else if (commandString.equals(HISTORY_TRANSFORMATION)) {
            transformed = transformation.transformHistory((Region) model);
        } else if (commandString.equals(SUSPEND_TRANSFORMATION)) {
            transformed = transformation.transformSuspend((Region) model);
        } else if (commandString.equals(WEAKSUSPEND_TRANSFORMATION)) {
            transformed = transformation.transformWeakSuspend((Region) model);
        } else if (commandString.equals(COUNTDELAY_TRANSFORMATION)) {
            transformed = transformation.transformCountDelay((Region) model);
        } else if (commandString.equals(DEFERRED_TRANSFORMATION)) {
            transformed = transformation.transformDeferred((Region) model);
        } else if (commandString.equals(PRE_TRANSFORMATION)) {
            transformed = transformation.transformPre((Region) model);
        } else if (commandString.equals(INITIALIZATION_TRANSFORMATION)) {
            transformed = transformation.transformInitialization((Region) model);
        } else if (commandString.equals(EXPOSELOCALVARIABLE_TRANSFORMATION)) {
            transformed = transformation.transformExposeLocalValuedObject((Region) model);
        } else if (commandString.equals(TERMINATION_TRANSFORMATION)) {
            transformed = transformation.transformTermination((Region) model);
        } else if (commandString.equals(COMPLEXFINALSTATE_TRANSFORMATION)) {
            transformed = transformation.transformComplexFinalState((Region) model);
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
