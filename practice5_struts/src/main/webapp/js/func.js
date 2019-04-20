function getXmlHttpRequest() {
    var xmlHttpReq = null;
    if (window.XMLHttpRequest) {
        xmlHttpReq = new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        // 兼容IE5、IE6
        xmlHttpReq = new ActiveXObject("Microsoft.XMLHTTP");
    }
    return xmlHttpReq;
}