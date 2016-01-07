/* --------------------------------------------------------------------- */

/* GOOGLE MAP API */

/* --------------------------------------------------------------------- */

var GoogleMap = {"latitude":"40.714398","longitude":"-74.005279"};
var map;
var infowindow;
var marker;

jQuery('#gmap_search_input').bind('keypress keydown keyup', function(e){

    if(e.keyCode == 13) { e.preventDefault(); }

});

function map_picker_initialize() {
	
	var markers = [];
	
	var myPlace    = new google.maps.LatLng(GoogleMap.latitude,GoogleMap.longitude); 
	
	if($('#gmap').length > 0){
		map = new google.maps.Map(document.getElementById('gmap'), {
			flat:false,
			noClear:false,
			zoom: 16,
			scrollwheel: true,
			draggable: true,
			center: myPlace,
			mapTypeId: google.maps.MapTypeId.ROADMAP
		});
	}
	
	// Create the search box and link it to the UI element.
	
	var input = /** @type {HTMLInputElement} */(
	
	document.getElementById('gmap_search_input'));
	
	if(map)
		map.controls[google.maps.ControlPosition.TOP_LEFT].push(input);
	
	var searchBox = new google.maps.places.SearchBox(
	
	/** @type {HTMLInputElement} */(input));
	
	google.maps.event.addListener(searchBox, 'places_changed', function(){
		var places = searchBox.getPlaces();
		
		if (places.length == 0) return 
		
		for (var i = 0, marker; marker = markers[i]; i++)
			marker.setMap(null);
		
		var bounds = new google.maps.LatLngBounds();
		
		for (var i = 0, place; place = places[i]; i++) {
		
			// Create a marker for each place.
			var _marker = new google.maps.Marker({
				map: map,
				zoom:16,
				title: place.name,
				position: place.geometry.location
			});
		
			// Recover country and town 
			for (var i in place.address_components) {
				var component = place.address_components[i];
				for (var j in component.types) { // Some types are ["country", "political"]
				var type_element = document.getElementById(component.types[j]);
				if (type_element)
					type_element.value = component.long_name;
			}
		}
		
		// Recover longitude and latitude
		$("#gmap_longitude").val(place.geometry.location.lng());
		$("#gmap_latitude").val(place.geometry.location.lat());
		
		bounds.extend(place.geometry.location);
		
		}
		
		map.fitBounds(bounds);
		
	});
	
	google.maps.event.addListener(map, 'bounds_changed', function() {
		var bounds = map.getBounds();
		searchBox.setBounds(bounds);
	});
	
	if(map){
		var property_location = myPlace;
		
		marker = new google.maps.Marker({	
			position: property_location,
			map: map
		});
		
		infowindow = new google.maps.InfoWindow({
			content: '<div style="width:250px">Latitude: ' + property_location.lat() + '<br>Longitude: ' + property_location.lng() + '</div>',
			maxWidth: 300
		});
	
		infowindow.open(map,marker);
	
		google.maps.event.addListener(map, 'click', function(event){
			placeMarker(event.latLng);
		});
	}
}

google.maps.event.addDomListener(window, 'load', map_picker_initialize);

function placeMarker(location){

	infowindow.close();

	marker.setPosition(location);

	infowindow.setContent('<div style="width:250px">Latitude: ' + location.lat() + '<br>Longitude: ' + location.lng()+'</div>');	

	infowindow.open(map,marker);

	document.getElementById("_noo_property_gmap_latitude").value=location.lat();

	document.getElementById("_noo_property_gmap_longitude").value=location.lng();

}


/* --------------------------------------------------------------------- */

/* BACK TO TOP BUTTON */

/* --------------------------------------------------------------------- */


(function() {
	$('#back-to-top').on( "click", function( event ) {
		event.preventDefault();	
		$('html, body').animate({
		scrollTop: 0
		}, 'slow');
		return false;
	});
})();



/* --------------------------------------------------------------------- */

/* PRICE SLIDER RANGE */

/* --------------------------------------------------------------------- */

(function() {

  if($('.gprice-slider-range').length){

	$(".gprice-slider-range").noUiSlider({

	  start: [200, 11000000],

	  range: {

		'min': 200,

		'max': 11000000

	  },

	  step: 1,

	  format: wNumb({

		decimals: 0,

		thousand: '.',

		prefix: '&#36;'

	  }),

	  connect: true

	});



	$(".gprice-slider-range").Link('lower').to('-inline-<div class="tooltip"></div>', function ( value ) {

	  $(this).html(

		'<span>' + value + '</span>'

	  );

	});



	$(".gprice-slider-range").Link('upper').to('-inline-<div class="tooltip"></div>', function ( value ) {

	  $(this).html(

		'<span>' + value + '</span>'

	  );

	});

  }

})();


/* --------------------------------------------------------------------- */

/* AREA SLIDER RANGE */

/* --------------------------------------------------------------------- */


(function() {

  if($('.garea-slider-range').length){

	$(".garea-slider-range").noUiSlider({

	  start: [200, 11000000],

	  range: {

		'min': 200,

		'max': 11000000

	  },

	  step: 1,

	  format: wNumb({

		decimals: 0,

		thousand: '.',

		prefix: '&#36;'

	  }),

	  connect: true

	});



	$(".garea-slider-range").Link('lower').to('-inline-<div class="tooltip"></div>', function ( value ) {

	  $(this).html(

		'<span>' + value + '</span>'

	  );

	});



	$(".garea-slider-range").Link('upper').to('-inline-<div class="tooltip"></div>', function ( value ) {

	  $(this).html(

		'<span>' + value + '</span>'

	  );

	});

  }

})();


/* --------------------------------------------------------------------- */
/* HOME MENU */
/* --------------------------------------------------------------------- */

function loadActuality(){
	$('#home-content').load('./actuality');
} 

function loadSearchPropertie(){
	$('#home-content').load('./searchProperties');
}

function loadSubmitPropertie(){
	$('#home-content').load('./submitProperties');
}

function loadProfile(){
	$('#home-content').load('./profile');
}

function loadChat(){
	$('#home-content').load('./chat');
}

function loadConversation(){
	$('#home-content').load('./conversation');	
}

function loadRegistration(){
	$('#index-content').load('./form_registration');	
}

function loadLogin(){
	$('#index-content').load('./form_login');	
}

function check_login(){
	$("#mail_field_login").val();
	$("#password_field_login").val();
	
}