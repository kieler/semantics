package de.cau.cs.kieler.kico.web.ui;

import org.eclipse.ui.IStartup;

import de.cau.cs.kieler.kico.web.KiCoWebPlugin;


public class KiCoWebStartup implements IStartup {

    public void earlyStartup() {
        if (KiCoWebPlugin.loadEnabled()) {
            KiCoWebPlugin.startServer();
        }
    }

}
