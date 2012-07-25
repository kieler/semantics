/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.signals;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

/**
 * The SignalASCIITimeLinePlotter plots ASCII art signals to a text file.
 * 
 * @author cmot
 */
public class SignalASCIIPlotter {

    // -------------------------------------------------------------------------

    /**
     * Creates the spaced label with a blank fill character. The text is surrounded by the fill
     * character, filled up to the defined length and aligned left, centered or right.
     * 
     * @param text
     *            the text
     * @param length
     *            the length
     * @param align
     *            the style, 0 centered, -1 left, 1 right
     * @return the resulting label
     */
    protected StringBuffer createSpacedLabel(final StringBuffer text, final int length,
            final int align) {
        return createSpacedLabel(text, length, align, ' ');
    }

    // -------------------------------------------------------------------------

    /**
     * Creates the spaced label. The text is surrounded by the fill character, filled up to the
     * defined length and aligned left, centered or right.
     * 
     * @param text
     *            the text
     * @param length
     *            the length
     * @param align
     *            the style, 0 centered, -1 left, 1 right
     * @param fillChar
     *            the fill char
     * @return the resulting label
     */
    protected StringBuffer createSpacedLabel(final StringBuffer text, final int length,
            final int align, final char fillChar) {

        StringBuffer spaceL = new StringBuffer();
        StringBuffer spaceR = new StringBuffer();
        if (align == -1) {
            // left
            spaceR = getSpaceCharacters(length - text.length(), fillChar);
        } else if (align == 1) {
            // right
            spaceL = getSpaceCharacters(length - text.length(), fillChar);
        } else {
            // centered
            spaceR = getSpaceCharacters((length - text.length()) / 2, fillChar);
            spaceL = getSpaceCharacters(length - text.length() - spaceR.length(), fillChar);
        }
        return (spaceL.append(text.append(spaceR)));
    }

    // -------------------------------------------------------------------------

    /**
     * Gets num space characters as a StringBuffer with a blank fill character by default.
     * 
     * @param num
     *            the num
     * @return the space characters
     */
    protected StringBuffer getSpaceCharacters(final int num) {
        return getSpaceCharacters(num, ' ');
    }

    // -------------------------------------------------------------------------

    /**
     * Gets num space characters as a StringBuffer with a defined fill character.
     * 
     * @param num
     *            the num
     * @param fillChar
     *            the fill char
     * @return the space characters
     */
    protected StringBuffer getSpaceCharacters(final int num, final char fillChar) {
        StringBuffer returnText = new StringBuffer();
        while (returnText.length() < num) {
            returnText = returnText.insert(0, fillChar);
        }
        return returnText;
    }

    // -------------------------------------------------------------------------

    /**
     * Generate tick label for a given tick. Maximal and minimal ticks must be given in order to
     * calculate the maximal digits used for representation.
     * 
     * @param minTick
     *            the min tick
     * @param maxTick
     *            the max tick
     * @param maxSignalNameLength
     *            the max signal name length
     * @return the resulting tick label
     */
    protected String[] getTickLabels(final long minTick, final long maxTick,
            final int maxSignalNameLength) {
        int lines = (maxTick + "").length();
        String[] ascii = new String[lines];

        for (int line = 0; line < ascii.length; line++) {
            ascii[line] = getSpaceCharacters(maxSignalNameLength) + "  ";
        }

        for (long tick = minTick; tick <= maxTick; tick++) {
            StringBuffer tickStringBuffer = new StringBuffer(tick + "");
            tickStringBuffer = getSpaceCharacters(lines - tickStringBuffer.length()).append(
                    tickStringBuffer);
            for (int line = 0; line < ascii.length; line++) {
                StringBuffer tickStringPart = new StringBuffer(tickStringBuffer.toString()
                        .substring(line, line + 1));
                ascii[line] += tickStringPart + " ";
            }
        }

        return ascii;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the ASCII art signal data. "_" for absent signals, "-" for present signals.
     * 
     * @param minTick
     *            the min tick
     * @param maxTick
     *            the max tick
     * @param signal
     *            the signal
     * @param maxSignalNameLength
     *            the max signal name length
     * @return the generated ASCII art
     */
    protected String[] getASCIISignalData(final long minTick, final long maxTick,
            final Signal signal, final int maxSignalNameLength) {
        String[] ascii = new String[2];

        // build label
        StringBuffer signalLabel = new StringBuffer(signal.getName());
        signalLabel = getSpaceCharacters(maxSignalNameLength - signalLabel.length()).append(
                signalLabel).append(" ");
        StringBuffer nullLabel = getSpaceCharacters(signalLabel.length());

        ascii[0] = nullLabel.toString();
        ascii[1] = signalLabel.toString();

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
     * @param signalList
     *            the signal list
     * @return the max signal name length
     */
    protected int getMaxSignalNameLength(final SignalList signalList) {
        int maxLength = 0;
        for (Signal signal : signalList) {
            maxLength = Math.max(maxLength, signal.getName().length());
        }
        return maxLength;
    }

    // -------------------------------------------------------------------------

    /**
     * Plot signals as ASCII art.
     * 
     * @param signalList
     *            the signal list
     * @return the string[]
     */
    public String[] plot(final SignalList signalList) {
        LinkedList<String> stringList = new LinkedList<String>();
        return (String[]) stringList.toArray(new String[signalList.size()]);
    }

    // -------------------------------------------------------------------------

    /**
     * Export to ASCII text file.
     *
     * @param path the path
     * @param signalList the signal list
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws CoreException the core exception
     */
    public void plotToTextFile(final IPath path, final SignalList signalList) throws IOException,
            CoreException {
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRoot root = workspace.getRoot();
        IFile file = root.getFile(path);

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
    }

    // -------------------------------------------------------------------------

    /**
     * Export to ESO ASCII text file appending a new execution run if the file already exists.
     * 
     * @param path
     *            the path
     * @param signalList
     *            the signal list
     * @param inputSignalList
     *            the input signal list
     * @param outputSignalList
     *            the output signal list
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     * @throws CoreException
     *             the core exception
     */
    public void plotToEsoFile(final IPath path, final SignalList signalList,
            final List<Signal> inputSignalList, final List<Signal> outputSignalList)
            throws IOException, CoreException {
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRoot root = workspace.getRoot();
        IFile file = root.getFile(path);
        boolean newFile = false;
        LinkedList<String> oldFileContent = new LinkedList<String>();

        if (!file.exists()) {
            file.create(null, IResource.NONE, null);
            newFile = true;
        }

        String stringPath = file.getRawLocation().toString();

        if (!newFile) {
            // copy old contents
            FileInputStream fis = new FileInputStream(stringPath);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                oldFileContent.add(line);
            }
            br.close();
            fis.close();
        }

        PrintWriter out = new PrintWriter(stringPath);

        if (!newFile) {
            // restore old contents
            for (String line : oldFileContent) {
                out.println(line);
            }
        }

        long maxTick = signalList.getMaxTick();

        out.println("! reset;");
        for (long tick = 1; tick <= maxTick; tick++) {
            for (Signal inputSignal : inputSignalList) {
                if (inputSignal.isPresent(tick)) {
                    out.print(inputSignal.getName() + " ");
                }
            }
            out.println("");
            out.print("% Output: ");
            for (Signal outputSignal : outputSignalList) {
                if (outputSignal.isPresent(tick)) {
                    out.print(outputSignal.getName() + " ");
                }
            }
            out.println("");
            out.println(";");
        }

        out.close();
    }

    // -------------------------------------------------------------------------

}
