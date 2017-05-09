/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.semantics.test.common.repository

import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner
import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target
import java.util.List
import org.junit.Test
import org.junit.runner.Runner
import org.junit.runner.notification.Failure
import org.junit.runner.notification.RunListener
import org.junit.runner.notification.RunNotifier
import org.junit.runners.BlockJUnit4ClassRunner
import org.junit.runners.Suite
import org.junit.runners.model.FrameworkMethod
import org.junit.runners.model.InitializationError
import org.junit.runners.model.Statement

import static extension de.cau.cs.kieler.semantics.test.common.repository.TestModelDataUtil.*
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

import static org.junit.Assert.*
import org.junit.runner.Description
import java.util.concurrent.ConcurrentHashMap

/**
 * The {@link Runner} for {@link IModelsRepositoryTest}.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class ModelsRepositoryTestRunner extends Suite {
    
    /**
     * Instructs the {@link ModelsRepositoryTestRunner} to stop testing with the current model and
     * proceed with the next one in the provided model base if the annotated test fails.<br>
     * This way, "pre-condition" tests may be formulated.<br>
     * <br>
     * In more detail, a failing test method annotated with <samp>@StopOnFailure</samp> makes the
     * {@link SingleModelTestRunner} to ignore the remaining tests. Thereafter the current
     * {@link ModelsRepositoryTestRunner} instance proceeds with its next {@link SingleModelTestRunner}
     * child that restarts the test procedure with its assigned model.
     * 
     * @see ModelCollectionTestRunner
     * 
     * @author chsch
     */
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    annotation StopOnFailure {}
    
    // -----------------------------------------------------------------------------------------------------------------
    
    private val IModelsRepositoryTest<?> test;
    
    /**
     * A modifiable list of the runners / children of this {@link Suite}.
     * 
     * Since JUnit 4.12 the runners field in {@link Suite} is changed to an unmodifiable list in the constructor.
     * As workaround, the modifiable instance is preserve manually in this field and returned in {@link getChildren}.
     * 
     * @author aas
     */
    private val List<Runner> modifiableRunners = newLinkedList
    
    /**
     * Returns a modifiable list of objects that define the children of this Runner.
     * 
     * Since JUnit 4.12 the runners field in {@link Suite} is changed to an unmodifiable list in the constructor.
     * As workaround, the modifiable instance is preserve manually and returned in this method.
     * 
     * @author aas
     */
    override List<Runner> getChildren() {
        return modifiableRunners;
    }
    
    /**
     * Constructor.
     * 
     * @param clazz the tests class
     * @throws Throwable if something unexpeced happens
     */
    new (Class<?> clazz) throws Throwable {
        super(clazz, newLinkedList)
        
        // Check test class
        if (!IModelsRepositoryTest.isAssignableFrom(testClass.javaClass)) {
            throw new IllegalArgumentException("Test classes used with this runner must implement the IModelsRepositoryTest interface!")
        }
        try {
            test = testClass.onlyConstructor.newInstance as IModelsRepositoryTest<?>
        } catch (Exception e) {
            throw new Exception("Constructor of test class " + getTestClass().getName()
                        + " must not have any parameters", e)
        }
        
        // Filter models and create tests
        for (testModelData : ModelsRepository.models.filter[test.filter(it)].sortWith(test)) {
            modifiableRunners.add(new SingleModelTestRunner(test, testModelData))
        }
    }
    
    
    // -----------------------------------------------------------------------------------------------------------------
   
    /**
     * A specialized {@link BlockJUnit4ClassRunner} running tests on a given model element. 
     *
     * @author als, chsch
     */
    protected static class SingleModelTestRunner extends BlockJUnit4ClassRunner {
        
        val methodDescriptions = new ConcurrentHashMap<FrameworkMethod, Description>()
        val IModelsRepositoryTest<?> test
        val TestModelData modelData
        
        /**
         * Constructor.
         * 
         * @param <T>
         *            the type of the current model
         * @param test
         *            the test class
         * @param model
         *            the model to perform the tests on
         * @throws InitializationError
         *             if the super implementation throws such an error
         */
        new(IModelsRepositoryTest<?> test, TestModelData modelData) throws InitializationError {
            super(test.class)
            this.test = test
            this.modelData = modelData
        }

        // --------------------------------------------------------------------

        /**
         * Adds to {@code errors} for each method annotated with {@code @Test}that
         * is not a public, void instance method with zero arguments or one
         * Object/(a sub type of) EObject argument.
         * 
         * @param errors the error collecting list
         */
        override validateTestMethods(List<Throwable> errors) {
            val methods = getTestClass().getAnnotatedMethods(Test)
            val test = testClass.onlyConstructor.newInstance as IModelsRepositoryTest<?>

            for (testMethod : methods) {
                testMethod.validatePublicVoid(false, errors)
                val method = testMethod.getMethod()
                val methodParams = method.getParameterTypes()
                if (!(
                    (methodParams.length == 2 && // Either two parameters
                    methodParams.get(0).isAssignableFrom(test.modelType) &&
                    TestModelData.isAssignableFrom(methodParams.get(1))) ||
                    (methodParams.length == 1 && // Or one
                    methodParams.get(0).isAssignableFrom(test.modelType)))) {
                    errors.add(new Exception("Method " + testMethod.getMethod().getName()
                            + " should have either one (the generic type T of the test model instance)"
                            + " or two parameter (the test model instance and the TestModelData)"))
                }
            }
        }

        
        // --------------------------------------------------------------------
        
        var boolean methodStopsExecution = false
        var boolean ignoreRemainingTests = false
        
        /**
         * This listener is registered in {@link #childrenInvoker}. In case it notices a test
         * failure it configures its parent {@link SingleModelTestRunner} to ignore its remaining
         * tests, see {@link #runChild(FrameworkMethod, RunNotifier)}.
         */
        private RunListener listener = new RunListener() {

            /**
             * Called when an atomic test fails.
             * 
             * @param failure
             *            describes the test that failed and the exception that was thrown
             */
            override testFailure(Failure failure) throws Exception {
                ignoreRemainingTests = methodStopsExecution
            }
        }


        /**
         * {@inheritDoc}.<br>
         * <br>
         * The returned result iterates on this' children and calls
         * {@link #runChild(FrameworkMethod, RunNotifier)} for each.
         */
        override Statement childrenInvoker(RunNotifier notifier) {
            notifier.addListener(listener)
            return super.childrenInvoker(notifier)
        }
        
        
        /**
         * {@inheritDoc}
         */
        override runChild(FrameworkMethod method, RunNotifier notifier) {
            if (ignoreRemainingTests) {
                notifier.fireTestIgnored(this.describeChild(method))
            } else {
                methodStopsExecution = method.getAnnotation(StopOnFailure) != null
                super.runChild(method, notifier)
            }
        }

        // --------------------------------------------------------------------

        /**
         * Returns a {@link Statement} that invokes {@code method} on {@code test} with parameter
         * {@code model} if required.
         * 
         * @param method
         *            the test method to be invoked
         * @param testClassInstance
         *            the testClassInstance to invoke the test method on
         * @return the {@link Statement} wrapping the test method call
         */
        override Statement methodInvoker(FrameworkMethod method, Object testClassInstance) {
            return new InvokeMethodOnModel(method, testClassInstance as IModelsRepositoryTest<?>, test, modelData)
        }
        
        // --------------------------------------------------------------------

        /**
         * @return the name
         */
        override String getName() {
            return modelData.name
        }
        
        /**
         * @return a unique ID
         */
        def String getID() {
            val builder = new StringBuilder()
            builder.append(modelData.repositoryPath.fileName)
            builder.append("-")
            builder.append(modelData.modelPath)
            if (modelData.tracePath != null) {
                builder.append("-")
                builder.append(modelData.tracePath)
            }
            return builder.toString
        }
        
        /**
         * @return the description
         */        
        override Description getDescription() {
            val superDescription = super.description
            val description = Description.createSuiteDescription(name, ID, runnerAnnotations)
            superDescription.children.forEach[description.addChild(it)]
            return description
        }
        
        /**
         * @return the description
         */        
        override Description describeChild(FrameworkMethod method) {
            var description = methodDescriptions.get(method);
    
            if (description == null) {
                description = Description.createTestDescription(testClass.javaClass.name, method.name, method.name + "@" + ID);
                methodDescriptions.putIfAbsent(method, description);
            }
    
            return description;
        }
    }
    
    
    // ----------------------------------------------------------------------------------------------------------------


    /**
     * A custom {@link Statement} encapsulating the invocation of a test method executed by the
     * JUnit {@link Runner}. It enables the invocation of test methods expecting the model element
     * as a (exactly one) parameter.
     * 
     * @author als, chsch
     */
    @FinalFieldsConstructor
    protected static class InvokeMethodOnModel extends Statement {
        val FrameworkMethod method
        val IModelsRepositoryTest<?> testInstance
        val IModelsRepositoryTest<?> loadingInstance
        val TestModelData modelData

        /**
         * {@inheritDoc}
         */
        override evaluate() throws Throwable {
            val model = loadingInstance.loadModel(modelData)
            assertNotNull("Parsed input model is null", model)
            if (method.method.parameterCount == 1) {
                method.invokeExplosively(testInstance, model)
            } else {
                method.invokeExplosively(testInstance, model, modelData)
            }
        }
    }    
}

