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
package de.cau.cs.kieler.sim.kiem.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;
import org.junit.runners.model.TestClass;

/**
 * @author cmot
 * 
 */
public class KiemTestRunner extends Parameterized {

    /**
     * Instantiates a new kiem test runner.
     *
     * @param klass the klass
     * @throws Throwable the throwable
     */
    public KiemTestRunner(final Class<?> klass) throws Throwable {
        super(klass);

        // Force initialization of model/eso files (and also of KIEM)
        Constructor<?> constructor = getTestClass().getJavaClass().getConstructor(IPath.class);
        Object constructorObject = constructor.newInstance(new Path(""));
        System.out.println(constructorObject.getClass().toString());
        if (constructorObject instanceof KiemAutomatedJUnitTest) {
            // Do the actual initialization.
            ((KiemAutomatedJUnitTest) constructorObject).kiemAutomatedJUnitTestInitialization();
        }

        // Manually rebuild the list that is originally done by super(klass)
        // but now after all model/ESO files have been initialized.
        List<HashMap<String,Object>> parametersList = getParametersList(getTestClass());
        
        for (Entry<String, Object> entry : parametersList.get(0).entrySet()) {
            String hashMapKey = entry.getKey();
            Object hashMapObject = entry.getValue();
            this.getChildren().add(
                    new OurTestClassRunnerForParameters(getTestClass().getJavaClass(),
                            parametersList, hashMapKey));
        }
        
//        for (int i = 0; i < parametersList.size(); i++)
//            this.getChildren().add(
//                    new OurTestClassRunnerForParameters(getTestClass().getJavaClass(),
//                            parametersList, i));

    }

    private class OurTestClassRunnerForParameters extends BlockJUnit4ClassRunner {
        private final String fParameterKey;

        private final List<HashMap<String,Object>> fParameterList;

        OurTestClassRunnerForParameters(Class<?> type, List<HashMap<String,Object>> parameterList, String key)
                throws InitializationError {
            super(type);
            fParameterList = parameterList;
            fParameterKey = key;
        }

        @Override
        public Object createTest() throws Exception {
            // Constructor[] constructors = getTestClass().getClass().getConstructors();
            return getTestClass().getOnlyConstructor().newInstance(computeParams());
        }

        private Object[] computeParams() throws Exception {
            try {
                Object[] objectArray = new Object[1];
                Object hashMapObject = fParameterList.get(0).get(fParameterKey);
                objectArray[0] = hashMapObject;
                return objectArray;
//                List<Object[]> objectArrayList = new LinkedList<Object[]>();
//                for (Entry<String, Object> entry : fParameterList.get(0).entrySet()) {
//                    Object[] objectArray = new Object[1];
//                    Object hashMapObject = entry.getValue();
//                    objectArray[0] = hashMapObject;
//                    objectArrayList.add(objectArray);
//                }
//                return objectArrayList;
            } catch (ClassCastException e) {
                throw new Exception(
                        String.format("%s.%s() must return a Collection of arrays.", getTestClass()
                                .getName() /* , getParametersMethod(getTestClass()).getName() */));
            }
        }

        @Override
        protected String getName() {
            HashMap<String,Object> objectHashMap = fParameterList.get(0);
            //Object[] objectArray = fParameterList.get(fParameterSetNumber);
            IPath iPath = (IPath) objectHashMap.get(fParameterKey);
            String name = iPath.toString();
            System.out.println(name);
            return name;
        }

        @Override
        protected String testName(final FrameworkMethod method) {
            return getName();
        }

        @Override
        protected void validateConstructor(List<Throwable> errors) {
            validateOnlyOneConstructor(errors);
        }

        @Override
        protected Statement classBlock(RunNotifier notifier) {
            return childrenInvoker(notifier);
        }
    }

    @SuppressWarnings("unchecked")
    private List<HashMap<String,Object>> getParametersList(TestClass klass) throws Throwable {
        return (List<HashMap<String,Object>>) getParametersMethod(klass).invokeExplosively(null);
    }

    private FrameworkMethod getParametersMethod(TestClass testClass) throws Exception {
        List<FrameworkMethod> methods = testClass.getAnnotatedMethods(Parameters.class);
        for (FrameworkMethod each : methods) {
            int modifiers = each.getMethod().getModifiers();
            if (Modifier.isStatic(modifiers) && Modifier.isPublic(modifiers))
                return each;
        }

        throw new Exception("No public static parameters method on class " + testClass.getName());
    }

}
