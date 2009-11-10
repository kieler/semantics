package de.cau.cs.kieler.synccharts;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ui.IStartup;
import org.eclipse.xtend.typesystem.emf.check.CheckRegistry;

public class RegisterCheckValidator implements IStartup {

    
    public void earlyStartup() {
        //normal SyncChart checks
        CheckRegistry.getInstance().registerCheckFile(
                SyncchartsPackage.eINSTANCE, "model/SyncchartsChecks.chk", false, new ArrayList());
        
        //additional checks for KLEPTO simulation restrictions
        CheckRegistry.getInstance().registerCheckFile(
                SyncchartsPackage.eINSTANCE, "model/SyncchartsKleptoChecks.chk", false, new ArrayList());
    }

}
