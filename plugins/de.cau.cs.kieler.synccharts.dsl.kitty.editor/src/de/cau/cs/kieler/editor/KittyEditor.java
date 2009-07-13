package de.cau.cs.kieler.editor;

import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.editor.AbstractXtextEditor;

import de.cau.cs.kieler.KittyEditorPlugin;

public class KittyEditor extends AbstractXtextEditor {

   public AbstractXtextEditorPlugin getPlugin() {
      return KittyEditorPlugin.getDefault();
   }
}
