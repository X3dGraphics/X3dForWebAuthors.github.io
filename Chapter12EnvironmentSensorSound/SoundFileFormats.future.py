from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("SoundFileFormats.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Provide a test scene for sound files using various audio formats.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("10 November 2013") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("10 January 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("SoundFileFormats.png") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("audio/Testing123stereo.wav") \
     .setName("Sound") \
    ) \
    .addMeta(meta() \
     .setContent("audio/Testing123stereo.aiff") \
     .setName("Sound") \
    ) \
    .addMeta(meta() \
     .setContent("audio/Testing123stereo.mp3") \
     .setName("Sound") \
    ) \
    .addMeta(meta() \
     .setContent("audio/Testing123original.wav") \
     .setName("Sound") \
    ) \
    .addMeta(meta() \
     .setContent("Reunion by Marc Sabatella, distributed with MuseScore") \
     .setName("Sound") \
    ) \
    .addMeta(meta() \
     .setContent("audio/Reunion_Example.mid") \
     .setName("Sound") \
    ) \
    .addMeta(meta() \
     .setContent("File type requirements, http://www.web3d.org/files/specifications/19775-1/V3.3/Part01/components/sound.html#AudioClip") \
     .setName("requires") \
    ) \
    .addMeta(meta() \
     .setContent("X3D audio formats test") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/SoundFileFormats.x3d") \
     .setName("identifier") \
    ) \
    .addMeta(meta() \
     .setContent("ZOOM H2next Handy Recorder, http://www.zoom.co.jp/products/h2n") \
     .setName("generator") \
    ) \
    .addMeta(meta() \
     .setContent("Audacity, http://audacity.sourceforge.net") \
     .setName("generator") \
    ) \
    .addMeta(meta() \
     .setContent("MuseScore, http://musescore.org") \
     .setName("generator") \
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
     .setSkyColor([0.2,0.2,0.2]) \
    ) \
# ============================================================ 
    .addChild(Transform() \
     .setDEF("WavPlay") \
     .setScale([0.4,0.4,0.4]) \
     .setTranslation([-4,0.5,0]) \
     .addChild(TouchSensor() \
      .setDEF("WavTextClickedSensor") \
      .setDescription("Play file via Sound/AudioClip: Testing123stereo.wav") \
     ) \
     .addChild(Sound() \
      .setMaxBack(100) \
      .setMaxFront(100) \
      .setMinBack(20) \
      .setMinFront(20) \
# Make sure the sound source AudioClip is audible at the user location 
      .setSource(AudioClip() \
       .setDEF("Testing123stereoWavAudioClip") \
       .setDescription("Playing Testing123stereo.wav") \
       .setUrl(["audio/Testing123stereo.wav","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/audio/Testing123stereo.wav"]) \
      ) \
     ) \
     .addChild(ROUTE() \
      .setFromField("touchTime") \
      .setFromNode("WavTextClickedSensor") \
      .setToField("startTime") \
      .setToNode("Testing123stereoWavAudioClip") \
     ) \
     .addChild(Shape() \
      .setGeometry(Text() \
       .setString(["Testing123stereo.wav"]) \
       .setFontStyle(FontStyle(family = ["SANS"], justify = ["MIDDLE","MIDDLE"], style = "BOLD") \
        .setDEF("MessageFont") \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setDEF("GreenAppearance") \
       .setMaterial(Material() \
        .setDiffuseColor([0,1,0]) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setDEF("TextClickSurface") \
      .setScale([5,0.5,1]) \
      .setTranslation([0,0.3,0]) \
      .addChild(Shape() \
       .setGeometry(IndexedFaceSet(coordIndex = [0,1,2,3,-1], solid = False) \
        .setCoord(Coordinate() \
         .setPoint([1,1,0,1,-1,0,-1,-1,0,-1,1,0]) \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setTransparency(1) \
        ) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setDEF("WavLaunch") \
     .setScale([0.4,0.4,0.4]) \
     .setTranslation([-4,-0.1,0]) \
     .addChild(Anchor() \
      .setDescription("Launch audio file in Web browser: Testing123stereo.wav") \
      .setParameter(["target=_blank"]) \
      .setUrl(["audio/Testing123stereo.wav","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/audio/Testing123stereo.wav"]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["(launch)"]) \
        .setFontStyle(FontStyle() \
         .setUSE("MessageFont") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setUSE("GreenAppearance") \
       ) \
      ) \
      .addChild(Transform() \
       .setUSE("TextClickSurface") \
      ) \
     ) \
    ) \
# ============================================================ 
    .addChild(Transform() \
     .setDEF("Mp3Play") \
     .setScale([0.4,0.4,0.4]) \
     .setTranslation([0,0.5,0]) \
     .addChild(TouchSensor() \
      .setDEF("Mp3TextClickedSensor") \
      .setDescription("Play file via Sound/AudioClip: Testing123stereo.mp3") \
     ) \
     .addChild(Sound() \
      .setMaxBack(100) \
      .setMaxFront(100) \
      .setMinBack(20) \
      .setMinFront(20) \
      .setSource(AudioClip() \
       .setDEF("Testing123stereoMp3AudioClip") \
       .setDescription("Play file via Sound/AudioClip: Testing123stereo.mp3") \
       .setUrl(["audio/Testing123stereo.mp3","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/audio/Testing123stereo.mp3"]) \
      ) \
     ) \
     .addChild(ROUTE() \
      .setFromField("touchTime") \
      .setFromNode("Mp3TextClickedSensor") \
      .setToField("startTime") \
      .setToNode("Testing123stereoMp3AudioClip") \
     ) \
     .addChild(Shape() \
      .setGeometry(Text() \
       .setString(["Testing123stereo.mp3"]) \
       .setFontStyle(FontStyle() \
        .setUSE("MessageFont") \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setDEF("TurquoiseAppearance") \
       .setMaterial(Material() \
        .setDiffuseColor([0.156863,0.878431,0.815686]) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setUSE("TextClickSurface") \
     ) \
    ) \
    .addChild(Transform() \
     .setDEF("Mp3Launch") \
     .setScale([0.4,0.4,0.4]) \
     .setTranslation([0,-0.1,0]) \
     .addChild(Anchor() \
      .setDescription("Launch audio file in Web browser: Testing123stereo.mp3") \
      .setParameter(["target=_blank"]) \
      .setUrl(["audio/Testing123stereo.mp3","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/audio/Testing123stereo.mp3"]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["(launch)"]) \
        .setFontStyle(FontStyle() \
         .setUSE("MessageFont") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setUSE("TurquoiseAppearance") \
       ) \
      ) \
      .addChild(Transform() \
       .setUSE("TextClickSurface") \
      ) \
     ) \
    ) \
# ============================================================ 
    .addChild(Transform() \
     .setDEF("MidiPlay") \
     .setScale([0.4,0.4,0.4]) \
     .setTranslation([0,-2,0]) \
     .addChild(TouchSensor() \
      .setDEF("MidiTextClickedSensor") \
      .setDescription("Play file via Sound/AudioClip: Reunion_Example.mid") \
     ) \
     .addChild(Sound() \
      .setMaxBack(100) \
      .setMaxFront(100) \
      .setMinBack(20) \
      .setMinFront(20) \
      .setSource(AudioClip() \
       .setDEF("Testing123stereoMidiAudioClip") \
       .setDescription("Play file via Sound/AudioClip: Reunion_Example.mid") \
       .setUrl(["audio/Reunion_Example.mid","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/audio/Reunion_Example.mid"]) \
      ) \
     ) \
     .addChild(ROUTE() \
      .setFromField("touchTime") \
      .setFromNode("MidiTextClickedSensor") \
      .setToField("startTime") \
      .setToNode("Testing123stereoMidiAudioClip") \
     ) \
     .addChild(Shape() \
      .setGeometry(Text() \
       .setString(["Reunion_Example.mid"]) \
       .setFontStyle(FontStyle() \
        .setUSE("MessageFont") \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setUSE("TurquoiseAppearance") \
      ) \
     ) \
     .addChild(Transform() \
      .setUSE("TextClickSurface") \
     ) \
    ) \
    .addChild(Transform() \
     .setDEF("MidiLaunch") \
     .setScale([0.4,0.4,0.4]) \
     .setTranslation([0,-2.6,0]) \
     .addChild(Anchor() \
      .setDescription("Launch audio file in Web browser: Reunion_Example.mid") \
      .setParameter(["target=_blank"]) \
      .setUrl(["audio/Reunion_Example.mid","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/audio/Reunion_Example.mid"]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["(launch)"]) \
        .setFontStyle(FontStyle() \
         .setUSE("MessageFont") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setUSE("TurquoiseAppearance") \
       ) \
      ) \
      .addChild(Transform() \
       .setUSE("TextClickSurface") \
      ) \
     ) \
    ) \
# ============================================================ 
    .addChild(Transform() \
     .setDEF("AiffPlay") \
     .setScale([0.4,0.4,0.4]) \
     .setTranslation([4,0.5,0]) \
     .addChild(TouchSensor() \
      .setDEF("AiffTextClickedSensor") \
      .setDescription("Play file via Sound/AudioClip: Testing123stereo.aiff") \
     ) \
     .addChild(Sound() \
      .setMaxBack(100) \
      .setMaxFront(100) \
      .setMinBack(20) \
      .setMinFront(20) \
      .setSource(AudioClip() \
       .setDEF("Testing123stereoAiffAudioClip") \
       .setDescription("Play file via Sound/AudioClip: Testing123stereo.aiff") \
       .setUrl(["audio/Testing123stereo.aiff","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/audio/Testing123stereo.aiff"]) \
      ) \
     ) \
     .addChild(ROUTE() \
      .setFromField("touchTime") \
      .setFromNode("AiffTextClickedSensor") \
      .setToField("startTime") \
      .setToNode("Testing123stereoAiffAudioClip") \
     ) \
     .addChild(Shape() \
      .setGeometry(Text() \
       .setString(["Testing123stereo.aiff"]) \
       .setFontStyle(FontStyle() \
        .setUSE("MessageFont") \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setDEF("AmberAppearance") \
       .setMaterial(Material() \
        .setDiffuseColor([1,0.760784,0]) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setUSE("TextClickSurface") \
     ) \
    ) \
    .addChild(Transform() \
     .setDEF("AiffLaunch") \
     .setScale([0.4,0.4,0.4]) \
     .setTranslation([4,-0.1,0]) \
     .addChild(Anchor() \
      .setDescription("Launch audio file in Web browser: Testing123stereo.aiff") \
      .setParameter(["target=_blank"]) \
      .setUrl(["audio/Testing123stereo.aiff","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/audio/Testing123stereo.aiff"]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["(launch)"]) \
        .setFontStyle(FontStyle() \
         .setUSE("MessageFont") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setUSE("AmberAppearance") \
       ) \
      ) \
      .addChild(Transform() \
       .setUSE("TextClickSurface") \
      ) \
     ) \
    ) \
# ============================================================ 
    .addChild(Transform() \
     .setDEF("HeaderBox") \
     .setTranslation([0,2,-0.1]) \
     .addChild(Shape() \
      .setGeometry(Box(size = [12,1,0.1]) \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([1,1,1]) \
        .setTransparency(0.75) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setDEF("WavRequired") \
     .setScale([0.4,0.4,0.4]) \
     .setTranslation([-4,2,0]) \
     .addChild(Shape() \
      .setGeometry(Text() \
       .setString(["Required Support"]) \
       .setFontStyle(FontStyle() \
        .setUSE("MessageFont") \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setUSE("GreenAppearance") \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setDEF("Mp3Recommended") \
     .setScale([0.4,0.4,0.4]) \
     .setTranslation([0,2,0]) \
     .addChild(Shape() \
      .setGeometry(Text() \
       .setString(["Recommended Support"]) \
       .setFontStyle(FontStyle() \
        .setUSE("MessageFont") \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setUSE("TurquoiseAppearance") \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setDEF("AiffOptional") \
     .setScale([0.4,0.4,0.4]) \
     .setTranslation([4,2,0]) \
     .addChild(Shape() \
      .setGeometry(Text() \
       .setString(["Optional Support"]) \
       .setFontStyle(FontStyle() \
        .setUSE("MessageFont") \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setUSE("AmberAppearance") \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound//SoundFileFormats_RoundTrip.x3d")
