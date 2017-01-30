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
from lxml import etree
from os.path import join, isdir, isfile, normpath, dirname, abspath
from myreuse import *

releaseUpdatesite = 'http://rtsys.informatik.uni-kiel.de/~kieler/updatesite/release-semantics-%s/'
nightlyUpdatesite = 'http://rtsys.informatik.uni-kiel.de/~kieler/updatesite/nightly/semantics/'

def main(args):
    if args.release:
        print '= Configuring RELEASE %s build =' % args.release
    else:
        print '= Configuring NIGHTLY build ='

    print '\n- Reading target platform -'
    # check product pom file
    targetplatformFile = join(args.path, 'build/de.cau.cs.kieler.semantics.targetplatform/de.cau.cs.kieler.semantics.targetplatform.target')
    if not isfile(targetplatformFile):
        print 'Target platform does not exist: ' + targetplatformFile
        sys.exit(-1)
    targetplatformXml = etree.parse(targetplatformFile, parser = etree.XMLParser(remove_comments=False))
    targetplatform = [elem.attrib['location'] for elem in targetplatformXml.findall('./locations/location/repository')]

    print '\n- Updating updatesite facade -'
    # check updatesite index.html template file
    template = join(args.path, 'build/scripts/template/index.html')
    if not isfile(template):
        print 'Updatesite index.html template file does not exist: ' + updatesite
        sys.exit(-1)
    createUpdatesiteFacade(template, args)

    print '\n- Setting category description -'
    # check category file
    category = join(args.path, 'build/de.cau.cs.kieler.semantics.repository/category.xml')
    if not isfile(category):
        print 'category.xml does not exist: ' + category
        sys.exit(-1)
    setCategoryDesc(category, targetplatform, args)

    print '\n- Processing Features -'
    # check features path
    features = join(args.path, 'features')
    if not isdir(features):
        print 'No features directory found in ' + args.path
        sys.exit(-1)
    setFeatureUpdatesite(features, args)

    print '\n- Setting product artifact name -'
    # check product pom file
    product = join(args.path, 'build/de.cau.cs.kieler.semantics.product.repository/pom.xml')
    if not isfile(product):
        print 'pom.xml does not exist: ' + product
        sys.exit(-1)
    setArtifactName(product, args)

    print '\n- Setting product updatesite -'
    # check main pom file
    pom = join(args.path, 'build/pom.xml')
    if not isfile(pom):
        print 'pom.xml does not exist: ' + pom
        sys.exit(-1)
    setProductUpdateSite(pom, args)

    print '\n- Setting product updatesites -'
    # check main pom file
    p2inf = join(args.path, 'build/de.cau.cs.kieler.semantics.product.repository/kieler.p2.inf')
    if not isfile(p2inf):
        print 'kieler.p2.inf does not exist: ' + pom
        sys.exit(-1)
    setProductUpdateSites(p2inf, targetplatform, args)

    print '\n= Finished Configuring ='


def createUpdatesiteFacade(template, args):
    target = join(args.path, 'build/de.cau.cs.kieler.semantics.repository/facade/index.html')
    with open(template, 'r') as inFile:
        with open(target, 'w') as outFile:
            settings = {
                'name': 'KIELER Semantics',
                'description': 'Nightly'
            }
            if args.release:
                settings['description'] = 'Release %s' % args.release

            outFile.write(inFile.read().format(**settings))
            print 'Generated update site index for %s build' % settings['description']


def setCategoryDesc(category, targetplatform, args):
    xml = etree.parse(category, parser = etree.XMLParser(remove_comments=False, remove_blank_text=True))
    root = xml.getroot()

    description = xml.find('./description')
    if description is not None:
        if args.release:
            description.attrib['name'] = 'KIELER Semantics (Release %s)' % args.release
            description.attrib['url'] = releaseUpdatesite % args.release
            description.text = 'Update site for the KIELER Semantics release %s.' % args.release
        else:
            description.attrib['name'] = 'KIELER Semantics (Nightly Builds)'
            description.attrib['url'] = nightlyUpdatesite
            description.text = 'Update site for the KIELER Semantics project nightly builds.'
        print 'Description set to: %s' % description.attrib['name']
    else:
        print 'Cannot find description element in %s' % product
        pause(args)

    for ref in xml.findall('./repository-reference'):
        print 'Removed references repository: %s' % ref.attrib['location']
        root.remove(ref)
    for ref in targetplatform:
        refElem = etree.Element('repository-reference')
        refElem.attrib['location'] = ref
        refElem.attrib['enabled'] = 'true'
        root.append(refElem)
        print 'Added references repository: %s' % ref

    with open(category, 'w') as f:
        f.write('<?xml version="1.0" encoding="UTF-8"?>\n') # etree creates a wrong xml decl
        xml.write(f, encoding='UTF-8', pretty_print=True, xml_declaration=False)


def setFeatureUpdatesite(features, args):
    for featureDir in sorted(os.listdir(features)):
        feature = join(features, featureDir, 'feature.xml')
        if isfile(feature):
            xml = etree.parse(feature, parser = etree.XMLParser(remove_comments=False))
            updatesite = xml.find('./url/update')
            if updatesite is not None:
                if args.release:
                    updatesite.attrib['label'] = 'KIELER Release %s' % args.release
                    updatesite.attrib['url'] = releaseUpdatesite % args.release
                else:
                    updatesite.attrib['label'] = 'KIELER Nightly Builds'
                    updatesite.attrib['url'] = nightlyUpdatesite
                print 'Set updatesite url in %s' % featureDir
            # no else because dependency feature has not url

            # retain html entities
            # license = xml.find('./license')
            # if license is not None:
            #     license.text = license.text.replace('"', '&quot;')
            with open(feature, 'w') as f:
                f.write('<?xml version="1.0" encoding="UTF-8"?>\n') # etree creates a wrong xml decl
                xml.write(f, encoding='UTF-8', pretty_print=True, xml_declaration=False)


def setArtifactName(product, args):
    xml = etree.parse(product, parser = etree.XMLParser(remove_comments=False))
    archivename = xml.find('./p:build/p:plugins/p:plugin/p:configuration/p:products/p:product/p:archiveFileName', namespaces={'p':'http://maven.apache.org/POM/4.0.0'})
    if archivename is not None:
        if args.release:
            archivename.text = 'sccharts_rca_%s' % args.release
        else:
            archivename.text = 'sccharts_rca_nightly_${buildQualifier}'
        print 'Artifact name pattern set to: %s' % archivename.text
        
        with open(product, 'w') as f:
            f.write('<?xml version="1.0" encoding="UTF-8"?>\n') # etree creates a wrong xml decl
            xml.write(f, encoding='UTF-8', pretty_print=True, xml_declaration=False)
    else:
        print 'Cannot find archiveFileName element in %s' % product
        pause(args)


def setProductUpdateSite(pom, args):
    xml = etree.parse(pom, parser = etree.XMLParser(remove_comments=False))
    updatesite = xml.find('./p:properties/p:kieler.semantics.updatesite', namespaces={'p':'http://maven.apache.org/POM/4.0.0'})
    if updatesite is not None:
        if args.release:
            updatesite.text = releaseUpdatesite % args.release
        else:
            updatesite.text = nightlyUpdatesite
        print 'Product Updatesite: %s' % updatesite.text
    else:
        print 'Cannot find kieler.semantics.updatesite element in %s' % pom
        pause(args)

    # retain html entities
    trimspace = xml.find('./p:properties/p:sourceFeatureLabelSuffix', namespaces={'p':'http://maven.apache.org/POM/4.0.0'})
    if updatesite is not None:
        trimspace.text = u'\xa0(Sources)'

    with open(pom, 'w') as f:
        f.write('<?xml version="1.0" encoding="UTF-8"?>\n') # etree creates a wrong xml decl
        xml.write(f, encoding='UTF-8', pretty_print=True, xml_declaration=False)


def setProductUpdateSites(p2inf, targetplatform, args):
    updatesites = targetplatform
    if args.release:
        updatesites.append(releaseUpdatesite % args.release)
    else:
        updatesites.append(nightlyUpdatesite)
    print 'Registered Updatesites:'
    
    with open(p2inf, 'w') as f:
        f.write('instructions.configure=\\\n')
        for site in updatesites:
            print site
            f.write('  addRepository(type:0,location:%s);\\\n' % site.replace(':', '${#58}'))
            f.write('  addRepository(type:1,location:%s);\\\n' % site.replace(':', '${#58}'))


if __name__ == "__main__":
    argParser = argparse.ArgumentParser(description='Release script to to configure the the build for a nightly or realease build.')
    argParser.add_argument('--nonstop', action='store_true', help='script will not pause (prompt confirmation) if an error or warning occurs')
    argParser.add_argument('-release', metavar='version', help='cofigures the build files for a release build with the given version number')
    argParser.add_argument('path', type=repository, nargs='?', default=normpath(join(dirname(abspath(sys.argv[0])),'../..')), help='path to the project repository directory')
    try:
        main(argParser.parse_args())
    except KeyboardInterrupt:
        print "\nAbort"
        sys.exit(0)