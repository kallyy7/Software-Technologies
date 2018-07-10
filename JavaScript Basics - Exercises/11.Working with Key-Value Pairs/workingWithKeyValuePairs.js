function solve(nums) {
    let pairs = {};
    let result;

    for (let i = 0; i < nums.length; i++) {
        let pair = nums[i].split(' ');
        let key = pair[0];
        let value = pair[1];

        if(value === undefined){
            result  = pairs[key];
        }
        pairs[key] = value;
    }

    if(result === undefined){
        console.log("None")
    }else {
        console.log(result);
    }
}
