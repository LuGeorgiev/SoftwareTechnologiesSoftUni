/* jshint esversion: 6*/
function stringObjects(args) {
    class Student {
        constructor(name, age, grade) {
            this._name = name;
            this._age = age;
            this._grade = grade;
        }
    }
    const students = [];

    for (const line of args) {
        const currentStudent = line.split(/ -> /);
        const name = currentStudent[0],
            age = currentStudent[1],
            grade = currentStudent[2];
        students.push(new Student(name, age, grade));
    }

    for (const student of students) {
        console.log(`Name: ${student._name}`);
        console.log(`Age: ${student._age}`);
        console.log(`Grade: ${student._grade}`);
    }
}
stringObjects([
    'Pesho -> 13 -> 6.00',
    'Ivan -> 12 -> 5.57',
    'Toni -> 13 -> 4.90'
]);