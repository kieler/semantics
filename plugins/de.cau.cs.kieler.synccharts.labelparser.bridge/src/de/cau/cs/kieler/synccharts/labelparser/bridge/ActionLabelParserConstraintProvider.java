package de.cau.cs.kieler.synccharts.labelparser.bridge;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.IModelConstraint;
import org.eclipse.emf.validation.model.ModelConstraint;
import org.eclipse.emf.validation.service.IConstraintDescriptor;
import org.eclipse.emf.validation.service.IModelConstraintProvider;

import de.cau.cs.kieler.synccharts.SyncchartsPackage;


public class ActionLabelParserConstraintProvider implements
    IModelConstraintProvider  {

    /* (non-Javadoc)
     * @see org.eclipse.emf.validation.service.IModelConstraintProvider#getBatchConstraints(org.eclipse.emf.ecore.EObject, java.util.Collection)
     */
    public Collection<IModelConstraint> getBatchConstraints(EObject eObject,
            Collection<IModelConstraint> constraints) {
        return new ArrayList<IModelConstraint>();
    }

    /* (non-Javadoc)
     * @see org.eclipse.emf.validation.service.IModelConstraintProvider#getLiveConstraints(org.eclipse.emf.common.notify.Notification, java.util.Collection)
     */
    public Collection<IModelConstraint> getLiveConstraints(
            Notification notification, Collection<IModelConstraint> constraints) {
        if(constraints == null)
            constraints = new ArrayList<IModelConstraint>();
        constraints.add(new ActionLabelParserConstraint(null));
        return constraints;
    }
    
    class ActionLabelParserConstraint extends ModelConstraint{

        /** Construct with the provided non-null constraint descriptor.
         * @param descriptor non-null constraint descriptor
         */
        public ActionLabelParserConstraint(IConstraintDescriptor descriptor) {
            super(descriptor);
        }

        /* (non-Javadoc)
         * @see org.eclipse.emf.validation.model.IModelConstraint#validate(org.eclipse.emf.validation.IValidationContext)
         */
        public IStatus validate(IValidationContext ctx) {
            if( ctx.getFeature().equals(SyncchartsPackage.eINSTANCE.getAction_TriggersAndEffects()) ){
                return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "This is a faulty label.");
            }
            return new Status(IStatus.OK, Activator.PLUGIN_ID, "Ok");
        }
        
    }

}
