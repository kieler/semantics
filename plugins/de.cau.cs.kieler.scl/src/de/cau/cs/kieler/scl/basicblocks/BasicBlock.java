/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scl.basicblocks;

import java.util.ArrayList;
import java.util.List;

import de.cau.cs.kieler.scl.scl.Statement;
import de.cau.cs.kieler.scl.scl.impl.StatementSequenceImpl;

/**
 * @author ssm
 *
 */
public class BasicBlock {
    
    protected ArrayList<Statement> statements;
    
    public BasicBlock() {
        statements = new ArrayList<Statement>();
    }
    
    public BasicBlock(Statement headStatement) {
        statements = new ArrayList<Statement>();
        getStatements().add(headStatement);
    }
    
    public void add(Statement statement) {
        statements.add(statement);
    }
    
    public void addAll(List<Statement> statements) {
        statements.addAll(statements);
    }
    
    public Statement getHead() {
        return getStatements().get(0);
    }
    
    public List<Statement> getStatements() {
        return statements;
    }
    
    public boolean isEqual(BasicBlock basicBlock) {
        if (basicBlock.getStatements().size()!=this.getStatements().size()) return false;
        if (this.getStatements().size()>0) {
            if (!basicBlock.getHead().equals(this.getHead())) return false;
        }
        return true;
    }
}
