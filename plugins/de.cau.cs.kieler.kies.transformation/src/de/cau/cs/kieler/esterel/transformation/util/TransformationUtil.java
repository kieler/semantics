/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.transformation.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.parsetree.reconstr.Serializer;
import org.eclipse.xtext.resource.SaveOptions;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory;
import de.cau.cs.kieler.core.kexpressions.TextualCode;
import de.cau.cs.kieler.core.ui.util.EditorUtils;
import de.cau.cs.kieler.core.util.Maybe;
import de.cau.cs.kieler.kies.EsterelStandaloneSetup;
import de.cau.cs.kieler.kies.esterel.EsterelPackage;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.StateType;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;

/**
 * utility class.
 * 
 * @author uru
 * 
 */
public final class TransformationUtil {

    private static Injector injector;

    static {
        injector = new EsterelStandaloneSetup().createInjectorAndDoEMFRegistration();
    }

    /** utility class. */
    private TransformationUtil() {

    }

    /**
     * 
     * @param e
     *            esterel object
     * @return serialized string
     */
    public static String getSerializedString(final EObject e) {

        if (!EsterelPackage.eINSTANCE.eContents().contains(e.eClass())) {
            System.out.println("nixda");
            return "";
        }

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(baos);

        try {
            Serializer serializerUtil = injector.getInstance(Serializer.class);
            serializerUtil.serialize(e, osw, SaveOptions.defaultOptions());
            // System.out.println("Serialized result: " + baos.toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return baos.toString();
    }

    /**
     * Do some casting. Dunno why this is needed. But else Xtend editor marks some casts as error.
     * 
     * @param obj
     *            object to cast
     * @return casted object
     */
    public static EObject castToEObjcet(final EObject obj) {
        return obj;
    }

    /**
     * Convenient method for setting the body reference for a state. Maybe in some later state to
     * any kind of actions here.
     * 
     * @param s
     *            state
     * @param obj
     *            any EObject
     */
    public static void setBodyReference(final State s, final EObject obj) {

        if (obj != null) {
            s.setBodyReference(obj);

            TextualCode code = KExpressionsFactory.eINSTANCE.createTextualCode();
            s.setType(StateType.TEXTUAL);
            code.setCode(TransformationUtil.getSerializedString(obj));
            s.getBodyText().add(code);
        }
    }

    public static void addToFrontOfList(final List<State> list, final List<State> list2) {
        list.addAll(0, list2);
    }

    public static void debug(final EObject obj) {
        System.out.println("Debug: " + obj);
        if (obj instanceof Region) {
            System.out.println(((Region) obj).getParentState());
            System.out.println(((Region) obj).getStates());
        }
    }

    public static DiagramEditor getActiveEditor() {
        final Maybe<DiagramEditor> maybe = new Maybe<DiagramEditor>();
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                IEditorPart editor = EditorUtils.getLastActiveEditor();
                if (editor instanceof DiagramEditor) {
                    maybe.set((DiagramEditor) editor);
                }
            }
        });
        return maybe.get();
    }

    public static List<EObject> getCurrentEditorSelection() {
        LinkedList<EObject> selectedElements = null;
        // get the active editor
        IEditorPart editor = getActiveEditor();
        if (editor instanceof SyncchartsDiagramEditor) {
            EditPart rootEditPart = ((DiagramEditor) editor).getDiagramEditPart();
            EditPartViewer viewer = rootEditPart.getViewer();

            // get the selection
            ISelection selection = viewer.getSelection();
            if (!selection.isEmpty()) {
                selectedElements = new LinkedList<EObject>();
                if (selection instanceof StructuredSelection) {
                    // append all elements to the list being returned
                    for (Object o : ((StructuredSelection) selection).toArray()) {
                        if (o instanceof EditPart) {
                            EObject selModel = ((View) ((EditPart) o).getModel()).getElement();
                            selectedElements.add(selModel);
                        }
                    }
                }
            }
        }
        return selectedElements;
    }
}
