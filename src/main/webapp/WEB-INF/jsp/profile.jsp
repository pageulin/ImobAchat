<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<body class="background-grid">
    
    <div id="home-content" class="row height-100pc">
		
		<div class="row">
		    <div class="col-md-offset-3 col-md-6 margin-top-30px">
		
				<!-- START INFO SECTION -->
				<form:form commandName="updateUser" action="updateUser" id="updateUser">
			
			        <h3>Vos infos</h3>
			
			        <div class="row">
			          <div class="col-md-6">
			            <form:input path="firstname" type="text" placeholder="Prénom" value="${sessionScope.user.firstname}" class="form-control"/>
			          </div>
			          <div class="col-md-6">
			            <form:input path="lastName" type="text" placeholder="Nom" value="${sessionScope.user.lastName}" class="form-control"/>
			          </div>
			        </div>
			            
			        <form:input path="phone" type="text" id="phone" placeholder="Téléphone" value="${sessionScope.user.phone}" class="form-control margin-top-10px"/>
			
			        <form:input path="email" type="mail" id="mail" placeholder="Address Mail" value="${sessionScope.user.email}" class="form-control margin-top-10px"/>
			        
			        <form:input path="address" type="text" id="address" placeholder="Address" value="${sessionScope.user.address}" class="form-control margin-top-10px"/>
			        
			        <button type="submit" class="btn btn-info margin-top-10px">Modifier</button>
			
				</form:form>
		        <!-- END INFO SECTION -->
		
		        <!-- START NEW PASSWORD SECTION -->
		
		        <h3 class="margin-top-30px">Nouveau mot de passe</h3>
			
		        <input id='last_pass' placeholder="Ancien mot de passe" class="form-control margin-top-10px"/>
		
		        <input id='new_pass' placeholder="Nouveau mot de passe" class="form-control margin-top-10px"/>
		
		        <input id='confirm' placeholder="Confirmation" class="form-control margin-top-10px"/>
		
		        <a onclick="changePassword()" class="btn btn-info margin-top-10px">Modifier</a>
	        
		        <!-- END NEW PASSWORD SECTION -->
		
		        <h3 class="margin-top-30px">Préférences</h3>
			
				<form:form commandName="updateSearch" action="updateSearch">
					<label>Pays</label>
			        <form:input path='country' type="text" value="${user.search.country}" class="form-control margin-top-10px"/>
			
			        <label>Chambres</label>
			        <form:input path='bedrooms' type="text" value="${user.search.bedrooms}" class="form-control margin-top-10px"/>
			        
			        <label>Salle de bains</label>
			        <form:input path='bathrooms' type="text" value="${user.search.bathrooms}" class="form-control margin-top-10px"/>
			        
			       <label>Prix max</label>
			       <form:input path='max_price' type="text" value="${user.search.max_price}" class="form-control margin-top-10px"/>
			       
			       <label>Superficie minimum</label>
			       <form:input path='min_area' type="text"  class="form-control margin-top-10px"/>
			
			        <button type="submit" class="btn btn-info margin-top-10px">Valider</button>
	    		</form:form>

		
		        <h3 class="margin-top-30px">Mes annonces</h3>
		        
		        <c:forEach var="announcement" items="${announcements}">
					<div class='white-box'>
			            <div class='row'>
			                <img class="col-md-4" src="resources/images/property/${announcement.pictures[0]}"/>
			                <div class="col-md-8">
			                    <b>${announcement.title}</b><br/>
			                    <label class="color-888">${announcement.description}</label><br/>
			                    <a href="actuality/${announcement.id}"><i>Voir plus</i></a>
			                </div>
			            </div>
			        </div>
		    	</c:forEach>
		
		
		        <!-- END MY ANNOUNCEMENT SECTION -->

		
		        <!-- START FAVORITE SECTION -->
		
		        <h3 class="margin-top-30px">Vos annonces favorites</h3>
		        
		        <c:forEach var="announcement" items="${sessionScope.user.favoriteAnnouncements}">
					<div class='white-box margin-top-10px'>
			            <div class='row'>
			                <img class="col-md-4" src="resources/images/property/${announcement.pictures[0]}"/>
			                <div class="col-md-8">
			                    <b>${announcement.title}</b><br/>
			                    <label class="color-888">${announcement.description}</label><br/>
			                    <a href="actuality/${announcement.id}"><i>Voir plus</i></a>
			                </div>
			            </div>
			        </div>
		    	</c:forEach>
		
		        <!-- END FAVORITE SECTION -->

		        		
		      </div>
		
		    </div>
		</div>
</body>
		
<script>
	function changePassword(){
		document.location.href='updatePassword/' + $('#last_pass').val() + '/' + $('#new_pass').val() + '/' + $('#confirm').val();
	}
</script>
