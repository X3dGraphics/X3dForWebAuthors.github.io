 echo on

# escape blank ( ) \, \+ \! characters

# cd 'C:\x3d-code\www.web3d.org\x3d\content\examples\X3dForWebAuthors'

# list viewpoint images containing an embedded blank:
# ls */_viewpoints/*\ *
# ls */_viewpoints/*\ * > svn.renameViewpointImages.out.txt

# chmod 774 svn.renameViewpointImages.sh
# ls -al *.sh

# ./svn.renameViewpointImages.sh >> svn.renameViewpointImages.out.txt

# rename original filename with escaped spaces and ( ) characters to new file name with _ and escaped ( ) characters
#echo "svn rename " ; svn rename -m "rename _viewpoints image to match underscore naming convention" https://svn.code.sf.net/p/x3d/code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/ https://svn.code.sf.net/p/x3d/code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/ 

 
echo "svn rename Chapter01-TechnicalOverview/_viewpoints/HeaderProfileComponentMetaExample.x3d._VP_Default_viewpoint.png                                                    " ; svn rename -m "rename _viewpoints image to match underscore naming convention" https://svn.code.sf.net/p/x3d/code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter01-TechnicalOverview/_viewpoints/HeaderProfileComponentMetaExample.x3d._VP_Default\ viewpoint.png                                                            https://svn.code.sf.net/p/x3d/code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter01-TechnicalOverview/_viewpoints/HeaderProfileComponentMetaExample.x3d._VP_Default_viewpoint.png                                                    
echo "svn rename Chapter01-TechnicalOverview/_viewpoints/HelloTriangle.x3d._VP_Default_viewpoint.png                                                                        " ; svn rename -m "rename _viewpoints image to match underscore naming convention" https://svn.code.sf.net/p/x3d/code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter01-TechnicalOverview/_viewpoints/HelloTriangle.x3d._VP_Default\ viewpoint.png                                                                                https://svn.code.sf.net/p/x3d/code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter01-TechnicalOverview/_viewpoints/HelloTriangle.x3d._VP_Default_viewpoint.png                                                                         

echo "=================="

svn commit

svn update
