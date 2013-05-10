package de.cau.cs.kieler.scl.klighd.scg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.kgraph.impl.KGraphDataImpl;
import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.scl.extensions.BasicBlock;
import de.cau.cs.kieler.scl.scl.Instruction;
import de.cau.cs.kieler.scl.scl.Statement;

public class BasicBlockDataHolder extends KGraphDataImpl {

    public List<BasicBlock> BasicBlockData;
    public HashMap<Instruction, Pair<KNode, KNode>> NodeData;
    
//    BasicBlockDataHolder(Statement rootStatement) {
//        BasicBlockRootStatement = rootStatement;
//        BasicBlockNodes = new ArrayList<Pair<KNode, Statement>>();
//    }

    BasicBlockDataHolder() {
        BasicBlockData = new ArrayList<BasicBlock>();
        NodeData = new HashMap<Instruction, Pair<KNode, KNode>>();
    }
    
}
