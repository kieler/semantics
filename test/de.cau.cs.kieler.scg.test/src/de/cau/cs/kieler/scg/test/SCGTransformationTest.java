/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time & Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.core.model.transformations.AbstractModelTransformation;
import de.cau.cs.kieler.core.model.util.ModelUtil;
import de.cau.cs.kieler.scg.schedulers.SimpleScheduler;
import de.cau.cs.kieler.scg.transformations.SCGDEPToSCGBBTransformation;
import de.cau.cs.kieler.scg.transformations.SCGSchedToSeqSCGTransformation;
import de.cau.cs.kieler.scg.transformations.SCGToSCGDEPTransformation;

/**
 * JUnit test cases for the SCG transformation chain
 * 
 * @author ssm
 * 
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SCGTransformationTest {
	
	private static String PLUGINID = "de.cau.cs.kieler.scg.test";
	private static String TESTMODELPATH = "testModels/";
	
    // -------------------------------------------------------------------------
    // -- Unit tests
    // -------------------------------------------------------------------------	
	
	@Test
	public void test100_scgToScgDep_abo() {
		compareModels("01-abo.scg", SCGToSCGDEPTransformation.class, "01-abo.scgdep");
	}

	@Test
	public void test101_scgDepToScgBB_abo() {
		compareModels("01-abo.scgdep", SCGDEPToSCGBBTransformation.class, "01-abo.scgbb");
	}

	@Test
	public void test102_scgBBToScgSched_abo() {
		compareModels("01-abo.scgbb", SimpleScheduler.class, "01-abo.scgsched");
	}

	@Test
	public void test103_scgSchedToSeqScg_abo() {
		compareModels("01-abo.scgsched", SCGSchedToSeqSCGTransformation.class, "01-abo.seq.scg");
	}

	@Test(expected = AssertionError.class) // This test is expected to fail!
	public void test104_scgToSeqScgFail_abo() {
		compareModels("01-abo.scg", SCGToSCGDEPTransformation.class, "01-abo.seq.scg");
	}
	
	
    // -------------------------------------------------------------------------
    // -- Unit tests helper
    // -------------------------------------------------------------------------	
	
	
	protected void compareModels(String sourceModelPosition, Class<? extends AbstractModelTransformation> transformationClass, String targetModelPosition) {
        final Bundle bundle = Platform.getBundle(PLUGINID);

        URL bundleLocation = bundle.getEntry("");
		URL sourceModelLocation = null;
		URL targetModelLocation = null;
		
        try {
			bundleLocation = ModelUtil.getAbsoluteBundlePath(bundleLocation);
			String modelLocationString = bundleLocation.toString();
			sourceModelLocation = URI.create(modelLocationString + TESTMODELPATH + sourceModelPosition).toURL();
	        targetModelLocation = URI.create(modelLocationString + TESTMODELPATH + targetModelPosition).toURL();
			sourceModelLocation = FileLocator.toFileURL(sourceModelLocation);
			targetModelLocation = FileLocator.toFileURL(targetModelLocation);
		} catch (MalformedURLException e) {
		} catch (IOException e) {
		}
        
        IPath sourcePath = new Path(sourceModelLocation.getPath());
    	File source = new File(sourcePath.toString());
        IPath targetPath = new Path(targetModelLocation.getPath());
    	File target = new File(targetPath.toString());
            
		SCGModelTransformationComparator comparator = new SCGModelTransformationComparator();
		if (!comparator.compare(source, transformationClass, target)) {
			Assert.fail("The transformed model and the target model do not match!");
		}
	}
	
}
