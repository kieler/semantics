/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.verification.processors

import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.verification.RangeAssumption
import de.cau.cs.kieler.verification.VerificationAssumption
import de.cau.cs.kieler.verification.VerificationProperty
import de.cau.cs.kieler.verification.VerificationPropertyType
import java.util.List
import java.util.Optional
import org.eclipse.xtend.lib.annotations.Accessors

/** 
 * @author aas
 */
class SCChartsVerificationPropertyAnalyzer extends InplaceProcessor<SCCharts>  {
    public static val INVARIANT_ANNOTATION_NAME = "Invariant"
    public static val CTL_ANNOTATION_NAME = "CTL"
    public static val LTL_ANNOTATION_NAME = "LTL"
    public static val RANGE_ASSUMPTION_ANNOTATION_NAME = "AssumeRange"
    
    @Accessors(PUBLIC_GETTER) private val verificationProperties = <VerificationProperty>newArrayList
    @Accessors(PUBLIC_GETTER) private val verificationAssumptions = <VerificationAssumption>newArrayList
    
    override getId() {
        return "de.cau.cs.kieler.verification.processors.SCChartsVerificationPropertyAnalyzer"
    }
    
    override getName() {
        return "Property Analyzer"
    }
    
    override process() {
        // Only set the properties in the environment if they are not set yet,
        // because they could have been set from the UI already.
        val envVerificationProperties = compilationContext.startEnvironment.getProperty(Environment.VERIFICATION_PROPERTIES) as List<VerificationProperty>
        if(!envVerificationProperties.isNullOrEmpty) {
            return
        }
        
        val model = getModel() as SCCharts
        analyze(model)
        compilationContext.startEnvironment.setProperty(Environment.VERIFICATION_PROPERTIES, verificationProperties)
        compilationContext.startEnvironment.setProperty(Environment.VERIFICATION_ASSUMPTIONS, verificationAssumptions)
    }
    
    private def void analyze(SCCharts model) {
        model.eAllContents.filter(StringAnnotation).forEach [ anno |
            getVerificationProperty(anno).ifPresent [ property | 
                verificationProperties.add(property)
            ]
            getRangeAssumptions(anno).forEach[ assumption | 
                verificationAssumptions.add(assumption)
            ]
        ]
    }
    
    private def List<VerificationAssumption> getRangeAssumptions(StringAnnotation anno) {
        if(anno.name != RANGE_ASSUMPTION_ANNOTATION_NAME) {
            return #[]
        }
        val minValueString = anno.values.getIfExists(0)
        val maxValueString = anno.values.getIfExists(1)
        if(minValueString === null || maxValueString === null) {
            throw new Exception("Range assumption is missing minValue or maxValue as arguments")
        }
        val minValue = Integer.valueOf(minValueString)
        val maxValue = Integer.valueOf(maxValueString)
        val container = anno.eContainer
        if(container instanceof VariableDeclaration) {
            val assumptions = newArrayList
            for(vo : container.valuedObjects) {
                val assumption = new RangeAssumption(vo, minValue, maxValue)
                assumptions.add(assumption)
            }
            return assumptions
        } else {
            throw new Exception("Range assumption can only be used on variables")
        }
    }
    
    private def Optional<VerificationProperty> getVerificationProperty(StringAnnotation anno) {
        val propertyFormula = anno.values.getIfExists(0)
        val propertyName = anno.values.getIfExists(1)
        val propertyType = 
            switch(anno.name) {
                case INVARIANT_ANNOTATION_NAME : VerificationPropertyType.INVARIANT
                case CTL_ANNOTATION_NAME : VerificationPropertyType.CTL
                case LTL_ANNOTATION_NAME : VerificationPropertyType.LTL
                default : null
            }
        if (propertyType === null) {
            return Optional.empty
        }
        
        if(propertyFormula.isNullOrEmpty) {
            throw new Exception("Property formula missing ("+propertyType+" property)")
        }
        if(propertyName.isNullOrEmpty) {
            throw new Exception("Property is missing a unique name ("+propertyType+" '"+propertyFormula+"')")
        }
        return Optional.of(new VerificationProperty(propertyName, propertyFormula, propertyType))
    }
    
    private def <T> getIfExists(List<T> list, int index) {
        if(list === null || list.size <= index) {
            return null
        } else {
            return list.get(index)    
        } 
    }
    
}
