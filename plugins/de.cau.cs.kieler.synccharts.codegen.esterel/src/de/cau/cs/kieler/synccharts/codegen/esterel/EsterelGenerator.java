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
package de.cau.cs.kieler.synccharts.codegen.esterel;

import java.io.IOException;
import java.util.Collections;
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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.PlatformUI;

import com.google.inject.Guice;

import de.cau.cs.kieler.kies.esterel.Program;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.codegen.esterel.xtend.Synccharts2Esterel;

/**
 * @author cmot
 * 
 *         Generate S Code from a SyncChart using new Xtend language.
 * 
 */
public class EsterelGenerator implements IHandler {

	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public Object execute(ExecutionEvent event) throws ExecutionException {

		// get input model from currently selected file in Explorer
		ISelection selection = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getSelectionService()
				.getSelection();
		File file = (File) ((TreeSelection) selection).getFirstElement();
		URI input = URI.createPlatformResourceURI(
				file.getFullPath().toString(), true);
		URI output = URI.createURI("");

		// Try to load synccharts model
		XMIResourceImpl inputResource = new XMIResourceImpl(input);
		try {
			// Load synccharts model
			inputResource.load(null);
			Region rootRegion = (Region) inputResource.getContents().get(0);

			// Apply transformation
			// Because for @Inject tags we cannot use the standard NEW keyword
			//    Synccharts2S transform = new Synccharts2S();
			Synccharts2Esterel transform = Guice.createInjector().getInstance(Synccharts2Esterel.class);
			Program program = transform.transform(rootRegion);

			// Calculate output path
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
			} catch (IOException e) {
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
