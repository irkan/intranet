<%@page contentType="text/html" pageEncoding="UTF-8"%><jsp:useBean id="INDEX" class="BEANS.MyBean" scope="page"/><jsp:useBean id="CSS" class="BEANS.CSSTotal" scope="application"/>
<jsp:useBean id="CSS3" class="BEANS.css1Bean" scope="page"/>
<jsp:useBean id="CSS1" class="BEANS.cssPage" scope="page"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
    String user_id = (String) session.getAttribute("id");
    String res = INDEX.getRes(request);
    String css = CSS.getCSS(request);
%>
<html>
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <title>Редактирование моей страницы</title>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
        <meta http-equiv="content-style-type" content="text/css"/>
        <link rel="stylesheet" href="/FILES/alloy/build/aui-skin-classic/css/aui-skin-classic-all-min.css" type="text/css" media="screen" />
        <style type="text/css">
            @import url('css/exxo.css');
            @import url('css/exxo-my.css');
            @import url('vids.css');
            .aui-panel-hd button, #animList button {height: 24px; padding-top: 5px; min-width: 26px;}
            .aui-portal-layout-proxy {position: absolute;width: 100px;height: 20px;background: black;opacity: .7;filter: alpha(opacity=70);}
            #animList {color:#6b6b6b; left: -200px;position: absolute;top: 100px;z-index:100;display:none;background-color: white;}
            .portlet-list {background-color: white;border-width: 0px;width:250px; padding: 10px;}
            .portlet-list .portlet-item {margin: 5px;padding: 2px;display:block; border: 2px solid #dedede;}
            .aui-portal-layout-drag-target-indicator  {margin: 2px 0;}
            #content-wrapper {width: 100%;height:500px;}
            table#grid {position: relative;width:100%;min-height:300px;}
            table#grid td#column-1 {width: 60%;}
            table#grid td#column-4 {width:200px;}
            table#grid td.menu-td{width: 200px;}
            div.portlet {margin-bottom:25px;font-size: 12px;}
            span.blue {color:blue;}
            td#menu-td .portlet{width:150px;}
            #content-wrapper div#header{position: relative;width:  100%;height:30px; background-image: url('img/spr.png'); background-repeat: repeat-x;background-position: center;}
            .img {display:block;background-color: white;width: 120px;height: 120px;float: left;margin: 5px;background-position: center;background-repeat: no-repeat;}
            .IMG {height: 150px;background-color: white;position: relative;overflow-y: auto;overflow-x: hidden;}
            #header1 {margin-left: 10px; margin-top: 2px;}
            div.aui-panel-hd {background-image: none;background: none;border: 0;}
            div.aui-panel-content {border: 0;}
            div#animList div.aui-panel-hd{background:#ccc;border-bottom:1px solid #999;font-weight:bold;padding:2px 3px 2px 4px; background:#c0c2c5 url(alloy/build/aui-skins/classic/images/panel/header_bg.png) repeat-x 0 0;border:0 solid;border-color:#C8C9CA #aeb2b8 #aeb2b8 #C8C9CA;border-bottom-width:1px;padding-left:10px;text-shadow:1px 1px #fff;}
            div#animList .aui-panel-content{border:1px solid #999; font-size:11px;}
            div#animList div.aui-panel-content div.portlet-item {cursor: move; margin-top: 8px;}
            div#animList div.aui-panel-content div.portlet-item span {margin-right:5px;}
            .portlet-list div.portlet-item {display: none; padding: 10px 4px; color: #bfbfbf;}
            .portlet-list select {width: 100%; margin-bottom: 10px;}
            .portlet-list #op1 {}
            .other {display:none;}
            .portlet-list #selects {padding-bottom: 20px;}
            .portlet-list div.portlet-item:hover {border:2px solid #bfbfbf; color: black;}
            .yui3-scrollview-first,  .yui3-scrollview-last{visibility:hidden;}
            .newDocsContent li,.newBlogsContent li {line-height: 0; display: block;}
            div.exxo-scrollview-up {position: absolute; width: 24px; height: 24px; background-color: white; z-index: 999; bottom: 1px; right: 1px; cursor: pointer; background-image: url(/EXXO/small/tobegin.png); background-position: center center; background-repeat: no-repeat; background-size: auto auto; border-radius: 20px;border: 1px solid #bfbfbf;}
            div.exxo-scrollview-buttons {position: absolute; width: 52px; height: 26px; background-color: transparent; z-index: 999; top: 42px; right: 0px;}
            #content-wrapper button.exxo-scrollview-next {position: relative; display: inline-block; width: 20px; height: 20px; background-color: #dedede; cursor: pointer;background-image: url(/EXXO/small/arrow-up.png); background-position: center center; background-repeat: no-repeat; border-radius: 12px; border: 1px solid #bfbfbf; margin: 1px;}
            #content-wrapper button.exxo-scrollview-back {position: relative; display: inline-block; width: 20px; height: 20px; background-color: #dedede; cursor: pointer;background-image: url(/EXXO/small/arrow-down.png); background-position: center center; background-repeat: no-repeat; border-radius: 12px; border: 1px solid #bfbfbf; margin: 1px;}
            button.exxo-scrollview-back:hover {border-color: #dedede;background-color: white;}
            button.exxo-scrollview-next:hover {border-color: #dedede;background-color: white;}
            div.exxo-scrollview-up:hover {border-color: #dedede; background-color: white;}
            .exxo-hidden {display: none !important;}
            .newDocsContent tr.docs td,.newBlogsContent tr.blog td {line-height: normal; height: 44px; padding: 6px;}
            .newDocsContent tr.docs td.first,.newBlogsContent tr.blog td.first {width: 22px;padding: 2px; }
            .newDocsContent tr.docs td.created, .newBlogsContent tr.blog td.created {width: 100px; }
            .newDocsContent tr.docs td.fio,.newBlogsContent tr.blog td.fio {width: 33px;}
            .newDocsContent tr.docs td.fio div,.newBlogsContent tr.blog td.fio div {background-size: contain; background-position: center center; background-repeat: no-repeat; height: 44px; border-radius: 5px;}
            .newDocsContent tr.docs td.first div,.newBlogsContent tr.blog td.first div {width: 100%; height: 20px; background-position: center center; background-repeat: no-repeat;}
            .newDocsContent tr.docs td.fil a,.newBlogsContent tr.blog td.fil a{display: block; width: auto; height: 44px; overflow: hidden; text-decoration: none;}
            span.exxo-date {padding-right: 10px;font-weight: bold;}
            a.notopend {font-weight: normal; color: black;}
            #docsH3 {margin:0; padding: 5px; background-color: rgb(59,59,82);border-radius: 4px 4px 0px 0px;}
            #docsH3 a {color: #dedede;}
            #docsH3 a:hover {color: white;}
            #blogH3 {margin:0; padding: 5px; background-color: rgb(82, 82, 136);border-radius: 4px 4px 0px 0px;}
            #blogH3 a {color: #dedede;}
            #blogH3 a:hover {color: white;}
            div.portlet {border-radius: 4px;}
            .newGalsContent li.gal a {display: inline-block;width: 120px;height: 120px;margin: 2px;background-position: center;background-repeat: no-repeat;}
            .newGalsContent li.gal, .IMG li {background-image: none; display: inline-block; margin:0; padding:0;}
            .newGalsContent, .IMG{white-space:nowrap;}
        </style>
        <script src="/FILES/alloy/build/aui/aui.js" type="text/javascript"></script>
        <link rel="stylesheet" href="vids.css" type="text/css" />
        <link rel="stylesheet" href="index.css" type="text/css" />
        <style><%=css%></style>
        <style><%=CSS3.getCSS("myEdit.jsp", request)%></style>
    </head>
    <body id="myEdit_jsp">
        <div id="content-wrapper">
            <div id="header">
                <div id="header1"></div>
                <div id="header2"></div>
                    
            </div>
            <table id="grid" class="grid">
                <%=res%>
            </table>
        </div>
            <div id="animList" class="exxo-shadow1">
                <div class="portlet-list">
                    <div id="selects">
                    <select id="op1" name="op1">
                        <option value="0" SELECTED> widget seçin </option>
                        <option value="calendar"> kalendar </option>
                        <option value="bloges"> mesajlar </option>
                        <option value="docs"> sənədlər </option>
                        <option value="birthday"> doğum günləri </option>
                        <option value="faces"> yeni əməkdaşlar </option>
                        <option value="desk"> elanlar </option>
                        <option value="photos"> şəkillər </option>
                        <option value="albums"> fotoalbom </option>
                        <option value="news"> xəbərlər </option>
                    </select>
                    <select id="op2" name="op2" class="other">
                        <option value="0" SELECTED>seçin</option>
                        <option value="1">işçilər</option>
                        <option value="2">şirkət</option>
                    </select>
                    <select id="op3" name="op3" class="other">
                        <option value="1" SELECTED>bütün</option>
                        <option value="2">yalnız iş üçün</option>
                    </select>
                    <select id="op4" name="op4" class="other">
                        <option value="1" SELECTED>bütün</option>
                        <option value="2">gələnlər</option>
                        <option value="3">göndərilənlər</option>
                    </select>
                    <select id="op5" name="op5" class="other">
                        <option value="0" SELECTED>seçin</option>
                        <option value="1">bütün</option>
                        <option value="2">ümumi</option>
                        <option value="3">şəxsi</option>
                        <option value="4">qrup</option>
                        <option value="5">proyekt</option>
                        <option value="6">bölünmüş</option>
                        <option value="7">bütün ümumi</option>
                    </select>
                    <select id="op6" name="op6" class="other">
                        <option value="1" SELECTED>Sənədlərim</option>
                        <option value="2">Gələnlər</option>
                        <option value="3">Bütün sənədlər</option>
                        <option value="4">Gələn sənədlər şirkətə</option>
                        <option value="5">Göndərilən sənədlər</option>
                        <option value="6">Daxili sənədlər</option>
                    </select>
                    <select id="op7" name="op7" class="other">
                        <option value="0" SELECTED>seçin</option>
                        <option value="1">hamsı</option>
                        <option value="2">ümumi</option>
                        <option value="3">şəxsi</option>
                        <option value="4">qrup</option>
                        <option value="5">proyekt</option>
                        <option value="6">bölünmüş</option>
                        <option value="7">bütün ümumi</option>
                    </select>
                </div>
                <div class="portlet-item" id="my-calendar"><span class="aui-button-icon aui-icon aui-icon-calendar"></span>istəldiyiniz yerə sürükləyin</div>
                <div class="portlet-item" id="my-birthday"><span class="aui-button-icon aui-icon aui-icon-heart"></span>istəldiyiniz yerə sürükləyin</div>
                <div class="portlet-item" id="my-NC"><span class="aui-button-icon aui-icon aui-icon-person"></span>istəldiyiniz yerə sürükləyin</div>
                <div class="portlet-item my-D" id="my-D"><span class="aui-button-icon aui-icon aui-icon-copy"></span>istəldiyiniz yerə sürükləyin</div>
                <div class="portlet-item" id="my-news"><span class="aui-button-icon aui-icon aui-icon-document-b"></span>istəldiyiniz yerə sürükləyin</div>
                <div class="portlet-item" id="my-gal"><span class="aui-button-icon aui-icon aui-icon-folder-open"></span>istəldiyiniz yerə sürükləyin</div>
                <div class="portlet-item" id="my-Kgal"><span class="aui-button-icon aui-icon aui-icon-folder-open"></span>istəldiyiniz yerə sürükləyin</div>
                <div class="portlet-item" id="my-desk"><span class="aui-button-icon aui-icon aui-icon-notice"></span>istəldiyiniz yerə sürükləyin</div>
                <div class="portlet-item my-B" id="my-B"><span class="aui-button-icon aui-icon aui-icon-note"></span>istəldiyiniz yerə sürükləyin</div>
                <div class="portlet-item" id="my-P"><span class="aui-button-icon aui-icon aui-icon-image"></span>istəldiyiniz yerə sürükləyin</div></div></div>
        <script type="text/javascript">
            AUI().ready('aui-portal-layout', 'anim', 'aui-panel', 'aui-io-request', 'aui-toolbar', 'aui-scroller', 'scrollview', 'scrollview-paginator', 'datatype-number', function (A) {
                var sv_height = 285;
                var dragging;
                A.one('body').delegate('mousedown', function (e) {
                    dragging = this;
                }, '.portlet');
                var pl = A.one("#animList");
                var plHTML = pl.html();
                pl.empty();
                new A.Panel({collapsible: false, collapsed: false, headerContent: '', bodyContent: plHTML,
                    icons: [{icon: 'closethick', handler: {fn: function (e) {
                                    pListHide()
                                }, type: 'click'}}]}).render(pl);
                var DDM = A.DD.DDM;
                var proxyNode = A.Node.create('<div class="aui-portal-layout-proxy"></div>');
                var portalLayout = new A.PortalLayout({dragNodes: '.portlet', dropNodes: '.exxo-column', proxyNode: proxyNode, lazyStart: true,
                    after: {'drag:end': function (event) {
                            fixElements();
                            loadOne(dragging);
                        }}});
                loadAll();
                function loadAll() {
                    A.all(".portlet").each(function () {
                        var ins = this;
                        var id = ins.getAttribute('id');
                        ins.empty();
                        if (id.indexOf("calendar") == 0) {
                            widget(ins, 'eventsVid');
                        } else if (id.indexOf("Birthday") == 0) {
                            widget(ins, 'birthOut');
                        } else if (id.indexOf("newComers") == 0) {
                            widget(ins, 'newComers');
                        } else if (id.indexOf("newDocsK") == 0) {
                            widget(ins, 'newDocK');
                        } else if (id.indexOf("newDocs") == 0) {
                            widget(ins, 'newDoc');
                        } else if (id.indexOf("newNews") == 0) {
                            widget(ins, 'newNews');
                        } else if (id.indexOf("newGal") == 0) {
                            widget(ins, 'newGal');
                        } else if (id.indexOf("newKGal") == 0) {
                            widget(ins, 'newKGal');
                        } else if (id.indexOf("newDesk") == 0) {
                            widget(ins, 'newDesk');
                        } else if (id.indexOf("newBlog") == 0) {
                            widget(ins, 'newBlog');
                        } else if (id.indexOf("newBBlog") == 0) {
                            widget(ins, 'newBBlog');
                        } else if (id.indexOf("newPhotos") == 0) {
                            widget(ins, 'NewPhotos');
                        }
                    });
                }
                function loadOne(ins) {
                    var id = ins.getAttribute('id');
                    ins.empty();
                    if (id.indexOf("calendar") == 0) {
                        widget(ins, 'eventsVid');
                    } else if (id.indexOf("Birthday") == 0) {
                        widget(ins, 'birthOut');
                    } else if (id.indexOf("newComers") == 0) {
                        widget(ins, 'newComers');
                    } else if (id.indexOf("newDocsK") == 0) {
                        widget(ins, 'newDocK');
                    } else if (id.indexOf("newDocs") == 0) {
                        widget(ins, 'newDoc');
                    } else if (id.indexOf("newNews") == 0) {
                        widget(ins, 'newNews');
                    } else if (id.indexOf("newGal") == 0) {
                        widget(ins, 'newGal');
                    } else if (id.indexOf("newKGal") == 0) {
                        widget(ins, 'newKGal');
                    } else if (id.indexOf("newDesk") == 0) {
                        widget(ins, 'newDesk');
                    } else if (id.indexOf("newBlog") == 0) {
                        widget(ins, 'newBlog');
                    } else if (id.indexOf("newBBlog") == 0) {
                        widget(ins, 'newBBlog');
                    } else if (id.indexOf("newPhotos") == 0) {
                        widget(ins, 'NewPhotos');
                    }
                    ;
                }
                function widget(ins, servlet) {
                    var instance = new A.Panel({collapsible: false, collapsed: false, headerContent: '', bodyContent: '',
                        icons: [{icon: 'closethick', handler: {fn: function (e) {
                                        if (confirm("Удалить элемент?")) {
                                            ins.empty().unplug().remove();
                                            fixElements();
                                        }
                                    }, type: 'click'}}]}).render(ins);
                    textR(ins, instance, servlet);
                }
                function textR(ins, instance, servlet) {
                    var node = ins;
                    var width = Math.round(A.Number.parse(node.getComputedStyle('width').split('px')[0]));
                    var nodeFontSize = A.Number.parse(node.getComputedStyle('fontSize').split('px')[0]);
                    var classNode = "exxo-width-normal";
                    if (width <= 250)
                        classNode = "exxo-width-small";
                    else if (width > 400)
                        classNode = "exxo-width-big";
                    var id = ins.getAttribute('id');
                    var x2 = id;
                    var title = '';
                    var text = '';
                    A.io.request(servlet, {dataType: 'text', cache: false, data: {id: x2, width: width, font: nodeFontSize}, method: 'post',
                        on: {success: function (event, id, xhr) {
                                var Datas = this.get('responseData');
                                instance.set('bodyContent', Datas);
                                if (ins.get('parentNode')) {
                                    if (servlet == 'newNews') {
                                        node.all('img').each(function () {
                                            var style = this.getStyle('display');
                                            this.setStyle('display', 'none');
                                            width = Math.round(A.Number.parse(node.one('>div>div>div>div').getComputedStyle('width').split('px')[0]));
                                            this.setStyle('maxWidth', width + 'px');
                                            this.setStyle('display', style);
                                        });
                                    } else if (servlet == 'NewPhotos') {
                                        scrollViewH(node, ".IMG ul", servlet, x2);
                                    } else if (servlet == 'newBlog' || servlet == 'newBBlog') {
                                        scrollView(node, "div.newBlogsContent ul", servlet, x2);
                                    } else if (servlet == 'newDoc' || servlet == 'newDocK') {
                                        scrollView(node, "div.newDocsContent ul", servlet, x2);
                                    } else if (servlet == 'newDesk') {
                                        var component = new A.Scroller({contentBox: node.one('.desk'), height: sv_height, orientation: 'vertical', duration: 0.5}).render();
                                    } else if (servlet == 'newGal' || servlet == 'newKGal') {
                                        scrollViewH(node, "div.newGalsContent", servlet, x2);
                                    }
                                }
                            }}});
                }
                var PortletItem = function () {
                    PortletItem.superclass.constructor.apply(this, arguments);
                };
                PortletItem.NAME = 'PortletItem';
                PortletItem.ATTRS = {
                    dd: {value: {target: false}}, lazyStart: {value: true},
                    proxyNode: {value: proxyNode}, itemContainer: {value: A.one('.portlet-list')}};
                A.extend(PortletItem, A.PortalLayout, {
                    _getAppendNode: function () {
                        var instance = this;
                        instance.appendNode = DDM.activeDrag.get('node').cloneNode(true);
                        return instance.appendNode;
                    }
                });
                makeAPortlet('#my-calendar', 'calendar', 'eventsVid');
                makeAPortlet('#my-birthday', 'Birthday', 'birthOut');
                makeAPortlet('#my-NC', 'newComers', 'newComers');
                makeAPortlet('#my-news', 'newNews', 'newNews');
                makeAPortlet('#my-gal', 'newGal', 'newGal');
                makeAPortlet('#my-Kgal', 'newKGal', 'newKGal');
                makeAPortlet('#my-desk', 'newDesk', 'newDesk');
                makeAPortlet('#my-P', 'newPhotos', 'NewPhotos');
                function makeAPortlet(dragNode, aimNode, servlet) {
                    var portletListB = new PortletItem({dragNodes: dragNode});
                    portletListB.on('drag:end', function (event) {
                        var newBirthday = A.Node.create('<div class="portlet" id="' + aimNode + '"></div>');
                        if (portletListB.appendNode && portletListB.appendNode.inDoc()) {
                            portletListB.appendNode.replace(newBirthday);
                        }
                        var BodyContent = '<span class="aui-button-icon aui-icon aui-icon-loading"></span>';
                        var inst;
                        var instance = new A.Panel({collapsible: false, collapsed: false, headerContent: '', bodyContent: BodyContent, icons: [
                                {icon: 'closethick', handler: {fn: function (e) {
                                            if (confirm("Удалить элемент?")) {
                                                newBirthday.empty().unplug().remove();
                                                fixElements();
                                            }
                                        }, type: 'click'}}], after: {init: function (event) {
                                    inst = this;
                                    textR(newBirthday, inst, servlet);
                                    fixElements();
                                }}}).render(newBirthday);
                    });
                }

                var toolbar = new A.Toolbar({activeState: false, children: [
                        {label: 'Sonlandır', icon: 'check', handler: {fn: function (e) {
                                    location = "my.jsp"
                                }}},
                        {label: 'Добавить элемент', icon: 'circle-plus', handler: {fn: function (e) {
                                    pListShow()
                                }}},
                        {label: 'Справка', icon: 'help', handler: {fn: function (e) {
                                    window.open('http://exxo.ru/intranet/howto/CMS/newelement/');
                                }}}
                    ]}).render(A.one('#header1'));
                function alterText(text, servlet) {
                    var io = A.io.request(servlet, {cache: false, data: {text: text}, method: 'post'});
                }
                function fixElements() {
                    var grid = A.one('#grid');
                    grid.all('div, span').each(function () {
                        this.removeAttribute('_yuid');
                    });
                    var node = grid.cloneNode(true);
                    node.all('.exxo-column').removeClass('yui3-dd-drop');
                    node.all('.exxo-column div').setAttribute('class', 'portlet');
                    node.all('.exxo-column div').empty();
                    node.all('div, tbody, td, tr').each(function () {
                        this.removeAttribute('_yuid');
                    });
                    var structure = node.html();
                    node.remove();
                    node.destroy();
                    alterText(structure, 'insPersonal');
                }
                function pListShow() {
                    var pl = A.one("#animList");
                    pl.setStyle('display', 'block');
                    an.run();
                }
                function pListHide() {
                    an1.run();
                }
                var an = new A.Anim({node: "#animList", duration: 0.85, easing: A.Easing.elasticOut, from: {xy: [-200, 100]}, to: {xy: [200, 100]}});
                var an1 = new A.Anim({node: "#animList", duration: 0.8, easing: A.Easing.elasticOut, from: {xy: [200, 100]}, to: {xy: [-200, 100]}});
                an1.on('end', function () {
                    var pl = A.one("#animList");
                    pl.setStyle('display', 'none');
                });
                new A.DD.Drag({node: A.one('#animList'), haltDown: false});
                A.one('#content-wrapper').setStyle('minHeight', A.DOM.winHeight() + 'px');
                A.one('#op1').on('change', function () {
                    A.all('.portlet-list div.portlet-item').setStyle('display', 'none');
                    A.all('.other').setStyle('display', 'none');
                    var v = this.get('value');
                    A.all('.portlet-list div.portlet-item').setStyle('display', 'none');
                    if (v == 'calendar')
                        A.one('#my-calendar').setStyle('display', 'block');
                    else if (v == 'birthday')
                        A.one('#my-birthday').setStyle('display', 'block');
                    else if (v == 'bloges') {
                        var op3 = A.one("#op3");
                        op3.set('value', '0');
                        op3.setStyle('display', 'block');
                        var op4 = A.one("#op4");
                        op4.set('value', '0');
                        op4.setStyle('display', 'block');
                        var op5 = A.one("#op5");
                        op5.set('value', '0');
                        op5.setStyle('display', 'block');
                    } else if (v == 'docs') {
                        var op6 = A.one("#op6");
                        op6.set('value', '0');
                        op6.setStyle('display', 'block');
                        var op7 = A.one("#op7");
                        op7.set('value', '0');
                        op7.setStyle('display', 'block');
                    } else if (v == 'faces')
                        A.one('#my-NC').setStyle('display', 'block');
                    else if (v == 'desk')
                        A.one('#my-desk').setStyle('display', 'block');
                    else if (v == 'photos')
                        A.one('#my-P').setStyle('display', 'block');
                    else if (v == 'albums') {
                        var op2 = A.one("#op2");
                        op2.set('value', '0');
                        op2.setStyle('display', 'block');
                    } else if (v == 'news')
                        A.one('#my-news').setStyle('display', 'block');
                });
                A.one('#op2').on('change', function () {
                    var v = this.get('value');
                    A.all('.portlet-list div.portlet-item').setStyle('display', 'none');
                    if (v == '1')
                        A.one('#my-gal').setStyle('display', 'block');
                    else if (v == '2')
                        A.one('#my-Kgal').setStyle('display', 'block');
                });
                A.one('#op5').on('change', function () {
                    var v = this.get('value');
                    var s = "my-b";
                    var m = "";
                    var b = A.one('#op3').get('value');
                    var i = A.one('#op4').get('value');
                    if (b == 1)
                        m = 'a';
                    else if (b == 2)
                        m = 'b';
                    if (i == 1)
                        m += 'A';
                    else if (i == 2)
                        m += 'I';
                    else
                        m += 'O';
                    A.all('.portlet-list div.portlet-item').setStyle('display', 'none');
                    m += '_' + v;
                    s += m;
                    A.one('#' + s).setStyle('display', 'block');
                });
                A.one('#op7').on('change', function () {
                    var v = this.get('value');
                    var s = "my-D";
                    var m = "";
                    var i = A.one('#op6').get('value');
                    m += i;
                    A.all('.portlet-list div.portlet-item').setStyle('display', 'none');
                    m += '_' + v;
                    s += m;
                    A.one('#' + s).setStyle('display', 'block');
                });
                A.one('#op3').on("change", function () {
                    if (A.one('#op5').get('value') != 0)
                        A.one('#op5').set('value', '0');
                });
                A.one('#op4').on("change", function () {
                    if (A.one('#op5').get('value') != 0)
                        A.one('#op5').set('value', '0');
                });
                A.one('#op6').on("change", function () {
                    if (A.one('#op7').get('value') != 0)
                        A.one('#op7').set('value', '0');
                });
                var S = ['a', 'b'];
                var B = ['A', 'I', 'O'];
                for (var i = 1; i <= 2; i++) {
                    for (var y = 1; y <= 3; y++) {
                        for (var k = 1; k <= 7; k++) {
                            var m = S[i - 1] + B[y - 1] + "_" + k;
                            var s = '<div class="portlet-item my-b' + m + '" id="my-b' + m + '"><span class="aui-button-icon aui-icon aui-icon-image"></span>перетащите в нужное место</div>';
                            A.one('.portlet-list').append(s);
                            makeAPortlet('#my-b' + m, 'newBlog_' + m, 'newBlog');
                        }
                    }
                }
                for (var y = 1; y <= 6; y++) {
                    for (var k = 1; k <= 7; k++) {
                        var m = y + "_" + k;
                        var s = '<div class="portlet-item my-D' + m + '" id="my-D' + m + '"><span class="aui-button-icon aui-icon aui-icon-image"></span>перетащите в нужное место</div>';
                        A.one('.portlet-list').append(s);
                        makeAPortlet('#my-D' + m, 'newDocs_' + m, 'newDoc');
                    }
                }
                function appender(x2, servlet, sv, count, node) {
                    var width = Math.round(A.Number.parse(node.getComputedStyle('width').split('px')[0]));
                    var nodeFontSize = A.Number.parse(node.getComputedStyle('fontSize').split('px')[0]);
                    var content = sv.get('contentBox');
                    A.io.request("add_" + servlet, {
                        dataType: 'text',
                        cache: false,
                        data: {id: x2, count: count, width: width, font: nodeFontSize},
                        method: 'post',
                        on: {success: function (event, id, xhr) {
                                content.append(this.get('responseData'));
                                sv.set('height', sv_height + 10 + "px");
                                sv.set('height', sv_height + "px");
                                sv.syncUI();
                                contentDelegate(sv);
                            }}});
                }
                ;
                function contentDelegate(sv) {
                    var content = sv.get("contentBox");
                    content.delegate("click", function (e) {
                        if (Math.abs(sv.lastScrolledAmt) > 2) {
                            e.preventDefault();
                        }
                    }, "a");
                    content.delegate("mousedown", function (e) {
                        e.preventDefault();
                    }, "a, li");
                }
                function scrollView(node, string, servlet, x2) {
                    var count = 1;
                    var sv = new A.ScrollView({srcNode: node.one(string), height: sv_height, axis: "y", flick: {
                            minDistance: 10, minVelocity: 0.3, axis: "y"},
                        on: {'scrollEnd': function () {
                                if (sv.pages.get('index') == 0 && up != null)
                                    up.addClass('exxo-hidden');
                                else if (sv.pages.get('index') != 0)
                                    up.removeClass('exxo-hidden');
                                var h = 0;
                                sv.get('contentBox').all('table').each(function () {
                                    h += this.outerHeight();
                                });
                                if (count < 10 && (Math.abs(sv.get('scrollY') - h) < (sv_height + 200 * count))) {
                                    appender(x2, servlet, sv, count, node);
                                    count++;
                                }
                            }}
                    });
                    sv.plug(A.Plugin.ScrollViewPaginator, {selector: 'li'});
                    sv.render();
                    contentDelegate(sv);
                    node.setStyle('position', 'relative');
                    var up = A.Node.create("<div class='exxo-scrollview-up exxo-hidden'></div>");
                    node.append(up);
                    up.on('click', function () {
                        sv.pages.scrollTo(0, 0.6, "ease-in");
                    });
                    var buts = A.Node.create("<div class='exxo-scrollview-buttons'></div>");
                    node.append(buts);
                    var back = A.Node.create("<button class='exxo-scrollview-back'></button>");
                    buts.append(back);
                    var next = A.Node.create("<button class='exxo-scrollview-next'></button>");
                    buts.append(next);
                    next.on('click', function () {
                        sv.pages.next();
                    });
                    back.on('click', function () {
                        sv.pages.prev();
                    });
                }
                function scrollViewH(node, string, servlet, x2) {
                    node.addClass('exxo-hidden');
                    var nodeW = Math.round(A.Number.parse(node.get('parentNode').getComputedStyle('width').split('px')[0]));
                    node.removeClass('exxo-hidden');
                    var count = 1;
                    var sv = new A.ScrollView({srcNode: node.one(string), height: 150, width: nodeW - 16, axis: "x", flick: false, drag: false,
                        on: {'scrollEnd': function () {
                                if (sv.pages.get('index') == 0 && up != null)
                                    up.addClass('exxo-hidden');
                                else if (sv.pages.get('index') != 0)
                                    up.removeClass('exxo-hidden');
                                node.all('.unload_' + (this.pages.get('index') + 1)).removeClass('exxo-loading');
                            },
                            'render': function () {
                                node.all('.unload_' + this.pages.get('index')).removeClass('exxo-loading');
                                A.all('.unload_' + (this.pages.get('index') + 1)).removeClass('exxo-loading');
                            }
                        }
                    });
                    sv.plug(A.Plugin.ScrollViewPaginator, {selector: 'li'});
                    sv.render();
                    node.setStyle('position', 'relative');
                    var up = A.Node.create("<div class='exxo-scrollview-up exxo-hidden'></div>");
                    node.append(up);
                    up.on('click', function () {
                        sv.pages.scrollTo(0, 0.6, "ease-in");
                    });
                    var buts = A.Node.create("<div class='exxo-scrollview-buttons'></div>");
                    node.append(buts);
                    var back = A.Node.create("<button class='exxo-scrollview-back'></button>");
                    buts.append(back);
                    var next = A.Node.create("<button class='exxo-scrollview-next'></button>");
                    buts.append(next);
                    next.on('click', function () {
                        sv.pages.next();
                    });
                    back.on('click', function () {
                        sv.pages.prev();
                    });
                }
            });
        </script>
    </body>
</html>