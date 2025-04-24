let register = document.querySelector("#btn-register")
let inputRegister = document.querySelector("#input-register")
let listRegisters = document.querySelector("#list-registers");
let remove = document.querySelector("btn-remove")

// Criamos um valor na memória em que é atribuído o método createElement com o nome da tag que queira criar

register.addEventListener("click", ()=>{
    let newUser = document.createElement("li")
    newUser.textContent = inputRegister.value
    listRegisters.append(newUser)
    inputRegister.value = " "
})
