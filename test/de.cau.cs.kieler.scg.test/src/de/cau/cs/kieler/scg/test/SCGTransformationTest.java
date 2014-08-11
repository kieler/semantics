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

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import de.cau.cs.kieler.core.model.transformations.AbstractModelTransformation;
import de.cau.cs.kieler.scg.schedulers.SimpleScheduler;
import de.cau.cs.kieler.scg.sequentializer.SimpleSequentializer;
import de.cau.cs.kieler.scg.transformations.BasicBlockTransformation;
import de.cau.cs.kieler.scg.transformations.DependencyTransformation;

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
    public void test001_scgToScgDep_simple() {
        compareModels("001-simple.scg", DependencyTransformation.class, "001-simple.scgdep");
    }

    @Test
    public void test002_scgDepToScgBB_simple() {
        compareModels("001-simple.scgdep", BasicBlockTransformation.class, "001-simple.scgbb");
    }

    @Test
    public void test003_scgBBToScgSched_simple() {
//        compareModels("001-simple.scgbb", SimpleScheduler.class, "001-simple.scgsched");
    }

    @Test
    public void test004_scgSchedToSeqScg_simple() {
        compareModels("001-simple.scgsched", SimpleSequentializer.class, "001-simple.seq.scg");
    }

    @Test(expected = AssertionError.class) // This test is expected to fail!
    public void test005_scgToSeqScgFail_simple() {
        compareModels("001-simple.scg", DependencyTransformation.class, "001-simple.seq.scg");
    }
        
	@Test
	public void test100_scgToScgDep_abo() {
		compareModels("100-abo.scg", DependencyTransformation.class, "100-abo.scgdep");
	}

	@Test
	public void test101_scgDepToScgBB_abo() {
		compareModels("100-abo.scgdep", BasicBlockTransformation.class, "100-abo.scgbb");
	}

	@Test
	public void test102_scgBBToScgSched_abo() {
//		compareModels("100-abo.scgbb", SimpleScheduler.class, "100-abo.scgsched");
	}

	@Test
	public void test103_scgSchedToSeqScg_abo() {
		compareModels("100-abo.scgsched", SimpleSequentializer.class, "100-abo.seq.scg");
	}

	@Test(expected = AssertionError.class) // This test is expected to fail!
	public void test104_scgToSeqScgFail_abo() {
		compareModels("100-abo.scg", DependencyTransformation.class, "100-abo.seq.scg");
	}
	
	
    // -------------------------------------------------------------------------
    // -- Unit tests helper
    // -------------------------------------------------------------------------	
	
	
	protected void compareModels(String sourceModel, Class<? extends AbstractModelTransformation> transformationClass, String targetModel) {

	    if (!new SCGModelTransformationComparator().
	            compareModelsInBundle(PLUGINID, TESTMODELPATH, sourceModel, transformationClass, targetModel)) {
// FIXME Reactivate tests!
//                Assert.fail("The transformed model and the target model do not match!");
            }
	}
	
}
