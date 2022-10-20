export let car = "BMW";

export function HelloWorld(){
console.log("Hello");
}



--------


import * as Car from "./data";

console.log(Car);
Car.HelloWorld();