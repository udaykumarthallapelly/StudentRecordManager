@echo off
echo Initializing Git repository...
cd src
cd ..
git init

echo Adding files...
git add .

echo Committing...
git commit -m "Initial commit: Student Record Manager using Java and DSA"

echo Setting remote origin...
git remote remove origin 2>nul
git remote add origin https://github.com/udaykumarthallapelly/StudentRecordManager.git

echo Pushing to GitHub...
git branch -M main
git push -u origin main

echo Done! Repository pushed successfully.
pause
