<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<body>
    
	<!-- 여기부터 수정 -->
	
	<section class="breadcrumb" style="background-image: url(${pageContext.request.contextPath}/resources/images/background/breadcrumb.jpg);">
        <div class="breadcrumb-overlay"></div>
        <div class="container">
            <h1><a href="courses.html">스터디</a></h1>
            <span><a href="index.html">Home</a></span><span><i class="fa fa-angle-right"></i>Courses</span>
        </div>
    </section>

	 <div class="popular-course course-page inner-page">
        <div class="container">           
            <div class="pupular-course-inner clear">
                <div class="row">
                   
                    <div class=" col-md-4 col-lg-4">
                        <div class="course-content">
                            <div class="course-img ">
                                <img class="img-responsive " src="${pageContext.request.contextPath}/resources/images/course/2.jpg " alt="image" />
                            </div>
                            <div class="course-detail ">
                            	<div style="text-align:center;">
                            		<div class="course-date" >                                   
	                                    <span style="color:skyblue">6월 7일(목)</span>
	                                    <span> 19:00~21:00 첫시작</span>
	                                    <p style="color:#92B3B7"> 건대 | 초급</p>
	                                </div>
	                                
	                                <h3><a href="${pageContext.request.contextPath}/courseDetail" title="Details ">java 학습 노하우 가득한 Ray의 java시간 </a></h3>
                            	</div>
                                
                                
                                
                                
                                <div class="course-icon">
                                    <img src="${pageContext.request.contextPath}/resources/images/users/2.jpg" class="img-responsive" alt="image">
                                </div>
                                <div class="course-bottom">
                                  <!--   <span><i class="fa fa-users"></i>365</span>
                                    <span><i class="fa fa-comment"></i>7</span> -->
                                    <span class="pull-right">188,000원</span>
                                    <span> 8주</span>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
        <div class="page">
            <div class="container">
                <ul class="pagination">
                    <li class="disabled"><a href="#"><i class="fa fa-long-arrow-left"></i></a></li>
                    <li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li><a href="#"><i class="fa fa-long-arrow-right"></i></a></li>
                </ul>
            </div>
        </div>
    </div>
	

</body>

</html>