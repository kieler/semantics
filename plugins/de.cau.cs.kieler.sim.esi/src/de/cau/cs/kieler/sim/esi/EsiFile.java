/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.esi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.antlr.IAntlrParser;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import de.cau.cs.kieler.sim.esi.esi.signal;
import de.cau.cs.kieler.sim.esi.esi.tick;
import de.cau.cs.kieler.sim.esi.esi.trace;
import de.cau.cs.kieler.sim.esi.esi.tracelist;
import de.cau.cs.kieler.sim.esi.trace.ITrace;
import de.cau.cs.kieler.sim.esi.trace.ITraceList;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;

/**
 * @author ctr
 * 
 */
public class EsiFile implements ITraceList {

    private tracelist traceList = null;
    private EsiTrace current = null;
    private int pos = 0;

    EsiFile(final Object classpathURIContext, final String fileName)
            throws KiemInitializationException {

        ISetup setup = new EsiStandaloneSetup();
        Injector injector = setup.createInjectorAndDoEMFRegistration();
        XtextResourceSet rs = injector.getInstance(XtextResourceSet.class);
        rs.setClasspathURIContext(classpathURIContext);

        IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
        // setup.doSetup();
        URI uri = URI.createURI("de.cau.cs.kieler.sim.esi"); // Activator.PLUGIN_ID);
        XtextResource resource = (XtextResource) resourceFactory.createResource(uri);
        rs.getResources().add(resource);

        InputStream in;
        try {

            if (fileName != null && fileName.length() > 0) {
                in = new FileInputStream(fileName);
            } else {
                throw new KiemInitializationException(
                        "EsiComponent is activated but no trace file is set", false, null);
            }

            Injector inj = new EsiStandaloneSetup().createInjectorAndDoEMFRegistration();
            IAntlrParser parser = inj.getInstance(IAntlrParser.class);
            IParseResult parseResult = parser.parse(in);
            if (!parseResult.getParseErrors().isEmpty()) {
                throw new KiemInitializationException("Parse error: "
                        + parseResult.getParseErrors().get(0).toString(), true, null);
            }
            traceList = (tracelist) parseResult.getRootASTElement();
        } catch (FileNotFoundException e) {
            throw new KiemInitializationException("File not found", false, e);
            // } catch (Exception e) {
            // throw new KiemInitializationException("Unknown error", false, e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public ITrace current() {
        return current;
    }

    /**
     * {@inheritDoc}
     */
    public int getRemaining() {
        return traceList.getTraces().size() - pos - 1;
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasNext() {
        return getRemaining() > 0;
    }

    /**
     * {@inheritDoc}
     */
    public ITrace next() {
        pos++;
        current = new EsiTrace(traceList.getTraces().get(pos));
        return current;
    }

    /**
     * {@inheritDoc}
     */
    public Set<String> getInputs() {
        HashSet<String> res = new HashSet<String>();
        for(trace t: this.traceList.getTraces()){
            for(tick tick: t.getTicks()){
                for(signal s: tick.getInput()){
                    res.add(s.getName());
                }
            }
        }
        
        return res;
    }

    /**
     * {@inheritDoc}
     */
    public Set<String> getOutputs() {
        HashSet<String> res = new HashSet<String>();
        for(trace t: this.traceList.getTraces()){
            for(tick tick: t.getTicks()){
                for(signal s: tick.getOutput()){
                    res.add(s.getName());
                }
            }
        }
        
        return res;
    }

}
