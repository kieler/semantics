/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
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
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;

import de.cau.cs.kieler.comparison.core.CompilationException;
import de.cau.cs.kieler.comparison.core.ICompiler;
import de.cau.cs.kieler.comparison.core.Language;
import de.cau.cs.kieler.comparison.core.LanguageProperties;
import de.cau.cs.kieler.comparison.simulation.ExecutionSimulator;
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
    public Path compile(Path srcFile, Path outputPath) throws CompilationException {

        Path ret;
        URI src = null;
        File out = null;

        try {
            out = new File(outputPath.toFile(), srcFile.getFileName() + ".c");
            src = srcFile.toUri();
        } catch (NullPointerException e) {
            throw new CompilationException("Source File not found");
        }

        try {
            ret = new File(CEC.run(src, out, null).toString()).toPath();
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

    /**
     * {@inheritDoc}
     */
    @Override
    public long getCompilationOffset() {
        // TODO compute the right value
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExecutionSimulator getSimulator() {
        return null;
    }
}
