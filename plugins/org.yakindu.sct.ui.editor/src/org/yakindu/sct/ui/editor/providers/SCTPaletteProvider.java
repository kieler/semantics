package org.yakindu.sct.ui.editor.providers;

import java.util.Map;

import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gmf.runtime.diagram.ui.providers.DefaultPaletteProvider;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.yakindu.sct.ui.editor.module.SCTModule;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

@Singleton
public class SCTPaletteProvider extends DefaultPaletteProvider {

	@Inject
	private ISCTPaletteFactory factory;
	@Inject
	@Named(SCTModule.FILE_EXTENSION)
	private String languageName;

	public void contributeToPalette(IEditorPart editor, Object content,
			PaletteRoot root,
			@SuppressWarnings("rawtypes") Map predefinedEntries) {

		IFileEditorInput editorInput = (IFileEditorInput) editor
				.getEditorInput();
		if (editorInput.getFile().getFileExtension().equals(languageName)) {
			factory.createPaletteEntries(root);
		}
	}

}
