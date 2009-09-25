package de.cau.cs.kieler.synccharts.labelparser.bridge;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import de.cau.cs.kieler.synccharts.SyncchartsPackage;


public class ActionLabelParserConstraint extends AbstractModelConstraint {

    public ActionLabelParserConstraint() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public IStatus validate(IValidationContext ctx) {
            if( ctx.getFeature().equals(SyncchartsPackage.eINSTANCE.getAction_TriggersAndEffects()) ){
                return ctx.createFailureStatus("MyError");
            }
            return ctx.createSuccessStatus(); 
            
    }

}
