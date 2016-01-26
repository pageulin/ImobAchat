<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<body class="background-grid">
    
    <div id="home-content" class="row height-100pc">
		
		<div class="row">
		    <div class="col-md-offset-3 col-md-6 margin-top-30px">
		
		        <h3>Titre</h3>
		
		        <input type="text" placeholder="Titre (30 caractères max)" maxlength="30" class="form-control margin-top-10px"/>
		
		        <textarea class="form-control margin-top-10px" placeholder="Description..." ></textarea>
		
		        <h3>Localisation</h3>
		
		        <input type="text" id="form_gmap_search_input" placeholder="Adresse" class="form-control margin-top-10px"/>
		        <input type="hidden" id="gmap_longitude"/>
		        <input type="hidden" id="gmap_latitude"/>
		
		        <h3>Prix et surface</h3>
		
		        <div class="row margin-top-10px">
		
		        	<div class="col-md-6">
			        	<input type="text" placeholder="Prix (€)" class="form-control margin-top-10px"/>
			        </div>
		
			        <div class="col-md-6">
			        	<input type="text" placeholder="Surface (m²)" class="form-control margin-top-10px"/>
			        </div>
		
			        <div class="col-md-6">
			        	<input type="text" placeholder="Nombre de pièces" class="form-control margin-top-10px"/>
			        </div>
		
			        <div class="col-md-6">
			        	<input type="text" placeholder="Chambres" class="form-control margin-top-10px"/>
			        </div>
		
			        <div class="col-md-6">
			        	<input type="text" placeholder="Salles de bains" class="form-control margin-top-10px"/>
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
		
				<input type="text" placeholder="Mail" class="form-control margin-top-10px"/>
		
				<input type="text" placeholder="Téléphone" class="form-control margin-top-10px"/>
		
				<button type="submit" class="btn btn-info margin-top-20px">Publier</button>
		    </div>
		</div>
	</div>
</body>
