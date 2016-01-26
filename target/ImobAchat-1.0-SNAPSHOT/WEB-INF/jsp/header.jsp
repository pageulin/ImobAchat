<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<header class="row">
    <label class="col-md-1 uppercase">ImobAchat</label>
    <div class="col-md-4 pos-right">

        <form:form commandName="logout" action="index" id="logout">
            <i class="inline-block fa fa-user"></i>
        
            <p class="inline-block">${sessionScope.user.pseudo}</p>

            <button type="submit" class="inline-block btn-black">Déconnection</button>
        </form:form>
    
    </div>
</header>

<ul class="menu">
    <li><a href="/ImobAchat/searchProperty">Rechercher une annonce</a></li> <!-- onclick="loadSearchPropertie()" -->
    <li><a href="/ImobAchat/actuality">Actualité</a></li>
    <li><a href="/ImobAchat/submitProperty">Déposer une annonce</a></li>
    <li><a href="/ImobAchat/profile">Mon Profile</a></li>
    <li><a href="/ImobAchat/chat">Chat</a></li>
    <li><a href="/ImobAchat/admin">Admin</a></li>
</ul>