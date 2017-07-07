package de.cau.cs.kieler.cview;

import org.eclipse.ui.IStartup;

import com.google.inject.Guice;

public class Startup implements IStartup {

    @Override
    public void earlyStartup() {
        System.out.println("+++ STARTUP +++");
        KLighDController controller = Guice.createInjector().getInstance(KLighDController.class);
        //return pts2sccharts.transform(model);
        //new KLighDController();
    }

}
