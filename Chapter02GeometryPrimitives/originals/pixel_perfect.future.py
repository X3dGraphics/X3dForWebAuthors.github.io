import classpath

from org.web3d.x3d.jsail.Core.X3DObject import X3DObject as X3D
from org.web3d.x3d.jsail.fields.SFStringObject import SFStringObject as SFString
from org.web3d.x3d.jsail.Core.headObject import headObject as head
from org.web3d.x3d.jsail.Core.metaObject import metaObject as meta
from org.web3d.x3d.jsail.Core.SceneObject import SceneObject as Scene
from org.web3d.x3d.jsail.EnvironmentalEffects.BackgroundObject import BackgroundObject as Background
from org.web3d.x3d.jsail.fields.MFColorObject import MFColorObject as MFColor
from org.web3d.x3d.jsail.Navigation.ViewpointObject import ViewpointObject as Viewpoint
from org.web3d.x3d.jsail.fields.SFFloatObject import SFFloatObject as SFFloat
from org.web3d.x3d.jsail.fields.SFRotationObject import SFRotationObject as SFRotation
from org.web3d.x3d.jsail.fields.SFVec3fObject import SFVec3fObject as SFVec3f
from org.web3d.x3d.jsail.Grouping.TransformObject import TransformObject as Transform
from org.web3d.x3d.jsail.Shape.ShapeObject import ShapeObject as Shape
from org.web3d.x3d.jsail.Shape.AppearanceObject import AppearanceObject as Appearance
from org.web3d.x3d.jsail.Texturing.TextureTransformObject import TextureTransformObject as TextureTransform
from org.web3d.x3d.jsail.fields.SFVec2fObject import SFVec2fObject as SFVec2f
from org.web3d.x3d.jsail.Texturing.ImageTextureObject import ImageTextureObject as ImageTexture
from org.web3d.x3d.jsail.fields.SFBoolObject import SFBoolObject as SFBool
from org.web3d.x3d.jsail.fields.MFStringObject import MFStringObject as MFString
from org.web3d.x3d.jsail.Geometry3D.IndexedFaceSetObject import IndexedFaceSetObject as IndexedFaceSet
from org.web3d.x3d.jsail.fields.MFInt32Object import MFInt32Object as MFInt32
from org.web3d.x3d.jsail.Texturing.TextureCoordinateObject import TextureCoordinateObject as TextureCoordinate
from org.web3d.x3d.jsail.fields.MFVec2fObject import MFVec2fObject as MFVec2f
from org.web3d.x3d.jsail.Rendering.CoordinateObject import CoordinateObject as Coordinate
from org.web3d.x3d.jsail.fields.MFVec3fObject import MFVec3fObject as MFVec3f
from org.web3d.x3d.jsail.PointingDeviceSensor.TouchSensorObject import TouchSensorObject as TouchSensor
from org.web3d.x3d.jsail.PointingDeviceSensor.PlaneSensorObject import PlaneSensorObject as PlaneSensor
from org.web3d.x3d.jsail.Shape.MaterialObject import MaterialObject as Material
from org.web3d.x3d.jsail.fields.SFColorObject import SFColorObject as SFColor
from org.web3d.x3d.jsail.Scripting.ScriptObject import ScriptObject as Script
from org.web3d.x3d.jsail.Core.fieldObject import fieldObject as field
from org.web3d.x3d.jsail.Core.ROUTEObject import ROUTEObject as ROUTE

X3D0 = (X3D().setProfile("Immersive").setVersion("3.1")
      .setHead(head()
        .addMeta(meta().setContent("C:\www.web3d.org\x3d\content\examples\X3dForWebAuthors\Chapter02GeometryPrimitives\originals\pixel_perfect.x3d").setName("title"))
        .addMeta(meta().setContent("*enter description here, short-sentence summaries preferred*").setName("description"))
        .addMeta(meta().setContent("*enter name of original author here*").setName("creator"))
        .addMeta(meta().setContent("*if manually translating VRML-to-X3D, enter name of person translating here*").setName("translator"))
        .addMeta(meta().setContent("*enter date of initial version here*").setName("created"))
        .addMeta(meta().setContent("12 October 2009").setName("translated"))
        .addMeta(meta().setContent("12 October 2009").setName("modified"))
        .addMeta(meta().setContent("*enter version here*").setName("version"))
        .addMeta(meta().setContent("*enter reference citation or relative/online url here*").setName("reference"))
        .addMeta(meta().setContent("*enter additional url/bibliographic reference information here*").setName("reference"))
        .addMeta(meta().setContent("*enter reference resource here if required to support function, delivery, or coherence of content*").setName("requires"))
        .addMeta(meta().setContent("*enter copyright information here* Example: Copyright (c) Web3D Consortium Inc. 2006").setName("rights"))
        .addMeta(meta().setContent("*enter drawing filename/url here*").setName("drawing"))
        .addMeta(meta().setContent("*enter image filename/url here*").setName("image"))
        .addMeta(meta().setContent("*enter movie filename/url here*").setName("MovingImage"))
        .addMeta(meta().setContent("*enter photo filename/url here*").setName("photo"))
        .addMeta(meta().setContent("*enter subject keywords here*").setName("subject"))
        .addMeta(meta().setContent("*enter permission statements or url here*").setName("accessRights"))
        .addMeta(meta().setContent("*insert any known warnings, bugs or errors here*").setName("warning"))
        .addMeta(meta().setContent("http://*enter online url address for this file here*/C:\www.web3d.org\x3d\content\examples\X3dForWebAuthors\Chapter02GeometryPrimitives\originals\pixel_perfect.x3d").setName("identifier"))
        .addMeta(meta().setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html").setName("generator"))
        .addMeta(meta().setContent("../license.html").setName("license")))
      .setScene(Scene()
        .addChild(Background().setSkyColor([1.0,1.0,1.0]))
        .addChild(Viewpoint().setDEF("home").setDescription("home").setFieldOfView(1.4).setOrientation(0.0,1.0,0.0,0.35).setPosition(0.0,1.25,5.0))
        .addChild(Viewpoint().setDEF("byz").setDescription("Byzantine Astronomical Data").setFieldOfView(0.785398).setPosition(0.0,1.0,2.829157))
        .addChild(Transform().setTranslation(0.0,1.0,0.0)
          .addChild(Shape()
            .setAppearance(Appearance()
              .setTextureTransform(TextureTransform().setDEF("tt").setCenter(0.0,0.0).setRotation(0.0).setTranslation(0.0,0.0))
              .setTexture(ImageTexture().setRepeatS(False).setRepeatT(False).setUrl(["byz_small.jpg"])))
            .setGeometry(IndexedFaceSet().setDEF("page0").setCoordIndex([0,1,2,3,-1]).setSolid(False).setTexCoordIndex([0,1,2,3,-1])
              .setTexCoord(TextureCoordinate().setPoint([0.0,0.5,0.0,1.0,1.0,1.0,1.0,0.5]))
              .setCoord(Coordinate().setPoint([-1.0,-1.0,0.0,-1.0,1.0,0.0,1.0,1.0,0.0,1.0,-1.0,0.0]))))
          .addChild(TouchSensor().setDEF("byz_touch")))
        .addChild(Transform().setDEF("Slider1").setScale(7.4608,7.4608,7.4608).setTranslation(1.10175,1.20236,0.11536)
          .addChild(PlaneSensor().setDEF("Knob_Slide").setMaxPosition(0.0,0.07).setMinPosition(0.0,0.0).setOffset(0.0,0.07,0.0))
          .addChild(Transform().setDEF("Knob_Move").setTranslation(0.0,0.07,0.0)
            .addChild(Shape().setDEF("Knob")
              .setAppearance(Appearance()
                .setMaterial(Material().setDEF("Knob_Color").setAmbientIntensity(0.823529).setDiffuseColor(0.18,0.18,0.18).setEmissiveColor(1.0,0.7,0.1)))
              .setGeometry(IndexedFaceSet().setDEF("_4").setCoordIndex([4,5,6,7,-1,7,3,0,4,-1,3,7,6,2,-1,4,0,1,5,-1,5,1,2,6,-1])
                .setCoord(Coordinate().setPoint([-0.013638,-0.04,0.001197,0.013638,-0.04,0.001197,0.013638,-0.03,0.001197,-0.013638,-0.03,0.001197,-0.009802,-0.037032,0.0184,0.009802,-0.037032,0.0184,0.009802,-0.032968,0.0184,-0.009802,-0.032968,0.0184])))))
          .addChild(Shape().setDEF("Slot")
            .setAppearance(Appearance()
              .setMaterial(Material().setAmbientIntensity(0.0).setDiffuseColor(0.0,0.0,0.0)))
            .setGeometry(IndexedFaceSet().setDEF("_5").setCoordIndex([2,3,0,1,-1])
              .setCoord(Coordinate().setPoint([-0.002569,-0.044933,0.0,0.002569,-0.044933,0.0,0.002569,0.044933,0.0,-0.002569,0.044933,0.0]))))
          .addChild(Shape().setDEF("Metal")
            .setAppearance(Appearance()
              .setMaterial(Material().setAmbientIntensity(0.179104).setDiffuseColor(0.712766,0.712766,0.712766)))
            .setGeometry(IndexedFaceSet().setDEF("_6").setCoordIndex([4,0,3,7,-1,6,7,3,2,-1,5,6,2,1,-1,1,0,4,5,-1])
              .setCoord(Coordinate().setPoint([-0.002569,-0.044933,0.0,0.002569,-0.044933,0.0,0.002569,0.044933,0.0,-0.002569,0.044933,0.0,-0.007707,-0.05,0.0,0.007707,-0.05,0.0,0.007707,0.05,0.0,-0.007707,0.05,0.0]))))
          .addChild(Script().setDEF("Script0")
            .addField(field().setAccessType("initializeOnly").setName("byz_state").setType("SFBool").setValue("false"))
            .addField(field().setAccessType("outputOnly").setName("color_out").setType("SFColor"))
            .addField(field().setAccessType("initializeOnly").setName("maxTranslation").setType("SFFloat").setValue("1.0"))
            .addField(field().setAccessType("initializeOnly").setName("knobBuff").setType("SFColor").setValue("0.0 0.0 0.0"))
            .addField(field().setAccessType("initializeOnly").setName("trans_buff").setType("SFVec2f").setValue("0.0 0.0"))
            .addField(field().setAccessType("outputOnly").setName("byz_stateout").setType("SFBool"))
            .addField(field().setAccessType("inputOnly").setName("trans_in").setType("SFVec3f"))
            .addField(field().setAccessType("outputOnly").setName("trans_out").setType("SFVec2f"))
            .addField(field().setAccessType("initializeOnly").setName("minTranslation").setType("SFFloat").setValue("0.0"))
            .addField(field().setAccessType("inputOnly").setName("byz_trigger").setType("SFBool"))
            .addField(field().setAccessType("initializeOnly").setName("knobColor1").setType("SFColor").setValue("1.0 0.7 0.1"))
            .addField(field().setAccessType("initializeOnly").setName("knobColor0").setType("SFColor").setValue("0.18 0.18 0.18")).setSourceCode('''javascript:\n"+
"  function trans_in(v){\n"+
"   V = (v[1]/.07);\n"+
"   print(v[1]);\n"+
"   trans_buff[0] = 0;\n"+
"   trans_buff[1] = -.5*(1-V);\n"+
"   trans_out = trans_buff;\n"+
"   for(i=0;i<3;i++){\n"+
"    knobBuff[i] = knobColor0[i]+((knobColor1[i]-knobColor0[i])*V);\n"+
"   }\n"+
"   color_out = knobBuff;\n"+
"   \n"+
"  }\n"+
"  function byz_trigger(v){\n"+
"	if (v) {\n"+
"	byz_state = !byz_state;\n"+
"	byz_stateout = byz_state;\n"+
"	}\n"+
"  }\n"+
" \n"+
"        ''')
))
        .addChild(ROUTE().setFromField("translation_changed").setFromNode("Knob_Slide").setToField("set_translation").setToNode("Knob_Move"))
        .addChild(ROUTE().setFromField("translation_changed").setFromNode("Knob_Slide").setToField("trans_in").setToNode("Script0"))
        .addChild(ROUTE().setFromField("trans_out").setFromNode("Script0").setToField("set_translation").setToNode("tt"))
        .addChild(ROUTE().setFromField("color_out").setFromNode("Script0").setToField("set_emissiveColor").setToNode("Knob_Color"))
        .addChild(ROUTE().setFromField("isActive").setFromNode("byz_touch").setToField("byz_trigger").setToNode("Script0"))
        .addChild(ROUTE().setFromField("byz_stateout").setFromNode("Script0").setToField("set_bind").setToNode("byz"))))

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter02GeometryPrimitives/originals/pixel_perfect_RoundTrip.x3d")
