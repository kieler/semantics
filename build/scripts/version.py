# KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
# http://www.informatik.uni-kiel.de/rtsys/kieler/
#
# Copyright 2013 by
# + Kiel University
#   + Department of Computer Science
#     + Real-Time and Embedded Systems Group
#
# This code is provided under the terms of the Eclipse Public License (EPL).
# See the file epl-v10.html for the license text.

#
# Release script to set version number in all plugins
# Author: Alexander Schulz-Rosengarten <als@informatik.uni-kiel.de>
#

import sys
import re
import os
import argparse
import traceback
import htmlentitydefs
import xml.etree.ElementTree as serializer
from lxml import etree
from os.path import join, isdir, isfile, normpath, dirname, abspath
from myreuse import *

PROJECT_PREFIX = 'de.cau.cs.kieler'

def main(args):
    print '- Processing Plugins -'
    # check pluging path
    plugins = join(args.path, 'plugins')
    if not isdir(plugins):
        print 'No plugins directory found in ' + args.path
        sys.exit(-1)
    setProjectVersion(plugins, args, [setMainfestVersion, setPomVersion])

    print '\n- Processing Features -'
    # check features path
    features = join(args.path, 'features')
    if not isdir(features):
        print 'No features directory found in ' + args.path
        sys.exit(-1)
    setProjectVersion(features, args, [setFeatureVersion, setPomVersion])

    print '\n- Updating p2 repository -'
    # check category file
    category = join(args.path, 'build/de.cau.cs.kieler.semantics.repository/category.xml')
    if not isfile(category):
        print 'category.xml does not exist: ' + category
        sys.exit(-1)
    updateCategory(features, category, args)
    # check pom file
    pom = join(args.path, 'build/de.cau.cs.kieler.semantics.repository/pom.xml')
    if not isfile(pom):
        print 'pom.xml does not exist: ' + pom
        sys.exit(-1)
    setPomVersion(join(args.path, 'build'), 'de.cau.cs.kieler.semantics.repository', args)

    print '\n- Updating product plugin.xml -'
    # check product file
    plugin = join(args.path, 'plugins/de.cau.cs.kieler.core.product/plugin.xml')
    if not isfile(plugin):
        print 'plugin.xml does not exist: ' + plugin
        sys.exit(-1)
    updateProductPlugin(plugin, args)

    print '\n- Updating product -'
    # check product file
    product = join(args.path, 'build/de.cau.cs.kieler.semantics.product.repository/kieler.product')
    if not isfile(product):
        print 'kieler.product does not exist: ' + product
        sys.exit(-1)
    updateProduct(product, args)
    # check pom file
    pom = join(args.path, 'build/de.cau.cs.kieler.semantics.product.repository/pom.xml')
    if not isfile(pom):
        print 'pom.xml does not exist: ' + pom
        sys.exit(-1)
    setPomVersion(join(args.path, 'build'), 'de.cau.cs.kieler.semantics.product.repository', args)

    print '\n= Finished Version Update ='


def setProjectVersion(directory, args, setter):
    for project in sorted(os.listdir(directory)):
        if project.startswith(PROJECT_PREFIX) and isdir(join(directory, project)) and isfile(join(directory, project, '.project')):
            try:
                print project
                for call in setter:
                    call(directory, project, args)
            except KeyboardInterrupt as ki:
                raise ki
            except Exception as ex:
                print '-- Error while updating version information!'
                print '-- %s' % ex
                traceback.print_exc()
                pause(args)


def setMainfestVersion(directory, project, args):
    manifest = join(directory, project, 'META-INF', 'MANIFEST.MF')
    if isfile(manifest):
        # read
        with open(manifest, 'r') as f:
            content = f.readlines()
        # write
        with open(manifest, 'w') as f:
            for line in content:
                if line.startswith('Bundle-Version:'):
                    line = 'Bundle-Version: %s.qualifier\n' % args.version
                f.write(line)
    else:
        print '-- MANIFEST.MF file is missing!'
        pause(args)


def setFeatureVersion(directory, project, args):
    feature = join(directory, project, 'feature.xml')
    if isfile(feature):
        xml = etree.parse(feature, parser = etree.XMLParser(remove_comments=False, resolve_entities=False))
        xml.getroot().attrib['version'] = '%s.qualifier' % args.version

        with open(feature, 'w') as f:
            f.write('<?xml version="1.0" encoding="UTF-8"?>\n') # etree creates a wrong xml decl
            # restore html entities
            restoreHTMLentities(xml)
            f.write(fixHTMLentities(etree.tostring(xml, encoding='UTF-8', pretty_print=True, xml_declaration=False)))
    else:
        print '-- feature.xml file is missing!'
        pause(args)


def setPomVersion(directory, project, args):
    pom = join(directory, project, 'pom.xml')
    if isfile(pom):
        xml = etree.parse(pom, parser = etree.XMLParser(remove_comments=False))
        xml.find('./{http://maven.apache.org/POM/4.0.0}version').text = '%s-SNAPSHOT' % args.version
        with open(pom, 'w') as f:
            f.write('<?xml version="1.0" encoding="UTF-8"?>\n') # etree creates a wrong xml decl
            xml.write(f, encoding='UTF-8', pretty_print=True, xml_declaration=False)
    else:
        print '-- pom.xml file is missing!'
        pause(args)


def updateCategory(features, category, args):
    xml = etree.parse(category, parser = etree.XMLParser(remove_comments=False, remove_blank_text=True))
    root = xml.getroot()
    for feature in root.findall('feature'):
        print "Removing %s" % feature.attrib['id']
        root.remove(feature)
    for feature in sorted(os.listdir(features)):
        if isdir(join(features, feature)):
            # feature
            feat = etree.Element('feature', attrib = {
                'url' : 'features/%s_%s.qualifier.jar' % (feature, args.version),
                'id' : '%s' % feature,
                'version' : '%s.qualifier' % args.version
            })
            cat = etree.Element('category', attrib = {
                'name' : 'kieler-sem'
            })
            feat.append(cat)
            root.append(feat)
            print "Adding feature %s" % feat.attrib['id']
            #source feature
            feat = etree.Element('feature', attrib = {
                'url' : 'features/%s.source_%s.qualifier.jar' % (feature, args.version),
                'id' : '%s.source' % feature,
                'version' : '%s.qualifier' % args.version
            })
            cat = etree.Element('category', attrib = {
                'name' : 'kieler-sources'
            })
            feat.append(cat)
            root.append(feat)
            print "Adding source feature %s" % feat.attrib['id']
    with open(category, 'w') as f:
        f.write('<?xml version="1.0" encoding="UTF-8"?>\n') # etree creates a wrong xml decl
        xml.write(f, encoding='UTF-8', pretty_print=True, xml_declaration=False)

def updateProductPlugin(product, args):
    xml = etree.parse(product, parser = etree.XMLParser(remove_comments=False))
    version = xml.find("./extension/product/property[@name='version']")
    if version is not None:
        version.attrib['value'] = args.version
        print 'Set version in product plugin'
    else:
        print 'Cannot find versio property element in %s' % version
        pause(args)

    with open(product, 'w') as f:
        f.write('<?xml version="1.0" encoding="UTF-8"?>\n') # etree creates a wrong xml decl
        xml.write(f, encoding='UTF-8', pretty_print=True, xml_declaration=False)

def updateProduct(product, args):
    xml = etree.parse(product, parser = etree.XMLParser(remove_comments=False))
    xml.getroot().attrib['version'] = '%s.qualifier' % args.version
    print 'Set version in product'

    with open(product, 'w') as f:
        f.write('<?xml version="1.0" encoding="UTF-8"?>\n') # etree creates a wrong xml decl
        # restore html entities
        restoreHTMLentities(xml)
        f.write(fixHTMLentities(etree.tostring(xml, encoding='UTF-8', pretty_print=True, xml_declaration=False)))


if __name__ == "__main__":
    argParser = argparse.ArgumentParser(description='Release script to set version number in all plugins and update references.')
    argParser.add_argument('--nonstop', action='store_true', help='script will not pause (prompt confirmation) if an error or warning occurs')
    argParser.add_argument('version', help='version number to set')
    argParser.add_argument('path', type=repository, nargs='?', default=normpath(join(dirname(abspath(sys.argv[0])),'../..')), help='path to the project repository directory')
    try:
        main(argParser.parse_args())
    except KeyboardInterrupt:
        print "\nAbort"
        sys.exit(0)