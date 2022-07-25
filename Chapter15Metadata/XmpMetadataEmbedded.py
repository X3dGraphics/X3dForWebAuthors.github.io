####################################################################################################
#
# Now available: developmental python x3d.py package on PyPi for import.
#   This approach simplifies Python X3D deployment and use.
#   https://pypi.org/project/x3d
#
# Installation:
#       pip install x3d
# or
#       python -m pip install x3d
#
# Developer options for loading x3d package:
#
#    from x3d import *  # preferred approach, terser source that avoids x3d.* class prefixes
#
# or
#    import x3d         # traditional way to subclass x3d package, all classes require x3d.* prefix,
#                       # but python source is very verbose, for example x3d.Material x3d.Shape etc.
#                       # X3dToPython.xslt stylesheet insertPackagePrefix=true supports this option.
#
####################################################################################################

from x3d import *

newModel=X3D(profile='Immersive',version='4.0',
  head=head(
    children=[
    #  of note is that name values for these document meta terms are defined by Dublin Core 
    meta(content='XmpMetadataEmbedded.x3d',name='title'),
    meta(content='Simple XMP sidecar example: Hello XMP metadata!',name='description'),
    meta(content='29 April 2021',name='created'),
    meta(content='21 February 2022',name='revised'),
    meta(content='Don Brutzman, Vince Marchetti, Jakub Flotynski, Dick Puk',name='creator'),
    meta(content='Source model assumes default containerField=value for X3D4 Metadata nodes, specification resolution needed',name='warning'),
    meta(content='Summary presentation XmpMetadataSupportX3D.pptx',name='reference'),
    meta(content='XmpMetadataSidecar.xml',name='reference'),
    meta(content='XmpMetadataSidecar.rdf',name='reference'),
    meta(content='XmpMetadataSidecar.ttl',name='reference'),
    meta(content='Protege https://protege.stanford.edu',name='generator'),
    meta(content='XmpMetadataEmbeddedX3dComparison.png',name='Image'),
    meta(content='https://www.web3d.org/specifications/X3Dv4Draft/ISO-IEC19775-1v4-CD1/Part01/components/core.html#MetadataSet',name='reference'),
    #  Wikipedia example RDF XML plus Protege conversion to Turtle .ttl 
    meta(content='XmpMetadataExampleWikipedia.xml',name='reference'),
    meta(content='XmpMetadataExampleWikipedia.ttl',name='reference'),
    meta(content='https://wwwimages2.adobe.com/content/dam/acom/en/devnet/xmp/pdfs/XMP%20SDK%20Release%20cc-2016-08/XMPSpecificationPart1.pdf',name='reference'),
    meta(content='Once pattern OK, write conversion stylesheets XmpToX3dMetadata.xslt and X3dMetadataToXmp.xslt',name='TODO'),
    meta(content='X3D support for xml:lang attribute not provided in X3D XML Schema, instead use MetadataString as best practice.',name='info'),
    meta(content='Wikipedia XMP https://en.wikipedia.org/wiki/Extensible_Metadata_Platform',name='reference'),
    meta(content='Wikipedia Metadata https://en.wikipedia.org/wiki/Metadata',name='reference'),
    meta(content='https://en.wikipedia.org/wiki/Sidecar',name='reference'),
    meta(content='https://experienceleague.adobe.com/docs/experience-manager-64/assets/administer/xmp.html',name='reference'),
    meta(content='https://en.wikipedia.org/wiki/Ontology_for_Media_Resources',name='reference'),
    meta(content='https://en.wikipedia.org/wiki/Multimedia_Web_Ontology_Language',name='reference'),
    meta(content='W3C Ontology for Media Resources 1.0 https://www.w3.org/TR/mediaont-10',name='reference'),
    meta(content='ISO XMP ISO 16684-1:2019Part 1: Data model, serialization and core properties https://www.iso.org/standard/75163.html',name='reference'),
    meta(content='ISO XMP 16684-2:2014 Part 2: Description of XMP schemas using RELAX NG https://www.iso.org/standard/57422.html',name='reference'),
    meta(content='Adobe XMP https://www.adobe.com/devnet/xmp.html',name='reference'),
    meta(content='Adobe XMP https://www.adobe.com/products/xmp.html',name='reference'),
    meta(content='ExifTool XMP Tags https://exiftool.org/TagNames/XMP.html',name='reference'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter15Metadata/XmpMetadataEmbedded.x3d',name='identifier'),
    meta(content='https://www.web3d.org/x3d/content/examples/license.html',name='license'),
    meta(content='X3D-Edit 4.0, https://savage.nps.edu/X3D-Edit',name='generator')]),
  Scene=Scene(
    #  Design considerations: 
    #  a. avoid containerField='metadata' and containerField='value' wherever possible, note X3D4 XML schema revision is needed 
    #  b. literal XMP values wherever possible, lossless 
    #  c. avoid nested quotes/apostrophes by using MetadataString name/value pairs 
    #  d. map XMP parent elements to MetadataSet, otherwise have typed Metadata* values wherever possible 
    #  e. push shared properties as high as possible in MetadataSet hierarchy, since they apply to all children 
    #  f. assumptions: unquoted MFString values equal a single SFString array element, default Metadata* node containerField='value' 
    #  g. MetadataSet nodes contain other Metadata* nodes as the /value/ field, thus producing tree-like structured metadata information 
    children=[
    WorldInfo(title='XmpMetadataEmbedded.x3d'),
    Background(skyColor=[(0,0.439216,0.760784)]),
    #  Sample (partial) XMP sidecar file XmpMetadataSidecar.xml generated manually by Vince Marchetti as part of the STEP Geometry Services Pilot Project 
    MetadataSet(name='rdf:RDF',reference='TODO refer to XMP ISO specification document',
      value=[
      MetadataSet(name='namespaces',
        value=[
        MetadataString(name='xmlns:rdf',value=['http://www.w3.org/1999/02/22-rdf-syntax-ns#']),
        MetadataString(name='xmlns:dc',value=['http://purl.org/dc/elements/1.1/']),
        MetadataString(name='xmlns:xmp',value=['http://ns.adobe.com/xap/1.0/'])]),
      MetadataSet(name='rdf:Description',
        value=[
        MetadataString(name='rdf:about',value=['https://kshell.com/sgs/example_uri_0001/']),
        MetadataSet(name='dc:description',
          value=[
          MetadataSet(name='rdf:Alt',
            value=[
            MetadataString(name='rdf:li',value=['VRML visualization'],
              #  discouraging direct use of xml:lang='en' as an attribute, since that is legal XML but invalid X3D 
              metadata=MetadataString(name='xml:lang',reference='prefer using MetadataString to indicate xml:lang values',value=['en']))])]),
        MetadataString(name='dc:format',value=['model/x3d-vrml']),
        MetadataString(name='dc:rights',value=[""]),
        MetadataSet(name='dc:title',
          value=[
          MetadataSet(name='rdf:Alt',
            value=[
            MetadataString(name='rdf:li',reference="xml:lang='en'",value=['l-bracket_20120725.134815'],
              metadata=MetadataString(name='xml:lang',value=['en'])),
            MetadataString(name='rdf:li',reference="xml:lang='gr'",value=['aristsirra-bracket_20120725.134815'],
              metadata=MetadataString(name='xml:lang',reference='prefer using MetadataString to indicate xml:lang values',value=['en']))]),
          MetadataSet(name='dc:creator',
            value=[
            MetadataSet(name='rdf:Seq',
              value=[
              MetadataString(name='rdf:li',value=['vmarchetti@kshell.com'])])]),
          MetadataString(name='xmp:CreateDate',value=['2021-2-10'])])])]),
    Viewpoint(description='View scene source to see metadata examples',position=(0,0,9)),
    Anchor(description='Load scene index page',parameter=["target=_blank"],url=["XmpMetadataEmbeddedIndex.html","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter15Metadata/XmpMetadataEmbeddedIndex.html"],
      children=[
      Shape(
        geometry=Text(string=["View scene source","to see","XmpMetadataEmbedded","example"],
          fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"])),
        appearance=Appearance(
          material=Material(diffuseColor=(1,0.992157,0.039216))))])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for XmpMetadataEmbedded.py:')
if        metaDiagnostics(newModel): # built-in utility method in X3D class
    print(metaDiagnostics(newModel)) # display meta info, hint, warning, error, TODO values in this model
# print('check newModel.XML() serialization...')
newModelXML= newModel.XML() # test export method XML() for exceptions during export
newModel.XMLvalidate()
# print(newModelXML) # diagnostic

try:
#   print('check newModel.VRML() serialization...')
    newModelVRML=newModel.VRML() # test export method VRML() for exceptions during export
    # print(prependLineNumbers(newModelVRML)) # debug
    print("Python-to-VRML export of VRML output successful", flush=True)
except Exception as err: # usually BaseException
    # https://stackoverflow.com/questions/18176602/how-to-get-the-name-of-an-exception-that-was-caught-in-python
    print("*** Python-to-VRML export of VRML output failed:", type(err).__name__, err)
    if newModelVRML: # may have failed to generate
        print(prependLineNumbers(newModelVRML, err.lineno))

try:
#   print('check newModel.JSON() serialization...')
    newModelJSON=newModel.JSON() # test export method JSON() for exceptions during export
#   print(prependLineNumbers(newModelJSON)) # debug
    print("Python-to-JSON export of JSON output successful (under development)")
except Exception as err: # usually SyntaxError
    print("*** Python-to-JSON export of JSON output failed:", type(err).__name__, err)
    if newModelJSON: # may have failed to generate
        print(prependLineNumbers(newModelJSON,err.lineno))

print("python XmpMetadataEmbedded.py load and self-test diagnostics complete.")
