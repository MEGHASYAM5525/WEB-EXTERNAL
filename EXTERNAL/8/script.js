function validateForm() {
    const male = document.getElementById("male");
    const female = document.getElementById("female");
    if(!(male.checked || female.checked)) {
        alert("Please select your gender!!!");
        return false;
    }
    const hobby = document.getElementById("hobby");
    if(hobby.value == "---") {
        alert("Please select a hobby");
        return false;
    }
    return true;
}