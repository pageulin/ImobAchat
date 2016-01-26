<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<body class="background-grid">
    
    <div id="home-content" class="row height-100pc">
		
		<div class="row">
		    <div class="col-md-offset-3 col-md-6 margin-top-30px">
		
				<form:form commandName="submitProperty">
					
			        <h3>Titre</h3>
			
			        <form:input path="title" type="text" placeholder="Titre (30 caractères max)" maxlength="30" class="form-control margin-top-10px"/>
			
			        <form:textarea path="description" class="form-control margin-top-10px" placeholder="Description..." ></form:textarea>
			
			        <h3>Localisation</h3>
			
			        <form:input path="address" type="text" id="gmap_search_input" placeholder="Adresse" class="form-control margin-top-10px"/>
			        <input type="hidden" id="gmap_longitude"/>
			        <input type="hidden" id="gmap_latitude"/>
			
			        <h3>Prix et surface</h3>
			
			        <div class="row margin-top-10px">
			
			        	<div class="col-md-6">
				        	<form:input path="price" type="text" placeholder="Prix (€)" class="form-control margin-top-10px"/>
				        </div>
			
				        <div class="col-md-6">
				        	<form:input path="area" type="text" placeholder="Surface (m²)" class="form-control margin-top-10px"/>
				        </div>
			
				        <div class="col-md-6">
				        	<form:input path="rooms" type="text" placeholder="Nombre de pièces" class="form-control margin-top-10px"/>
				        </div>
			
				        <div class="col-md-6">
				        	<form:input path="bedrooms" type="text" placeholder="Chambres" class="form-control margin-top-10px"/>
				        </div>
			
				        <div class="col-md-6">
				        	<form:input path="bathrooms" type="text" placeholder="Salles de bains" class="form-control margin-top-10px"/>
				        </div>
			
				    </div>
			
				    <h3>Images</h3>
			
				    <div class="row margin-top-10px">
				    	<input type="file" class="col-md-6">
				    	<input type="file" class="col-md-6">
				    	<input type="file" class="col-md-6">
				    	<input type="file" class="col-md-6">
				    	<input type="file" class="col-md-6">
				    	<input type="file" class="col-md-6">
					</div>
			
					<h3>Contact</h3>
			
					<form:input path="mail" type="text" placeholder="Mail" class="form-control margin-top-10px"/>
			
					<form:input path="phone" type="text" placeholder="Téléphone" class="form-control margin-top-10px"/>
			
					<button type="submit" class="btn btn-info margin-top-20px">Publier</button>
				</form:form>
		    </div>
		</div>
	</div>
</body>

<!-- JQUERY -->
<script type="text/javascript" src="resources/js/jquery.min.js"></script>

<!-- GOOGLE API -->
<script type='text/javascript' src='http://maps.googleapis.com/maps/api/js?v=3.exp&amp;sensor=true&amp;libraries=places'></script>

<!-- MAIN SCRIPT -->
<script type="text/javascript" src="resources/js/index.js"></script>

<!-- SEARCH MAP SCRIPT -->
<script type="text/javascript" src="resources/js/modernizr-2.7.1.min.js"></script>
<script type="text/javascript" src="resources/js/infobox.js"></script>
<script type="text/javascript" src="resources/js/markerclusterer.js"></script>
<script type="text/javascript" src="resources/js/property.js"></script>
<script type="text/javascript" src="resources/js/gmap-data.js"></script>
