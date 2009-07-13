package de.cau.cs.kieler;

import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.LanguageUtilities;
import org.osgi.framework.BundleContext;

public class KittyEditorPlugin extends AbstractXtextEditorPlugin {
   private static KittyEditorPlugin plugin;
   public static KittyEditorPlugin getDefault() {
      return plugin;
   }

   private KittyUtilities utilities = new KittyUtilities();
   public LanguageUtilities getUtilities() {
      return utilities;
   }

   public KittyEditorPlugin() {
      plugin = this;
   }

   public void stop(BundleContext context) throws Exception {
      super.stop(context);
      plugin = null;
   }
}
