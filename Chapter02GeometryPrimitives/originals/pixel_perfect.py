import classpath
from org.web3d.x3d.jsail.Core.X3DObject import X3DObject as X3D
from org.web3d.x3d.jsail.Core.headObject import headObject as head
from org.web3d.x3d.jsail.Core.metaObject import metaObject as meta
from org.web3d.x3d.jsail.Core.SceneObject import SceneObject as Scene
from org.web3d.x3d.jsail.EnvironmentalEffects.BackgroundObject import BackgroundObject as Background
from org.web3d.x3d.jsail.Navigation.ViewpointObject import ViewpointObject as Viewpoint
from org.web3d.x3d.jsail.Grouping.TransformObject import TransformObject as Transform
from org.web3d.x3d.jsail.Shape.ShapeObject import ShapeObject as Shape
from org.web3d.x3d.jsail.Shape.AppearanceObject import AppearanceObject as Appearance
from org.web3d.x3d.jsail.Texturing.TextureTransformObject import TextureTransformObject as TextureTransform
from org.web3d.x3d.jsail.Texturing.ImageTextureObject import ImageTextureObject as ImageTexture
from org.web3d.x3d.jsail.Geometry3D.IndexedFaceSetObject import IndexedFaceSetObject as IndexedFaceSet
from org.web3d.x3d.jsail.Texturing.TextureCoordinateObject import TextureCoordinateObject as TextureCoordinate
from org.web3d.x3d.jsail.Rendering.CoordinateObject import CoordinateObject as Coordinate
from org.web3d.x3d.jsail.PointingDeviceSensor.TouchSensorObject import TouchSensorObject as TouchSensor
from org.web3d.x3d.jsail.PointingDeviceSensor.PlaneSensorObject import PlaneSensorObject as PlaneSensor
from org.web3d.x3d.jsail.Shape.MaterialObject import MaterialObject as Material
from org.web3d.x3d.jsail.Scripting.ScriptObject import ScriptObject as Script
from org.web3d.x3d.jsail.Core.fieldObject import fieldObject as field
from org.web3d.x3d.jsail.Core.ROUTEObject import ROUTEObject as ROUTE
X3D0 = X3D()
X3D0.setProfile("Immersive")
X3D0.setVersion("3.1")
head1 = head()
meta2 = meta()
meta2.setContent("C:\www.web3d.org\x3d\content\examples\X3dForWebAuthors\Chapter02GeometryPrimitives\originals\pixel_perfect.x3d")
meta2.setName("title")

head1.addMeta(meta2)
meta3 = meta()
meta3.setContent("*enter description here, short-sentence summaries preferred*")
meta3.setName("description")

head1.addMeta(meta3)
meta4 = meta()
meta4.setContent("*enter name of original author here*")
meta4.setName("creator")

head1.addMeta(meta4)
meta5 = meta()
meta5.setContent("*if manually translating VRML-to-X3D, enter name of person translating here*")
meta5.setName("translator")

head1.addMeta(meta5)
meta6 = meta()
meta6.setContent("*enter date of initial version here*")
meta6.setName("created")

head1.addMeta(meta6)
meta7 = meta()
meta7.setContent("12 October 2009")
meta7.setName("translated")

head1.addMeta(meta7)
meta8 = meta()
meta8.setContent("12 October 2009")
meta8.setName("modified")

head1.addMeta(meta8)
meta9 = meta()
meta9.setContent("*enter version here*")
meta9.setName("version")

head1.addMeta(meta9)
meta10 = meta()
meta10.setContent("*enter reference citation or relative/online url here*")
meta10.setName("reference")

head1.addMeta(meta10)
meta11 = meta()
meta11.setContent("*enter additional url/bibliographic reference information here*")
meta11.setName("reference")

head1.addMeta(meta11)
meta12 = meta()
meta12.setContent("*enter reference resource here if required to support function, delivery, or coherence of content*")
meta12.setName("requires")

head1.addMeta(meta12)
meta13 = meta()
meta13.setContent("*enter copyright information here* Example: Copyright (c) Web3D Consortium Inc. 2006")
meta13.setName("rights")

head1.addMeta(meta13)
meta14 = meta()
meta14.setContent("*enter drawing filename/url here*")
meta14.setName("drawing")

head1.addMeta(meta14)
meta15 = meta()
meta15.setContent("*enter image filename/url here*")
meta15.setName("image")

head1.addMeta(meta15)
meta16 = meta()
meta16.setContent("*enter movie filename/url here*")
meta16.setName("MovingImage")

head1.addMeta(meta16)
meta17 = meta()
meta17.setContent("*enter photo filename/url here*")
meta17.setName("photo")

head1.addMeta(meta17)
meta18 = meta()
meta18.setContent("*enter subject keywords here*")
meta18.setName("subject")

head1.addMeta(meta18)
meta19 = meta()
meta19.setContent("*enter permission statements or url here*")
meta19.setName("accessRights")

head1.addMeta(meta19)
meta20 = meta()
meta20.setContent("*insert any known warnings, bugs or errors here*")
meta20.setName("warning")

head1.addMeta(meta20)
meta21 = meta()
meta21.setContent("http://*enter online url address for this file here*/C:\www.web3d.org\x3d\content\examples\X3dForWebAuthors\Chapter02GeometryPrimitives\originals\pixel_perfect.x3d")
meta21.setName("identifier")

head1.addMeta(meta21)
meta22 = meta()
meta22.setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html")
meta22.setName("generator")

head1.addMeta(meta22)
meta23 = meta()
meta23.setContent("../license.html")
meta23.setName("license")

head1.addMeta(meta23)

X3D0.setHead(head1)
Scene24 = Scene()
Background25 = Background()
Background25.setSkyColor([1.0,1.0,1.0])

Scene24.addChildren(Background25)
Viewpoint26 = Viewpoint()
Viewpoint26.setDEF("home")
Viewpoint26.setDescription("home")
Viewpoint26.setFieldOfView(1.4)
Viewpoint26.setOrientation([0.0,1.0,0.0,0.35])
Viewpoint26.setPosition([0.0,1.25,5.0])

Scene24.addChildren(Viewpoint26)
Viewpoint27 = Viewpoint()
Viewpoint27.setDEF("byz")
Viewpoint27.setDescription("Byzantine Astronomical Data")
Viewpoint27.setFieldOfView(0.785398)
Viewpoint27.setPosition([0.0,1.0,2.829157])

Scene24.addChildren(Viewpoint27)
Transform28 = Transform()
Transform28.setTranslation([0.0,1.0,0.0])
Shape29 = Shape()
Appearance30 = Appearance()
TextureTransform31 = TextureTransform()
TextureTransform31.setDEF("tt")
TextureTransform31.setCenter([0.0,0.0])
TextureTransform31.setRotation(0.0)
TextureTransform31.setTranslation([0.0,0.0])

Appearance30.setTextureTransform(TextureTransform31)
ImageTexture32 = ImageTexture()
ImageTexture32.setRepeatS(False)
ImageTexture32.setRepeatT(False)
ImageTexture32.setUrl(["byz_small.jpg"])

Appearance30.setTexture(ImageTexture32)

Shape29.setAppearance(Appearance30)
IndexedFaceSet33 = IndexedFaceSet()
IndexedFaceSet33.setDEF("page0")
IndexedFaceSet33.setCoordIndex([0,1,2,3,-1])
IndexedFaceSet33.setSolid(False)
IndexedFaceSet33.setTexCoordIndex([0,1,2,3,-1])
TextureCoordinate34 = TextureCoordinate()
TextureCoordinate34.setPoint([0.0,0.5,0.0,1.0,1.0,1.0,1.0,0.5])

IndexedFaceSet33.setTexCoord(TextureCoordinate34)
Coordinate35 = Coordinate()
Coordinate35.setPoint([-1.0,-1.0,0.0,-1.0,1.0,0.0,1.0,1.0,0.0,1.0,-1.0,0.0])

IndexedFaceSet33.setCoord(Coordinate35)

Shape29.setGeometry(IndexedFaceSet33)

Transform28.addChildren(Shape29)
TouchSensor36 = TouchSensor()
TouchSensor36.setDEF("byz_touch")

Transform28.addChildren(TouchSensor36)

Scene24.addChildren(Transform28)
Transform37 = Transform()
Transform37.setDEF("Slider1")
Transform37.setScale([7.4608,7.4608,7.4608])
Transform37.setTranslation([1.10175,1.20236,0.11536])
PlaneSensor38 = PlaneSensor()
PlaneSensor38.setDEF("Knob_Slide")
PlaneSensor38.setMaxPosition([0.0,0.07])
PlaneSensor38.setMinPosition([0.0,0.0])
PlaneSensor38.setOffset([0.0,0.07,0.0])

Transform37.addChildren(PlaneSensor38)
Transform39 = Transform()
Transform39.setDEF("Knob_Move")
Transform39.setTranslation([0.0,0.07,0.0])
Shape40 = Shape()
Shape40.setDEF("Knob")
Appearance41 = Appearance()
Material42 = Material()
Material42.setDEF("Knob_Color")
Material42.setAmbientIntensity(0.823529)
Material42.setDiffuseColor([0.18,0.18,0.18])
Material42.setEmissiveColor([1.0,0.7,0.1])

Appearance41.setMaterial(Material42)

Shape40.setAppearance(Appearance41)
IndexedFaceSet43 = IndexedFaceSet()
IndexedFaceSet43.setDEF("_4")
IndexedFaceSet43.setCoordIndex([4,5,6,7,-1,7,3,0,4,-1,3,7,6,2,-1,4,0,1,5,-1,5,1,2,6,-1])
Coordinate44 = Coordinate()
Coordinate44.setPoint([-0.013638,-0.04,0.001197,0.013638,-0.04,0.001197,0.013638,-0.03,0.001197,-0.013638,-0.03,0.001197,-0.009802,-0.037032,0.0184,0.009802,-0.037032,0.0184,0.009802,-0.032968,0.0184,-0.009802,-0.032968,0.0184])

IndexedFaceSet43.setCoord(Coordinate44)

Shape40.setGeometry(IndexedFaceSet43)

Transform39.addChildren(Shape40)

Transform37.addChildren(Transform39)
Shape45 = Shape()
Shape45.setDEF("Slot")
Appearance46 = Appearance()
Material47 = Material()
Material47.setAmbientIntensity(0.0)
Material47.setDiffuseColor([0.0,0.0,0.0])

Appearance46.setMaterial(Material47)

Shape45.setAppearance(Appearance46)
IndexedFaceSet48 = IndexedFaceSet()
IndexedFaceSet48.setDEF("_5")
IndexedFaceSet48.setCoordIndex([2,3,0,1,-1])
Coordinate49 = Coordinate()
Coordinate49.setPoint([-0.002569,-0.044933,0.0,0.002569,-0.044933,0.0,0.002569,0.044933,0.0,-0.002569,0.044933,0.0])

IndexedFaceSet48.setCoord(Coordinate49)

Shape45.setGeometry(IndexedFaceSet48)

Transform37.addChildren(Shape45)
Shape50 = Shape()
Shape50.setDEF("Metal")
Appearance51 = Appearance()
Material52 = Material()
Material52.setAmbientIntensity(0.179104)
Material52.setDiffuseColor([0.712766,0.712766,0.712766])

Appearance51.setMaterial(Material52)

Shape50.setAppearance(Appearance51)
IndexedFaceSet53 = IndexedFaceSet()
IndexedFaceSet53.setDEF("_6")
IndexedFaceSet53.setCoordIndex([4,0,3,7,-1,6,7,3,2,-1,5,6,2,1,-1,1,0,4,5,-1])
Coordinate54 = Coordinate()
Coordinate54.setPoint([-0.002569,-0.044933,0.0,0.002569,-0.044933,0.0,0.002569,0.044933,0.0,-0.002569,0.044933,0.0,-0.007707,-0.05,0.0,0.007707,-0.05,0.0,0.007707,0.05,0.0,-0.007707,0.05,0.0])

IndexedFaceSet53.setCoord(Coordinate54)

Shape50.setGeometry(IndexedFaceSet53)

Transform37.addChildren(Shape50)
Script55 = Script()
Script55.setDEF("Script0")
field56 = field()
field56.setAccessType("initializeOnly")
field56.setName("byz_state")
field56.setType("SFBool")
field56.setValue("false")

Script55.addField(field56)
field57 = field()
field57.setAccessType("outputOnly")
field57.setName("color_out")
field57.setType("SFColor")

Script55.addField(field57)
field58 = field()
field58.setAccessType("initializeOnly")
field58.setName("maxTranslation")
field58.setType("SFFloat")
field58.setValue("1.0")

Script55.addField(field58)
field59 = field()
field59.setAccessType("initializeOnly")
field59.setName("knobBuff")
field59.setType("SFColor")
field59.setValue("0.0 0.0 0.0")

Script55.addField(field59)
field60 = field()
field60.setAccessType("initializeOnly")
field60.setName("trans_buff")
field60.setType("SFVec2f")
field60.setValue("0.0 0.0")

Script55.addField(field60)
field61 = field()
field61.setAccessType("outputOnly")
field61.setName("byz_stateout")
field61.setType("SFBool")

Script55.addField(field61)
field62 = field()
field62.setAccessType("inputOnly")
field62.setName("trans_in")
field62.setType("SFVec3f")

Script55.addField(field62)
field63 = field()
field63.setAccessType("outputOnly")
field63.setName("trans_out")
field63.setType("SFVec2f")

Script55.addField(field63)
field64 = field()
field64.setAccessType("initializeOnly")
field64.setName("minTranslation")
field64.setType("SFFloat")
field64.setValue("0.0")

Script55.addField(field64)
field65 = field()
field65.setAccessType("inputOnly")
field65.setName("byz_trigger")
field65.setType("SFBool")

Script55.addField(field65)
field66 = field()
field66.setAccessType("initializeOnly")
field66.setName("knobColor1")
field66.setType("SFColor")
field66.setValue("1.0 0.7 0.1")

Script55.addField(field66)
field67 = field()
field67.setAccessType("initializeOnly")
field67.setName("knobColor0")
field67.setType("SFColor")
field67.setValue("0.18 0.18 0.18")

Script55.addField(field67)

Script55.setSourceCode('''javascript:\n"+
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

Transform37.addChildren(Script55)

Scene24.addChildren(Transform37)
ROUTE68 = ROUTE()
ROUTE68.setFromField("translation_changed")
ROUTE68.setFromNode("Knob_Slide")
ROUTE68.setToField("set_translation")
ROUTE68.setToNode("Knob_Move")

Scene24.addChildren(ROUTE68)
ROUTE69 = ROUTE()
ROUTE69.setFromField("translation_changed")
ROUTE69.setFromNode("Knob_Slide")
ROUTE69.setToField("trans_in")
ROUTE69.setToNode("Script0")

Scene24.addChildren(ROUTE69)
ROUTE70 = ROUTE()
ROUTE70.setFromField("trans_out")
ROUTE70.setFromNode("Script0")
ROUTE70.setToField("set_translation")
ROUTE70.setToNode("tt")

Scene24.addChildren(ROUTE70)
ROUTE71 = ROUTE()
ROUTE71.setFromField("color_out")
ROUTE71.setFromNode("Script0")
ROUTE71.setToField("set_emissiveColor")
ROUTE71.setToNode("Knob_Color")

Scene24.addChildren(ROUTE71)
ROUTE72 = ROUTE()
ROUTE72.setFromField("isActive")
ROUTE72.setFromNode("byz_touch")
ROUTE72.setToField("byz_trigger")
ROUTE72.setToNode("Script0")

Scene24.addChildren(ROUTE72)
ROUTE73 = ROUTE()
ROUTE73.setFromField("byz_stateout")
ROUTE73.setFromNode("Script0")
ROUTE73.setToField("set_bind")
ROUTE73.setToNode("byz")

Scene24.addChildren(ROUTE73)

X3D0.setScene(Scene24)
X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter02GeometryPrimitives/originals/pixel_perfect_RoundTrip.x3d")
