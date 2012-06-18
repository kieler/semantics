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
package de.cau.cs.kieler.sim.eso;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import de.cau.cs.kieler.sim.eso.eso.signal;
import de.cau.cs.kieler.sim.eso.eso.tick;
import de.cau.cs.kieler.sim.eso.eso.trace;
import de.cau.cs.kieler.sim.eso.eso.tracelist;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.util.KiemUtil;

/**
 * @author ctr, cmot
 * 
 */
public class EsoFile implements ITraceProvider {

    private static final String[] EXTENSIONS = { "esi", "eso" };

    private tracelist traceList = null;
    private EsoTrace current = null;
    private int pos = 0;

    /*
     * EsiFile(final Object classpathURIContext, final String fileName) throws
     * KiemInitializationException {
     * 
     * ISetup setup = new EsiStandaloneSetup(); Injector injector =
     * setup.createInjectorAndDoEMFRegistration(); XtextResourceSet rs =
     * injector.getInstance(XtextResourceSet.class); rs.setClasspathURIContext(classpathURIContext);
     * 
     * IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class); //
     * setup.doSetup(); URI uri = URI.createURI("de.cau.cs.kieler.sim.esi"); //
     * Activator.PLUGIN_ID); XtextResource resource = (XtextResource)
     * resourceFactory.createResource(uri); rs.getResources().add(resource);
     * 
     * InputStream in; try {
     * 
     * if (fileName != null && fileName.length() > 0) { in = new FileInputStream(fileName); } else {
     * throw new KiemInitializationException( "EsiComponent is activated but no trace file is set",
     * false, null); }
     * 
     * Injector inj = new EsiStandaloneSetup().createInjectorAndDoEMFRegistration(); IAntlrParser
     * parser = inj.getInstance(IAntlrParser.class); IParseResult parseResult = parser.parse(in); if
     * (!parseResult.getParseErrors().isEmpty()) { throw new
     * KiemInitializationException("Parse error: " + parseResult.getParseErrors().get(0).toString(),
     * true, null); } traceList = (tracelist) parseResult.getRootASTElement(); } catch
     * (FileNotFoundException e) { throw new KiemInitializationException("File not found", false,
     * e); // } catch (Exception e) { // throw new KiemInitializationException("Unknown error",
     * false, e); } }
     */

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
        return traceList.getTraces().size() - pos;
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
        current = new EsoTrace(traceList.getTraces().get(pos));
        pos++;
        return current;
    }

    /**
     * {@inheritDoc}
     */
    public Set<String> getInputs() {
        HashSet<String> res = new HashSet<String>();
        for (trace t : this.traceList.getTraces()) {
            for (tick tick : t.getTicks()) {
                for (signal s : tick.getInput()) {
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
        for (trace t : this.traceList.getTraces()) {
            for (tick tick : t.getTicks()) {
                for (signal s : tick.getOutput()) {
                    res.add(s.getName());
                }
            }
        }

        return res;
    }

    /**
     * {@inheritDoc}
     */
    public String[] getExtensions() {
        return EXTENSIONS;
    }

    /**
     * {@inheritDoc}
     * 
     * @throws KiemInitializationException
     */
    public List<ITrace> loadTrace(final String fileName) throws KiemInitializationException,
            FileNotFoundException {
        ISetup setup = new EsoStandaloneSetup();
        Injector injector = setup.createInjectorAndDoEMFRegistration();
        XtextResourceSet rs = injector.getInstance(XtextResourceSet.class);
        rs.setClasspathURIContext(getClass());

        IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
        // setup.doSetup();
        URI uri = URI.createURI("de.cau.cs.kieler.sim.esi"); // Activator.PLUGIN_ID);
        XtextResource resource = (XtextResource) resourceFactory.createResource(uri);
        rs.getResources().add(resource);

        InputStream in;
        if (fileName != null && fileName.length() > 0) {
            try {
                IPath filePath = new Path(fileName);
                in = KiemUtil.openWorkspaceFile(filePath);
            } catch (CoreException e) {
                throw new KiemInitializationException(
                        "EsiComponent cannot load trace file due to malformed URI.", false, null);
            }
        } else {
            throw new KiemInitializationException(
                    "EsiComponent is activated but no trace file is set", false, null);
        }

        Injector inj = new EsoStandaloneSetup().createInjectorAndDoEMFRegistration();
        IParser parser = inj.getInstance(IParser.class);
        IParseResult parseResult = parser.parse(new InputStreamReader(in));
        if (parseResult.getSyntaxErrors().iterator().hasNext()) {
            INode errorElem = parseResult.getSyntaxErrors().iterator().next();
            throw new KiemInitializationException("Parse error on line " + errorElem.getStartLine()
                    + " at column " + errorElem.getTotalOffset() + ": "
                    + parseResult.getSyntaxErrors().iterator().next().getText(), true, null);
        }
        traceList = (tracelist) parseResult.getRootASTElement();

        LinkedList<ITrace> res = new LinkedList<ITrace>();
        for (trace trace : traceList.getTraces()) {
            res.add(new EsoTrace(trace));
        }
        return res;
    }
}
