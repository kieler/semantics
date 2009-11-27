<?xml version="1.0" encoding="UTF-8"?>
<core:Model xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:application="org.eclipse.jwt/application" xmlns:core="org.eclipse.jwt/core" xmlns:data="org.eclipse.jwt/data" xmlns:organisations="org.eclipse.jwt/organisations" xmlns:processes="org.eclipse.jwt/processes" name="Workflow" author="" version="" fileversion="0.6.0">
  <subpackages name="Applications">
    <ownedComment text="The standard package for applications"/>
  </subpackages>
  <subpackages name="Roles">
    <ownedComment text="The standard package for roles"/>
  </subpackages>
  <subpackages name="Data">
    <ownedComment text="The standard package for data"/>
    <subpackages name="Datatypes">
      <ownedComment text="The standard package for datatypes"/>
      <elements xsi:type="data:DataType" name="URL"/>
      <elements xsi:type="data:DataType" name="dioParameter"/>
      <elements xsi:type="data:DataType" name="qualifier"/>
      <elements xsi:type="data:DataType" name="searchquery"/>
      <elements xsi:type="data:DataType" name="filename"/>
    </subpackages>
  </subpackages>
  <elements xsi:type="processes:Activity" name="Diagram1">
    <ownedComment text="This is a basic activity"/>
    <nodes xsi:type="processes:InitialNode" out="//@elements.0/@edges.0">
      <Location x="180" y="28"/>
    </nodes>
    <nodes xsi:type="processes:Action" name=" output signals := absent " in="//@elements.0/@edges.0" out="//@elements.0/@edges.1">
      <Location x="112" y="70"/>
    </nodes>
    <nodes xsi:type="processes:Action" name=" IO Actors := environment input " in="//@elements.0/@edges.1" out="//@elements.0/@edges.2">
      <Location x="93" y="112"/>
    </nodes>
    <nodes xsi:type="processes:Action" name=" call Ptolemy.iterate() " in="//@elements.0/@edges.2" out="//@elements.0/@edges.3">
      <Location x="122" y="154"/>
    </nodes>
    <nodes xsi:type="processes:Action" name=" search active states " in="//@elements.0/@edges.3" out="//@elements.0/@edges.4">
      <Location x="125" y="196"/>
    </nodes>
    <nodes xsi:type="processes:Action" name=" iterate output Combine Actors " in="//@elements.0/@edges.4" out="//@elements.0/@edges.5">
      <Location x="96" y="238"/>
    </nodes>
    <nodes xsi:type="processes:FinalNode" in="//@elements.0/@edges.5">
      <Location x="180" y="280"/>
    </nodes>
    <edges source="//@elements.0/@nodes.0" target="//@elements.0/@nodes.1"/>
    <edges source="//@elements.0/@nodes.1" target="//@elements.0/@nodes.2"/>
    <edges source="//@elements.0/@nodes.2" target="//@elements.0/@nodes.3"/>
    <edges source="//@elements.0/@nodes.3" target="//@elements.0/@nodes.4"/>
    <edges source="//@elements.0/@nodes.4" target="//@elements.0/@nodes.5"/>
    <edges source="//@elements.0/@nodes.5" target="//@elements.0/@nodes.6"/>
  </elements>
  <elements xsi:type="application:Application"/>
  <elements xsi:type="organisations:Role"/>
  <elements xsi:type="data:Data"/>
</core:Model>
