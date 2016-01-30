<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<body class="background-grid">
    
    <div id="home-content" class="row height-100pc">
		
		<div class="row">
		    <div class="col-md-offset-3 col-md-6 margin-top-30px">
		
				<section class="content">
				    <div class="mailbox row">
				        <div class="col-xs-12">
				            <div class="box box-solid">
				                <div class="box-body">
				
									<div class="table-responsive">
									    <h3>Mes notifications</h3>
									    <table class="table table-mailbox">
									    	<c:forEach var="notification" items="${sessionScope.user.notifications}">
										        <tr class="background-eee">
									           		<td><a href="#">${notification.content}</a></td>
									        	</tr>
									    	</c:forEach>
									    </table>
									</div>
								</div>
							</div>
						</div>
					</div>
				</section>
				
		    </div>
		</div>
</body>