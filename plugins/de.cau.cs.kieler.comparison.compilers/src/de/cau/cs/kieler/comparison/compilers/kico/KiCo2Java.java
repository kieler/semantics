/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.comparison.compilers.kico;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import de.cau.cs.kieler.comparison.core.CompilationException;
import de.cau.cs.kieler.comparison.core.ICompiler;
import de.cau.cs.kieler.comparison.core.ITestcase;
import de.cau.cs.kieler.comparison.core.Language;
import de.cau.cs.kieler.comparison.core.LanguageProperties;

/**
 * @author nfl
 *
 */
public class KiCo2Java implements ICompiler {

    /**
     * {@inheritDoc}
     */
    @Override
    public String getID() {
        return "KiCo - * to Java";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Language getSrcLanguage() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Language getTrgLanguage() {
        return Language.Java;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String compile(String srcFile, String outputPath) throws CompilationException {
        try {
            Thread.sleep((long)(new Random().nextDouble() * 3000));
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return srcFile;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<String> getFeasibleProperties() {
        // TODO getFeasibleProperties 
        Collection<String> ret = new ArrayList<String>();
        ret.add(LanguageProperties.CYCLIC);
        ret.add(LanguageProperties.DETERMINISTIC);
        return ret;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getCompilationOffset() {
        return 0;
    }
}
