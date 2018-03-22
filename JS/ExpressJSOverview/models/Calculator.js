/*jshint esversion: 6*/
function Calculator(leftOperand, operator, rightOperand) {
    this.leftOperand = leftOperand;
    this.operator = operator;
    this.rightOperand = rightOperand;

    this.calculateResult = function() {
        let result = 0;

        switch (this.operator) {
            case '+':
                result = this.leftOperand + this.rightOperand;
                break;
            case '-':
                result = this.leftOperand - this.rightOperand;
                break;
            case '*':
                result = this.leftOperand * this.rightOperand;
                break;
            case '/':
                result = this.leftOperand / this.rightOperand;
                break;
        }
        return result;
    };
}
// const myCaklk = new Calculator('+', 5, 3);   // UNIT TEST :))
// console.log(myCaklk.calculate());

module.exports = Calculator;