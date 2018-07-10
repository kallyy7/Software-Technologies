function AddOrRemove(nums) {
    let result = [];

    for (let i = 0; i < nums.length; i++) {
        let currentLine = nums[i].split(' ');
        let command = currentLine[0].trim();
        let element = Number(currentLine[1].trim());

        if(command === "add"){
            result.push(element);
        }else{
            result.splice(element, 1)
        }
    }

    console.log(result.join('\n'));
}