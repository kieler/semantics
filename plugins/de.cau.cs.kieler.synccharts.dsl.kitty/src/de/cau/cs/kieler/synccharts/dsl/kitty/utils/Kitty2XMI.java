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
 */
package de.cau.cs.kieler.synccharts.dsl.kitty.utils;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.cau.cs.kieler.synccharts.dsl.resource.kittyResource;

/**
 * @author oba
 * 
 */
public class Kitty2XMI {

	/**
	 * @author oba XMI Serialization
	 */
	public static void main(String[] args) {
		serializeModel("newState");
	}

	public static void serializeModel(String modelName) {
		String selectedFile = "/home/oba/Desktop/oba_workspaces/runtime-KIT/kitproject/M2Mexamples/"
				+ modelName + ".kitty";
		kittyResource resource = new kittyResource(URI
				.createFileURI(selectedFile));
		try {
			resource.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		resource.getParser().doLinking();
		EObject object = resource.getContents().iterator().next();
		URI uri = URI.createFileURI(selectedFile); // cut the file extension (xmi or kitty to get myModel.kitty at the end)
		XMIResourceFactoryImpl x = new XMIResourceFactoryImpl();
		XMIResource rr = (XMIResource) x.createResource(uri);
		rr.getContents().add(object);
		Map<Object, Object> m = rr.getDefaultSaveOptions();
		m.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);
		try {
			rr.save(m);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("OK");

	}

}
