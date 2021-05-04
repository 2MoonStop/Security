//禁止iframe的嵌套
if( top.location != location){
    top.location = self.location;
}

//常见的Frame Busting有以下这些方式
if(top !=self)
if(top.location != self.location)
if(top.location != location)
if(parent.frames.length > 0)
if(window != top)
if(window.top !== window.self)
if(window.self != window.top)
if(parent && parent != window)
if(parent && parent.frames && parent.frames.length > 0)
if((self.parent&&!(self.parent==self))&&(self.parent.frames.length!=0))
top.location = self.location
top.location.href = document.location.href
top.location.href = self.location.href
top.location.replace(self.location)
top.location.href = window.location.href
top.location.replace(document.location)
top.location.href = window.location.href
top.location.href = "URL"
document.write('')
top.location = location
top.location.replace(document.location)
top.location.replace('URL')
top.location.href = document.location
top.location.replace(window.location.href)
top.location.href = location.href
self.parent.location = document.location
parent.location.location = document.location
top.location.href = self.location
top.location = window.location
top.location.replace(window.location.pathname)
window.top.location = window.self.location
setTimeout(function (){document.body.innerHTML='';},1)
window.self.onload = function (evt){document.body.innerHTML='';}
var url = window.location.href; top.location.replace(url)