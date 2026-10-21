export function splitCoconuts(n: number): number {
  if (!Number.isInteger(n) || n < 1) {
    throw new RangeError("n must be a positive integer");
  }
  const base = Math.pow(n, n);
  return n % 2 === 1 ? base - (n - 1) : (n - 1) * (base - 1);
}

export function verify(start: number, n: number): boolean {
  let pile = start;
  for (let i = 0; i < n; i++) {
    if ((pile - 1) % n !== 0) return false;
    pile = pile - 1 - Math.floor((pile - 1) / n);
  }
  return pile % n === 0;
}
