init {
    bool divByZero = false;
    bool inLoop = false;
    bool exitLoop = false;
    int sum = 0;
    int i = 1;
    int x = 10;
    int y = 0;
    inLoop = true;
    loop_0:
    do
    :: (i < 5) ->
        sum = sum + i;
        i = i + 1;
        goto loop_0
    :: else -> break
    od
    exitLoop = true;
    inLoop = false;
    if
    :: (y != 0) ->
        x = x / y;
        divByZero = true;
    :: else ->
        skip
    fi
    printf("%d\n", sum);
    printf("%d\n", x);
}
