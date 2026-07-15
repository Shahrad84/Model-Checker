init {
    int sum = 0;
    int i = 1;
    loop_0:
    do
    :: (i < 5) ->
        goto loop_0
    :: else -> break
    od
    printf("%d\n", sum);
}
