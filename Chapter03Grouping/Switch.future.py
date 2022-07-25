from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interactive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("Switch.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Example for Switch node") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly and Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("13 November 2005") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("11 January 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.web3d.org/x3d/content/examples/X3dResources.html") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("Copyright (c) 2005, Daly Realism and Don Brutzman") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/Switch.x3d") \
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
    .addChild(Background() \
     .setSkyColor([1,1,1]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Switch among multiple children") \
     .setOrientation([-0.668,-0.724,-0.174,0.7]) \
     .setPosition([-1.93,1.78,3.28]) \
    ) \
# Authors can manually change whichChoice values (from 0 through 3) to show each child shape 
    .addChild(Switch() \
     .setDEF("Switcher") \
     .setWhichChoice(0) \
     .addChild(Shape() \
      .setDEF("BoxShape") \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([1,0,0]) \
       ) \
      ) \
      .setGeometry(Box() \
      ) \
     ) \
     .addChild(Shape() \
      .setDEF("ConeShape") \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([1,1,0]) \
       ) \
      ) \
      .setGeometry(Cone() \
      ) \
     ) \
     .addChild(Shape() \
      .setDEF("CylinderShape") \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([0,1,0]) \
       ) \
      ) \
      .setGeometry(Cylinder() \
      ) \
     ) \
     .addChild(Shape() \
      .setDEF("SphereShape") \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([0,0,1]) \
       ) \
      ) \
      .setGeometry(Sphere() \
      ) \
     ) \
    ) \
    .addChild(Group() \
     .setDEF("AnimationGroup") \
# Total cycleInterval=\"8\" gives 2 seconds to each of the 4 colors 
# Authors can set enabled='true' loop='true' for a continuous animation 
     .addChild(TimeSensor() \
      .setDEF("Timer") \
      .setCycleInterval(8) \
      .setEnabled(False) \
      .setLoop(True) \
     ) \
     .addChild(IntegerSequencer() \
      .setDEF("Counter") \
      .setKey([0,.25,.5,.75,1]) \
      .setKeyValue([0,1,2,3,0]) \
     ) \
     .addChild(ROUTE() \
      .setFromField("fraction_changed") \
      .setFromNode("Timer") \
      .setToField("set_fraction") \
      .setToNode("Counter") \
     ) \
     .addChild(ROUTE() \
      .setFromField("value_changed") \
      .setFromNode("Counter") \
      .setToField("whichChoice") \
      .setToNode("Switcher") \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter03Grouping//Switch_RoundTrip.x3d")
