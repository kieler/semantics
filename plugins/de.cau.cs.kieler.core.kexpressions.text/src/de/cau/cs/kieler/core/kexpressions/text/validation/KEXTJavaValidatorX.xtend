package de.cau.cs.kieler.core.kexpressions.text.validation

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.EcoreUtil2
import de.cau.cs.kieler.core.kexpressions.text.kext.Kext
import de.cau.cs.kieler.core.annotations.StringAnnotation
import de.cau.cs.kieler.core.kexpressions.keffects.Assignment
import de.cau.cs.kieler.core.kexpressions.text.kext.AnnotatedExpression
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference

/**
 * Validator for KEXT files
 * 
 * @author ssm
 * @kieler.design 2016-02-17 proposed 
 * @kieler.rating 2016-02-17 yellow proposed
 * 
 */

class KEXTJavaValidatorX extends de.cau.cs.kieler.core.kexpressions.text.validation.AbstractKEXTJavaValidator {
	
	public static val CHECK_ANNOTATION_NAME = "check"
	public static val CHECKALIAS_ANNOTATION_NAME = "aliasCheck"
	
	public static val CHECK_ANNOTATION_ID_ALREADY_EXISTS = "The ID of a check annotation must be unique!";
	public static val CHECK_CHECKALIAS_ANNOTATION_MATCHES_NOTHING = "The alias check reference matches nothing!"
	
    @Check
    public def void checkCheckAnnotation(de.cau.cs.kieler.core.kexpressions.text.kext.TestEntity testEntity) {
    	val rootElement = EcoreUtil2.getRootContainer(testEntity) as Kext;
    	val ownCheckId = testEntity.eAllContents.filter(StringAnnotation).filter[ name.equals(CHECK_ANNOTATION_NAME) ].head.values.head 
    	
    	val identicalCheckIds = rootElement.eAllContents.filter(StringAnnotation).
    		filter[ name.equals(CHECK_ANNOTATION_NAME) && values.head.equals(ownCheckId) ].toList
		
		if (identicalCheckIds.size > 1) {
			for(checkId : identicalCheckIds) {
				error(CHECK_ANNOTATION_ID_ALREADY_EXISTS, checkId, null, -1)
			}
		}    	
    }
    
    @Check
    public def void checkCheckAliasAnnotation(StringAnnotation stringAnnotation) {
    	if (!stringAnnotation.name.equals(CHECKALIAS_ANNOTATION_NAME)) { return; }
    	val parent = stringAnnotation.eContainer
    	val VOs = <ValuedObject> newArrayList
    	if (parent instanceof Assignment) {
    		VOs += parent.valuedObject
    		if (parent.expression instanceof ValuedObjectReference) {
    			VOs += (parent.expression as ValuedObjectReference).valuedObject
   			} else {
   				VOs += parent.expression.eAllContents.filter(ValuedObjectReference).map[ valuedObject ].toList
   			}
    	} else if (parent instanceof AnnotatedExpression) {
    		if (parent.expression instanceof ValuedObjectReference) {
    			VOs += (parent.expression as ValuedObjectReference).valuedObject
   			} else {
   				VOs += parent.expression.eAllContents.filter(ValuedObjectReference).map[ valuedObject ].toList
   			}
    	}
    	
    	val matches = VOs.filter[ name.equals(stringAnnotation.values.head) ]
    	if (matches.empty) {
    		warning(CHECK_CHECKALIAS_ANNOTATION_MATCHES_NOTHING, stringAnnotation, null, -1)
    	}
    	
    }    
	
}