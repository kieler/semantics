/*
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
 */
package de.cau.cs.kieler.synccharts.text.actions.bridge;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.KielerModelException;
import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Effect;
import de.cau.cs.kieler.synccharts.text.actions.scoping.ActionsScopeProvider;

/**
 * Wrapper of the parsing operation into a GMF AbstractTransactionalCommand.
 * Hence parsing of an Action label into trigger and effects Expression objects
 * can be done either by manually calling the parse method or by excuting the
 * command on a GEF/GMF command stack.
 * 
 * @author haf
 */
public class ActionLabelParseCommand extends AbstractCommand {

    private String newString;
    private Injector injector;

    private EObject element;
    
// chsch: commented constructor out since it is obviously not used
//    /**
//     * @param theElement
//     *            the target element
//     * @param theNewString
//     *            the String to be parsed
//     * @param parser
//     *            the internal Xtext parser
//     * @param theInjector
//     *            the Xtext Guice Injector
//     */
//    public ActionLabelParseCommand(final IAdaptable theElement,
//            final String theNewString, final IParser parser,
//            final Injector theInjector) {
//        // the editing domain might be null if the object to be edited
//        // does not belong to some resource, i.e. is not really part
//        // of the model yet. Then this command will fail.
//        super();
//        this.newString = theNewString;
//        this.injector = theInjector;
//        this.element = ((Action) (((EObjectAdapter) theElement).getRealObject()));
//
//        TransactionalEditingDomain domain = TransactionUtil
//                .getEditingDomain(((Action) (((EObjectAdapter) theElement)
//                        .getRealObject())));
//        if (domain == null) {
//            // this is very evil, because then the element is not contained
//            // by any resource, especially not by the diagram model
//            Status myStatus = new Status(IStatus.ERROR, LabelParserBridgePlugin.PLUGIN_ID,
//                    "Parser failed to parse the action string \""
//                            + theNewString
//                            + "\"! The action object is not part of the model "
//                            + "and hence has no editing domain.", null);
//            StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
//        }
//    }

    /**
     * @param theElement
     *            the target element
     * @param theNewString
     *            the String to be parsed
     * @param theInjector
     *            the Xtext Guice Injector
     */
    public ActionLabelParseCommand(final EObject theElement,
            final String theNewString,
            final Injector theInjector) {
        super();
        this.newString = theNewString;
        this.injector = theInjector;
        this.element = theElement;
    }

    /**
     * {@inheritDoc}
     */
    public void execute() {
        try {
            parse();
        } catch (Exception e) {
            Status myStatus = new Status(IStatus.ERROR, LabelParserBridgePlugin.PLUGIN_ID,
                    "Error parsing the action string. ", e);
            StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
        }
    }

    /**
     * {@inheritDoc} Simply calls execute.
     */
    public void redo() {
        execute();
    }

    @Override
    public void undo() {
        if (element != null && element instanceof Action) {
            Action action = (Action) element;
            action.setDelay(oldDelay);
            action.setIsImmediate(oldImmediate);
            action.setTrigger(oldTrigger);
            action.setLabel(oldTriggersAndEffects);
            action.getEffects().clear();
            action.getEffects().addAll(oldEffects);
        }
    }

    private Expression oldTrigger;
    private List<Effect> oldEffects;
    private int oldDelay;
    private boolean oldImmediate;
    private String oldTriggersAndEffects;

    /**
     * Run the actual parse operation with the element and new string set by the
     * constructor before.
     * 
     * @throws KielerModelException
     *             if parsing of the string fails
     * @throws IOException
     *             only if there is an internal parser error
     */
    public void parse() throws KielerModelException, IOException {
        Action action = (Action) element;
        assert action != null;

        // save old values to be able to undo
        oldTrigger = action.getTrigger();
        oldEffects = new ArrayList<Effect>();
        oldEffects.addAll(action.getEffects());
        oldDelay = action.getDelay();
        oldImmediate = action.isIsImmediate();
        oldTriggersAndEffects = action.getLabel();

        action.setLabel(newString);
        // set some default values
        action.setTrigger(null);
        action.getEffects().clear();
        action.setDelay(1);
        action.setIsImmediate(false);

        if (element == null) {
            throw new KielerModelException(
                    "Action object to be parsed is null.", action);
        }

        // if the String is empty, we don't need to parse anything...
        if (newString == null || newString.trim().length() == 0) {
            return;
        }

        ByteArrayInputStream stream = new ByteArrayInputStream(newString
                .getBytes());

        XtextResourceSet resourceSet = injector
                .getInstance(XtextResourceSet.class);
        XtextResource resource = (XtextResource) resourceSet
                .createResource(URI
                        .createURI("platform:/resource/de.cau.cs.kieler.synccharts.text/"
                                + "dummy.action"));
        // set the scope where the Xtext linker shall search for Signals and
        // Variables
        EObject parent = action.eContainer();

        if (parent == null) {
            throw new KielerModelException(
                    "\""
                            + newString
                            + "\""
                            + "Can't find the right scope for the action. Scope is null.",
                    action);
        }
        // FIXME: passing the parent to the scope provider in this static way is
        // veeeeery evil, someone should really fix this....
        ActionsScopeProvider.parent = parent;

        // now do parsing
        Map<Object, Object> loadOptions = resourceSet.getLoadOptions();
        // set option to resolve all links. This avoids to do lazy linking only
        // when elements
        // are actually read. This helps to identify linking errors earlier,
        // i.e. now
        loadOptions.put(
                org.eclipse.xtext.resource.XtextResource.OPTION_RESOLVE_ALL,
                true);
        resource.load(stream, loadOptions);

        IParseResult parseResult = resource.getParseResult();
        if (parseResult == null) {
            throw new KielerModelException("\"" + newString + "\""
                    + "Could not parse action string. Parser did return null.",
                    action);
        }

        List<Diagnostic> errors = resource.getErrors();

        if (errors != null && errors.size() > 0) {
            StringBuffer parseErrorString = new StringBuffer("");
            for (Diagnostic syntaxError : errors) {
                parseErrorString.append(syntaxError.getMessage());
                if (errors.size() > 1) {
                    parseErrorString.append("\n");
                }
            }
            throw new DiagnosticException("\"" + newString + "\""
                    + " Parse errors in action String: " + parseErrorString,
                    action, errors);
        }

        EObject parsedObject = resource.getContents().get(0);
        if (parsedObject == null || !(parsedObject instanceof Action)) {
            throw new KielerModelException(
                    "\""
                            + newString
                            + "\""
                            + "Could not parse action string. Parser did not return an Action object but "
                            + parsedObject, action);
        }
        Action newAction = (Action) parsedObject;

        /*
         * if (!allReferencesResolved(newAction)) { throw new KielerModelException("\"" + newString
         * + "\"" + "Not all referenced Signals and/or Variables could be resolved!", this.action);
         * 
         * }
         */

        copyActionContents(newAction, action);
    }

    /**
     * Move all contents from one Action object to another.
     * 
     * @param source
     *            the source of the movement
     * @param target
     *            the target of the movement
     */
    public static void copyActionContents(final Action source,
            final Action target) {
        target.setDelay(source.getDelay());
        target.setIsImmediate(source.isIsImmediate());
        // don't set any parent! it will accidently remove the object from the
        // model...
        // target.setParentStateEntryAction(source.getParentStateEntryAction());
        // target.setParentStateExitAction(source.getParentStateExitAction());
        // target.setParentStateInnerAction(source.getParentStateInnerAction());
        // target.setParentStateSuspension(source.getParentStateSuspension());
        target.setTrigger(source.getTrigger());
        target.getEffects().addAll(source.getEffects());
        // linkAllReferences(target.getTrigger());
    }

    /**
     * 
     */
    @Override
    protected boolean prepare() {
        return true;
    }

}
