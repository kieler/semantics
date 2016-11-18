/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.sim.java;

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

/**
 * The Class DynamicClassLoader is necessary because dynamically generated java code is compiled to
 * java classes (using the BatchCompiler) and must be loaded dynamically. This new java code is a
 * subclass of SJLProgram. In order to be able to cast the dynamically instantiated classes (that
 * are instances also of its superclass SJLProgram) to SJLProgram it must be ensured that SJLProgram
 * is loaded by the same class loader within Eclipse as it is when loading the dynamically created
 * subclass (which depends also on SJLProgram and hence forces the class loader also to load it). <BR>
 * <BR>
 * This is solved with this DynamicClassLoader. <BR>
 * <BR>
 * Before using this class loader one typically adds other class paths to it using addClassPath().
 * Then one specifically adds classes that the DynamicClassLoader should load directly using
 * addClassFileByName(). The corresponding *.class files for these classes should be accessible for
 * the DynamicClassLoader under the class paths added or visible by the parent class loader. Only
 * classes added by this method are later NOT delegated to the parent class loader. All other
 * classes are delegated. <BR>
 * <BR>
 * In case of the usage for SJLPrograms, the dynamically created new sub classes are resolved by
 * DynamicClassLoader but not the superclass SJLProgram. The latter is resolved by the parent class
 * loader which in this case is the Eclipse bundle class loader of the plugin de.cau.cs.kieler.s.sj.
 * This way it is ensured that the SJLProgram instance is always exactly the same and casting the
 * dynamically created subclasses of SJLProgram can always be casted to SJLProgram.
 * 
 * @author cmot
 * @kieler.design 2013-05-23 proposed cmot
 * @kieler.rating 2013-05-23 proposed
 * 
 * */
public class DynamicClassLoader extends ClassLoader {

    /**
     * The parent class loader used if specific classes are not found (because they where not
     * added).
     */
    ClassLoader parentClassLoader;

    /**
     * The classname2url HashMap is used to store the added classes that can later be resolved by
     * this class loader.
     */
    HashMap<String, URL> className2URL = new HashMap<String, URL>();

    /**
     * The internal url class loader used to resolve classes (when adding them) that are contained
     * in additional class paths.
     */
    URLClassLoader urlClassLoader;

    /**
     * The additional class paths that can be added in order to add classes that are external w.r.t.
     * parent class loader.
     */
    List<URL> additionalClassPaths = new LinkedList<URL>();

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new dynamic class loader.
     * 
     * @param parent
     *            the parent
     */
    public DynamicClassLoader(ClassLoader parent) {
        super(parent);
        parentClassLoader = parent;
        URL[] additionalClassPathsArray = additionalClassPaths.toArray(new URL[additionalClassPaths
                .size()]);
        urlClassLoader = URLClassLoader.newInstance(additionalClassPathsArray, this.getClass()
                .getClassLoader());
    }

    // -------------------------------------------------------------------------

    /**
     * Adds a new additional class path URL that can be used in order to add classes that are
     * external w.r.t. parent class loader.
     * 
     * @param classPathURL
     *            the class path url
     */
    public void addClassPath(URL classPathURL) {
        additionalClassPaths.add(classPathURL);

        // Rebuild urlClassLoader
        URL[] additionalClassPathsArray = additionalClassPaths.toArray(new URL[additionalClassPaths
                .size()]);
        urlClassLoader = URLClassLoader.newInstance(additionalClassPathsArray, this.getClass()
                .getClassLoader());
    }

    // -------------------------------------------------------------------------

    /**
     * Adds a specific class file by its URL. If the URL is not known addClassFileByName() can be
     * used instead.
     * 
     * @param className
     *            the class name
     * @param classFileURL
     *            the class file url
     */
    public void addClassFileByURL(String className, URL classFileURL) {
        className2URL.put(className, classFileURL);
    }

    // -------------------------------------------------------------------------

    /**
     * Adds a specific class file by its name. A ClassLoader must be specified that is able to
     * resolve (find) the URL to the class. The file name of the class is synthesized by adding
     * ".class" and discarding preceding package names (if there are any).
     * 
     * @param className
     *            the class name
     * @param classLoader
     *            the class loader
     */
    public void addClassFileByName(String className, ClassLoader classLoader) {
        String classFileName = className;
        if (className.lastIndexOf(".") > 0) {
            classFileName = className.substring(className.lastIndexOf(".") + 1);
        }
        classFileName += ".class";
        URL classFileURL = classLoader.getResource(classFileName);
        addClassFileByURL(className, classFileURL);
    }
    
    // -------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    public URL getResource(String name) {
        return urlClassLoader.getResource(name);
    }

    // -------------------------------------------------------------------------

    /**
     * Adds a specific class file by its name. The internal URLClassLoader is used to resolve (find)
     * the specific class file URLs. Hence all necessary additional class paths need to be added
     * BEFORE using addClassPath().
     * 
     * @param className
     *            the class name
     */
    public void addClassFileByName(String className) {
        addClassFileByName(className, urlClassLoader);
    }

    // -------------------------------------------------------------------------

    /**
     * This method of the DynamicClassLoader tries to load the class by its name (e.g.
     * "testPackage.TestClass"). If the class was NOT added previously by an addClassFile...()
     * method, then the method will delegate the loading to the parent class loader. Otherwise it
     * will load the class under the registered URL that was added previously. It will either return
     * the loaded class (loaded by this class loader or by its parent class loader) or if this fails
     * throw an ClassNotFoundException.
     */
    public Class<?> loadClass(String classNameToLoad) throws ClassNotFoundException {
        if (!className2URL.containsKey(classNameToLoad))
            return super.loadClass(classNameToLoad);

        try {
            URLConnection connection = className2URL.get(classNameToLoad).openConnection();
            InputStream input = connection.getInputStream();
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            int data = input.read();

            while (data != -1) {
                buffer.write(data);
                data = input.read();
            }

            input.close();

            byte[] classData = buffer.toByteArray();

            return defineClass(classNameToLoad, classData, 0, classData.length);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    // -------------------------------------------------------------------------
}
