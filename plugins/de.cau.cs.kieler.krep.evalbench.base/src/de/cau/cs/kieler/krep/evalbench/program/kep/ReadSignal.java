/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/
package de.cau.cs.kieler.krep.evalbench.program.kep;

import de.cau.cs.kieler.krep.evalbench.program.kep.Constants.*;

public class ReadSignal extends Identifer {

    SignalType type;
    SignalDataType datatype;
    boolean isPre = false;
    Data value;
    Register reg;

    public ReadSignal(String name, Integer id) {
        super(name, id);
        this.datatype = Constants.SignalDataType.PURE;
    }

    public ReadSignal(String name, Integer id, boolean isPre) {
        this(name, id);
        this.isPre = isPre;
        this.datatype = Constants.SignalDataType.PURE;
    }

    public ReadSignal(String name, Integer id, String value)
            throws IllegalArgumentException {
        this(name, id);
        try {
            this.value = new Data(value);
            this.datatype = Constants.SignalDataType.DATA;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public ReadSignal(String name, SignalType type, Integer id, Register reg) {
        this(name, id);
        this.reg = reg;
        this.datatype = Constants.SignalDataType.REG;
    }

    @Override
    public String toString() {
        return encode();
    }

    public String printlst() {

        return "% [" + this.toString() + "]  I/O(#" + this.id + ")  "
                + this.name;

    }

    @Override
    public String print() {
        return super.print() + "\t" + this.type.toString();
    }

    public void setType(SignalType type) {
        this.type = type;
    }

    public SignalType getType() {
        return type;
    }

    public SignalDataType getDataType() {
        return datatype;
    }

    public void setReg(Register reg) {
        this.reg = reg;
    }

    public void setValue(Data value) {
        this.value = value;
    }

    @Override
    public String encode() {
        String result = super.encode(Constants.signal_width);
        if (!this.isPre)
            result += "0";
        else
            result += "1";

        assert result.length() == Constants.signal_width + 1 : "Opcode length for signal should be "
                + Constants.signal_width
                + 1
                + " but is "
                + result.length()
                + "!";

        return result;

    }

    @Override
    public String info() {
        String result = "";
        while (result.length() < Constants.signal_width)
            result += "S";
        return result + "P";
    }

    @Override
    public int length() {
        return Constants.signal_width + 1;
    }

    public Register getReg() {
        return reg;
    }

    public Data getValue() {
        return value;
    }

}
