from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("PixelTextureGaribaldi.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("The Garibaldi with a PixelTexture instead of a file texture.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Ildeniz Duman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("1 June 1998") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("29 March 2009") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Garibaldi.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/PixelTextureGaribaldi.x3d") \
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
   ) \
   .setScene(Scene() \
    .addChild(ExternProtoDeclare() \
     .setName("CircleFishPT") \
     .setUrl(["CircleFishPTPrototype.x3d#CircleFishPT","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFishPTPrototype.x3d#CircleFishPT","CircleFishPTPrototype.wrl#CircleFishPT","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFishPTPrototype.wrl#CircleFishPT"]) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("skinPixelTexture") \
      .setType("SFImage") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("fishScale") \
      .setType("SFVec3f") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("fishColor") \
      .setType("SFColor") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("finColor") \
      .setType("SFColor") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("positionKey") \
      .setType("MFFloat") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("positionKeyValue") \
      .setType("MFVec3f") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("orientationKey") \
      .setType("MFFloat") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("orientationKeyValue") \
      .setType("MFRotation") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("orbitTime") \
      .setType("SFTime") \
     ) \
    ) \
    .addChild(ExternProtoDeclare() \
     .setName("CircleFish") \
     .setUrl(["CircleFishPrototype.x3d#CircleFish","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFishPrototype.x3d#CircleFish","CircleFishPrototype.wrl#CircleFish","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFishPrototype.wrl#CircleFish"]) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("skinTextureUrl") \
      .setType("MFString") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("fishScale") \
      .setType("SFVec3f") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("fishColor") \
      .setType("SFColor") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("finColor") \
      .setType("SFColor") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("positionKey") \
      .setType("MFFloat") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("positionKeyValue") \
      .setType("MFVec3f") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("orientationKey") \
      .setType("MFFloat") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("orientationKeyValue") \
      .setType("MFRotation") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("orbitTime") \
      .setType("SFTime") \
     ) \
    ) \
    .addChild(Background() \
     .setSkyColor([1,1,1]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Book View") \
     .setOrientation([0,1,0,0.229]) \
     .setPosition([0.62,0.03,1.28]) \
    ) \
    .addChild(Transform() \
     .setTranslation([-.3,.3,0]) \
     .addChild(ProtoInstance() \
      .setName("CircleFishPT") \
      .addFieldValue(fieldValue() \
       .setName("skinPixelTexture") \
       .setValue("12 7 3 0xEFAA55 0xF9BD5B 0xFCC55A 0xFCC75D 0xFCC75A 0xFCC859 0xFBCB5B 0xFCCA5C 0xFDCF5E 0xFCD263 0xFDD76C 0xF2CD77 0xF4B356 0xF9BE58 0xFBC458 0xFBC558 0xFCC75A 0xFCCA5B 0xFCCC60 0xFDCF5C 0xFDCF5E 0xFDD05D 0xFDD15E 0xFDD060 0xF5B655 0xF9C056 0xF8BD53 0xFABE54 0xFABF53 0xFBC254 0xFBC353 0xFBC453 0xFBC555 0xFBC753 0xFBC855 0xFDCC5A 0xF9C659 0xF6BE54 0xF4B954 0xF2B651 0xF2B752 0xF5BC53 0xF6BF50 0xFAC452 0xFBC753 0xFAC551 0xF9C753 0xF5BE53 0xF1B453 0xEFB253 0xEBAB52 0xEBAA53 0xECAD50 0xF0B24F 0xF3B84E 0xF7BF51 0xF8C453 0xF9C955 0xF7C453 0xF5BB54 0xE3A152 0xDE9B53 0xDE9C55 0xE09C52 0xE5A251 0xE9A950 0xF1AD50 0xF2AD51 0xF5BA50 0xF5BF53 0xF9C455 0xF5C557 0xB07950 0xB3784F 0xBB7C4F 0xC4824F 0xD28C4E 0xE18C4E 0xE47C4A 0xE17B4C 0xDC844A 0xE5954D 0xF2B550 0xF4C354") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("fishScale") \
       .setValue("1.0 0.39 0.4") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("finColor") \
       .setValue("0.9 0.66 0.4") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("fishColor") \
       .setValue(".97 .75 .3") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("positionKey") \
       .setValue("0.0 0.4 0.7 0.95 1.0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("positionKeyValue") \
       .setValue("0.0 0.0 0.0 0.5 0.0 0.0 0.0 0.0 0.0 0.5 0.0 0.0 0.2 0.0 0.0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("orientationKey") \
       .setValue("0.0 1.0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("orientationKeyValue") \
       .setValue("0.0 1.0 0.0 90.0 0.0 1.0 0.0 90.0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("orbitTime") \
       .setValue("80.0") \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([.3,.3,0]) \
     .addChild(ProtoInstance() \
      .setName("CircleFishPT") \
      .addFieldValue(fieldValue() \
       .setName("skinPixelTexture") \
       .setValue("8 8 1 0xcc 0x00 0xcc 0x00 0xcc 0x00 0xcc 0x00 0x00 0xcc 0x00 0xcc 0x00 0xcc 0x00 0xcc 0xcc 0x00 0xcc 0x00 0xcc 0x00 0xcc 0x00 0x00 0xcc 0x00 0xcc 0x00 0xcc 0x00 0xcc 0xcc 0x00 0xcc 0x00 0xcc 0x00 0xcc 0x00 0x00 0xcc 0x00 0xcc 0x00 0xcc 0x00 0xcc 0xcc 0x00 0xcc 0x00 0xcc 0x00 0xcc 0x00 0x00 0xcc 0x00 0xcc 0x00 0xcc 0x00 0xcc") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("fishScale") \
       .setValue("1.0 0.39 0.4") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("finColor") \
       .setValue("0.9 0.66 0.4") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("fishColor") \
       .setValue(".97 .75 .3") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("positionKey") \
       .setValue("0.0 0.4 0.7 0.95 1.0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("positionKeyValue") \
       .setValue("0.0 0.0 0.0 0.5 0.0 0.0 0.0 0.0 0.0 0.5 0.0 0.0 0.2 0.0 0.0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("orientationKey") \
       .setValue("0.0 1.0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("orientationKeyValue") \
       .setValue("0.0 1.0 0.0 90.0 0.0 1.0 0.0 90.0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("orbitTime") \
       .setValue("80.0") \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([-.3,-.3,0]) \
     .addChild(ProtoInstance() \
      .setName("CircleFishPT") \
      .addFieldValue(fieldValue() \
       .setName("skinPixelTexture") \
       .setValue("2 4 3 0xff0000 0xffff00 0x007700 0xff0077 0x0000ff 0xff7700 0x00ff77 0x888888") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("fishScale") \
       .setValue("1.0 0.39 0.4") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("finColor") \
       .setValue("0.9 0.66 0.4") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("fishColor") \
       .setValue(".97 .75 .3") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("positionKey") \
       .setValue("0.0 0.4 0.7 0.95 1.0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("positionKeyValue") \
       .setValue("0.0 0.0 0.0 0.5 0.0 0.0 0.0 0.0 0.0 0.5 0.0 0.0 0.2 0.0 0.0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("orientationKey") \
       .setValue("0.0 1.0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("orientationKeyValue") \
       .setValue("0.0 1.0 0.0 90.0 0.0 1.0 0.0 90.0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("orbitTime") \
       .setValue("80.0") \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([.3,-.3,0]) \
     .addChild(ProtoInstance() \
      .setName("CircleFish") \
      .addFieldValue(fieldValue() \
       .setName("skinTextureUrl") \
       .setValue("\"GaribaldiPatch.jpg\" \"http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/GaribaldiPatch.jpg\"") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("fishScale") \
       .setValue("1.0 0.39 0.4") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("finColor") \
       .setValue("0.9 0.66 0.4") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("fishColor") \
       .setValue(".97 .75 .3") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("positionKey") \
       .setValue("0.0 0.4 0.7 0.95 1.0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("positionKeyValue") \
       .setValue("0.0 0.0 0.0 0.5 0.0 0.0 0.0 0.0 0.0 0.5 0.0 0.0 0.2 0.0 0.0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("orientationKey") \
       .setValue("0.0 1.0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("orientationKeyValue") \
       .setValue("0.0 1.0 0.0 90.0 0.0 1.0 0.0 90.0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("orbitTime") \
       .setValue("80.0") \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures//PixelTextureGaribaldi_RoundTrip.x3d")
