function splitCoconuts(n) {
  if (n % 2 === 1) {
    return Math.pow(n, n) - (n - 1);
  } else {
    return (n - 1) * (Math.pow(n, n) - 1);
  }
}
