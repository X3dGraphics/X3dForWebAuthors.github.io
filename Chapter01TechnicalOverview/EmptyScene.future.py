from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Core") \
   .setVersion("3.3") \
   .setScene(Scene() \
# Minimalist X3D file, can also delete DOCTYPE and this comment. 
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter01TechnicalOverview//EmptyScene_RoundTrip.x3d")
