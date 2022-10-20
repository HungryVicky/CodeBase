let ageOfPerson;
let formIndia;

ageOfPerson = window.prompt("Enter your age ");
ageOfPerson = Number(ageOfPerson);
formIndia = window.prompt("Where are you form");
formIndia = formIndia.toUpperCase();

if (ageOfPerson >= 18 && formIndia == "INDIA") {
    console.log("You can vote");
}
else if (!formIndia == "INDIA") {
    console.log(`Not For` + formIndia + ` country `)
}
else if (ageOfPerson < 18) {
    console.log('you are under 18 ')
}
else {
    console.log(`Not For $(formIndia) country `)
}





