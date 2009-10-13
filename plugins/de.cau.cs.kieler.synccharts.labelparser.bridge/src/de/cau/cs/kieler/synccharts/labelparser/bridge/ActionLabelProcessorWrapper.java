/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
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

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.xtext.parser.antlr.IAntlrParser;
import org.eclipse.xtext.parsetree.reconstr.SerializerUtil;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.KielerException;
import de.cau.cs.kieler.core.KielerModelException;
import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.TransitionLabelStandaloneSetup;
import de.cau.cs.kieler.synccharts.ValuedObject;

/**
 * @author haf
 *
 */
public class ActionLabelProcessorWrapper {

    final static boolean PARSE = true;
    final static boolean SERIALIZE = false;
    
    Injector injector;
    SerializerUtil serializerUtil;
    IAntlrParser parser;
    
    /**
     * Default Constructor initializes parsers and serializers.
     */
    public ActionLabelProcessorWrapper() {
        injector = new TransitionLabelStandaloneSetup()
        .createInjectorAndDoEMFRegistration();
        serializerUtil = injector.getInstance(SerializerUtil.class);
        parser = injector.getInstance(IAntlrParser.class);
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
     * @throws KielerModelException possible parser syntax errors
     */
    public void processAffectedActionLabels(ValuedObject changedObject, EObject parent, boolean  parse) throws KielerModelException, IOException{
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
        final ActionLabelProcessorWrapper parser = new ActionLabelProcessorWrapper();
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
     * @throws KielerModelException possible parser syntax errors
     */
    void processAction(Action action, boolean parse) throws KielerModelException, IOException{
            if(parse == PARSE){
            ActionLabelParseCommand cmd = new ActionLabelParseCommand(action, action.getTriggersAndEffects(), parser, injector);
            cmd.parse();
        }
        else{
        
            // only serialize if the action represents something useful
            if(action.getTrigger()!=null || !action.getEffects().isEmpty()){
                String newLabel = ActionLabelSerializer.toString(action);
                if(newLabel != null){
                    action.setTriggersAndEffects(newLabel);
                }
            }
        }
    }
    
    class ActionLabelProcessCommand extends AbstractCommand{

        ActionLabelProcessorWrapper parser;
        EObject parent;
        boolean parse;
        public ActionLabelProcessCommand(EObject parent, boolean parse, ActionLabelProcessorWrapper parser) {
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
    



