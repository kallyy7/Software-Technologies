function PrintLines(nums) {
    for (let i = 0; i < nums.length; i++) {
        if( nums[i]==="Stop"){
            break;
        }

        console.log(nums[i]);
    }
}