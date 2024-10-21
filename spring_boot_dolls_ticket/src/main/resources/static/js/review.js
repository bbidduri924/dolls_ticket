/**
 * 
 */
 $(document).on('click', '.star-box a', function(e){	
		e.preventDefault();
		var bigstar = $(this).index()+1;
		$('.star-box a').removeClass('on');
		$(".star-box a img").attr("src","/image/icons8-star-48-off.png");
		for(var i=0;i<bigstar;i++){
			$('.star-box a').eq(i).addClass('on');
			$(".star-box a").eq(i).find("img").attr("src","/image/icons8-star-48-on.png");
		}
	});

$(document).on('click', 'h2 label', function(e){
		e.preventDefault();
		$("#layer_popup").css("display","none");
		$(".star-box a img").attr("src","/image/icons8-star-48-off.png");
		$("#popup .w-write-box textarea").val("");
	});
		
$(document).on('click', '#cancellation', function(e){	
		e.preventDefault();
		alert("관람후기 작성을 취소하시겠습니까?");
		const performanceId = document.getElementById('performanceId').value;
		location.href = "/performance/detailViewPerformance/"+performanceId;
	});
	