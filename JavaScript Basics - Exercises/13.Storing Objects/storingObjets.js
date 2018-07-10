function StoringObjects(nums) {
    for (let i = 0; i < nums.length; i++) {
        let person = nums[i].split(" -> ");
        let name = person[0];
        let age = person[1];
        let grade = person[2];

        console.log(`Name: ${name}`);
        console.log(`Age: ${age}`);
        console.log(`Grade: ${grade}`);
    }
}