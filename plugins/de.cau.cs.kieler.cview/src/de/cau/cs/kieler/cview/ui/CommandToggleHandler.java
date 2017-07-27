package de.cau.cs.kieler.cview.ui;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;

import de.cau.cs.kieler.cview.CViewPlugin;
import de.cau.cs.kieler.cview.DiagramSynthesis;
import de.cau.cs.kieler.cview.KLighDController;
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis;

public class CommandToggleHandler implements IHandler {

    public int lastExpandedSliderValue = DiagramSynthesis.DEFAULT_EXPANDED_VALUE;

    public static String CMD_SELECT_ID = "de.cau.cs.kieler.cview.command.select";
    public static String CMD_FILTER_ID = "de.cau.cs.kieler.cview.command.filter";
    
    @Override
    public void addHandlerListener(IHandlerListener handlerListener) {
    }

    @Override
    public void dispose() {
    }

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        
        String commandId = event.getCommand().getId();
        
        if (commandId.equals(CMD_SELECT_ID)) {
            //SelectDialog.optionList = {};
            String getName();

            SelectDialog.itemList = ;
            boolean ok = SelectDialog.showSelectDialog();
                    
            if (ok) {
                // Save
                
                CViewPlugin.clearSelectionHooks();
            }
            
            return null;
        }


        boolean changedExpandedSliderValue = false;
        int currentExpandedSliderValue = KLighDController.getSynthesisOptionIntValue(DiagramSynthesis.EXPANDED_SLIDER);
        if (currentExpandedSliderValue == -1) {
            currentExpandedSliderValue = DiagramSynthesis.DEFAULT_EXPANDED_VALUE;
        }
        
        
        if (lastExpandedSliderValue != currentExpandedSliderValue) {
            lastExpandedSliderValue = currentExpandedSliderValue;
            changedExpandedSliderValue = true;
        }

        CViewPlugin.refreshCView(changedExpandedSliderValue);
        return null;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean isHandled() {
        return true;
    }

    @Override
    public void removeHandlerListener(IHandlerListener handlerListener) {
        // TODO Auto-generated method stub

    }

}

// Command command = event.getCommand();
// CViewPlugin.setEnabled(false);
// boolean oldValue = HandlerUtil.toggleCommandState(command);
// CViewPlugin.setEnabled(!oldValue);
//
// if (!oldValue) {
// // CViewPlugin.showModelView();
// CViewPlugin.refreshCView();
// }
