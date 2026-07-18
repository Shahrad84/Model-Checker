@echo off
title SPIN Verify

cd /d "E:\Abdoreza Sevadi Projects\Model Checker\Phase1-Promela\Hash Language"

set "PATH=E:\MYSYS\ucrt64\bin;E:\MYSYS\usr\bin;%PATH%"
set "SPIN_PATH=E:\Abdoreza Sevadi Projects\Model Checker\Phase1-Promela\Spin-master\Spin-master\Src\spin.exe"

echo =============================================
echo  Verification Results
echo =============================================
echo.

echo [1] Deadlock:
"%SPIN_PATH%" -search -deadlock output.pml > nul 2>&1
if %errorlevel% equ 0 (echo   PASS) else (echo   FAIL)

echo [2] Safety []!divByZero:
"%SPIN_PATH%" -search -ltl "[](!divByZero)" output.pml > nul 2>&1
if %errorlevel% equ 0 (echo   PASS) else (echo   FAIL)

echo [3] Liveness [](inLoop -> ^<^>exitLoop):
"%SPIN_PATH%" -search -ltl "[](inLoop -> <> exitLoop)" output.pml > nul 2>&1
if %errorlevel% equ 0 (echo   PASS) else (echo   FAIL)

echo.
pause