package de.cau.cs.kieler.scg.synchronizer

import de.cau.cs.kieler.scgbb.SchedulingBlock
import de.cau.cs.kieler.scgsched.GuardExpression
import de.cau.cs.kieler.scgsched.ScgschedFactory

class SynchronizerData {
    public var predecessors = <SchedulingBlock> newArrayList
    public var GuardExpression guardExpression = ScgschedFactory::eINSTANCE.createGuardExpression
}