#!/bin/bash

find ./semantics/plugins -name '*monaco-language.ts' -exec cp {} ./semantics/theia/extension/keith-language/src/browser/ \;
find ./pragmatics/plugins -name '*monaco-language.ts' -exec cp {} ./semantics/theia/extension/keith-language/src/browser/ \;