package de.cau.cs.kieler.synccharts.text.kits.ui;

/**
 * Use this class to register components to be used within the IDE.
 * 
 * @author chsch
 */
public class KitsUiModule extends de.cau.cs.kieler.synccharts.text.kits.ui.AbstractKitsUiModule {
	public KitsUiModule(org.eclipse.ui.plugin.AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	/* get rid of the dawn XtextNature question */
	public Class<? extends org.eclipse.xtext.ui.editor.IXtextEditorCallback> bindIXtextEditorCallback() {
		return org.eclipse.xtext.ui.editor.IXtextEditorCallback.NullImpl.class;
	}

	/* declare '-->' '>->' to be highlighted like usual keywords */
	public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.antlr.DefaultAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
    	return CustomAntlrTokenToAttributeIdMapper.class;
    }
	
	/* the registration in KitsRuntimeModule will be overwritten by DefaultUIModule so it is here again */
	public Class<? extends org.eclipse.xtext.formatting.IIndentationInformation> bindIIndentationInformation() {
		return de.cau.cs.kieler.synccharts.text.kits.formatting.KitsIndentionInformation.class;
	}
	
}
