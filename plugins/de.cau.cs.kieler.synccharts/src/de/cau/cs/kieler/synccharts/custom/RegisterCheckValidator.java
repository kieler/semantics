package de.cau.cs.kieler.synccharts.custom;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ui.IStartup;
import org.eclipse.xtend.typesystem.emf.check.CheckRegistry;

import de.cau.cs.kieler.synccharts.SyncchartsPackage;

public class RegisterCheckValidator implements IStartup {

    
    public void earlyStartup() {
        //normal SyncChart checks
        CheckRegistry.getInstance().registerCheckFile(
                SyncchartsPackage.eINSTANCE, "model/SyncchartsChecks.chk", false, new ArrayList());
        
        //additional checks for KLEPTO simulation restrictions
        CheckRegistry.getInstance().registerCheckFile(
                SyncchartsPackage.eINSTANCE, "model/SyncchartsKleptoChecks.chk", true, new ArrayList());
    }

}
