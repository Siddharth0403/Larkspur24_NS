// let x = 5;
// while (x < 10) {
//   console.log(x);
//   x++;
// }

// let y = 10;
// do {
//   console.log("Hello" + y);
//   y++;
// } while (y > 15);

// Array

// let arr2 = [1, 2, 3, 4, 5];
// // arr2.push(100);
// // arr2.pop();
// // arr2.unshift(100);
// // arr2.shift();
// // arr2.splice(1, 1);
// console.log(arr2);

// functions

// function print() {
//   console.log("Hello"); // code to be executed
// }

// print();

function add(x, y) {
  console.log("addition = " + x + y);
}
function sub(x, y) {
  console.log(x - y);
}
function multiply(x, y) {
  console.log(x * y);
}
function divide(x, y) {
  console.log(x / y);
}

// add(5, 4);
// sub(10, 7);
// multiply(3, 9);
// divide(10, 2);

let bottle = {
  brand: "Dmart",
  price: 21,
  color: "Orange",
  haveStraw: false,
  print: function details() {
    console.log(
      "This bottle is of " + this.brand + " and its price is " + this.price
    );
  },
};

// bottle.haveStraw = true;
// console.log(bottle.haveStraw);
// console.log(bottle.print);
// bottle.print();

let arr = [1, 2, "Hello", 4, true];
// arr[2] = "TestingShastra";
arr[-1] = "Impossible";
console.log(arr);

let arr3 = [1, 2, 3, 4, 5];
arr3[3] = 10;
arr3[4] = arr3[3];
console.log(arr3);
