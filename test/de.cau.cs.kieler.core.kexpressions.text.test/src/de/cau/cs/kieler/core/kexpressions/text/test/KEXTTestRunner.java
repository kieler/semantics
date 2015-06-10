/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.kexpressions.text.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.runners.model.FrameworkMethod;
import org.osgi.framework.Bundle;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import de.cau.cs.kieler.core.annotations.StringAnnotation;
import de.cau.cs.kieler.core.kexpressions.keffects.Effect;
import de.cau.cs.kieler.core.kexpressions.text.kext.Kext;
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner;
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.BundleId;
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.ResourceSet;

/**
 * @author ssm
 * @kieler.design 2015-06-09 proposed 
 * @kieler.rating 2015-06-09 yellow proposed
 * 
 */
public class KEXTTestRunner extends ModelCollectionTestRunner {

    public static String KEXT_CHECK_ANNOTATION = "check";
    
    /**
     * @param clazz
     * @throws Throwable
     */
    public KEXTTestRunner(Class<?> clazz) throws Throwable {
        super(clazz);
    }

	protected void runTestRunnerForModel(Object object, String modelName)
			throws Throwable {
		
		System.out.println(modelName);
		
		if (!(object instanceof Kext)) {
			throw new IllegalArgumentException(
					"The KEXT test runner expects a KEXT object as input.");
		}
		
		FrameworkMethod resourceSetMethod = getAnnotatedMethod(getTestClass(), ResourceSet.class);
		URI uri = EcoreUtil.getURI((EObject) object);
		final Resource r =  ((org.eclipse.emf.ecore.resource.ResourceSet) resourceSetMethod.invokeExplosively(null)).getResource(uri, true);
		String bundleId = "de.cau.cs.kieler.core.kexpressions.text.test"; 
//				(String) getAnnotatedMethod(getTestClass(), BundleId.class).invokeExplosively(null);
		Bundle bundle = Platform.getBundle(bundleId);
		IPath path = new Path(modelName.substring(0, modelName.length()-1));
		InputStream is = FileLocator.openStream(bundle, path, true);
//		List<String> lines = Files.readLines(new File(fileString), Charsets.UTF_8);
//		((org.eclipse.emf.ecore.resource.ResourceSet) resourceSetMethod.invokeExplosively(null)).get
		
//		IResource platformResource = getPlatformResource((EObject) object);
//		System.out.println(platformResource.toString());
//		
//		ClassLoader classLoader = getClass().getClassLoader();
//		InputStream is = classLoader.getResourceAsStream(uri.toString());
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String s;
		while((s = br.readLine()) != null) {
			System.out.println(s);
		}
//		
//		System.out.println(s2);
		loadTextFile(uri);
		
		
		for (Effect effect : ((Kext) object).getEffects()) {
			StringAnnotation checkAnnotation = (StringAnnotation) effect
					.getAnnotation(KEXT_CHECK_ANNOTATION);
			if (checkAnnotation != null
					&& checkAnnotation.getValues().size() > 0) {
				runTestRunnerForObject(effect,
						checkAnnotation.getValues().get(0), object);
			}
		}
	}
	
	IResource getPlatformResource(EObject eObject) {
		Resource eResource = eObject.eResource();
		URI eUri = eResource.getURI();
		if (eUri.isPlatformResource()) {
			String platformString = eUri.toPlatformString(true);
			return ResourcesPlugin.getWorkspace().getRoot().findMember(platformString);
		}	
		return null;
	}
	
	protected void loadTextFile(URI uri) {
		BufferedReader reader;
		String line;
		
		try {
			reader = new BufferedReader(new FileReader(uri.toString()));
			line = reader.readLine();
			while(line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void runTestRunnerForObject(Object object, String objectName,
			Object rootObject) throws Throwable {
		this.getChildren().add(
				new SingleModelTestRunner(getTestClass().getJavaClass(),
						object, objectName));
	}

}
