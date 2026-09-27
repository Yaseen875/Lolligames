const box = document.getElementById("box");
const list = document.getElementById("list");

function add(){
    if(box.value === ''){
        alert("You have to insert player's name!")
    }
    else{
        let li = document.createElement("li");
        li.innerHTML = box.value;
        list.appendChild(li);
    }
    box.value = '';
}

box.addEventListener("keypress", function(event){
    if(event.key === "Enter"){
        add();
    }
});