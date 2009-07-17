package de.cau.cs.kieler.synccharts.dsl.editor;

import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.editor.AbstractXtextEditor;

import de.cau.cs.kieler.synccharts.dsl.ScdslEditorPlugin;

public class ScdslEditor extends AbstractXtextEditor {

   public AbstractXtextEditorPlugin getPlugin() {
      return ScdslEditorPlugin.getDefault();
   }
}
