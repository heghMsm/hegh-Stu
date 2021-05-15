
@echo off
pushd "%cd%"
cd ..
set pard=%cd%
popd
echo parentPath: %pard%
echo curPath: %cd%

%cd%/protoc.exe  --proto_path=%cd%/ *.proto  --java_out=%pard%\hgh-common-entity\src\main\java\com\hgh\entity
pause