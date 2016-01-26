<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<body class="skin-blue">

    <div class="wrapper row-offcanvas row-offcanvas-left">

		<jsp:include page="/WEB-INF/jsp/adminSideLeft.jsp"/>

        <aside class="right-side">

			<section class="content">
			    <!-- MAILBOX BEGIN -->
			    <div class="mailbox row">
			        <div class="col-xs-12">
			            <div class="box box-solid">
			                <div class="box-body">
			
								<div class="table-responsive">
								    <!-- THE MESSAGES -->
								    <h3>Propriétés</h3>
								    
								    <table class="table table-mailbox">
										<c:forEach var="announcement" items="${announcements}">
								  			<tr class="row background-eee">
									            <!-- <td class="col-md-4"><a href="#">${announcement.country}, ${announcement.town}</a></td> -->
									            <td class="col-md-4"><a href="#">${announcement.owner.pseudo}</a></td>
									            <td class="col-md-8"><a href="#">${announcement.address}</a></td>
									        </tr>
								    	</c:forEach>
								    </table>
								</div><!-- /.table-responsive -->
							</div>
						</div>
					</div>
				</div>
			</section>
        </aside>
    </div>

</body>