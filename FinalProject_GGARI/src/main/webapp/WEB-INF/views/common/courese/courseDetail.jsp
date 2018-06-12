<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

	<style>
	
	.fixed-width-wrap {
	    width: 60pc;
	    margin: 0 auto;
	    overflow: hidden;
	}
	
	.level-mark {
	    position: absolute;
	    top: -54px;
	    z-index: 1;
	    width: 81pt;
	    height: 81pt;
	    overflow: hidden;
	    text-align: center;
	    background: skyblue;
	    line-height: normal;
	}
	
	.label {
	    margin-top: 26px;
	    color: #ffeb3b;
	    font-weight: 700;
	    font-size: 1pc;
	}
	
	.level {
	    margin-top: 3px;
	    font-size: 2pc;
	    color: #fff;
	}
	
	.area {
	    display: inline-block;
	    width: 100%;
	    text-align: center;
	    font-weight: 700;
	    color: skyblue;
	}
	
	#product-header-images {
	    position: relative;
	    height: 360px;
	}
	
	#product-related-info {
	    float: left;
	    margin-bottom: 60px;
	    width: 696px;
	    overflow: hidden;
	    background-color: #fff;
	}
	
	#product-header-texts {
	    position: relative;
	    padding: 36px 30px;
	}
	
	#product-content-wrap {
	    line-height: 1.75em;
	    padding: 0 35px;
	}
	
	.section-wrap {
	    overflow: hidden;
	}
	
	.section-label {
	    float: left;
	    clear: right;
	    padding: 60px 0 3pc 9pt;
	    width: 110px;
	    font-size: 14pt;
	    color: #333;
	}
	
	.section-content {
	    float: right;
	    padding: 60px 0;
	    width: 455px;
	}
	
	.section-content {
	   
	    border-top: 1px solid #e6e6e6;
	}
	
	.product-detail {
	    float: left;
	    width: 430px;
	}
	
	.product-detail>dd {
	    display: inline-block;
	    width: 175px;
	}
	
	.product-detail>dt {
	    display: inline-block;
	    width: 55px;
	    vertical-align: top;
	    color: #787878;
	}
	
	.product-detail>dd.right-column {
	    width: 145px;
	}
	
	.item {
	    margin-left: 0;
	}
	
	.item-description {
	    margin-left: 10px;
	    font-size: 10pt;
	    color: #777;
	}
	
	.participation-info {
	    padding-left: 18px;
	    background: transparent url(https://cdn.studysearch.co.kr/static/images/product/image_right_arrow.d5d4977d91e1.png)0 5px no-repeat;
	    font-size: 9.5pt;
	    color: #787878;
	}
	
	.date {
	    color: #1fa2e2;
	}
	
	.leader-profile-image {
	    display: block;
	    margin: 35px auto 0;
	    width: 95px;
	    height: 95px;
	    border-radius: 50%;
	}
	
	
	
	
	#review-count {
	    font-size: 1pc;
	    color: #333;
	}
	
	#reviews {
	    clear: right;
	    padding-left: 9pt;
	}
	
	#reviews>li {
	    overflow: hidden;
	}
	
	li {
	    display: list-item;
	    text-align: -webkit-match-parent;
	}
	
	#review-info #reviews>li .writer-photo-wrap {
	    padding: 24px 0;
	}
	
	.writer-photo {
	    width: 76px;
	    height: 76px;
	    border-radius: 50%;
	}
	
	.writer-name {
	    font-weight: 700;
	    color: #333;
	}
	
	.review-content {
	    font-size: 10pt;
	    margin-bottom: 2px;
	}
	
	.review-product-title {
	    display: block;
	    font-size: 9pt;
	    color: #ef6c00;
	}
	
	.review-written-at {
	    display: block;
	    margin-top: 10px;
	    font-size: 9pt;
	    color: #a0a0a0;
	}
	
	.heading {
	    float: left;
	    clear: right;
	    width: 150px;
	    padding-left: 9pt;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	</style>


	<!-- 여기부터 수정 -->
	
	<section class="breadcrumb" style="background-image: url(${pageContext.request.contextPath}/resources/images/background/breadcrumb.jpg);">
        <div class="breadcrumb-overlay"></div>
        <div class="container">
            <h1><a href="courses.html">스터디</a></h1>
            <span><a href="index.html">Home</a></span><span><i class="fa fa-angle-right"></i>Courses</span>
        </div>
    </section>

	<div class="fixed-width-wrap">
		<div id="product-related-info">
			<header id="product-header">
				<div id="product-header-images" class="swiper-container-horizontal" style="padding:10px 0 0 0">
					<img style="width: 696px; height: 360px"  src="${pageContext.request.contextPath}/resources/images/background/common.jpg">				
				</div>
				<div id="product-header-texts">
					<div class="level-mark">
						<div class="label">LEVEL</div>
						<div class="level">입문2</div>
					</div>
					<span class="area">인천-부평</span>
					<h1 style="text-align:center;">
						뉴질랜드에서 온 Thomas의 <br>영알못도 웃고가는 하루!
					</h1>
				</div><hr style="margin:0">
			</header>

			<div id="product-content-wrap">
				<section id="product-information">
					<div id="product-description" class="section-wrap">
						<h1 class="section-label">스터디<br>소개</h1>
						<div class="section-content">
							여러 상황에서, 여러 주제에 대해 영어로 수다 떨 수 있게 되는 게 목표인 스터디입니다! 실생활에서 대화할 법한
							주제들을 골라서 유용하게 사용하실 수 있는 패턴 알려드려요~ 점점 영어가 재밌게 느껴지실 거에요 <br>매 회
							마다 상황이나 주제를 정합니다. 그때그때마다 이야기 주제는 바뀔 수 있지만, 큰 틀은 유지할 계획이예요!<br>
							<br>[Topics to be covered]<br>취미, Hopes/꿈, 가족, 친구 <br>음식/술,
							영화/TV, 음악, 연예인/이상형<br>쇼핑/돈, 연애, 여행, 맛집/요리<br>
							<br>1. Catching up<br>재미있게 회화를 배워가려면 서로서로 친하고 편안한 분위기가
							중요해요! 며칠간 어떤 일이 있었는지 그냥 친구처럼 나누는 시간입니다.<br>
							<br>2. 주제 별 Vocabulary&amp;Pattern<br>주제가 여행이라면~<br>"여행"과
							관련된 대화를 진행할 때 사용할 수 있는 단어와 패턴을 배웁니다.<br>여행가고 싶은 기분을 표현하고 싶다면?<br>내
							여행 루트를 친구에게 설명하고 싶다면?<br>영어로 이런 상황이 왔을 때, 단어만 바꿔서 유용하게 쓸 수 있는
							패턴들을 알려드려요.<br>
							<br>3. Topic Questions<br>주제와 관련된 질문들로 대화를 진행합니다.<br>
							<br>여행 주제로 예를 들면,<br>- 최근에 여행갔던 적<br>- 여행을 자주 가는
							편인지? 가장 좋은 여행 경험?<br>등에 대해 이야기를 나눕니다.
						</div>
					</div>
					<div id="product-detail" class="section-wrap">
						<h2 class="section-label">상세 정보</h2>
						<div class="section-content">
							<dl id="detail-list" class="product-detail">
								<dt>지역:</dt>
								<dd>수원-수원역</dd>
								<dt class="right-column">인원:</dt>
								<dd class="right-column">6명</dd>
								<dt>일정:</dt>
								<dd>2개월, 주 1회</dd>
								<dt class="right-column">장소비:</dt>
								<dd class="right-column">포함</dd>
								<dt>시간:</dt>
								<dd class="item">
									<span class="item-name">
										<!-- react-text: 2432 -->A그룹<!-- /react-text -->
										<!-- react-text: 2433 --> <!-- /react-text -->
										<!-- react-text: 2434 -->(월)<!-- /react-text -->
									</span> <span class="item-description">20:00-22:00</span>
									<div class="participation-info">
										<!-- react-text: 2437 -->
										지금 신청하면
										<!-- /react-text -->
										<span class="date">7월 2일 (월)</span>
										<!-- react-text: 2439 -->
										첫 스터디 시작!
										<!-- /react-text -->
									</div>
								</dd>
							</dl>
						</div>
					</div>
				</section>

				<section id="leader-information">
					<div class="section-wrap">
						<header class="section-label">
							<h1 style="font-size: 14pt;">리더 소개</h1>
							<img src="https://cdn.studysearch.co.kr/images/users/65235/profile/1518656373" class="leader-profile-image">
						</header>
						<div class="section-content">
							<span class="leader-greeting">안녕하세요</span> <br>
							<div class="leader-introduction">
								저는 뉴저지 아틀란틱 시티에서 온 카렌(karen)입니다.<br>
								<br>도심보단 자연을 좋아하고 사람만나는 걸 좋아하고 영화와 모든 장르의 음악을 사랑하는 저는 미국
								시민권자로 24년 이민 생활을 했구요, 필라델피아에 있는 temple university를 다녔습니다. <br>
								<br>이미 고등학교를 졸업하고 한국어로 혀가 굳어진 저로서는 영어를 한다는 건 쉬운 일은 아니였습니다.
								생존하기 위해 해야 했던 영어라서 정말 닥치는 대로 했어요. 말하기 부끄럽다? 난 모르겠다? 그런 생각을 할 틈조차
								없었죠. 우선 생활에서 배워지는 영어부터 시작했습니다. Hi, How are you? Thank you 조차하기
								어려웠던 저의 가장 큰 스승은 제가 일했던 가게의 오는 미국인 손님들이었습니다. 미국인 손님들에게 발음, 문장,
								표현 등등을 물어보았고 그 답을 알고 외우고 연습해서 그 다음날 반드시 실생활에서 직접 해보았습니다. 지금도
								기억납니다. 내가 외우고 연습한 문장들을 그들에게 말했을 때 그들이 내말을 알아듣고 응답을 해주었을 때 느꼈던 그
								희열감은 말로 표현 할 수 없었습니다. 그리고 나서 대학에 들어가 제대로 된 영어를 공부하게 되었습니다.<br>
								<br>제가 스터디서치를 하고 싶었던 큰 이유는 한국에 와서 영어과외와 전화영어로 영어를 가르치면서
								공통적으로 한국에 사는 여러분들이 가지고 있는 어려운 부분들이 보이더라구요.모국어가 아닌 제 2 외국어인 영어를
								그거도 한국에 살면서 잘하기란 결코 쉬운 일이 아닙니다. abcd 알파벳 발음부터 한국어가 가지고 있지 않은 수많은
								경우수가 있는 문법, 어휘, 표현 등등 아무리 배워도 단어하나 입 밖으로 꺼내기 어려운 현실... <br>
								<br>하지만 !!!! 저와함께 하는 스터디서치를 통해 천천히 하나하나 소통하며 해나가봐요!<br>그리고
								여러분의 숨겨진 영어 실력을 찾아드리고 자신감을 얻게 해드립니다!<br>혼자는 어렵지만 같이는 쉬우니까요!<br>난공불락의
								성 “English" 같이 도전해보아요!!!
							</div>
						</div>
					</div>
				</section>


				<section id="review-info" class="section-content">
					<header>
						<h1 id="review-count" class="heading">리더에 대한 후기</h1>
					</header>
					<ul id="reviews">
						<li class="review"><a name="review-5681"></a>
						<div class="heading writer-photo-wrap">
								<div class="writer-photo"
									style="display: inline-block; background-image: url(&quot;https://cdn.studysearch.co.kr/images/users/106906/profile/1518666770&quot;); background-size: cover; background-position: 50% 50%;"></div>
							</div>
							<div class="review-content-wrap trailing">
								<span class="writer-name">모민구</span>
								<p class="review-content">리더님이 다양한 주제로 스터디를 진행해주셔서 재미있고 유쾌한
									스터디를 할 수 있었습니다.</p>
								<a class="review-product-title" href="/product/6000/">미국 24년
									거주 Karen의 거침없이 영어로 내뱉기!</a><span class="review-written-at"><a
									href="?review=5681">
										<!-- react-text: 2580 -->2018<!-- /react-text -->
										<!-- react-text: 2581 -->년 <!-- /react-text -->
										<!-- react-text: 2582 -->4<!-- /react-text -->
										<!-- react-text: 2583 -->월<!-- /react-text -->
								</a></span>
							</div></li>
						<li class="review"><a name="review-5681"></a>
						<div class="heading writer-photo-wrap">
								<div class="writer-photo"
									style="display: inline-block; background-image: url(&quot;https://cdn.studysearch.co.kr/images/users/106906/profile/1518666770&quot;); background-size: cover; background-position: 50% 50%;"></div>
							</div>
							<div class="review-content-wrap trailing">
								<span class="writer-name">모민구</span>
								<p class="review-content">리더님이 다양한 주제로 스터디를 진행해주셔서 재미있고 유쾌한
									스터디를 할 수 있었습니다.</p>
								<a class="review-product-title" href="/product/6000/">미국 24년
									거주 Karen의 거침없이 영어로 내뱉기!</a><span class="review-written-at"><a
									href="?review=5681">
										<!-- react-text: 2580 -->2018<!-- /react-text -->
										<!-- react-text: 2581 -->년 <!-- /react-text -->
										<!-- react-text: 2582 -->4<!-- /react-text -->
										<!-- react-text: 2583 -->월<!-- /react-text -->
								</a></span>
							</div></li>
					</ul>
				</section>





			</div>
		</div>
	</div>



</body>

</html>