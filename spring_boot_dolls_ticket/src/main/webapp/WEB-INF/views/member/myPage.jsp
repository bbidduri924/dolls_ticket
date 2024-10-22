<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>마이페이지</title>
    	<c:import url="/WEB-INF/views/layout/top.jsp"/>
		<c:import url="/WEB-INF/views/layout/head.jsp"/>
		<link rel="stylesheet" type="text/css" href="<c:url value='/css/mypage.css'/>">
		<link rel="stylesheet" type="text/css" href="<c:url value='/css/footer.css'/>">
		<link rel="stylesheet" type="text/css" href="<c:url value='/css/font5.css'/>">
		<script src="jquery-3.6.0.min.js"></script>
		<script type="text/javascript">	</script>
</head>
<body>

    <div class="container">
        <!-- 사이드바 -->
        <div class="sidebar">
            <div class="info-box">
                <p class="title">나의 정보</p>
                <br>
                <p>회원님은 VIP입니다.</p>
                <p>남은 좌석수: <strong>3</strong></p>
                <p>예매 횟수: <strong>1</strong></p>
            </div>
            <div class="categories">
                <h3>카테고리</h3><br>
	                <ul>
	                    <li><a href="/member/correctionMember">회원정보 변경</a></li>
	                    <li><a href="/booking/confirm">예매확인/관람내역</a></li>
	                </ul>              
            </div>
            <div class="customer-service"> 
                <h3>고객센터</h3>
                <br>
                <h1>1544-5555</h1>
                <br>
                <p>평일: 09:00 ~ 18:00<br>주말 공휴일 휴무</p>
            </div>
        </div>

        <!-- 메인 컨텐츠 -->
        <div class="main-content">
            <!-- 이벤트 내역 -->
            <div class="section">
                <h2>나의 이벤트 내역</h2>
                <div class="info-box">
                    <p>최근 이벤트 내역이 없습니다.</p>
                </div>
            </div>

            <!-- 이미지 영역 -->
            <div class="section">
                <h2>이미지</h2>
                <div class="image-placeholder">Image</div>
            </div>

            <!-- 관람 내역 -->
            <div class="section">
                <h2>나의 관람 내역</h2>
                <div class="info-box">
                    <p>최근 관람내역이 없습니다.</p>
                </div>
            </div>

            <!-- 알림 -->
            <div class="section">
                <h2>나의 알림 소식</h2>
                <div class="info-box">
                    <p>티켓오픈 알림: 최근 소식이 없습니다.</p>
                </div>
            </div>
        </div>
    </div>
    <c:import url="/WEB-INF/views/layout/footer.jsp"/>
</body>
</html>
 