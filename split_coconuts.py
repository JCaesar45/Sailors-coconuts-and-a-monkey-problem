def split_coconuts(n: int) -> int:
    if n < 1:
        raise ValueError("n must be a positive integer")
    base = pow(n, n)
    if n % 2 == 1:
        return base - (n - 1)
    return (n - 1) * (base - 1)


def verify(start: int, n: int) -> bool:
    pile = start
    for _ in range(n):
        if (pile - 1) % n != 0:
            return False
        pile = pile - 1 - (pile - 1) // n
    return pile % n == 0


if __name__ == "__main__":
    for k in range(1, 10):
        ans = split_coconuts(k)
        print(k, ans, verify(ans, k))
