<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${user == null}"><c:redirect url="/login"/></c:if>
<c:redirect url="/searchProperty"/>
