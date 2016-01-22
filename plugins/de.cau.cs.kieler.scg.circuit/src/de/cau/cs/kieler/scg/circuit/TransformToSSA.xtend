package de.cau.cs.kieler.scg.circuit

import de.cau.cs.kieler.scg.Node
import java.util.List
import java.util.LinkedList
import de.cau.cs.kieler.scg.Conditional
import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.keffects.extensions.KEffectsSerializeExtensions
import de.cau.cs.kieler.scg.Assignment
import java.util.HashMap
import de.cau.cs.kieler.scg.ScgFactory

import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.scg.sequentializer.AssignmentExpression
import de.cau.cs.kieler.scg.extensions.SCGDeclarationExtensions
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectReferenceImpl

class TransformToSSA {
	@Inject
	extension KExpressionsDeclarationExtensions

	@Inject
	extension SCGDeclarationExtensions

	@Inject
	extension KExpressionsValuedObjectExtensions

	@Inject
	extension KEffectsSerializeExtensions

	def transformAssignments2SSAs(List<Assignment> assignments) {

		// stores names of SSA variables and the latest version numbers
		val ssaMap = new HashMap<String, Integer>

		// adds each non unique assignment to ssaMap
		filterRelevantAssignments(ssaMap, assignments)

		// create a new assignment list containing the SSAs
		val ssaAssignmentList = transformAssignments(assignments, ssaMap);

		return ssaAssignmentList

	}

	def filterRelevantAssignments(HashMap<String, Integer> ssaMap, List<Assignment> assignments) {
		assignments.forEach [ a |
			val name = a.valuedObject.name
			// gx and _condgx are unique 
			if (!(name.startsWith("g") || (name.startsWith("_")))) {

				// insert every SSA variable into ssaMap and set its version to 0
				if (!ssaMap.containsKey(name)) {
					ssaMap.put(name, 0);
					System.out.println("added " + name + " with value " + ssaMap.get(name))
				}
			}
		]
	}

	def transformAssignments(List<Assignment> assignments, HashMap<String, Integer> ssaMap) {

		// new assignment list with SSA values
		val newAssignmentList = new LinkedList<Assignment>

		/*
		 * for each scg assignment a new assignment with SSA values is created and added to the return list
		 * therefore two things need to be checked:
		 * 
		 * - is a relevant variable somewhere on the right side of the assignment? 
		 * 		-->  add a version number to that variable.
		 * this has to be checked first to avoid self-loops
		 * 
		 * - is the left side of the assignment a relevant variable? 
		 * 		--> add a version number to new assignment and increment the version number
		 */
		for (Assignment a : assignments) {

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

				// increment version number of this variable for next usage
				var version = ssaMap.get(name)
				ssaMap.replace(name, version, version + 1)

			} else {
				// don't change the name
				val vo = createValuedObject(name)
				newAssignment.valuedObject = vo
			}

			// add the new Assignment to SSA List
			newAssignmentList.add(newAssignment)

		}

		return newAssignmentList

	}

	def Expression transformExpressions(Expression expression, HashMap<String, Integer> map) {

		val values = expression.eAllContents.filter(ValuedObjectReference)
		
		values.forEach [ v |
			val varName = v.valuedObject.name

			if (map.containsKey(varName)) {
				v.valuedObject.name = varName + "_" + map.get(varName)

				System.out.println("Changed " + varName + " to " + v.valuedObject.name)
			}
		]
		expression
	}
}