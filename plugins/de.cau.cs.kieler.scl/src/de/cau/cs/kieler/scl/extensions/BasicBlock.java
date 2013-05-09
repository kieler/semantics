package de.cau.cs.kieler.scl.extensions;

import java.util.ArrayList;
import java.util.List;

import de.cau.cs.kieler.scl.scl.Statement;

public class BasicBlock {
    
    public List<Statement> StatementSequence;
    public boolean PauseHeadIsSurface;
    
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
    
    public void setPauseHeadIsSurface(boolean isSurface) {
        PauseHeadIsSurface = isSurface;
    }
    
    public Statement getHead() {
        return StatementSequence.get(0);
    }

}
