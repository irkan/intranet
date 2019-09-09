rem Устанавливает автоматический запуск программы через 2 минуты после авторизации в системе. Нужно запускать от имени администратора!

set PWD=%~dp0%
Schtasks /Create /TN Intranet /TR "'%PWD%start.bat'" /RL HIGHEST /SC ONLOGON /DELAY 0002:00