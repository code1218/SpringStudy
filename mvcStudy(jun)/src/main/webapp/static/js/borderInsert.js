const borderinsertform = document.querySelector("#borderinsertform");
const submitFlag = document.querySelector("#submitFlag");
const insertButton = document.querySelector("#insertButton");

insertButton.onclick=()=>{
	submitFlag.value = "true";
	borderinsertform.submit();
}