package de.cau.cs.kieler.cview.ui;

import java.io.File;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

import de.cau.cs.kieler.cview.CViewPlugin;
import de.cau.cs.kieler.cview.KLighDController;
import de.cau.cs.kieler.cview.hooks.ICViewExport;
import de.cau.cs.kieler.cview.klighd.DiagramSynthesis;
import de.cau.cs.kieler.cview.model.cViewModel.CViewModel;
import de.cau.cs.kieler.cview.model.cViewModel.CViewModelFactory;

public class CommandHandler implements IHandler {

    public int lastExpandedSliderValue = DiagramSynthesis.DEFAULT_EXPANDED_VALUE;

    public static String CMD_SELECT_ID = "de.cau.cs.kieler.cview.command.select";
    public static String CMD_FILTER_ID = "de.cau.cs.kieler.cview.command.filter";
    public static String CMD_EXPORT_ID = "de.cau.cs.kieler.cview.command.export";
    public static String CMD_REFRESH_ID = "de.cau.cs.kieler.cview.command.refresh";
    // TODO @cmot: Options for selecting diagram synthesis manually
    public static String CMD_TOGGLE_SYNTHESIS_ID = "de.cau.cs.kieler.cview.command.manualDiagramSynthesis";
    // TODO @cmot: Option for toggling a warning before huge analyses
    public static String CMD_SHOW_WARNING = "de.cau.cs.kieler.cview.command.warning";
    // TODO @cmot: Option for toggling the highlighting of the selected elements in the CView
    public static String CMD_HIGHLIGHT_SELECTION = "de.cau.cs.kieler.cview.command.highlightSelection";
    // TODO @cmot: Option for toggling the CView visualization
    public static String CMD_DEACTIVATE_VISUALIZATION = "de.cau.cs.kieler.cview.command.deactivateView";
    
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
                    CViewPlugin.openMessageDialog("Warning", "Nothing selected. Cannot build model.", false, true);
                    return null;
                } else {
                    // CMD_REFRESH_ID will refresh at the bottom of this method...
                    if (commandId.equals(CMD_EXPORT_ID)) {
                    	if(CViewPlugin.isDiagramSynthesisActive) {
                    		// Refresh visualization only if option is selected
                    		if(CViewPlugin.deactivateVisualization) {
                    			CViewPlugin.rebuildModelNoRefresh(true);
                    		} else {
                    			CViewPlugin.rebuildModelAndrefreshCView(true);                    			
                    		}
                    	}
                    }
                }
            }
        }
        
        // TODO @cmot: Toggle the manual synthesis selection
        if(commandId.equals(CMD_TOGGLE_SYNTHESIS_ID)) {
        	CViewPlugin.isDiagramSynthesisActive = !CViewPlugin.isDiagramSynthesisActive;
        	CViewPlugin.refreshPressed = false;
        	return null;
        }
        
        // TODO @cmot: Toggle showing a warning or not
        if(commandId.equals(CMD_SHOW_WARNING)) {
        	CViewPlugin.showWarning = !CViewPlugin.showWarning;
        	return null;
        }
        
        // TODO @cmot: Toggle highlighting of selected elements
        if(commandId.equals(CMD_HIGHLIGHT_SELECTION)) {
        	CViewPlugin.highlightSelection = !CViewPlugin.highlightSelection;
        	return null;
        }
        
        // TODO @cmot: Toggle activate/deactivate synthesis
        if(commandId.equals(CMD_DEACTIVATE_VISUALIZATION)) {
        	CViewPlugin.deactivateVisualization = !CViewPlugin.deactivateVisualization;
        	if(CViewPlugin.deactivateVisualization) {
        		// Do not show visualization
        		CViewPlugin.deleteCView();
        	} else {
        		// Show visualization
        		CViewPlugin.refreshCView(false);
        	}
        	return null;
        }
        
        if (commandId.equals(CMD_EXPORT_ID)) {
            SelectExportDialog.itemListAll = CViewPlugin.getAllRegisteredExportHookIds();
            boolean ok = SelectExportDialog.showDialog();

            if (ok) {
            	// TODO @cmot: Show a warning if applicable before executing the export
            	if(showWarning()) {
            		
            		ICViewExport selectedHook = null;
            		for (ICViewExport hook : CViewPlugin.getRegisteredExportHooks(false)) {
            			if (hook.getId()
            					.equals(CViewPlugin.extractId(SelectExportDialog.itemSelected))) {
            				selectedHook = hook;
            				break;
            			}
            		}
            		
            		if (selectedHook != null) {
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
            				
            				// After selecting the file name call the external export model method
            				ExportHandler.exportModel(fileToWrite, selectedHook);
            			}
            		}
            	}
            }

            return null;
        }

        if (commandId.equals(CMD_FILTER_ID)) {
            boolean ok = FilterDialog.showDialog();
            if (ok) {
        		// Apply filter
            	if(CViewPlugin.isDiagramSynthesisActive) {
            		CViewPlugin.refreshCView(true);            		
            	}
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
                	// TODO @cmot: Show a warning if applicable before executing the rebuild and refresh
                	if(showWarning() && CViewPlugin.isDiagramSynthesisActive) {
                		// Apply filter
                		if(CViewPlugin.deactivateVisualization) {
                			CViewPlugin.rebuildModelNoRefresh(true);
                		} else {
                			CViewPlugin.rebuildModelAndrefreshCView(true);                			
                		}
                	}
                }
            }

            return null;
        }
        
        if(commandId.equals(CMD_REFRESH_ID)) {
        	CViewPlugin.refreshPressed = true;
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
        // Show a warning if applicable before rebuilding and refreshing
        if(showWarning()) {
        	if(CViewPlugin.deactivateVisualization) {
        		CViewPlugin.rebuildModelNoRefresh(changedExpandedSliderValue);
        	} else {
        		CViewPlugin.rebuildModelAndrefreshCView(changedExpandedSliderValue);            		        		
        	}
        }
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
    
    /** 
     * TODO @cmot
     * Shows a warning, if the option is set to true and enough files and folders are selected
     * 
     * @return @true, if a warning was shown and "Yes" was selected or if no warning was shown. @false, if "No" was selected
     */
    private boolean showWarning() {
    	if(CViewPlugin.showWarning && KLighDController.getSelectionCount() > CViewPlugin.hugeAnalysis) {
    		int returnVal = new LargeSynthesisWarning(new Shell(), KLighDController.getSelectionCount()).open();
    		return (returnVal == 0);
    	} else {
    		return true;
    	}
    }
    
    // -------------------------------------------------------------------------
    
}
