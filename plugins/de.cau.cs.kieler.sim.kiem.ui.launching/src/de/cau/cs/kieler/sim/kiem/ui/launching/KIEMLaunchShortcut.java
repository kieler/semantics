package de.cau.cs.kieler.sim.kiem.ui.launching;

import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;

public class KIEMLaunchShortcut implements ILaunchShortcut {
    
    public static String KIEM_LAUNCH_TYPE = "de.cau.cs.kieler.sim.kiem.ui.launching.KIEM";
    private static final String ATTR_BATCH_PATH = "PATH_TO_BATCH_FILE"; 

    public void launch(ISelection selection, String mode) {
        System.out.println("LAUNCH SELECTION" + selection.toString() + ", " + mode);

        ILaunchManager lm = DebugPlugin.getDefault().getLaunchManager();
        ILaunchConfigurationType type = lm.getLaunchConfigurationType(KIEM_LAUNCH_TYPE);
//        ILaunchConfigurationWorkingCopy wcopy = type.newInstance(null, file.getName());
//        wcopy.setAttribute(ATTR_BATCH_SCRIPT, path);
//        ILaunchConfiguration configuration = wcopy.doSave();
//        DebugUITools.launch(configuration, mode);         
    }

    public void launch(IEditorPart editor, String mode) {
        System.out.println("LAUNCH EDITOR" +editor.toString() + ", " + mode);
    }

}
