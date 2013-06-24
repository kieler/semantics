package de.cau.cs.kieler.scl.validation;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;
import org.yakindu.sct.model.stext.stext.AssignmentExpression;
import org.yakindu.sct.model.stext.stext.ElementReferenceExpression;
import org.yakindu.sct.model.stext.stext.EventDefinition;
import org.yakindu.sct.model.stext.stext.StextPackage;

import de.cau.cs.kieler.scl.scl.Program;
 

public class SCLJavaValidator extends AbstractSCLJavaValidator {

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}

    @Override
    protected List<EPackage> getEPackages() {
        List<EPackage> result = super.getEPackages();
        result.add(StextPackage.eINSTANCE);
        return result;
    }
    
    @Check
    public void checkElementReferenceExpression(AssignmentExpression assignment) {
//        if (eo instanceof AssignmentExpression) {
//            AssignmentExpression assignment = (AssignmentExpression) eo;
//            if (assignment.getVarRef() instanceof ElementReferenceExpression) {
//                ElementReferenceExpression ref = (ElementReferenceExpression) assignment
//                        .getVarRef();
//                if (ref.getReference() instanceof EventDefinition) {
//                    return;
//                }
//            }
//            error("HUHU", null);//, eo, StextPackage.eINSTANCE.getElementReferenceExpression_Reference(), -1);
//        }
    }
    
//    @Check
//    public void test(Program p) {
//        info("TEST", null);
//    }
}
