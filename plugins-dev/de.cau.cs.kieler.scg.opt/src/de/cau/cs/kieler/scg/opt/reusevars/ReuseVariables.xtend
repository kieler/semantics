package de.cau.cs.kieler.scg.opt.reusevars

import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.opt.features.OptimizerFeatures
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.features.SCGFeatureGroups
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.impl.AssignmentImpl
import java.util.ArrayList
import de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectReferenceImpl
import java.util.HashMap
import java.util.TreeMap
import de.cau.cs.kieler.core.kexpressions.impl.OperatorExpressionImpl
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.impl.ConditionalImpl
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectImpl
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.scg.Assignment

class ReuseVariables extends AbstractProductionTransformation {
    private static final val DEBUG = true
    private static final val INSTRUMENTED = true
    
    override getProducedFeatureId() {
        return OptimizerFeatures::RV_ID
    }
    
    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::SEQUENTIALIZE_ID, SCGFeatureGroups::SCG_ID/*OptimizerFeatures::CP_ID*/)
    }
    
    override getId() {
        return OptimizerFeatures::RV_ID
    }
    
    override getName() {
        return OptimizerFeatures::RV_NAME
    }
    
    def SCGraph transform(SCGraph scg) {
        val startTime = System.nanoTime()
        /* SET FILTER */
        val nodes = scg.nodes
        val declarations = scg.declarations
        val assignments = nodes.filter(typeof(AssignmentImpl)).filter[
                it.operator.getName().equals("ASSIGN")
            ].filter[
                if(it.valuedObject == null) {
                    return false
                }
                it.valuedObject.getName().startsWith("g")
            ]
        if(INSTRUMENTED) {
            System.out.println("#START VARIABLE RECYCLING INSTRUMENTATION#")
            System.out.println("#BEFORE OPTIMIZATION")
            System.out.println("NodeCount: " + nodes.size)
            System.out.println("DeclarationCount: " + declarations.size)
            System.out.println("AssignmentCount: " + assignments.size)
        }
        
        // possible loop start here!!!
        
        val useIndex = new TreeMap<String, Pair<Integer, Integer>>()
        val lastUse = new TreeMap<String,Node>()
        var nextVar = ""
        do {
            useIndex.clear()
            lastUse.clear()
            
            if(DEBUG) {
                System.out.println("ASSIGNMENTS")
                assignments.forEach[
                    System.out.println(it.valuedObject.name)
                ]
            }
            /* GET LAST USE */
            val uses = new ArrayList<Pair<ValuedObjectReferenceImpl,Node>>() // use and node
            val preUses = new ArrayList<ValuedObjectReferenceImpl>()
            
            nodes.forEach[
                val node = it
                val objects = it.eAllContents().filter(typeof(ValuedObjectReferenceImpl)).filter[
                    it.valuedObject.name.startsWith("g")
                ]
                objects.forEach[
                    if(it.eContainer instanceof OperatorExpressionImpl) {
                        val op = it.eContainer as OperatorExpressionImpl
                        if(op.operator.getName().equals("PRE")) {
                            preUses.add(it)
                        }
                    }
                    uses.add(new Pair(it, node))
                ]
            ]
            /* clean PRE reads */
            preUses.forEach[
                val pre = it
                val rm = new ArrayList<Pair<ValuedObjectReferenceImpl, Node>>()
                uses.filter[
                    it.key.valuedObject.name.equals(pre.valuedObject.name)
                ].forEach[
                    rm.add(it)
                ]
                rm.forEach[
                    uses.remove(it)
                ]
            ]
            
            if(DEBUG) {
                System.out.println("USES")
                uses.forEach[
                    System.out.println(it.key.valuedObject.name + " in " + it.value)
                ]
            }
            
            /* calculate LastPos - FirstPos for sorting */
            for(var i = 0; i < uses.size; i++) {
                val obj = uses.get(i).key.valuedObject.name
                if(useIndex.containsKey(obj)) {
                    val tmp = useIndex.get(obj)
                    useIndex.replace(obj, new Pair(tmp.key, i))
                }
                else {
                    useIndex.put(obj, new Pair(i, i))
                }
            }
            if(DEBUG) {
                System.out.println("POSITIONS")
                useIndex.forEach[k, v|
                    System.out.println(k + ": " + v.key + " | " + v.value)
                ]
            }
            
            /* get last use */
            uses.forEach[
                val name = it.key.valuedObject.name
                val positions = useIndex.get(name)
                if((positions.value - positions.key) < 4) {
                    if(lastUse.containsKey(name)) {
                        lastUse.replace(name, it.value)
                    }
                    else {
                        lastUse.put(name, it.value)
                    }
                }
            ]
            
            if(DEBUG) {
                System.out.println("LAST USE")
                lastUse.forEach[k, v|
                    System.out.println(k + ": " + v)
                ]
            }
            
            /* replace one variable and loop */
            
            var lastVar = lastUse.firstEntry.key
            var lastVarOkay = false
            while(!lastVarOkay) {
                val rep = lastUse.get(lastVar) // get first from uses
                val nextAss = new ArrayList<AssignmentImpl>();
                if(rep instanceof ConditionalImpl) {
                    val cond = rep as ConditionalImpl
                    if(cond.^else.target instanceof AssignmentImpl) {
                        nextAss.add(cond.^else.target as AssignmentImpl)
                    }
                    if(cond.then.target instanceof AssignmentImpl) {
                        nextAss.add(cond.then.target as AssignmentImpl)
                    }
                }
                else if (rep instanceof AssignmentImpl) {
                    val ass = rep as AssignmentImpl
                    if(ass.next.target instanceof AssignmentImpl) {
                        nextAss.add(ass.next.target as AssignmentImpl)
                    }
                }
                
                if(nextAss.size > 0) {
                    var nextItem = nextAss.get(0);
                
                    for(item : nextAss) {
                        if(item.valuedObject.name.startsWith("g")) {
                            if(nextVar != null) {
                                nextItem = item
                            }
                        }
                    }
                    nextVar = nextItem.valuedObject.name
                    
                    if(!nextItem.valuedObject.name.equals(lastVar)) {
                        lastVarOkay = true
                    }
                    else {
                       lastUse.remove(lastVar)
                       lastVar = lastUse.firstEntry.key
                    }
                }
                else {
                    lastVarOkay = true
                }
            }
            if(DEBUG) {
                System.out.println("NextVar: " + nextVar)
            }
            val NV = nextVar
            val LV = lastVar
            
            if(DEBUG) {
                System.out.println("LastVar: " + lastVar)
                
            }
            
            
            /* replace all occures of NextVar with RepName */
            
            val valuedObjRep = new ArrayList<Pair<Node, ValuedObjectImpl>>()
            
            nodes.forEach[
                val node = it
                if(node instanceof AssignmentImpl) {
                    val assNode = node as AssignmentImpl
                    if(assNode.valuedObject.name.equals(NV)) {
                        valuedObjRep.add(new Pair(node, assNode.valuedObject))
                    }
                    assNode.assignment.eAllContents().filter(typeof(ValuedObjectReferenceImpl)).forEach[
                        if(it.valuedObject.name.equals(NV)) {
                            valuedObjRep.add(new Pair(node, it.valuedObject))
                        }
                    ]
                }
                else if(node instanceof ConditionalImpl) {
                    val condNode = node as ConditionalImpl
                    if(condNode.condition instanceof ValuedObjectReferenceImpl) {
                        val tmp = condNode.condition as ValuedObjectReferenceImpl
                        if(tmp.valuedObject.name.equals(NV)) {
                            valuedObjRep.add(new Pair(node, tmp.valuedObject))
                        }
                    }
                }
            ]
            
            if(DEBUG) {
                System.out.println("Replacements")
                valuedObjRep.forEach[
                    System.out.println(it.value.name + " in " + it.key)
                ]
            }
            
            valuedObjRep.forEach[
                it.value.name = LV
            ]
            
            if(DEBUG) {
                System.out.println("ASSIGNMENTS")
                assignments.forEach[
                    System.out.println(it.valuedObject.name)
                ]
            }
            
        } while(lastUse.size > 3 && !nextVar.equals(""))
        // loop
        
        val endTime = System.nanoTime()
        val duration = (endTime - startTime) as long
        if(INSTRUMENTED) {
            
            
            System.out.println("#END VARIABLE RECYCLING INSTRUMENTATION#")
        }
        System.out.println("Variable Recycling elapsed time: " + (duration as double) / 1000000000 + " s")
        
        return scg
    }
}