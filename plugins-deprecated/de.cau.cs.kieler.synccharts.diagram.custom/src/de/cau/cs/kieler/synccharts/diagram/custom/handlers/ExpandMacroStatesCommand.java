/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.diagram.custom.handlers;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.emf.mwe.utils.Writer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtend.XtendComponent;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;

/**
 * A command that expands all referenceMacroStates in a given file <name>[.kixs] and writes the expanded
 * superstate to a new file <name>_EXPANDED.kixs
 * 
 * @author abl
 * @kieler.ignore (excluded from review process)
 */
public class ExpandMacroStatesCommand extends AbstractHandler {

    /** File extension for model files. */
    
    private static final List<String> MODEL_EXTENSIONS = Arrays.asList(new String[]{ "kixs","kits" });

    /**
     * {@inheritDoc}
     */
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        ISelection selection = HandlerUtil.getCurrentSelection(event);
        if (selection instanceof IStructuredSelection) {
            Iterator<?> iter = ((IStructuredSelection) selection).iterator();
            while (iter.hasNext()) {
                Object o = iter.next();
                if (o instanceof IFile) {
                    IPath path = ((IFile) o).getFullPath();
                    expandMacroStates(path);
                }
            }
        }
        return null;
    }

    private void expandMacroStates(final IPath path) {
   	IPath target;
        Workflow workflow;
        WorkflowContext wfx;
        NullProgressMonitor monitor;
        Issues issues;
        EmfMetaModel metaModel;
        Reader xmiReader;
        XtendComponent transformation;
        Writer writer;
    	
    	target = (IPath) path.clone();
        target = target.removeFileExtension();
        String ext = path.getFileExtension();
        String filename = target.lastSegment() + "_EXPANDED." + ext;
//        String filename2 = target.lastSegment() + "_EXPANDED.mwe";
        target = target.removeLastSegments(1).append(filename);
        

        workflow = new Workflow();
        wfx = new WorkflowContextDefaultImpl();
        monitor = new NullProgressMonitor();
        issues = new IssuesImpl();
                    

        // Meta model
        // MINE
        //metaModel = new EmfMetaModel(SyncchartsPackage.eINSTANCE);
        // CMOTs
        metaModel = new EmfMetaModel(de.cau.cs.kieler.synccharts.SyncchartsPackage.eINSTANCE);
        EmfMetaModel expressions = new EmfMetaModel(de.cau.cs.kieler.core.kexpressions.KExpressionsPackage.eINSTANCE);
        
        xmiReader = new Reader();
        xmiReader.setUri(path.toOSString());
        xmiReader.setModelSlot("model");
        workflow.addComponent(xmiReader);
        
        //convert the currentFile-String into a valid resource URI (this is NOT the resolved form yet)
        URI fileURI = URI.createPlatformResourceURI(path.toOSString(), true);

        //create a URI converter in order to resolve the file
//        URIConverter uriConverter = new ExtensibleURIConverterImpl();

        xmiReader.setUri(fileURI.toString());
        
//        System.out.println(fileURI.trimSegments(1).toString());
//        wfx.set("baseDir", fileURI.trimSegments(1).toString());

        transformation = new XtendComponent();
        transformation.addMetaModel(metaModel);
        transformation.addMetaModel(expressions);
        transformation.setInvoke("transformations::expandReferenceStates::transform(model)");
        transformation.setOutputSlot("transformedModel");
        workflow.addComponent(transformation);
        
        writer = new Writer();
        writer.setUri(target.toOSString());
        writer.setModelSlot("transformedModel");
        workflow.addComponent(writer);
        
        workflow.invoke(wfx, monitor, issues);
        System.out.println(issues);
    }
}
