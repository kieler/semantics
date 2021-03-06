/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.legacy

import de.cau.cs.kieler.annotations.Annotation
import de.cau.cs.kieler.annotations.AnnotationsFactory
import de.cau.cs.kieler.kexpressions.CombineOperator
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.keffects.Effect
import de.cau.cs.kieler.kexpressions.keffects.KEffectsFactory
import de.cau.cs.kieler.sccharts.DelayType
import de.cau.cs.kieler.sccharts.HistoryType
import de.cau.cs.kieler.sccharts.PreemptionType
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.legacy.annotations.BooleanAnnotation
import de.cau.cs.kieler.sccharts.legacy.annotations.CommentAnnotation
import de.cau.cs.kieler.sccharts.legacy.annotations.ContainmentAnnotation
import de.cau.cs.kieler.sccharts.legacy.annotations.FloatAnnotation
import de.cau.cs.kieler.sccharts.legacy.annotations.ImportAnnotation
import de.cau.cs.kieler.sccharts.legacy.annotations.IntAnnotation
import de.cau.cs.kieler.sccharts.legacy.annotations.ReferenceAnnotation
import de.cau.cs.kieler.sccharts.legacy.annotations.StringAnnotation
import de.cau.cs.kieler.sccharts.legacy.annotations.TypedStringAnnotation
import de.cau.cs.kieler.sccharts.legacy.kexpressions.BoolValue
import de.cau.cs.kieler.sccharts.legacy.kexpressions.Declaration
import de.cau.cs.kieler.sccharts.legacy.kexpressions.FloatValue
import de.cau.cs.kieler.sccharts.legacy.kexpressions.FunctionCall
import de.cau.cs.kieler.sccharts.legacy.kexpressions.IntValue
import de.cau.cs.kieler.sccharts.legacy.kexpressions.OperatorExpression
import de.cau.cs.kieler.sccharts.legacy.kexpressions.Parameter
import de.cau.cs.kieler.sccharts.legacy.kexpressions.StringValue
import de.cau.cs.kieler.sccharts.legacy.kexpressions.TextExpression
import de.cau.cs.kieler.sccharts.legacy.kexpressions.ValuedObject
import de.cau.cs.kieler.sccharts.legacy.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.sccharts.legacy.kexpressions.keffects.Assignment
import de.cau.cs.kieler.sccharts.legacy.kexpressions.keffects.Emission
import de.cau.cs.kieler.sccharts.legacy.kexpressions.keffects.FunctionCallEffect
import de.cau.cs.kieler.sccharts.legacy.kexpressions.keffects.HostcodeEffect
import de.cau.cs.kieler.sccharts.legacy.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.legacy.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.legacy.sccharts.DuringAction
import de.cau.cs.kieler.sccharts.legacy.sccharts.EntryAction
import de.cau.cs.kieler.sccharts.legacy.sccharts.ExitAction
import de.cau.cs.kieler.sccharts.legacy.sccharts.IterateAction
import de.cau.cs.kieler.sccharts.legacy.sccharts.LocalAction
import de.cau.cs.kieler.sccharts.legacy.sccharts.Scope
import de.cau.cs.kieler.sccharts.legacy.sccharts.StateType
import de.cau.cs.kieler.sccharts.legacy.sccharts.SuspendAction
import de.cau.cs.kieler.sccharts.legacy.sccharts.Transition
import de.cau.cs.kieler.sccharts.legacy.text.SctStandaloneSetup
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.Path
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import java.util.List
import de.cau.cs.kieler.sccharts.legacy.text.services.SctGrammarAccess
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.CrossReference
import java.util.HashMap
import de.cau.cs.kieler.sccharts.ScopeCall
import de.cau.cs.kieler.sccharts.legacy.sccharts.Binding
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement
import de.cau.cs.kieler.sccharts.DeferredType
import de.cau.cs.kieler.kexpressions.ParameterAccessType

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SCChartsLegacyConverter {
    
    public static val INPUT_EXTENSION = "sct"
    public static val OUTPUT_EXTENSION = "sctx"
    
    static def export(IFile file, List<IFile> others) {
        val converter = new SCChartsLegacyConverter
        val sctInjector = SctStandaloneSetup.doSetup
        val sctxInjector = SCTXStandaloneSetup.doSetup
        var EObject model
        var XtextResource resource
        
        // Load file
        try {
            val uri = URI.createFileURI(file.locationURI.normalize.path.toString)
            // Get resource set
            val resourceSet = sctInjector.getInstance(XtextResourceSet)
            resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.FALSE)
            
            // Load file
            resource = resourceSet.getResource(uri, true) as XtextResource
            model = resource.getContents().head
            
        } catch (Exception e) {
            throw new Exception("Cannot load model from "+file, e)
        }
        
        // Find Reference States
        val references = <de.cau.cs.kieler.sccharts.legacy.sccharts.State, String>newHashMap
        val bindings = <de.cau.cs.kieler.sccharts.legacy.sccharts.State, List<Pair<Binding, String>>>newHashMap
        val grammar = sctInjector.getInstance(SctGrammarAccess)
        val refKeyword = grammar.stateAccess.referencesKeyword_6_0_0
        val bindKeyword = grammar.stateAccess.bindKeyword_6_0_2_0
        val toKeyword = grammar.bindingAccess.toKeyword_2
        val parserNodes = resource.parseResult.rootNode
        for (referenceState : parserNodes.asTreeIterable.filter[
            semanticElement instanceof de.cau.cs.kieler.sccharts.legacy.sccharts.State 
            && grammarElement.eClass.equals(refKeyword.eClass)
            && (grammarElement as Keyword).value == refKeyword.value
        ]) {
            // Referenced name
            val state = referenceState.semanticElement as de.cau.cs.kieler.sccharts.legacy.sccharts.State
            var String referencedState = null
            var INode bindingStartNode = null
            for (var nextNode = referenceState.nextSibling; nextNode !== null && nextNode.semanticElement == state; nextNode = nextNode.nextSibling) {
                if (nextNode.grammarElement instanceof CrossReference) {
                    referencedState = nextNode.text
                }
                if (nextNode.grammarElement.eClass.equals(bindKeyword.eClass) && (nextNode.grammarElement as Keyword).value == bindKeyword.value) {
                    bindingStartNode = nextNode
                }
            }
            references.put(state, referencedState)
            
            // Bindings
            if (bindingStartNode !== null) {
                val binds = newLinkedList
                for (var nextNode = bindingStartNode.nextSibling; nextNode !== null && (nextNode.semanticElement instanceof Binding || nextNode.semanticElement == state); nextNode = nextNode.nextSibling) {
                    if (nextNode.semanticElement instanceof Binding && nextNode instanceof CompositeNodeWithSemanticElement) {
                        val bind = nextNode.semanticElement as Binding
                        val node = nextNode as CompositeNodeWithSemanticElement
                        var to = false
                        var String boundName = null
                        for (child : node.children) {
                            if (child.grammarElement.eClass.equals(toKeyword.eClass) && (child.grammarElement as Keyword).value == toKeyword.value) {
                                to = true
                            }
                            if (!to && child.grammarElement instanceof CrossReference) {
                                boundName = child.text
                            }
                        }
                        binds += new Pair(bind, boundName)
                    }
                }
                bindings.put(state, binds)
            }
        }
        
        // Create fake SCCharts
        if (!references.empty) {
            converter.createReferencedSCCharts(references, bindings)
        }
        
        // convert
        model = converter.convertSCChart(model as Scope)
        
        // Save model
        val uri = URI.createFileURI((Path.fromOSString(file.locationURI.normalize.path.toString)).removeFileExtension.addFileExtension(OUTPUT_EXTENSION).makeAbsolute.toString)
        try {
            val resourceSet = sctxInjector.getInstance(XtextResourceSet);
            
            // Add fake SCCharts
            if (!references.empty) {
                val refURI = URI.createURI("dummy:/referenced/sccharts." + OUTPUT_EXTENSION)
                resource = resourceSet.createResource(refURI) as XtextResource
                resource.getContents().add(converter.referencedSCCharts)
            }
            
            // create model resource
            resource = resourceSet.createResource(uri) as XtextResource
            resource.getContents().add(model)
    
            // save
            resource.save(emptyMap)
        } catch (Exception e) {
            throw new Exception("Cannot save model to " + uri, e)
        }

    }
    
    // ----------------------------------------------------------------------------------------------------------------
    
    extension SCChartsFactory = SCChartsFactory.eINSTANCE
    extension KEffectsFactory = KEffectsFactory.eINSTANCE
    extension KExpressionsFactory = KExpressionsFactory.eINSTANCE
    extension AnnotationsFactory = AnnotationsFactory.eINSTANCE
    val convertOnlyOne = newHashMap
    val referencedSCCharts = createSCCharts
    val referenceCalls = <de.cau.cs.kieler.sccharts.legacy.sccharts.State, ScopeCall>newHashMap
    
    // SCCharts

    def convertSCChart(Scope scope) {
        if (scope instanceof de.cau.cs.kieler.sccharts.legacy.sccharts.State) {
            return createSCCharts => [
                rootStates += scope.convert as State
            ]
        } else {
            throw new UnsupportedOperationException("Cannot convert SCCharts with root elements other than State.")
        }
    }
    
    def createReferencedSCCharts(HashMap<de.cau.cs.kieler.sccharts.legacy.sccharts.State, String> references, HashMap<de.cau.cs.kieler.sccharts.legacy.sccharts.State, List<Pair<Binding, String>>> bindings) {
        val referenced = <String, State>newHashMap
        for (entry : references.entrySet) {
            val state = if (referenced.containsKey(entry.value)) {
                referenced.get(entry.value)
            } else {
                val s = createState
                s.declarations += createVariableDeclaration => [
                    type = ValueType.BOOL
                    input = true
                    valuedObjects += createValuedObject => [
                        name = "DUMMY"
                    ]
                ]
                s.name = entry.value
                referencedSCCharts.rootStates += s
                referenced.put(entry.value, s)
                s
            }
            referenceCalls.put(entry.key, createScopeCall => [
                target = state
                if (bindings.containsKey(entry.key)) {
                    for (bind : bindings.get(entry.key)) {
                        parameters += createParameter => [
                            if (bind.key.value !== null) {
                                expression = bind.key.value.convert as de.cau.cs.kieler.kexpressions.Value
                            } else {
                                expression = createValuedObjectReference => [
                                    valuedObject = (bind.key.actual?:(bind.key.formal)).convert as de.cau.cs.kieler.kexpressions.ValuedObject
                                    indices.addAll(bind.key.indices.map[convert as Expression])
                                ]
                            }
                            if (state.declarations.head.valuedObjects.exists[name.equals(bind.value)]) {
                                explicitBinding = state.declarations.head.valuedObjects.findFirst[name.equals(bind.value)]
                            } else {
                                explicitBinding = createValuedObject => [
                                    name = bind.value
                                    state.declarations.head.valuedObjects += it
                                ]
                            }
                        ]
                    }
                }
            ])
        }
    }
    
    def dispatch convert(de.cau.cs.kieler.sccharts.legacy.sccharts.State state) {
        if (convertOnlyOne.containsKey(state)) {
            return convertOnlyOne.get(state)
        } else {
            val s = createState
            convertOnlyOne.put(state, s)
            s => [ // This is important for cyclic states
                annotations.addAll(state.annotations.map[convert as Annotation])
            
                name = state.id
                label = state.label
                actions.addAll(state.localActions.map[convert as de.cau.cs.kieler.sccharts.LocalAction])
                if (referenceCalls.containsKey(state)) {
                    reference = referenceCalls.get(state)
                }
                declarations.addAll(state.declarations.map[convert as de.cau.cs.kieler.kexpressions.Declaration])
                
                regions.addAll(state.regions.map[convert as de.cau.cs.kieler.sccharts.ControlflowRegion])
                connector = state.type == StateType.CONNECTOR
                initial = state.initial
                final = state.final
                outgoingTransitions.addAll(state.outgoingTransitions.map[convert as de.cau.cs.kieler.sccharts.Transition])
            ]
        }
    }
    
    def dispatch convert(ControlflowRegion region) {
        return createControlflowRegion => [
            annotations.addAll(region.annotations.map[convert as Annotation])
            
            name = region.id
            label = region.label
            actions.addAll(region.localActions.map[convert as de.cau.cs.kieler.sccharts.LocalAction])
            declarations.addAll(region.declarations.map[convert as de.cau.cs.kieler.kexpressions.Declaration])
            
            states.addAll(region.states.map[convert as State])
        ]
    }
    
    def dispatch convert(DataflowRegion region) {
        throw new UnsupportedOperationException("Cannot convert SCCharts with dataflow regions.")
    }
    
    def dispatch convert(Transition trans) {
        return createTransition => [
            annotations.addAll(trans.annotations.map[convert as Annotation])
            
            effects.addAll(trans.effects.map[convert as Effect])
            trigger = trans.trigger?.convert as Expression
            triggerDelay = trans.delay
            label = trans.label
            delay = if (trans.immediate) DelayType.IMMEDIATE else DelayType.UNDEFINED
            
            preemption = PreemptionType.getByName(trans.type.getName)
            deferred = trans.deferred ? DeferredType::SHALLOW : DeferredType::NONE
            history = HistoryType.getByName(trans.history.getName)
            targetState = trans.targetState.convert as State
        ]
    }
    
    def dispatch convert(LocalAction action) {
        return switch (action) {
            EntryAction: createEntryAction
            ExitAction: createExitAction
            DuringAction: createDuringAction
            SuspendAction: createSuspendAction
            IterateAction: createDuringAction
        } => [ // kleiner kommentar
            annotations.addAll(action.annotations.map[convert as Annotation])
            
            effects.addAll(action.effects.map[convert as Effect])
            trigger = action.trigger?.convert as Expression
            triggerDelay = action.delay
            label = action.label
            delay = if (action.immediate) DelayType.IMMEDIATE else DelayType.UNDEFINED
            
            if (it instanceof de.cau.cs.kieler.sccharts.SuspendAction) {
                it.weak = (action as SuspendAction).weak
            }
        ]
    }
    
    // KEffects
    
    private def  de.cau.cs.kieler.kexpressions.ValuedObjectReference reference( de.cau.cs.kieler.kexpressions.ValuedObject valuedObject) {
        createValuedObjectReference => [
            setValuedObject(valuedObject)
        ]
    }      
    
    def dispatch convert(Assignment asm) {
        return createAssignment => [
            annotations.addAll(asm.annotations.map[convert as Annotation])
            
            val vo = asm.valuedObject.convert as de.cau.cs.kieler.kexpressions.ValuedObject
            reference = vo.reference
            reference.indices.addAll(asm.indices.map[convert as Expression])
            expression = asm.expression.convert as Expression
            operator = AssignOperator.getByName(asm.operator.getName)
            // Convert old relative write sytax (x = x + 1) to new one (x += 1)
            if (operator == AssignOperator.ASSIGN && // Normal assignment
                expression instanceof de.cau.cs.kieler.kexpressions.OperatorExpression && // top level operator expression
                expression.eAllContents.filter(de.cau.cs.kieler.kexpressions.ValuedObjectReference).filter[valuedObject == vo].size == 1 && // only one reference
                (expression as de.cau.cs.kieler.kexpressions.OperatorExpression).subExpressions.size > 1 &&
                (expression as de.cau.cs.kieler.kexpressions.OperatorExpression).subExpressions.filter(de.cau.cs.kieler.kexpressions.ValuedObjectReference).exists[valuedObject == vo] // reference on top level
            ) {
                val oe = expression as de.cau.cs.kieler.kexpressions.OperatorExpression
                operator = switch(oe.operator) {
                    case ADD: AssignOperator.ASSIGNADD
                    case BITWISE_AND: AssignOperator.ASSIGNAND
                    case BITWISE_OR: AssignOperator.ASSIGNOR
                    case BITWISE_XOR: AssignOperator.ASSIGNXOR
                    case DIV: AssignOperator.ASSIGNDIV
                    case LOGICAL_AND: AssignOperator.ASSIGNAND
                    case LOGICAL_OR: AssignOperator.ASSIGNOR
                    case MOD: AssignOperator.ASSIGNMOD
                    case MULT: AssignOperator.ASSIGNMUL
                    case SHIFT_LEFT: AssignOperator.ASSIGNSHIFTLEFT
                    case SHIFT_RIGHT: AssignOperator.ASSIGNSHIFTRIGHT
                    case SHIFT_RIGHT_UNSIGNED: AssignOperator.ASSIGNSHIFTRIGHTUNSIGNED
                    case SUB: AssignOperator.ASSIGNSUB
                    default: AssignOperator.ASSIGN
                }
                if (operator !== AssignOperator.ASSIGN) {
                    oe.subExpressions.removeIf[it instanceof de.cau.cs.kieler.kexpressions.ValuedObjectReference && (it as de.cau.cs.kieler.kexpressions.ValuedObjectReference).valuedObject == vo]
                    if (oe.subExpressions.size == 1) {
                        expression = oe.subExpressions.head
                    }
                }
            }
        ]
    } 
    
    def dispatch convert(Emission emit) {
        return createEmission => [
            annotations.addAll(emit.annotations.map[convert as Annotation])
            
            reference = (emit.valuedObject.convert as de.cau.cs.kieler.kexpressions.ValuedObject).reference
            newValue = emit.newValue.convert as Expression
        ]
    }
    
    def dispatch convert(HostcodeEffect code) {
        return createHostcodeEffect => [
            annotations.addAll(code.annotations.map[convert as Annotation])
            
            text = code.text
        ]
    }   

    def dispatch convert(FunctionCallEffect call) {
        return createFunctionCallEffect => [
            annotations.addAll(call.annotations.map[convert as Annotation])
            
            functionName = call.functionName
            parameters.addAll(call.parameters.map[convert as de.cau.cs.kieler.kexpressions.Parameter])
        ]
    }
        
    // KExpressions
    
    def dispatch convert(Declaration decl) {
        return createVariableDeclaration => [
            annotations.addAll(decl.annotations.map[convert as Annotation])
            
            valuedObjects.addAll(decl.valuedObjects.map[convert as de.cau.cs.kieler.kexpressions.ValuedObject])
            type = ValueType.getByName(decl.type.getName)
            if (type === ValueType.DOUBLE) type = ValueType.FLOAT
            input = decl.input
            output = decl.output
            static = decl.static
            signal = decl.signal
            const = decl.const
            extern = decl.extern
            volatile = decl.volatile
            hostType = decl.hostType
        ]
    }      
    
    def dispatch convert(ValuedObject vo) {
        if (convertOnlyOne.containsKey(vo)) {
            return convertOnlyOne.get(vo)
        } else {
            val v = createValuedObject
            convertOnlyOne.put(vo, v)
            v => [ // This is important for cyclic states
                annotations.addAll(vo.annotations.map[convert as Annotation])
            
                name = vo.name
                if (vo.combineOperator !== null) combineOperator = CombineOperator.getByName(vo.combineOperator.getName)
                initialValue = vo.initialValue?.convert as Expression
                cardinalities.addAll(vo.cardinalities.map[convert as Expression])
            ]
        }
    }
    
    def dispatch convert(ValuedObjectReference vor) {
        return createValuedObjectReference => [
            valuedObject = vor.valuedObject.convert as de.cau.cs.kieler.kexpressions.ValuedObject
            indices.addAll(vor.indices.map[convert as Expression])
        ]
    }  
    
    def dispatch convert(IntValue v) {
        return createIntValue => [
            value = v.value
        ]
    } 
        
    def dispatch convert(FloatValue v) {
        return createFloatValue => [
            value = v.value as double
        ]
    }  
        
    def dispatch convert(BoolValue v) {
        return createBoolValue => [
            value = v.value
        ]
    }  
        
    def dispatch convert(StringValue v) {
        return createStringValue => [
            value = v.value
        ]
    }   
    
    def dispatch convert(OperatorExpression op) {
        return createOperatorExpression => [
            operator = OperatorType.getByName(op.operator.getName)
            subExpressions.addAll(op.subExpressions.map[convert as Expression])
        ]
    }   

    def dispatch convert(TextExpression t) {
        return createTextExpression => [
            text = t.text
        ]
    }
    
    def dispatch convert(FunctionCall call) {
        return createFunctionCall => [
            functionName = call.functionName
            parameters.addAll(call.parameters.map[convert as de.cau.cs.kieler.kexpressions.Parameter])
        ]
    }
    
    def dispatch convert(Parameter para) {
        return createParameter => [
            if (para.pureOutput) {
                accessType = ParameterAccessType.PURE_OUTPUT
            } else if (para.callByReference) {
                accessType = ParameterAccessType.CALL_BY_REFERENCE
            } else {
                accessType = ParameterAccessType.CALL_BY_VALUE
            }
            expression = para.expression.convert as Expression
        ]
    }
    
            
    // Annotations
    
    def dispatch convert(StringAnnotation anno) {
        return createStringAnnotation => [
            name = anno.name
            values.addAll(anno.values)
        ]
    } 
    
    def dispatch convert(BooleanAnnotation anno) {
        return createBooleanAnnotation => [
            name = anno.name
            value = anno.value
        ]
    }
    
    def dispatch convert(IntAnnotation anno) {
        return createIntAnnotation => [
            name = anno.name
            value = anno.value
        ]
    }
    
    def dispatch convert(FloatAnnotation anno) {
        return createFloatAnnotation => [
            name = anno.name
            value = anno.value
        ]
    }
    
    def dispatch convert(ContainmentAnnotation anno) {
        return createContainmentAnnotation => [
            name = anno.name
            object = anno.object.convert as EObject
        ]
    }
    
    def dispatch convert(ImportAnnotation anno) {
        return createImportAnnotation => [
            name = anno.name
            importURI = anno.importURI
        ]
    }
    
    def dispatch convert(CommentAnnotation anno) {
        return createCommentAnnotation => [
            name = anno.name
            values.addAll(anno.values)
        ] 
    }
    
    def dispatch convert(TypedStringAnnotation anno) {
        return createTypedStringAnnotation => [
            name = anno.name
            type = anno.type
            values.addAll(anno.values)
        ]
    }    
    
    def dispatch convert(ReferenceAnnotation anno) {
        throw new UnsupportedOperationException("Cannot convert ReferenceAnnotation.")
    }
    
    def dispatch convert(de.cau.cs.kieler.sccharts.legacy.annotations.Annotation anno) {
        return createTagAnnotation => [
            name = anno.name
        ]
    }      
    
    // Fallback
    
    def dispatch convert(EObject eobj) {
        throw new UnsupportedOperationException("Cannot convert "+eobj.eClass.name)
    }
    
    def dispatch convert(Void v) {
        return null
    }   
}