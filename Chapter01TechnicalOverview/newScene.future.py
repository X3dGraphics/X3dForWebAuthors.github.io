from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
# Authors need to replace asterisked values or delete unneeded meta tags as appropriate 
    .addMeta(meta() \
     .setContent("*enter FileNameWithNoAbbreviations.x3d here*") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("*enter description here, short-sentence summaries preferred*") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("*enter name of original author here*") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("*if manually translating VRML-to-X3D, enter name of person translating here*") \
     .setName("translator") \
    ) \
    .addMeta(meta() \
     .setContent("*enter date of initial version here*") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("*enter date of translation here*") \
     .setName("translated") \
    ) \
    .addMeta(meta() \
     .setContent("*enter date of latest revision here*") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("*enter version here, if any*") \
     .setName("version") \
    ) \
    .addMeta(meta() \
     .setContent("*enter reference citation or relative/online url here*") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("*enter additional url/bibliographic reference information here*") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("*enter reference resource here if required to support function, delivery, or coherence of content*") \
     .setName("requires") \
    ) \
    .addMeta(meta() \
     .setContent("*enter copyright information here* Example: Copyright (c) Web3D Consortium Inc. 2006 to present") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("*enter drawing filename/url here*") \
     .setName("drawing") \
    ) \
    .addMeta(meta() \
     .setContent("*enter image filename/url here*") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("*enter movie filename/url here*") \
     .setName("MovingImage") \
    ) \
    .addMeta(meta() \
     .setContent("*enter photo filename/url here*") \
     .setName("photo") \
    ) \
    .addMeta(meta() \
     .setContent("*enter subject keywords here*") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("*enter permission statements or url here*") \
     .setName("accessRights") \
    ) \
    .addMeta(meta() \
     .setContent("*insert any known warnings, bugs or errors here*") \
     .setName("warning") \
    ) \
    .addMeta(meta() \
     .setContent("*enter online Uniform Resource Identifier (URI) or Uniform Resource Locator (URL) address for this file here*") \
     .setName("identifier") \
    ) \
    .addMeta(meta() \
     .setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit") \
     .setName("generator") \
    ) \
    .addMeta(meta() \
     .setContent("../license.html") \
     .setName("license") \
    ) \
# Additional authoring resources for meta tags: http://www.dublincore.org/documents/dcmi-terms http://www.dublincore.org/documents/dces https://www.w3.org/TR/html5/document-metadata.html#the-meta-element http://www.w3.org/TR/html4/struct/global.html#h-7.4.4 http://vancouver-webpages.com/META http://vancouver-webpages.com/META/about-mk-metas2.html 
# Additional authoring resources for language codes: https://tools.ietf.org/html/bcp47 http://www.loc.gov/standards/iso639-2/langhome.html http://www.iana.org/numbers.html#index_L 
   ) \
   .setScene(Scene() \
# Scene graph nodes are added here 
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter01TechnicalOverview//newScene_RoundTrip.x3d")
