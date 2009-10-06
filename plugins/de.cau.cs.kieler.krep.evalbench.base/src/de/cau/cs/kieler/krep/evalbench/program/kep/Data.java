package de.cau.cs.kieler.krep.evalbench.program.kep;

public class Data extends Identifer {

	public Data(String val) throws IllegalArgumentException {
		int value = Integer.parseInt(val.trim());
		if (value > Constants.max_data)
			throw new IllegalArgumentException("Data value (" + value
					+ ") is greater then" + Constants.max_data);
		this.id = value;

	}

	public Data(int val) throws IllegalArgumentException {
		if (val > Constants.max_data)
			throw new IllegalArgumentException("Data value (" + val
					+ ") is greater then" + Constants.max_data);
		this.id = val;

	}

	@Override
	public String toString() {
		return String.valueOf(id);
	}

	public String encode() {
		{
			String result = "";
			if (this.id != null) {
				result = super.encode(Constants.data_width);
			}
			// else while(result.length()<Constants.data_width) result+="0";
			assert result.length() == Constants.data_width : "Opcode length for data should be "
					+ Constants.data_width + " but is " + result.length() + "!";

			return result;
		}
	}

	public String info() {
		String result = "";
		while (result.length() < Constants.data_width)
			result += "N";
		return result;
	}

	public int length() {
		return Constants.data_width;
	}
}
