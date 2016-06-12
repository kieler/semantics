package de.cau.cs.kieler.scg.opt.reusevars

import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.opt.features.OptimizerFeatures
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.features.SCGFeatureGroups
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.impl.AssignmentImpl
import java.util.ArrayList
import de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectReferenceImpl
import java.util.TreeMap
import de.cau.cs.kieler.core.kexpressions.impl.OperatorExpressionImpl
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.impl.ConditionalImpl
import de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectImpl
import de.cau.cs.kieler.core.kexpressions.Declaration
import java.util.Map.Entry

class ReuseVariables extends AbstractProductionTransformation {
    ArrayList<Node> visited = new ArrayList() 
    Iterable<AssignmentImpl> assignments;
    private static final val MAX_SEARCH_DEPTH = 100 // good value for big and small models to achieve fast output
    override getProducedFeatureId() {
        return OptimizerFeatures::RV_ID
    }
    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::SEQUENTIALIZE_ID, SCGFeatureGroups::SCG_ID/* , OptimizerFeatures::CP_ID */)
    }
    override getId() {
        return OptimizerFeatures::RV_ID
    }
    override getName() {
        return OptimizerFeatures::RV_NAME
    }
    def SCGraph transform(SCGraph scg) {
        /* SET FILTER */
        val nodes = scg.nodes
        val declarations = scg.declarations
        assignments = nodes.filter(typeof(AssignmentImpl)).filter [
            it.operator.getName().equals("ASSIGN")
        ].filter [
            if (it.valuedObject == null) {
                return false
            }
            it.valuedObject.getName().startsWith("g")
        ]
        val lastUse = new TreeMap<String, Pair<Node, Node>>()
        /* GET LAST USE */
        val uses = new ArrayList<Pair<ValuedObjectReferenceImpl, Node>>() // use and node
        val preUses = new ArrayList<ValuedObjectReferenceImpl>()

        nodes.forEach [
            val node = it
            val objects = it.eAllContents().filter(typeof(ValuedObjectReferenceImpl)).filter [
                it.valuedObject.name.startsWith("g")
            ]
            objects.forEach [
                if (it.eContainer instanceof OperatorExpressionImpl) {
                    val op = it.eContainer as OperatorExpressionImpl
                    if (op.operator.getName().equals("PRE")) {
                        preUses.add(it)
                    }
                }
                uses.add(new Pair(it, node))
            ]
        ]
        /* clean PRE reads */
        preUses.forEach [
            val pre = it
            val rm = new ArrayList<Pair<ValuedObjectReferenceImpl, Node>>()
            uses.filter [
                it.key.valuedObject.name.equals(pre.valuedObject.name)
            ].forEach [
                rm.add(it)
            ]
            rm.forEach [
                uses.remove(it)
            ]
        ]
        uses.forEach [
            val name = it.key.valuedObject.name
            if (lastUse.containsKey(name)) {
                val tmp = lastUse.get(name)
                lastUse.replace(name, new Pair(tmp.key, it.value))
            } else {
                val assigment = assignments.findFirst[
                    it.valuedObject.name.equals(name)
                ]
                lastUse.put(name, new Pair(assigment, it.value))
            }
        ]
        do {
            // get first element of last use
            val firstElem = lastUse.pollFirstEntry
            // get second element which is not a pre-node from firstElem
            val secondElem = GetSecondElem(lastUse, firstElem)
            if (secondElem != null) {
                lastUse.remove(secondElem.key)
                // get all occures / assigments of secondElem
                val valuedObjRep = new ArrayList<ValuedObjectReferenceImpl>()
                nodes.forEach[
                    if (it instanceof AssignmentImpl) {
                        val assNode = it as AssignmentImpl
                        val objects = assNode.eAllContents.filter(typeof(ValuedObjectReferenceImpl)).filter[
                            it.valuedObject.name.equals(secondElem.key)
                        ]
                        objects.forEach[
                            valuedObjRep.add(it)
                        ]
                    } else if (it instanceof ConditionalImpl) {
                        val condNode = it as ConditionalImpl
                        val objects = condNode.eAllContents.filter(typeof(ValuedObjectReferenceImpl)).filter[
                            it.valuedObject.name.equals(secondElem.key)
                        ]
                        objects.forEach[
                            valuedObjRep.add(it)
                        ]
                    }
                ]
                valuedObjRep.forEach[
                    //it.valuedObject.name = firstElem.key
                    val firstAss = assignments.findFirst[
                        it.valuedObject.name.equals(firstElem.key)
                    ]
                    it.valuedObject = firstAss.valuedObject
                    // replace second assignment with first one
                    val secondAss = assignments.findFirst[
                        it.valuedObject.name.equals(secondElem.key)
                    ]
                    if(secondAss != null) {
                        secondAss.valuedObject = firstAss.valuedObject   
                    }
                ]
                val declChanges = new ArrayList<Pair<Declaration, ValuedObjectImpl>>()
                declarations.forEach[
                    val decl = it
                    it.valuedObjects.forEach[
                        val itN = it as ValuedObjectImpl
                        if(itN.getName().equals(secondElem.key)) {
                            declChanges.add(new Pair(decl, itN))
                        }
                    ]
                ]
                declChanges.forEach[
                    it.key.valuedObjects.remove(it.value)
                ]
            }
        } while (lastUse.size > 0)

        return scg
    }
    def boolean InNextPointerChain(Node needle, Node nextP, boolean hard) {
        visited.clear()
        return InNextPointerChain(needle, nextP, false, 0)
    }
    def boolean InNextPointerChain(Node needle, Node nextP, boolean hard, int hops) {
        if(visited.contains(nextP)) {
            return false
        }
        visited.add(nextP)
        if(MAX_SEARCH_DEPTH != 0 && hops > MAX_SEARCH_DEPTH) {
            return false
        }
        if (hard && nextP.equals(needle)) {
            return true
        }
        if (nextP instanceof ConditionalImpl) {
            val condNode = nextP as ConditionalImpl
            var one = false
            var two = false
            if (!condNode.^else.target.equals(needle)) {
                one = InNextPointerChain(needle, condNode.^else.target, hard, hops + 1)
            } else {
                one = true
            }
            if (one || !condNode.then.target.equals(needle)) {
                two = InNextPointerChain(needle, condNode.then.target, hard, hops + 1)
            } else {
                two = true
            }
            return one || two
        } else if (nextP instanceof AssignmentImpl) {
            val assNode = nextP as AssignmentImpl
            if (!assNode.next.target.equals(needle)) {
                return InNextPointerChain(needle, assNode.next.target, hard, hops + 1)
            } else {
                return true
            }
        }
        return false
    }
    def Entry<String, Pair<Node,Node>> GetSecondElem(TreeMap<String, Pair<Node,Node>> map, Entry<String, Pair<Node,Node>> firstEntry) {
        val tmp = new ArrayList<String>()
        map.forEach [ K, V |
            tmp.add(K)
        ]
        for (var i = 0; i < tmp.size; i++) {
            val elem = map.get(tmp.get(i))
            if(InNextPointerChain(elem.key, firstEntry.value.value, true)) {
                return map.ceilingEntry(tmp.get(i))
            }
        }
        return null
    }
}
