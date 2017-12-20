var isPrime = function (n) {
    if (n < 4 && n > 1) {
        return true;
    }

    var i = 2;
    var sqrt = Math.sqrt(n);
    do {
        if (n % i === 0) {
            return false;
        }
    } while (++i <= sqrt);

    return true;
};

var countPrimes = function (n) {
    var count = 0;
    for (var i = 1, length = n - 1; length > i; length--) {
        if (isPrime(length)) {
            console.log('primo ', length);
            count += 1;
        }
    }
    return count;
};

console.log('cantidad :', countPrimes(17));
