/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sjl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class DynamicClassLoader extends ClassLoader{
    
    HashMap<String,URL> className2URL = new HashMap<String, URL>();
    ClassLoader parentClassLoader;
    
    URLClassLoader urlClassLoader;
    
    List<URL> additionalClassPaths = new LinkedList<URL>();

    public DynamicClassLoader(ClassLoader parent) {
        super(parent);
        parentClassLoader = parent;
        URL[] additionalClassPathsArray = additionalClassPaths.toArray(new URL[additionalClassPaths.size()]);
        urlClassLoader = URLClassLoader.newInstance(additionalClassPathsArray, this.getClass().getClassLoader());
    }
    
    
    public void addClassPath(URL classPathURL) {
        additionalClassPaths.add(classPathURL);
        
        //Rebuild urlClassLoader
        URL[] additionalClassPathsArray = additionalClassPaths.toArray(new URL[additionalClassPaths.size()]);
        urlClassLoader = URLClassLoader.newInstance(additionalClassPathsArray, this.getClass().getClassLoader());
    }

    public void addClassFileByURL(String className, URL classFileURL) {
        className2URL.put(className, classFileURL);
    }
    
    public void addClassFileByName(String className, ClassLoader classLoader) {
        //URLClassLoader classLoader = URLClassLoader.newInstance(classLoaderRootURLs, this.getClass().getClassLoader());
        String classFileName = className;
        if (className.lastIndexOf(".") > 0) {
            classFileName = className.substring(className.lastIndexOf(".") + 1);
        }
        classFileName += ".class";
        URL classFileURL = classLoader.getResource(classFileName);
        addClassFileByURL(className, classFileURL);
    }    
    public void addClassFileByName(String className) {
        addClassFileByName(className, urlClassLoader);
    }
    
    public Class loadClass(String classNameToLoad) throws ClassNotFoundException {
        if(!className2URL.containsKey(classNameToLoad))
                return super.loadClass(classNameToLoad);

        try {
            URLConnection connection = className2URL.get(classNameToLoad).openConnection();
            InputStream input = connection.getInputStream();
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            int data = input.read();

            while(data != -1){
                buffer.write(data);
                data = input.read();
            }

            input.close();

            byte[] classData = buffer.toByteArray();

            return defineClass(classNameToLoad,
                    classData, 0, classData.length);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace(); 
        }

        return null;
    }

}
