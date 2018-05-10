ant clean

ant jar

#cp dist/apertium-viewer.jar ../../builds/apertium-viewer/
scp dist/apertium-viewer.jar j:javabog.dk/filer/apertium/

#echo Commit and update apertium-viewer-newest-version.txt ?
#svn commit ../../builds/apertium-viewer/
echo Update apertium-viewer-newest-version.txt ?
read i
scp apertium-viewer-newest-version.txt j:javabog.dk/filer/apertium/
