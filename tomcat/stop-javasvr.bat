echo off


setlocal

if exist "%JAVASVR_HOME%\bin" goto continue
echo ERROR: JAVASVR_HOME environment variable must be a valid directory.
goto end

:continue
cd "%JAVASVR_HOME%\bin"

echo _
echo Stopping Tomcat...
%JAVASVR_HOME%\shutdown.bat

:end
