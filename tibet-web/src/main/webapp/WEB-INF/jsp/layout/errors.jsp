<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<c:if test="${not empty error}">
        <span class="errors"><c:out value="${error}"/><br></span>
</c:if>

