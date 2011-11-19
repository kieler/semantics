/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.cec.sim;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import de.cau.cs.kieler.core.annotations.AnnotationsPackage;
import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.esterel.cec.sim.xtend.Esterel2CSimulationInterface;
import de.cau.cs.kieler.kies.esterel.Program;
import de.cau.cs.kieler.kies.esterel.EsterelPackage;

// Needed for @Inject tags for modularization (e.g., the Helper.xtend file)
import com.google.inject.AbstractModule;
import com.google.inject.Guice;

/**
 * @author cmot
 * 
 *         Generate S Code from a SyncChart using new Xtend language.
 * 
 */
public class CSimulationInterfaceGenerator {
	
    private Program esterelProgram = null;
    private URI esterelProgramUri = null;

	
	public CSimulationInterfaceGenerator(IEditorPart editor) {
        IParseResult result = null;
        if (editor instanceof XtextEditor) {
            XtextEditor xtextEditor = (XtextEditor) editor;

            if (xtextEditor.getDocument() instanceof XtextDocument) {
                IUnitOfWork<IParseResult, XtextResource> work = new IUnitOfWork<IParseResult, XtextResource>() {

                    public IParseResult exec(final XtextResource state) throws Exception {
                        return state.getParseResult();
                    }
                };
                result = xtextEditor.getDocument().readOnly(work);

                esterelProgram = (Program) result.getRootASTElement();
                esterelProgramUri = esterelProgram.eResource().getURI();
            }
        }
	}
	

	public void execute(final String filePath) throws ExecutionException {

			// Apply transformation
			// Because for @Inject tags we cannot use the standard NEW keyword
			//    Synccharts2S transform = new Synccharts2S();
			Esterel2CSimulationInterface transform = Guice.createInjector().getInstance(Esterel2CSimulationInterface.class);
			String ccode = transform.createCSimulationInterface(esterelProgram.getModules().get(0)).toString();

			// Write out c program
			URI output = URI.createURI(esterelProgramUri.toString());
			output = output.trimFragment();
			//output = output.trimFileExtension().appendFileExtension("c");
			
			try {
				FileWriter fileWriter = new FileWriter(filePath);
				if (fileWriter != null) {
					BufferedWriter out = new BufferedWriter(fileWriter);
					if (out != null) {
						out.write(ccode);
						out.close();
					}
				}
			} catch (IOException e) {
				throw new ExecutionException("Cannot write output file.");
			}

//		// Refresh the file explorer
//		try {
//			ResourcesPlugin.getWorkspace().getRoot()
//					.refreshLocal(IResource.DEPTH_INFINITE, null);
//		} catch (CoreException e2) {
//			e2.printStackTrace();
//		}

	}


}
