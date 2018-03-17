/*jshint esversion: 6 */
function turnIntoJSON(args) {
    const person = {};
    for (const line of args) {
        const kvp = line.split(/ -> /);
        if (kvp[0] == 'grade' || kvp[0] == 'age') {
            person[kvp[0]] = parseInt(kvp[1]);
        } else {
            person[kvp[0]] = kvp[1];
        }
    }
    console.log(JSON.stringify(person));
}