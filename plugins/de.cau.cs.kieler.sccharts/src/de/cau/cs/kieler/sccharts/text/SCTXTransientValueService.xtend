/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.text

import de.cau.cs.kieler.annotations.Annotatable
import de.cau.cs.kieler.annotations.AnnotationsPackage
import de.cau.cs.kieler.annotations.BooleanAnnotation
import de.cau.cs.kieler.annotations.ContainmentAnnotation
import de.cau.cs.kieler.annotations.FloatAnnotation
import de.cau.cs.kieler.annotations.ImportAnnotation
import de.cau.cs.kieler.annotations.IntAnnotation
import de.cau.cs.kieler.annotations.ReferenceAnnotation
import de.cau.cs.kieler.kexpressions.CombineOperator
import de.cau.cs.kieler.kexpressions.KExpressionsPackage
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCChartsPackage
import de.cau.cs.kieler.sccharts.Scope
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService

/** 
 * Custom {@link ITransientValueService} contributing to Sct serialization. Besides the usual
 * references {@link SctValueSerializer} also delegates to this class.
 * 
 * @author chsch
 */
class SCTXTransientValueService extends DefaultTransientValueService {
    
    static val sccPkg = SCChartsPackage.eINSTANCE
    static val annoPkg = AnnotationsPackage.eINSTANCE
    static val kexPkg = KExpressionsPackage.eINSTANCE

    override isCheckElementsIndividually(EObject owner, EStructuralFeature feature) {

        if (feature == annoPkg.getAnnotatable_Annotations) {
            return true;
        }
        return false;
    }

    /** 
     * Decides whether an owner's feature (or one of its elements are not to be serialized).
     */
    override boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
        // Suppress the implicit (mostly EOpposites) features
        if (feature === sccPkg.getState_ParentRegion ||
            feature === sccPkg.getState_IncomingTransitions ||
            feature === sccPkg.getRegion_ParentState ||
            feature === sccPkg.getTransition_SourceState) {
            return true
        }
        // Suppress label if equals id
        if (feature === sccPkg.getScope_Label) {
            if (owner instanceof Scope) {
                return (owner.label === null || owner.label.equals(owner.name))
            }
        }
        // Suppress id serialization if id is equals to ""
        if (feature === annoPkg.getNamedObject_Name) {
            if (owner instanceof Region) {
                return owner.name.nullOrEmpty
            }
        }
        // Suppress the 'initialValue' feature if null or ""
        if (feature === kexPkg.getValuedObject_InitialValue) {
            return owner.eGet(feature) === null
        }
        // Suppress combine operator NONE
        if (feature === kexPkg.getValuedObject_CombineOperator) {
            return owner.eGet(feature).equals(CombineOperator.NONE)
        }
        // Some annotation cannot be serialized and are skipped here
        if (feature === annoPkg.getAnnotatable_Annotations) {
            if (owner instanceof Annotatable) {
                val anno = owner.annotations.get(index)
                if (anno instanceof ReferenceAnnotation ||
                    anno instanceof BooleanAnnotation ||
                    anno instanceof IntAnnotation ||
                    anno instanceof FloatAnnotation ||
                    anno instanceof ContainmentAnnotation ||
                    anno instanceof ImportAnnotation) {
                    return true
                }
            }
        }

        // Suppress residual uninitialized features
        return !owner.eIsSet(feature) || feature.isTransient
    }
}
