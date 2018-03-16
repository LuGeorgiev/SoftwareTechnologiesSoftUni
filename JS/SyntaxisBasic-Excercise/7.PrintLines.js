/*jshint esversion: 6 */
function solve(args) {
    for (const iterator of args) {
        if (iterator === 'Stop') {
            return;
        }
        console.log(iterator);
    }
}