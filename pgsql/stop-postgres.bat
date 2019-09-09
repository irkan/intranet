echo off

REM ############################################################
REM # Copyright (C) 2009-2012, OpenSCG.  All Rights Reserved.
REM ############################################################

setlocal

if exist "%PGHOME%\data" goto continue
echo ERROR: PGHOME environment variable must be a valid directory.
goto end


:continue
set PGDATA=%PGHOME%\data

echo _
echo Stopping Postgres at %PGDATA%
pg_ctl stop -w -m fast

:end
