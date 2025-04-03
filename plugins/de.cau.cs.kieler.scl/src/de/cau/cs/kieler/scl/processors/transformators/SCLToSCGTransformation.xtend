/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scl.processors.transformators

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.Schedulable
import de.cau.cs.kieler.kexpressions.ScheduleObjectReference
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.ForkType
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.processors.SCGAnnotations
import de.cau.cs.kieler.scl.Goto
import de.cau.cs.kieler.scl.Label
import de.cau.cs.kieler.scl.Loop
import de.cau.cs.kieler.scl.MethodImplementationDeclaration
import de.cau.cs.kieler.scl.Module
import de.cau.cs.kieler.scl.Parallel
import de.cau.cs.kieler.scl.Pause
import de.cau.cs.kieler.scl.Return
import de.cau.cs.kieler.scl.SCLFactory
import de.cau.cs.kieler.scl.SCLProgram
import de.cau.cs.kieler.scl.Scope
import de.cau.cs.kieler.scl.Statement
import de.cau.cs.kieler.scl.StatementContainer
import de.cau.cs.kieler.scl.extensions.SCLExtensions
import java.util.ArrayList
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors

import static de.cau.cs.kieler.scg.processors.SCGAnnotations.*

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*

/** 
 * SCL to SCG Transformation 
 * 
 * @author ssm cmot als
 * @kieler.design 2014-01-27 proposed 
 * @kieler.rating 2014-01-27 proposed yellow
 */
class SCLToSCGTransformation extends Processor<SCLProgram, SCGraphs> implements Traceable {

    static val String ANNOTATION_HOSTCODE = "hostcode"

    @Inject extension SCGControlFlowExtensions 
    @Inject extension SCGThreadExtensions   
    @Inject extension SCGMethodExtensions   
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension SCLExtensions
    @Inject extension KEffectsExtensions
    static val sCGFactory = ScgFactory.eINSTANCE
    extension ScgFactory = ScgFactory::eINSTANCE
    static val sclFactory = SCLFactory::eINSTANCE

    // -------------------------------------------------------------------------
    // -- Processor
    // -------------------------------------------------------------------------
    
    override getId() {
        return "de.cau.cs.kieler.scl.processors.transformators.scl2scg"
    }
    
    override getName() {
        return "SCL to SCG"
    }
    
    override getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    override process() {
        setModel(getModel.transformSCLToSCG)
    }
    
//    override getProducedFeatureId() {
//        return SCGFeatures::BASIC_ID
//    }
//    override Set<String> getRequiredFeatureIds() {
//        return Sets.newHashSet(SCLFeatures.BASIC_ID)
//    }   
 
    // -------------------------------------------------------------------------
    // -- M2M Transformation 
    // -------------------------------------------------------------------------

    // M2M Mapping
    val valuedObjectMapping = new HashMap<ValuedObject, ValuedObject>
    val nodeMapping = new HashMap<EObject, List<Node>>()
    val reverseNodeMapping = new HashMap<Node, EObject>()
    val labelMapping = new HashMap<Label, Node>()
    val gotoFlows = new HashMap<Goto, List<ControlFlow>>()
    val unmappedLabels = new LinkedList<Label>
    var ValuedObject returnVO = null
    
    /*
     * Transformation method
     */
    def SCGraphs transformSCLToSCG(SCLProgram program) {
        val voStore = if (environments !== null) VariableStore.get(environment)
        // Create new SCG...
        val scgs = createSCGraphs
        creationalTransformation(program, scgs)

        for (module : program.modules) {
            val scg = createSCGraph
            scgs.scgs += scg
            scg.addStringAnnotation(ANNOTATION_NAME, module.name)
            scg.name = module.name
            module.initialize
            	
            // ... and copy declarations.
            val declMapping = newHashMap
            scg.declarations += module.declarations.copyDeclarations(valuedObjectMapping, declMapping)
            declMapping.entrySet.forEach[
                value.trace(key)
                // Convert method body
                if (key instanceof MethodImplementationDeclaration) {
                    val method = key as MethodImplementationDeclaration
                    if (!method.statements.nullOrEmpty) {
                        scgs.scgs += method.transformMethod(value as MethodDeclaration, valuedObjectMapping)
                    }
                }
            ]
            valuedObjectMapping.entrySet.forEach[
                value.trace(key)
                
                // Fix VO association in VariableStore
                if (voStore !== null) {
                    val oldVO = key
                    val info = voStore.getInfo(oldVO)
                    if (info !== null) info.valuedObject = value
                }
            ]
    
            module.transform(scg, null)
            module.eAllContents.filter(Goto).forEach[transform(scg, gotoFlows.get(it))]
    
            scg.removeSuperflousConditionals
            
            val hostcodeAnnotations = module.getAnnotations.filter(typeof(StringAnnotation)).filter[ name == ANNOTATION_HOSTCODE ] 
            hostcodeAnnotations.forEach [
                scg.createStringAnnotation(ANNOTATION_HOSTCODE, (it as StringAnnotation).values.head)
            ]        
            
            val threadPathTypes = (scg.nodes.head as Entry).getThreadControlFlowTypes
            for (entry : threadPathTypes.keySet) {
                if (!entry.hasAnnotation(ANNOTATION_CONTROLFLOWTHREADPATHTYPE))
                    entry.createStringAnnotation(ANNOTATION_CONTROLFLOWTHREADPATHTYPE, threadPathTypes.get(entry).toString2)
            }             
        }
        return scgs
    }
    
    /*
     * Initialize transformation by removing double jumps and explicitly set initial values
     * Removes local declarations (StatementScopes)
     */
    def void initialize(Module program) {
        valuedObjectMapping.clear
        nodeMapping.clear
        reverseNodeMapping.clear
        labelMapping.clear
        gotoFlows.clear
        unmappedLabels.clear
        
        program.removeDoubleJumps
        program.removeLocalDeclarations
        program.removeRedundantForks
        program.optimizeLabels
        program.removeUnreachableCode

        // Variable initialization
        program.declarations.forEach [
            for (valObj : valuedObjects) {
                if (valObj.initialValue !== null) {
                    program.statements.add(0,
                        SCLFactory::eINSTANCE.createAssignment => [
                            it.trace(valObj)
                            valuedObject = valObj
                            expression = valObj.initialValue
                        ])
                }
            }
        ]
    }
    
    
    // Removes conditional nodes that have the same target for the then and the else branch.
    private def removeSuperflousConditionals(SCGraph scg) {
        val toDelete = <Conditional>newLinkedList
        for (conditional : scg.eAllContents.filter(typeof(Conditional)).toList) {
            if (conditional.^else.target == conditional.then.target) {
                toDelete += conditional
                for (previous : conditional.incomingLinks.immutableCopy) {
                    previous.target = conditional.^else.target
                }
            }
        }
        toDelete.forEach[it.remove]
    }
    
    def SCGraph transformMethod(MethodImplementationDeclaration method, MethodDeclaration newMethod, Map<ValuedObject, ValuedObject> voMappig) {
        val voStore = if (environments !== null) VariableStore.get(environment)
        
        // Save state
        val _valuedObjectMapping = new HashMap<ValuedObject, ValuedObject>
        _valuedObjectMapping.putAll(valuedObjectMapping)
        valuedObjectMapping.clear
        valuedObjectMapping.putAll(voMappig)
        val _nodeMapping = new HashMap<EObject, List<Node>>()
        _nodeMapping.putAll(nodeMapping)
        nodeMapping.clear
        val _reverseNodeMapping = new HashMap<Node, EObject>()
        _reverseNodeMapping.putAll(reverseNodeMapping)
        reverseNodeMapping.clear
        val _labelMapping = new HashMap<Label, Node>()
        _labelMapping.putAll(labelMapping)
        labelMapping.clear
        val _gotoFlows = new HashMap<Goto, List<ControlFlow>>()
        _gotoFlows.putAll(gotoFlows)
        gotoFlows.clear
        val _unmappedLabels = new LinkedList<Label>
        _unmappedLabels.addAll(unmappedLabels)
        unmappedLabels.clear
                
        returnVO = null
        
        // Add goto after return
        val exitL = sclFactory.createLabel => [name = "_end"]
        method.statements.add(method.statements.size, exitL)
        for (ret : method.eAllContents.filter(Return).toList) {
            val container = ret.eContainer as StatementContainer
            container.statements.add(container.statements.indexOf(ret) + 1, sclFactory.createGoto => [target = exitL])
        }
        
        method.removeDoubleJumps
        method.removeLocalDeclarations
//        method.removeRedundantForks
        method.optimizeLabels
        method.removeUnreachableCode
        
        val scg = createSCGraph
        val declMapping = newHashMap
        val declVOMapping = newHashMap
        // Inner declarations
        scg.declarations += method.declarations.copyDeclarations(declVOMapping, declMapping)
        declMapping.entrySet.forEach[
            value.trace(key)
            // Convert method body
            if (key instanceof MethodImplementationDeclaration) {
                throw new IllegalArgumentException("Cannot handle method declarations in methods")
            }
        ]
        declVOMapping.entrySet.forEach[
            val oldVO = key
            val newVO = value
            newVO.trace(oldVO)
            valuedObjectMapping.put(oldVO, newVO)
            // Fix VO association in VariableStore
            if (voStore !== null) {
                val info = voStore.getInfo(oldVO)
                if (info !== null) info.valuedObject = newVO
            }
            // Initialize
            if (newVO.initialValue !== null) {
                method.statements.add(0,
                    SCLFactory::eINSTANCE.createAssignment => [
                        it.trace(newVO)
                        valuedObject = oldVO // replaced later in translation
                        expression = oldVO.initialValue.copy // replaced later in translation
                    ])
            }
        ]
        // Parameters
        declMapping.clear
        declVOMapping.clear
        scg.declarations += method.parameterDeclarations.copyDeclarations(declVOMapping, declMapping)
        declMapping.entrySet.forEach[key.trace(value)]
        declVOMapping.entrySet.forEach[
            val oldVO = key
            val newVO = value
            newVO.trace(oldVO)
            valuedObjectMapping.put(oldVO, newVO)
            newVO.addIntAnnotation(SCGAnnotations.ANNOTATION_METHOD_PARAMETER, method.parameterDeclarations.indexOf(oldVO.eContainer))
            // Fix VO association in VariableStore
            if (voStore !== null) {
                val info = voStore.variables.get(oldVO.name).findFirst[it.valuedObject == oldVO]
                if (info !== null) info.valuedObject = newVO
            }
            // Do not init parameter
        ]
        
        // Transform
        val entry = createEntry.trace(method).createNodeList(method) as Entry => [
            scg.nodes += it
        ]
        method.statements.transform(scg, entry.createControlFlow.toList) => [ continuation |
            createExit.trace(method).createNodeList(method) as Exit => [
                scg.nodes += it
                it.entry = entry
                it.controlFlowTarget(continuation.getControlFlows)
                labelMapping.put(continuation.label, it)
                for (l : unmappedLabels)
                    labelMapping.put(l, it)
                unmappedLabels.clear
            ]
        ]
        method.eAllContents.filter(Goto).forEach[transform(scg, gotoFlows.get(it))]

        // Add return
        if (returnVO !== null) {
            scg.declarations += createVariableDeclaration(method.returnType) => [valuedObjects += returnVO]
            returnVO.addTagAnnotation(SCGAnnotations.ANNOTATION_RETURN_NODE)
        }
        
        if (newMethod !== null) {
            scg.addReferenceAnnotation(SCGAnnotations.ANNOTATION_METHOD_REFERENCE, newMethod)
            // Handle self object reference
            if (newMethod.eContainer instanceof ClassDeclaration) {
                val classDecl = newMethod.eContainer as ClassDeclaration
                val innerVOs = classDecl.declarations.map[valuedObjects].flatten.toList
                val VORtoInner = scg.nodes.map[
                    eAllContents.filter(ValuedObjectReference).toIterable
                ].flatten.filter[
                    innerVOs.contains(valuedObject)
                ].toList
                if (!VORtoInner.empty) {
                    val selfVO = createValuedObject("self") => [markSelfVO]
                    scg.declarations += createVariableDeclaration(ValueType.HOST) => [
                        valuedObjects += selfVO
                        hostType = classDecl.name
                        setSelfParameterClass(classDecl)
                    ]
                    newMethod.markSelfInParameter
                    // Fix VOR
                    for (vor : VORtoInner) {
                        vor.prependReferenceToReference(selfVO)
                    }
                }
            }
            // Check for external VO access
            if (scg.nodes.map[eAllContents.toIterable].flatten.filter(ValuedObjectReference).exists[
                   !it.isSubReference && !valuedObject.isParameter && !valuedObject.isLocalVariable]) {
                newMethod.markTickDataInParameter
            }
        }
        
        scg.removeSuperflousConditionals
        scg.markAllLocalVariables
        
        // restore state
        valuedObjectMapping.clear
        valuedObjectMapping.putAll(_valuedObjectMapping)
        nodeMapping.clear
        nodeMapping.putAll(_nodeMapping)
        reverseNodeMapping.clear
        reverseNodeMapping.putAll(_reverseNodeMapping)
        labelMapping.clear
        labelMapping.putAll(_labelMapping)
        gotoFlows.clear
        gotoFlows.putAll(_gotoFlows)
        unmappedLabels.clear
        unmappedLabels.addAll(_unmappedLabels)
        return scg
    }

    private dispatch def SCLContinuation transform(Module program, SCGraph scg, List<ControlFlow> incoming) {
        val entry = createEntry.trace(program).createNodeList(program) as Entry => [
            scg.nodes += it
        ]
        program.statements.transform(scg, entry.createControlFlow.toList) => [ continuation |
            createExit.trace(program).createNodeList(program) as Exit => [
                scg.nodes += it
                it.entry = entry
                it.controlFlowTarget(continuation.getControlFlows)
                labelMapping.put(continuation.label, it)
                for (l : unmappedLabels)
                    labelMapping.put(l, it)
                unmappedLabels.clear
            ]
        ]

        new SCLContinuation => []
    }

    private dispatch def SCLContinuation transform(List<Statement> statements, SCGraph scg, List<ControlFlow> incoming) {
        var cf = incoming
        var continuation = new SCLContinuation

        val labelList = new ArrayList<Label>()
        if (statements.size > 0) {
            for (statement : statements) {

                continuation = statement.transform(scg, cf)

                if (continuation.label !== null) {
                    labelList.add(continuation.label)
                } else if (!labelList.empty && continuation.node !== null) {
                    val node = continuation.node
                    labelList.forEach[labelMapping.put(it, node)]
                    labelList.clear
                }

                cf = continuation.controlFlows
            }
        } else {
            continuation.controlFlows += incoming
        }
        
        labelList.forEach[ unmappedLabels.add(it) ]

        continuation
    }

    private dispatch def SCLContinuation transform(Label l, SCGraph scg, List<ControlFlow> incoming) {
        new SCLContinuation => [
            controlFlows += incoming
            label = l
        ]
    }

    private dispatch def SCLContinuation transform(de.cau.cs.kieler.scl.Assignment assignment, SCGraph scg,
        List<ControlFlow> incoming) {
            new SCLContinuation => [
                node = sCGFactory.createAssignment.trace(assignment).createNodeList(assignment) as Assignment => [
                    scg.nodes += it
                    it.operator = assignment.operator
                    if (assignment.expression !== null) it.expression = assignment.expression.copyAndFixVORs
                    it.reference = assignment.reference.copyAndFixVORs
                    it.controlFlowTarget(incoming)
                    for(annotation : assignment.annotations) {
                        it.annotations += annotation.copy
                    }
                    
                    // Copy SDs for assignments
                    for (s : assignment.schedule) {
                        it.schedule += valuedObjectMapping.get(s.valuedObject).createScheduleReference => [
                            it.priority = s.priority
                        ]
                    }
                    // Add nested expression SDs to the assignment
                    for (s : expression.allSchedulingReferences) {
                        it.schedule += s.copy
                    }
                ]
                controlFlows += node.createControlFlow
            ]
    }

    private dispatch def SCLContinuation transform(de.cau.cs.kieler.scl.Conditional conditional, SCGraph scg,
        List<ControlFlow> incoming) {
        new SCLContinuation => [ continue |
            continue.node = createConditional.trace(conditional).createNodeList(conditional) as Conditional => [
                scg.nodes += it
                it.condition = conditional.expression.copyAndFixVORs
                it.controlFlowTarget(incoming)
                conditional.statements.transform(scg, it.createControlFlow.toList) =>
                    [continue.controlFlows += it.controlFlows]
                (conditional.^else?:SCLFactory::eINSTANCE.createScopeStatement).transform(scg, it.createControlFlow.toList) =>
                    [continue.controlFlows += it.controlFlows]
                for(annotation : conditional.annotations) {
                    it.annotations += annotation.copy
                }
            ]
        ]
    }

    private dispatch def SCLContinuation transform(Parallel parallel, SCGraph scg, List<ControlFlow> incoming) {
        new SCLContinuation => [ cont |
            val fork = createFork.trace(parallel).createNodeList(parallel) as Fork => [
                scg.nodes += it
                it.controlFlowTarget(incoming)
                type = ForkType.get(parallel.forkType.value)
            ]
            val join = createJoin.trace(parallel).createNodeList(parallel) as Join => [
                scg.nodes += it
                it.fork = fork
                any = parallel.joinAny
            ]
            parallel.threads.forEach [ thread |
                val forkFlow = fork.createControlFlow
                val threadEntry = createEntry.trace(thread).createNodeList(thread) => [
                    scg.nodes += it
                    it.controlFlowTarget(forkFlow.toList)
                    thread.copyAnnotations(it) 
                ]
                val continuation = thread.statements.transform(scg, threadEntry.createControlFlow.toList)
                createExit.trace(thread).createNodeList(thread) => [
                    (it as Exit).entry = threadEntry as Entry
                    scg.nodes += it
                    it.controlFlowTarget(continuation.controlFlows)
                    it.createControlFlow.setTarget(join)
                    if (continuation.label !== null) {
                        labelMapping.put(continuation.label, it)
                    }
                    for (l : unmappedLabels)
                        labelMapping.put(l, it)
                    unmappedLabels.clear
                    
                ]
            ]
            cont.node = fork
            cont.controlFlows += join.createControlFlow
        ]
    }

    private dispatch def SCLContinuation transform(Pause pause, SCGraph scg, List<ControlFlow> incoming) {
        new SCLContinuation => [
            val surface = createSurface.trace(pause).createNodeList(pause) as Surface => [
                scg.nodes += it
                it.controlFlowTarget(incoming)
            ]
            node = createDepth.trace(pause).createNodeList(pause) as Depth => [
                scg.nodes += it
                it.surface = surface
            ]
            controlFlows += node.createControlFlow
        ]
    }

    private dispatch def SCLContinuation transform(Goto goto, SCGraph scg, List<ControlFlow> incoming) {
        gotoFlows.put(goto, incoming)
        new SCLContinuation => [
            if (labelMapping.keySet.contains(goto.target)) {
                val node = labelMapping.get(goto.target)
                if (node instanceof Depth) {
                    (node as Depth).surface.controlFlowTarget(incoming)
                } else {
                    node.controlFlowTarget(incoming)
                }
                incoming.forEach[annotations.addAll(goto.annotations.map[copy])]
            }
        ]
    }
    
    private dispatch def SCLContinuation transform(Return ret, SCGraph scg,
        List<ControlFlow> incoming) {
        new SCLContinuation => [
            node = sCGFactory.createAssignment.trace(ret).createNodeList(ret) as Assignment => [
                scg.nodes += it
                if (ret.expression !== null) it.expression = ret.expression.copyAndFixVORs
                if (returnVO === null) returnVO = createValuedObject => [name = "return"]
                it.valuedObject = returnVO
                it.controlFlowTarget(incoming)
                it.addTagAnnotation(SCGAnnotations.ANNOTATION_RETURN_NODE)
                for(annotation : ret.annotations) {
                    it.annotations += annotation.copy
                }
            ]
            controlFlows += node.createControlFlow
        ]
    }
    
    private dispatch def SCLContinuation transform(Scope scope, SCGraph scg, List<ControlFlow> incoming) {
    	transform(scope.statements, scg, incoming)
    }
    
    private dispatch def SCLContinuation transform(Loop loop, SCGraph scg, List<ControlFlow> incoming) {
        new SCLContinuation => [ continue |
            var cf = incoming
            // init
            if (loop.initialization !== null) {
                val init = loop.initialization
                val asm = sCGFactory.createAssignment.trace(loop, init).createNodeList(init) as Assignment
                scg.nodes += asm
                asm.expression = init.expression.copyAndFixVORs
                asm.reference = init.reference.copyAndFixVORs
                asm.operator = init.operator
                asm.controlFlowTarget(cf)
                asm.markLoopHeaderPart("init")
                asm.annotations += init.annotations.map[copy]
                cf = newArrayList(asm.createControlFlow)
            } else if (loop.initializationDeclaration !== null) {
                val decl = loop.initializationDeclaration
                scg.declarations += newArrayList(decl as Declaration).copyDeclarations(valuedObjectMapping, null)
                VariableStore.get(environment)?.remove(decl.valuedObjects.head)
                scg.declarations.last => [
                    trace(decl)
                    markLoopHeaderPart("init")
                ]
                for (vo : decl.valuedObjects) {
                    if (vo.initialValue !== null) {
                        val init = vo.initialValue
                        val asm = sCGFactory.createAssignment.trace(loop, decl).createNodeList(vo) as Assignment
                        scg.nodes += asm
                        asm.expression = init.copyAndFixVORs
                        asm.valuedObject = vo.getNewValuedObject
                        asm.operator = AssignOperator.ASSIGN
                        asm.controlFlowTarget(cf)
                        asm.markLoopHeaderPart("init", "decl")
                        asm.annotations += vo.annotations.map[copy]
                        cf = newArrayList(asm.createControlFlow)
                    }
                }
            }
            
            // condition
            val cond = createConditional.trace(loop, loop.condition).createNodeList(loop) as Conditional
            continue.node = cond
            scg.nodes += cond
            cond.condition = loop.condition.copyAndFixVORs
            cond.controlFlowTarget(cf)
            cond.markLoopHeaderPart("condition")
            cond.then = createControlFlow
            cond.^else = createControlFlow
            continue.controlFlows = newArrayList(cond.^else)
            
            val body = loop.statements.transform(scg, newArrayList(cond.then))
            cf = body.controlFlows
            // increment
            if (loop.afterthought !== null && !cf.nullOrEmpty) {
                val incr = loop.afterthought
                val asm = sCGFactory.createAssignment.trace(loop, incr).createNodeList(incr) as Assignment
                scg.nodes += asm
                asm.expression = incr.expression.copyAndFixVORs
                asm.reference = incr.reference.copyAndFixVORs
                asm.operator = incr.operator
                asm.controlFlowTarget(cf)
                asm.markLoopHeaderPart("after")
                asm.annotations += incr.annotations.map[copy]
                cf = newArrayList(asm.createControlFlow)
            }
            
            // loop
            cf?.forEach[
                markExplicitLoop
                target = cond
            ]
        ]
    }

    // Valued objects must be set according to the mapping!
    private def ValuedObject getNewValuedObject(ValuedObject valuedObject) {
        valuedObjectMapping.get(valuedObject)
    }
    
    private def <T extends Expression> T copyAndFixVORs(T expression) {
        if (expression === null) return null
        
        val newExpression = expression.copy
        if (newExpression instanceof ValuedObjectReference) {
            if (valuedObjectMapping.containsKey(newExpression.valuedObject)) {
                newExpression.valuedObject = newExpression.valuedObject.newValuedObject
            } else {
                // It is ok to find no VO because methods may refer to VOs outside the transformed scope
            }
        }
        for (vor : newExpression.eAllContents.filter(ValuedObjectReference).toIterable) {
            if (valuedObjectMapping.containsKey(vor.valuedObject)) {
                vor.valuedObject = vor.valuedObject.newValuedObject
            } else {
                // It is ok to find no VO because methods may refer to VOs outside the transformed scope
            }
        }
        return newExpression
    }

    private def Node createNodeList(Node node, EObject eObject) {
        if (!nodeMapping.keySet.contains(eObject)) {
            nodeMapping.put(eObject, <Node>newArrayList(node))
        } else {
            node.addNode(eObject)
        }
        reverseNodeMapping.put(node, eObject)
        node
    }

    private def List<Node> getNodeList(EObject eObject) {
        nodeMapping.get(eObject)
    }

    private def Node addNode(Node node, EObject eObject) {
        node => [eObject.nodeList.add(it)]
    }

    private def Node controlFlowTarget(Node node, List<ControlFlow> controlFlows) {
        node => [n|controlFlows.forEach[target = n]]
    }

    private def List<ControlFlow> toList(ControlFlow controlFlow) {
        <ControlFlow>newArrayList(controlFlow)
    }
    


// -------------------------------------------------------------------------   
}

class SCLContinuation {
    @Accessors Node node
    @Accessors List<ControlFlow> controlFlows = <ControlFlow> newArrayList
    @Accessors Label Label
}
