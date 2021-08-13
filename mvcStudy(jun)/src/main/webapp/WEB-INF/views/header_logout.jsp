<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <header id="mainheader">
            <nav id="navbar">
                <!-- 로고(로고이미지, 홈페이지 이름) -->
                <!-- 메뉴(자기소개, 게시글) -->
                <!-- 링크(로그인, 회원가입) -->
                <a href="index" id="mainlogo"><i id="logo" class="fab fa-adn"></i> Junil blog</a>
                <ul> 
                    <a href="#"><li>블로그소개</li></a>
                    <a href="border"><li>게시글</li></a>
                </ul>
                <div>
                    <span>${loginUserBean.user_name }</span>
                    <a href="logout" class="__links">로그아웃</a>
                </div>
            </nav>
        </header>