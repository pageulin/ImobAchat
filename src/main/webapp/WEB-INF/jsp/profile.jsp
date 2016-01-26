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
		
		        <input type="mail" id="last-password" placeholder="Ancien mot de passe" class="form-control margin-top-10px"/>
		
		        <input type="mail" id="new-password" placeholder="Nouveau mot de passe" class="form-control margin-top-10px"/>
		
		        <input type="mail" id="confirmation" placeholder="Confirmation" class="form-control margin-top-10px"/>
		
		        <button id="new-password-button" class="btn btn-info margin-top-10px" onclick="makeAccount()">Modifier</button>
		
		        <!-- END NEW PASSWORD SECTION -->

		        <!-- START MY ANNOUNCEMENT SECTION -->
		
		        <h3 class="margin-top-30px">Mes annonces</h3>
		        
		        <c:forEach var="announcement" items="${announcements}">
					<div class='white-box'>
			            <div class='row'>
			                <img class="col-md-4" src="resources/images/property/featured-properties6.jpg"/>
			                <div class="col-md-8">
			                    <b>${announcement.title}</b>
			                    <label class="color-888">${announcement.description}</label>
			                </div>
			            </div>
			        </div>
		    	</c:forEach>
		
		
		        <!-- END MY ANNOUNCEMENT SECTION -->

		
		        <!-- START FAVORITE SECTION -->
		
		        <h3 class="margin-top-30px">Vos annonces favorites</h3>
		
		        <div class='white-box'>
		            <div class='row'>
		                <img class="col-md-4" src="resources/images/property/featured-properties6.jpg"/>
		                <div class="col-md-8">
		                    <b>Appartement Ã  bordeaux</b>
		                    <label class="color-888">Saraceni tamen nec amici nobis umquam nec hostes optandi, ultro citroque discursantes quicquid inveniri poterat momento temporis parvi vastabant milvorum rapacium similes, qui si praedam dispexerint celsius, volatu rapiunt celeri, aut nisi impetraverint, non inmorantur.</label>
		                </div>
		            </div>
		        </div>
		
		        <div class='white-box margin-top-20px'>
		            <div class='row'>
		                <img class="col-md-4" src="resources/images/property/featured-properties5.jpg"/>
		                <div class="col-md-8">
		                    <b>Appartement Ã  Rouen</b>
		                    <label class="color-888">Sed maximum est in amicitia parem esse inferiori. Saepe enim excellentiae quaedam sunt, qualis erat Scipionis in nostro, ut ita dicam, grege. Numquam se ille Philo, numquam Rupilio, numquam Mummio anteposuit, numquam inferioris ordinis amicis, Q. vero Maximum fratrem, egregium virum omnino, sibi nequaquam parem, quod is anteibat aetate, tamquam superiorem colebat suosque omnes per se posse esse ampliores volebat..</label>
		                </div>
		            </div>
		        </div>
		
		        <div class='white-box margin-top-20px'>
		            <div class='row'>
		                <img class="col-md-4" src="resources/images/property/featured-properties4.jpg"/>
		                <div class="col-md-8">
		                    <b>Appartement Ã  Paris</b>
		                    <label class="color-888">Et quoniam apud eos ut in capite mundi morborum acerbitates celsius dominantur, ad quos vel sedandos omnis professio medendi torpescit, excogitatum est adminiculum sospitale nequi amicum perferentem similia videat, additumque est cautionibus paucis remedium aliud satis validum, ut famulos percontatum missos quem ad modum valeant noti hac aegritudine colligati, non ante recipiant domum quam lavacro purgaverint corpus. ita etiam alienis oculis visa metuitur labes.</label>
		                </div>
		            </div>
		        </div>
		
		        <!-- END FAVORITE SECTION -->
		
		      </div>
		
		    </div>
		</div>
</body>
		
