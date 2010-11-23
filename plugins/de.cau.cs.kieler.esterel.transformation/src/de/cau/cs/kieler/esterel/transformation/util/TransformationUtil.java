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
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parsetree.reconstr.Serializer;
import org.eclipse.xtext.resource.SaveOptions;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.expressions.ExpressionsFactory;
import de.cau.cs.kieler.core.expressions.TextualCode;
import de.cau.cs.kieler.esterel.EsterelStandaloneSetup;
import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.StateType;

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

            TextualCode code = ExpressionsFactory.eINSTANCE.createTextualCode();
            s.setType(StateType.TEXTUAL);
            code.setCode(TransformationUtil.getSerializedString(obj));
            s.getBodyText().add(code);
        }
    }

    public static void addToList(final List<State> list, final List<State> list2) {
        System.out.println("fofo " + list + " " + list2);
    }
}
