rem ������������� �������������� ������ ��������� ����� 2 ������ ����� ����������� � �������. ����� ��������� �� ����� ��������������!

set PWD=%~dp0%
Schtasks /Create /TN Intranet /TR "'%PWD%start.bat'" /RL HIGHEST /SC ONLOGON /DELAY 0002:00