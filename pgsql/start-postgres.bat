
REM ############################################################
REM # Copyright (C) 2009-2012, OpenSCG.  All Rights Reserved.
REM ############################################################

setlocal

if exist "%PGHOME%" goto pgHomeOK
echo ERROR: PGHOME environment variable must be a valid directory.
goto end


REM ############################################################
:pgHomeOK
set PGDATA=%PGHOME%\data
if exist "%PGDATA%" goto pgDataOK


REM ############################################################
:pgDataMissing
call "%PGHOME%\init-postgres.bat"


REM ############################################################
:pgDataOK
echo _
echo Starting Postgres on Port %PGPORT%...
pg_ctl -w start

:end
