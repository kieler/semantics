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
package de.cau.cs.kieler.synccharts.codegen.s;

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
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.util.EmfFormatter;

import de.cau.cs.kieler.core.annotations.AnnotationsPackage;
import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.s.s.Program;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.codegen.s.xtend.Synccharts2S;
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependencies;
import de.cau.cs.kieler.synccharts.codegen.dependencies.xtend.Synccharts2Dependenies;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

// Needed for @Inject tags for modularization (e.g., the Helper.xtend file)
//import com.google.inject.AbstractModule;
//import com.google.inject.Guice;

/**
 * @author cmot
 * 
 *         Generate S Code from a SyncChart using new Xtend language.
 * 
 */
public class SGenerator implements IHandler {

	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	public void dispose() {
		// TODO Auto-generated method stub

	}
	

	// -------------------------------------------------------------------------

	protected String getFileStringFromUri(URI uri) {

		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace()
				.getRoot();

		IPath path = new Path(uri.toPlatformString(false));
		IFile file = myWorkspaceRoot.getFile(path);

		IPath fullPath = file.getLocation();

		// If we have spaces, try it like this...
		if (fullPath == null
				&& file instanceof org.eclipse.core.internal.resources.Resource) {
			org.eclipse.core.internal.resources.Resource resource = (org.eclipse.core.internal.resources.Resource) file;
			fullPath = resource.getLocalManager().locationFor(resource);
		}

		// Ensure it is absolute
		fullPath.makeAbsolute();

		java.io.File javaFile = new java.io.File(fullPath.toString().replaceAll("%20",
				" "));

		if (javaFile != null) {
			String fileString = javaFile.getAbsolutePath();
			return fileString;
		}

		// Something went wrong, we could not resolve the file location
		return null;
	}	

	// -------------------------------------------------------------------------

	public Object execute(ExecutionEvent event) throws ExecutionException {

		// get input model from currently selected file in Explorer
		ISelection selection = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getSelectionService()
				.getSelection();
		File file = (File) ((TreeSelection) selection).getFirstElement();
		URI input = URI.createPlatformResourceURI(
				file.getFullPath().toString(), true);
		URI output = URI.createURI("");
		URI output2 = URI.createURI("");

		// Try to load synccharts model
		XMIResourceImpl inputResource = new XMIResourceImpl(input);
		try {
			// Load synccharts model
			inputResource.load(null);
			Region rootRegion = (Region) inputResource.getContents().get(0);

//			// Generate dependencies
//			Synccharts2Dependenies dependenciesTransform = Guice.createInjector().getInstance(Synccharts2Dependenies.class);
//			Dependencies dependencies = dependenciesTransform.transform(rootRegion);
//			{// Debug output
//			Predicate<EStructuralFeature> ignoredFeatures = Predicates.alwaysFalse();
//			String text = EmfFormatter.objToStr(dependencies, ignoredFeatures);
//			output2 = URI.createURI(input.toString());
//			output2 = output2.trimFragment();
//			output2 = output2.trimFileExtension().appendFileExtension("dependencies.txt");
//			String outputFileString =  getFileStringFromUri(output2);
//			FileWriter fw = new FileWriter(outputFileString);
//		    BufferedWriter bw = new BufferedWriter(fw);
//		    bw.write(text);
//		    bw.close();
//		    
//			// Calculate outout path
//			output = URI.createURI(input.toString());
//			output = output.trimFragment();
//			output = output.trimFileExtension().appendFileExtension("dependency");
//
//			try {
//				// Write out Dependency program
//				Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//				Map<String, Object> m = reg.getExtensionToFactoryMap();
//				m.put("daform", new XMIResourceFactoryImpl());
//				ResourceSet resSet = new ResourceSetImpl();
//				Resource resource = resSet.createResource(output);
//				resource.getContents().add(dependencies);
//				resource.save(Collections.EMPTY_MAP);
//			} catch (IOException e) {
//				throw new ExecutionException("Cannot write output file.");
//			}
//			}

			
			// Apply transformation
			// Because for @Inject tags we cannot use the standard NEW keyword
			//    Synccharts2S transform = new Synccharts2S();
//			Synccharts2S transform = Guice.createInjector().getInstance(Synccharts2S.class);
//			Program program = transform.transform(rootRegion);
			Program program = new Synccharts2S().transform(rootRegion);

			{// Debug output
			Predicate<EStructuralFeature> ignoredFeatures = Predicates.alwaysFalse();
			String text = EmfFormatter.objToStr(program, ignoredFeatures);
			output2 = URI.createURI(input.toString());
			output2 = output2.trimFragment();
			output2 = output2.trimFileExtension().appendFileExtension("txt");
			String outputFileString =  getFileStringFromUri(output2);
			FileWriter fw = new FileWriter(outputFileString);
		    BufferedWriter bw = new BufferedWriter(fw);
		    bw.write(text);
		    bw.close();}

			// Calculate outout path
			output = URI.createURI(input.toString());
			output = output.trimFragment();
			output = output.trimFileExtension().appendFileExtension("s");

			try {
				// Write out S program
				Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
				Map<String, Object> m = reg.getExtensionToFactoryMap();
				m.put("daform", new XMIResourceFactoryImpl());
				ResourceSet resSet = new ResourceSetImpl();
				Resource resource = resSet.createResource(output);
				resource.getContents().add(program);
				resource.save(Collections.EMPTY_MAP);
			} catch (Exception e) {
				throw new ExecutionException("Cannot write output file.");
			}
		} catch (IOException e) {
			throw new ExecutionException("Cannot read input file.");
		}

		// Refresh the file explorer
		try {
			ResourcesPlugin.getWorkspace().getRoot()
					.refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e2) {
			e2.printStackTrace();
		}

		return null;
	}

	public boolean isEnabled() {
		return true;
	}

	public boolean isHandled() {
		return true;
	}

	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

}
