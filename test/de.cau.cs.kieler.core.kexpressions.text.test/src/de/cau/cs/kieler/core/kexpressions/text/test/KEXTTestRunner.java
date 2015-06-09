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

import de.cau.cs.kieler.core.annotations.StringAnnotation;
import de.cau.cs.kieler.core.kexpressions.keffects.Effect;
import de.cau.cs.kieler.core.kexpressions.text.kext.Kext;
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner;

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

    protected void runTestRunnerForModel(Object object, String modelName) throws Throwable {
        if (!(object instanceof Kext)) {
            throw new IllegalArgumentException("The KEXT test runner expects a KEXT object as input.");
        }
        
        for(Effect effect : ((Kext)object).getEffects()) {
            StringAnnotation checkAnnotation = (StringAnnotation) effect.getAnnotation(KEXT_CHECK_ANNOTATION);
            if (checkAnnotation != null && checkAnnotation.getValues().size() > 0) {
                runTestRunnerForObject(effect, checkAnnotation.getValues().get(0), object);
            }
        }
    }
    
    protected void runTestRunnerForObject(Object object, String objectName, Object rootObject) throws Throwable {
        this.getChildren().add(
                new SingleModelTestRunner(getTestClass().getJavaClass(), object, objectName));
    }

}
