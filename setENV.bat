echo off


set PWD=%~dp0%

set RABBITMQ_HOME=%PWD%rabbitmq-2.8.1
set JAVASVR_HOME=%PWD%tomcat
set ANT_HOME=%PWD%ant-1.8.2
set PATH=%ANT_HOME%\bin;%PATH%
set JAVA_HOME=%PWD%jdk
set PATH=%JAVA_HOME%\bin;%PATH%
set MONGO_HOME=%PWD%mongodb-2.0.4
set PGHOME=%PWD%pgsql
set PATH=%PGHOME%\bin;%PATH%
set PGPORT=5432
set PGDATABASE=postgres
set PGUSER=postgres
set PGHOST=localhost
set PGPASSWORD=password

