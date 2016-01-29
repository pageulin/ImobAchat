<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<body class="background-grid">
    
    <div id="home-content" class="row height-100pc">
		
		<div class="row">
		    <div class="col-md-offset-3 col-md-6 margin-top-30px">
		
				<form:form commandName="submitProperty" enctype="multipart/form-data" method="POST">
					
			        <h3>Titre</h3>
			
			        <form:input path="title" type="text" placeholder="Titre (30 caractères max)" maxlength="30" class="form-control margin-top-10px"/>
			
			        <form:textarea path="description" class="form-control margin-top-10px" placeholder="Description..." ></form:textarea>
			
			        <h3>Localisation</h3>
			
					<div class="row">
						<div class="col-md-6">
			        		<form:input path="country" type="text" placeholder="pays" class="form-control" id="gmap_country"/>
			        	</div>
						<div class="col-md-6">
			        		<form:input path="town" type="text" placeholder="ville" class="form-control" id="gmap_town"/>
			        	</div>
			        </div>
			        <form:input path="address" type="text" id="gmap_search_input" placeholder="Adresse" class="form-control margin-top-10px"/>
			        <form:input path="longitude" type="hidden" id="gmap_longitude"/>
			        <form:input path="latitude" type="hidden" id="gmap_latitude"/>
			
			        <h3>Prix et surface</h3>
			
			        <div class="row margin-top-10px">
			
			        	<div class="col-md-6 margin-top-10px">
			        		<label>Prix (€)</label>
				        	<form:input path="price" type="number" class="form-control"/>
				        </div>
			
				        <div class="col-md-6 margin-top-10px">
				        	<label>Surface (m²)</label>
				        	<form:input path="area" type="number" class="form-control"/>
				        </div>
			
				        <div class="col-md-6 margin-top-10px">
				        	<label>Nombre de pièces</label>
				        	<form:input path="rooms" type="number" class="form-control"/>
				        </div>
			
				        <div class="col-md-6 margin-top-10px">
				        	<label>Chambres</label>
				        	<form:input path="bedrooms" type="number" class="form-control"/>
				        </div>
			
				        <div class="col-md-6">
				        	<label>Salles de bains</label>
				        	<form:input path="bathrooms" type="number" class="form-control"/>
				        </div>
			
				    </div>
			
				    <h3>Images</h3>
			
				    <div class="row margin-top-10px">
				    	<input type="file" name="file" class="col-md-6">
				    	<input type="file" name="file" class="col-md-6">
				    	<input type="file" name="file" class="col-md-6">
				    	<input type="file" name="file" class="col-md-6">
				    	<input type="file" name="file" class="col-md-6">
				    	<input type="file" name="file" class="col-md-6">
					</div>
			
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
