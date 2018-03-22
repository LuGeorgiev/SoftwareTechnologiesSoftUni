/*jshint esversion: 6*/
const Calculator = require('../models/Calculator');
module.exports = {
    indexGet: (req, res) => {
        res.render('home/index');
    },
    indexPost: (req, res) => {
        let calculatorBody = req.body;
        let calculatorParams = calculatorBody['calculator'];

        let calculator = new Calculator();
        calculator.operator = calculatorParams.operator;
        calculator.leftOperand = Number(calculatorParams.leftOperand);
        calculator.rightOperand = Number(calculatorParams.rightOperand);

        let result = calculator.calculateResult();
        res.render('home/index', { 'calculator': calculator, 'result': result });
    }

};