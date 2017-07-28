package de.cau.cs.kieler.kexpressions.text.test

/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time & Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

import com.google.inject.Guice
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.Annotation
import de.cau.cs.kieler.annotations.AnnotationsFactory
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.Emission
import de.cau.cs.kieler.kexpressions.kext.AnnotatedExpression
import de.cau.cs.kieler.kexpressions.kext.KExtStandaloneSetup
import de.cau.cs.kieler.kexpressions.kext.TestEntity
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtSerializeExtensions
import de.cau.cs.kieler.test.common.runners.ModelCollectionTestRunner
import de.cau.cs.kieler.test.common.runners.ModelCollectionTestRunner.BundleId
import de.cau.cs.kieler.test.common.runners.ModelCollectionTestRunner.ModelFilter
import de.cau.cs.kieler.test.common.runners.ModelCollectionTestRunner.ModelPath
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.resource.XtextResourceSet
import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters

/**
 * JUnit Test Case for the KEXT
 * 
 * @author ssm
 * @kieler.design 2015-06-09 proposed 
 * @kieler.rating 2015-06-09 yellow proposed
 * 
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(typeof(KExtTestRunner))
@BundleId("de.cau.cs.kieler.kexpressions.text.test")
@ModelPath("tests/")
@ModelFilter("*.kext")
public class KExtTest {
	
	extension AnnotationsExtensions = AE
    
    public static val String KEXT_HUMANREADABLE_ANNOTATION = "readable"  
    public static val String KEXT_STRICT_ANNOTATION = "strict"
    public static val String KEXT_CHECKALIAS_ANNOTATION = "aliasCheck"
    public static val String KEXT_ALIAS_ANNOTATION = "alias"
    public static val String KEXT_EXPRESSION_KEYWORD = "expression"
    
    private static val KExtSerializeExtensions SE = Guice.createInjector().getInstance(typeof(KExtSerializeExtensions))
    private static val AnnotationsExtensions AE = Guice.createInjector().getInstance(typeof(AnnotationsExtensions))

    /**
     * Provides a {@link ResourceSet} in order to load the models properly.
     * 
     * @return the required {@link ResourceSet}
     */
    @ModelCollectionTestRunner.ResourceSet
    public static def ResourceSet getResourceSet() {
        return new KExtStandaloneSetup().createInjectorAndDoEMFRegistration().getInstance(typeof(XtextResourceSet))
    }
    
    @Test
    public def void serialize(EObject eObject, String expectedLine) {
        val entity = eObject as TestEntity
        var expected = expectedLine
        if (entity.getExpression() != null && expected.startsWith(KEXT_EXPRESSION_KEYWORD)) {
            expected = expected.substring(11); 
        }
        
        val serialized = SE.serialize(entity).toString();
        
        val StringAnnotation strictAnnotation = getAnnotation(entity, KEXT_STRICT_ANNOTATION);
        if (strictAnnotation != null) {
            if (strictAnnotation.getValues().size() > 0) {
                expected = strictAnnotation.getValues().get(0);
            }
        } else {
            if (entity.getEffect() != null) {
                val effect = entity.getEffect();
                if (effect instanceof Assignment) {
                    if (effect.getExpression() instanceof OperatorExpression) {
                        val assignmentPart = SE.serializeAssignment(effect, "").toString();
                        val int api = assignmentPart.length();
                        var String newExpected = expected.substring(0, api); 
                        newExpected = newExpected + "(" + expected.substring(api, expected.length()) + ")";
                        expected = newExpected;
                    }
                }
            } else if (entity.getExpression() != null) {
                if (entity.getExpression() instanceof AnnotatedExpression) {
                    if (entity.getExpression().getExpression() instanceof OperatorExpression) {
                        expected = "(" + expected + ")";
                    }
                }
            }
        }
        
        if (!serialized.equals(expected)) {
            val StringAnnotation checkAnnotation = getAnnotation(entity, KExtTestRunner.KEXT_CHECK_ANNOTATION);
        	failedAssertion("Serialization of " + checkAnnotation.getValues().get(0) + 
                    " was \"" + serialized + 
                    "\" but does not match expected output \"" + 
                    expected + 
                    "\"!")
        }
    }
    
    @Test
    @KExtTestRunner.RequiredAnnotation("aliasCheck")
    public def void scoping(EObject eObject, String expectedLine) {
        val entity = eObject as TestEntity
        val annotations = entity.getAnnotations.filter(StringAnnotation)
		for(aliasCheckAnnotation : annotations.filter[name.equals(KEXT_CHECKALIAS_ANNOTATION)]) {
			if (aliasCheckAnnotation.values.size<2) {
				val checkAnnotation = getAnnotation(entity, KExtTestRunner.KEXT_CHECK_ANNOTATION);
        		failedAssertion("Check " + checkAnnotation.values.head + 
                    " is marked with an alias check, but does not has enough parameter!")
			} else {
				entity.validateAlias(aliasCheckAnnotation.values.get(0), aliasCheckAnnotation.values.get(1))
			}
		}
	}
    
	
    @Test
    public def void serializeHumanReadable(EObject eObject, String expectedLine) {
        val entity = eObject as TestEntity;
        var expected = expectedLine
        if (entity.getExpression() != null && expected.startsWith(KEXT_EXPRESSION_KEYWORD)) {
                expected = expected.substring(11); 
        }
        
        val serialized = SE.serializeHR(entity).toString();
        
        val StringAnnotation humanReadableAnnotation = getAnnotation(entity, KEXT_HUMANREADABLE_ANNOTATION);
        if (humanReadableAnnotation != null) {
            expected = humanReadableAnnotation.getValues().get(0);
        }
        
        if (!serialized.equals(expected)) {
                val checkAnnotation = getAnnotation(entity, KExtTestRunner.KEXT_CHECK_ANNOTATION);
                failedAssertion("Human readable serialization of " + checkAnnotation.getValues().get(0) + 
                    " was \"" + serialized + 
                    "\" but does not match expected output \"" + 
                    expected + 
                    "\"!")
        }
    }
    
    
	private def void validateAlias(TestEntity entity, String valuedObjectName, String aliasName) {
		val VOs = <ValuedObject> newArrayList
		
		if (entity.effect != null) {
			val effect = entity.effect
			if (effect instanceof Assignment) {
				VOs += effect.expression.eAllContents.filter(ValuedObjectReference)
					.map[ valuedObject ].filter[ name.equals(valuedObjectName) ].toList
				if (effect.expression instanceof ValuedObjectReference && (effect.expression as ValuedObjectReference).valuedObject.name.equals(valuedObjectName)) {
					VOs += (effect.expression as ValuedObjectReference).valuedObject 
				}
				if (effect.valuedObject.name.equals(valuedObjectName)) {
					VOs += effect.valuedObject
				}
			} else if (effect instanceof Emission) {
				VOs += effect.newValue.eAllContents.filter(ValuedObjectReference)
					.map[ valuedObject ].filter[ name.equals(valuedObjectName) ].toList
				if (effect.newValue instanceof ValuedObjectReference && (effect.newValue as ValuedObjectReference).valuedObject.name.equals(valuedObjectName)) {
					VOs += (effect.newValue as ValuedObjectReference).valuedObject 
				}				
				if (effect.valuedObject.name.equals(valuedObjectName)) {
					VOs += effect.valuedObject
				}
			}
		} else {
			if (entity.expression.expression instanceof ValuedObjectReference && 
				(entity.expression.expression as ValuedObjectReference).valuedObject.name.equals(valuedObjectName)
			) {
				VOs += (entity.expression.expression as ValuedObjectReference).valuedObject 
			}
			VOs += entity.expression.expression.eAllContents.filter(ValuedObjectReference)
				.map[ valuedObject ].filter[ name.equals(valuedObjectName) ].toList
		}
		
		for(valuedObject : VOs) {
			val failedAlias = valuedObject.annotations.filter(StringAnnotation)
				.filter[ name.equals(KEXT_ALIAS_ANNOTATION) ].filter[ values.empty || !values.head.equals(aliasName) ].head
			if (failedAlias != null) {
				val checkAnnotation = getAnnotation(entity, KExtTestRunner.KEXT_CHECK_ANNOTATION);
				failedAssertion("Alias check of check " + checkAnnotation.values.head + 
                    " expected \"" + aliasName + 
                    "\" for valued object \"" + 
                    valuedObjectName + 
                    "\", but the scoper redirected to \"" +
                    failedAlias.values.head +
                    "\"")
			}
		}
	}
        
    
    
    private def StringAnnotation getAnnotation(TestEntity entity, String name) {
        var Annotation annotation = null;
    	if (entity.getEffect() != null) {
    	    annotation = entity.getEffect().getAnnotation(name);
    	} else {
    	    annotation =  entity.getExpression().getAnnotation(name);
    	}
        if (annotation instanceof StringAnnotation) {
            return annotation as StringAnnotation; 
        } else if (annotation != null) {
            val StringAnnotation newStringAnnotation = AnnotationsFactory.eINSTANCE.createStringAnnotation();
            newStringAnnotation.setName(annotation.getName());
            return newStringAnnotation;
        }
        return null;
    }
    
    private def Iterable<Annotation> getAnnotations(TestEntity entity) {
    	if (entity.effect != null) {
    	    return entity.effect.annotations
    	} else {
    	    return entity.expression.annotations;
    	}
	}
	
	private def failedAssertion(String message) {
		System.out.println(message)
        Assert.fail(message)
	}
	
}

