% Facts:
% football(ronaldo).
% red(rose).
% father(john,bob).

% Rules:
% mother(X,Y) :- parent(X,Y),female(X).

batsman(Dhoni).
bowler(Kohli).
keeper(Chahal).
cricketer(X) :- batsman(X);bowler(X);keeper(X).
