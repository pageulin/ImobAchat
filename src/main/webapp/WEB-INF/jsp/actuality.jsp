<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<body class="background-grid">
    
    <div id="home-content" class="row height-100pc">
	    
		<!-- START RECENT PROPERTIES -->
		<section id="recent-properties-slider" class="wrap recent-properties recent-properties-slider">
		  <div class="container">
		
		    <div class="recent-properties-inner">
		      <div class="section-title">
		        <h3>Propriétés Recentes</h3>
		      </div>
		      <div class="recent-properties-content">
		        <div class="caroufredsel-wrap">
		          <ul>
		            
		            <c:forEach var="announcement" items="${announcements}" varStatus="loop">
		            
		            	<c:if test="${loop.count % 4 == 1}">
		            		<li>
		            		<div class="property-row">
		            	</c:if> 
		            	
		            	<c:if test="${loop.count % 4 == 3}">
		            		</div>
		            		<div class="property-row">
		            	</c:if>
		            	
						<article class="hentry has-featured col-md-6">
		                  <div class="property-featured">
		                    <a class="content-thumb" href="propertyDetails">
		                      <img src="resources/images/property/${announcement.pictures[0]}" class="attachment-property-thumb" alt="" />
		                    </a>
		                    <span class="property-category">
		                      <a>Appartement</a>
		                    </span>
		                    <div class="property-detail">
		                      <div class="size"><span>${announcement.area} m2</span>
		                      </div>
		                      <div class="bathrooms"><span>${announcement.bathrooms}</span>
		                      </div>
		                      <div class="bedrooms"><span>${announcement.bedrooms}</span>
		                      </div>
		                    </div>
		                  </div>
		                  <div class="property-wrap">
		                    <h2 class="property-title"><a href="propertyDetails" title="Visalia, NJ 93277">${announcement.country}, ${announcement.town}</a></h2>
		                    <div class="property-excerpt">
		                      <p>${announcement.description}</p>
		                    </div>
		                  </div>
		                  <div class="property-summary">
		                    <div class="property-info">
		                      <div class="property-price">
		                        <span><span class="amount">${announcement.price} Euros</span></span>
		                      </div>
		                      <div class="property-action">
		                        <a href="actuality/${announcement.id}">Voir plus</a>
		                      </div>
		                    </div>
		                  </div>
		                </article>
		                
		               <c:if test="${loop.count % 4 == 4}">
		            		</div>
		            		</li>
		            	</c:if>
		
					</c:forEach>
					
		          </ul>
		        </div>
		        <a class="caroufredsel-prev" href="#"></a>
		        <a class="caroufredsel-next" href="#"></a>
		      </div>
		    </div>
		  </div>
		</section>
		
		<section id="recent-properties-slider" class="wrap recent-properties recent-properties-slider">
		  <div class="container">
		
		    <div class="recent-properties-inner">
		      <div class="section-title">
		        <h3>Annonces recommandées</h3>
		      </div>
		        
		        <c:forEach var="announcement" items="${sessionScope.user.potentiallyInterestingAnnouncements}">
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
		    </div>
		  </div>
	  </section>

	</div>
</body>