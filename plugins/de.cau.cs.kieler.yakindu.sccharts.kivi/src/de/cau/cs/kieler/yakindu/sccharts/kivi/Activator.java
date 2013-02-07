package de.cau.cs.kieler.yakindu.sccharts.kivi;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
* The activator class controls the plug-in life cycle.
* 
* @author mmu
* @kieler.ignore (excluded from review process)
*/
public class Activator extends AbstractUIPlugin {

   /**
    * The plug-in ID.
    */
   public static final String PLUGIN_ID = "de.cau.cs.kieler.yakindu.sccharts.kivi"; //$NON-NLS-1$

   // The shared instance
   private static Activator plugin;

   /**
    * The constructor.
    */
   public Activator() {
   }

   /**
    * {@inheritDoc}
    */
   public void start(final BundleContext context) throws Exception {
       super.start(context);
       plugin = this;
   }

   /**
    * {@inheritDoc}
    */
   public void stop(final BundleContext context) throws Exception {
       plugin = null;
       super.stop(context);
   }

   /**
    * Returns the shared instance.
    * 
    * @return the shared instance
    */
   public static Activator getDefault() {
       return plugin;
   }

}
