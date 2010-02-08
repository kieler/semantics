package de.cau.cs.kieler.synccharts.diagram.preferences;

import org.eclipse.gmf.runtime.common.ui.preferences.ComboFieldEditor;
import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;

import de.cau.cs.kieler.core.ui.figures.SplineConnection;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditorPlugin;

/**
 * @generated NOT
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

    /**
     * @generated
     */
    public DiagramConnectionsPreferencePage() {
        setPreferenceStore(SyncchartsDiagramEditorPlugin.getInstance().getPreferenceStore());
    }

    // temporary spline code
    private String SPLINE_LABEL = "Spline Mode:";

    private ComboFieldEditor splineModeFieldEditor = null;

    protected void addFieldEditors(Composite composite) {
        super.addFieldEditors(composite);

        // spline mode
        splineModeFieldEditor = new ComboFieldEditor(SplineConnection.PREF_SPLINE_MODE,
                SPLINE_LABEL, composite, ComboFieldEditor.INT_TYPE, true, 0, 0, true);
        splineModeFieldEditor.autoStorage = true;
        addField(splineModeFieldEditor);
        Combo splineModeCombo = splineModeFieldEditor.getComboControl();
        splineModeCombo.add("Off");
        splineModeCombo.add("On (cubic sections)");
        splineModeCombo.add("On (cubic sections approximation)");
    }

    public static void initDefaults(IPreferenceStore preferenceStore) {
        ConnectionsPreferencePage.initDefaults(preferenceStore);
        preferenceStore.setDefault(SplineConnection.PREF_SPLINE_MODE, SplineConnection.SPLINE_OFF);
    }
}
