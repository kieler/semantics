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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.cau.cs.kieler.comparison.core.CompilationException;
import de.cau.cs.kieler.comparison.core.ICompiler;
import de.cau.cs.kieler.comparison.core.Language;
import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.KielerCompilerContext;

/**
 * @author nfl
 *
 */
public class KiCoSCCharts2C implements ICompiler {

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
    public String compile(String srcFile, String outputPath) throws CompilationException {        
        
        URI uri = null;
        try {
            uri = URI.createFileURI(srcFile);
        } catch (AssertionError e) {
            throw new CompilationException("Source File not found");
        }        
        
        // Get the resource
        Resource resource = new ResourceSetImpl().getResource(uri, true);
        if(resource.getContents().isEmpty())
            throw new CompilationException("Unable to load source file");
        
        EObject eobj = resource.getContents().get(0);
        
        KielerCompilerContext context = new KielerCompilerContext("!T_SIMULATIONVISUALIZATION, T_s.c", eobj); 
        context.setAdvancedSelect(true);
        CompilationResult compResult = KielerCompiler.compile(context);
        if(compResult.getAllErrors() != null && ! compResult.getAllErrors().isEmpty())
            throw new CompilationException("Compilation failed: " + compResult.getAllErrors().toString().replace("\n", ""));
        
        File out = new File(outputPath + "" + srcFile.substring(srcFile.lastIndexOf("/")) + ".c");
        
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
        return out.toURI().getPath();
    }
}
