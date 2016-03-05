package de.cau.cs.kieler.sccharts.test

import org.apache.commons.io.FilenameUtils

/**
 * Provides methods that are useful in general. 
 */
class Util {

    /**
     * Removes a slash at the beginning and end of a path.
     * @return the input path withouth a starting and ending slash.  
     */
    def public static String stripSlashes(String path) {
        // The input path has the form '/the/folder/file.extension/'
        // The output path has the form 'the/folder/file.extension'
        val pathNoEndSeparator = FilenameUtils.getFullPathNoEndSeparator(path)
        if(pathNoEndSeparator.startsWith("/"))
            return pathNoEndSeparator.substring(1)
        else
            return pathNoEndSeparator 
    }
}