% Define a predicate to check if a number is prime.
is_prime(N) :-
    % Check if N is divisible by any number from 2 to the square root of N.
    between(2, sqrt(N), I),
    % If N is divisible by any number from 2 to the square root of N, then it is not prime.
    \+ (0 is N mod I).

% Define a predicate to generate all prime numbers up to a given limit.
generate_primes(Limit, Primes) :-
    % Find all numbers from 2 to the limit.
    findall(N, between(2, Limit, N), Numbers),
    % Filter out the numbers that are not prime.
    filter(is_prime, Numbers, Primes).