/**
 * 
 */
package de.cau.cs.kieler.synccharts.textual.kits.serialization;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;

import de.cau.cs.kieler.synccharts.Effect;
import de.cau.cs.kieler.synccharts.Expression;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.Variable;

/**
 * @author oba
 * 
 */
public class KitsTransientValueService implements ITransientValueService {
    private static SyncchartsPackage syncPack = SyncchartsPackage.eINSTANCE;

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.xtext.parsetree.reconstr.ITransientValueService#isMixedList
     * (org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature)
     */
    public boolean isMixedList(EObject owner, EStructuralFeature feature) {
        if (!(owner.eIsSet(feature))) {
            return true;
        }
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.xtext.parsetree.reconstr.ITransientValueService#isTransient
     * (org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature,
     * int)
     */
    public boolean isTransient(EObject owner, EStructuralFeature feature,
            int index) {

        if (
        // if the feature is not set
        (!(owner.eIsSet(feature)))
        // State > ParentRegion,SuspensionTrigger, StateType
                || (owner instanceof State
                        && ((feature.equals(syncPack.getState_ParentRegion()))
                                || (feature.equals(syncPack
                                        .getState_SuspensionTrigger())) || (feature
                                .equals(syncPack.getState_Type()) && feature
                                .getDefaultValue().equals(
                                        syncPack.getState_Type()))) || (feature
                        .equals(syncPack.getState_Label()) && isStateIdEqualToLabel(
                        (State) owner, feature))

                )
                // Region > ParentState
                || (owner instanceof Region && (feature.equals(syncPack
                        .getRegion_ParentState())))
                // Expression > ParentAction, ParentAssignment, ParentExpression
                || (owner instanceof Expression && ((feature.equals(syncPack
                        .getExpression_ParentAction()))
                        || (feature.equals(syncPack
                                .getExpression_ParentAssignment()))
                        || (feature.equals(syncPack
                                .getExpression_ParentEmisson())) || (feature
                        .equals(syncPack.getExpression_ParentExpression()))))
                // Effect > ParentEAction
                || (owner instanceof Effect && (feature.equals(syncPack
                        .getEffect_ParentEAction())))
                // Signal > ParentRegion, ParentState
                || (owner instanceof Signal && ((feature.equals(syncPack
                        .getSignal_ParentRegion())) || (feature.equals(syncPack
                        .getSignal_ParentState()))))
                // Variable > ParentRegion
                || (owner instanceof Variable && (feature.equals(syncPack
                        .getVariable_ParentRegion())))
                // Transition > unset SourceState
                || (owner instanceof Transition && ((feature.equals(syncPack
                        .getTransition_SourceState())) ||
                // also do not serialize the priorities of transitions because
                // they will be derived from the preferences set by the user in
                // the GMF diagram or from the order
                // of their appearances in the text file
                (feature.equals(syncPack.getTransition_Priority()))))

        /**
         * It is important that you mark features that are not set as transient.
         * See
         * {@link org.eclipse.xtext.parsetree.reconstr.impl. DefaultTransientValueService}
         */
        ) {
            if (owner instanceof State
                    && (feature.equals(syncPack.getState_Type()) && feature
                            .getDefaultValue().equals(syncPack.getState_Type()))) {
                System.out.println(feature.getName());
                System.out.println("state type is NORMAL and not COND or REF");
            }
            // System.out.println("=============================================");
            // System.out.println("======== NOT SERIALIZED =======");
            // System.out.println("owner: " + owner.toString());
            // System.out.println("feature " + feature.getName());
            // System.out.println("=============================================");
            return true;
        }
        return false;
    }

    /**
     * The feature of the state If the state label and ID are equal, set the
     * label as transient
     * 
     * @param state
     *            The state to be serialized
     * @param feature
     *            The feature to be serialized
     * 
     * 
     */
    private boolean isStateIdEqualToLabel(State state,
            EStructuralFeature feature) {

        if (!((state.getLabel() == null || state.getId() == null))) {
            String trimmedLabel = state.getLabel().trim();
            String trimmedId = state.getId().trim();

            if (feature.equals(syncPack.getState_Label())
                    && (trimmedLabel.equals(trimmedId))) {
                // System.out.println("SET label transient");
                // feature.setTransient(true);
                return true;

            }
        }
        return false;

    }
}
