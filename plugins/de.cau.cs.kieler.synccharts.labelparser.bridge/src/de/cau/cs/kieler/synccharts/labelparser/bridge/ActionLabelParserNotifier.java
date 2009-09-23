/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.labelparser.bridge;

import java.io.IOException;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtext.parser.antlr.IAntlrParser;
import org.eclipse.xtext.parsetree.reconstr.SerializerUtil;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.KielerException;
import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.TransitionLabelStandaloneSetup;
import de.cau.cs.kieler.synccharts.ValuedObject;

/**
 * @author haf
 *
 */
public class ActionLabelParserNotifier extends AdapterImpl implements IStartup{

    /** Singleton Pattern: Only one notifier object should be used
     */
    final static ActionLabelParserNotifier INSTANCE = new ActionLabelParserNotifier();
    
    final static boolean PARSE = true;
    final static boolean SERIALIZE = false;
    
    Injector injector;
    SerializerUtil serializerUtil;
    IAntlrParser parser;
    
    /**
     * Default Constructor initializes parsers and serializers.
     */
    public ActionLabelParserNotifier() {
        injector = new TransitionLabelStandaloneSetup()
        .createInjectorAndDoEMFRegistration();
        serializerUtil = injector.getInstance(SerializerUtil.class);
        parser = injector.getInstance(IAntlrParser.class);
    }
    
    /** 
     * Implementing IStartup to register correctly at the startup of the platform.
     */
    public void earlyStartup() {
        init();
    }
    
    /**
     * Initialization, register a new instance of this class as an Adapter
     * to the EMF EFactory for the metamodel of http://kieler.cs.cau.de/synccharts. 
     */
    public static void init(){
        EFactory syncchartsFactory = EPackage.Registry.INSTANCE.getEFactory("http://kieler.cs.cau.de/synccharts");
        if(! syncchartsFactory.eAdapters().contains(INSTANCE))
            syncchartsFactory.eAdapters().add(INSTANCE);
    }
    
    /**
     * React on Notifications of a SyncCharts model and either parse Action 
     * labels or serialize them. If the TriggersAndEffects String attribute
     * of an Action has changed, it gets parsed again to build the correct
     * trigger and effects objects. If a Signal or Variable has changed its
     * name, all descendant Actions in that scope are re-serialized such that
     * all TriggersAndEffects String labels will represent the name change.
     */
    public void notifyChanged(Notification notification) {
        try{
        Object notifier = notification.getNotifier();
        /*
         * In order to parse correctly
         *  - the notifier must be an Action
         *  - the new String must not be null
         *  - the old String must not be the same as the new String (however, it could be null)
         *  - the Action needs a parent container to determine the scope correctly
         */
        if(notifier instanceof Action 
                && notification.getFeature() != null
                && notification.getFeature().equals(SyncchartsPackage.eINSTANCE.getAction_TriggersAndEffects())
                && notification.getNewStringValue() != null
                && ( notification.getOldStringValue() == null
                    || !notification.getNewStringValue().equals(notification.getOldStringValue()))
                && ((Action)notifier).eContainer() != null
                    ){
            Action action = (Action)notifier;
            ActionLabelParseCommand cmd = new ActionLabelParseCommand(action, notification.getNewStringValue(), parser, injector);
                cmd.parse();
                // serialize the action again so that the user
                // gets feedback on what the machine thinks the label looks like
                processAction(action, SERIALIZE);
        }
        
        /* serialize the label again if any names have changed. Conditions
         * for serialization:
         * - the name attribute of a Signal/Variable is affected
         * - new name is not null
         * - name has really changed (new and old are not the same, but old might be null) 
         */
        else if(notifier instanceof ValuedObject
                && notification.getFeature() != null
                && notification.getFeature().equals(SyncchartsPackage.eINSTANCE.getValuedObject_Name())
                && notification.getNewStringValue() != null
                && (notification.getOldStringValue() == null
                     || !notification.getNewStringValue().equals(notification.getOldStringValue()))){
            // first serialize the label
            // then re-parse it again (might be necessary if new Signals have been introduced)
            processAffectedActionLabels((ValuedObject)notifier, null, SERIALIZE);
            processAffectedActionLabels((ValuedObject)notifier, null, PARSE);
        }
        } catch (Exception e) {
            Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error parsing the action string \""+notification.getNewStringValue()+"\"", e);
            StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
            e.printStackTrace();
        }
    }

    /**
     * Recursively parse or serialize all Action objects starting from the parent object
     * and recursively calling it to child states resp. child regions. All
     * state actions (entry, exit, inner, suspension) and all transitions will
     * be serialized or parsed again. If the parent is null, the parent is determined
     * by the container object of the given Signal/Variable. If the changed object
     * is null, then all children of the parent will be processed. If both are
     * null, this cannot be handled and will silently return. 
     * @param changedObject the Signal/Variable that has changed its name
     * @param parent the current parent object, either State or Region
     * @param parse true if the label should be reparsed, false if it should
     *        be serialized
     * @throws IOException unlikely parser IO error
     * @throws KielerException possible parser syntax errors
     */
    void processAffectedActionLabels(ValuedObject changedObject, EObject parent, boolean  parse) throws KielerException, IOException{
        if(changedObject == null && parent == null)
            return; // cannot handle this combination
        if(parent == null){
            parent = changedObject.eContainer();
            if(parent != null)
                processAffectedActionLabels(changedObject, parent, parse);
        }
        
        if(parent instanceof State){
            for (Action action : ((State)parent).getEntryActions()) 
                processAction(action, parse);
            for (Action action : ((State)parent).getExitActions()) 
                processAction(action, parse);
            for (Action action : ((State)parent).getInnerActions()) 
                processAction(action, parse);
            if(((State)parent).getSuspensionTrigger() != null)
                processAction(((State)parent).getSuspensionTrigger(), parse);
            // do a recursive call
            for (Region childRegion : ((State)parent).getRegions())
                processAffectedActionLabels(changedObject, childRegion, parse);
        }
        else if (parent instanceof Region){
            for (State childState : ((Region)parent).getInnerStates()){
                for( Transition trans : childState.getOutgoingTransitions()){
                    processAction(trans, parse);
                }
                processAffectedActionLabels(changedObject, childState, parse);
            }
                
        }
    }
    
    public static void processActionLabels(final EObject parent, final boolean parse) throws Exception{
        TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(parent);
        final ActionLabelParserNotifier parser = new ActionLabelParserNotifier();
        ActionLabelProcessCommand cmd = parser.new ActionLabelProcessCommand(parent, parse, parser);
        CommandStack stack = domain.getCommandStack();
        stack.execute(cmd);
        if(cmd.error && cmd.exception != null){
            throw cmd.exception;
        }
    }
    
    /**
     * Parse or serialize an action. Serialize an Action and store the String result in the Action's
     * TriggerAndEffects String attribute. Alternatively parse the TriggerAndEffects String and
     * build the corresponding effects and trigger objects and add/replace them in the Action.
     * @param action the action to be serialized/parsed
     * @throws IOException unlikely parser IO error
     * @throws KielerException possible parser syntax errors
     */
    void processAction(Action action, boolean parse) throws KielerException, IOException{
        if(parse == PARSE){
            ActionLabelParseCommand cmd = new ActionLabelParseCommand(action, action.getTriggersAndEffects(), parser, injector);
            cmd.parse();
        }
        else{
        String newLabel = ActionLabelSerializer.toString(action);
        if(newLabel != null){
            action.setTriggersAndEffects(newLabel);
        }
        }
    }
    
    class ActionLabelProcessCommand extends AbstractCommand{

        ActionLabelParserNotifier parser;
        EObject parent;
        boolean parse;
        public ActionLabelProcessCommand(EObject parent, boolean parse, ActionLabelParserNotifier parser) {
            this.parent = parent;
            this.parse = parse;
            this.parser = parser;
        }
        
        public boolean error = false;
            public Exception exception;
            public void execute() {
                try {
                    parser.processAffectedActionLabels(null, parent, parse);
                } catch (Exception e) {
                    error = true;
                    exception = e;
                }
            }
            public void redo() {execute();}
            @Override
            public boolean canUndo() {return false;}
            @Override
            protected boolean prepare() {return true;}
        };
    }
    

