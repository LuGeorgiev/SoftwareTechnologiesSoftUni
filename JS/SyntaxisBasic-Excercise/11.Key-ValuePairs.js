/* jshint esversion: 6*/
function KeyValue(args) {
    const kvp = {};
    for (const line of args) {
        const currentKVP = line.split(' ');
        if (currentKVP.length === 1) {
            if (!(currentKVP in kvp)) {
                console.log('None');
                return;

            } else {
                console.log(kvp[currentKVP]);
                return;
            }
        } else {
            kvp[currentKVP[0]] = currentKVP[1];
        }
    }
}
KeyValue([
    'key value',
    'key eulav',
    'test tset',
    '6'
]);