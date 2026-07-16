init {
    bool divByZero = false;
    bool inLoop = false;
    bool exitLoop = false;
    int sum = 0;
    int i = 1;
    int x = 10;
    int y = 0;
    loop_0:
    do
    :: (i < 5) ->
        goto loop_0
    :: else -> break
    od
    if
    :: (y != 0) ->
        skip
    :: else ->
        skip
    fi
    printf("%d\n", sum);
    printf("%d\n", x);
}
