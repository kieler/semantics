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

import java.io.*;
import java.util.LinkedList;

import de.cau.cs.kieler.krep.evalbench.exceptions.CommunicationException;

/**
 * Abstract superclass for connection protocols that use input and output
 * streams.
 * 
 * @author msp
 */
public abstract class ConnectionProtocol implements IConnectionProtocol {

	/** Timeout in ms for rather short waiting */
	private static final long SHORT_TIMEOUT = 100;
	/** Timeout in ms for rather long waiting */
	private static final long LONG_TIMEOUT = 10000;

	/**
	 * Reads at most n bytes from an input stream and stores them into a string
	 * 
	 * @param input
	 *            the input stream to be read
	 * @param n
	 *            maximal number of bytes to read
	 * @return data read from the input stream
	 * @throws IOException
	 *             when the read operation throws an exception
	 */
	private static String readInput(InputStreamReader input, int n)
			throws IOException {
		StringBuffer stringBuffer = new StringBuffer();
		int c;
		int i = 0;
		while (i < n && (c = input.read()) != -1) {
			stringBuffer.append((char) c);
			i++;
		}
		return stringBuffer.toString();
	}

	/**
	 * Reads from an input stream until an exit character is reached and stores
	 * into a string.
	 * 
	 * @param input
	 *            the input stream to be read
	 * @param x
	 *            the exit character
	 * @return data read from the input stream
	 * @throws IOException
	 *             when the read operation throws an exception
	 */
	private static String readInputExit(InputStreamReader input, char x)
			throws IOException {
		StringBuffer stringBuffer = new StringBuffer();
		int c;
		while ((c = input.read()) != -1) {
			stringBuffer.append((char) c);
			if ((char) c == x)
				break;
		}
		return stringBuffer.toString();
	}

	/**
	 * Retrieves the input stream for this connection.
	 * 
	 * @return the input stream, or <code>null</code> if no input stream is
	 *         available
	 */
	protected abstract InputStream getInputStream();

	/**
	 * Retrieves the output stream for this connection.
	 * 
	 * @return the output stream, or <code>null</code> if no output stream is
	 *         available
	 */
	protected abstract OutputStream getOutputStream();

	/*
	 * (non-Javadoc)
	 * 
	 * @see krep.evalbench.comm.IConnectionProtocol#receive(char)
	 */
	public String receive(char exit) throws CommunicationException {
		try {
			InputStream inputStream = getInputStream();
			if (inputStream == null) {
				throw new CommunicationException("No input stream available");
			}
			InputStreamReader reader = new InputStreamReader(inputStream);
			StringBuffer stringBuffer = new StringBuffer();
			String input;
			long startTime = System.currentTimeMillis();
			do {
				if (reader.ready()) {
					input = readInputExit(reader, exit);
					stringBuffer.append(input);
				} else {
					input = "";
					try {
						Thread.sleep(SHORT_TIMEOUT);
					} catch (InterruptedException e) {
						// Ignore silently
					}
				}
				if (System.currentTimeMillis() - startTime > LONG_TIMEOUT) {
					throw new CommunicationException(
							"Timeout reached while waiting for character '"
									+ exit + "'");
				}
			} while (input.length() == 0
					|| input.charAt(input.length() - 1) != exit);
			return stringBuffer.toString();
		} catch (IOException e) {
			throw new CommunicationException(
					"Error while reading from connection: " + e.getMessage());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see krep.evalbench.comm.IConnectionProtocol#receive(char)
	 */
	public String receive(int n) throws CommunicationException {
		InputStreamReader reader = null;
		try {
			InputStream inputStream = getInputStream();
			if (inputStream == null) {
				throw new CommunicationException("No input stream available");
			}
			reader = new InputStreamReader(inputStream);
			StringBuffer stringBuffer = new StringBuffer();
			String input;
			long startTime = System.currentTimeMillis();
			do {
				if (reader.ready()) {
					input = hark(n - stringBuffer.length());
					stringBuffer.append(input);
				} else {
					input = "";
					try {
						Thread.sleep(SHORT_TIMEOUT);
					} catch (InterruptedException e) {
						// Ignore silently
					}
				}
				if (System.currentTimeMillis() - startTime > LONG_TIMEOUT) {
					reader.close();
					throw new CommunicationException("Timeout reached reading "
							+ n + " characters");
				}
			} while (stringBuffer.length() < n);
			return stringBuffer.toString();
		} catch (IOException e) {
			throw new CommunicationException(
					"Error while reading from connection: " + e.getMessage());
		}finally{
			if(reader!=null){
				try {
					reader.close();
				} catch (IOException e) {
					// silently ignore
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see krep.evalbench.comm.IConnectionProtocol#receive(char)
	 */
	public LinkedList<Integer> receiveByte(int n) throws CommunicationException {
		InputStreamReader reader=null;
		try {
			InputStream inputStream = getInputStream();
			if (inputStream == null) {
				throw new CommunicationException("No input stream available");
			}
			reader = new InputStreamReader(inputStream);
			LinkedList<Integer> res = new LinkedList<Integer>();
			int i = 0;
			long startTime = System.currentTimeMillis();
			do {
				if (reader.ready()) {
					res.addAll(harkByte(n - i));
				} else {
					try {
						Thread.sleep(SHORT_TIMEOUT);
					} catch (InterruptedException e) {
						// Ignore silently
					}
				}
				if (System.currentTimeMillis() - startTime > LONG_TIMEOUT) {
					throw new CommunicationException("Timeout reached reading "
							+ n + " characters");
				}
			} while (res.size() < n);
			return res;
		} catch (IOException e) {
			throw new CommunicationException(
					"Error while reading from connection: " + e.getMessage());
		}finally{
			if (reader!=null){
				try {
					reader.close();
				} catch (IOException e) {
					//silently ignore
					e.printStackTrace();
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see krep.evalbench.comm.IConnectionProtocol#hark(int)
	 */
	public String hark(int n) throws CommunicationException {
		try {
			InputStream inputStream = getInputStream();
			if (inputStream == null) {
				throw new CommunicationException("No input stream available");
			}
			InputStreamReader reader = new InputStreamReader(inputStream);
			if (reader.ready()) {
				return readInput(reader, n);
			} else {
				return "";
			}
		} catch (IOException e) {
			throw new CommunicationException(
					"Error while reading from serial connection: "
							+ e.getMessage());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see krep.evalbench.comm.IConnectionProtocol#hark(int)
	 */
	public LinkedList<Integer> harkByte(int n) throws CommunicationException {
		try {
			InputStream inputStream = getInputStream();
			if (inputStream == null) {
				throw new CommunicationException("No input stream available");
			}
			LinkedList<Integer> res = new LinkedList<Integer>();
			if (inputStream.available() > 0) {
				int i = 0;
				int b;
				while (i < n && (b = inputStream.read()) != -1) {
					res.add(b);
					i++;
				}
				return res;
			} else {
				return res;
			}
		} catch (IOException e) {
			throw new CommunicationException(
					"Error while reading from serial connection: "
							+ e.getMessage());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see krep.evalbench.comm.IConnectionProtocol#send(java.lang.String)
	 */
	public void send(final String data) throws CommunicationException {
		OutputStreamWriter writer=null;
		try {
			OutputStream outputStream = getOutputStream();
			if (outputStream == null) {
				throw new CommunicationException("No output stream available");
			}
			 writer= new OutputStreamWriter(outputStream);
			writer.write(data);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			throw new CommunicationException(
					"Error while writing to connection: " + e.getMessage());
		}finally{
			if(writer!=null){
				try {
					writer.close();
				} catch (IOException e) {
					// silently ignore
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see krep.evalbench.comm.IConnectionProtocol#send(java.lang.String)
	 */
	public void send(final byte data) throws CommunicationException {
		OutputStreamWriter writer = null;
		try {
			OutputStream outputStream = getOutputStream();
			if (outputStream == null) {
				throw new CommunicationException("No output stream available");
			}
			writer = new OutputStreamWriter(outputStream);
			writer.write(data);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			throw new CommunicationException(
					"Error while writing to connection: " + e.getMessage());
		} finally {
			try {
				if(writer!=null){
					writer.close();
				}
			} catch (IOException e) {
				// silently ignore
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see krep.evalbench.comm.IConnectionProtocol#send(java.lang.String)
	 */
	public void send(final byte[] data) throws CommunicationException {
		try {
			OutputStream outputStream = getOutputStream();
			if (outputStream == null) {
				throw new CommunicationException("No output stream available");
			}
			// OutputStreamWriter writer = new OutputStreamWriter(outputStream);
			outputStream.write(data);
			// writer.write(data);
			// writer.flush();
		} catch (IOException e) {
			throw new CommunicationException(
					"Error while writing to connection: " + e.getMessage());
		}
	}

}
