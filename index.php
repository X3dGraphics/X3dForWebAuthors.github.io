<?php

require_once (getenv('DOCUMENT_ROOT').'/pageDesign.php');

function pageContent () {
?>

<p><div class='labelNew'>Example Scenes</div></p>

<p>Every example from <u>X3D: Extensible 3D Graphics for Web Authors</u> is
available for inspection, interaction, and download. The examples are
grouped by the chapter where they appear.  Additional examples are also included.</p>

<p>You can either <a href='index.html'>browse</a> all of the examples,
	<a href='../../X3dExamplesX3dForWebAuthors.zip'>download</a> the examples archive,
or browse individual chapters using the links below.</p>

<ol start="0">
<li><a href='index.html'>Examples Table of Contents</a></li>
<li><a href='Chapter01-TechnicalOverview/'>Chapter 1: Technical Overview</a> (<a href="../chapters/Chapter01-Technical_Introduction.pdf">online chapter</a>)</li>
<li><a href='Chapter02-GeometryPrimitives/'>Chapter 2: Geometry Nodes, Part 1: Primitives</a></li>
<li><a href='Chapter03-Grouping/'>Chapter 3: Grouping Nodes</a></li>
<li><a href='Chapter04-ViewingNavigation/'>Chapter 4: Viewing and Navigation</a></li>
<li><a href='Chapter05-AppearanceMaterialTextures/'>Chapter 5: Appearance, Material, and Textures</a></li>
<li><a href='Chapter06-GeometryPointsLinesPolygons/'>Chapter 6: Geometry Nodes, Part 2: Points, Lines, and Polygons</a></li>
<li><a href='Chapter07-EventAnimationInterpolation/'>Chapter 7: Event Animation and Interpolation</a></li>
<li><a href='Chapter08-UserInteractivity/'>Chapter 8: User Interactivity Nodes</a></li>
<li><a href='Chapter09-EventUtilitiesScripting/'>Chapter 9: Event Utilities and Scripting</a></li>
<li><a href='Chapter10-Geometry2D/'>Chapter 10: Geometry Nodes, Part 3: Geometry2D Nodes</a></li>
<li><a href='Chapter11-LightingEnvironment/'>Chapter 11: Lighting and Environment Nodes</a></li>
<li><a href='Chapter12-EnvironmentSensorSound/'>Chapter 12: Environmental Sensor and Sound Nodes</a></li>
<li><a href='Chapter13-GeometryTrianglesQuadrilaterals/'>Chapter 13: Geometry Nodes, Part 4: Triangles and Quadrilaterals</a></li>
<li><a href='Chapter14-Prototypes/'>Chapter 14: Creating Prototype Nodes</a></li>
<li><a href='KelpForestExhibit/'>Kelp Forest Exhibit</a></li>
<!--<li><a href='Chapter15-Metadata/'>Chapter 15: MetaData and WorldInfo Nodes</a></li>-->
</ol>


<?php
  pageDisclaimer ();
}


$title = 'X3D: Examples';
$keywords = 'examples, toc, x3d, extensible 3d graphics, graphics, 3d, vrml, classic vrml, xml, binary, book, web graphics';
$description = 'All book examples plus additional ones for X3D: Extensible 3D Graphics for Web Authors - the first book describing how to build X3D (Extensible 3D Graphics) worlds.';
$addCss = '';

pageDesign ($title, $keywords, $description, $addCss);
