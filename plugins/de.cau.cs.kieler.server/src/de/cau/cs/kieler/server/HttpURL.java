/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.server;

/**
 * Implements the URL field of a HttpHeader.
 * 
 * @author cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 * 
 */
public class HttpURL {

    public String uri;
    public String host;
    public int port;
    public String querystring;
    public String scheme;

    // ----------------------------------------------------------------------
    
    /**
     * Instantiates a new http url.
     */
    public HttpURL() {
    }

    // ----------------------------------------------------------------------
    
    /**
     * Instantiates a new http url and parses the raw URL
     *
     * @param rawURL the raw url
     */
    public HttpURL(String rawURL) {
        parseURL(rawURL, this); 
    }

    // ----------------------------------------------------------------------

    /**
     * ParseURL() will parse a raw-url of a REQUEST from the client and returns the host, url and
     * port of that
     * 
     * @param rawURL
     *            the raw url
     * @return the http url
     */
    public static HttpURL parseURL(String rawURL) {
        return parseURL(rawURL, new HttpURL());
    }

    // ----------------------------------------------------------------------

    /**
     * ParseURL() will parse a raw-url of a REQUEST from the client and returns the host, url and
     * port of that
     * 
     * @param rawURL
     *            the raw url to parse
     * @param httpURL
     *            the http url
     * @return the http url with host,url and port
     */
    public static HttpURL parseURL(String rawURL, HttpURL httpURL) {
        // "http://www.google.de/index.htm"
        // "http://www.google.de:2020/index.htm"
        // "http://www.google.de:2020"
        // "http://www.google.de"
        // "http://www.google.de/index.htm?Querystring"
        // "http://www.google.de:2020/index.htm?Querystring"
        // "http://www.google.de:2020?Querystring"
        // "http://www.google.de?Querystring"
        // "ftp://www.google.de/
        // "https://www.google.de/

        boolean foundDoubleSlash = false;
        String Host = "";
        String Port = "";
        boolean ColonFound = false;

        HttpURL ReturnURL = httpURL;
        ReturnURL.scheme = null;
        String BackString = "";
        int c = 0;
        for (; c < rawURL.length(); c++) {
            String TripleCharacter = "";
            if (c < rawURL.length() - 2)
                TripleCharacter = rawURL.substring(c, c + 3);
            String OneCharacter = rawURL.substring(c, c + 1);
            if (TripleCharacter.equals("://")) {
                foundDoubleSlash = true;
                ReturnURL.scheme = rawURL.substring(0, c);
                Host = "";
                c += 2; // skip :/ characters
            } else if (OneCharacter.endsWith(":")) {
                ColonFound = true;
                if (!foundDoubleSlash) {
                    Host = rawURL.substring(0, c);
                }
            } else if (OneCharacter.equals("/")) {
                if ((!foundDoubleSlash) && (!ColonFound)) {
                    Host = rawURL.substring(0, c);
                }
                break;
            } else if ((foundDoubleSlash) && (!ColonFound)) {
                Host += OneCharacter;
            } else if (ColonFound)
                Port += OneCharacter;

            // System.out.println("XXX"+c+ Host + Port + ColonFound);
        }
        BackString = rawURL.substring(c, rawURL.length()).trim();

        ReturnURL.host = Host;
        ReturnURL.port = 80;
        try {
            ReturnURL.port = new Integer(Port).intValue();
        } catch (Exception e) {
        }
        ReturnURL.querystring = extractRequerystring(BackString);
        ReturnURL.uri = BackString;
        if (ReturnURL.uri.equals(""))
            ReturnURL.uri = "/";
        if (ReturnURL.querystring.length() > 0)
            ReturnURL.uri =
                    BackString.substring(0, BackString.length() - ReturnURL.querystring.length());
        if (ReturnURL.querystring.length() > 1)
            ReturnURL.querystring =
                    ReturnURL.querystring.substring(1, ReturnURL.querystring.length());
        return ReturnURL;
    }

    // ----------------------------------------------------------------------

    private static String extractRequerystring(String URL) {
        String Querystring = "";
        int c = 0;
        for (; c < URL.length(); c++) {
            String Character = URL.substring(c, c + 1);
            if (Character.equalsIgnoreCase("?"))
                break;

        }
        try {
            Querystring = URL.substring(c, URL.length()).trim();
        } catch (Exception e) {
        }
        return Querystring;
    }

    // ----------------------------------------------------------------------

    public static String extractFileName(String URI) {
        int c = 0;
        try {
            for (c = URI.length() - 1; c >= 0; c--) {
                String Character = URI.substring(c, c + 1);
                if (Character.equals("/"))
                    break;
            }
        } catch (Exception e) {
        }
        return (URI.substring(c, URI.length()));
    }

    // ----------------------------------------------------------------------

}
