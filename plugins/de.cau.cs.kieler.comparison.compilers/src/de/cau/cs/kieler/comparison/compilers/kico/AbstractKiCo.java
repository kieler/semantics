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
package de.cau.cs.kieler.comparison.compilers.kico;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.cau.cs.kieler.comparison.core.CompilationException;
import de.cau.cs.kieler.comparison.core.ICompiler;
import de.cau.cs.kieler.comparison.core.Language;
import de.cau.cs.kieler.comparison.core.LanguageProperties;
import de.cau.cs.kieler.comparison.simulation.ExecutionSimulator;
import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.KielerCompilerContext;

/**
 * The AbstractKiCo class utilizes the Write-Things-Once principle. KiCo is able to compile from and
 * to any language within the KiCo compilation chain displayed in the KiCo Selection View. The
 * compilation call however is always the same. Therefore, this method is implemented in this
 * abstract class to enable multiple KiCo implementations using this abstract super class.
 * 
 * @author nfl
 */
public abstract class AbstractKiCo implements ICompiler {

    /**
     * The ExecutionSimulator used for the simulation of compiled test cases.
     */
    protected ExecutionSimulator simulator;

    /**
     * The language to compile a test case into.
     */
    protected Language trgLanguage;

    /**
     * A String to identify the target language.
     */
    protected String trgLanguageString;

    /**
     * A String representing the file extension for the target language.
     */
    protected String trgLanguageExtension;

    /**
     * The transformation rule used by KiCo for the compilation into the target language.
     */
    protected String transformation = "";

    /**
     * {@inheritDoc}
     */
    @Override
    public String getID() {
        return "KiCo - SCCharts to " + trgLanguageString;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Language getSrcLanguage() {
        return Language.SCCharts;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Language getTrgLanguage() {
        return trgLanguage;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<String> getFeasibleProperties() {
        // TODO get all feasible properties
        Collection<String> ret = new ArrayList<String>();
        ret.add(LanguageProperties.CYCLIC);
        ret.add(LanguageProperties.ACYCLIC);
        ret.add(LanguageProperties.NON_CONSTRUCTIVE);
        ret.add(LanguageProperties.CONSTRUCTIVE);
        ret.add(LanguageProperties.PURE);
        ret.add(LanguageProperties.VALUED);
        ret.add(LanguageProperties.SEQUENTIALLY_CONSTRUCTIVE);
        return ret;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getCompilationOffset() {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExecutionSimulator getSimulator() {
        return simulator;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Path compile(final Path srcFile, final Path outputPath) throws CompilationException {

        // try to load the source model
        URI uri = null;
        try {
            uri = URI.createFileURI(srcFile.toString());
        } catch (IllegalArgumentException e) {
            throw new CompilationException("Unable to load source file");
        }

        // Get the resource
        Resource resource = new ResourceSetImpl().getResource(uri, true);
        if (resource == null || resource.getContents() == null || resource.getContents().isEmpty()) {
            throw new CompilationException("Unable to load EObject from source file");
        }

        EObject eobj = resource.getContents().get(0);

        KielerCompilerContext context =
                new KielerCompilerContext(
                        "!T_SIMULATIONVISUALIZATION, !T_ESTERELSIMULATIONVISUALIZATION, "
                                + transformation, eobj);
        context.setAdvancedSelect(true);

        // TODO resolve dependencies to other SCCharts

        CompilationResult compResult = KielerCompiler.compile(context);
        if (compResult.getAllErrors() != null && !compResult.getAllErrors().isEmpty()) {
            throw new CompilationException("Compilation failed: "
                    + compResult.getAllErrors().toString().replace("\n", ""));
        }

        File out = new File(outputPath.toFile(), srcFile.getFileName() + trgLanguageExtension);

        BufferedWriter bw = null;

        // save compiled test case as file
        try {
            bw = new BufferedWriter(new FileWriter(out));
            bw.write(compResult.getString());
        } catch (IOException e) {
            throw new CompilationException(
                    "Compilation failed: Unable to save compilation as file: " + e.getMessage());
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                // ignore
            }
        }
        return out.toPath();
    }
}
