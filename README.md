# Millionth-Fibonacci
Obtains the nth Fibonacci number in the Fibonacci Sequence for a very large n. The number n can be both negative and positive.

There is a clever algorithm for computing the Fibonacci numbers in a logarithmic number of steps. Call the transformation of the state variables a and b,  a <- a + b and b <- a, T. Observe that applying T over and over again n times, starting with 1 and 0, produces the pair fib(n + 1) and fib(n). In other words, the Fibonacci numbers are produced by applying Tn, the nth power of the transformation T, starting with the pair (1,0). Now consider T to be the special case of p = 0 and q = 1 in a family of transformations Tpq, where Tpq transforms the pair (a,b) according to a <- bq + aq + ap and b <- bp + aq. We can show that if we apply such a transformation Tpq twice, the effect is the same as using a single transformation Tp'q' of the same form, and compute p' and q' in terms of p and q. This gives us an explicit way to square these transformations, and thus we can compute Tn using successive squaring.

See: https://web.archive.org/web/20220614001843/https://mitpress.mit.edu/sites/default/files/sicp/full-text/book/book-Z-H-11.html#%_sec_1.2.4

There is a file that implements the scheme in the above website in Java. 

This is also a solution to the 3 kyu question on Codewars called "The Millionth Fibonacci"
