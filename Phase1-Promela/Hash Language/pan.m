#define rand	pan_rand
#define pthread_equal(a,b)	((a)==(b))
#if defined(HAS_CODE) && defined(VERBOSE)
	#ifdef BFS_PAR
		bfs_printf("Pr: %d Tr: %d\n", II, t->forw);
	#else
		cpu_printf("Pr: %d Tr: %d\n", II, t->forw);
	#endif
#endif
	switch (t->forw) {
	default: Uerror("bad forward move");
	case 0:	/* if without executable clauses */
		continue;
	case 1: /* generic 'goto' or 'skip' */
		IfNotBlocked
		_m = 3; goto P999;
	case 2: /* generic 'else' */
		IfNotBlocked
		if (trpt->o_pm&1) continue;
		_m = 3; goto P999;

		 /* PROC main */
	case 3: // STATE 1 - output.pml:13 - [((loopActive==1))] (0:0:0 - 1)
		IfNotBlocked
		reached[0][1] = 1;
		if (!((now.loopActive==1)))
			continue;
		_m = 3; goto P999; /* 0 */
	case 4: // STATE 2 - output.pml:14 - [exitLoop = 1] (0:0:1 - 1)
		IfNotBlocked
		reached[0][2] = 1;
		(trpt+1)->bup.oval = ((int)exitLoop);
		exitLoop = 1;
#ifdef VAR_RANGES
		logval("exitLoop", ((int)exitLoop));
#endif
		;
		_m = 3; goto P999; /* 0 */
	case 5: // STATE 3 - output.pml:15 - [inLoop = 1] (0:0:1 - 1)
		IfNotBlocked
		reached[0][3] = 1;
		(trpt+1)->bup.oval = ((int)inLoop);
		inLoop = 1;
#ifdef VAR_RANGES
		logval("inLoop", ((int)inLoop));
#endif
		;
		_m = 3; goto P999; /* 0 */
	case 6: // STATE 4 - output.pml:16 - [sum = (sum+i)] (0:0:1 - 1)
		IfNotBlocked
		reached[0][4] = 1;
		(trpt+1)->bup.oval = now.sum;
		now.sum = (now.sum+now.i);
#ifdef VAR_RANGES
		logval("sum", now.sum);
#endif
		;
		_m = 3; goto P999; /* 0 */
	case 7: // STATE 5 - output.pml:17 - [i = (i+1)] (0:0:1 - 1)
		IfNotBlocked
		reached[0][5] = 1;
		(trpt+1)->bup.oval = now.i;
		now.i = (now.i+1);
#ifdef VAR_RANGES
		logval("i", now.i);
#endif
		;
		_m = 3; goto P999; /* 0 */
	case 8: // STATE 6 - output.pml:19 - [((i>5))] (0:0:0 - 1)
		IfNotBlocked
		reached[0][6] = 1;
		if (!((now.i>5)))
			continue;
		_m = 3; goto P999; /* 0 */
	case 9: // STATE 7 - output.pml:20 - [loopActive = 0] (0:0:1 - 1)
		IfNotBlocked
		reached[0][7] = 1;
		(trpt+1)->bup.oval = now.loopActive;
		now.loopActive = 0;
#ifdef VAR_RANGES
		logval("loopActive", now.loopActive);
#endif
		;
		_m = 3; goto P999; /* 0 */
	case 10: // STATE 18 - output.pml:27 - [inLoop = 0] (0:0:1 - 5)
		IfNotBlocked
		reached[0][18] = 1;
		(trpt+1)->bup.oval = ((int)inLoop);
		inLoop = 0;
#ifdef VAR_RANGES
		logval("inLoop", ((int)inLoop));
#endif
		;
		_m = 3; goto P999; /* 0 */
	case 11: // STATE 19 - output.pml:29 - [((y==0))] (0:0:0 - 1)
		IfNotBlocked
		reached[0][19] = 1;
		if (!((now.y==0)))
			continue;
		_m = 3; goto P999; /* 0 */
	case 12: // STATE 20 - output.pml:30 - [divByZero = 1] (0:0:1 - 1)
		IfNotBlocked
		reached[0][20] = 1;
		(trpt+1)->bup.oval = ((int)divByZero);
		divByZero = 1;
#ifdef VAR_RANGES
		logval("divByZero", ((int)divByZero));
#endif
		;
		_m = 3; goto P999; /* 0 */
	case 13: // STATE 22 - output.pml:32 - [sum = (x/y)] (0:0:1 - 1)
		IfNotBlocked
		reached[0][22] = 1;
		(trpt+1)->bup.oval = now.sum;
		now.sum = (now.x/now.y);
#ifdef VAR_RANGES
		logval("sum", now.sum);
#endif
		;
		_m = 3; goto P999; /* 0 */
	case 14: // STATE 25 - output.pml:34 - [printf('%d\\n',sum)] (0:0:0 - 3)
		IfNotBlocked
		reached[0][25] = 1;
		Printf("%d\n", now.sum);
		_m = 3; goto P999; /* 0 */
	case 15: // STATE 26 - output.pml:35 - [-end-] (0:0:0 - 1)
		IfNotBlocked
		reached[0][26] = 1;
		if (!delproc(1, II)) continue;
		_m = 3; goto P999; /* 0 */
	case  _T5:	/* np_ */
		if (!((!(trpt->o_pm&4) && !(trpt->tau&128))))
			continue;
		/* else fall through */
	case  _T2:	/* true */
		_m = 3; goto P999;
#undef rand
	}

