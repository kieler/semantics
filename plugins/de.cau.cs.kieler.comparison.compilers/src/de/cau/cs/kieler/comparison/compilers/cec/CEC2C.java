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
package de.cau.cs.kieler.comparison.compilers.cec;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;

import de.cau.cs.kieler.comparison.core.CompilationException;
import de.cau.cs.kieler.comparison.core.ICompiler;
import de.cau.cs.kieler.comparison.core.ITestcase;
import de.cau.cs.kieler.comparison.core.Language;
import de.cau.cs.kieler.comparison.core.LanguageProperties;
import de.cau.cs.kieler.esterel.cec.CEC;

/**
 * @author nfl
 *
 */
public class CEC2C implements ICompiler {

    /**
     * {@inheritDoc}
     */
    @Override
    public String getID() {
        return "CEC - Esterel to C";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Language getSrcLanguage() {
        return Language.Esterel;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Language getTrgLanguage() {
        return Language.C;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String compile(String srcFile, String outputPath) throws CompilationException {

        String ret = "";
        URI src = null;
        File out = null;

        try {
            out = new File(outputPath + "" + srcFile.substring(srcFile.lastIndexOf("/")) + ".c");
            src = new URI(srcFile);
        } catch (URISyntaxException | NullPointerException e) {
            throw new CompilationException("Source File not found");
        }

        try {
            ret = CEC.run(src, out, null).getPath();
        } catch (IOException e) {
            throw new CompilationException("Compilation failed: "
                    + e.getMessage().replace("\n", ""));
        }

        return ret;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<String> getFeasibleProperties() {
        // TODO getFeasibleProperties 
        Collection<String> ret = new ArrayList<String>();
        ret.add(LanguageProperties.CYCLIC);
        ret.add(LanguageProperties.ACYCLIC);
        ret.add(LanguageProperties.NON_CONSTRUCTIVE);
        ret.add(LanguageProperties.CONSTRUCTIVE);
        ret.add(LanguageProperties.PURE);
        ret.add(LanguageProperties.VALUED);
        return ret;
    }

}
