/*
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
 */
package de.cau.cs.kieler.sim.signals;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

/**
 * The SignalASCIIPlotter plots ASCII art signals to a text file
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class SignalASCIIPlotter {

	// -------------------------------------------------------------------------

	/**
	 * Gets the space characters.
	 * 
	 * @param num
	 *            the num
	 * @return the space characters
	 */
	private String getSpaceCharacters(int num) {
		String returnText = "";
		while (returnText.length() < num) {
			returnText = " " + returnText;
		}
		return returnText;
	}

	// -------------------------------------------------------------------------

	private String[] getTickLabels(long minTick, long maxTick,
			int maxSignalNameLength) {
		int lines = (maxTick + "").length();
		String[] ascii = new String[lines];

		for (int line = 0; line < ascii.length; line++) {
			ascii[line] = getSpaceCharacters(maxSignalNameLength) + "  ";
		}

		for (long tick = minTick; tick <= maxTick; tick++) {
			String tickString = tick + "";
			tickString = getSpaceCharacters(lines - tickString.length())
					+ tickString;
			for (int line = 0; line < ascii.length; line++) {
				String tickStringPart = tickString.substring(line, line + 1);
				ascii[line] += tickStringPart + " ";
			}
		}

		return ascii;
	}

	// -------------------------------------------------------------------------

	/**
	 * Gets the ASCI signal data.
	 * 
	 * @param signal
	 *            the signal
	 * @param maxSignalNameLength
	 *            the max signal name length
	 * @return the aSCI signal data
	 */
	private String[] getASCISignalData(long minTick, long maxTick,
			Signal signal, int maxSignalNameLength) {
		String[] ascii = new String[2];

		// build label
		String signalLabel = signal.getName();
		signalLabel = getSpaceCharacters(maxSignalNameLength
				- signalLabel.length())
				+ signalLabel + " ";
		String nullLabel = getSpaceCharacters(signalLabel.length());

		ascii[0] = nullLabel;
		ascii[1] = signalLabel;

		// build data
		boolean presentBefore = false;
		for (long tick = minTick; tick <= maxTick; tick++) {
			// get the current present value
			boolean present = signal.isPresent(tick);
			// in the first tick start as if this present value was the one
			// before
			if (tick == signal.getMinTick()) {
				presentBefore = present;
			}

			// stay present
			if (presentBefore && present) {
				ascii[0] += "__";
				ascii[1] += "  ";
			} else if (!presentBefore && present) {
				ascii[0] += " _";
				ascii[1] += "| ";
			} else if (presentBefore && !present) {
				ascii[0] += "  ";
				ascii[1] += "|_";
			} else if (!presentBefore && !present) {
				ascii[0] += "  ";
				ascii[1] += "__";
			}

			presentBefore = present;
		}

		return ascii;
	}

	// -------------------------------------------------------------------------

	/**
	 * Gets the max signal name length.
	 * 
	 * @return the max signal name length
	 */
	private int getMaxSignalNameLength(SignalList signalList) {
		int maxLength = 0;
		for (Signal signal : signalList) {
			maxLength = Math.max(maxLength, signal.getName().length());
		}
		return maxLength;
	}

	// -------------------------------------------------------------------------

	/**
	 * Plot ASCII.
	 * 
	 * @param signalList
	 *            the signal list
	 * @return the string[]
	 */
	public String[] plot(SignalList signalList) {
		LinkedList<String> stringList = new LinkedList<String>();

		long minTick = signalList.getMinTick();
		long maxTick = signalList.getMaxTick();

		// plot signal data
		int maxSignalNameLength = getMaxSignalNameLength(signalList);
		String spaceLine = null;
		for (Signal signal : signalList) {
			String[] signalData = getASCISignalData(minTick, maxTick, signal,
					maxSignalNameLength);
			if (spaceLine == null) {
				spaceLine = getSpaceCharacters(signalData[0].length());
			}
			// no space line by default
			// stringList.add(spaceLine);
			stringList.add(signalData[0]);
			stringList.add(signalData[1]);
		}

		// build tick labels
		stringList.add(spaceLine);
		String[] tickLabels = getTickLabels(minTick, maxTick,
				maxSignalNameLength);

		for (int line = 0; line < tickLabels.length; line++) {
			stringList.add(tickLabels[line]);
		}

		return (String[]) stringList.toArray(new String[signalList.size()]);
	}

	// -------------------------------------------------------------------------

	/**
	 * Export to ASCII text file.
	 * 
	 * @param path
	 *            the path
	 */
	public void plotToTextFile(IPath path, SignalList signalList) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IFile file = root.getFile(path);

		try {
			if (!file.exists()) {
				file.create(null, IResource.NONE, null);
			}
			String stringPath = file.getRawLocation().toString();
			PrintWriter out = new PrintWriter(stringPath);

			// ASCII plot
			String[] ascii = plot(signalList);

			// write to file
			for (String line : ascii) {
				out.println(line);
			}

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	// -------------------------------------------------------------------------

}
