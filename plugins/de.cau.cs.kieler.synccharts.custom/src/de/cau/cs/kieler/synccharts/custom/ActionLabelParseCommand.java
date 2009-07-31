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
package de.cau.cs.kieler.synccharts.custom;

import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.antlr.IAntlrParser;
import org.eclipse.xtext.parsetree.SyntaxError;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.ComplexExpression;
import de.cau.cs.kieler.synccharts.Expression;
import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.SignalReference;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.VariableReference;
import de.cau.cs.kieler.synccharts.scoping.TransitionLabelScopeProvider;

/**
 * @author haf
 *
 */
public class ActionLabelParseCommand extends AbstractTransactionalCommand {

    Action action;
    String newString;
    IAntlrParser parser;
    Injector injector;
    
    /**
     * 
     */
    public ActionLabelParseCommand(IAdaptable element, String newString, IAntlrParser parser, Injector injector) {
        super(TransactionUtil.getEditingDomain(((Action) (((EObjectAdapter) element).getRealObject()))), newString, null);
        this.action = (Action) (((EObjectAdapter) element).getRealObject());
        this.newString = newString;
        this.parser = parser;
        this.injector = injector;
    }

    /* (non-Javadoc)
     * @see org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand#doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor, org.eclipse.core.runtime.IAdaptable)
     */
    @Override
    protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
            IAdaptable info) throws ExecutionException {
        if(newString != null && action != null){
            ByteArrayInputStream stream = new ByteArrayInputStream(newString.getBytes());
            
            XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
            Resource resource = resourceSet.createResource(URI.createURI("platform:/resource/de.cau.cs.kieler.synccharts.labelparser/dummy.action"));
            // set the scope where the Xtext linker shall search for Signals and Variables
            State parent = action.getParentStateEntryAction();
            if(parent == null)
                parent = action.getParentStateExitAction();
            if(parent == null)
                parent = action.getParentStateInnerAction();
            if(parent == null && action instanceof Transition)
                parent = ((Transition)action).getSourceState();
            TransitionLabelScopeProvider.parent = parent;
            // now do parsing
            try{
            Map loadOptions = resourceSet.getLoadOptions();
            loadOptions.put(org.eclipse.xtext.resource.XtextResource.OPTION_RESOLVE_ALL, true);
            resource.load(stream, loadOptions); 
            
            EObject parsedObject = resource.getContents().get(0);
            if(parsedObject != null && parsedObject instanceof Action){
                Action newAction = (Action) parsedObject;
                
                    System.out.println("Yeeeehaw!");
                    copyActionContents(newAction, action);
                    System.out.println("parsing completed!");
                
                return CommandResult.newOKCommandResult();
            }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        return CommandResult.newErrorCommandResult("Error during label parsing.");
    }

    public static void copyActionContents(Action source, Action target){
        target.setDelay(source.getDelay());
        target.setParentStateEntryAction(source.getParentStateEntryAction());
        target.setParentStateExitAction(source.getParentStateExitAction());
        target.setParentStateInnerAction(source.getParentStateInnerAction());
        target.setTrigger(source.getTrigger());
        target.getEffects().addAll(source.getEffects());
        //linkAllReferences(target.getTrigger());
    }

    /**
     * Recursively link all reference in the given expression by resolving the 
     * proxies.
     * @param expression
     */
    private void linkAllReferences(Expression expression) {
        // call the getter for signal or variable, as it will resolve the proxy
        if (expression instanceof SignalReference){
            ((SignalReference) expression).getSignal();
        }
        else if (expression instanceof VariableReference){
            ((VariableReference) expression).getVariable();
        }
        else if(expression instanceof ComplexExpression){
            List<Expression> subExpressions = ((ComplexExpression) expression).getSubExpressions();
            for (Expression expression2 : subExpressions) {
                linkAllReferences(expression2);
            }
        }
    }
    
}
