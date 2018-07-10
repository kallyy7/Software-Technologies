function multiplyDivideNum(num) {
    let firstNumbers=Number(num[0]);
    let secondNumber=Number(num[1]);

    let result;
    
    if (secondNumber>=firstNumbers){
        result = secondNumber * firstNumbers;
    }else {
        result = firstNumbers / secondNumber;
    }

    console.log(result);
}