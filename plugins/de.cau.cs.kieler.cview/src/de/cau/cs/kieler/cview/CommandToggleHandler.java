package de.cau.cs.kieler.cview;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.handlers.RegistryToggleState;

public class CommandToggleHandler implements IHandler {

    @Override
    public void addHandlerListener(IHandlerListener handlerListener) {
    }

    @Override
    public void dispose() {
    }

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        CViewPlugin.refreshCView();
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

//Command command = event.getCommand();
// CViewPlugin.setEnabled(false);
// boolean oldValue = HandlerUtil.toggleCommandState(command);
// CViewPlugin.setEnabled(!oldValue);
//
// if (!oldValue) {
// // CViewPlugin.showModelView();
// CViewPlugin.refreshCView();
// }
