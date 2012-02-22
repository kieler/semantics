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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.XtextEditor;

import com.google.inject.Injector;

import de.cau.cs.kieler.sim.eso.eso.tracelist;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;

/**
 * @author ctr
 * 
 */
public class Helper {

    public static tracelist loadTrace(final Object classpathURIContext, final String editorId, final String fileName)
            throws KiemInitializationException {
        tracelist res = null;

        XtextEditor editor = null;

        ISetup setup = new EsoStandaloneSetup();
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
            IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                    .getActivePage();
            IEditorReference[] editors = page.getEditorReferences();
            editor = null;
            String name = editorId;
            if (editors != null) {
                for (IEditorReference e : editors) {
                    if (name.equals(e.getTitle() + " (" + e.getId() + ")")) {
                        IEditorPart ed = e.getEditor(false);
                        if (ed instanceof XtextEditor) {
                            editor = (XtextEditor) ed;
                            break;
                        }

                    }
                }
            }

            if (editor != null) {
                FileEditorInput input = (FileEditorInput) editor.getEditorInput();
                if (input.exists()) {
                    IFile file = input.getFile();
                    in = file.getContents();
                } else {
                    throw new KiemInitializationException("Editor input not found", true, null);
                }
            } else {

                if (fileName != null && fileName.length() > 0) {
                    in = new FileInputStream(fileName);
                } else {
                    throw new KiemInitializationException(
                            "EsiComponent is activated but no trace file is set", false, null);
                }
            }

            Injector inj = new EsoStandaloneSetup().createInjectorAndDoEMFRegistration();
            IParser parser = inj.getInstance(IParser.class);
            IParseResult parseResult = parser.parse(new InputStreamReader(in));
            if (parseResult.getSyntaxErrors().iterator().hasNext()) {
                throw new KiemInitializationException("Parse error", true, null);
            }
            res = (tracelist) parseResult.getRootASTElement();
        } catch (FileNotFoundException e) {
            throw new KiemInitializationException("File not found", false, e);
        } catch (Exception e) {
            throw new KiemInitializationException("Unknown error", false, e);
        }
        return res;
    }

    public static tracelist loadTrace(final Object classpathURIContext, final String fileName)
            throws KiemInitializationException {
        tracelist res = null;

        ISetup setup = new EsoStandaloneSetup();
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

            Injector inj = new EsoStandaloneSetup().createInjectorAndDoEMFRegistration();
            IParser parser = inj.getInstance(IParser.class);
            IParseResult parseResult = parser.parse(new InputStreamReader(in));
            if (parseResult.getSyntaxErrors().iterator().hasNext()) {
                throw new KiemInitializationException("Parse error", true, null);
            }
            res = (tracelist) parseResult.getRootASTElement();
        } catch (FileNotFoundException e) {
            throw new KiemInitializationException("File not found", false, e);
        } catch (Exception e) {
            throw new KiemInitializationException("Unknown error", false, e);
        }
        return res;
    }
}
