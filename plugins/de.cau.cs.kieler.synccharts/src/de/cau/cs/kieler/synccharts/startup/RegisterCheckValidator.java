package de.cau.cs.kieler.synccharts.startup;

import java.util.ArrayList;

import org.eclipse.ui.IStartup;

import de.cau.cs.kieler.core.model.util.ValidationManager;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

/**
 * Registers/deregisters the checkfiles.
 * 
 * @author haf
 */
public class RegisterCheckValidator implements IStartup {

    /**
     * Constant for accessing the synccharts checks in the validation manager.
     */
    public static final String SYNCCHARTS_CHECKS = "model/SyncchartsChecks.chk";

    /**
     * Constant for accessing the klepto checks in the validation manager.
     */
    public static final String SYNCCHARTS_KLEPTO_CHECKS = "model/SyncchartsKleptoChecks.chk";

    /**
     * 
     * {@inheritDoc}
     */
    public void earlyStartup() {
        registerChecks();
    }

    /**
     * Registers the checkfiles to the synccharts editor.
     * 
     */
    public static void registerChecks() {
        // normal SyncChart checks
        ValidationManager.registerCheckFile(SyncchartsPackage.eINSTANCE,
                SYNCCHARTS_CHECKS, false, new ArrayList<String>(),
                "Checks whether the syncchart is valid.");

        // additional checks for KLEPTO simulation restrictions
        ValidationManager.registerCheckFile(SyncchartsPackage.eINSTANCE,
                SYNCCHARTS_KLEPTO_CHECKS, true, new ArrayList<String>(),
                "Check whether the syncchart can be simulated with Klepto.");
    }
}
