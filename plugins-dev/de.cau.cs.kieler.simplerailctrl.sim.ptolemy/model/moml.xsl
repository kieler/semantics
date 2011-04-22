<?xml version="1.0" encoding="UTF-8" ?>
<!-- KIELER: inserted xslt transformation                    -->
<!-- giving all attributes w/ AnySimpleTyp the type EString  -->
<!-- because in ecore doen't know AnySimpleType nor String   -->

<!--
java -jar saxon9.jar X:\dop_eclipse\testspace\de.cau.cs.kieler.sim.ptolemy\Moml.ecore X:\dop_eclipse\testspace\
de.cau.cs.kieler.sim.ptolemy\moml.xsl > X:\dop_eclipse\testspace\de.cau.cs.kieler.sim.ptolemy\Moml2.ecore

!!! rename Moml2.ecore to Moml.ecore afterwards !!! 
-->


<xsl:stylesheet version = "1.0" 
 	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
 	xmlns:xs="http://www.w3.org/2001/XMLSchema">

    <!-- 
    // copy all attributes and replace AnySimpleType by EString                                     
    -->
	<xsl:template match="/descendant-or-self|eStructuralFeatures|attribute">
   		<xsl:copy>
       		<xsl:copy-of select="@*"/>
    		<xsl:if test="@eType='ecore:EDataType http://www.eclipse.org/emf/2003/XMLType#//AnySimpleType'">
       			<xsl:attribute name="eType">ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString</xsl:attribute>       
	      	</xsl:if>
       		<xsl:apply-templates/>
    	</xsl:copy>
	</xsl:template>

	<xsl:template match="*">
		<xsl:copy>
			<xsl:copy-of select="@*"/>
			<xsl:apply-templates/>
		</xsl:copy>
	</xsl:template>
	
</xsl:stylesheet>
