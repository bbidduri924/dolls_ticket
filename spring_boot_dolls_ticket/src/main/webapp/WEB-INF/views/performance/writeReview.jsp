<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/css/writeReview.css'/>">
</head>
<body>
	<div class="rn-0906 scroll-color mCustomScrollbar _mCS_6"
	style="display: block; height: 706px;">
	<div id="mCSB_6"
		class="mCustomScrollBox mCS-light mCSB_vertical_horizontal mCSB_inside"
		tabindex="0" style="max-height: none;">
		<div id="mCSB_6_container_wrapper"
			class="mCSB_container_wrapper mCS_x_hidden mCS_no_scrollbar_x">
			<div id="mCSB_6_container" class="mCSB_container"
				style="position: relative; top: 0px; left: 0px; width: 100%;"
				dir="ltr">
				<div class="rn-0906-in">
					<p class="rn0906-big-tit">뮤지컬 〈쓰릴 미〉</p>
					<div class="rn0906-date">
						<p class="rn0906-tit">관람일시</p>
						<div class="rn0906-date-box">
							<p>
								<span>관람 내역이 없습니다.</span>
							</p>
						</div>
					</div>

					<div class="rn0906-star-point">
						<p class="rn0906-tit">별점</p>
						<div class="rn0906-star-box">
							<a href="#"><img
								src="http://tkfile.yes24.com/imgNew/common/ico-star-off.png"
								alt="" class="mCS_img_loaded"></a><a href="#"><img
								src="http://tkfile.yes24.com/imgNew/common/ico-star-off.png"
								alt="" class="mCS_img_loaded"></a><a href="#"><img
								src="http://tkfile.yes24.com/imgNew/common/ico-star-off.png"
								alt="" class="mCS_img_loaded"></a><a href="#"><img
								src="http://tkfile.yes24.com/imgNew/common/ico-star-off.png"
								alt="" class="mCS_img_loaded"></a><a href="#"><img
								src="http://tkfile.yes24.com/imgNew/common/ico-star-off.png"
								alt="" class="mCS_img_loaded"></a>
						</div>
					</div>
					<div class="rn0906-write-area">
						<p class="rn0906-tit">관람후기</p>
						<div class="rn0906-write-box">
							<textarea id="txtReview"
								placeholder="내용을 작성해주세요. (최소 20byte / 최대 2,000byte)"
								onkeyup="javascript:jsf_cm_cal_pre();"></textarea>
						</div>
					</div>

					<div class="rn0906-caution">
						<p class="rn0906-caution-tit">관람후기 작성 시 유의사항</p>
						<p class="rn0906-caution-txt">예스24 게시판 운영 규정에 위반된다고 판단되는 글은
							사전고지 없이 삭제될 수 있습니다.</p>
						<ul class="rn0906-caution-list">
							<li>티켓 매매 및 양도, 교환의 글</li>
							<li>전화번호, 이메일, 주소 등 회원 및 타인의 개인정보 유출이 우려되는 경우</li>
							<li>욕설, 비방, 도배성 글을 작성한 경우</li>
							<li>명예훼손, 저작권, 초상권의 권리 침해 및 음란한 사진을 게재한 경우</li>
						</ul>
						<p class="rn0906-caution-txt">
							작성된 게시물의 저작권은 작성자에게 있으며, 게시물로 인해 발생하는 문제는 작성자 본인에게 책임이 있습니다.<br>작성
							시 유의해주시기 바랍니다.
						</p>
					</div>
					<div class="rn0906-btns">
						<a href="#" class="rn0906btn1">취소</a><a href="#"
							class="rn0906btn2">등록</a>
					</div>
				</div>
				<a href="#" class="rn-0906-close"><img
					src="http://tkfile.yes24.com/imgNew/common/rn-pop-close.png" alt=""
					class="mCS_img_loaded"></a>
			</div>
		</div>
		<div id="mCSB_6_scrollbar_vertical"
			class="mCSB_scrollTools mCSB_6_scrollbar mCS-light mCSB_scrollTools_vertical"
			style="display: block;">
			<div class="mCSB_draggerContainer">
				<div id="mCSB_6_dragger_vertical" class="mCSB_dragger"
					style="position: absolute; min-height: 30px; display: block; height: 628px; max-height: 696px; top: 0px;">
					<div class="mCSB_dragger_bar" style="line-height: 30px;"></div>
				</div>
				<div class="mCSB_draggerRail"></div>
			</div>
		</div>
		<div id="mCSB_6_scrollbar_horizontal"
			class="mCSB_scrollTools mCSB_6_scrollbar mCS-light mCSB_scrollTools_horizontal"
			style="display: none;">
			<div class="mCSB_draggerContainer">
				<div id="mCSB_6_dragger_horizontal" class="mCSB_dragger"
					style="position: absolute; min-width: 30px; width: 0px; left: 0px;">
					<div class="mCSB_dragger_bar"></div>
				</div>
				<div class="mCSB_draggerRail"></div>
			</div>
		</div>
	</div>
	</div>
</body>
</html>