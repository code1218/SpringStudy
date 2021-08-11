const join_text = document.querySelectorAll(".join_text");
const join_warning = document.querySelectorAll(".join_warning");

const joinform = document.querySelector("#joinform");
const idstatus = document.querySelector("#idstatus");
const id_text = document.querySelector("#id_text");
const pwd_text = document.querySelector("#pwd_text");
const repwd_text = document.querySelector("#repwd_text");
const name_text = document.querySelector("#name_text");
const birth_year = document.querySelector("#birth_year");
const birth_month = document.querySelector("#birth_month");
const birth_day = document.querySelector("#birth_day");
const submitflag = document.querySelector("#submitflag");
const submitbtn = document.querySelector(".join_button");

if(idstatus.value == "true"){
	alert(id_text.value + "(은)는 이미 존재하는 아이디 입니다.");
}

for(let i = 1; i < join_text.length - 1; i++){
    join_text[i].onblur = () => {
        if(join_text[i].value.length == 0){
            join_warning[i].style.display = "block";
        }else { 
            join_warning[i].style.display = "none";
        }
    }
}

id_text.onblur = () => {
	if(id_text.value.length == 0){
        join_warning[0].style.display = "block";
    }else { 
        join_warning[0].style.display = "none";
		joinform.submit();
    }
	
}

submitbtn.onclick = () => {
	if(idstatus.value == "true"){
		alert(id_text.value + "(은)는 이미 존재하는 아이디 입니다.");
		return;
	}else if(id_text.value == "" || id_text.value == null){
		alert("아이디를 입력해 주세요.");
		return;
	}else if(pwd_text.value == null || pwd_text.value == ""){
		alert("비밀번호는 공백을 입력할 수 없습니다.");
		return;
	}else if(repwd_text.value == null || repwd_text.value == ""){
		alert("비밀번호는 공백을 입력할 수 없습니다.");
		return;
	}else if(pwd_text.value != repwd_text.value){
		alert("비밀번호가 일치하지 않습니다. 다시 입력하세요.");
		return;
	}else if(name_text.value == null || name_text.value == ""){
		alert("이름을 입력해 주세요.");
		return;
	}else if(birth_year.value == null || birth_year.value == ""){
		alert("년도를 입력해 주세요.(예: 2021)");
		return;
	}else if(birth_month.value == 0){
		alert("월을 선택해 주세요.");
		return;
	}else if(birth_day.value == null || birth_day.value == ""){
		alert("일자를 입력해 주세요.(예: 1 ~ 31)");
		return;
	}
	
	submitflag.value = "true";
	joinform.submit();
}