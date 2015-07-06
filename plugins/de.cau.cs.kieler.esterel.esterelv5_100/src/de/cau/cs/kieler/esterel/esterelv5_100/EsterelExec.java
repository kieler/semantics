package de.cau.cs.kieler.esterel.esterelv5_100;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.plaf.SliderUI;

public final class EsterelExec {

	private EsterelExec() {

	}

	public static InputStream execComp(final String cmd,
			final InputStream input) throws IOException {
		Process p;
		p = Runtime.getRuntime().exec(cmd);

		ByteArrayOutputStream output = new ByteArrayOutputStream();

		OutputStream stdin = p.getOutputStream();

		while (input.available() > 0) {
			int r = input.read();
			stdin.write(r);
		}
		stdin.close();
		
//		File c;
//		try {
//			c = new File(new URI("file:/home/sna/sscc_out.c"));
//			while (!c.exists()) {}
//			FileReader file = new FileReader(c);
//			int t;	
//			BufferedReader br = new BufferedReader(file);
//			while ((t = br.read()) != (-1)) {
//				output.write(t);
//			}
//			//c.delete();
//		} catch (URISyntaxException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println(output.toString());
		File c = new File("sscc_out.c");
		while(!c.exists()) {}		
		FileInputStream code = new FileInputStream("sscc_out.c");
		c.delete();
				
		return code;
	}

	public static InputStream exec(final String cmd, final InputStream input,
			final int inittime, final int timeout, final int steptime)
			throws IOException {
		Process p;
		p = Runtime.getRuntime().exec(cmd);

		ByteArrayOutputStream output = new ByteArrayOutputStream();

		InputStream stdout = p.getInputStream();
		InputStream stderr = p.getErrorStream();
		OutputStream stdin = p.getOutputStream();

		while (input.available() > 0) {
			int r = input.read();
			stdin.write(r);
		}

		stdin.close();
		// wait for initial output
		long time = System.currentTimeMillis();
		// while (stdout.available() == 0 && stderr.available() == 0) {
		// if (System.currentTimeMillis() - time > inittime) {
		// throw new IOException("Timeout executing " + cmd);
		// }
		// try {
		// Thread.sleep(steptime);
		// } catch (InterruptedException e) {
		// // silently ignore
		// }
		// }
		// get output
		time = System.currentTimeMillis();
		while (System.currentTimeMillis() - time < timeout) {
			if (stdout.available() > 0) {
				do {
					int t = stdout.read();
					// System.out.print(Character.toChars(t));
					output.write(t);
				} while (stdout.available() > 0);
				time = System.currentTimeMillis();
			} else {
				try {
					Thread.sleep(steptime);
				} catch (InterruptedException e) {
					// silently ignore
				}
			}
		}
		try {
			StringBuffer err = new StringBuffer();
			while (stderr.available() > 0) {
				err.append(Character.toChars(stderr.read()));
			}
			stdin.close();
			stdout.close();
			stderr.close();
			// give process some time to terminate

			try {
				Thread.sleep(steptime);
			} catch (InterruptedException e) {
				// silently ignore
			}

			if (p.exitValue() != 0 && err.length() > 0) {
				throw new IOException("Parse Error: " + err.toString(), null);
			}
		} finally {
			p.destroy();
		}

		if (p.exitValue() != 0) {
			throw new IOException("error executing " + cmd, null);
		}
		return new ByteArrayInputStream(output.toByteArray());
	}

}
