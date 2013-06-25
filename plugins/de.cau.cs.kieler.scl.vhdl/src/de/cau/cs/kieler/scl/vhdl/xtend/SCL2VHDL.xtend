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
 package de.cau.cs.kieler.scl.vhdl.xtend

import de.cau.cs.kieler.scl.scl.Program
import de.cau.cs.kieler.scl.scl.StatementSequence
import de.cau.cs.kieler.scl.scl.Thread
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.EmptyStatement
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Parallel
import de.cau.cs.kieler.scl.scl.Instruction
import de.cau.cs.kieler.scl.scl.Assignment

/**
 * Transformation of SCL code into VHDL code.
 * 
 * @author gjo
 */
class SCL2VHDL { 
    
    // General method to create the c simulation interface.
	def transform (Program program) {
       '''
	   «/* Generate the header */»
       «header(program)»

	   «/* Generate the tick function */»
	   «abo()»
       '''
   } 	

   // -------------------------------------------------------------------------   
   
   // Generate the header.
   def header(Program program) {
   	'''
	--/*****************************************************************************/
	--/*               G E N E R A T E D     V H D L    C O D E                    */
	--/*****************************************************************************/
	--/* KIELER - Kiel Integrated Environment for Layout Eclipse RichClient        */
	--/*                                                                           */
	--/* http://www.informatik.uni-kiel.de/rtsys/kieler/                           */
	--/* Copyright 2013 by                                                         */
	--/* + Christian-Albrechts-University of Kiel                                  */
	--/*   + Department of Computer Science                                        */
	--/*     + Real-Time and Embedded Systems Group                                */
	--/*                                                                           */
	--/* This code is provided under the terms of the Eclipse Public License (EPL).*/
	--/*****************************************************************************/
	''' 
   }
   
   // -------------------------------------------------------------------------
   
   // Generate the  tick function.
   def tickFunction(Program program) {
       val statementSequence = program as StatementSequence;
       val statements = statementSequence.statements;
   	'''    int tick(){
       «FOR statement : statements»
       «statement.expand»
       «ENDFOR»
	   TICKEND;
    }
	'''
   }
   
   // -------------------------------------------------------------------------   
   // -------------------------------------------------------------------------
   
   // Expand an empty statement
   def dispatch expand(EmptyStatement statement) {
   		'''noop'''
   }

   // Expand an instruction statement
   def dispatch expand(InstructionStatement statement) {
        '''«statement.instruction.expand»'''
   }
   
   // Expand a PAUSE instruction.
   def dispatch expand(Pause pauseInstruction) {
   	'''PAUSE;'''
   }   

   // Expand all other instructions.
   def dispatch expand(Instruction elseInstruction) {
    '''OTHERINSTRUCTION;'''
   }   
   
   // -------------------------------------------------------------------------   
   
   
   def abo(){
   	val String temp = "

----------------------------------------------------------------------------------
-- Company:    Uni Kiel - RTsys
-- Engineer:   Gunnar Johannsen
-- 
-- Create Date:    15:59:45 05/06/2013 
-- Design Name: 
-- Module Name:    abo_localMux - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description:   2nd Abo example with local multiplexers.
--
--                This inner component only contains logic and control flow(pause reg).
--
--                The initial tick generation and the register for pre values are 
--                copied to ther outer component.
--                This is only logic (no process), only a process is needed for 
--                pause register.
--
--                Little additional change: type changed from std_logic to boolean.
--
-- Dependencies: 
--
-- Revision: 
-- Revision 0.01 - File Created
-- Additional Comments: 
--
----------------------------------------------------------------------------------
library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx primitives in this code.
--library UNISIM;
--use UNISIM.VComponents.all;

entity abo is
    Port ( A : in  boolean;
           B : in  boolean;
           O1_out : out  boolean;
           O2_out : out  boolean;
           A_out : out  boolean;
           B_out : out  boolean;
           
           preO1 : in  boolean;
           preO2 : in boolean;
           
           -- Control           
			  reset: in STD_LOGIC;
           tick : in std_logic;
           entry : in boolean);
end abo;

architecture Behavioral of abo is

-- Signal declaration
-- ****************************************************************************
--  // Activation flags for basic blocks
--  //
--  // On Naming:
--  // The flags are not just numbered through, but have names that
--  // should give an idea what node/basic block they correspond to.
--  // \"entry\" and \"exit\" are the basic blocks corresponding to the
--  // top-level entry and exit nodes.
--  //
--  // If there is no obvious name for a basic block, use just
--  // _go<counter>_<thread path>, as done for _go0_HandleA.
--  //
--  // Note that these might be computed even more efficiently using a
--  // Program Dependence Graph (PDG), which could expose further parallelism.
--  // However, we for now make do with a simpler, locally computed scheme.
--  bool _entry, _go0_HandleA, _surf_HandleA_WaitA, _exit_HandleA, _surf_HandleB_WaitB, _exit_HandleB, _exit;

   signal u_go0_HandleA : boolean := false;
   signal u_surf_HandleA_WaitA : boolean := false;
   signal u_exit_HandleA : boolean := false;
   signal u_surf_HandleB_WaitB : boolean := false;
   signal u_exit_HandleB : boolean := false;
   signal u_exit : boolean := false;

--  // Registered activation flags, for basic blocks that end in pause statements
--  // \"true\" indicates an active pause statement; initially pause statements are inactive
--  static bool _depth_HandleA_WaitA = false, _depth_HandleB_WaitB = false;

   signal u_depth_HandleA_WaitA : boolean := false;
   signal u_depth_HandleB_WaitB : boolean := false;

--  // Flags indicating that a region is empty (inactive),
--  // ie, neither just started nor any active pause
--  bool _empty_HandleA, _empty_HandleB;
  
   signal u_empty_HandleA : boolean := false;
   signal u_empty_HandleB : boolean := false;

--  // Values; multiple instances of O1, O2, and (input) B
--  // On Naming:
--  // Use suffix derived from activation flags of the enclosing basic block.
--  // If there are multiple assignments to the same variable within on basic block, 
--  // use increasing counter, starting at 0, for the assignments - except for the last
--  // assignment, as that is the one visible outside of the basic block.
--  // The assignments with a counter suffix are only visible within the basic block.
--  // Eg, assume we are in basic block \"entry\":
--  //   X = 0; Y = X; X = 1
--  // becomes
--  //   X_entry0 = 0; Y_entry = X_entry0; X_entry = 1
--  bool O1_entry, O1_exit_HandleA, O1_exit_HandleB, O1_exit, O2_entry, O2_exit, B_exit_HandleA;
  
   signal O1_entry : boolean := false;
   signal O1_exit_HandleA : boolean := false;
   signal O1_exit_HandleB : boolean := false;
   signal O1_exit : boolean := false;
   signal O2_entry : boolean := false;
   signal O2_exit : boolean := false;
   signal B_exit_HandleA : boolean := false;

--  // Registered values of non-input variables
--  // For SW, one would not need to make these explicit, one might instead just use O1 and O2
--  // Note: O1 and O2 are declared globally, to make them visible outside of tick function
--  static bool _preO1 = UNDEFINED, _preO2 = UNDEFINED;

--   signal u_preO1 : std_logic := '0';
--   signal u_preO2 : std_logic := '0';
   
--   signal u_notInitial : std_logic := '0';
--   signal u_notInitialDetect : std_logic:= '1';

--   signal O1_int : std_logic ;
--   signal O2_int : std_logic ;

  -- ****************************************************************************

begin
   
   --  //tickstart(2);
   --  _signals2vars       -- this is not needed in HW

--  // RESET() initializes _notInitial = 0;
   
-- u_entry <= not u_notInitial;   --// _entry indicates initial tick

--  //if (!_notInitial)
--  //  _notInitial = _notInitialDetect;
--  //Replaced with code that avoids jump:
--  u_notInitial <= u_notInitial or u_notInitialDetect;

--  // O1 = false;

--  // Observations:
--  // 1) The above assignment is only effective when _entry holds
--  // 2) If the assignment is effective, it overrides _preO1
--  // Thus, we perform a \"sequential merge\" below.
--  // This is somewhat similar to a phi node, except that the merged assignments
--  // do not have to come from separate control paths.
--  O1_entry = _mergeFalse(_entry, _preO1);
   O1_entry <= ((not entry) and preO1);

--  // O2 = false;
--  O2_entry = _mergeFalse(_entry, _preO2);
   O2_entry <= ((not entry) and preO2);

--  //fork1(HandleB, 1) {
--  //HandleA:

--  // Merge paths before reaching conditional
--  //_go0_HandleA = _entry || _depth_HandleA_WaitA;
  u_go0_HandleA <= entry or u_depth_HandleA_WaitA;

--  //  if (!A) {

--  //  pause;  // WaitA
--  // Replace this pause with a register \"_surf_HandleA_WaitA\" that indicates an active pause
  u_surf_HandleA_WaitA <= (u_go0_HandleA and  (not A));  --// _depth_HandleA_WaitA is registered value

--  //  goto HandleA;
--  //}

  u_exit_HandleA <= u_go0_HandleA and A;

--  // The input B constitutes a \"0th\" copy of B that is always present
--  // Therefore, must create copy for following write to B
--  // B = true;
--  // Possible optimization for SW: replace assignment to B_exit_HandleA by assignment
--  // to just B, as it is the final value of B
--  B_exit_HandleA = _mergeTrue(_exit_HandleA, B);
   B_exit_HandleA <= (u_exit_HandleA or B);

--  // O1 = true;
--  O1_exit_HandleA = _mergeTrue(_exit_HandleA, O1_entry);
   O1_exit_HandleA <= (u_exit_HandleA or O1_entry);

--  // Compute \"output pins\" of thread HandleA
--  // This is analogous to the LEM/REM pins [1, Fig. 11.1]
  u_empty_HandleA <= not(entry or u_surf_HandleA_WaitA);   --// Dead thread - neither just started nor any active register

--  //} par {
--  //  HandleB:
--  //  pause;

--  // Observation, regarding the read of B:
--  // Possible writes to B are the input (called just \"B\") and B_exit_HandleA.
--  // As B_exit_HandleA is a \"sequential successor\" of B, the \"merge\" of these two is
--  // already computed in B_exit_HandleA
  u_surf_HandleB_WaitB <= entry or (u_depth_HandleB_WaitB and not (B_exit_HandleA)); -- // Set register _surf_HandleB_WaitB

--  //  if (!B) {
--  //    goto HandleB;
--  //  }
  u_exit_HandleB <= u_depth_HandleB_WaitB and B_exit_HandleA;

--  //  O1 = true;

--  // Observation:
--  // The assignments to O1 that correspond to O1_exit_HandleA and O1_exit_HandleB
--  // are concurrent, i.e., not sequential, but confluent.
--  // Thus we (arbitrarily) merge them by first computing O1_exit_HandleA, and then
--  // possibly overwriting this with \"true\" in the assignment to
--  // O1_exit_HandleB.
--  // We could also have reversed this order.
--  O1_exit_HandleB = _mergeTrue(_exit_HandleB, O1_exit_HandleA);
   O1_exit_HandleB <= u_exit_HandleB or O1_exit_HandleA;

--  // Compute \"output pins\" of thread HandleB
  u_empty_HandleB <= not(entry or u_surf_HandleB_WaitB);

--  //} join1(2);
--  // This corresponds to output K0 of Sychronizer circuit [1, Fig. 11.10]
--  // If this were not the basic block corresponding to the top-level exit node,
--  // we would have called this \"_join_WaitAB\"
  u_exit <= (u_exit_HandleA or u_exit_HandleB) -- // At least one thread must have just terminated
    and (u_exit_HandleA or u_empty_HandleA)   -- // HandleA has terminated or was already dead
    and (u_exit_HandleB or u_empty_HandleB);  -- // HandleB has terminated or was already dead

--  // O1 = false;
--  // O1_exit is sequentially after O1_exit_HandleA and O1_exit_HandleB.
--  // As stated above, O1_exit_HandleA and O1_exit_HandleB are concurrent, but are merged in
--  // O1_exit_HandleB. Thus we here merge with O1_exit_HandleB.
--  O1_exit = _mergeFalse(_exit, O1_exit_HandleB);
   O1_exit <= ((not u_exit) and O1_exit_HandleB);

--  //O2 = true;
--  O2_exit = _mergeTrue(_exit, O2_entry);
   O2_exit <= u_exit or O2_entry;

--  // Compute output values.
--  // This is where the nature of sequentiality becomes apparent:
--  // we always use the \"last\" write to a variable.
--  // For HW synthesis, would have to replace these by A_out, B_out, O1_out, O2_out
--  //A = A;       // Input A is not overwritten

   B_out <= B_exit_HandleA;
   O1_out <= O1_exit;
   O2_out <= O2_exit;
   A_out <= A;
   
   --Pause registers
   reg: process
      begin
         wait until rising_edge(tick);
			if '0' = reset then
				u_depth_HandleA_WaitA <= u_surf_HandleA_WaitA;
				u_depth_HandleB_WaitB <= u_surf_HandleB_WaitB;
			else 
				u_depth_HandleA_WaitA <= false;
				u_depth_HandleB_WaitB <= false;
			end if;
   end process;

end Behavioral;
"
	return temp
   }
   
}
