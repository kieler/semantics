package de.cau.cs.kieler.prom.launchconfig

import de.cau.cs.kieler.prom.common.FileCompilationData

interface IWrapperCodeGenerator {

    def void generateWrapperCode(FileCompilationData... datas)
    
    def LaunchConfiguration getLaunchConfiguration()
    def void setLaunchConfiguration(LaunchConfiguration value)
}