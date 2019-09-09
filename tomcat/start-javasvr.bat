echo off


setlocal

if exist "%JAVASVR_HOME%\bin" goto continue
echo ERROR: JAVASVR_HOME environment variable must be a valid directory.
goto end

:continue
cd "%JAVASVR_HOME%\bin"

echo _
set TITLE=Tomcat on Port 8080
echo Starting %TITLE%...
%JAVASVR_HOME%\startup.bat 

:end
