package de.cau.cs.kieler.core.model;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.logging.ErrorManager;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

/**
 * StreamHandler Variant for 2 output streams,
 * based on the Java {@code StreamHandler}.
 * 
 * @author ssm 
 */
public class LogHandler extends StreamHandler {
    
    private OutputStream errorOutput;
    private boolean doneErrorHeader;
    private volatile Writer errorWriter;

    public LogHandler(OutputStream out,  OutputStream err, Formatter formatter) {
        super(out, formatter);
        setErrorOutputStream(err);
    }

    protected synchronized void setErrorOutputStream(OutputStream out) throws SecurityException {
        if (out == null) {
            throw new NullPointerException();
        }
        flushAndClose();
        errorOutput = out;
        doneErrorHeader = false;
        String encoding = getEncoding();
        if (encoding == null) {
            errorWriter = new OutputStreamWriter(errorOutput);
        } else {
            try {
                errorWriter = new OutputStreamWriter(errorOutput, encoding);
            } catch (UnsupportedEncodingException ex) {
                throw new Error("Unexpected exception " + ex);
            }
        }
    }

    public synchronized void publishToError(LogRecord record) {
        if (!isLoggable(record)) {
            return;
        }
        String msg;
        try {
            msg = getFormatter().format(record);
        } catch (Exception ex) {
            reportError(null, ex, ErrorManager.FORMAT_FAILURE);
            return;
        }

        try {
            if (!doneErrorHeader) {
                errorWriter.write(getFormatter().getHead(this));
                doneErrorHeader = true;
            }
            errorWriter.write(msg);
        } catch (Exception ex) {
            reportError(null, ex, ErrorManager.WRITE_FAILURE);
        }
    }


    @Override
    public synchronized void flush() {
        super.flush();
        
        if (errorWriter != null) {
            try {
                errorWriter.flush();
            } catch (Exception ex) {
                reportError(null, ex, ErrorManager.FLUSH_FAILURE);
            }
        }
    }
    

    private synchronized void flushAndClose() throws SecurityException {
        if (errorWriter != null) {
            try {
                if (!doneErrorHeader) {
                    errorWriter.write(getFormatter().getHead(this));
                    doneErrorHeader = true;
                }
                errorWriter.write(getFormatter().getTail(this));
                errorWriter.flush();
                errorWriter.close();
            } catch (Exception ex) {
                // We don't want to throw an exception here, but we
                // report the exception to any registered ErrorManager.
                reportError(null, ex, ErrorManager.CLOSE_FAILURE);
            }
            errorWriter = null;
            errorOutput = null;
        }
    }

    /**
     * Close the current output stream.
     * <p>
     * The <tt>Formatter</tt>'s "tail" string is written to the stream before it
     * is closed.  In addition, if the <tt>Formatter</tt>'s "head" string has not
     * yet been written to the stream, it will be written before the
     * "tail" string.
     *
     * @exception  SecurityException  if a security manager exists and if
     *             the caller does not have LoggingPermission("control").
     */
    @Override
    public synchronized void close() throws SecurityException {
        super.close();
        flushAndClose();
    }
}
