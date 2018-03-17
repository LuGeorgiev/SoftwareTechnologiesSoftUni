/*jshint esversion: 6 */

//Lab Second task
// function solve() {
//     let val = ((30 + 25) / 3 * (35 - 14 - 12)) ** 2;
//     console.log(val);
// }

//third Lab task
// function solve([nums]) {
//     nums = nums.split(' ').map(x => Number(x));
//     if (nums[0] + nums[1] === nums[2]) {
//         print(nums[0], nums[1], nums[2]);
//     } else if (nums[0] + nums[2] === nums[1]) {
//         print(nums[0], nums[2], nums[1]);
//     } else if (nums[1] + nums[2] === nums[0]) {
//         print(nums[2], nums[1], nums[0]);
//     } else {
//         console.log('No');
//     }

//     function print(n1, n2, n3) {
//         console.log(`${Math.min(n1,n2)} + ${Math.max(n1,n2)} = ${n3}`);
//     }
// }
// solve(['8 15 7']);
// solve(['-3 -2 -5']);
// solve(['0 0 0']);

//Foth Lab NOT FIISED
function solve([n]) {
    n = Number(n);
    for (let index = 1; index < n; index++) {
        let numbersAsString = '' + i;
        if (numbersAsString) {

        }

    }
}

// let str = JSON.stringify(obj);
// let object = JSON.parse(str);

//Fifth Lab
function solve(arr) {
    let input = arr.map(line => JSON.parse(line));
    let towns = {};

    for (const entry of input) {
        if (towns[entry.town] === 'undefined') {
            towns[entry.town] = 0;
        }
        towns[entry.town] += entry.income;
    }
    let townNames = Object.keys(towns).sort();
    for (const name of townNames) {
        console.log(`${name} -> ${towns[name]}`);
    }

}

solve([
    '{"town":"Sofia","income":200}',
    '{"town":"Varna","income":120}',
    '{"town":"Pleven","income":60}',
    '{"town":"Varna","income":70}'
]);

//Sixth Lab