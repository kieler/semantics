package de.cau.cs.kieler.krep.evalbench.helpers;

import java.io.*;

/**
 * @author ctr
 * 
 *         Create new thread to print Input Stream to line by line to stdout.
 *         The input stream could come from another process, or an external
 *         program.
 */
public class StreamGobbler extends Thread {
    InputStream is;

    String type;

    /**
     * @param is
     *            input stream from which messages are read
     * @param type
     * this prefix is written before each line on stdout
     */
    public StreamGobbler(InputStream is, String type) {
	this.is = is;
	this.type = type;
    }

    @Override
    public void run() {
	try {
	    InputStreamReader isr = new InputStreamReader(is);
	    BufferedReader br = new BufferedReader(isr);
	    String line = null;
	    while ((line = br.readLine()) != null)
		System.out.println(type + ">" + line);
	} catch (IOException ioe) {
	    ioe.printStackTrace();
	}
    }
}