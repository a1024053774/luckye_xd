function str(str1,str2,par,str3){
    var obj=new XMLHttpRequest();
//dropsservice
    obj.open(str1,"http://localhost:8080/"+str2);
     // 告诉服务器该请求是post，防止被认为是get而报错
     if(str1=="post"){
        obj.setRequestHeader("content-type", "application/x-www-form-urlencoded");
     }
     obj.send(par);
     obj.onreadystatechange=function(){
        if(obj.readyState==4&&obj.status==200){
            var retrunStr=JSON.parse(obj.responseText);
            str3(retrunStr)
            
        }
    }
  
}