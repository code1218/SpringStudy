<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
</head>
<body>
    <div id="container">
    	<jsp:include page="/WEB-INF/views/include/header.jsp"></jsp:include>
        <main>
            <article class="border_contain">
                <div class="border_header"><h1><i class="fas fa-align-left" id="border_icon"></i> 게 시 글</h1></div>
                <div class="border_body">
                    <table class="borderDtl_table">
                        <tr>
                            <th>제목</th>
                            <td colspan="3">${borderDtlModel.border_title }</td>
                        </tr>
                        <tr>
                            <th>작성일</th>
                            <td colspan="3">${borderDtlModel.border_date }</td>
                        </tr>
                        <tr>
                            <th>작성자</th>
                            <td>${borderDtlModel.writer_name }</td>
                            <th>조회수</th>
                            <td>${borderDtlModel.border_count }</td>
                        </tr>
                        <tr>
                            <th>첨부파일</th>
                            <td colspan="3">
                            	<c:forTokens var="fileName" items="${borderDtlModel.border_file }" delims="," varStatus="st">
                            		<a download href="/fileDownload?originName=dddd.jpg&tempName=0sadjf9jd9fj0sdf.jpg">${fileName }</a>
                            		<c:if test="${not st.last }">
                            		/
                            		</c:if>
                            	</c:forTokens>
                             
                            </td>
                        </tr>
                    </table>
                    <pre class="border_content">${borderDtlModel.border_content }</pre>
                    <div class="border_button">
                        <button onclick="location.href='/borderp?page=${borderDtlModel.page }'">목록</button>
                    </div>
                    <table class="borderDtl_table">
                        <tr>
                            <th>이전글</th>
                            <td class="footer_td"><a href="/borderdtl?border_code=${borderDtlModel.border_code_pre }&page=${borderDtlModel.page }">${borderDtlModel.border_title_pre }</a></td>
                        </tr>
                        <tr>
                            <th>다음글</th>
                            <td class="footer_td"><a href="/borderdtl?border_code=${borderDtlModel.border_code_next }&page=${borderDtlModel.page }">${borderDtlModel.border_title_next }</a></td>
                        </tr>
                    </table>
                </div>
            </article>
        </main>
        <jsp:include page="/WEB-INF/views/include/footer.jsp"></jsp:include>
    </div>
</body>
</html>



