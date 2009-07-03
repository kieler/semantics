package de.cau.cs.kieler.synccharts.dsl;

import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.LanguageUtilities;
import org.osgi.framework.BundleContext;

public class ScdslEditorPlugin extends AbstractXtextEditorPlugin {
   private static ScdslEditorPlugin plugin;
   public static ScdslEditorPlugin getDefault() {
      return plugin;
   }

   private ScdslUtilities utilities = new ScdslUtilities();
   public LanguageUtilities getUtilities() {
      return utilities;
   }

   public ScdslEditorPlugin() {
      plugin = this;
   }

   public void stop(BundleContext context) throws Exception {
      super.stop(context);
      plugin = null;
   }
}
