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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.antlr.IAntlrParser;
import org.eclipse.xtext.parsetree.SyntaxError;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.KielerException;
import de.cau.cs.kieler.core.KielerModelException;
import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Assignment;
import de.cau.cs.kieler.synccharts.ComplexExpression;
import de.cau.cs.kieler.synccharts.Effect;
import de.cau.cs.kieler.synccharts.Emission;
import de.cau.cs.kieler.synccharts.Expression;
import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.SignalReference;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.Variable;
import de.cau.cs.kieler.synccharts.VariableReference;
import de.cau.cs.kieler.synccharts.scoping.TransitionLabelScopeProvider;

/**
 * @author haf
 * 
 */
public class ActionLabelParseCommand extends AbstractTransactionalCommand {

    Action action;
    String newString;
    Injector injector;

    EObject element;

    List<Diagnostic> errors;
    List<Diagnostic> warnings;
    List<String> unresolvedReferences;
    
    public ActionLabelParseCommand(IAdaptable element, String newString,
            IAntlrParser parser, Injector injector) {
        // the editing domain might be null if the object to be edited
        // does not belong to some resource, i.e. is not really part
        // of the model yet. Then this command will fail.
        super(TransactionUtil
                .getEditingDomain(((Action) (((EObjectAdapter) element)
                        .getRealObject()))), newString, null);
        this.action = (Action) (((EObjectAdapter) element).getRealObject());
        this.newString = newString;
        this.injector = injector;
        this.element = ((Action) (((EObjectAdapter) element)
                .getRealObject()));
        
        TransactionalEditingDomain domain = TransactionUtil
        .getEditingDomain(((Action) (((EObjectAdapter) element)
                .getRealObject())));
        if(domain == null){
            // this is very evil, because then the element is not contained
            // by any resource, especially not by the diagram model
            Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Parser failed to parse the action string \""+newString+"\"! The action object is not part of the model and hence has no editing domain.", null);
            StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
        }
    }
    
    public ActionLabelParseCommand(EObject element, String newString,
            IAntlrParser parser, Injector injector) {
        // the editing domain might be null if the object to be edited
        // does not belong to some resource, i.e. is not really part
        // of the model yet. Then this command will fail.
        super(TransactionUtil
                .getEditingDomain(((Action) element)), newString, null);
        this.action = (Action) element;
        this.newString = newString;
        this.injector = injector;
        this.element = element;
        
        TransactionalEditingDomain domain = TransactionUtil
        .getEditingDomain(((Action)element));
   /*     if(domain == null){
            // this is very evil, because then the element is not contained
            // by any resource, especially not by the diagram model
            Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Parser failed to parse the action string \""+newString+"\"! The action object is not part of the model and hence has no editing domain.", null);
            StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
        }*/
    }

    /*
     * (non-Javadoc)
     * 
     * @seeorg.eclipse.gmf.runtime.emf.commands.core.command.
     * AbstractTransactionalCommand
     * #doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor,
     * org.eclipse.core.runtime.IAdaptable)
     */
    @Override
    protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
            IAdaptable info) throws ExecutionException {
        
        try {
            parse();
            return CommandResult.newOKCommandResult();
        } catch (Exception e) {
            Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error parsing the action string. ", e);
            StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
        }
        // return ok even when the parsing was not successful. Then at least
        // the new String should be correctly stored in the
        // TriggersAndEffectsString of the new Action. This could be rolled
        // back if we return a not-ok result.
        return CommandResult.newOKCommandResult();
    }

    public void parse() throws KielerModelException, IOException {
        errors = null;
        warnings = null;
        unresolvedReferences = new ArrayList<String>();
        this.action = (Action) element;

        action.setTriggersAndEffects(newString);

        // set some default values
        action.setTrigger(null);
        action.getEffects().clear();
        action.setDelay(1);
        action.setIsImmediate(false);

        if (element == null)
            throw new KielerModelException(
                    "Action object to be parsed is null.", this.action);
        
        // if the String is empty, we don't need to parse anything...
        if(newString == null || newString.trim().length()==0)
            return;
        
        ByteArrayInputStream stream = new ByteArrayInputStream(newString
                .getBytes());

        XtextResourceSet resourceSet = injector
                .getInstance(XtextResourceSet.class);
        XtextResource resource = (XtextResource) resourceSet
                .createResource(URI
                        .createURI("platform:/resource/de.cau.cs.kieler.synccharts.labelparser/dummy.action"));
        // set the scope where the Xtext linker shall search for Signals and
        // Variables
        EObject parent = action.getParentStateEntryAction();
        if (parent == null)
            parent = action.getParentStateExitAction();
        if (parent == null)
            parent = action.getParentStateInnerAction();
        if (parent == null)
            parent = action.getParentStateSuspension();
        if (parent == null && action instanceof Transition) {
            // the source state is not the parent, but its parent region is
            parent = ((Transition) action).getSourceState();
            if(parent != null)
                parent = ((State) parent).getParentRegion();
            // source and target might have been not correctly initialized
            // e.g. because a resource is freshly loaded
            if(parent == null)
                parent = action.eContainer(); 
        }
        if (parent == null)
            throw new KielerModelException(
                    "\""+newString+"\""+"Can't find the right scope for the action. Scope is null.", this.action);
        TransitionLabelScopeProvider.parent = parent;

        // now do parsing
        Map<Object,Object> loadOptions = resourceSet.getLoadOptions();
        loadOptions
                .put(
                        org.eclipse.xtext.resource.XtextResource.OPTION_RESOLVE_ALL,
                        true);
        resource.load(stream, loadOptions);

        IParseResult parseResult = resource.getParseResult();
        if (parseResult == null)
            throw new KielerModelException(
                    "\""+newString+"\""+"Could not parse action string. Parser did return null.", this.action);

        this.errors = resource.getErrors();
        this.warnings = resource.getWarnings();

        if (this.errors != null && this.errors.size() > 0) {
            String parseErrorString = "";
            for (Diagnostic syntaxError : this.errors) {
                parseErrorString += "\n" + syntaxError.getMessage();
            }
            throw new KielerModelException("\""+newString+"\""+" Parse errors in action String: "
                    + parseErrorString, this.action);
        }

        EObject parsedObject = resource.getContents().get(0);
        if (parsedObject == null || !(parsedObject instanceof Action))
            throw new KielerModelException(
                    "\""+newString+"\""+"Could not parse action string. Parser did not return an Action object but "
                            + parsedObject, this.action);
        Action newAction = (Action) parsedObject;

        if (!allReferencesResolved(newAction)){
            throw new KielerModelException(
                    "\""+newString+"\""+"Not all referenced Signals and/or Variables could be resolved!", this.action);
        }
        
        copyActionContents(newAction, action);
    }
  

    public List<Diagnostic> getErrors() {
        return this.errors;
    }

    public static void copyActionContents(Action source, Action target) {
        target.setDelay(source.getDelay());
        target.setIsImmediate(source.isIsImmediate());
        // don't set any parent! it will accidently remove the object from the model...
        //target.setParentStateEntryAction(source.getParentStateEntryAction());
        //target.setParentStateExitAction(source.getParentStateExitAction());
        //target.setParentStateInnerAction(source.getParentStateInnerAction());
        //target.setParentStateSuspension(source.getParentStateSuspension());
        target.setTrigger(source.getTrigger());
        target.getEffects().addAll(source.getEffects());
        // linkAllReferences(target.getTrigger());
    }

    /**
     * Recursively link all reference in the given expression by resolving the
     * proxies.
     * 
     * @param expression
     */
    private void linkAllReferences(Expression expression) {
        // call the getter for signal or variable, as it will resolve the proxy
        if (expression instanceof SignalReference) {
            ((SignalReference) expression).getSignal();
        } else if (expression instanceof VariableReference) {
            ((VariableReference) expression).getVariable();
        } else if (expression instanceof ComplexExpression) {
            List<Expression> subExpressions = ((ComplexExpression) expression)
                    .getSubExpressions();
            for (Expression expression2 : subExpressions) {
                linkAllReferences(expression2);
            }
        }
    }

    /**
     * @param newAction
     * @return
     */
    private boolean allReferencesResolved(Action newAction) {
        boolean isOk = true;
        // check for unresolved references in the trigger expression
        if (!allReferencesResolved(newAction.getTrigger()))
            isOk = false;
        // check for unresolved references in all effects
        for (Effect effect : newAction.getEffects()) {
            // check for unresolved references in the emissions
            if (effect instanceof Emission) {
                if (!allReferencesResolved(((Emission) effect).getNewValue())
                        || ((Emission) effect).getSignal().eIsProxy())
                    isOk = false;
            }
            // check for unresolved references in the assignments
            else if (effect instanceof Assignment) {
                if (!allReferencesResolved(((Assignment) effect)
                        .getExpression())
                        || ((Assignment) effect).getVariable().eIsProxy())
                    isOk = false;
            }
        }
        return isOk;
    }

    /**
     * @param trigger
     * @return
     */
    private boolean allReferencesResolved(Expression expression) {
        if (expression == null)
            return true;
        // call the getter for signal or variable, as it will resolve the proxy
        // if possible. If not, it will stay a proxy which indicates, that
        // the reference could not be resolved
        boolean isProxy = false;
        if (expression instanceof SignalReference) {
            Signal sig = ((SignalReference) expression).getSignal();
            isProxy = sig.eIsProxy();
            return !isProxy;
        } else if (expression instanceof VariableReference) {
            Variable var = ((VariableReference) expression).getVariable();
            isProxy = var.eIsProxy();
            return !isProxy;
            // TODO: recursive call!
        } else if (expression instanceof ComplexExpression) {
            List<Expression> subExpressions = ((ComplexExpression) expression)
                    .getSubExpressions();
            isProxy = false;
            for (Expression expression2 : subExpressions) {
                if (!allReferencesResolved(expression2)) {
                    isProxy = true;
                    return !isProxy;
                }
            }
        }
        return true;
    }

}
