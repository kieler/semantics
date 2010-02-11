/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.interfacedeclparser.bridge;

import org.eclipse.emf.ecore.util.EcoreUtil.Copier;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.Variable;
import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.InOutputSignals;
import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.InputSignals;
import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.InterfaceDeclFactory;
import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.OutputSignals;
import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.RegionSignalDec;
import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.Signals;
import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.StateExtend;

/**
 * Provide functionality for handling modifications of signals or variables. As
 * well as swapping input/output/inputoutput signals within their specific
 * "buckets".
 * 
 * @author uru
 * @author car
 * 
 */
public class InterfaceDeclSerializerLogic {

    /**
     * empty constructor serialization.
     */
    public InterfaceDeclSerializerLogic() {
    }

    // #########################
    // # StateSignal Handlers
    // #########################

    /**
     * 
     * @param se
     * @param signalName
     */
    protected void handleSignalModify(final StateExtend se, final Signal changedSignal,
            final String signalName) {
        if (changedSignal.isIsInput() && changedSignal.isIsOutput()) {
            for (InOutputSignals ios : se.getInOutputSignals()) {
                for (Signal s : ios.getSignals()) {
                    if (s.getName().equals(signalName)) {
                        modifySignal(s, changedSignal);
                        break;
                    }
                }
            }
        } else if (changedSignal.isIsInput()) {
            for (InputSignals is : se.getInputSignals()) {
                for (Signal s : is.getSignals()) {
                    if (s.getName().equals(signalName)) {
                        modifySignal(s, changedSignal);
                        break;
                    }
                }
            }
        } else if (changedSignal.isIsOutput()) {
            for (OutputSignals os : se.getOutputSignals()) {
                for (Signal s : os.getSignals()) {
                    if (s.getName().equals(signalName)) {
                        modifySignal(s, changedSignal);
                        break;
                    }
                }
            }
        } else {
            for (Signals sigs : se.getSignals()) {
                for (Signal s : sigs.getSignals()) {
                    if (s.getName().equals(signalName)) {
                        modifySignal(s, changedSignal);
                        break;
                    }
                }
            }
        }
    }

    /**
     * 
     * @param se
     */
    protected void handleNewSignal(final StateExtend se, final Signal sig) {
        // create new signal at bottom
        // create a copy to make sure the signal isn't "stolen" from the
        // model
        Copier cop = new Copier();
        Signal newSig = (Signal) cop.copy(sig);
        if (sig.isIsInput() && sig.isIsOutput()) {
            InOutputSignals ios = InterfaceDeclFactory.eINSTANCE.createInOutputSignals();
            newSig.setIsInput(true);
            newSig.setIsOutput(true);
            ios.getSignals().add(newSig);
            se.getInOutputSignals().add(ios);
        } else if (sig.isIsInput()) {
            InputSignals is = InterfaceDeclFactory.eINSTANCE.createInputSignals();
            newSig.setIsInput(false);
            is.getSignals().add(newSig);
            se.getInputSignals().add(is);
        } else if (sig.isIsOutput()) {
            OutputSignals os = InterfaceDeclFactory.eINSTANCE.createOutputSignals();
            newSig.setIsOutput(false);
            os.getSignals().add(newSig);
            se.getOutputSignals().add(os);
        } else {
            Signals sigs = InterfaceDeclFactory.eINSTANCE.createSignals();
            sigs.getSignals().add(newSig);
            se.getSignals().add(sigs);
        }
    }

    /**
     * 
     * @param se
     * @param signalName
     * @return true if resource has to be set to null
     */
    protected boolean handleDeleteSignal(final StateExtend se, final Signal changedSignal,
            final String signalName) {
        if (changedSignal.isIsInput() && changedSignal.isIsOutput()) {
            InOutputSignals mark = null;
            for (InOutputSignals ios : se.getInOutputSignals()) {
                for (Signal s : ios.getSignals()) {
                    if (s.getName().equals(signalName)) {
                        modifySignal(s, changedSignal);
                        mark = ios;
                        break;
                    }
                }
            }
            if (mark != null && mark.getSignals().size() == 0) {
                se.getInOutputSignals().remove(mark);
            }
        } else if (changedSignal.isIsInput()) {
            InputSignals mark = null;
            for (InputSignals is : se.getInputSignals()) {
                for (Signal s : is.getSignals()) {
                    if (s.getName().equals(signalName)) {
                        modifySignal(s, changedSignal);
                        mark = is;
                        break;
                    }
                }
            }
            if (mark != null && mark.getSignals().size() == 0) {
                se.getInputSignals().remove(mark);
            }
        } else if (changedSignal.isIsOutput()) {
            OutputSignals mark = null;
            for (OutputSignals os : se.getOutputSignals()) {
                for (Signal s : os.getSignals()) {
                    if (s.getName().equals(signalName)) {
                        os.getSignals().remove(s);
                        mark = os;
                        break;
                    }
                }
            }
            if (mark != null && mark.getSignals().size() == 0) {
                se.getOutputSignals().remove(mark);
            }
        } else {
            Signals mark = null;
            for (Signals sigs : se.getSignals()) {
                for (Signal s : sigs.getSignals()) {
                    if (s.getName().equals(signalName)) {
                        sigs.getSignals().remove(s);
                        mark = sigs;
                        break;
                    }
                }
            }
            if (mark != null && mark.getSignals().size() == 0) {
                se.getSignals().remove(mark);
            }
        }

        // check if everything was deleted
        return checkIfCompletelyEmpty(se);
    }

    /**
     * 
     * @param se
     * @param signalName
     */
    protected void handleInputChange(final StateExtend se, final Signal changedSignal,
            final String signalName) {
        if (changedSignal.isIsInput() && changedSignal.isIsOutput()) {
            // signal was an output and became an input output
            OutputSignals mark = null;
            for (OutputSignals os : se.getOutputSignals()) {
                for (Signal s : os.getSignals()) {
                    if (s.getName().equals(signalName)) {
                        os.getSignals().remove(s);
                        moveToInOutputs(se, s);
                        mark = os;
                        break;
                    }
                }
            }
            if (mark != null && mark.getSignals().size() == 0) {
                se.getOutputSignals().remove(mark);
            }
        } else if (changedSignal.isIsInput()) {
            // if it became input, search the usual signals
            Signals mark = null;
            for (Signals sigs : se.getSignals()) {
                for (Signal s : sigs.getSignals()) {
                    if (s.getName().equals(signalName)) {
                        if (changedSignal.isIsInput()) {
                            sigs.getSignals().remove(s);
                            moveToInputs(se, s);
                            mark = sigs;
                        }
                        break;
                    }
                }
            }
            if (mark != null && mark.getSignals().size() == 0) {
                se.getSignals().remove(mark);
            }
        } else if (changedSignal.isIsOutput()) {
            // it was an input output and became usual output
            InOutputSignals mark = null;
            for (InOutputSignals ios : se.getInOutputSignals()) {
                for (Signal s : ios.getSignals()) {
                    if (s.getName().equals(signalName)) {
                        ios.getSignals().remove(s);
                        moveToOutputs(se, s);
                        mark = ios;
                        break;
                    }
                }
            }
            if (mark != null && mark.getSignals().size() == 0) {
                se.getInOutputSignals().remove(mark);
            }
        } else {
            // it became a usual signal
            InputSignals mark = null;
            for (InputSignals is : se.getInputSignals()) {
                for (Signal s : is.getSignals()) {
                    if (s.getName().equals(signalName)) {
                        is.getSignals().remove(s);
                        moveToNormal(se, s);
                        mark = is;
                        break;
                    }
                }
            }
            if (mark != null && mark.getSignals().size() == 0) {
                se.getInputSignals().remove(mark);
            }
        }
    }

    /**
     * 
     * @param se
     * @param signalName
     */
    protected void handleOutputChange(final StateExtend se, final Signal changedSignal,
            final String signalName) {
        if (changedSignal.isIsInput() && changedSignal.isIsOutput()) {
            // signal was usual input and became input output
            InputSignals mark = null;
            for (InputSignals is : se.getInputSignals()) {
                for (Signal s : is.getSignals()) {
                    if (s.getName().equals(signalName)) {
                        is.getSignals().remove(s);
                        moveToInOutputs(se, s);
                        mark = is;
                        break;
                    }
                }
            }
            if (mark != null && mark.getSignals().size() == 0) {
                se.getInputSignals().remove(mark);
            }
        } else if (changedSignal.isIsOutput()) {
            // if it became input, search the usual signals
            Signals mark = null;
            for (Signals sigs : se.getSignals()) {
                for (Signal s : sigs.getSignals()) {
                    if (s.getName().equals(signalName)) {
                        if (changedSignal.isIsOutput()) {
                            sigs.getSignals().remove(s);
                            moveToOutputs(se, s);
                            mark = sigs;
                        }
                        break;
                    }
                }
            }
            if (mark != null && mark.getSignals().size() == 0) {
                se.getSignals().remove(mark);
            }
        } else if (changedSignal.isIsInput()) {
            // signal was input output and became usual input
            InOutputSignals mark = null;
            for (InOutputSignals ios : se.getInOutputSignals()) {
                for (Signal s : ios.getSignals()) {
                    if (s.getName().equals(signalName)) {
                        ios.getSignals().remove(s);
                        moveToInputs(se, s);
                        mark = ios;
                        break;
                    }
                }
            }
            if (mark != null && mark.getSignals().size() == 0) {
                se.getInOutputSignals().remove(mark);
            }
        } else {
            // it became a usual signal
            OutputSignals mark = null;
            for (OutputSignals os : se.getOutputSignals()) {
                for (Signal s : os.getSignals()) {
                    if (s.getName().equals(signalName)) {
                        os.getSignals().remove(s);
                        moveToNormal(se, s);
                        mark = os;
                        break;
                    }
                }
            }
            if (mark != null && mark.getSignals().size() == 0) {
                se.getOutputSignals().remove(mark);
            }
        }
    }

    // ##################
    // # Region Handlers
    // ##################

    /**
     * 
     * @param se
     * @param regionId
     * @param signalName
     */
    protected boolean handleRegionDeleteSignal(final StateExtend se, final String regionId,
            final String signalName) {
        RegionSignalDec mark = null;
        for (RegionSignalDec r : se.getRegions()) {
            if (r.getRegion().getId().equals(regionId)) {
                for (Signal s : r.getSignals()) {
                    if (s.getName().equals(signalName)) {
                        r.getSignals().remove(s);
                        mark = r;
                        break;
                    }
                }
            }
        }
        if (mark != null && mark.getSignals().size() == 0 && mark.getVars().size() == 0) {
            se.getRegions().remove(mark);
        }

        // check if everything was deleted
        return checkIfCompletelyEmpty(se);
    }

    /**
     * 
     * @param se
     * @param regionId
     * @param varName
     */
    protected boolean handleRegionDeleteVariable(final StateExtend se, final String regionId,
            final String varName) {
        RegionSignalDec mark = null;
        for (RegionSignalDec r : se.getRegions()) {
            if (r.getRegion().getId().equals(regionId)) {
                for (Variable v : r.getVars()) {
                    if (v.getName().equals(varName)) {
                        r.getSignals().remove(v);
                        mark = r;
                        break;
                    }
                }
            }
        }
        if (mark != null && mark.getSignals().size() == 0 && mark.getVars().size() == 0) {
            se.getRegions().remove(mark);
        }

        // check if everything was deleted
        return checkIfCompletelyEmpty(se);
    }

    /**
     * 
     * @param se
     * @param reg
     * @param sig
     */
    protected void handleRegionNewSignal(final StateExtend se, final Region reg, final Signal sig) {
        Copier cop = new Copier();
        Signal newSig = (Signal) cop.copy(sig);
        RegionSignalDec rsd = null;
        // check whether region is already known
        for (RegionSignalDec rs : se.getRegions()) {
            if (rs.getRegion().getId().equals(reg.getId())) {
                rsd = rs;
                break;
            }
        }
        if (rsd == null) {
            rsd = InterfaceDeclFactory.eINSTANCE.createRegionSignalDec();
        }
        rsd.setRegion(reg);
        rsd.getSignals().add(newSig);
        se.getRegions().add(rsd);
    }

    /**
     * 
     * @param se
     * @param reg
     * @param var
     */
    protected void handleRegionNewVariable(final StateExtend se, final Region reg,
            final Variable var) {
        Copier cop = new Copier();
        Variable newVar = (Variable) cop.copy(var);
        RegionSignalDec rsd = null;
        // check whether region is already known
        for (RegionSignalDec rs : se.getRegions()) {
            if (rs.getRegion().getId().equals(reg.getId())) {
                rsd = rs;
                break;
            }
        }
        if (rsd == null) {
            rsd = InterfaceDeclFactory.eINSTANCE.createRegionSignalDec();
        }
        rsd.setRegion(reg);
        rsd.getVars().add(newVar);
        se.getRegions().add(rsd);
    }

    /**
     * 
     * @param se
     * @param reg
     * @param changedSig
     * @param sigName
     */
    protected void handleRegionSignalModify(final StateExtend se, final String regId,
            final Signal changedSig, final String sigName) {
        for (RegionSignalDec rsd : se.getRegions()) {
            if (rsd.getRegion().getId().equals(regId)) {
                for (Signal s : rsd.getSignals()) {
                    if (s.getName().equals(sigName)) {
                        modifySignal(s, changedSig);
                        break;
                    }
                }
            }
        }
    }

    /**
     * 
     * @param se
     * @param reg
     * @param changedVar
     * @param varName
     */
    protected void handleRegionVariableModify(final StateExtend se, final String regId,
            final Variable changedVar, final String varName) {
        for (RegionSignalDec rsd : se.getRegions()) {
            if (rsd.getRegion().getId().equals(regId)) {
                for (Variable v : rsd.getVars()) {
                    if (v.getName().equals(varName)) {
                        modifyVariable(v, changedVar);
                        break;
                    }
                }
            }
        }
    }

    // ##################
    // # Moving Signals
    // ##################
    /**
     * update all information of a signal.
     * 
     * @param old
     *            signal being updated
     * @param newS
     *            signal containing new information
     */
    private void modifySignal(final Signal old, final Signal newS) {
        old.setName(newS.getName());
        old.setInitialValue((newS.getInitialValue() == "") ? null : newS.getInitialValue());
        old.setCombineOperator(newS.getCombineOperator());
        old.setType(newS.getType());
        old.setHostCombineOperator(newS.getHostCombineOperator());
        old.setHostType(newS.getHostType());
        old.setValue(newS.getValue());
    }

    /**
     * move an blank signal to input signals.
     * 
     * @param se
     *            parsing container
     * @param s
     *            signal being moved
     */
    private void moveToInputs(final StateExtend se, final Signal s) {
        InputSignals is = InterfaceDeclFactory.eINSTANCE.createInputSignals();
        is.getSignals().add(s);
        se.getInputSignals().add(is);
    }

    /**
     * move an blank signal to output signals.
     * 
     * @param se
     *            parsing container
     * @param s
     *            signal being moved
     */
    private void moveToOutputs(final StateExtend se, final Signal s) {
        OutputSignals os = InterfaceDeclFactory.eINSTANCE.createOutputSignals();
        os.getSignals().add(s);
        se.getOutputSignals().add(os);
    }

    /**
     * move an blank signal to output signals.
     * 
     * @param se
     *            parsing container
     * @param s
     *            signal being moved
     */
    private void moveToInOutputs(final StateExtend se, final Signal s) {
        InOutputSignals io = InterfaceDeclFactory.eINSTANCE.createInOutputSignals();
        io.getSignals().add(s);
        se.getInOutputSignals().add(io);
    }

    /**
     * move an input or output signal to usual signals.
     * 
     * @param se
     *            parsing container
     * @param s
     *            signal being moved
     */
    private void moveToNormal(final StateExtend se, final Signal s) {
        Signals sigs = InterfaceDeclFactory.eINSTANCE.createSignals();
        sigs.getSignals().add(s);
        se.getSignals().add(sigs);
    }

    // ##################
    // # Modify Variable
    // ##################

    /**
     * @param old
     * @param newVar
     */
    private void modifyVariable(final Variable old, final Variable newVar) {
        old.setHostType(newVar.getHostType());
        old.setInitialValue(newVar.getInitialValue());
        old.setName(newVar.getName());
        old.setType(newVar.getType());
        old.setValue(newVar.getValue());
    }

    // ##################
    // # Misc
    // ##################

    /**
     * check if everything was deleted
     * 
     * @param se
     */
    private boolean checkIfCompletelyEmpty(final StateExtend se) {
        if (se.getInOutputSignals().size() == 0 && se.getInputSignals().size() == 0
                && se.getOutputSignals().size() == 0 && se.getSignals().size() == 0
                && se.getRegions().size() == 0) {
            return true;
        }
        return false;
    }

}
