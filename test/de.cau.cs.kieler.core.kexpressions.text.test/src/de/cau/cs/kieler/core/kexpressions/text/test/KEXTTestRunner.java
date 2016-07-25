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
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;
import org.osgi.framework.Bundle;

import com.google.common.collect.Lists;

import de.cau.cs.kieler.core.annotations.Annotation;
import de.cau.cs.kieler.core.annotations.StringAnnotation;
import de.cau.cs.kieler.core.kexpressions.text.kext.KEXTScope;
import de.cau.cs.kieler.core.kexpressions.text.kext.Kext;
import de.cau.cs.kieler.core.kexpressions.text.kext.TestEntity;
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner;
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.StopOnFailure;

/**
 * @author ssm
 * @kieler.design 2015-06-09 proposed 
 * @kieler.rating 2015-06-09 yellow proposed
 * 
 */
public class KEXTTestRunner extends ModelCollectionTestRunner {
	
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface RequiredAnnotation {
    	String value() default "";
    }	

    public static String KEXT_CHECK_ANNOTATION = "check";
    
    public static String KEXT_EXPECT_ANNOTATION = "expect";

    /**
     * @param clazz
     * @throws Throwable
     */
    public KEXTTestRunner(Class<?> clazz) throws Throwable {
        super(clazz);
    }

    protected void runTestRunnerForModel(Object object, String modelName) throws Throwable {

        String line;

        if (!(object instanceof Kext)) {
            throw new IllegalArgumentException(
                    "The KEXT test runner expects a KEXT object as input.");
        }

        FrameworkMethod resourceSetMethod = getAnnotatedMethod(getTestClass(), ResourceSet.class);
        String bundleId = getClassAnnotation(BundleId.class).value();
        Bundle bundle = Platform.getBundle(bundleId);
        InputStream is =
                FileLocator.openStream(bundle,
                        new Path(modelName.substring(0, modelName.length() - 1)), true);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        List<String> textFile = Lists.newArrayList();
        while ((line = br.readLine()) != null) {
            textFile.add(line.trim());
        }
        
        runTestRunnerForScope(((Kext) object).getScopes().get(0), object, textFile);
    }
    
    protected void runTestRunnerForScope(KEXTScope scope, Object object, List<String> textFile) throws Throwable {
		for (TestEntity entity : scope.getEntities()) {
			StringAnnotation checkAnnotation = null;
			if (entity.getEffect() != null) {
			    if (entity.getEffect().getAnnotation(KEXT_CHECK_ANNOTATION) instanceof StringAnnotation) {
			        checkAnnotation = (StringAnnotation) entity.getEffect().getAnnotation(KEXT_CHECK_ANNOTATION);
			    } else {
			        throw new Exception("Cannot cast annotation to string annotation: " + 
			                entity.getEffect().getAnnotation(KEXT_CHECK_ANNOTATION).toString() + 
			                " of effect " + 
			                entity.getEffect().toString()); 
			    }
			} else {
                if (entity.getExpression().getAnnotation(KEXT_CHECK_ANNOTATION) instanceof StringAnnotation) {
                    checkAnnotation = (StringAnnotation) entity.getExpression().getAnnotation(KEXT_CHECK_ANNOTATION);
                } else {
                    throw new Exception("Cannot cast annotation to string annotation: " + 
                            entity.getExpression().getAnnotation(KEXT_CHECK_ANNOTATION).toString() + 
                            " of expression " + 
                            entity.getExpression().toString()); 
                }
			}
			if (checkAnnotation != null && checkAnnotation.getValues().size() > 0) {
				runTestRunnerForObject(entity, checkAnnotation.getValues().get(0), (EObject) object, textFile);
			}
		}
		for (KEXTScope subScope : scope.getScopes()) {
			runTestRunnerForScope(subScope, object, textFile);
		}
    }
	
    protected void runTestRunnerForObject(Object object, String objectName, EObject rootObject,
            Object data) throws Throwable {
        @SuppressWarnings("unchecked")
        String expectedLine = getExpectedOutput(object, objectName, (ArrayList<String>) data);

        this.getChildren().add(
                new KEXTModelTestRunner(getTestClass().getJavaClass(), object, objectName, rootObject, expectedLine));
    }
    
    private String getExpectedOutput(Object object, String objectName, List<String> textFile) {
    	
    	if (object instanceof TestEntity) {
    		TestEntity entity = (TestEntity) object;
    		StringAnnotation expectAnnotation;
        	if (entity.getEffect() != null) {
        		expectAnnotation = (StringAnnotation) entity.getEffect().getAnnotation(KEXTTestRunner.KEXT_EXPECT_ANNOTATION);
        	} else {
        		expectAnnotation = (StringAnnotation) entity.getExpression().getAnnotation(KEXTTestRunner.KEXT_EXPECT_ANNOTATION);
        	}
        	if (expectAnnotation != null) {
        		return expectAnnotation.getValues().get(0);
        	}
    	}
    	
        int lineCount = 0;
        while(lineCount < textFile.size()) {
            String line = textFile.get(lineCount);
            if (line.startsWith("@" + KEXT_CHECK_ANNOTATION)) {
                if (line.contains(objectName)) {
                    while(lineCount < textFile.size()) {
                        lineCount++;
                        if (!(textFile.get(lineCount).startsWith("@"))) {
                            return textFile.get(lineCount);
                        }
                    }
                    return null;
                }
            }
            lineCount++;
        }
        
        return null;
    }
    
    protected class KEXTModelTestRunner extends SingleModelTestRunner {
        
        protected EObject rootModel;
        protected Object data;
        
        public <T,R extends Object> KEXTModelTestRunner(final Class<?> clazz,
                final T theModel, final String theModelName, final EObject rootModel, final R data) throws InitializationError {
            super(clazz, theModel, theModelName);
            this.rootModel = rootModel;
            this.data = data;
        }
        
        protected Statement methodInvoker(final FrameworkMethod method,
                final Object testClassInstance) {
            return new KEXTInvokeMethodOnModel(method, testClassInstance, this.model, this.data);
        }    
        
        protected List<FrameworkMethod> computeTestMethods() {
        	List<FrameworkMethod> testMethods = new ArrayList<FrameworkMethod>(); 
        	for(FrameworkMethod method : getTestClass().getAnnotatedMethods(Test.class)) {
        		RequiredAnnotation requiredAnnotation = method.getAnnotation(RequiredAnnotation.class);
        		boolean methodIsOk = true;
        		if (requiredAnnotation != null) {
        			if (this.model instanceof TestEntity) {
        				List<Annotation> annotations;
        				if (((TestEntity) this.model).getEffect() != null) {
        					annotations = ((TestEntity) this.model).getEffect().getAnnotations();
        				} else {
        					annotations = ((TestEntity) this.model).getExpression().getAnnotations();
        				}
        				methodIsOk = false;
        				for(Annotation annotation : annotations) {
        					if (annotation.getName().equals(requiredAnnotation.value())) {
        						methodIsOk = true;
        					}
        				}
        			}
        		}
        		if (methodIsOk) {
        			testMethods.add(method);
        		}
        	}
        	
            return testMethods;
        }        
        
    }
    
    protected static class KEXTInvokeMethodOnModel extends Statement {

        private FrameworkMethod method = null;
        private Object testClassInstance = null;
        private Object model = null;
        private Object data = null;
        
        public KEXTInvokeMethodOnModel(final FrameworkMethod theMethod, final Object theTestClassInstance,
                final Object theModel, final Object theData) {
            this.method = theMethod;
            this.testClassInstance = theTestClassInstance;
            
            final Class<?>[] methodParams = theMethod.getMethod().getParameterTypes();
            
            if (methodParams.length > 0
                    && (methodParams[0].equals(Object.class) || (methodParams[0]
                            .isAssignableFrom(theModel.getClass())))) {
                this.model = theModel;
                if (methodParams.length > 1
                        && (methodParams[1].isAssignableFrom(theData.getClass()))) {
                    this.data = theData;
                } else {
                    this.data = null;
                }
            } else {
                this.model = null;
            }
        }
        
        /**
         * {@inheritDoc}
         */
        @Override
        public void evaluate() throws Throwable {
            if (model == null) {
                method.invokeExplosively(testClassInstance);
            } else if (data == null) {
                method.invokeExplosively(testClassInstance, this.model);
            } else {
                method.invokeExplosively(testClassInstance, this.model, this.data);
            }
        }
    }    

}
