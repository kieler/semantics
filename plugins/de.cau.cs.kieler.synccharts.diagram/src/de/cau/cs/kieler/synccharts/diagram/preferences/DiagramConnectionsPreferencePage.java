package de.cau.cs.kieler.synccharts.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.ui.preferences.ComboFieldEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import de.cau.cs.kieler.core.ui.figures.SplineConnection;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionEditPart;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

    /**
     * @generated
     */
    public DiagramConnectionsPreferencePage() {
        setPreferenceStore(SyncchartsDiagramEditorPlugin.getInstance().getPreferenceStore());
    }

    /**
     * @generated
     */
    private String SPLINE_LABEL = "Spline Mode:";
    /**
     * @generated
     */
    private ComboFieldEditor splineModeFieldEditor = null;

    /**
     * @generated
     */
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

    /**
     * @generated
     */
    public static void initDefaults(IPreferenceStore preferenceStore) {
        ConnectionsPreferencePage.initDefaults(preferenceStore);
        preferenceStore.setDefault(SplineConnection.PREF_SPLINE_MODE, SplineConnection.SPLINE_OFF);
    }

    /**
     * @generated
     */
    @Override
    public boolean performOk() {
        boolean ok = super.performOk();
        IWorkbench wb = PlatformUI.getWorkbench();
        if (wb != null) {
            IWorkbenchWindow wbw = wb.getActiveWorkbenchWindow();
            if (wbw != null) {
                IWorkbenchPage wbp = wbw.getActivePage();
                if (wbp != null) {
                    IEditorReference[] ers = wbp.getEditorReferences();
                    for (IEditorReference er : ers) {
                        IEditorPart editor = er.getEditor(true);
                        if (editor instanceof SyncchartsDiagramEditor) {
                            SyncchartsDiagramEditor sde = (SyncchartsDiagramEditor) editor;
                            applySplineMode(sde.getDiagramEditPart());
                        }
                    }
                }
            }
        }
        return ok;
    }

    /**
     * @generated
     */
    protected void applySplineMode(EditPart part) {
        if (part instanceof TransitionEditPart) {
            Connection c = ((TransitionEditPart) part).getConnectionFigure();
            if (c instanceof SplineConnection) {
                ((SplineConnection) c).setSplineMode(getPreferenceStore().getInt(
                        SplineConnection.PREF_SPLINE_MODE));
            }
        }
        if (part instanceof ShapeNodeEditPart) {
            ShapeNodeEditPart state = (ShapeNodeEditPart) part;
            for (Object so : state.getSourceConnections()) {
                if (so instanceof EditPart) {
                    applySplineMode((EditPart) so);
                }
            }
            for (Object to : state.getSourceConnections()) {
                if (to instanceof EditPart) {
                    applySplineMode((EditPart) to);
                }
            }
        }
        for (Object child : part.getChildren()) {
            if (child instanceof EditPart) {
                applySplineMode((EditPart) child);
            }
        }
    }

}
