#!/bin/bash

# Copy all highlighting files in semantic plugin that are named XXX-monaco-language.ts in the corresponding Theia extension
find ./semantics/plugins -name '*monaco-language.ts' -exec cp {} ./semantics/theia/extension/keith-language/src/browser/ \;