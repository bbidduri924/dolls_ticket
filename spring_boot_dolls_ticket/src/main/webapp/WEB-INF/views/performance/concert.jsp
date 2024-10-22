<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>concert page</title>
		<c:import url="/WEB-INF/views/layout/top.jsp"/>
		<c:import url="/WEB-INF/views/layout/head.jsp"/>
		<link rel="stylesheet" type="text/css" href="<c:url value='/css/body.css'/>">
		<link rel="stylesheet" type="text/css" href="<c:url value='/css/concert.css'/>">
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.css"/>
		<script src="<c:url value='/js/jquery-3.7.1.min.js'/>"></script>
		<script src="<c:url value='/js/body.js'/>"></script>
	</head>
	<body>
	<div class="swiper mySwiper">
	    <div class="swiper-wrapper">
	      <div class="swiper-slide">
				<a href="<c:url value='/performance/detailViewPerformance/P0001'/>"><img src="<c:url value='/image/c_banner1.jfif'/>">
				<div class="slide-txt">
						<p class="slide-tit">2024 나훈아 콘서트</p>
						<p class="slide-detail">2024.12.14 ~ 2024.12.15</p>
				</div></a>
		  </div>
			<div class="swiper-slide">
				<a href="<c:url value='/performance/detailViewPerformance/P0005'/>"><img src="<c:url value='/image/c_banner2.jfif'/>">
				<div class="slide-txt">
						<p class="slide-tit">2024 NE-YO 콘서트</p>
						<p class="slide-detail">2024.11.16 ~ 2024.11.17</p>
				</div></a>
		  </div>
			<div class="swiper-slide">
				<a href="<c:url value='/performance/detailViewPerformance/P0004'/>"><img src="<c:url value='/image/c_banner3.jfif'/>">
				<div class="slide-txt">
						<p class="slide-tit">2024 적재 콘서트</p>
						<p class="slide-detail">2024.11.09 ~ 2024.11.10</p>
				</div></a>
			</div>
			<div class="swiper-slide">
				<a href="<c:url value='/performance/detailViewPerformance/P0006'/>"><img src="<c:url value='/image/c_banner4.jfif'/>">
				<div class="slide-txt">
						<p class="slide-tit">2024 이찬원 콘서트</p>
						<p class="slide-detail">2024.12.14 ~ 2024.12.15</p>
				</div></a>
			</div>
			<div class="swiper-slide">
				<a href="<c:url value='/performance/detailViewPerformance/P0007'/>"><img src="<c:url value='/image/c_banner5.jfif'/>">
				<div class="slide-txt">
						<p class="slide-tit">2024 송골매 콘서트</p>
						<p class="slide-detail">2024.11.16 ~ 2024.11.17</p>
				</div></a>
			</div>
	      <div class="swiper-slide">
				<a href="<c:url value='/performance/detailViewPerformance/P0008'/>"><img src="<c:url value='/image/c_banner6.jfif'/>">
				<div class="slide-txt">
						<p class="slide-tit">박진영 30주년 콘서트〈Still JYP〉</p>
						<p class="slide-detail">2024.12.28 ~ 2024.12.29</p>
				</div></a>
			</div>
	    </div>
  	</div>
  	
	<h1>NOW OPEN</h1>
		<table id="initialTable">
			<tr>
				<td class="ranking">
					<div class="info">
					<a href="<c:url value='/performance/detailViewPerformance/P0001'/>"><img src="<c:url value='/image/P0001.jpg'/>">
						<div class="info-txt">
						<p class="info-txt1">나훈아 ‘2024 고마웠습니다-라스트 콘서트(LAST CONCERT)’</p>
						<p class="info-txt2">올림픽홀</p>
						</div></a>
				</div>
			</td>
				<td class="ranking">
					<div class="info">				
						<a href="<c:url value='/performance/detailViewPerformance/P0002'/>"><img src="<c:url value='/image/P0002.PNG'/>">
							<div class="info-txt">
							<p class="info-txt1">랑랑 피아노 리사이틀</p>
							<p class="info-txt2">샤롯데씨어터</p>
							</div></a>			
					</div>	
				</td>
				<td class="ranking">
					<div class="info">
						<a href="<c:url value='/performance/detailViewPerformance/P0005'/>"><img src="<c:url value='/image/P0005.PNG'/>">
							<div class="info-txt">
							<p class="info-txt1">NE-YO Champagne & Roses Tour in SEOUL</p>
							<p class="info-txt2">올림픽홀</p>
							</div></a>							
					</div>
				</td>
				<td class="ranking">
					<div class="info">
						<a href="<c:url value='/performance/detailViewPerformance/P0007'/>"><img src="<c:url value='/image/P0007.jpg'/>">
							<div class="info-txt">
							<p class="info-txt1">2024 송골매 콘서트 ‘열망’ 두번째 [늘-봄]</p>
							<p class="info-txt2">올림픽홀</p>
							</div></a>						
					</div>
				</td>
			</tr>
			
			<tr>
				<td class="ranking">
					<div class="info">
						<a href="<c:url value='/performance/detailViewPerformance/P0006'/>"><img src="<c:url value='/image/P0006.jpg'/>">
							<div class="info-txt">
							<p class="info-txt1">2024 이찬원 콘서트 ‘ 찬가（燦歌）’</p>
							<p class="info-txt2">올림픽홀</p>
							</div></a>								
					</div>
				</td>
				<td class="ranking">
					<div class="info">				
						<a href="<c:url value='/performance/detailViewPerformance/P0004'/>"><img src="<c:url value='/image/P0004.PNG'/>">
							<div class="info-txt">
							<p class="info-txt1">2024 적재 전국투어 콘서트 〈CLICHE〉</p>
							<p class="info-txt2">올림픽홀</p>
							</div></a>							
					</div>	
				</td>
				<td class="ranking">
					<div class="info">
						<a href="<c:url value='/performance/detailViewPerformance/P0003'/>"><img src="<c:url value='/image/P0003.PNG'/>">
							<div class="info-txt">
							<p class="info-txt1">데이비드 내한공연 (d4vd - My House Is Not A Home Tour)</p>
							<p class="info-txt2">올림픽홀</p>
							</div></a>						
					</div>
				</td>
				<td class="ranking">
					<div class="info">
						<a href="<c:url value='/performance/detailViewPerformance/P0008'/>"><img src="<c:url value='/image/P0008.PNG'/>">
							<div class="info-txt">
							<p class="info-txt1">박진영 30주년 콘서트〈Still JYP〉</p>
							<p class="info-txt2">올림픽홀</p>
							</div></a>									
					</div>
				</td>
			</tr>
		</table>
		<div class="banner">
				<a href="<c:url value='/performance/detailViewPerformance/P0017'/>"><img src="<c:url value='/image/long_banner.png'/>"></a>
		</div>
		<h1>TICKET COMING SOON</h1>
		<table id="initialTable">
			<tr>
				<td class="ranking">
					<div class="info">
					<a href="<c:url value='/performance/detailViewPerformance/P0001'/>"><img src="<c:url value='/image/P0001.jpg'/>">
						<div class="donut-dday">D-16</div>
						<div class="info-txt">
						<p class="info-txt1">나훈아 ‘2024 고마웠습니다-라스트 콘서트(LAST CONCERT)’</p>
						<p class="info-txt2">올림픽홀</p>
						</div></a>
				</div>
			</td>
				<td class="ranking">
					<div class="info">				
						<a href="<c:url value='/performance/detailViewPerformance/P0002'/>"><img src="<c:url value='/image/P0002.PNG'/>">
							<div class="donut-dday">D-16</div>
							<div class="info-txt">
							<p class="info-txt1">랑랑 피아노 리사이틀</p>
							<p class="info-txt2">샤롯데씨어터</p>
							</div></a>			
					</div>	
				</td>
				<td class="ranking">
					<div class="info">
						<a href="<c:url value='/performance/detailViewPerformance/P0005'/>"><img src="<c:url value='/image/P0005.PNG'/>">
							<div class="donut-dday">D-16</div>
							<div class="info-txt">
							<p class="info-txt1">NE-YO Champagne & Roses Tour in SEOUL</p>
							<p class="info-txt2">올림픽홀</p>
							</div></a>							
					</div>
				</td>
				<td class="ranking">
					<div class="info">
						<a href="<c:url value='/performance/detailViewPerformance/P0007'/>"><img src="<c:url value='/image/P0007.jpg'/>">
							<div class="donut-dday">D-16</div>
							<div class="info-txt">
							<p class="info-txt1">2024 송골매 콘서트 ‘열망’ 두번째 [늘-봄]</p>
							<p class="info-txt2">올림픽홀</p>
							</div></a>						
					</div>
				</td>
			</tr>
			
			<tr>
				<td class="ranking">
					<div class="info">
						<a href="<c:url value='/performance/detailViewPerformance/P0006'/>"><img src="<c:url value='/image/P0006.jpg'/>">
							<div class="donut-dday">D-16</div>
							<div class="info-txt">
							<p class="info-txt1">2024 이찬원 콘서트 ‘ 찬가（燦歌）’</p>
							<p class="info-txt2">올림픽홀</p>
							</div></a>								
					</div>
				</td>
				<td class="ranking">
					<div class="info">				
						<a href="<c:url value='/performance/detailViewPerformance/P0004'/>"><img src="<c:url value='/image/P0004.PNG'/>">
							<div class="donut-dday">D-16</div>
							<div class="info-txt">
							<p class="info-txt1">2024 적재 전국투어 콘서트 〈CLICHE〉</p>
							<p class="info-txt2">올림픽홀</p>
							</div></a>							
					</div>	
				</td>
				<td class="ranking">
					<div class="info">
						<a href="<c:url value='/performance/detailViewPerformance/P0003'/>"><img src="<c:url value='/image/P0003.PNG'/>">
							<div class="donut-dday">D-16</div>
							<div class="info-txt">
							<p class="info-txt1">데이비드 내한공연 (d4vd - My House Is Not A Home Tour)</p>
							<p class="info-txt2">올림픽홀</p>
							</div></a>						
					</div>
				</td>
				<td class="ranking">
					<div class="info">
						<a href="<c:url value='/performance/detailViewPerformance/P0008'/>"><img src="<c:url value='/image/P0008.PNG'/>">
							<div class="donut-dday">D-16</div>
							<div class="info-txt">
							<p class="info-txt1">박진영 30주년 콘서트〈Still JYP〉</p>
							<p class="info-txt2">올림픽홀</p>
							</div></a>									
					</div>
				</td>
			</tr>
		</table>

	<div class="empty2"></div>

	<script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
	<script src="<c:url value='/js/swiper.js'/>"></script>
	<c:import url="/WEB-INF/views/layout/footer.jsp"/>	
	</body>
</html>
 		
