/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.annotations.xtext

import com.google.inject.Inject
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.xtext.generator.model.TypeReference
import org.eclipse.xtext.xtext.generator.model.project.IXtextProjectConfig

import static org.eclipse.xtext.GrammarUtil.*
import org.eclipse.xtext.util.MergeableManifest

/** 
 * GeneratorNaming for multiple languages in the same plugin.
 * 
 * @author ssm, als
 * @kieler.design 2017-07-27 proposed 
 * @kieler.rating 2017-07-27 proposed yellow 
 */
class KielerGeneratorNaming extends XtextGeneratorNaming {

    @Inject
    IXtextProjectConfig projectConfig

    override getGenericIdeBasePackage(Grammar grammar) {
        return grammar.fixPackage("ide")
    }

    override getEclipsePluginBasePackage(Grammar grammar) {
        return grammar.fixPackage("ui")
    }

    override getEclipsePluginActivator() {
        if (projectConfig instanceof KielerProjectConfig) {
            if (!projectConfig.projectRelatedPackageNames) {
                super.eclipsePluginActivator
            }
            if (projectConfig.grammar.nullOrEmpty) {
                throw new IllegalStateException("Grammar in KielerProjectConfig is not set correctly.")
            }
            val activatorName = projectConfig.grammar.substring(projectConfig.grammar.lastIndexOf('.') + 1).toFirstUpper + 'Activator'
            return new TypeReference(projectConfig.eclipsePlugin.name + '.internal', activatorName)
        } else {
            throw new IllegalStateException(
                "This custom GeneratorNaming requires a KielerProjectConfig as configuration of the GeneratorModule.")
        }
    }

    def String fixPackage(Grammar g, String addition) {
        val String grammarPackageName = getNamespace(g)
        if (projectConfig instanceof KielerProjectConfig) {
            if (projectConfig.baseName.nullOrEmpty) {
                throw new IllegalArgumentException("Base name of KielerProjectConfig not configured.")
            }
            if (grammarPackageName.equals(projectConfig.baseName)) {
                return grammarPackageName + "." + addition
            } else if (grammarPackageName.startsWith(projectConfig.baseName)) {
                return projectConfig.baseName + "." + addition + "." +
                    grammarPackageName.substring(projectConfig.baseName.length + 1)
            } else if (!grammarPackageName.startsWith("org.eclipse")) {
                try {
                    var in = projectConfig.runtime.metaInf.readBinaryFile(projectConfig.runtime.manifest.path)
                    val manifest = new MergeableManifest(in, projectConfig.runtime.manifest.bundleName)
                    val bundles = manifest.mainAttributes.get(MergeableManifest.REQUIRE_BUNDLE) as String
                    var name = grammarPackageName
                    while (name.contains(".") && !bundles.contains(name)) {
                        name = name.substring(0, name.lastIndexOf("."))
                    }
                    if (bundles.contains(name)) {
                        if (name.equals(grammarPackageName)) {
                            return grammarPackageName + "." + addition
                        } else {
                            return name + "." + addition + "." + grammarPackageName.substring(name.length + 1)
                        }
                    }
                } catch (Exception e) {
                    throw new Exception("Can not derive package name for grammar " + grammarPackageName, e)
                }
            } else {
                return grammarPackageName + "." + addition
            }
        } else {
            throw new IllegalStateException(
                "This custom GeneratorNaming requires a KielerProjectConfig as configuration of the GeneratorModule.")
        }
    }
}
