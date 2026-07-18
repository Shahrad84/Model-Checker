@echo off
title Build and Run - Hash to Promela

:: set paths
set "BASE_DIR=E:\Abdoreza Sevadi Projects\Model Checker\Phase1-Promela\Hash Language"
set "GEN_DIR=%BASE_DIR%\generated_files"
set "OUT_DIR=%BASE_DIR%\out"
set "TEST_DIR=%BASE_DIR%"

echo =================================================
echo  Step 0: Cleaning Old Files
echo =================================================
echo Cleaning generated files and out directories...

:: Change to base directory
cd /d "%BASE_DIR%"
if %errorlevel% neq 0 (
    echo ERROR: Cannot find base directory!
    echo Path: %BASE_DIR%
    pause
    exit /b 1
)

:: Clean ANTLR generated files
if exist "%GEN_DIR%" (
    echo Removing: %GEN_DIR%
    rmdir /s /q "%GEN_DIR%"
)
mkdir "%GEN_DIR%"
echo Created: %GEN_DIR%

:: Clean compiled classes
if exist "%OUT_DIR%" (
    echo Removing: %OUT_DIR%
    rmdir /s /q "%OUT_DIR%"
)
mkdir "%OUT_DIR%"
echo Created: %OUT_DIR%

:: Clean SPIN generated files
if exist "pan.c" (
    echo Removing pan.c
    del /q pan.c
)
if exist "pan.exe" (
    echo Removing pan.exe
    del /q pan.exe
)
if exist "pan.*" (
    echo Removing pan.* files
    del /q pan.*
)
if exist "*.trail" (
    echo Removing .trail files
    del /q *.trail
)
if exist "output.pml" (
    echo Removing output.pml
    del /q output.pml
)

:: Clean results folder
if exist "spin_results" (
    echo Removing spin_results folder
    rmdir /s /q "spin_results"
)

echo.
echo Cleaning completed successfully!
echo.

pause
echo.

:: Generate ANTLR files (in current directory)
echo =================================================
echo  Step 1: Generating ANTLR Files
echo =================================================
echo Running ANTLR...
java -jar antlr-4.8-complete.jar -visitor -o "%GEN_DIR%" Hash.g4
if %errorlevel% neq 0 (
    echo XXXX ANTLR generation failed!
    pause
    exit /b %errorlevel%
)
echo ANTLR files generated in: %GEN_DIR%
echo.

pause
echo.

:: Compile Java files (in current directory)
echo =================================================
echo  Step 2: Compiling Java Files
echo =================================================
echo Compiling...
javac -cp ".;antlr-4.8-complete.jar;%GEN_DIR%" -d "%OUT_DIR%" *.java
if %errorlevel% neq 0 (
    echo XXXX Compilation failed!
    pause
    exit /b %errorlevel%
)
echo Compilation successful!
echo.

pause
echo.

:: Translate
echo =================================================
echo  Step 3: Running Translator
echo =================================================

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

:: Show the generated Promela code
echo =================================================
echo  Generated Promela Code:
echo =================================================
type "%BASE_DIR%\output.pml"

echo.
echo =================================================
pause