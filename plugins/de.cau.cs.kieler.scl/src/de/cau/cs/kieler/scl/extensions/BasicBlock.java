package de.cau.cs.kieler.scl.extensions;

import java.util.ArrayList;
import java.util.List;

import de.cau.cs.kieler.scl.scl.Statement;

public class BasicBlock {
    
    public List<Statement> StatementSequence;
    public boolean PauseHeadIsDepth = false;
    
    BasicBlock() {
        StatementSequence = new ArrayList<Statement>();
    }
    
    BasicBlock(Statement headStatement) {
        StatementSequence = new ArrayList<Statement>();
        StatementSequence.add(headStatement);
    }
    
    public void add(Statement statement) {
        StatementSequence.add(statement);
    }
    
    public void addAll(List<Statement> statements) {
        StatementSequence.addAll(statements);
    }
    
    public void setPauseHeadIsDepth(boolean isDepth) {
        PauseHeadIsDepth = isDepth;
    }
    
    public Statement getHead() {
        return StatementSequence.get(0);
    }

    public boolean isEqual(BasicBlock basicBlock) {
        if (basicBlock.StatementSequence.size()!=this.StatementSequence.size()) return false;
        if (basicBlock.PauseHeadIsDepth!=this.PauseHeadIsDepth) return false;
        if (this.StatementSequence.size()>0) {
            if (!basicBlock.StatementSequence.get(0).equals(this.StatementSequence.get(0))) return false;
        }
        return true;
    }
}
