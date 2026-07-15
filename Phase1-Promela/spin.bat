@echo off
set SPIN_PATH=E:\Abdoreza Sevadi Projects\Model Checker\Phase1-Promela\Spin-master\Spin-master\Src\spin.exe
echo Running Spin on: %1
"%SPIN_PATH%" -search %1
pause