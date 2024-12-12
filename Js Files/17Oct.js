// // {
// //   var a = 20;
// // }
// // console.log(a);

// // {
// //   let b = 30;
// // }
// // // console.log(b);

// // {
// //   const c = 40;
// // }

// // console.log(c);

// // let num1 = 30;
// // let num2 = num1;
// // num2 = num2 + 30;
// // // console.log(num2); //60
// // // console.log(num1); //30

// // let array1 = [10, 20, 30, 40];
// // let array2 = array1;
// // array2[2] = 200;
// // console.log(array2); //10,20,200,40
// // console.log(array1); //10,20,30,40

// // let x = 10;
// // let y = x;
// // y = y + 20;
// // console.log(y);
// // console.log(x);

// // let arr1 = [1, 2, 3, 4];
// // let arr2 = [...arr1];
// // arr2[3] = 10;
// // console.log(arr2);
// // console.log(arr1);

// // if (document.write) {
// //   console.log("true");
// // } else {
// //   console.log("false");
// // }

// // setTimeout(() => {
// //   console.log("Boom");
// // }, 10000);

// // setTimeout(() => {
// //   console.log("Boom2");
// // }, 8000);

// // setInterval(() => {
// //   console.log("Chal Chaiya Chaiya");
// // }, 2000);

let x;

async function product(x) {
  let rawData = await fetch("https://dummyjson.com/products/" + x);
  let finalData = await rawData.json();
  console.log(finalData);
}

product(3);
