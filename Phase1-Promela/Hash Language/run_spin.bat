@echo off
set SPIN_PATH=E:\Abdoreza Sevadi Projects\Model Checker\Phase1-Promela\Spin-master\Spin-master\Src\spin.exe
echo Running Spin on: output.pml
"%SPIN_PATH%" -run -search output.pml
pause