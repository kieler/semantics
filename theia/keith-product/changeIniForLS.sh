#!/bin/bash

# Adds the following to the kieler.ini of the language server to run without UI
# -application
# de.cau.cs.kieler.language.server.LanguageServer
#--noSplash
sed -i '1s/^/-application\nde.cau.cs.kieler.language.server.LanguageServer\n-noSplash\n/' ./language-server/kieler.ini
