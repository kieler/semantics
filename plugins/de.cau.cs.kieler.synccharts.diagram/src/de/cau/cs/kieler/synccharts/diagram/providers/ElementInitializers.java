package de.cau.cs.kieler.synccharts.diagram.providers;

import org.eclipse.emf.ecore.EcorePackage;

import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.diagram.expressions.SyncchartsAbstractExpression;
import de.cau.cs.kieler.synccharts.diagram.expressions.SyncchartsOCLFactory;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

    protected ElementInitializers() {
        // use #getInstance to access cached instance
    }

    /**
     * @generated
     */
    public void init_Transition_4005(Transition instance) {
        try {
            instance.setDelay(1);
            Object value_1 = SyncchartsOCLFactory.getExpression(0,
                SyncchartsPackage.eINSTANCE.getTransition(), null).evaluate(instance);

            value_1 = SyncchartsAbstractExpression.performCast(value_1,
                EcorePackage.eINSTANCE.getEInt());
            instance.setPriority(((Integer) value_1).intValue());
        } catch (RuntimeException e) {
            SyncchartsDiagramEditorPlugin.getInstance()
                .logError("Element initialization failed", e); //$NON-NLS-1$						
        }
    }

    /**
     * @generated
     */
    public static ElementInitializers getInstance() {
        ElementInitializers cached = SyncchartsDiagramEditorPlugin.getInstance()
            .getElementInitializers();
        if (cached == null) {
            SyncchartsDiagramEditorPlugin.getInstance().setElementInitializers(
                cached = new ElementInitializers());
        }
        return cached;
    }
}
