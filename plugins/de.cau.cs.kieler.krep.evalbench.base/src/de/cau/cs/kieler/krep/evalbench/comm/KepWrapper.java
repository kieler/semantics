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


public class KepWrapper implements IKrepWrapper {

	private EsiLogger esi;

	private final static String name = "kep";

	static {
		System.loadLibrary("kep");
	}

	private LinkedList<Byte> output = new LinkedList<Byte>();

	public KepWrapper() {
		super();
		String msg = "";
		kep_reset(msg);
		if (msg.length()>0) {
			MessageView.print(msg);
		}

		IPreferenceStore preferenceStore = Activator.getDefault()
		.getPreferenceStore();

		String fileName =preferenceStore.getString(ConnectionPreferencePage.JNI_LOG_FILE); 
		esi = new EsiLogger(fileName);
		esi.reset();
	}

	public void terminate() {
		// nothing to do
	}

	public boolean hasOutput() {
		return !output.isEmpty();
	}

	public byte getOutput() {
		byte b = output.poll();
		return ( b);
	}

	public void step() {
		String msg = "";
		String io = ";";
		byte c = kep_step(msg);
		if (msg.length() != 0) {
			MessageView.print(msg);
			msg="";
		}
		if (c!=0) {
			c = kep_recv(msg);
			if (msg.length()>0) {
				MessageView.print(msg);
			}
			io += " %OUTPUT: TX(0x" + Integer.toHexString(c & 0xFF) + ")";
			output.offer(c);
		}
		io += "\n";
		esi.write(io);
	}

	public void send(byte b) {
		String msg ="";
		step();
		esi.write("RX(0x" + Integer.toHexString(b & 0xFF) + ")");
		kep_send(b, msg);
		if (msg.length()>0) {
			MessageView.print(msg);
		}
		step();

	}

	public static native byte kep_step(String msg);

	public static native byte kep_recv(String msg);

	public static native void kep_reset(String msg);

	public static native void kep_send(byte c, String msg);

	public void saveEsi(String esiFile) {
		BufferedWriter out=null;
		try {
			File f = new File(esiFile);
			out = new BufferedWriter(new FileWriter(f));
			out.write(esi.toString());
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(out!=null){
				try {
					out.close();
				} catch (IOException e) {
					// silently ignore
				}
			}
		}

	}

	public void comment(String comment) {
		esi.comment(comment);
	}

	public String getName(){
		return name;
	}
}
