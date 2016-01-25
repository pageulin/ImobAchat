<div class="row">
    <div class="col-md-offset-3 col-md-6 margin-top-30px">

        <h3>Titre</h3>

        <input type="text" id="title" placeholder="Titre (30 caractères max)" maxlength="30" class="form-control margin-top-10px"/>

        <textarea class="form-control margin-top-10px" placeholder="Description..."></textarea>

        <h3>Localisation</h3>

        <input type="text" id="form_gmap_search_input" placeholder="Adresse" class="form-control margin-top-10px"/>
        <input type="hidden" id="gmap_longitude"/>
        <input type="hidden" id="gmap_latitude"/>

        <h3>Prix et surface</h3>

        <div class="row margin-top-10px">

        	<div class="col-md-6">
	        	<input type="text" id="price" placeholder="Prix (€)" class="form-control margin-top-10px"/>
	        </div>

	        <div class="col-md-6">
	        	<input type="text" id="area" placeholder="Surface (m²)" class="form-control margin-top-10px"/>
	        </div>

	        <div class="col-md-6">
	        	<input type="text" id="bedroom" placeholder="Chambres" class="form-control margin-top-10px"/>
	        </div>

	        <div class="col-md-6">
	        	<input type="text" id="bthroom" placeholder="Salles de bains" class="form-control margin-top-10px"/>
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

		<input type="text" id="mail" placeholder="Mail" class="form-control margin-top-10px"/>

		<input type="text" id="pgone" placeholder="Téléphone" class="form-control margin-top-10px"/>

		<button id="submit_property_button" class="btn btn-info margin-top-20px" onclick="">Publier</button>
    </div>
</div>


<!-- JQUERY -->
<script type="text/javascript" src="resources/js/jquery.min.js"></script>

<!-- GOOGLE API -->
<script type='text/javascript' src='http://maps.googleapis.com/maps/api/js?v=3.exp&amp;sensor=true&amp;libraries=places'></script>

<!-- MAIN SCRIPT -->
<script type="text/javascript" src="resources/js/index.js"></script>
