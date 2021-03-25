//console.log(a);
//var a=10;


//----------
console.log(a);
//console.log(b);
var a=10;

//let a=10;
var ans = add(10,80);
//var ans2 = add2(2,3,5); //invoke this before function declaration

function add(num1,num2){
    return num1+num2;
}

//function reference
var add2 = function(a,b,c){
return a+b+c ;
}

var ans2 = add2(2,3,5);


//invoke this before function declaration
var add3 = (a,b) => a+b;
var ans3 =add3(45,56);