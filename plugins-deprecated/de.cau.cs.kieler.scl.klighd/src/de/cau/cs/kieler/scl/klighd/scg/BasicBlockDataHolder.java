/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scl.klighd.scg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.kgraph.impl.KGraphDataImpl;
import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.scl.basicblocks.BasicBlock;
import de.cau.cs.kieler.scl.scl.Instruction;
import de.cau.cs.kieler.scl.scl.Program;
import de.cau.cs.kieler.scl.scl.Statement;

/**
 * Class to hold basic block information.
 * The class is used in the basic block modifier post-processing trick.
 * 
 * @author ssm
 *
 */

public class BasicBlockDataHolder extends KGraphDataImpl {

    public List<BasicBlock> BasicBlockData;
    public HashMap<Instruction, Pair<KNode, KNode>> NodeData;
    public Program SCLProgram;
    
    BasicBlockDataHolder() {
        BasicBlockData = new ArrayList<BasicBlock>();
        NodeData = new HashMap<Instruction, Pair<KNode, KNode>>();
        SCLProgram = null;
    }
    
}
