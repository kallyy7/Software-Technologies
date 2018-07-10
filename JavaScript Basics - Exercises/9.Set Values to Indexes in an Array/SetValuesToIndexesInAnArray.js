function setValues(nums) {
    let arrLen = Number(nums[0]);

    let result=[];

    for (let i = 1; i < nums.length; i++) {
        let indexOfDashes = nums[i].indexOf('-');
        let index = Number(nums[i].substr(0,indexOfDashes - 1));
        let element = nums[i].substr(indexOfDashes+1);
        result[index] = element;
    }

        for (let i = 0; i < arrLen; i++) {
            if (result[i] === undefined){
                result[i] = 0;
            }
        }

    console.log(result.join('\n'));
}