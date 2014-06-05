package de.cau.cs.kieler.kico.web;
import org.eclipse.ui.IStartup;

import com.google.inject.Guice;


public class KiCoWebStartup implements IStartup {

    public void earlyStartup() {
        if (KiCoWebPlugin.loadEnabled()) {
            if (KiCoWebPlugin.getServer() == null) {
                KiCoWebServer newServer =
                        Guice.createInjector().getInstance(KiCoWebServer.class);
                KiCoWebPlugin.setServer(newServer);
                KiCoWebPlugin.getServer().schedule();
            }
        }

    }

}
