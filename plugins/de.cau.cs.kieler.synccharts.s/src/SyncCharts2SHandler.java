import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.internal.resources.File;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.KielerException;
import de.cau.cs.kieler.core.model.util.XtendTransformationUtil;
import de.cau.cs.kieler.s.s.SPackage;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.s.Activator;

public class SyncCharts2SHandler extends AbstractHandler implements IHandler {

    public Object execute(ExecutionEvent event) throws ExecutionException {
        // TODO Auto-generated method stub
        System.out.println("Transform SyncCharts2S");
        final String transformation = "model/synccharts2s";
        final String fun = "transform";
        URI input = URI.createURI("");
        URI output = URI.createURI("");

        final EPackage p1 = SyncchartsPackage.eINSTANCE;
        final EPackage p2 = SPackage.eINSTANCE;

        Status myStatus = null;
        try {
            // get input model from currently selected file in Explorer
            ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                    .getSelectionService().getSelection();
            File file = (File) ((TreeSelection) selection).getFirstElement();
            input = URI.createPlatformResourceURI(file.getFullPath().toString(), true);

            // get output model from input model
            output = URI.createURI(input.toString());
            output = output.trimFileExtension().appendFileExtension("s");

            XtendTransformationUtil
                    .model2ModelTransform(transformation, fun, input, output, p1, p2);
        } catch (KielerException e) {
            myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                    "Failed to transform SyncChart model into S model.", e);
        } catch (NullPointerException npe) {
            myStatus = new Status(
                    IStatus.ERROR,
                    Activator.PLUGIN_ID,
                    "Failed to transform SyncChart model into S model. Could not determine input file.",
                    npe);
        } catch (ClassCastException cce) {
            myStatus = new Status(
                    IStatus.WARNING,
                    Activator.PLUGIN_ID,
                    "Failed to transform SyncChart model into S model. Could not determine input file. No file selected.");
        } finally {
            if (myStatus != null) {
                StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
            }
        }
        return null;
    }

}
