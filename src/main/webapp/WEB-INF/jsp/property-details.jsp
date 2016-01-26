<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<body class="background-grid">
    
    <div id="home-content" class="row height-100pc">
				
		<div class="row">
			<div class="col-md-12 margin-top-30px">
				<center><b class="font-size-20px">${announcement.address}</b> <i class="fa fa-heart-o fa-2x pink pointer"></i></center>
			</div>
		
			<div class="col-md-12">
				<div class="col-md-offset-2 col-md-4">
					<h3>Détails</h3>
		
					<div class="row grey-box">
						<div class="col-md-6 align-left">
							<p>Price</p>
							<p>Surface</p>
							<p>Chambres</p>
							<p>Salles de bains</p>
						</div>
		
						<div class="col-md-6 align-left">
							<p>${announcement.price} €</p>
							<p>${announcement.area} m²</p>
							<p>${announcement.bedrooms}</p>
							<p>${announcement.bathrooms}</p>
						</div>
					</div>
		
					<h3>Contact</h3>
		
					<div class="row grey-box">
						<div class="col-md-6 align-left">
							<p>Mail</p>
							<p>Téléphone</p>
						</div>
		
						<div class="col-md-6 align-left">
							<p>${announcement.owner.email}</p>
							<p>${announcement.owner.phone}</p>
						</div>
					</div>
				</div>
		
				<div class="col-md-4">
					
					<h3>Photo principal</h3>
		
					<div class="row">
						<img class="col-md-12" src="resources/images/property/${announcement.pictures[0]}"/>
					</div>
				</div>
			</div>
		
			<div class="col-md-12 margin-top-30px">
				<div class="col-md-offset-2 col-md-8">
					<h3>Photos</h3>
		
					<div class="row">
					
		           		<c:forEach var="picture" items="${announcement.pictures}">
							<a target="blank" href="resources/images/property/${picture}"><img class="col-md-3 margin-top-10px" src="resources/images/property/${picture}" /></a>
						</c:forEach>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
