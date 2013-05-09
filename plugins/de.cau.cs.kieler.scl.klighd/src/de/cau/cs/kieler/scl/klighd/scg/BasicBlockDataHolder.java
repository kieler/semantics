package de.cau.cs.kieler.scl.klighd.scg;

import java.util.ArrayList;

import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.kgraph.impl.KGraphDataImpl;
import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.scl.scl.Statement;

public class BasicBlockDataHolder extends KGraphDataImpl {

//    public ArrayList<Statement> BasicBlock;
    public Statement BasicBlockRootStatement;
    public ArrayList<Pair<KNode,Statement>> BasicBlockNodes;
    
    BasicBlockDataHolder(Statement rootStatement) {
        BasicBlockRootStatement = rootStatement;
        BasicBlockNodes = new ArrayList<Pair<KNode, Statement>>();
    }
    
    public void addNode(KNode node, Statement statement) {
        BasicBlockNodes.add(new Pair<KNode, Statement>(node, statement));
    }
    
}
