package de.cau.cs.kieler.scg.synchronizer

import java.util.ArrayList
import de.cau.cs.kieler.scgbb.BasicBlock
import de.cau.cs.kieler.core.kexpressions.Expression

class SynchronizerData {
    public var ArrayList<BasicBlock> predecessors = new ArrayList<BasicBlock>()
    public var ArrayList<Expression> activationExpressions = new ArrayList<Expression>()
}