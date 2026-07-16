@echo off
title SPIN - Deadlock Check

cd /d "E:\Abdoreza Sevadi Projects\Model Checker\Phase1-Promela\Hash Language"

set "PATH=E:\MYSYS\ucrt64\bin;E:\MYSYS\usr\bin;%PATH%"
set "SPIN_PATH=E:\Abdoreza Sevadi Projects\Model Checker\Phase1-Promela\Spin-master\Spin-master\Src\spin.exe"

echo =================================================
echo  Checking Deadlock Freedom
echo =================================================
echo.

"%SPIN_PATH%" -search -deadlock output.pml 2>nul | findstr /C:"errors:" /C:"pan: elapsed"

echo.
echo =================================================
echo  Done!
echo =================================================
pause