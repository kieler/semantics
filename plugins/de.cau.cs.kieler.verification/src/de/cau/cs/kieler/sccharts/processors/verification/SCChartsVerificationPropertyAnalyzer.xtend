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
package de.cau.cs.kieler.sccharts.processors.verification

import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.verification.InvariantAssumption
import de.cau.cs.kieler.verification.RangeAssumption
import de.cau.cs.kieler.verification.VerificationAssumption
import de.cau.cs.kieler.verification.VerificationProperty
import de.cau.cs.kieler.verification.VerificationPropertyType
import java.util.List
import java.util.Optional
import org.eclipse.xtend.lib.annotations.Accessors

import static extension de.cau.cs.kieler.verification.extensions.VerificationContextExtensions.*
import static extension de.cau.cs.kieler.verification.codegen.CodeGeneratorExtensions.*
import de.cau.cs.kieler.verification.DefaultRangeAssumption

/** 
 * @author aas
 */
class SCChartsVerificationPropertyAnalyzer extends InplaceProcessor<SCCharts>  {
    
    public static val PROCESSOR_ID = "de.cau.cs.kieler.sccharts.processors.verification.SCChartsVerificationPropertyAnalyzer"
    
    public static val INVARIANT_ANNOTATION_NAME = "Invariant"
    public static val CTL_ANNOTATION_NAME = "CTL"
    public static val LTL_ANNOTATION_NAME = "LTL"
    public static val DEFAULT_RANGE_ASSUMPTION_ANNOTATION_NAME = "DefaultAssumeRange"
    public static val RANGE_ASSUMPTION_ANNOTATION_NAME = "AssumeRange"
    public static val INVARIANT_ASSUMPTION_ANNOTATION_NAME = "Assume"
    
    @Accessors(PUBLIC_GETTER) private val verificationProperties = <VerificationProperty>newArrayList
    @Accessors(PUBLIC_GETTER) private val verificationAssumptions = <VerificationAssumption>newArrayList
    
    override getId() {
        return PROCESSOR_ID
    }
    
    override getName() {
        return "Property Analyzer"
    }
    
    override process() {
        var verificationContext = compilationContext.verificationContext
        if(verificationContext === null) {
            // This will result in synthesizing assumption and properties even in normal compilation
            verificationContext = compilationContext.createVerificationContext(false)
        }
        
        // Only set the properties in the environment if they are not set yet.
        val envVerificationProperties = verificationContext.verificationProperties
        if(!envVerificationProperties.isNullOrEmpty) {
            return
        }
        
        val model = getModel() as SCCharts
        analyze(model)
        verificationContext.verificationProperties = verificationProperties
        verificationContext.verificationAssumptions = verificationAssumptions
    }
    
    private def void analyze(SCCharts model) {
        model.eAllContents.filter(StringAnnotation).forEach [ anno |
            getVerificationProperty(anno).ifPresent [ property | 
                verificationProperties.add(property)
            ]
            verificationAssumptions.addAll(getRangeAssumptions(anno))
            getInvariantAssumption(anno).ifPresent [ assumption |
                verificationAssumptions.add(assumption)
            ]
        ]
    }
    
    private def Optional<InvariantAssumption> getInvariantAssumption(StringAnnotation anno) {
        if(anno.name != INVARIANT_ASSUMPTION_ANNOTATION_NAME) {
            return Optional.empty
        }
        val formula = anno.values.getIfExists(0)
        val name = anno.values.getIfExists(1)
        if(formula === null) {
            throw new Exception("Assumption is missing formula")
        }
        val assumption = new InvariantAssumption(formula, name)
        return Optional.of(assumption)
    }
    
    private def List<RangeAssumption> getRangeAssumptions(StringAnnotation anno) {
        if(anno.name != RANGE_ASSUMPTION_ANNOTATION_NAME && anno.name != DEFAULT_RANGE_ASSUMPTION_ANNOTATION_NAME) {
            return #[]
        }
        val minValueString = anno.values.getIfExists(0)
        val maxValueString = anno.values.getIfExists(1)
        if(minValueString === null || maxValueString === null) {
            throw new Exception("Range assumption is missing minValue or maxValue as arguments")
        }
        val minValue = Integer.valueOf(minValueString)
        val maxValue = Integer.valueOf(maxValueString)
        val assumptions = newArrayList
        
        val container = anno.eContainer
        if(container instanceof VariableDeclaration) {
            for(vo : container.valuedObjects) {
                val assumption = new RangeAssumption(vo, minValue, maxValue)
                assumptions.add(assumption)
            }
        } else {
            if(anno.name == DEFAULT_RANGE_ASSUMPTION_ANNOTATION_NAME) {
                val assumption = new DefaultRangeAssumption(minValue, maxValue)
                assumptions.add(assumption)
            } else {
                throw new Exception("Range assumption can only be used on variables")    
            }
        }
        
        return assumptions
    }
    
    private def Optional<VerificationProperty> getVerificationProperty(StringAnnotation anno) {
        val propertyFormula = anno.values.getIfExists(0)
        var propertyName = anno.values.getIfExists(1)
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
            propertyName = propertyFormula.toIdentifier
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
