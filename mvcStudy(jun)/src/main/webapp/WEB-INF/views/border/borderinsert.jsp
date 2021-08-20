<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Junil blog</title>
    <script src="https://kit.fontawesome.com/c3df4d7d1c.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.css" />
    <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css" />
    <link rel="stylesheet" href="/css/style.css" />
    <link rel="stylesheet" href="/css/border.css" />
    <link rel="stylesheet" href="/css/borderdtl.css" />
    <link rel="stylesheet" href="/css/borderinsert.css" />
</head>
<body>
    <div id="container">
    	<jsp:include page="/WEB-INF/views/include/header.jsp"></jsp:include>
        <main>
            <form id="borderinsertform" method="post" action="/borderdatainsert" enctype="multipart/form-data">
                <article class="border_contain">
                    <div class="border_header"><h1><i class="fas fa-align-left" id="border_icon"></i> 게 시 글</h1></div>
                    <div class="border_body">
                        <table class="borderDtl_table">
                            <tr>
                                <th>제목</th>
                                <td colspan="3">
                                    <input type="text" class="border_text" name="border_title">
                                </td>
                            </tr>
                            <tr>
                                <th>작성자</th>
                                <input type="hidden" name="user_name" value="${loginUserBean.user_name }">
                                <td>${loginUserBean.user_name }</td>
                                <th>첨부파일</th>
                                <td>
                                	<input type="file" multiple="multiple" name="file"><br>
                                	<!-- 
                                	<input type="file" name="file"><br>
                                	<input type="file" name="file"><br>
                                	 -->
                                </td>
                            </tr>
                        </table>
                        <div>
                            <textarea class="content_textarea" name="content_textarea"></textarea>
                        </div>
                        <div class="border_button">
                        	<input type="hidden" id="submitFlag" name="submitFlag" value="false">
                            <button id="insertButton">작성하기</button> 
                            <button type="reset">다시작성</button>
                        </div>
                    </div>
                </article>
            </form>
        </main>
		<jsp:include page="/WEB-INF/views/include/footer.jsp"></jsp:include>
    </div>
    <script src="/js/borderInsert.js"></script>
</body>
</html>





