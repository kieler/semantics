/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright ${year} by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/

package de.cau.cs.kieler.krep.evalbench.comm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

import org.eclipse.jface.preference.IPreferenceStore;

import de.cau.cs.kieler.krep.evalbench.Activator;
import de.cau.cs.kieler.krep.evalbench.helpers.EsiLogger;
import de.cau.cs.kieler.krep.evalbench.ui.ConnectionPreferencePage;
import de.cau.cs.kieler.krep.evalbench.ui.views.MessageView;

public class KlpWrapper implements IKrepWrapper {

	private EsiLogger esi;

	private final static String name = "klp";

	static {
		System.loadLibrary("klp");
	}

	private LinkedList<Byte> output = new LinkedList<Byte>();

	public KlpWrapper() {
		super();
		String msg = "";
		klp_reset(msg);
		if (msg.length() > 0) {
			MessageView.print(msg);
		}

		IPreferenceStore preferenceStore = Activator.getDefault()
				.getPreferenceStore();

		String fileName = preferenceStore
				.getString(ConnectionPreferencePage.JNI_LOG_FILE);
		esi = new EsiLogger(fileName);
		esi.reset();
		step();

	}

	public void terminate() {
		// TODO Auto-generated method stub
	}

	public boolean hasOutput() {
		return !output.isEmpty();
	}

	public byte getOutput() {
		byte b = output.poll();
		return (b);
	}

	public void step() {
		String msg = "";
		String io = ";";
		byte c = klp_step(msg);
		if (msg.length() > 0) {
			MessageView.print(msg);
		}
		if (c != 0) {
			msg = "";
			c = klp_recv(msg);
			if (msg.length() > 0) {
				MessageView.print(msg);
			}
			io += " %OUTPUT: TX(0x" + Integer.toHexString(c & 0xFF) + ")";
			output.offer(c);
		}
		io += "\n";

		esi.write(io);

	}

	public void send(byte b) {
		String msg = "";
		step();
		esi.write("RX(0x" + Integer.toHexString(b & 0xFF) + ")");
		klp_send(b, msg);
		if (msg.length() > 0) {
			MessageView.print(msg);
		}
		step();

	}

	public static native byte klp_step(String msg);

	public static native byte klp_recv(String msg);

	public static native void klp_reset(String msg);

	public static native void klp_send(byte c, String msg);

	public void saveEsi(String esiFile) {
		BufferedWriter out = null;
		try {
			File f = new File(esiFile);
			out = new BufferedWriter(new FileWriter(f));
			out.write(esi.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// silently ignore
				}
			}
		}

	}

	public String getName() {
		return name;
	}

	public void comment(String comment) {
		esi.comment(comment);
	}

}