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

import de.cau.cs.kieler.core.annotations.Annotation;
import de.cau.cs.kieler.core.annotations.AnnotationsFactory;
import de.cau.cs.kieler.core.annotations.StringAnnotation;
import de.cau.cs.kieler.core.kexpressions.OperatorExpression;
import de.cau.cs.kieler.core.kexpressions.keffects.Assignment;
import de.cau.cs.kieler.core.kexpressions.keffects.Effect;
import de.cau.cs.kieler.core.kexpressions.text.KEXTStandaloneSetup;
import de.cau.cs.kieler.core.kexpressions.text.extensions.KEXTSerializeExtensions;
import de.cau.cs.kieler.core.kexpressions.text.kext.AnnotatedExpression;
import de.cau.cs.kieler.core.kexpressions.text.kext.TestEntity;
import de.cau.cs.kieler.core.kexpressions.text.services.KEXTGrammarAccess;
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
    public static String KEXT_STRICT_ANNOTATION = "strict";
    
    public static String KEXT_EXPRESSION_KEYWORD = "expression";

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
        if (entity.getExpression() != null && expected.startsWith(KEXT_EXPRESSION_KEYWORD)) {
            expected = expected.substring(11); 
        }
        
        String serialized = SE.serialize(entity).toString();
        
        StringAnnotation strictAnnotation = getAnnotation(entity, KEXT_STRICT_ANNOTATION);
        if (strictAnnotation != null) {
            if (strictAnnotation.getValues().size() > 0) {
                expected = strictAnnotation.getValues().get(0);
            }
        } else {
            if (entity.getEffect() != null) {
                Effect effect = entity.getEffect();
                if (effect instanceof Assignment) {
                    if (((Assignment) effect).getExpression() instanceof OperatorExpression) {
                        String assignmentPart = SE.serializeAssignment((Assignment) effect, "").toString();
                        int api = assignmentPart.length();
                        String newExpected = expected.substring(0, api); 
                        newExpected = newExpected + "(" + expected.substring(api, expected.length()) + ")";
                        expected = newExpected;
                    }
                }
            } else if (entity.getExpression() != null) {
                if (entity.getExpression() instanceof AnnotatedExpression) {
                    if (((AnnotatedExpression) entity.getExpression()).getExpression() instanceof OperatorExpression) {
                        expected = "(" + expected + ")";
                    }
                }
            }
        }
        
        if (!serialized.equals(expected)) {
            StringAnnotation checkAnnotation = getAnnotation(entity, KEXTTestRunner.KEXT_CHECK_ANNOTATION);
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
        if (entity.getExpression() != null && expected.startsWith(KEXT_EXPRESSION_KEYWORD)) {
                expected = expected.substring(11); 
        }
        
        String serialized = SE.serializeHR(entity).toString();
        
        StringAnnotation humanReadableAnnotation = getAnnotation(entity, KEXT_HUMANREADABLE_ANNOTATION);
        if (humanReadableAnnotation != null) {
            expected = humanReadableAnnotation.getValues().get(0);
        }
        
        if (!serialized.equals(expected)) {
                StringAnnotation checkAnnotation = getAnnotation(entity, KEXTTestRunner.KEXT_CHECK_ANNOTATION);
                String assertMessage = "Human readable serialization of " + checkAnnotation.getValues().get(0) + 
                    " was \"" + serialized + 
                    "\" but does not match expected output \"" + 
                    expected + 
                    "\"!";
                System.out.println(assertMessage);
            Assert.fail(assertMessage);
        }
    }    
    
    
    private StringAnnotation getAnnotation(TestEntity entity, String name) {
        Annotation annotation = null;
    	if (entity.getEffect() != null) {
    	    annotation = entity.getEffect().getAnnotation(name);
    	} else {
    	    annotation =  entity.getExpression().getAnnotation(name);
    	}
        if (annotation instanceof StringAnnotation) {
            return (StringAnnotation) annotation; 
        } else if (annotation != null) {
            StringAnnotation newStringAnnotation = AnnotationsFactory.eINSTANCE.createStringAnnotation();
            newStringAnnotation.setName(annotation.getName());
            return newStringAnnotation;
        }
        return null;
    }
    
 

}
