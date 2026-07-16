@echo off
title Build & Run - Hash to Promela

:: set paths
set "BASE_DIR=E:\Abdoreza Sevadi Projects\Model Checker\Phase1-Promela\Hash Language"
set "SRC_DIR=%BASE_DIR%\src"
set "GEN_DIR=%BASE_DIR%\generated files"
set "OUT_DIR=%BASE_DIR%\out"
set "TEST_DIR=%BASE_DIR%"


cd /d "%SRC_DIR%"

echo =================================================
echo  Step 1: Generating ANTLR Files
echo =================================================
java -jar antlr-4.8-complete.jar -visitor -o "%GEN_DIR%" Hash.g4
if %errorlevel% neq 0 (
    echo ANTLR generation failed!
    pause
    exit /b %errorlevel%
)
echo ANTLR files generated in: %GEN_DIR%
echo.



:: compile
echo =================================================
echo  Step 2: Compiling Java Files
echo =================================================
javac -cp ".;antlr-4.8-complete.jar;%GEN_DIR%" -d "%OUT_DIR%" *.java
if %errorlevel% neq 0 (
    echo XXXX Compilation failed!
    pause
    exit /b %errorlevel%
)
echo Compilation successful!
echo.



:: translate
echo =================================================
echo  Step 3: Running Translator
echo =================================================

:: 
if "%1"=="" (
    set "INPUT_FILE=%TEST_DIR%\test.hash"
) else (
    set "INPUT_FILE=%1"
)

echo Input file: %INPUT_FILE%
java -cp ".;antlr-4.8-complete.jar;%OUT_DIR%;%GEN_DIR%" Main "%INPUT_FILE%" "%BASE_DIR%\output.pml"

if %errorlevel% neq 0 (
    echo XXXX Translation failed!
    pause
    exit /b %errorlevel%
)

echo.
echo =================================================
echo  All Done!
echo =================================================
echo  Output written to: %BASE_DIR%\output.pml
echo.
pause