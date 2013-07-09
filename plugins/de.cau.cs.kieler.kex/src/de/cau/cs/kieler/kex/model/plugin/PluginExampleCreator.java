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
package de.cau.cs.kieler.kex.model.plugin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import de.cau.cs.kieler.core.WrappedException;
import de.cau.cs.kieler.kex.controller.ErrorMessage;
import de.cau.cs.kieler.kex.controller.ExportResource;
import de.cau.cs.kieler.kex.controller.util.IOHandler;
import de.cau.cs.kieler.kex.model.Category;
import de.cau.cs.kieler.kex.model.Example;
import de.cau.cs.kieler.kex.model.ExampleResource;

/**
 * can be used for creating new extensions for KEX extension point.<br>
 * So it allows to create new examples or example categories.
 * 
 * @author pkl
 */
public class PluginExampleCreator {

    private final IPath workspacePath = Platform.getLocation();

    private Document parsedXML;

    private File pluginXML;

    /**
     * parses the given file.
     * 
     * @param file
     *            , which will be parsed
     * @return Document, parsed document
     * @throws SAXException
     *             , could be thrown by DOM framework
     * @throws IOException
     *             , could be thrown by DOM framework
     * @throws ParserConfigurationException
     *             , could be thrown by DOM framework
     */
    private Document parseDocument(final File file) throws SAXException, IOException,
            ParserConfigurationException {
        return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
    }

    /**
     * NOTE: parseElement could only be a type of Example or a example category in String
     * representation.
     * 
     * @param extensionKEX
     *            , plugin.xml KEX-extension root.
     * 
     * @param location
     *            , {@link File}
     * @param parseElement
     *            , {@link Example}
     * @param creatableCategories
     *            , {@link List} of {@link String}s
     * @param absOverviewPic
     *            , {@link String}
     */
    public void addExtension(final Node extensionKEX, final File location,
            final Example parseElement, final List<Category> creatableCategories,
            final String absOverviewPic) {
        if (absOverviewPic != null) {
            parseElement.setOverviewPic(createLocalPluginPath(absOverviewPic));
        }
        addExampleCategories(extensionKEX, creatableCategories);
        extensionKEX.appendChild(toNode(parseElement, location));
        writePluginXML(pluginXML.getAbsolutePath());
    }

    /**
     * Searches in a given file with node extensionKEX for duplicates. The exampleIds of the file
     * examples must not match with the id of the exporting one, for exporting new categories count
     * the same.
     * 
     * @param extensionKEX
     *            , the KEX-extension node of a plugin.xml file.
     * @param exampleId
     *            , the id of the exporting example.
     * @param creatableCategories
     *            , a list of categories to create
     */
    public void checkDuplicate(final Node extensionKEX, final String exampleId,
            final List<Category> creatableCategories) {
        // TODO test.
        NodeList childNodes = extensionKEX.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            String nodeName = item.getNodeName();
            if (PluginConstants.Category.CATEGORY.equals(nodeName)) {
                Node namedItem = item.getAttributes().getNamedItem(PluginConstants.Category.ID);
                if (namedItem != null) {
                    for (Category creatableCategory : creatableCategories) {
                        if (creatableCategory.getId().equals(namedItem.getNodeValue())) {
                            // FIXME throw a more specific exception
                            throw new RuntimeException(ErrorMessage.DUPLICATE_ELEMENT
                                    + "The category \"" + creatableCategory.getId()
                                    + "\" exists already, please choose an other id or"
                                    + " take the existing category.");
                        }
                    }
                }
            } else if (PluginConstants.Example.EXAMPLE.equals(nodeName)) {
                Node namedItem = item.getAttributes().getNamedItem(PluginConstants.Example.ID);
                if (namedItem != null && exampleId.equals(namedItem.getNodeValue())) {
                    // FIXME throw a more specific exception
                    throw new RuntimeException(ErrorMessage.DUPLICATE_ELEMENT + "The example \""
                            + exampleId + "\" exists already in choosen plugin project.");
                }
            }
        }
    }

    private String createLocalPluginPath(final String absOverviewPic) {
        String projectPath = this.pluginXML.getAbsolutePath().substring(0,
                this.pluginXML.getAbsolutePath().length() - IOHandler.PLUGIN_XML.length() - 1);
        return new Path(absOverviewPic.substring(projectPath.length())).toPortableString();
    }

    private void makeRootSource(final File location, final Example example) {
        File project = IOHandler.searchUP(location, IOHandler.PROJECT_FILE).getParentFile();
        String relativeLocation = location.getPath().substring(project.getPath().length());
        example.setRootDir((relativeLocation.length() > 0) ? relativeLocation.substring(1)
                : relativeLocation);
    }

    /**
     * Gets the plugin node.
     *
     * @return the plugin node
     */
    public Node getPluginNode() {
        try {
            if (IOHandler.PLUGIN_XML.equals(this.pluginXML.getName())) {
                parsedXML = parseDocument(this.pluginXML);
            } else {
                // project path + .project file as path
                this.pluginXML = new File(this.pluginXML.getAbsolutePath() + File.separatorChar
                        + IOHandler.PLUGIN_XML);
                parsedXML = createPluginDocument();
            }
        } catch (ParserConfigurationException e) {
            String msg = ErrorMessage.NOT_PARSE_PLUGIN + "\n" + e.getLocalizedMessage();
            throw new WrappedException(e, msg);
        } catch (SAXException e) {
            String msg = ErrorMessage.NOT_PARSE_PLUGIN + "\n" + e.getLocalizedMessage();
            throw new WrappedException(e, msg);
        } catch (IOException e) {
            String msg = ErrorMessage.NOT_PARSE_PLUGIN + "\n" + e.getLocalizedMessage();
            throw new WrappedException(e, msg);
        }

        NodeList plugins = this.parsedXML.getElementsByTagName(PluginConstants.PLUGIN);
        if (plugins.getLength() == 1) {
            return plugins.item(0);
        }
        // FIXME throw a more specific exception
        throw new RuntimeException("Could not filter plugin node. " + pluginXML.getPath());
    }

    /**
     * Filter extension kex.
     *
     * @param pluginNode the plugin node
     * @return the node
     */
    public Node filterExtensionKEX(final Node pluginNode) {
        Node extensionKEX = null;
        NodeList nodes = pluginNode.getChildNodes();
        int length = nodes.getLength();
        for (int i = 0; i < length; i++) {
            Node node = nodes.item(i);
            if (PluginConstants.EXTENSION.equals(node.getNodeName())) {
                NamedNodeMap attributes = node.getAttributes();
                Node namedItem = attributes.getNamedItem(PluginConstants.POINT);
                if (PluginConstants.KEX_EXT_POINT.equals(namedItem.getNodeValue())) {
                    extensionKEX = node;
                    break;
                }
            }
        }
        if (extensionKEX == null) {

            Element extElement = pluginNode.getOwnerDocument().createElement(
                    PluginConstants.EXTENSION);
            extElement.setAttribute(PluginConstants.POINT, PluginConstants.KEX_EXT_POINT);
            pluginNode.appendChild(extElement);
            return filterExtensionKEX(pluginNode);
        }

        return extensionKEX;
    }

    private Document createPluginDocument() {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setValidating(true);

        DocumentBuilder docBuilder = null;
        try {
            docBuilder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException p) {
            throw new WrappedException(p, ErrorMessage.DOC_BUILDER_NEW_ERROR);
        }

        DOMImplementation impl = docBuilder.getDOMImplementation();
        Document doc = impl.createDocument(null, null, null);
        Element root = doc.createElement(PluginConstants.PLUGIN);
        doc.appendChild(root);

        Element child = doc.createElement(PluginConstants.EXTENSION);
        child.setAttribute(PluginConstants.POINT, PluginConstants.KEX_EXT_POINT);
        root.appendChild(child);
        return doc;
    }

    /**
     * creates example files to given location.
     * 
     * @param finishedResources
     *            , {@link List} of {@link IPath}
     * 
     * @param resources
     *            , {@link List} of {@link ExportResource}
     * 
     * @param destFile
     *            , {@link File}
     */
    public void copyResources(final File destFile, final List<ExportResource> resources,
            final List<IPath> finishedResources) {
        for (ExportResource resource : resources) {
            copyResource(resource, destFile.getPath(), finishedResources);
        }
    }

    private void copyResource(final ExportResource resource, final String destPath,
            final List<IPath> finishedResources) {
        StringBuilder destLocation = new StringBuilder();
        try {

            String sourcePath = this.workspacePath.toOSString()
                    + resource.getResource().getFullPath().toOSString();

            destLocation.append(destPath).append(File.separatorChar)
                    .append(resource.getLocalPath());
            IPath destination = Path.fromPortableString(destLocation.toString());
            finishedResources.add(destination);

            IOHandler.writeResource(new File(sourcePath), destination.toFile());
        } catch (IOException e) {
            throw new WrappedException(e);
        }
    }

    /**
     * Deletes resources.
     * 
     * @param resources
     *            , {@link List} of {@link IPath}.
     */
    public void deleteExampleResources(final List<IPath> resources) {
        for (IPath path : resources) {
            IOHandler.deleteFile(path.toFile());
        }
    }

    private boolean addExampleCategories(final Node node, final List<Category> creatableCategories) {
        for (Category creatable : creatableCategories) {
            Element createdCategory = parsedXML.createElement(PluginConstants.Category.CATEGORY);
            createdCategory.setAttribute(PluginConstants.Category.ID, creatable.getId());
            createdCategory.setAttribute(PluginConstants.Category.TITLE, creatable.getTitle());
            createdCategory.setAttribute(PluginConstants.Category.DESCRIPTION,
                    creatable.getDescription());
            createdCategory.setAttribute(PluginConstants.Category.ICON, creatable.getIconPath());
            createdCategory.setAttribute(PluginConstants.Category.PARENT, creatable.getParentId());
            node.appendChild(createdCategory);
        }
        return true;
    }

    private void writePluginXML(final String pluginPath) {
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(parsedXML);
            FileOutputStream os = new FileOutputStream(new File(pluginPath));
            StreamResult result = new StreamResult(os);
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setParameter("eclipse version", "3.4");
            transformer.transform(source, result);
        } catch (TransformerConfigurationException e) {
            throwWritePluginError(e);
        } catch (TransformerFactoryConfigurationError e) {
            throwWritePluginError(e);
        } catch (FileNotFoundException e) {
            throwWritePluginError(e);
        } catch (TransformerException e) {
            throwWritePluginError(e);
        }

    }

    private void throwWritePluginError(final Throwable e) {
        // FIXME throw a more specific exception
        throw new RuntimeException(new StringBuffer().append(ErrorMessage.NOT_WRITE_PLUGIN)
                .append(e.getLocalizedMessage()).toString());
    }

    private Node toNode(final Example example, final File location) {
        Element createdExample = parsedXML.createElement(PluginConstants.Example.EXAMPLE);
        createdExample.setAttribute(PluginConstants.Example.ID, example.getId());
        createdExample.setAttribute(PluginConstants.Example.TITLE, example.getTitle());
        createdExample.setAttribute(PluginConstants.Example.CATEGORY, example.getCategoryId());
        createdExample.setAttribute(PluginConstants.Example.DESCRIPTION, example.getDescription());
        createdExample.setAttribute(PluginConstants.Example.GENERATION_DATE, example
                .getGenerationDate().toString());
        makeRootSource(location, example);

        String overviewPicPath = example.getOverviewPic();
        if (overviewPicPath != null) {
            createdExample.setAttribute(PluginConstants.Example.OVERVIEW_PIC, overviewPicPath);
        }
        String author = example.getAuthor();
        if (author != null) {
            createdExample.setAttribute(PluginConstants.Example.AUTHOR, author);
        }

        String contact = example.getContact();
        if (contact != null) {
            createdExample.setAttribute(PluginConstants.Example.CONTACT, contact);
        }

        String rootDirectory = example.getRootDir();
        if (rootDirectory != null) {
            createdExample.setAttribute(PluginConstants.Example.ROOT_DIRECTORY, rootDirectory);
        }

        for (ExampleResource exResource : example.getResources()) {
            createdExample.appendChild(toNode(rootDirectory, exResource));
        }
        return createdExample;

    }

    private Node toNode(final String relativePath, final ExampleResource exResource) {
        Element createdExResource = parsedXML
                .createElement(PluginConstants.Resource.EXAMPLE_RESOURCE);
        createdExResource.setAttribute(PluginConstants.Resource.LOCAL_PATH, relativePath + "/"
                + exResource.getLocalPath());
        createdExResource.setAttribute(PluginConstants.Resource.RESOURCE_TYPE,
                ExampleResource.Type.map(exResource.getResourceType()));
        createdExResource.setAttribute(PluginConstants.Resource.DIRECT_OPEN,
                Boolean.toString(exResource.isDirectOpen()));
        return createdExResource;

    }

    /**
     * Copies the preview picture of an example.
     * 
     * @param destPath
     *            {@link String}
     * @param sourcePath
     *            , {@link String}
     * @param finishedResources
     *            , {@link List} of {@link IPath}
     * @return {@link String}
     */
    public String copyOverviewPic(final String destPath, final String sourcePath,
            final List<IPath> finishedResources) {
        File file = new File(sourcePath);
        String destLocation = destPath + File.separatorChar + file.getName();
        IPath destination = Path.fromPortableString(destLocation.toString());
        finishedResources.add(destination);
        try {
            IOHandler.writeResource(new File(sourcePath), destination.toFile());
        } catch (IOException e) {
            StringBuilder errorMessage = new StringBuilder();
            errorMessage.append(ErrorMessage.PLUGIN_WRITE_ERROR).append("\ndestination: ")
                    .append(destPath).append(", image: ").append(sourcePath);
            throw new WrappedException(e, errorMessage.toString());
        }
        return destLocation;

    }

    /**
     * Makes a absolute path, relative to export project of workspace.
     * 
     * @param projectPath
     *            {@link String}
     * @param absolutePath
     *            {@link String}
     * @return {@link String}
     */
    public String makeRelativePath(final String projectPath, final String absolutePath) {
        // TODO der projekt pfad wird bei filerPluginProjekt ermittelt,
        // der muss hier herein gereicht werden und der vom absolutenpath
        // abgetrennt werden.
        return null;
    }

    /**
     * setter for the pluginXML.
     * 
     * @param pluginXML the plugin.xml file.
     */
    public void setPluginXML(final File pluginXML) {
        this.pluginXML = pluginXML;

    }

}
