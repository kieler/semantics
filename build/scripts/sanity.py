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
from os.path import join, isdir, isfile, normpath, dirname, abspath
from reuse import *

PROJECT_PREFIX = 'de.cau.cs.kieler'

def main(args):
    print '- Checking Plugins -\n'

    for pluginFolder in ['plugins', 'test']:
        # check pluging path
        plugins = join(args.path, pluginFolder)
        if not isdir(plugins):
            print '%s is not an directory' % plugins
            pause(args)
        else:
            for project in sorted(os.listdir(plugins)):
                project_path = join(plugins, project)
                if project.startswith(PROJECT_PREFIX) and isdir(project_path) and isfile(join(project_path, '.project')):
                    try:
                        print project
                        checkBuildProperties(project_path, args)
                    except KeyboardInterrupt as ki:
                        raise ki
                    except Exception as ex:
                        print '-- An error occuured!'
                        print '-- %s' % ex
                        traceback.print_exc()
                        pause(args)

    print '\n= Finished Sanity Checks ='


def checkBuildProperties(directory, args):
    build_properties = join(directory, 'build.properties')
    if isfile(build_properties):
        with open(build_properties, 'r') as f:
            content = f.read()
            if isfile(join(directory, 'plugin.xml')) and 'plugin.xml' not in content:
                print '- Build properties do not include the plugin.xml'
                pause(args)
    else: 
        print '- Build properties file does not exist'
        pause(args)


if __name__ == "__main__":
    argParser = argparse.ArgumentParser(description='Check all plugins for some sanity citeria.')
    argParser.add_argument('-nonstop', action='store_true', help='script will not pause (prompt confirmation) if an error or warning occurs')
    argParser.add_argument('path', type=repository, nargs='?', default=normpath(join(dirname(abspath(sys.argv[0])),'../..')), help='path to the project repository directory')
    try:
        main(argParser.parse_args())
    except KeyboardInterrupt:
        print "\nAbort"
        sys.exit(0)