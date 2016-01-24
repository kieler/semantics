package de.cau.cs.kieler.scg.circuit

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.ScgFactory
import java.util.HashMap
import java.util.LinkedList
import java.util.List

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

class TransformToSSA {

    @Inject
    extension KExpressionsValuedObjectExtensions

    def transformAssignments2SSAs(List<Node> nodes) {
        // stores names of SSA variables and the latest version numbers
        val ssaMap = new HashMap<String, Integer>

        // adds each non unique assignment to ssaMap
        filterRelevantAssignments(nodes.filter(Assignment).toList, ssaMap)

        // create a new node list containing the SSAs
        // this has to be done because otherwise all ssa nodes would reference the same abject 
        val ssaList = transformNodes(nodes, ssaMap);

        return ssaList

    }

    def transformNodes(List<Node> nodes, HashMap<String, Integer> ssaMap) {
        val newSSANodes = new LinkedList<Node>
        var condBranch = false
        var Node endCondition

        for (n : nodes) {
            if (n instanceof Assignment) {

                if (!condBranch) {
//                    System.out.println("added ASS")

                    newSSANodes.add(transformAssignment(n, ssaMap))
                }

            } else if (n instanceof Conditional) {
                condBranch = true
//                System.out.println("added CON")
                transformConditional(n, ssaMap, newSSANodes)
                endCondition = n.^else.target
            // newSSANodes.add(n)
            }
            if (n == endCondition) {
                condBranch = false
            }
        }
        return newSSANodes

    }

    def Conditional transformConditional(Conditional conditional, HashMap<String, Integer> ssaMap,
        LinkedList<Node> newSSANodes) {
        val Conditional condCopy = conditional.copy
        newSSANodes.add(condCopy)
        val Node condEnd = conditional.^else.target
        val Node condTarget = conditional.then.target
        var Node nextNode

        switch (condTarget) {
            Assignment: {
                nextNode = condTarget.next.target
                condCopy.then.target = transformAssignment(condTarget, ssaMap)
            }
            Conditional: {
                nextNode = condTarget.^else.target // // gut möglich dass das unsinn ist
                condCopy.then.target = transformConditional(condTarget, ssaMap, newSSANodes)
            }
        }
//        System.out.println("added CONDITIONtarget")

        newSSANodes.add(condCopy.then.target)

        while (nextNode != condEnd) {
            switch (nextNode) {
                Assignment: {
                    newSSANodes.add(transformAssignment(nextNode, ssaMap))
//                    System.out.println("added Assignment " + nextNode.valuedObject.name)

                    nextNode = nextNode.next.target
                }
                Conditional: {
                    transformConditional(nextNode, ssaMap, newSSANodes)
                    nextNode = nextNode.^else.target // // gut möglich dass das unsinn ist
//                    System.out.println("added Cond")

                }
            }
        }

        switch (condEnd) {
            Assignment: condCopy.^else.target = transformAssignment(condEnd, ssaMap)
            Conditional: condCopy.^else.target = condEnd
        }
//        System.out.println("added CONDITIONend")
        newSSANodes.add(condCopy.^else.target)

        return condCopy
    }

    def filterRelevantAssignments(List<Assignment> assignments, HashMap<String, Integer> ssaMap) {

        assignments.forEach [ a |
            val name = a.valuedObject.name
            // gx and _condgx are unique 
            if (!(name.startsWith("g") || (name.startsWith("_")))) {

                // insert every SSA variable into ssaMap and set its version to 0
                if (!ssaMap.containsKey(name)) {
                    ssaMap.put(name, 0);
//                    System.out.println("added " + name + " with value " + ssaMap.get(name))
                }
            }
        ]
    }

    def transformAssignment(Assignment a, HashMap<String, Integer> ssaMap) {

//      // new assignment list with SSA values
//      val newAssignmentList = new LinkedList<Assignment>
        /*
         * for each scg assignment a new assignment with SSA values is created and added to the return list
         * therefore two things need to be checked:
         * 
         * - is a relevant variable on the right side of the assignment? 
         *      -->  add a version number to that variable.
         * this has to be checked first to avoid self-loops
         * 
         * - is the left side of the assignment a relevant variable? 
         *      --> add a version number to new assignment and increment the version number
         */
//      for (Assignment a : assignments) {
        val newAssignment = ScgFactory::eINSTANCE.createAssignment

        // copy right side of the assignment
        val copyExpr = a.assignment.copy

        val name = a.valuedObject.name

        // check if right side has relevant variables and "replace" them with ssa 
        newAssignment.assignment = transformExpressions(copyExpr, ssaMap)

        // check if left side is a relevant variable
        if (ssaMap.containsKey(name)) {

            val vo = createValuedObject(name + "_" + ssaMap.get(name))
            newAssignment.valuedObject = vo

            System.out.println("changed " + name + " to " + newAssignment.valuedObject.name)

            // increment version number of variable for next usage
            var version = ssaMap.get(name)
            ssaMap.replace(name, version, version + 1)

        } else {
            // don't change the name
            val vo = createValuedObject(name)
            newAssignment.valuedObject = vo
        }

//          // add the new Assignment to SSA List
//          newAssignmentList.add(newAssignment)
//      }
        return newAssignment
    }

    def Expression transformExpressions(Expression expression, HashMap<String, Integer> map) {

        val values = expression.eAllContents.filter(ValuedObjectReference)

        values.forEach [ v |
            val varName = v.valuedObject.name

            if (map.containsKey(varName)) {
                v.valuedObject.name = varName + "_" + map.get(varName)

//                System.out.println("Changed " + varName + " to " + v.valuedObject.name)
            }
        ]
        expression
    }
}