/* jshint esversion: 6*/
function parseJSON(args) {
    const students = args.map(JSON.parse);


    for (const student of students) {
        console.log(`Name: ${student.name}`);
        console.log(`Age: ${student.age}`);
        console.log(`Date: ${student.date}`);
    }
}
parseJSON([
    '{ "name": "Gosho", "age": 10, "date": "19/06/2005" }',
    '{ "name": "Tosho", "age": 11, "date": "04/04/2005" }'
]);