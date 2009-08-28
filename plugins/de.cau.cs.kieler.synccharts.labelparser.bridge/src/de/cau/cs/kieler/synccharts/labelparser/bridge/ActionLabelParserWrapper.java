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

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserEditStatus;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.parser.antlr.IAntlrParser;
import org.eclipse.xtext.parsetree.reconstr.SerializerUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.TransitionLabelStandaloneSetup;

/**
 * @author haf
 * 
 */
public class ActionLabelParserWrapper implements IParser {

    /** Google Guice Injector to get the parser and serializer */
    Injector injector;
    Injector uiInjector;
    SerializerUtil serializerUtil;
    IAntlrParser parser;
    
    String newString;
    
    /**
     * 
     */
    public ActionLabelParserWrapper() {
        injector = new TransitionLabelStandaloneSetup()
                .createInjectorAndDoEMFRegistration();
        serializerUtil = injector.getInstance(SerializerUtil.class);
        parser = injector.getInstance(IAntlrParser.class);
        // FIXME: Class not found exception
        //uiInjector = new TransitionLabelUiStandaloneSetup()
        //.createInjectorAndDoEMFRegistration();//Guice.createInjector(new TransitionLabelUiModule());
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.gmf.runtime.common.ui.services.parser.IParser#getEditString
     * (org.eclipse.core.runtime.IAdaptable, int)
     */
    public String getEditString(IAdaptable element, int flags) {
        return getPrintString(element, flags);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.gmf.runtime.common.ui.services.parser.IParser#getPrintString
     * (org.eclipse.core.runtime.IAdaptable, int)
     */
    public String getPrintString(IAdaptable element, int flags) {
        //      if(lastEnteredString != null)
        //          return lastEnteredString;
        if (element instanceof EObjectAdapter) {
            if (((EObjectAdapter) element).getRealObject() instanceof Action) {
                // take original emf model element and use the xtext serializer
                // to get a proper String representation
                Action action = (Action) (((EObjectAdapter) element)
                        .getRealObject());
                
                String serializedString = serializeAction(action);
                if(serializedString != null)
                    return serializedString;
                else{
                    String triggersAndEffectsString = action.getTriggersAndEffects();
                    if(triggersAndEffectsString != null)
                        return triggersAndEffectsString;    
                }
            }
        }
        return "";
    }

    /**
     * @param action
     * @return
     */
    private String serializeAction(Action action) {
        try{
            // this is the official way to serialize via Xtext
            // You need a dummy resource with the correct suffix in order
            // to determine the right registered serializer stuff
            
            //XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
            //XtextResource resource = (XtextResource)resourceSet.createResource(URI.createURI("platform:/resource/de.cau.cs.kieler.synccharts.labelparser/dummy.action"));
            //resource.getContents().add(action);
            //Map options = new HashMap();
            //ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            //resource.save(outputStream, options);
            //return outputStream.toString();
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            serializerUtil.serialize(action, outputStream, null, false);
            return outputStream.toString();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.gmf.runtime.common.ui.services.parser.IParser#getParseCommand
     * (org.eclipse.core.runtime.IAdaptable, java.lang.String, int)
     */
    public ICommand getParseCommand(IAdaptable element, String newString, int flags) {
        System.out.println("getParseCommand"+newString);
        this.newString = newString;
        return new ActionLabelParseCommand(element, newString, parser, injector);
    }

    /**
     * @param value
     */
    public void doParse(String value, EObject targetElement) {
        ICommand command = new ActionLabelParseCommand(targetElement, value, parser, injector);
        ICommandProxy proxy = new ICommandProxy(command);
        IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
        if(editor instanceof DiagramEditor){
            DiagramCommandStack commandStack = null;
            Object adapter = ((DiagramEditor) editor).getAdapter(CommandStack.class);
            if (adapter instanceof DiagramCommandStack)
                commandStack = (DiagramCommandStack) adapter;
            if (commandStack == null)
                commandStack = new DiagramCommandStack(null);
            commandStack.execute(proxy);
        }
    }
    
    /**
     * Check whether an event is affected. This wrapper affects notification
     * events.
     * 
     * @see org.eclipse.gmf.runtime.common.ui.services.parser.IParser#isAffectingEvent(java.lang.Object,
     *      int)
     */
    public boolean isAffectingEvent(Object event, int flags) {
        System.out.println("isAffectingEvent "+flags+" "+event);
        if (event instanceof Notification) {
            Object feature = ((Notification) event).getFeature();
            if (feature.equals(SyncchartsPackage.eINSTANCE
                    .getAction_TriggersAndEffects())) {
                String value = ((Notification) event).getNewStringValue();
                if(this.newString == null || !value.equals(this.newString)){
                    this.doParse(value, (Action)((Notification) event).getNotifier());
                }
                return true;
            }
        }
        return false;
    }


    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.gmf.runtime.common.ui.services.parser.IParser#isValidEditString
     * (org.eclipse.core.runtime.IAdaptable, java.lang.String)
     */
    public IParserEditStatus isValidEditString(IAdaptable element,
            String editString) {
        // TODO: add real check here
        System.out.println("isValidEditString");
        IParserEditStatus status = ParserEditStatus.EDITABLE_STATUS;
        //status = ParserEditStatus.UNEDITABLE_STATUS;
        return status;
    }

   
    /* (non-Javadoc)
     * @see org.eclipse.gmf.runtime.emf.ui.services.parser.ISemanticParser#areSemanticElementsAffected(org.eclipse.emf.ecore.EObject, java.lang.Object)
     */
    public boolean areSemanticElementsAffected(EObject listener,
            Object notification) {
        System.out.println("areSemanticElementsAffected "+listener+" "+notification);
        if (notification instanceof Notification) {
            Object feature = ((Notification) notification).getFeature();
            if (feature.equals(SyncchartsPackage.eINSTANCE
                    .getAction_TriggersAndEffects())) {
                return true;
            }
        }
        return false;
    }

    /* (non-Javadoc)
     * @see org.eclipse.gmf.runtime.emf.ui.services.parser.ISemanticParser#getSemanticElementsBeingParsed(org.eclipse.emf.ecore.EObject)
     */
    public List getSemanticElementsBeingParsed(EObject element) {
        System.out.println("getSemanticElementsBeingParsed");
        List<Object> elementList = new ArrayList<Object>(1);
        elementList.add(element);
        return elementList;
    }

    /* (non-Javadoc)
     * @see org.eclipse.gmf.runtime.common.ui.services.parser.IParser#getCompletionProcessor(org.eclipse.core.runtime.IAdaptable)
     */
    public IContentAssistProcessor getCompletionProcessor(IAdaptable element) {
        
       // XtextContentAssistProcessor contentAssist = uiInjector.getInstance(XtextContentAssistProcessor.class);
       // return contentAssist;
        return null;
    }
}
