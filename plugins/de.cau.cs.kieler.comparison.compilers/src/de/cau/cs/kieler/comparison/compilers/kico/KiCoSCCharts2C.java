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
 * @author nfl
 *
 */
public class KiCoSCCharts2C implements ICompiler {

    private ExecutionSimulator simulator = null;
    
    /**
     * 
     */
    public KiCoSCCharts2C() {
        simulator = new KiCoSCTExecutionSimulator();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public String getID() {
        return "KiCo - SCCharts to C";
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
        return Language.C;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Path compile(Path srcFile, Path outputPath) throws CompilationException {        
        
        URI uri = null;
        try {            
            uri = URI.createFileURI(srcFile.toString());
        } catch (IllegalArgumentException e) {
            throw new CompilationException("Unable to load source file");
        }        
        
        // Get the resource
        Resource resource = new ResourceSetImpl().getResource(uri, true);
        if(resource == null || resource.getContents() == null || resource.getContents().isEmpty())
            throw new CompilationException("Unable to load EObject from source file");
        
        EObject eobj = resource.getContents().get(0);
        
        KielerCompilerContext context = new KielerCompilerContext("!T_SIMULATIONVISUALIZATION, !T_ESTERELSIMULATIONVISUALIZATION, T_s.c", eobj); 
        context.setAdvancedSelect(true);
        
        // TODO resolve dependencies to other SCCharts
        
        CompilationResult compResult = KielerCompiler.compile(context);
        if(compResult.getAllErrors() != null && ! compResult.getAllErrors().isEmpty())
            throw new CompilationException("Compilation failed: " + compResult.getAllErrors().toString().replace("\n", ""));
        
        File out = new File(outputPath.toFile(), srcFile.getFileName() + ".c");
        
        BufferedWriter bw = null;
                
        try {
            bw = new BufferedWriter(new FileWriter(out));
            bw.write(compResult.getString());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }            
        }
        return out.toPath();
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
        ret.add(LanguageProperties.SEQUENTIALLY_CONSTRUCTIVE);
        return ret;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getCompilationOffset() {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExecutionSimulator getSimulator() {
        return simulator;
    }
}