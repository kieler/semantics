package de.cau.cs.kieler.synccharts;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ui.IStartup;
import org.eclipse.xtend.typesystem.emf.check.CheckRegistry;

public class RegisterCheckValidator implements IStartup {

    
    public void earlyStartup() {
        CheckRegistry.getInstance().registerCheckFile(
                SyncchartsPackage.eINSTANCE, "model/SyncchartsChecks.chk", false, new ArrayList());
    }

}
