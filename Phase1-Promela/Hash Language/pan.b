	switch (t->back) {
	default: Uerror("bad return move");
	case  0: goto R999; /* nothing to undo */

		 /* PROC main */
;
		;
		
	case 4: // STATE 2
		;
		exitLoop = trpt->bup.oval;
		;
		goto R999;

	case 5: // STATE 3
		;
		inLoop = trpt->bup.oval;
		;
		goto R999;

	case 6: // STATE 4
		;
		now.sum = trpt->bup.oval;
		;
		goto R999;

	case 7: // STATE 5
		;
		now.i = trpt->bup.oval;
		;
		goto R999;
;
		;
		
	case 9: // STATE 7
		;
		now.loopActive = trpt->bup.oval;
		;
		goto R999;

	case 10: // STATE 18
		;
		inLoop = trpt->bup.oval;
		;
		goto R999;
;
		;
		
	case 12: // STATE 20
		;
		divByZero = trpt->bup.oval;
		;
		goto R999;

	case 13: // STATE 22
		;
		now.sum = trpt->bup.oval;
		;
		goto R999;
;
		;
		
	case 15: // STATE 26
		;
		p_restor(II);
		;
		;
		goto R999;
	}

