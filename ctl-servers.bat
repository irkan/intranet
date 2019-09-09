echo off

setlocal

if ""%1""==""start""   goto okArgs
if ""%1""==""stop""    goto okArgs
if ""%1""==""restart"" goto okArgs
echo ERROR: UsageMode is "ctl-servers.bat [start || stop || restart]" 
goto end

:okArgs
if not exist "%PGHOME%\start-postgres.bat"      goto runSetENV
if not exist "%JAVASVR_HOME%\start-javasvr.bat" goto runSetENV
goto mainline

:runSetEnv
call %PWD%setENV.bat

:mainline
if ""%1""==""start""   goto mainlineStart
call "%JAVASVR_HOME%\stop-javasvr.bat"
call "%PGHOME%\stop-postgres.bat"
if ""%1""==""stop""    goto end

:mainlineStart
call "%PGHOME%\start-postgres.bat"
call "%JAVASVR_HOME%\start-javasvr.bat"

:end
