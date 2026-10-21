# Coconut Solver

A minimal, self-contained implementation of the "Sailors, Coconuts and a Monkey"
problem: find the smallest starting pile such that N sailors, each splitting the
pile by N overnight and leaving one coconut for a monkey, end with a pile evenly
divisible by N in the morning.

## Solution

The minimum is given in closed form:

- Odd N:  `N^N - (N - 1)`
- Even N: `(N - 1) * (N^N - 1)`

Verified for N = 5 → 3121, N = 6 → 233275, N = 7 → 823537.

## Files

| File                  | Language   | Purpose                          |
|-----------------------|------------|----------------------------------|
| `index.html`          | HTML/CSS/JS| Interactive single-file demo     |
| `split_coconuts.py`   | Python     | Reference implementation + test  |
| `splitCoconuts.ts`    | TypeScript | Typed implementation + verifier  |
| `SplitCoconuts.java`  | Java       | Strongly-typed implementation    |

## Run

- Browser: open `index.html`.
- Python: `python split_coconuts.py`
- TypeScript: compile with `tsc` and import.
- Java: `javac SplitCoconuts.java && java SplitCoconuts`

## References

Rosetta Code. (n.d.). *Sailors, coconuts and a monkey problem*. Retrieved from
https://rosettacode.org/wiki/Sailors,_coconuts_and_a_monkey_problem

OEIS Foundation. (n.d.). *Sequence A002021*. The On-Line Encyclopedia of
Integer Sequences. https://oeis.org/A002021
