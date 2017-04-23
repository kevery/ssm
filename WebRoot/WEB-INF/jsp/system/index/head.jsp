<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
</head>
<body>
<div id="container" style="width:100%; height:100%"></div>
</body>
<script src="http://webapi.amap.com/maps?v=1.3&key=55a9ce066b400539558d50e7cf2f4af5"></script>
<script>
    var defaultLayer = new AMap.TileLayer();
    var traffic = new AMap.TileLayer.Traffic();
    var Satellite = new AMap.TileLayer.Satellite();
    var option = {
        zoom:10,
        center:[116.39,39.9],
        layers: [
//            Satellite//默认图层
//            traffic//实时交通图层
        ]
    };
    var map = new AMap.Map('container', option);


    var plugins = ['AMap.ToolBar', 'AMap.Scale', 'AMap.OverView'];
    AMap.plugin(plugins,function () {
        map.addControl(new AMap.ToolBar());//工具条
        map.addControl(new AMap.Scale());//比例尺
        map.addControl(new AMap.OverView({isOpen:true}));//鹰眼缩略图
    })
</script>
</html>
