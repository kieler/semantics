<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<!-- This xslt script fixes the repositories references of the category.xml which should appear in the content.xml-->

<xsl:template match="node()|@*">
   <xsl:copy>
     <xsl:apply-templates select="node()|@*"/>
   </xsl:copy>
</xsl:template>

<xsl:template match="repository">
  <xsl:copy>
    <xsl:copy-of select="@*" />
    <xsl:apply-templates select="node()|@*"/>

    <!-- Adds two repository entries (normal and source repository) for each of the repositories defined in the category.xml -->
    <xsl:element name="references">
      <xsl:attribute name="size">
        <xsl:value-of select="count(document('category.xml')/site/repository-reference) * 2" />
      </xsl:attribute>
      <xsl:for-each select="document('category.xml')/site/repository-reference">
        <xsl:element name="repository">
          <xsl:attribute name="options">1</xsl:attribute>
          <xsl:attribute name="type">0</xsl:attribute>
          <xsl:attribute name="uri">
            <xsl:value-of select="@location" />
          </xsl:attribute>
          <xsl:attribute name="url">
            <xsl:value-of select="@location" />
          </xsl:attribute>
        </xsl:element>
        <xsl:element name="repository">
          <xsl:attribute name="options">1</xsl:attribute>
          <xsl:attribute name="type">1</xsl:attribute>
          <xsl:attribute name="uri">
            <xsl:value-of select="@location" />
          </xsl:attribute>
          <xsl:attribute name="url">
            <xsl:value-of select="@location" />
          </xsl:attribute>
        </xsl:element>
      </xsl:for-each>
    </xsl:element>
  </xsl:copy>
</xsl:template>

</xsl:stylesheet> 