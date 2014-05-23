package de.cau.cs.kieler.sccharts.handler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
//import org.eclipse.xtext.Constants;
//import org.eclipse.xtext.resource.SaveOptions;
//import org.eclipse.xtext.serializer.ISerializer;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.model.handlers.AbstractConvertModelHandler;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.sccharts.State;

/**
 * The abstract handler for SCCharts file formats scc and sct.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed cmot
 * @kieler.rating 2013-09-05 proposed yellow
 */
public abstract class SCChartsModelFileHandler extends AbstractConvertModelHandler {

    public static final String ALL_TRANSFORMATIONS =
            "ALL";

    public static final String EXTENDED_TRANSFORMATIONS =
            "EXTENDED";

    public static final String CORE_TRANSFORMATIONS =
            "CORE";

    public static final String ABORT_TRANSFORMATION =
            "ABORT";

    public static final String ABORTALTERNATIVE_TRANSFORMATION =
            "ABORTALTERNATIVE";

    public static final String SURFACEDEPTH_TRANSFORMATION =
            "SURFACEDEPTH";

    public static final String TRIGGEREFFECT_TRANSFORMATION =
            "TRIGGEREFFECT";

    public static final String SIGNAL_TRANSFORMATION =
            "SIGNAL";

    public static final String INPUTOUTPUTVARIABLE_TRANSFORMATION =
            "INPUTOUTPUTVARIABLE";

    public static final String ENTRY_TRANSFORMATION =
            "ENTRY";

    public static final String DURING_TRANSFORMATION =
            "DURING";

    public static final String STATIC_TRANSFORMATION =
            "STATIC";

    public static final String EXIT_TRANSFORMATION =
            "EXIT";

    public static final String CONNECTOR_TRANSFORMATION =
            "CONNECTOR";

    public static final String HISTORY_TRANSFORMATION =
            "HISTORY";

    public static final String SUSPEND_TRANSFORMATION =
            "SUSPENBD";

    public static final String WEAKSUSPEND_TRANSFORMATION =
            "WEAKSUSPEND";

    public static final String COUNTDELAY_TRANSFORMATION =
            "COUNTDELAY";

    public static final String DEFERRED_TRANSFORMATION =
            "DEFERRED";

    public static final String PRE_TRANSFORMATION =
            "PRE";

    public static final String INITIALIZATION_TRANSFORMATION =
            "INITIALIZATION";

    public static final String EXPOSELOCALVARIABLE_TRANSFORMATION =
            "EXPOSELOCALVARIABLE";

    public static final String TERMINATION_TRANSFORMATION =
            "TERMINATION";

    public static final String COMPLEXFINALSTATE_TRANSFORMATION =
            "COMPLEXFINALSTATE";

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
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTargetExtension(EObject model, ExecutionEvent event, ISelection selection) {
        String commandString = getCommandString(event);
        if (commandString.equals(EXTENDED_TRANSFORMATIONS)) {
            return "core";
        } else if (commandString.equals(CORE_TRANSFORMATIONS)) {
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
        commandString = commandString.replace("SCC_", "");
        commandString = commandString.replace("SCT_", "");
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

//        SCChartsCoreTransformation transformation =
//                Guice.createInjector().getInstance(SCChartsCoreTransformation.class);

        transformed = model;
        
        transformed = (KielerCompiler.compile(commandString, (State) transformed)).getEObject();

//        if (commandString.equals(CORE_TRANSFORMATIONS)) {
//            transformed = transformation.transformHistory((Region) transformed);
//            transformed = transformation.transformWeakSuspend((Region) transformed);
//            transformed = transformation.transformDeferred((Region) transformed);
//            transformed = transformation.transformStatic((Region) transformed);
//            transformed = transformation.transformSignal((Region) transformed);
//            transformed = transformation.transformCountDelay((Region) transformed);
//            transformed = transformation.transformPre((Region) transformed);
//            transformed = transformation.transformSuspend((Region) transformed);
//            transformed = transformation.transformComplexFinalState((Region) transformed);
//            // There are TWO options for the Aborts transformation
//            // 1. transformAborts1() and 2. transformAborts2()
//            transformed = transformation.transformAbort((Region) transformed);
//            transformed = transformation.transformDuring((Region) transformed);
//            transformed = transformation.transformInitialization((Region) transformed);
//            transformed = transformation.transformEntry((Region) transformed);
//            transformed = transformation.transformExit((Region) transformed);
//            transformed = transformation.transformConnector((Region) transformed);
//        } else if (commandString.equals(NORMALIZE_TRANSFORMATIONS)) {
//            transformed = transformation.transformTriggerEffect((Region) transformed);
//            transformed = transformation.transformSurfaceDepth((Region) transformed);
//        } else if (commandString.equals(ABORT_TRANSFORMATION)) {
//            // There are TWO options for the Aborts transformation
//            // 1. transformAbortAlternative() and 2. transformAbort()
//            transformed = transformation.transformAbort((Region) transformed);
//        } else if (commandString.equals(SURFACEDEPTH_TRANSFORMATION)) {
//            transformed = transformation.transformSurfaceDepth((Region) transformed);
//        } else if (commandString.equals(TRIGGEREFFECT_TRANSFORMATION)) {
//            //transformed = transformation.transformTriggerEffect((Region) transformed);
//            transformed = (EObject) KielerCompiler.compile("TRIGGEREFFECT", (Region) transformed);
//        } else if (commandString.equals(SIGNAL_TRANSFORMATION)) {
//            transformed = transformation.transformSignal((Region) transformed);
//        } else if (commandString.equals(INPUTOUTPUTVARIABLE_TRANSFORMATION)) {
//            transformed = transformation.transformInputOutputVariable((Region) transformed);
//        } else if (commandString.equals(ENTRY_TRANSFORMATION)) {
//            transformed = transformation.transformEntry((Region) transformed);
//        } else if (commandString.equals(DURING_TRANSFORMATION)) {
//            transformed = transformation.transformDuring((Region) transformed);
//        } else if (commandString.equals(STATIC_TRANSFORMATION)) {
//            transformed = transformation.transformStatic((Region) transformed);
//        } else if (commandString.equals(EXIT_TRANSFORMATION)) {
//            transformed = transformation.transformExit((Region) transformed);
//        } else if (commandString.equals(CONNECTOR_TRANSFORMATION)) {
//            transformed = transformation.transformConnector((Region) transformed);
//        } else if (commandString.equals(HISTORY_TRANSFORMATION)) {
//            transformed = transformation.transformHistory((Region) transformed);
//        } else if (commandString.equals(SUSPEND_TRANSFORMATION)) {
//            transformed = transformation.transformSuspend((Region) transformed);
//        } else if (commandString.equals(WEAKSUSPEND_TRANSFORMATION)) {
//            transformed = transformation.transformWeakSuspend((Region) transformed);
//        } else if (commandString.equals(COUNTDELAY_TRANSFORMATION)) {
//            transformed = transformation.transformCountDelay((Region) transformed);
//        } else if (commandString.equals(DEFERRED_TRANSFORMATION)) {
//            transformed = transformation.transformDeferred((Region) transformed);
//        } else if (commandString.equals(PRE_TRANSFORMATION)) {
//            transformed = transformation.transformPre((Region) transformed);
//        } else if (commandString.equals(INITIALIZATION_TRANSFORMATION)) {
//            transformed = transformation.transformInitialization((Region) transformed);
//        } else if (commandString.equals(EXPOSELOCALVARIABLE_TRANSFORMATION)) {
//            transformed = transformation.transformExposeLocalValuedObject((Region) transformed);
//        } else if (commandString.equals(TERMINATION_TRANSFORMATION)) {
//            transformed = transformation.transformTermination((Region) transformed);
//        } else if (commandString.equals(COMPLEXFINALSTATE_TRANSFORMATION)) {
//            transformed = transformation.transformComplexFinalState((Region) transformed);
//        }
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
