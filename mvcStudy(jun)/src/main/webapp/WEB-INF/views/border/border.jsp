<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
</head>
<body>
    <div id="container">
    	<jsp:include page="/WEB-INF/views/include/header.jsp"></jsp:include>
        <main>
            <article class="border_contain">
                <div class="border_header"><h1><i class="fas fa-align-left" id="border_icon"></i> 게 시 글</h1></div>
                <c:choose>
                	<c:when test="${empty loginUserBean }">
                		<c:set var="display" value="none"></c:set>
                	</c:when>
                	<c:otherwise>
                		<c:set var="display" value="flex"></c:set>
                	</c:otherwise>
                </c:choose>
                <div class="border_insert_button" style="display: ${display };">
                	<button onclick="location.href='/borderinsert'">글쓰기</button>
                </div>
                <div class="border_body">
                    <table class="border_table">
                        <tr class="row_header">
                           <th class="border_index">번호</th>
                           <th class="border_title">제목</th>
                           <th class="border_writer">작성자</th>
                           <th class="border_date">작성일</th>
                           <th class="border_count">조회수</th> 
                        </tr>
                        <c:forEach var="bean" items="${borderModel.borderList }">
                        	<tr>
	                            <td class="border_index">${bean.border_code }</td>
	                            <td class="border_title"><a href="borderdtl?border_code=${bean.border_code }&page=${borderModel.page }">${bean.border_title }</a></td>
	                            <td class="border_writer">${bean.writer_name }</td>
	                            <td class="border_date">${bean.border_date }</td>
	                            <td class="border_count">${bean.border_count }</td>
                        	</tr>
                        </c:forEach>
                        
                    </table>
                </div>
                
                <div class="border_footer">
                    <div class="this_page">
                        <span>${borderModel.page }</span> / <span>${borderModel.totalPage }</span> pages
                      
                    </div>
                    <div class="select_page">
                        <span><a href=borderp?page=${borderModel.pageStart - 1 eq 0 ? 1 : borderModel.pageStart - 1}><i class="fas fa-angle-left"></i></a></span>
                       
                        <c:forEach var="i" begin="${borderModel.pageStart }" end="${borderModel.pageEnd }">
                        	<span><a href=borderp?page=${i }>${i }</a></span>
                        </c:forEach>
                        
                        <span><a href=borderp?page=${borderModel.pageEnd eq borderModel.totalPage ? borderModel.pageEnd : borderModel.pageEnd+1 }><i class="fas fa-angle-right"></i></a></span>
                        
                    </div>
                    <div class="search">
                    	<form method="get" action="borderSearch">
                    		<select name="searchFilter">
                    			<option value="all">전체</option>
                    			<option value="title">제목</option>
                    			<option value="content">내용</option>
                    			<option value="writer">작성자</option>
                    		</select>
                    		<input type="search" name="border_search"> <button type="submit">검색</button>
                    	</form>
                    </div>
                    
                </div>
            </article>
        </main>
        <jsp:include page="/WEB-INF/views/include/footer.jsp"></jsp:include>
    </div>
</body>
</html>