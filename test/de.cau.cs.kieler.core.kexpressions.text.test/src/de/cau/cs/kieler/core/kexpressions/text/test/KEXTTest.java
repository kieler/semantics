/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time & Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.kexpressions.text.test;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import com.google.inject.Guice;

import de.cau.cs.kieler.core.annotations.StringAnnotation;
import de.cau.cs.kieler.core.kexpressions.keffects.Effect;
import de.cau.cs.kieler.core.kexpressions.text.KEXTStandaloneSetup;
import de.cau.cs.kieler.core.kexpressions.text.extensions.KEXTSerializeExtensions;
import de.cau.cs.kieler.core.kexpressions.text.kext.TestEntity;
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner;
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.BundleId;
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.ModelFilter;
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.ModelPath;


/**
 * JUnit Test Case for the KEXT
 * 
 * @author ssm
 * @kieler.design 2015-06-09 proposed 
 * @kieler.rating 2015-06-09 yellow proposed
 * 
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(KEXTTestRunner.class)
@BundleId("de.cau.cs.kieler.core.kexpressions.text.test")
@ModelPath("tests/")
@ModelFilter("*.kext")
public class KEXTTest {
    
    public static String KEXT_HUMANREADABLE_ANNOTATION = "readable";    

    /**
     * Provides a {@link ResourceSet} in order to load the models properly.
     * 
     * @return the required {@link ResourceSet}
     */
    @ModelCollectionTestRunner.ResourceSet
    public static ResourceSet getResourceSet() {
        return new KEXTStandaloneSetup().createInjectorAndDoEMFRegistration().getInstance(
                XtextResourceSet.class);
    }
    
    @Test
    public void serialize(final EObject eObject, String expected) {
        KEXTSerializeExtensions SE = Guice.createInjector().getInstance(KEXTSerializeExtensions.class);
        TestEntity entity = (TestEntity) eObject;
        if (entity.getExpression() != null) {
        	expected = expected.substring(11); 
        }
        
        String serialized = SE.serialize(entity).toString();
        
        if (!serialized.equals(expected)) {
        	StringAnnotation checkAnnotation = getCheckAnnotation(entity);
        	String assertMessage = "Serialization of " + checkAnnotation.getValues().get(0) + 
                    " was \"" + serialized + 
                    "\" but does not match expected output \"" + 
                    expected + 
                    "\"!";
        	System.out.println(assertMessage);
            Assert.fail(assertMessage);
        }
    }
    
    @Test
    public void serializeHumanReadable(final EObject eObject, String expected) {
        KEXTSerializeExtensions SE = Guice.createInjector().getInstance(KEXTSerializeExtensions.class);
        TestEntity entity = (TestEntity) eObject;
        if (entity.getExpression() != null) {
                expected = expected.substring(11); 
        }
        
        String serialized = SE.humanReadable(SE.serialize(entity)).toString();
        
        StringAnnotation humanReadableAnnotation = getHumanReadableAnnotation(entity);
        if (humanReadableAnnotation != null) {
            expected = humanReadableAnnotation.getValues().get(0);
        }
        
        if (!serialized.equals(expected)) {
                StringAnnotation checkAnnotation = getCheckAnnotation(entity);
                String assertMessage = "Human readable serialization of " + checkAnnotation.getValues().get(0) + 
                    " was \"" + serialized + 
                    "\" but does not match expected output \"" + 
                    expected + 
                    "\"!";
                System.out.println(assertMessage);
            Assert.fail(assertMessage);
        }
    }    
    
    
    private StringAnnotation getCheckAnnotation(TestEntity entity) {
    	if (entity.getEffect() != null) {
    		return (StringAnnotation) entity.getEffect().getAnnotation(KEXTTestRunner.KEXT_CHECK_ANNOTATION);
    	} else {
    		return (StringAnnotation) entity.getExpression().getAnnotation(KEXTTestRunner.KEXT_CHECK_ANNOTATION);
    	}
    }
    
    private StringAnnotation getHumanReadableAnnotation(TestEntity entity) {
        if (entity.getEffect() != null) {
                return (StringAnnotation) entity.getEffect().getAnnotation(KEXT_HUMANREADABLE_ANNOTATION);
        } else {
                return (StringAnnotation) entity.getExpression().getAnnotation(KEXT_HUMANREADABLE_ANNOTATION);
        }
    }
    

}
