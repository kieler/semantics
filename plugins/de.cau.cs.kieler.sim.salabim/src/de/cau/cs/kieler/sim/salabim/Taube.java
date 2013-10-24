package de.cau.cs.kieler.sim.salabim;

import org.eclipse.ui.IStartup;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Taube implements BundleActivator, IStartup {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Taube.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Taube.context = null;
	}
	
	/**
	* {@inheritDoc}
	*/
	public void earlyStartup() {
	    System.out.println("\n");
            System.out.println("One dream, one soul, one prize");
            System.out.println("One goal, one golden glance of what should be");
            System.out.println("It's a kind of magic");
            System.out.println();
            String queen =          
                "            o\n" 
                + "          o^\\^o\n"
                + "     o\\*`'.\\|/.'`*/o\n"
                + "      \\\\\\\\\\\\|//////\n"
                + "       {><><@><><}\n"
                + "      }}} _   _ {{{\n"
                + "    }}}}  6   6  {{{\n"
                + "   {{{{{    ^    }}}}}\n"
                + "  {{{{{{\\  -=-  /}}}}}}\n"
                + "  {{{{{{{;.___.;}}}}}}}\n"
                + "   {{{{{{{)   (}}}}}}}'\n"
                + "    `\"\"'\"':   :'\"'\"'`\n"
                + "           `@`\n";
            System.out.println(queen);
	}

}
