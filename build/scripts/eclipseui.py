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
# This script checks plugins and produces error if non eclipse-ui plugins use banned eclipse features or have dependencies to eclipse-ui plugins.
# Author: Alexander Schulz-Rosengarten <als@informatik.uni-kiel.de>
#

from __future__ import print_function # python3 print

import os
import sys
import re
import argparse
import xml.etree.ElementTree as ET
from os.path import isfile, isdir, join, abspath, relpath, normpath

PROJECT_PREFIX = 'de.cau.cs.kieler'
DEP_FILE = 'dependencies.txt'
UI_PROPERTY = 'Eclipse-UI'
UI_REGEX = '.*\\.ui'
BANNED_REGEX = '.*\\.ui'
BANNED = []
TOLERATED_EXTENSIONS = ['org.eclipse.emf.ecore.generated_package','org.eclipse.core.runtime.applications']

def main(args):
    print('-- Checking plugin dependencies --')

    failed = []
    plugins = args.path
    if not isdir(plugins):
        stop('%s is not a directory' % plugins)

    isUI = re.compile(UI_REGEX)
    deps = {}
    for plugin in sorted(os.listdir(plugins)):
        base = join(plugins, plugin)
        if plugin.startswith(PROJECT_PREFIX) and isdir(base) and isfile(join(base, '.project')):
            print('Checking %s' % plugin)
            # Determine if it is a UI plugin
            ui = None
            # Check if there is a property in the manifest
            try:
                manifest = join(base, 'META-INF', 'MANIFEST.MF')
                if isfile(manifest):
                    with open(manifest, 'r') as f:
                        for line in f.readlines():
                            if line.startswith(UI_PROPERTY):
                                ui = line.split(':')[1].strip().lower() == 'true'
            except:
                pass # ignore

            # If not, match plugin id
            if ui is None:
                ui = isUI.match(plugin)

            # Perform checks
            if ui:
                print(' - Eclipse UI plugin. No constraints.')
            else:
                xmlOK = checkPluginXml(base, args)
                deps[plugin] = readDependencies(base, args)
                depsOK = checkDependencies(deps[plugin], base, args)
                if not (xmlOK and depsOK):
                    failed.append(plugin)
                else:
                    print(' - OK')

    # report
    if len(failed):
        print('%s The following non-eclipse-ui plugins do not comply with the defined requirements:' % ('[WARNING]' if args.warn else '[ERROR]'))
        for fail in failed:
            print(' - %s' % fail)
            for dep in [dep for dep in deps[fail] if dep in failed]:
                print(' --- possibly transient due to %s' % dep)

    # indicate error
    if not args.warn and len(failed):
        sys.exit(1)

def readDependencies(base, args):
    deps = []
    filepath = join(base, DEP_FILE)
    if isfile(filepath):
        with open(filepath, 'r') as file:
            for line in file.readlines()[1:]:
                deps.append(line.split(':')[1])
    else:
        print(' - Missing dependencies file (%s)' % DEP_FILE)
    return deps

def checkDependencies(deps, base, args):
    isBanned = re.compile(BANNED_REGEX)
    success = True #isfile(join(base, DEP_FILE)) # no error if dependencies not available
    for dep in deps:
        if isBanned.match(dep) or dep in BANNED:
            print(' - Has (possibly transient) dependency to banned plugin: %s' % dep)
            success = False
    return success

def checkPluginXml(base, args):
    success = True
    path = join(base, 'plugin.xml')
    if isfile(path):
        root = ET.parse(path).getroot()
        for elem in root:
            if elem.tag == 'extension':
                if not 'point' in elem.attrib or elem.attrib['point'] not in TOLERATED_EXTENSIONS:
                    print(' - Uses banned extension point: %s' % (elem.attrib['point'] if 'point' in elem.attrib else 'unknown'))
                    success = False
            elif elem.tag == 'extension-point':
                print(' - Provides banned eclipse extension-point: %s' % (elem.attrib['id'] if 'id' in elem.attrib else 'unknown'))
                success = False
            else:
                print(' - Uses plugin.xml for unknown but banned registration in eclipse (%s).' % elem.tag)
                success = False
    return success

def stop(msg):
    errPrint('[ERROR] ' + msg)
    sys.exit(2)

def errPrint(*args, **kwargs):
    print(*args, file=sys.stderr, **kwargs)


if __name__ == "__main__":
    argParser = argparse.ArgumentParser(description='This script checks plugins and produces error if non eclipse-ui plugins use banned eclipse features or have dependencies to eclipse-ui plugins.')
    argParser.add_argument('-w' , '--warn', dest='warn', action="store_true", help='produce only warings instead of errors')
    argParser.add_argument('path', help='path to the folder containing the plugins to check')
    try:
        main(argParser.parse_args())
    except KeyboardInterrupt:
        print('\nAbort')
        sys.exit(0)