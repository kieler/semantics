RUISECONTROL     #
########################


1. WHAT DO ALL THE FILES MEAN
2. WHAT TO DO TO GENERATE A NEW CC PROJECT



#############################################################################################################################
1. WHAT DO ALL THE FILES MEAN:
 - dir: "artifacts" = results of the builds, that need to be published or accessible from tomcat
 - dir: "checkout"  = contains the working copies of the projects from version control
 - dir: "logs"      = contains a folder for each project, holding the logfiles for each run of the cc-loop
 - file: "build-<project>.xml" = the delegating builscript for <project> calling the projects build.xml 
         in the checkout/<project> directory, and is called by CC from the "schedule"-section in the config.xml
 - file: "clean.sh" = removes all logs and arifacts and *.ser files that are created by the cc-build-loop.
 - dir: "artifacts/updatesite" = the general updatesite that will have the plugins in it. Plugin-jars will be copied here
 - files: "*.ser" cc specific serialization files r generated while first cc-build-loop is running
 - file: "config.xml" = the configuration file to configure cc. containing the project definitions and what is to be done for each project


2. WHAT TO DO TO GENERATE A NEW CC PROJECT:

 -copy one of the "build-<oldproject>.xml files to new file "build-<newprject>.xml
 -insert a new section in the config.xml (e.g. by copying another section)
 -set all the values inside the two files for the new project definitions
 -checkout the new project from svn into the checkout dir the directory generated will be the projects basedir
 -generate an ant build script fr the project inside the basedir
 -when using eclipse to generate the ant file make sure the compiler settings are correct (e.g. javaversion)
 -iti makes sense to check in the ant build file as well with the project, since all changes will be effective as
  soon as CC updates its working dir for that project
 -when using eclipse to genrate the ant build file make also sure that the paths to the aditional libs are correct, eclipse
  usually sets them relative to the workspace on your drive.
