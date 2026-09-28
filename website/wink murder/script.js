const nameinput = document.getElementById("nameinput");
const list = document.getElementById("list");
const num = document.getElementById("num");
const namesss = document.getElementById("name");
const main1 = document.getElementById("main1");
const main2 = document.getElementById("main2");


function add(){
    if(nameinput.value === ''){
        alert("You have to insert player's name!")
    }
    else{
        let li = document.createElement("li");
        li.innerHTML = nameinput.value;
        list.appendChild(li);
    }
    nameinput.value = '';
}

nameinput.addEventListener("keypress", function(event){
    if(event.key === "Enter"){
        add();
    }
});



function names(){
    namesss.style.backgroundColor = '#ff9d50';
    num.style.backgroundColor = 'rgb(171, 171, 171)';
    main1.style.display = 'block';
    main2.style.display = 'none';
}

function nums(){
    num.style.backgroundColor = '#ff9d50';
    namesss.style.backgroundColor = 'rgb(171, 171, 171)';
    main1.style.display = 'none';
    main2.style.display = 'block';
}