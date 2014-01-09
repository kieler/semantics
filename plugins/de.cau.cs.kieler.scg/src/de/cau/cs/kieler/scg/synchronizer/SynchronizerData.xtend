package de.cau.cs.kieler.scg.synchronizer

import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.scgbb.BasicBlock

class SynchronizerData {
    public var predecessors = <BasicBlock> newArrayList
    public var Expression guardExpression
    public var emptyExpressions = <Expression> newArrayList
    public var emptyGuards = <ValuedObject> newArrayList
}