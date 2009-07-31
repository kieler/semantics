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

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserEditStatus;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.xtext.parser.antlr.IAntlrParser;
import org.eclipse.xtext.parsetree.reconstr.SerializerUtil;
import org.eclipse.xtext.parsetree.reconstr.XtextSerializationException;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.TransitionLabelStandaloneSetup;

/**
 * @author haf
 * 
 */
public class ActionLabelParserWrapper implements IParser {

    /** Google Guice Injector to get the parser and serializer */
    Injector injector;
    SerializerUtil serializerUtil;
    IAntlrParser parser;

    /**
     * 
     */
    public ActionLabelParserWrapper() {
        injector = new TransitionLabelStandaloneSetup()
                .createInjectorAndDoEMFRegistration();
        serializerUtil = injector.getInstance(SerializerUtil.class);
        parser = injector.getInstance(IAntlrParser.class);
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
        if (element instanceof EObjectAdapter) {
            if (((EObjectAdapter) element).getRealObject() instanceof Action) {
                // take original emf model element and use the xtext serializer
                // to get a proper String representation
                Action action = (Action) (((EObjectAdapter) element)
                        .getRealObject());
                try{
                    // this is the official way to serialize via Xtext
                    // You need a dummy resource with the correct suffix in order
                    // to determine the right registered serializer stuff
//                    XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
//                    XtextResource resource = (XtextResource)resourceSet.createResource(URI.createURI("platform:/resource/de.cau.cs.kieler.synccharts.labelparser/dummy.action"));
//                    resource.getContents().add(action);
//                    Map options = new HashMap();
//                    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//                    resource.save(outputStream, options);
//                    return outputStream.toString();
                    
                    // create a new Action copy with only the elements relevant for serialization
                    //Action serializeableAction = SyncchartsFactory.eINSTANCE.createAction();
                    //ActionLabelParseCommand.copyActionContents(action, serializeableAction);
                  
                    return serializerUtil.serialize(action);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    return "serExc";
                }
            }
        }
        return "";
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.gmf.runtime.common.ui.services.parser.IParser#getParseCommand
     * (org.eclipse.core.runtime.IAdaptable, java.lang.String, int)
     */
    public ICommand getParseCommand(IAdaptable element, String newString, int flags) {
        //if (((EObjectAdapter) element).getRealObject() instanceof SuspensionTrigger) {
          //      return new XTextParseExpressionCommand(element, newString, flags);
        //}
        //else {
        return new ActionLabelParseCommand(element, newString, parser, injector);
        //}
    }

    /**
     * Check whether an event is affected. This wrapper affects notification
     * events.
     * 
     * @see org.eclipse.gmf.runtime.common.ui.services.parser.IParser#isAffectingEvent(java.lang.Object,
     *      int)
     */
    public boolean isAffectingEvent(Object event, int flags) {
        if (event instanceof Notification) {
            Object feature = ((Notification) event).getFeature();
            if (feature.equals(SyncchartsPackage.eINSTANCE
                    .getAction_TriggersAndEffects())) {
                return true;
            }/* else if (feature.equals(SyncchartsPackage.eINSTANCE
                    .getSuspensionTrigger_Trigger())) {
                return true;
            }*/
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
        IParserEditStatus status = ParserEditStatus.EDITABLE_STATUS;
        return status;
    }

    /*
     * (non-Javadoc)
     * 
     * @seeorg.eclipse.gmf.runtime.common.ui.services.parser.IParser#
     * getCompletionProcessor(org.eclipse.core.runtime.IAdaptable)
     */
    public IContentAssistProcessor getCompletionProcessor(IAdaptable element) {
        // TODO Auto-generated method stub
        return null;
    }
}
