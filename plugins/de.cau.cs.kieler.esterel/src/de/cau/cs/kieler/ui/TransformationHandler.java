package de.cau.cs.kieler.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;

public class TransformationHandler extends AbstractHandler {

    String esterelFilename = null;
    
    public Object execute(ExecutionEvent event) throws ExecutionException {
        System.out.println("Esterel Transformation, yeehaa!");
        ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
        ISelection selection = selectionService.getSelection();
        try{
            TreeSelection treeSelection = (TreeSelection)selection;
            TreePath[] treePaths = treeSelection.getPaths();
            if(treePaths.length != 1)
                throw new IllegalArgumentException("Not exactly 1 file selected!");
            TreePath path = treePaths[0];
            
            System.out.println("Path of currently selected file: "+path.getLastSegment());
            esterelFilename = path.getLastSegment().toString();
            transformToSyncChart(esterelFilename);
        }
        catch(ClassCastException e){
            System.out.println("Current selection is no Esterel file.");
        }
        catch(IllegalArgumentException e1){
            System.out.println(e1.getMessage());
        }
        catch(NullPointerException e2){
            System.out.println("Current selection is no Esterel file.");
        }
        return null;
    }

    /**
     * @param esterelFilename2
     */
    private void transformToSyncChart(String esterelFilename2) {
      
        
    }

}
