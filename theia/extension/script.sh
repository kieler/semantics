#!/bin/bash
sed -i '1s/^/-application\nde.cau.cs.kieler.language.server.LanguageServer\n-noSplash\n/' ./language-server/kieler/kieler.ini
