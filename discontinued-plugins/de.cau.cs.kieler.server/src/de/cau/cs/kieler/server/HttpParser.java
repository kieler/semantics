// Internet Communication, WS 2007/08, Serie 3 Aufgabe 1
// Maximilian Gravert #589482, Christian Motika, #702133
//
//-------------------------------------------------------------------------------

/**
 * Aufgabe 1
 * =========
 *
 * Dieser Klasse soll einen HTTP-Parser repr�sentieren. Bei der Erzeugung
 * einer Instanz �bernimmt der Konstruktor den gegebenen InputStream auf
 * dem der Request anliegen wird. Er erstellt einen passenden Streamreader 
 * eine LinkedList (die die Zeilen aufnehmen wird) und eine Hashtabelle,
 * die bereits mit einigen festen "leeren" Werten initialisiert wird, die
 * in jedem Request enthalten sind (1. Zeile).
 * 
 * Die Funktion parseRequestResponse() parst dann zun�chst die erste Zeile
 * in der die Methode, URL und Version zu finden sein mu� (wenn es sich um 
 * einen request header handelt). Alle anderen Headerwerte werden, falls
 * sie gesetzt sind, durch die ParseLine() Funktion ermittelt.
 * 
 * Alle geparsten Daten werden schlie�lich in die Hashtabelle eingetragen,
 * die nach der R�ckkehr von parseRequest() durch die Funktion getHash()
 * zur�ckgegeben wird.
 *
 * Anschlie�end wird noch ein evtl vorhandener Body (auch bin�rer Art!)
 * gespeichert.   
 * 
 */

//package Aufgabe1;
package de.cau.cs.kieler.server;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

/**
 * The HttpParser will parse HTTP requests as well as responses. It will also allow body parts and
 * can re-create headers after modifications of the headers hash table entries.
 * 
 * @author cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 */
public class HttpParser {

    InputStream stream;
    Hashtable<String, String> requestHashtable = new Hashtable<String, String>();
    LinkedList<String> requestLines;
    byte[] body;
    String firstLine;

    // ------------------------------------------------------------------------

    /**
     * Instantiates a new http parser.
     * 
     * @param Stream
     *            InputStream where the HTTPRequests will be read from
     */
    public HttpParser(InputStream Stream) {
        this.stream = Stream;

        requestLines = new LinkedList<String>();
        // init hashtable with default "" values
        requestHashtable.put("Method", "");
        requestHashtable.put("URL", "");
        requestHashtable.put("Version", "");
    }

    // ------------------------------------------------------------------------

    /**
     * Reads a line in textmode - just use if we are within the header! it will accept lines ending
     * with "\n" and lines ending with "\r\n".
     * 
     * @return the string of the line w/o the line-ending!
     */
    public String readLine() {
        String line = "";
        try {
            while (true) {
                int ascii = stream.read();
                String character = new Character((char) ascii).toString();
                if (character.equalsIgnoreCase("\n"))
                    break;
                if (!(character.equalsIgnoreCase("\r")))
                    line += character;
            }
        } catch (Exception e) {
        }
        // KielerServerPlugin.log("LINE:"+Line);
        return line;
    }

    // ------------------------------------------------------------------------

    /**
     * The Class KeyValuePair.
     */
    public class KeyValuePair {
        String key = "";
        String value = "";

        public KeyValuePair() {
        }
    };

    // ------------------------------------------------------------------------

    /**
     * Parse a HeaderLine (String) "key:value" and return a TKeyValuePair, with Key set to "key" and
     * Value set to "value".
     * 
     * @param HeaderLine
     *            the headerline to parse the key-value-pair from
     * @return a TKeyValuePair value
     */
    public KeyValuePair parseLine(String HeaderLine) {
        KeyValuePair KVPair = new KeyValuePair();

        int c = 0;
        for (; c < HeaderLine.length(); c++) {
            char character = HeaderLine.charAt(c);
            if (character == ':')
                break;
        }// next character

        KVPair.key = HeaderLine.substring(0, c).trim();
        KVPair.value = HeaderLine.substring(c + 1, HeaderLine.length()).trim();
        return KVPair;
    }

    // ------------------------------------------------------------------------

    /**
     * Write the body (possibly BINARY DATA!!) to the output stream provided.
     * 
     * @param StreamOut
     *            the output stream where to write the body to
     */
    public void writeBody(OutputStream StreamOut) {
        DataOutputStream di = new DataOutputStream(StreamOut);
        try {
            if (this.body != null)
                di.write(this.body);
        } catch (Exception e) {
        }
        return;
    }

    // ------------------------------------------------------------------------

    /**
     * Create a header for a response according to the hashtable values and the orginal first line.
     * 
     * @return the complete header ready to send out to a server
     */
    public String constructResponseHeader() {
        String Back = "";
        Back += firstLine;
        // construct header rows
        this.requestHashtable.entrySet();
        Set<Map.Entry<String, String>> HashEntries = this.requestHashtable.entrySet();
        Iterator<Map.Entry<String, String>> EntryIterator = HashEntries.iterator();
        while (EntryIterator.hasNext()) {
            Map.Entry<String, String> Entry = (Map.Entry<String, String>) EntryIterator.next();
            String Key = Entry.getKey();
            String Value = Entry.getValue();

            if (!((Key.equalsIgnoreCase("Method")) || (Key.equalsIgnoreCase("URL"))
                    || (Key.equalsIgnoreCase("Version")) || (Key.equalsIgnoreCase("Connection")))) {
                Back += "\r\n";
                Back += Key + ": " + Value;
            }
        }

        Back += "\r\n \r\n";
        // add body if request is a POST of a form e.g.
        // if (!Body.trim().equalsIgnoreCase(""))
        // Back += Body;

        return Back;
    }

    // ------------------------------------------------------------------------

    /**
     * Create a header for a request according to the hashtable values.
     * 
     * @return the complete header ready to send out to a server
     */
    public String constructRequestHeader() {
        String Back = "";
        // (re)construct the first line of the request
        // "GET /foo/bar.htm HTTP/1.1";
        Back += this.requestHashtable.get("Method");
        Back += " ";
        Back += this.requestHashtable.get("URL");
        Back += " ";
        Back += this.requestHashtable.get("Version");
        Back += "\r\n";
        Back += "Connection: ";
        Back += this.requestHashtable.get("Connection");

        // construct header rows
        this.requestHashtable.entrySet();
        Set<Map.Entry<String, String>> HashEntries = this.requestHashtable.entrySet();
        Iterator<Map.Entry<String, String>> EntryIterator = HashEntries.iterator();
        while (EntryIterator.hasNext()) {
            Map.Entry<String, String> Entry = (Map.Entry<String, String>) EntryIterator.next();
            String Key = Entry.getKey();
            String Value = Entry.getValue();

            if (!((Key.equalsIgnoreCase("Method")) || (Key.equalsIgnoreCase("URL"))
                    || (Key.equalsIgnoreCase("Version")) || (Key.equalsIgnoreCase("Connection")))) {
                Back += "\r\n";
                Back += Key + ": " + Value;
            }
        }

        Back += "\r\n\r\n";
        // add body if request is a POST of a form e.g.
        // if (!Body.trim().equalsIgnoreCase(""))
        // Back += Body;
        return Back;
    }

    // ------------------------------------------------------------------------

    /**
     * Read the complete request. it will first go thru the header using this.Readline() and after
     * it reaches the body it will copy all bytes to this.Body It will make a backup of the first
     * line if we afterwards want to produce a response. And it will set the header key hastable
     * according to the values provided in the header lines.
     */
    public void parseRequestResponse() {
        requestLines.clear();

        // read complete request
        String stringline = "";

        try {
            while ((stringline = this.readLine()) != null) {
                if (stringline.equalsIgnoreCase(""))
                    break;
                requestLines.add(stringline); // catch all header lines
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // now parse first line
        String firstLine = requestLines.get(0);
        this.firstLine = firstLine;
        String method = "";
        String URL = "";
        String Version = "";
        if (firstLine != null) {
            int start = 0;
            int end = firstLine.length() - 1;
            for (int c = 0; c < firstLine.length(); c++) {
                String character = firstLine.substring(c, c + 1);
                if (character.equalsIgnoreCase(" ")) {
                    start = c + 1;
                    break;
                }
                method += character;
            }
            for (int c = firstLine.length() - 1; c >= 0; c--) {
                String character = firstLine.substring(c, c + 1);
                if (character.equalsIgnoreCase(" ")) {
                    end = c;
                    break;
                }
                Version = character + Version;
            }
            URL = firstLine.substring(start, end);
        }

        // clear hash table values
        this.requestHashtable.clear();
        // add values for first line
        this.requestHashtable.put("Method", method);
        this.requestHashtable.put("URL", URL);
        this.requestHashtable.put("Version", Version);

        // parse & add additional header fields/lines
        for (int line = 1; line < requestLines.size(); line++) {
            String HeaderLine = requestLines.get(line);
            KeyValuePair KVPair = this.parseLine(HeaderLine);
            this.requestHashtable.put(KVPair.key, KVPair.value);
        }

        this.body = null;
        String ContentLength = this.requestHashtable.get("Content-Length");
        int contentlength = 0;
        try {
            contentlength = new Integer(ContentLength).intValue();
        } catch (Exception e) {
        }
        try {
            if (contentlength > 0) {
                // use a buffer large enough ...
                byte[] buffer = new byte[10 * contentlength];
                int bytecounter = 0;

                // read everything we can!
                int i;
                while ((bytecounter < contentlength) && ((i = this.stream.read()) != -1)) {
                    buffer[bytecounter++] = (byte) i;
                }

                // now we precisely know the size -> copy buffer to this.Body
                this.body = new byte[bytecounter];
                // KielerServerPlugin.log("--------------------------------");
                for (int c = 0; c < bytecounter; c++) {
                    this.body[c] = buffer[c];
                    // System.out.print((char)this.Body[c] + "");
                }
                // KielerServerPlugin.log("\n--------------------------------");

                // the following lines output the body in HEY digits for debugging //
                /*
                 * KielerServerPlugin.log("----------------- BODY HEX --------------------"); int
                 * linecnt = 0; for (int c = 0; c < bytecounter; c++) { int mychar = this.Body[c];
                 * mychar &= 0x000000FF; String hexstring = Integer.toHexString(mychar); if
                 * (hexstring.length() == 1) hexstring = "0" + hexstring;
                 * System.out.print(hexstring); System.out.print(" "); linecnt++; if (linecnt == 16)
                 * { linecnt = 0; KielerServerPlugin.log(""); } }
                 * KielerServerPlugin.log("\n----------------- BODY HEX --------------------");
                 */
            }// end if
        } catch (Exception e) {
        }

    }

    // -------------------------------------------------------------------------

    /**
     * Gets the header.
     * 
     * @return the header
     */
    public HttpHeader getHeader() {
        HttpHeader header = new HttpHeader();
        for (Entry<String, String> entry : this.requestHashtable.entrySet()) {
            String key = entry.getKey();
            String val = entry.getValue();
            header.setHeaderField(key, val);
        }
        return header;
    }

    // -------------------------------------------------------------------------

}
