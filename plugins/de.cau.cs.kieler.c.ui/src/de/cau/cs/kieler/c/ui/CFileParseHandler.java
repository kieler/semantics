package de.cau.cs.kieler.c.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;
import org.eclipse.core.runtime.CoreException;

import de.cau.cs.kieler.c.parser.KielerCParser;

public class CFileParseHandler extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        final ISelection selection =
                PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService()
                        .getSelection();

        if (selection instanceof IStructuredSelection) {
            final Object[] elements = ((IStructuredSelection) selection).toArray();
            final ExecutionEvent fEvent = event;
            for (Object object : elements) {
                IFile file = (IFile) object;
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

                    // KielerCParser.parse(all);

                } catch (CoreException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        }

        return null;
    }

}
