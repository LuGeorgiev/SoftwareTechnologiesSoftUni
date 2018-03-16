/*jshint esversion: 6 */
function solve(args) {
    const nums = args.split(' ')
        .map(x => Number(x));
    let minusCounter = 0;

    for (const num of nums) {
        if (num < 0) {
            minusCounter += 1;
        }
    }

    if (minusCounter % 2 === 0) {
        console.log('Positive');
    } else {
        console.log('Negative');
    }
}

solve('2 3 -1');
solve('2 3 4');
solve('-2 -3 -1');