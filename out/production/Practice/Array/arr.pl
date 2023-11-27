male(adam).
male(george).
male(steve).
male(john).
female(alice).
female(anna).
female(eve).
female(steffi).
parent(adam,george).
parent(eve,george).
parent(adam,steffi).
patrent(eve,steffi).
parent(george,john).
parent(steffi,alice).
parent(steve,alice).
mother(X,Y) :- parent(X,Y) , female(X).
father(X,Y):- 	parent(X,Y),male(X).
sister(X,Y):- parent(Z, X), parent( Z, Y ),female(X),X\==Y.
brother(X,Y) :- parent(Z,X) , parent(Z,Y),male(X),X\==Y.
grandfather(X,Z) :- father(X,Y) ,parent(Y,Z) .
grandmother(X,Z) :- mother(X,Y),parent(Y,Z).
siblings(X,Y) :-(brother(X,Y) ; sister(X,Y)),X\==Y.
uncle(X,Y) :- parent(Z,Y),brother(X,Z).
aunty(X,Y) :- parent(Z,Y) , sister(X,Z).
cousin(X,Y) , parent(A,X),parent(B,Y) , siblings(A,B).

