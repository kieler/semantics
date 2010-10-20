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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parsetree.reconstr.Serializer;
import org.eclipse.xtext.resource.SaveOptions;

import com.google.inject.Injector;

import de.cau.cs.kieler.esterel.EsterelStandaloneSetup;
import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl;

/**
 * @author uru
 * 
 */
public class TransformationUtil {

    private static Injector injector;

    static {
        injector = new EsterelStandaloneSetup().createInjectorAndDoEMFRegistration();
    }

    /**
     * @TODO make sure only esterel elements are accepted°!!!
     * @param e
     * @return
     */
    public static String getSerializedString(final EObject e) {

        EsterelPackage.eINSTANCE.eContents().contains(e.eClass());

        if (e == null) {
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

}
