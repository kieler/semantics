package de.cau.cs.kieler.cview.ui;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;

import de.cau.cs.kieler.cview.CViewPlugin;
import de.cau.cs.kieler.cview.klighd.DiagramSynthesis;
import de.cau.cs.kieler.cview.KLighDController;
import de.cau.cs.kieler.cview.hooks.IExportHook;

public class CommandHandler implements IHandler {

    public int lastExpandedSliderValue = DiagramSynthesis.DEFAULT_EXPANDED_VALUE;

    public static String CMD_SELECT_ID = "de.cau.cs.kieler.cview.command.select";
    public static String CMD_FILTER_ID = "de.cau.cs.kieler.cview.command.filter";
    public static String CMD_EXPORT_ID = "de.cau.cs.kieler.cview.command.export";
    public static String CMD_REFRESH_ID = "de.cau.cs.kieler.cview.command";

    // -------------------------------------------------------------------------

    @Override
    public void addHandlerListener(IHandlerListener handlerListener) {
    }

    // -------------------------------------------------------------------------

    @Override
    public void dispose() {
    }

    // -------------------------------------------------------------------------
    private boolean oldShowFunctions = false;


    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {

        String commandId = event.getCommand().getId();

        if (commandId.equals(CMD_EXPORT_ID) || commandId.equals(CMD_REFRESH_ID)) {
            if (KLighDController.getModel() == null) {
                // No model, so build one
                if (KLighDController.getAllSelections() == null) {
                    openMessageDialog("Warning", "Nothing selected. Cannot build model.", false, true);
                    return null;
                } else {
                    // CMD_REFRESH_ID will refresh at the bottom of this method...
                    if (commandId.equals(CMD_EXPORT_ID)) {
                        CViewPlugin.rebuildModelAndrefreshCView(true);
                    }
                }
            }
        }

        if (commandId.equals(CMD_EXPORT_ID)) {
            SelectExportDialog.itemListAll = CViewPlugin.getAllRegisteredExportHookIds();
            boolean ok = SelectExportDialog.showDialog();

            if (ok) {
                IExportHook selectedHook = null;
                for (IExportHook hook : CViewPlugin.getRegisteredExportHooks(false)) {
                    if (hook.getId()
                            .equals(CViewPlugin.extractId(SelectExportDialog.itemSelected))) {
                        selectedHook = hook;
                        break;
                    }
                }

                FileDialog dlg = new FileDialog(Display.getCurrent().getActiveShell(),
                        SWT.SINGLE | SWT.SAVE);
                dlg.setOverwrite(true);
                String[] exts = { "*.*" };
                String ext = selectedHook.getFileExtension();
                if (ext != null) {
                    exts[0] = "*." + ext;
                }
                dlg.setFilterExtensions(exts);
                String fileToWrite = dlg.open();
                if (fileToWrite != null) {
                    boolean success = false;
                    if (ext != null && !fileToWrite.endsWith("." + ext)) {
                        fileToWrite += "." + ext;
                    }
                    System.out.println("Exporting to " + fileToWrite);
                    PrintWriter out;
                    try {
                        out = new PrintWriter(fileToWrite);
                        String exported = selectedHook.export(KLighDController.getModel());
                        if (exported == null || exported.equals("")) {
                            openMessageDialog("Export Analysis", "Nothing to export.", false, false);
                            success = true;
                        } else {
                            out.append(exported);
                            out.close();
                            success = true;
                            openMessageDialog("Export Analysis",
                                    "Export completed.\n\nFile written to '" + fileToWrite + "'.",
                                    false, false);
                        }
                    } catch (FileNotFoundException e) {
                        openMessageDialog("Error",
                                "An error occurred while exporting to '" + fileToWrite + "'.",
                                true, false);
                        e.printStackTrace();
                    }
                    if (!success) {
                        openMessageDialog("Error", "Could not export to '" + fileToWrite + "'.",
                                true, false);
                    }
                }
            }

            return null;
        }

        if (commandId.equals(CMD_FILTER_ID)) {
            boolean ok = FilterDialog.showDialog();
            if (ok) {
                // Apply filter
                CViewPlugin.refreshCView(true);
            }

            return null;
        }

        if (commandId.equals(CMD_SELECT_ID)) {
            // SelectDialog.optionList = {};

            SelectAnalysisDialog.itemListAll = CViewPlugin.getAllRegisteredAnalysisHookIds();
            SelectAnalysisDialog.itemListSelected = CViewPlugin
                    .filterSelectedRegisteredAnalysisHookIds(SelectAnalysisDialog.itemListAll);
            boolean ok = SelectAnalysisDialog.showDialog();

            if (ok) {
                // Save
                for (String item : SelectAnalysisDialog.itemListAll) {
                    String hookId = CViewPlugin.extractId(item);
                    CViewPlugin.setEnabled(hookId, false);
                }
                for (String item : SelectAnalysisDialog.itemListSelected) {
                    String hookId = CViewPlugin.extractId(item);
                    CViewPlugin.setEnabled(hookId, true);
                }

                CViewPlugin.clearSelectionAnalysisHooks();

                if (ok) {
                    // Apply filter
                    CViewPlugin.rebuildModelAndrefreshCView(true);
                }
            }

            return null;
        }

        boolean changedExpandedSliderValue = false;
        int currentExpandedSliderValue =
                KLighDController.getSynthesisOptionIntValue(DiagramSynthesis.EXPANDED_SLIDER);
        if (currentExpandedSliderValue == -1) {
            currentExpandedSliderValue = DiagramSynthesis.DEFAULT_EXPANDED_VALUE;
        }

        if (lastExpandedSliderValue != currentExpandedSliderValue) {
            lastExpandedSliderValue = currentExpandedSliderValue;
            changedExpandedSliderValue = true;
        }

        CViewPlugin.rebuildModelAndrefreshCView(changedExpandedSliderValue);
        return null;
    }

    // -------------------------------------------------------------------------

    @Override
    public boolean isEnabled() {
        return true;
    }

    // -------------------------------------------------------------------------

    @Override
    public boolean isHandled() {
        return true;
    }

    // -------------------------------------------------------------------------

    @Override
    public void removeHandlerListener(IHandlerListener handlerListener) {
    }

    // -------------------------------------------------------------------------

    public void openMessageDialog(String title, String text, boolean error, boolean warning) {
        int type = SWT.ICON_INFORMATION;
        if (warning) {
            type = SWT.ICON_WARNING;
        }
        if (error) {
            type = SWT.ICON_ERROR;
        }
        MessageBox dialog = new MessageBox(Display.getCurrent().getShells()[0], type | SWT.OK);
        dialog.setText(title);
        dialog.setMessage(text);
        dialog.open();
    }

    // -------------------------------------------------------------------------
}
