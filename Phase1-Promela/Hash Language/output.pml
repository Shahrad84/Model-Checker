bool divByZero = false;
bool inLoop = false;
bool exitLoop = false;
int sum = 0;
int i = 1;
int x = 10;
int y = 2;
int loopActive = 1;

active proctype main() {
loop_0_start:
do
:: ((loopActive == 1)) ->
    exitLoop = true;
    inLoop = true;
    sum = (sum + i);
    i = (i + 1);
    if
    :: ((i > 5)) ->
        loopActive = 0;
        break;
    :: else ->
        skip;
    fi;
:: else -> break
od;
inLoop = false;
if
:: ((y == 0)) ->
    divByZero = true;
:: else ->
    sum = (x / y);
fi;
printf("%d\n", sum);
}
