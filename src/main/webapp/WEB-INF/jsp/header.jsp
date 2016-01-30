<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<header class="row">
    <label class="col-md-1 uppercase">ImobAchat</label>
    <div class="col-md-4 pos-right">
	<c:if test="${user != null}">
        <form:form commandName="logout" action="index" id="logout">
            <i class="inline-block fa fa-user"></i>
        
            <p class="inline-block">${sessionScope.user.pseudo}</p>

            <button type="submit" class="inline-block btn-black">Déconnection</button>
        </form:form>
   </c:if>
   
   <c:if test="${user == null}">
   
   	<form:form action="connect" method="GET">
            
            <button type="submit" class="inline-block btn-black">Connection</button>
            
        </form:form>
   	
    
    
   
      
   	
   </c:if>
    
    </div>
</header>

<ul class="menu">
    <li><a href="/ImobAchat/searchProperty">Rechercher une annonce</a></li> <!-- onclick="loadSearchPropertie()" -->
    <c:if test="${user != null}"><li><a href="/ImobAchat/actuality">Actualité</a></li></c:if>
    <c:if test="${user != null}"><li><a href="/ImobAchat/submitProperty">Déposer une annonce</a></li></c:if>
   <c:if test="${user != null}"> <li><a href="/ImobAchat/profile">Profile</a></li></c:if>
    <c:if test="${user != null}"><li><a href="/ImobAchat/notification">Notifications(${fn:length(sessionScope.user.waitingNotifications)})</a></li></c:if>
   <c:if test="${user != null}"> <li><a href="/ImobAchat/chat">Chat</a></li></c:if>
    <c:if test="${user != null}"><li><a href="/ImobAchat/admin">Admin</a></li></c:if>
</ul>