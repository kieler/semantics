package de.cau.cs.kieler.c.sccharts.handler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.eclipse.cdt.core.model.CoreModel;
import org.eclipse.cdt.core.model.ITranslationUnit;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.jface.viewers.ISelection;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.cau.cs.kieler.c.sccharts.CDTProcessor;
import de.cau.cs.kieler.core.model.handlers.AbstractConvertModelHandler;
import de.cau.cs.kieler.sccharts.SCChartsPlugin;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.text.SCTStandaloneSetup;
//import de.cau.cs.kieler.sccharts.text.sct.SctStandaloneSetup;

public class CFileTransformHandler extends AbstractConvertModelHandler {

    public static final String C_TRANSFORMATION =
            "de.cau.cs.kieler.c.sccharts.commands.TransformC";

    // Create an injector to load the transformation via guice.
    private static Injector injector = new SCTStandaloneSetup()
            .createInjectorAndDoEMFRegistration();

    // -------------------------------------------------------------------------

    public CFileTransformHandler() {
        super();
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected Object transform(EObject model, ExecutionEvent event, ISelection selection) {
        return null;
    }

    // -------------------------------------------------------------------------

    public String getDiagramEditorID() {
        return "de.cau.cs.kieler.sccharts.text.SCT";
    }

    // -------------------------------------------------------------------------

    protected boolean doOpenEditor(final Object modelObject, final ExecutionEvent event,
            final ISelection selection) {
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTargetExtension(EObject model, ExecutionEvent event, ISelection selection) {
        return "sct";
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected Injector createResourceInjector() {
        return injector;
    }

    // -------------------------------------------------------------------------

    
    
    
    protected void convert(final ExecutionEvent event, final IFile file, final ISelection selection)
            throws ExecutionException {
  	System.out.println(file.getName());
      	InputStream is;
        try {
            is = file.getContents();
	    InputStreamReader isr = new InputStreamReader(is);
	    BufferedReader br = new BufferedReader(isr);

	    String thisLine;
	    String all = "";
	    while ((thisLine = br.readLine()) != null) { // while loop begins here
	        all = all + thisLine + "\r";
	    } // end while
	    System.out.println(all);
	                
	    ITranslationUnit tu = (ITranslationUnit) CoreModel.getDefault().create(file);
	    
	    CDTProcessor CDTProcessor = Guice.createInjector().getInstance(CDTProcessor.class);	  
	    State rootState = (State) CDTProcessor.transform(tu);
	    
	    URI input = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
	    URI output = URI.createURI(input.toString());
	    output = output.trimFragment();
	    output = output.trimFileExtension().appendFileExtension(getTargetExtension(null, event, selection));
	    try {
	        ResourceSet resSet = new ResourceSetImpl();
	        Resource saveRes = resSet.createResource(output);
                EObject transformedModel = (EObject) rootState;
                
	        saveRes.getContents().add(transformedModel);
	        saveRes.save(getSaveOptions());
	        setCharset(WorkspaceSynchronizer.getFile(saveRes));

                final Object transformedObject = (Object) transformedModel;
                if (doOpenEditor(transformedModel, event, selection)) {
	            openEditorSync((Object) transformedModel);
	        }
                postProcess(transformedObject);
	    } catch (IOException e2) {
	        throw new ExecutionException("Cannot write output SCChart file: " + e2.getMessage());
	    }
	    
	} catch (CoreException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	} catch (Exception e) {
	    e.printStackTrace();
	}
        
        return; 
    }
        
        

}
