package de.cau.cs.kieler.yakindu.sccharts.coresccharts.handler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.serializer.ISerializer;
import org.yakindu.sct.model.sgraph.Statechart;
import org.yakindu.sct.model.stext.STextStandaloneSetup;
import org.yakindu.sct.ui.editor.editor.StatechartDiagramEditor;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;

import de.cau.cs.kieler.core.model.handlers.AbstractConvertModelHandler;
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState;
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.SynctextStandaloneSetup;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.scoping.SynctextScopeProvider;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ReactionEffect;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ReactionTrigger;
import de.cau.cs.kieler.yakindu.sccharts.coresccharts.xtend.SCCTransformations;

/**
 * The handler to register the context menu action for transformations on SCCharts including all
 * those that transform an extended SCChart into a core SCChart.
 * 
 * Note that this handler also is able to re-serialize all Yakindu string specifications for states
 * and transitions.
 * 
 * @author cmot
 * @kieler.design 2013-07-01 proposed cmot
 * @kieler.rating 2013-07-01 proposed yellow
 */
public class SCCModelFileHandler extends AbstractConvertModelHandler {

    public static final String SIGNAL_TRANSFORMATION = "de.cau.cs.kieler.yakindu.sccharts.coresccharts.commands.SignalTransformation";
    public static final String INPUTOUTPUTSIGNAL_TRANSFORMATION = "de.cau.cs.kieler.yakindu.sccharts.coresccharts.commands.InputOutputSignalTransformation";
    public static final String DURING_TRANSFORMATION = "de.cau.cs.kieler.yakindu.sccharts.coresccharts.commands.DuringTransformation";

    // -------------------------------------------------------------------------
    
    public SCCModelFileHandler() {
        super();
        syncTextInjector.injectMembers(this);
    }
    
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
        return "transformed.scc";
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected Injector createResourceInjector() {
        return syncTextInjector;
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    // Injector is necessary for SyncText serialization
    private static Injector syncTextInjector = SynctextStandaloneSetup.doSetup();
    // Serializer is necessary for SyncText serialization
    private static ISerializer syncTextSerializer = syncTextInjector.getInstance(ISerializer.class);
    // ResourceSet is necessary for SyncText serialization
    private static ResourceSet syncTextResourceSet = syncTextInjector
            .getInstance(ResourceSet.class);
    // SynctextScopeProvider is necessary for SyncText serialization
    private static SynctextScopeProvider syncTextScoper = syncTextInjector
            .getInstance(SynctextScopeProvider.class);

    @Inject
    @Named(Constants.FILE_EXTENSIONS)
    public String fileExtension; // File extension is necessary for SyncText serialization
    
    // -------------------------------------------------------------------------

    /**
     * Serialize the whole model.
     * 
     * @param model
     *            the model
     */
    protected void reSerializeModel(EObject model) {
        TreeIterator<?> treeIterator = model.eAllContents();
        reSerializeModel(treeIterator);
    }

    // -------------------------------------------------------------------------

    /**
     * Re-Serialize the whole model.
     * 
     * @param treeIterator
     *            the tree iterator
     */
    protected void reSerializeModel(final TreeIterator<?> treeIterator) {
        while (treeIterator.hasNext()) {
            Object object = treeIterator.next();
            if (object instanceof EObject) {
                // serialize iff state or transition
                if (object instanceof SyncState) {
                    reSerializeModel((SyncState) object);
                }
                if (object instanceof SyncTransition) {
                    reSerializeModel((SyncTransition) object);
                }
                // do recursion
                reSerializeModel(((EObject) object).eAllContents());
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Serialize model state declaration specifications.
     * 
     * @param state
     *            the state
     */
    protected void reSerializeModel(SyncState state) {
        // Do the customized serialization of a state scope for the declarations of a
        // state. Note that here the original ContextFinder is sufficient because it will
        // return the StateScope object which is a correct context for serialization.
        if (state.getScopes().size() > 0) {
            String scope = serializeEObject(state.getScopes().get(0));
            state.setSpecification(scope);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Serialize model transition specifications.
     * 
     * @param transition
     *            the transition
     */
    protected void reSerializeModel(SyncTransition transition) {
        if (((transition.getTrigger() != null && transition.getTrigger() instanceof ReactionTrigger && ((ReactionTrigger) transition
                .getTrigger()).getExpression() != null) || transition.getEffect() != null)) {
            ReactionTrigger rtrigger = (ReactionTrigger) transition.getTrigger();
            ReactionEffect reffect = (ReactionEffect) transition.getEffect();
            // Do the customized serialization of a trigger or effect. Note that for serializing
            // these parts, the SynctextContextFinder specialization is necessary.
            String trigger = serializeEObject(rtrigger);
            String effect = serializeEObject(reffect);
            if (effect.length() > 0 && trigger.length() > 0) {
                transition.setSpecification(trigger + " / " + effect);
            } else if (effect.length() > 0) {
                transition.setSpecification("/ " + effect);
            }
            else {
                transition.setSpecification(trigger);
            }
        }
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
        if (commandString.equals(SIGNAL_TRANSFORMATION)) {
            transformed = (new SCCTransformations()).transformSignal((Statechart) model);
        } else if (commandString.equals(INPUTOUTPUTSIGNAL_TRANSFORMATION)) {
            transformed = (new SCCTransformations()).transformInputOutputSignal((Statechart) model);
        } else if (commandString.equals(DURING_TRANSFORMATION)) {
            transformed = (new SCCTransformations()).transformDuring((Statechart) model);
        }

        if (transformed != null) {
            // Traverse thru the whole refactored Yakindu model and re-serialize all specification
            // fields
            // for states and transitions.
            reSerializeModel(transformed);
        }
        return transformed;
    }

    // -------------------------------------------------------------------------

    /**
     * Creates the dummy resource for serialization of Xtext model parts.
     * 
     * @param eObject
     *            the e object
     * @return the resource
     */
    static Resource res = null;
    protected Resource createDummyResource(EObject eObject) {
        if (res == null) {
            res = syncTextResourceSet.createResource(URI.createFileURI("dummy."
                    + eObject.hashCode() + "." + fileExtension));
        }
        return res;
    }

    // -------------------------------------------------------------------------

    /**
     * Serialize an EObject that is part of the Xtext part of the model. Note that for the
     * specialized SynctextContextFinder the correct rule must be returned (e.g. for ReactionEffect
     * or ReactionTrigger).
     * 
     * @param eObject
     *            the e object
     * @return the string
     */
    protected String serializeEObject(EObject eObject) {
        if (eObject != null) {
            // Create a copy and add it to a fresh dummy resource
            Resource res = createDummyResource(eObject);
            EObject eObjectCopy = EcoreUtil.copy(eObject);
            res.getContents().add(eObjectCopy);

            // Tell the scoper to create dummy scopes for all elements referred within triggers
            // or effects.
            syncTextScoper.setCreateDummyScopes(true);

            // Do the serialization (without validation)
            String serialization = syncTextSerializer.serialize(eObjectCopy, SaveOptions.newBuilder()
                    .noValidation().getOptions());

            // Tell the scoper to switch back to normal behavior
            syncTextScoper.setCreateDummyScopes(false);

            // Clear resource for later reuse
            res.getContents().clear();
            return serialization;
        }
        return "";
    }

    // -------------------------------------------------------------------------
}
