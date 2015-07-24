/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.semantics.test.common.runners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.Parameterized;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;
import org.junit.runners.model.TestClass;

/**
 * This is a specialization and an extension of the {@link:Parameterized} test runner class. It
 * requires the implementing test class to provide a method, e.g., getParameters(). tagged with
 * '@Parameters' that returns a List of Object-Arrays (List<Object[]>). This List must contain the
 * parameters of the constructor for each test case.<br>
 * <br>
 * The implementing test class must contain exactly one constructor. The constructor is called for
 * each test case with the parameters specified by the Object-Array. If there is just one parameter
 * this corresponds to an array with one Object element.<br>
 * <br>
 * There is an initialize() method that is invoked with an instantiated object of the test class
 * with NULL-dummy-parameters. Be prepared to catch this instantiation in the constructor. This
 * enables the constructor to prepare some initialization data BEFORE the static method for getting
 * the parameters, e.g. getParameters(), is called.<br>
 * <br>
 * This is an abstract class that should be extended by a specialized test runner class, e.g.
 * SpecializedTestRunner. Parameterized test classes then use this specialized test runner:
 * '@RunWith(SpecializedTestRunner.class)'.<br>
 * 
 * @author cmot, chsch
 * @kieler.rating 2012-07-02 yellow KI-17 wah, chsch
 * 
 */
public abstract class KielerTestRunner extends Parameterized {
    
    List<Runner> privateRunners = new ArrayList<Runner>();

    /**
     * Initialize the test run. Do some initialization on an instance of the TestClass. The (only)
     * constructor used for testing will not get any useful but empty values as parameters.
     * 
     * @param classObject
     *            the class object
     */
    public abstract void initialize(Object classObject);

    // -------------------------------------------------------------------------

    /**
     * A computed name for runner must be provided here. For computation the list of parameter
     * objects for the test and the parameter index is provided.
     * 
     * @param parameterObjectList
     *            the parameter object list
     * @param parameterIndex
     *            the parameter index
     * @return the name
     */
    public abstract String getRunnerName(List<Object[]> parameterObjectList, int parameterIndex);

    // -------------------------------------------------------------------------

    /**
     * A computed name for test must be provided here. For computation the list of parameter objects
     * for the test and the parameter index is provided.
     * 
     * @param parameterObjectList
     *            the parameter object list
     * @param parameterIndex
     *            the parameter index
     * @param method
     *            the method
     * @return the name
     */
    public abstract String getTestName(List<Object[]> parameterObjectList, int parameterIndex,
            FrameworkMethod method);

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new KielerTestRunner. It further does the initialization with a first instance
     * of the class to test (parameter values given to the constructor are NULL) and afterwards
     * calls the method for getting the parameters for the parameterized test run.
     * 
     * @param clazz
     *            the test class
     * 
     * @throws Throwable
     *             if the test doesn't comply with the validity requirements.
     */
    public KielerTestRunner(final Class<?> clazz) throws Throwable {
        super(clazz);

        // Do some (optional) initialization
        Constructor<?>[] constructorArray = getTestClass().getJavaClass().getConstructors();
        if (constructorArray.length != 1) {
            throw new Exception("Class " + getTestClass().getJavaClass().getName()
                    + " is only allowed to have one constructor.");
        }
        // Get the one constructor
        Constructor<?> constructor = constructorArray[0];
        // Construct NULL-dummy-parameters according to the numer of parameters of the constructor
        Object[] parameterTypesArray = constructor.getParameterTypes();
        Object[] paramObjects = new Object[parameterTypesArray.length];
        // Call the constructor with these dummy parameters
        Object classObject = constructor.newInstance(paramObjects);
        // Call the initialization code with the new instance
        initialize(classObject);

        // Manually rebuild the list that is originally done by super(clazz)
        // but now after all initialization (initialize()) has been done.
        List<Object[]> parametersList = getParametersList(getTestClass());
        for (int parameterNumber = 0; parameterNumber < parametersList.size(); parameterNumber++) {
            KielerTestClassRunnerForParameters runner = new KielerTestClassRunnerForParameters(getTestClass().getJavaClass(),
                    parametersList, parameterNumber, this);
            //this.getChildren().add(runner);
            privateRunners.add(runner);
        }

    }

    @Override
    protected List<Runner> getChildren() {
        return privateRunners;
    }
    
    // -------------------------------------------------------------------------

    /**
     * Gets the parameters list.
     * 
     * @param klass
     *            the klass
     * @return the parameters list
     * @throws Throwable
     *             the throwable
     */
    @SuppressWarnings("unchecked")
    protected List<Object[]> getParametersList(final TestClass klass) throws Throwable {
        return (List<Object[]>) getParametersMethod(klass).invokeExplosively(null);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the parameters method.
     * 
     * @param testClass
     *            the test class
     * @return the parameters method
     * @throws Exception
     *             the exception
     */
    protected FrameworkMethod getParametersMethod(final TestClass testClass) throws Exception {
        List<FrameworkMethod> methods = testClass.getAnnotatedMethods(Parameters.class);
        for (FrameworkMethod each : methods) {
            int modifiers = each.getMethod().getModifiers();
            if (Modifier.isStatic(modifiers) && Modifier.isPublic(modifiers)) {
                return each;
            }
        }

        throw new Exception("No public static parameters method on class " + testClass.getName());
    }

    // -------------------------------------------------------------------------

    /**
     * The internal class for the specific TestParameters that call the getName() features of the
     * specialized TestRunner. This is an internal class for book keeping the test parameters.
     */
    protected class KielerTestClassRunnerForParameters extends BlockJUnit4ClassRunner {

        /** The KielerTestRunner to refer to for computing names for the runner and the test. */
        private final KielerTestRunner kielerTestRunner;

        /** The current parameter number. */
        private final int parameterNumber;

        /** The whole parameter list. */
        private final List<Object[]> parameterList;

        // --------------------------------------------------------------------

        /**
         * Instantiates a new kieler test class runner for parameters.
         * 
         * @param type
         *            the type
         * @param parameterList
         *            the parameter list
         * @param parameterNumber
         *            the parameter number
         * @param kielerTestRunner
         *            the kieler test runner
         * @throws InitializationError
         *             the initialization error
         */
        KielerTestClassRunnerForParameters(final Class<?> type, final List<Object[]> parameterList,
                final int parameterNumber, final KielerTestRunner kielerTestRunner)
                throws InitializationError {
            super(type);
            this.parameterList = parameterList;
            this.parameterNumber = parameterNumber;
            this.kielerTestRunner = kielerTestRunner;
        }

        // --------------------------------------------------------------------

        /**
         * {@inheritDoc}
         */
        @Override
        public Object createTest() throws Exception {
            return getTestClass().getOnlyConstructor().newInstance(computeParams());
        }

        // --------------------------------------------------------------------

        /**
         * Compute the parameters. This method must return an Object array. This is the array
         * representing the number of parameters provided for the constructor call for each test
         * instance of the test class.
         * 
         * @return the object[]
         * @throws Exception
         *             the exception
         */
        private Object[] computeParams() throws Exception {
            try {
                return parameterList.get(parameterNumber);
            } catch (ClassCastException e) {
                throw new Exception(
                        String.format("%s.%s() must return a Collection of arrays.", getTestClass()
                                .getName() /* , getParametersMethod(getTestClass()).getName() */));
            }
        }

        // --------------------------------------------------------------------

        /**
         * The name of the runner is computed by the KielerTestRunner implementation.
         * 
         * @return the name
         */
        @Override
        protected String getName() {
            // Let the name being computed by the KielerTestRunner implementation
            return kielerTestRunner.getRunnerName(parameterList, parameterNumber);
        }

        // --------------------------------------------------------------------

        /**
         * The name of the test is computed by the KielerTestRunner implementation.
         * 
         * @param method
         *            the method
         * @return the string
         */
        @Override
        protected String testName(final FrameworkMethod method) {
            // Let the name being computed by the KielerTestRunner implementation
            return kielerTestRunner.getTestName(parameterList, parameterNumber, method);
        }

        // --------------------------------------------------------------------

        /**
         * {@inheritDoc}
         */
        @Override
        protected void validateConstructor(final List<Throwable> errors) {
            validateOnlyOneConstructor(errors);
        }

        // --------------------------------------------------------------------

        /**
         * {@inheritDoc}
         */
        @Override
        protected Statement classBlock(final RunNotifier notifier) {
            return childrenInvoker(notifier);
        }

        // --------------------------------------------------------------------
    }

    // -------------------------------------------------------------------------
}
