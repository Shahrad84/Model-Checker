Require Import Stdlib.Strings.String.
Require Import Stdlib.ZArith.ZArith.

Definition Var := string.
Definition State := Var -> Z.


Inductive Expr : Type :=
  | ENum : Z -> Expr
  | EVar : Var -> Expr
  | EAdd : Expr -> Expr -> Expr
  | ELt  : Expr -> Expr -> Expr.


  Fixpoint evalExpr (e : Expr) (s : State) : Z :=
  match e with
  | ENum n => n
  | EVar x => s x
  | EAdd e1 e2 => (evalExpr e1 s) + (evalExpr e2 s)
  | ELt e1 e2 => if Z.ltb (evalExpr e1 s) (evalExpr e2 s) then 1 else 0
  end.

  
Theorem expr_determinism : forall (e : Expr) (s : State) (v1 v2 : Z),
  evalExpr e s = v1 ->
  evalExpr e s = v2 ->
  v1 = v2.
Proof.
  intros e s v1 v2 H1 H2.
  rewrite <- H1.
  rewrite <- H2.
  reflexivity.
Qed.