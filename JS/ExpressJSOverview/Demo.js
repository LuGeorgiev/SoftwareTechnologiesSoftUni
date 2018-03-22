/*jshint esversion: 6*/

//from lectures ToBE RE-written
const http = require('express');
const app = express();

app.get('/', (req, res) => {
    res.end('hello word');
});