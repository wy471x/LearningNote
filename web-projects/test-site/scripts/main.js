//let myHeading = document.querySelector('h1');
//myHeading.textContent = 'Hello world!';

let myImage = document.querySelector('img');

myImage.onclick = function(){
    let mySrc = myImage.getAttribute('src');
    if(mySrc === 'images/images.jpg'){
      myImage.setAttribute('src','images/hello_world.jpg');
    }else{
      myImage.setAttribute('src','images/images.jpg');
    }
}

let myButton = document.querySelector('button');
let myHeading = document.querySelector('h1');

function setUserName() {
    let myName = prompt('请输入你的名字。');
    if(!myName || myName === null){
        setUserName();
    }else{
        localStorage.setItem('name',myName);
        myHeading.textContent = 'Welcome to my homepage ,' + myName;
    }
}

if(!localStorage.getItem('name')){
    setUserName();
}else{
    let storedName = localStorage.getItem('name');
    myHeading.textContent = 'Welcome to my homepage ,' + storedName;
}

myButton.onclick = function(){
    setUserName();
}

