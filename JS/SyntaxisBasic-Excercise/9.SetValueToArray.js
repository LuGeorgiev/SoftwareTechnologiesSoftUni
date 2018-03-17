/*jshint esversion: 6 */
function solve(args) {
    const length = +args[0];
    const arr = [];
    for (let index = 0; index < length; index++) {
        arr.push(0);
    }

    for (let index = 1; index < args.length; index++) {
        const input = args[index].split(' - ')
            .map(Number);
        arr[input[0]] = input[1];
    }
    for (const iterator of arr) {
        console.log(iterator);

    }
}
solve(['3', '0 - 5', '1 - 6', '2 - 7']);