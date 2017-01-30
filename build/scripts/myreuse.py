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

def pause(args):
    if not args.nonstop:
        raw_input('Press Enter to continue...')


def restoreHTMLentities(text):
    entities = {
        '"' : '&quot;',
        "'" : '&apos;'
    }
    cdataPattern = re.compile(r'>[^<]*<')
    entityPattern = re.compile(r'(' + '|'.join(entities.keys()) + r')')
    return cdataPattern.sub(lambda x: entityPattern.sub(lambda y: entities[y.group()], x.group()), text)


def repository(path):
    if not isdir(path):
        raise argparse.ArgumentTypeError("%s is not a valid path" % path)
    if not isdir(join(path, '.git')):
        raise argparse.ArgumentTypeError("%s is not a git repository" % path)
    if os.access(path, os.R_OK):
        return path
    else:
        raise argparse.ArgumentTypeError("%s is not a readable directory" % path)