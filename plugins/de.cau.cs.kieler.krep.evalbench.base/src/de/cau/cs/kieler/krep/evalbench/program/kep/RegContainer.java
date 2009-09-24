package de.cau.cs.kieler.krep.evalbench.program.kep;


public class RegContainer {

	Register target;
	Register source;
	Data data;
	KepSignal sig;
	Constants.RegisterType type;

	public RegContainer(Register target, Register source) {
		this.target = target;
		this.source = source;
		type = Constants.RegisterType.REG;
	}

	public RegContainer(Register target, String data) throws IllegalArgumentException {
		try {
			this.target = target;
			this.data = new Data(data);
			type = Constants.RegisterType.DATA;
			}
		catch (IllegalArgumentException e) {
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public RegContainer(Register target, KepSignal sig) {
		this.target = target;
		this.sig = sig;
		type = Constants.RegisterType.SIGNAL;
	}

	public String encodeData(){
			return data.encode();

	}

	public Data getData() {
		return data;
	}

	public KepSignal getSig() {
		return sig;
	}

	public Register getSource() {
		return source;
	}

	public Register getTarget() {
		return target;
	}

	public Constants.RegisterType getType() {
		return type;
	}

}
