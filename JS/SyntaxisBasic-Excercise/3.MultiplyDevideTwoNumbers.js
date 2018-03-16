/*jshint esversion: 6 */
function devideTwoNumbers(args) {
    let n = +(args[0]);
    let x = +(args[1]);
    if (x >= n) {
        return n * x;

    } else {

        return n / x;
    }
}