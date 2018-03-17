/*jshint esversion: 6 */
function addOrRemoveElements(args) {
    const myArr = [];

    for (const line of args) {
        const command = line.split(' '),
            act = command[0],
            number = +command[1];

        if (act === 'add') {
            myArr.push(number);
        } else if (act === 'remove' && 0 <= number && number < myArr.length) {
            myArr.splice(number, 1);
        }
    }

    for (const iterator of myArr) {
        console.log(iterator);

    }

}
addOrRemoveElements([
    'add 3',
    'add 5',
    'remove 2',
    'remove 0',
    'add 7'
]);