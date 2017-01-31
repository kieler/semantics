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

entities = {
    '"' : '&quot;',
    "'" : '&apos;'
}

def pause(args):
    if not args.nonstop:
        raw_input('Press Enter to continue...')


def restoreHTMLentities(xml):
    for element in xml.getroot().iter():
        if isinstance(element.tag, basestring) and element.text:
            for entity in entities:
                element.text = element.text.replace(entity, entities[entity])

def fixHTMLentities(text):
    cdataPattern = re.compile(ur'&amp;[#\w\w\w;|'+'|'.join([e[1:] for e in entities.values()])+ur']', re.UNICODE)
    return cdataPattern.sub(lambda x: u'&' + x.group()[5:], text.decode('UTF-8'), re.UNICODE).encode('UTF-8')


def repository(path):
    if not isdir(path):
        raise argparse.ArgumentTypeError("%s is not a valid path" % path)
    if not isdir(join(path, '.git')):
        raise argparse.ArgumentTypeError("%s is not a git repository" % path)
    if os.access(path, os.R_OK):
        return path
    else:
        raise argparse.ArgumentTypeError("%s is not a readable directory" % path)