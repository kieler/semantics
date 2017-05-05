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
# Utility file for reusing functions
# Author: Alexander Schulz-Rosengarten <als@informatik.uni-kiel.de>
#

import re
import argparse
import os
from os.path import isdir, join
from lxml import etree

entities = {
    '"' : '&quot;',
    "'" : '&apos;'
}

def writeXML(xml, file, htmlentities=False):
    """Writes the xml content into the given file.
    IThis includes several adjustments to assure minimal invasive changes to the original file"""
    with open(file, 'w') as f:
        f.write('<?xml version="1.0" encoding="UTF-8"?>\n') # etree creates a ugly xml decl
        if htmlentities:
            # replace all entities in text
            for element in xml.getroot().iter():
                if isinstance(element.tag, basestring) and element.text:
                    for entity in entities:
                        element.text = element.text.replace(entity, entities[entity])
            # serialize xml
            serialized = etree.tostring(xml, encoding='UTF-8', pretty_print=True, xml_declaration=False)
            # fix &amp in entities due to serialization
            entitiyPattern = re.compile(ur'&amp;[#\w\w\w;|'+'|'.join([e[1:] for e in entities.values()])+ur']', re.UNICODE)
            serialized = entitiyPattern.sub(lambda x: u'&' + x.group()[5:], serialized.decode('UTF-8'), re.UNICODE).encode('UTF-8')
            f.write(serialized)
        else:
            xml.write(f, encoding='UTF-8', pretty_print=True, xml_declaration=False)


def pause(args):
    """Pauses for user confirmation"""
    if not args.nonstop:
        raw_input('Press Enter to continue...')


def repository(path):
    """Checks if the given command line argument is a valid repository"""
    if not isdir(path):
        raise argparse.ArgumentTypeError("%s is not a valid path" % path)
    if not isdir(join(path, '.git')):
        raise argparse.ArgumentTypeError("%s is not a git repository" % path)
    if os.access(path, os.R_OK):
        return path
    else:
        raise argparse.ArgumentTypeError("%s is not a readable directory" % path)