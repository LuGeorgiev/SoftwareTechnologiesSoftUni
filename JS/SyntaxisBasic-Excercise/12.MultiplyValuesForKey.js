/* jshint esversion: 6*/
function multiplyKeyValue(args) {
    const kvp = {};
    for (const line of args) {
        const currentKVP = line.split(' ');
        if (currentKVP.length === 1) {
            //print result
            if (!(currentKVP in kvp)) {
                console.log('None');
                return;

            } else {
                //print all results
                const valuesInKVP = kvp[currentKVP];
                for (const iterator of valuesInKVP) {
                    console.log(iterator);
                }
                return;
            }
        } else {
            //initialize and ADD in Key Value of array
            if (!(currentKVP[0] in kvp)) {
                //initialize KVP
                kvp[currentKVP[0]] = [];
            }
            kvp[currentKVP[0]].push(currentKVP[1]);
        }
    }
}
multiplyKeyValue([
    'key value',
    'key eulav',
    'test tset',
    'key'
]);