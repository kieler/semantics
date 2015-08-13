/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.s.sc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;

import com.google.inject.Guice;

import de.cau.cs.kieler.core.model.codegeneration.SimpleCBeautifier;
import de.cau.cs.kieler.core.model.util.ModelUtil;
import de.cau.cs.kieler.kico.KielerCompilerContext;
import de.cau.cs.kieler.kico.internal.KiCoUtil;
import de.cau.cs.kieler.s.s.Program;
import de.cau.cs.kieler.s.sc.xtend.S2Arduino;

/**
 * This class will handle smart code generation for Arduino code that was manually edited in parts
 * outside sections marked with
 * 
 * %%% GENERATED CODE BELOW %%% ... %%% GENERATED CODE ABOVE %%%
 * 
 * These sections need to be replaced on every code generation run. Parts outside these sections
 * just needs to be modified afterwards if there is a change in the interface.
 * 
 * @author cmot
 * 
 */
public class ArduinoGenerator {

    /**
     * Tries to load an existing *.ino file, and if this exists, exchange the portions inside the
     * generated-code-tags. If no file exists, then a fully fresh *.ino file will be created.
     * 
     * @param program
     *            the program
     */
    public String transform(Program program, KielerCompilerContext context) {

        String returnProgram = "";
        
        String existingProgram[] = new String[4];
        for (int c = 0; c < existingProgram.length; c++) {
            existingProgram[c] = "";
        }
        boolean previousFileExists = false;

        URI modelURI = context.getMainResource().getURI();
        URI inoURI = modelURI.trimFileExtension().appendFileExtension("ino");
        
        
 
        // Test if previously created *.ino file exists
        try {
            int counter = 0;
            // READ IN WHOLE FILE
            //String stringPath = file.getRawLocation().toString();
            
//            String fileString = inoURI.toString();
//            IPath inoFilePath = new Path(fileString);
            IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
            IPath inoFilePath = new Path(inoURI.toString());
//            IFile inoFile = workspaceRoot.getFile(inoFilePath);
//            IPath inoFileRawPath = inoFile.getRawLocation();
//
//            InputStream ModelUtil.openWorkspaceFile(inoFilePath)

            InputStream inoFileInputStream = URIConverter.INSTANCE.createInputStream(inoURI);
            
//            InputStream inoFileInputStream =  ModelUtil.openWorkspaceFile(inoFilePath); //new FileInputStream(inoFileRawPath.toString());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
                    inoFileInputStream));

            String line = null;
            boolean ignore = false; //ignore previously generated code

            while ((line = bufferedReader.readLine()) != null) {
                // Search for "#include mainmodule.h" line and replace it with
                // the more concrete header file.
                
                /*
                 * 
                 *        //  |   |   |   -------------------------------------------   |   |   | 
       // \|/ \|/ \|/  VOLATILE GENERATED CODE BELOW - DO NOT EDIT  \|/ \|/ \|/
       «FOR state : program.states»
       «state.expand»
       «ENDFOR»
       «program.setPreVariables»
       // /|\ /|\ /|\  VOLATILE GENERATED CODE ABOVE - DO NOT EDIT /|\ /|\ /|\
       //  |   |   |   -------------------------------------------  |   |   | 

                 * 
                 */

                if (line.trim().contains("//  |   |   |   -------------------------------------------   |   |   |")) {
                    // just consume         //%%% VOLATILE GENERATED CODE BELOW - DO NOT EDIT %%%
                }
                else if (line.trim().startsWith("// \\|/ \\|/ \\|/  VOLATILE GENERATED CODE BELOW - DO NOT EDIT  \\|/ \\|/ \\|/")) {
                    ignore = true;
//                    counter++; // next existingProgram slot
                }
                else if (line.trim().startsWith("// /|\\ /|\\ /|\\  VOLATILE GENERATED CODE ABOVE - DO NOT EDIT  /|\\ /|\\ /|\\")) {
                    ignore = false;
                    counter++; // next existingProgram slot
                }
                else {
                    if (!ignore) {
                        existingProgram[counter] += line + "\n";
                    }
                }
            }
            bufferedReader.close();
            previousFileExists = true;
        } catch (Exception e) {
            e.printStackTrace();
            existingProgram[0] = null; 
        }
        
        S2Arduino instance = Guice.createInjector().getInstance(S2Arduino.class);
        if (!previousFileExists) {
            // NORMAL PROCEDURE
            returnProgram = instance.generateProgram(program);
        } else {
            // UPDATE PROCEDURE
            instance.prepareCache(program);
            returnProgram = existingProgram[0] + 
                    instance.generateInternalVariables(program) +
                    existingProgram[1] + 
                    instance.generateResetFunctionInner(program) + 
                    existingProgram[2] + 
                    instance.generateTickFunctionInner(program) + 
                    existingProgram[3];
        }
        
        try {
            returnProgram = SimpleCBeautifier.beautify(returnProgram, "   ");
        } catch (NoSuchFieldException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return returnProgram;
    }

    // -------------------------------------------------------------------------

    /**
     * Convert an EMF URI to a Java.net.URI.
     * 
     * @param URI
     *            the URI
     * @return the java.net. URI
     * @throws URISyntaxException
     *             the URI syntax exception
     */
    private java.net.URI convertEMFtoJavaURI(final URI uri) throws URISyntaxException {
        IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

        System.out.println("convertEMFtoJavaURI 1");

        IPath path = new Path(uri.toPlatformString(false));
        System.out.println("convertEMFtoJavaURI 2" + path);
        IFile file = myWorkspaceRoot.getFile(path);
        System.out.println("convertEMFtoJavaURI 3" + file.toString());

        IPath fullPath = file.getLocation();
        System.out.println("convertEMFtoJavaURI 4" + fullPath.toString());

        return new java.net.URI(fullPath.toString());
    }

}
