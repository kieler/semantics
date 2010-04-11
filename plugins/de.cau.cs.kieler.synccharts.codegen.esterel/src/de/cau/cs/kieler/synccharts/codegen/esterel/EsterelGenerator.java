package de.cau.cs.kieler.synccharts.codegen.esterel;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;

public class EsterelGenerator extends AbstractHandler implements IHandler {

    WorkflowGenerator wf = new WorkflowGenerator();

    public Object execute(ExecutionEvent event) throws ExecutionException {
    	wf.invokeWorkflow();
        
        return null;
    }
}
