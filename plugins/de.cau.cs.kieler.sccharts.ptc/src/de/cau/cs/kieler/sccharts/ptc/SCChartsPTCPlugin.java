package de.cau.cs.kieler.sccharts.ptc;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class SCChartsPTCPlugin extends AbstractUIPlugin {

    static final String CONSOLE_NAME = "PTC IM Statechart 2 SCChart Importer";
    static final String CONSOLEVIEWID = "org.eclipse.ui.console.ConsoleView";

	// The plug-in ID
	public static final String PLUGIN_ID = "de.cau.cs.kieler.sccharts.ptc"; //$NON-NLS-1$

	// The shared instance
	private static SCChartsPTCPlugin plugin;
	
	/**
	 * The constructor
	 */
	public SCChartsPTCPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static SCChartsPTCPlugin getDefault() {
		return plugin;
	}
	
	
	public static void clearConosle() {
        MessageConsole console = findConsole(CONSOLE_NAME);
        console.clearConsole();
        bringToFront();
	}
	
	public static void printConsole(String text) {
	    MessageConsole console = findConsole(CONSOLE_NAME);
        MessageConsoleStream consoleStream = console.newMessageStream();
        consoleStream.println(text);
	}
	
    private static MessageConsole findConsole(String name) {
        ConsolePlugin plugin = ConsolePlugin.getDefault();
        IConsoleManager conMan = plugin.getConsoleManager();
        IConsole[] existing = conMan.getConsoles();
        for (int i = 0; i < existing.length; i++) {
            if (name.equals(existing[i].getName()))
                return (MessageConsole)existing[i];
        }
        // no console found, so create a new one
        MessageConsole myConsole = new MessageConsole(name, null);
        // conMan.addConsoles(new IConsole[] { myConsole });
        IConsole[] consoles = {myConsole};
        conMan.addConsoles(consoles);
        return myConsole;
    }
    
    private static void bringToFront() {
        Display.getDefault().syncExec(new Runnable() {
            
            @Override
            public void run() {
              try {
              IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
              IViewPart vP = window.getActivePage().showView(CONSOLEVIEWID);
              vP.setFocus();
          // set done flag
          } catch (Exception e) {
              // ignore if we cannot bring it to front
          }
            }
        });
    }
    
	

}
