package de.cau.cs.kieler.synccharts.sccharts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintWriter;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.cau.cs.kieler.core.model.handlers.AbstractConvertModelHandler;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.SCChartsPlugin;
import de.cau.cs.kieler.synccharts.sccharts.SyncChartsTransformation;
//import de.cau.cs.kieler.scg.SCGPlugin;
//import org.eclipse.xtext.Constants;
//import org.eclipse.xtext.resource.SaveOptions;
//import org.eclipse.xtext.serializer.ISerializer;
import de.cau.cs.kieler.sccharts.text3.Sct3StandaloneSetup;

/**
 * The abstract handler for SCCharts file formats scc and sct.
 * 
 * @author cmot
 * @kieler.design 2014-01-21 proposed cmot
 * @kieler.rating 2014-01-21 proposed yellow
 */
public class SyncChartsModelFileHandler extends AbstractConvertModelHandler {

    public static final String SYNCHARTS_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.SyncChartsTransformation";

    // Create an injector to load the transformation via guice.
    private static Injector injector = new Sct3StandaloneSetup()
            .createInjectorAndDoEMFRegistration();

    // -------------------------------------------------------------------------

    public SyncChartsModelFileHandler() {
        super();
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected Object transform(EObject model, ExecutionEvent event, ISelection selection) {
        String commandString = event.getCommand().getId().toString();
        EObject transformed = null;

        SyncChartsTransformation transformation =
                Guice.createInjector().getInstance(SyncChartsTransformation.class);

        // Call the model transformation (this creates a copy of the model containing the
        // refactored model).
        transformed = model;
        if (commandString.equals(SYNCHARTS_TRANSFORMATION)) {
            transformed =
                    transformation.transformSyncChart((de.cau.cs.kieler.synccharts.Region) model);
        }
        return transformed;
    }

    // -------------------------------------------------------------------------

    public String getDiagramEditorID() {
        return SCChartsPlugin.TEXT_EDITOR_ID;
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
        return null; //injector;
    }

    // -------------------------------------------------------------------------

    protected void convert(final ExecutionEvent event, final IFile file, final ISelection selection)
            throws ExecutionException {

        IFile file2 = file;

        // Replace http://kieler.cs.cau.de/kexpressions/0.1.2
        // By http://kieler.cs.cau.de/esterel/kexpressions/0.1.2
        final String SEARCH = "http://kieler.cs.cau.de/kexpressions/0.1.2";
        final String REPLACE = "http://kieler.cs.cau.de/esterel/kexpressions/0.1.2";

        InputStream is;
        try {
            is = file2.getContents();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            // create an empty InputStream
            PipedInputStream in = new PipedInputStream();

            // create an OutputStream with the InputStream from above as input
            final PipedOutputStream out = new PipedOutputStream(in);

            // PrintWriter pw = new PrintWriter(out);
            //
            String thisLine;
            String all = "";
            while ((thisLine = br.readLine()) != null) { // while loop begins here
                // Possibly modify line
                thisLine = thisLine.replace(SEARCH, REPLACE);
                // now work on the OutputStream e.g.
                //System.out.println(thisLine);
                all = all + thisLine + "\r";
            } // end while

            final String all2 = all;

            new Thread(new Runnable() {
                public void run() {
                    byte[] bytes = all2.getBytes();
                    try {
                        out.write(bytes);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

            file2.setContents(in, true, true, new NullProgressMonitor());

            super.convert(event, file2, selection);
        } catch (CoreException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
