<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인</title>
    <script src="https://kit.fontawesome.com/c3df4d7d1c.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="/css/style.css" />
    <link rel="stylesheet" href="/css/login.css" />
</head>
<body>
    <nav id="header">
        <a href="index" id="mainlogo"><i id="logo" class="fab fa-adn"></i> Junil blog</a>
    </nav>
    <div id="container">
        <div id="login_content">
            <form id="loginform" method="post" action="loginCheck">
            	<input type="hidden" id="loginflag" name="login_flag" value="${loginModel.login_flag }">
                <div class="id_area">
                    <div class="input_row">
                        <span class="input_box">
                            <input type="text" id="id" class="input_text" placeholder="아이디" name="login_id" value="${loginModel.login_id }">
                        </span>
                    </div>
                </div>
                <div id="id_error" class="error">아이디를 입력해 주세요.</div>

                <div class="pwd_area">
                    <div class="input_row">
                        <span class="input_box">
                            <input type="password" id="pwd" class="input_text" placeholder="비밀번호" name="login_pwd">
                        </span>
                    </div>
                </div>
                <div id="pwd_error" class="error">비밀번호를 입력해 주세요.</div>
				<input type="hidden" id="submitflag" name="submit_flag" value="false">
                <input type="button" class="input_submit" value="로그인"></botton>

                <div class="check_info">
                    <div class="login_check">
                        <span>
                            <input type="checkbox" id="id_check">
                            <label class="login_ch_text">로그인 상태 유지</label>
                        </span>
                        <a>IP 보안 OFF</a>
                    </div>
                </div>
            </form>


        </div>
    </div>

    <script src="/js/login.js"></script>
</body>
</html>