package de.cau.cs.kieler.synccharts.diagram.preferences;

import org.eclipse.gmf.runtime.common.ui.preferences.CheckBoxFieldEditor;
import org.eclipse.gmf.runtime.diagram.ui.preferences.DiagramsPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Composite;

import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditorPlugin;
import de.cau.cs.kieler.synccharts.labelparser.bridge.LabelParserBridgePlugin;

/**
 * @generated
 */
public class DiagramGeneralPreferencePage extends DiagramsPreferencePage {

    /**
     * @generated
     */
    public DiagramGeneralPreferencePage() {
        setPreferenceStore(SyncchartsDiagramEditorPlugin.getInstance()
                .getPreferenceStore());
    }

    // soh: adding optional enabling and disabling of automated serialization in
    // labelparser
    /**
     * @generated
     */
    private String AUTO_SERIALIZE_LABEL = "Perform automated serialization";

    /**
     * @generated
     */
    private static String AUTO_SERIALIZE_PREF = LabelParserBridgePlugin.AUTO_SERIALIZE;

    /**
     * @generated
     */
    private static IPreferenceStore LABEL_PARSER_STORE = LabelParserBridgePlugin
            .getDefault().getPreferenceStore();

    /**
     * @generated
     */
    private CheckBoxFieldEditor autoSerializeEditor = null;

    /**
     * @generated
     */
    private static final String AUTO_SERIALIZE_TOOLTIP = "Automatic Serialization of expressions causes labels to be displayed "
            + "how the parser interprets them. However this deletes all custom formatting "
            + "e.g. line breaks.";

    /**
     * @generated
     */
    @Override
    protected void addFields(Composite composite) {
        super.addFields(composite);

        // automated serialization
        autoSerializeEditor = new CheckBoxFieldEditor(AUTO_SERIALIZE_PREF,
                AUTO_SERIALIZE_LABEL, composite);
        LABEL_PARSER_STORE.setDefault(AUTO_SERIALIZE_PREF, true);
        autoSerializeEditor.setPreferenceStore(LABEL_PARSER_STORE);
        autoSerializeEditor.load();
        autoSerializeEditor.getCheckbox()
                .setToolTipText(AUTO_SERIALIZE_TOOLTIP);
    }

    /**
     * @generated
     */
    @Override
    public boolean performOk() {
        boolean result = super.performOk();
        autoSerializeEditor.store();
        return result;
    }

}
