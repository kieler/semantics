package de.cau.cs.kieler.scg.synchronizer

import de.cau.cs.kieler.scgbb.SchedulingBlock
import de.cau.cs.kieler.scgsched.GuardExpression
import de.cau.cs.kieler.scgsched.ScgschedFactory
import de.cau.cs.kieler.core.kexpressions.ValuedObject

class SynchronizerData {
    public var predecessors = <SchedulingBlock> newArrayList
    public var valuedObjects = <ValuedObject> newArrayList
    public var GuardExpression guardExpression = ScgschedFactory::eINSTANCE.createGuardExpression
}