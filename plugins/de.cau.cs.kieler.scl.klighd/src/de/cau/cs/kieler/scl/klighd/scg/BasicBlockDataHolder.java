package de.cau.cs.kieler.scl.klighd.scg;

import java.util.ArrayList;

import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.kgraph.impl.KGraphDataImpl;
import de.cau.cs.kieler.scl.scl.Statement;

public class BasicBlockDataHolder extends KGraphDataImpl {

//    public ArrayList<Statement> BasicBlock;
    public Statement BasicBlockRootStatement;
    public ArrayList<KNode> BasicBlockNodes;
    
    BasicBlockDataHolder(Statement rootStatement) {
        BasicBlockRootStatement = rootStatement;
        BasicBlockNodes = new ArrayList<KNode>();
    }
    
    public void addNode(KNode node) {
        BasicBlockNodes.add(node);
    }
    
}
