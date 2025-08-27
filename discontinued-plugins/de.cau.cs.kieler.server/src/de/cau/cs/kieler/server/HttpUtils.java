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
 * Utility class for encoding and decoding data to/from URL or BASE64 encodings.
 * 
 * @author cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 * 
 */
import java.net.URLDecoder;
import java.net.URLEncoder;

public class HttpUtils {

    // public static String decode(String s) {
    // return StringUtils.newStringUtf8(Base64.decodeBase64(s));
    // }
    //
    // public static String encode(String s) {
    // return Base64.encodeBase64String(StringUtils.getBytesUtf8(s));
    // }

    private final static char[] BASE64ALPHABET =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

    private static int[] toInt = new int[128];

    static {
        for (int i = 0; i < BASE64ALPHABET.length; i++) {
            toInt[BASE64ALPHABET[i]] = i;
        }
    }

    @SuppressWarnings("deprecation")
    public static String encodeURL(String text) {
        return URLEncoder.encode(text);
        // return (URI.create(text)).getRawQuery();
    }

    @SuppressWarnings("deprecation")
    public static String decodeURL(String text) {
        // return (URI.create(text)).getQuery();
        return URLDecoder.decode(text);
    }

    /**
     * Translates the specified byte array into Base64 string.
     * 
     * @param buf
     *            the byte array (not null)
     * @return the translated Base64 string (not null)
     */
    public static String encodeBase64(byte[] buf) {
        int size = buf.length;
        char[] ar = new char[((size + 2) / 3) * 4];
        int a = 0;
        int i = 0;
        while (i < size) {
            byte b0 = buf[i++];
            byte b1 = (i < size) ? buf[i++] : 0;
            byte b2 = (i < size) ? buf[i++] : 0;

            int mask = 0x3F;
            ar[a++] = BASE64ALPHABET[(b0 >> 2) & mask];
            ar[a++] = BASE64ALPHABET[((b0 << 4) | ((b1 & 0xFF) >> 4)) & mask];
            ar[a++] = BASE64ALPHABET[((b1 << 2) | ((b2 & 0xFF) >> 6)) & mask];
            ar[a++] = BASE64ALPHABET[b2 & mask];
        }
        switch (size % 3) {
        case 1:
            ar[--a] = '=';
        case 2:
            ar[--a] = '=';
        }
        return new String(ar);
    }

    /**
     * Translates the specified Base64 string into a byte array.
     * 
     * @param s
     *            the Base64 string (not null)
     * @return the byte array (not null)
     */
    public static byte[] decodeBase64(String s) {
        int delta = s.endsWith("==") ? 2 : s.endsWith("=") ? 1 : 0;
        byte[] buffer = new byte[s.length() * 3 / 4 - delta];
        int mask = 0xFF;
        int index = 0;
        for (int i = 0; i < s.length(); i += 4) {
            int c0 = toInt[s.charAt(i)];
            int c1 = toInt[s.charAt(i + 1)];
            buffer[index++] = (byte) (((c0 << 2) | (c1 >> 4)) & mask);
            if (index >= buffer.length) {
                return buffer;
            }
            int c2 = toInt[s.charAt(i + 2)];
            buffer[index++] = (byte) (((c1 << 4) | (c2 >> 2)) & mask);
            if (index >= buffer.length) {
                return buffer;
            }
            int c3 = toInt[s.charAt(i + 3)];
            buffer[index++] = (byte) (((c2 << 6) | c3) & mask);
        }
        return buffer;
    }

}
