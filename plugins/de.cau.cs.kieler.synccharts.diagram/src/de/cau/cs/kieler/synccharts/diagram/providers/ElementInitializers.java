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
    /**
     * @generated
     */
    public static void init_Transition_4001(Transition instance) {
        try {
            instance.setDelay(1);
            Object value_1 = SyncchartsOCLFactory.getExpression(
                    "self.sourceState.outgoingTransitions->size()",
                    SyncchartsPackage.eINSTANCE.getTransition()).evaluate(
                    instance);

            value_1 = SyncchartsAbstractExpression.performCast(value_1,
                    EcorePackage.eINSTANCE.getEInt());
            instance.setPriority(((Integer) value_1).intValue());
        } catch (RuntimeException e) {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Element initialization failed", e); //$NON-NLS-1$						
        }
    }

}
