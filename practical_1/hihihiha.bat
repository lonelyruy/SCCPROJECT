@echo on

set /A a=2
set /A b=3
set name1=YL
set name2=Loo

:: Using if statement
if %a%==2 echo The value of a is 2
if %name2%==Loo echo "Hi greetings from Loo"

:: Using if else statements
if %a%==%b% (echo Numbers are equal) else (echo Numbers are different)
if %name1%==%name2% (echo Name 1 and 2 are the same) else (echo Name 1 and 2 are different)

pause
