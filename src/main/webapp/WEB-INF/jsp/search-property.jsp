<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<body class="background-grid">
    
    <div id="home-content" class="row height-100pc">
    
		<div class="col-md-12">
		      <!-- START MAP VERTICAL -->
		      <section id="search_map_vertical" class="wrap noo_advanced_search_property vertical">
		        <div class="noo-map">
		          <div id="gmap"></div>
		
		          <div class="gmap-search">
		            <input placeholder="Search your map" type="text" autocomplete="off" id="gmap_search_input">
		          </div>
		          <div class="gmap-control">
		            <a class="gmap-mylocation" href="#"><i class="fa fa-map-marker"></i>My Location</a>
		            <a class="gmap-full" href="#"><i class="fa fa-expand"></i></a>
		            <a class="gmap-prev" href="#"><i class="fa fa-angle-left"></i></a>
		            <a class="gmap-next" href="#"><i class="fa fa-angle-right"></i></a>
		          </div>
		          <div class="gmap-zoom">
		            <a href="#" class="zoom-in"><i class="fa fa-plus"></i></a>
		            <a href="#" class="zoom-out"><i class="fa fa-minus"></i></a>
		          </div>
		          <div class="gmap-loading">Loading Maps
		            <div class="gmap-loader">
		              <div class="rect1"></div>
		              <div class="rect2"></div>
		              <div class="rect3"></div>
		              <div class="rect4"></div>
		              <div class="rect5"></div>
		            </div>
		          </div>
		
		          <div class="gsearch">
		            <div class="container">
		              <div class="gsearch-wrap">
		                <!-- <h3 class="gsearch-title"><i class="fa fa-search"></i><span>SEARCH FOR PROPERTY</span></h3> -->
		                <form:form commandName="Search" class="gsearchform" role="search"  method="POST">
				
		                  <div class="gsearch-content">
		                    <div class="gsearch-field">
		
		                      <div class="form-group gbed">
		                        <div class="label-select">
		                          <form:select path="bedrooms" class="form-control">
		                            <option>Nb. Chambres</option>
		                            <option>1</option>
		                            <option>2</option>
		                            <option>3</option>
		                            <option>4</option>
		                            <option>5</option>
		                          </form:select>
		                        </div>
		                      </div>
		
		                      <div class="form-group gbath">
		                        <div class="label-select">
		                          <form:select path="bathrooms" class="form-control">
		                            <option>Nb. Salles de bains</option>
		                            <option>1</option>
		                            <option>2</option>
		                            <option>3</option>
		                            <option>4</option>
		                          </form:select>
		                        </div>
		                      </div>
		
		                      <div class="form-group gprice">
		                        <span class="gprice-label">Price</span>
		                        <div class="gslider-range gprice-slider-range"></div>
		                        <span class="gslider-range-value gprice-slider-range-value-min"></span>
		                        <span class="gslider-range-value gprice-slider-range-value-max"></span>
		                      </div>
		
		                      <div class="form-group garea">
		                        <span class="garea-label">Area</span>
		                        <div class="gslider-range garea-slider-range"></div>
		                        <span class="gslider-range-value garea-slider-range-value-min"></span>
		                        <span class="gslider-range-value garea-slider-range-value-max"></span>
		                      </div>
		                    </div>
		
		                    <div class="gsearch-action">
		                      <div class="gsubmit">
		                        <button class="btn btn-info" type="submit">Rechercher</button>
		                      </div>
		                    </div>
		                  </div>
		                </form:form>
		                
		              </div>
		            </div>
		          </div>
		        </div>
		      </section>
		      <!-- END MAP VERTICAL -->
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

<!--  <script type="text/javascript" src="resources/js/gmap-data.js"></script> -->

<script>

var nooGmapL10n = {

		  "latitude": "46.227638",

		  "longitude": "2.213749",

		  "maxZoom_MarkerClusterer": "5",

		  "zoom": "6",

		  "area_unit": "sqft",

		  "thousands_sep": ",",

		  "decimal_sep": ".",

		  "num_decimals": "0",

		  "currency": "$",

		  "currency_position": "left",

		  "default_label": "",

		  "fullscreen_label": "",

		  "no_geolocation_pos": "The browser couldn't detect your position!",

		  "no_geolocation_msg": "Geolocation is not supported by this browser.",

		  "markers": [
		              
			${makers}
		   
			],

		  "ajax_finishedMsg": "All posts displayed"

		};
</script>
