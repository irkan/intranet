
REM ############################################################
REM # Copyright (C) 2009-2012, OpenSCG.  All Rights Reserved.
REM ############################################################

setlocal

echo ############### Initializing Postgres (first time only) #################
echo %PGPASSWORD%> %PGHOME%\.pgpass
initdb -U %PGUSER% -A md5 --pwfile=%PGHOME%\.pgpass
del %PGHOME%\.pgpass
copy %PGHOME%\init\*.conf %PGDATA%\.

echo #################### End Initializing Postgres ########################

