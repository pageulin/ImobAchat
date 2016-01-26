<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

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
		                <form class="gsearchform" method="get" role="search">
		                  <div class="gsearch-content">
		                    <div class="gsearch-field">
		                      
		                      <!-- <div class="form-group glocation">
		                        <div class="label-select">
		                          <select class="form-control">
		                            <option>All Locations</option>
		                            <option>New Jersey</option>
		                            <option>New York</option>
		                          </select>
		                        </div>
		                      </div>
		
		                      <div class="form-group gsub-location">
		                        <div class="label-select">
		                          <select class="form-control">
		                            <option>All Sub-locations</option>
		                            <option>Central New York</option>
		                            <option>GreenVille</option>
		                            <option>Long Island</option>
		                            <option>New York City</option>
		                            <option>West Side</option>
		                          </select>
		                        </div>
		                      </div>
		
		                      <div class="form-group gstatus">
		                        <div class="label-select">
		                          <select class="form-control">
		                          <option>All Status</option>
		                          <option>Open house</option>
		                          <option>Rent</option>
		                          <option>Sale</option>
		                          <option>Sold</option>
		                        </select>
		                        </div>
		                      </div>
		
		                      <div class="form-group gtype">
		                        <div class="label-select">
		                          <select class="form-control">
		                            <option>All Type </option>
		                            <option>Apartment</option>
		                            <option>Co-op</option>
		                            <option>Condo</option>
		                            <option>Single Family Home</option>
		                          </select>
		                        </div>
		                      </div> -->
		
		                      <div class="form-group gbed">
		                        <div class="label-select">
		                          <select class="form-control">
		                            <option>Nb. Chambres</option>
		                            <option>1</option>
		                            <option>2</option>
		                            <option>3</option>
		                            <option>4</option>
		                            <option>5</option>
		                          </select>
		                        </div>
		                      </div>
		
		                      <div class="form-group gbath">
		                        <div class="label-select">
		                          <select class="form-control">
		                            <option>Nb. Salles de bains</option>
		                            <option>1</option>
		                            <option>2</option>
		                            <option>3</option>
		                            <option>4</option>
		                          </select>
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
		                        <a class="btn btn-info" href="#">Rechercher</a>
		                      </div>
		                    </div>
		                  </div>
		                </form>
		              </div>
		            </div>
		          </div>
		        </div>
		      </section>
		      <!-- END MAP VERTICAL -->
		</div>
	</div>
</body>