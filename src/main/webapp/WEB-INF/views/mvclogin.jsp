<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.7.1.js"></script>
<script>
	$(function(){
		$("#loginChk").hide();
		
		
	})
	
	const login = ()=>{
		let memberid = $("#memberid").val().trim();
		let memberpw = $("#memberpw").val().trim();
		console.log(memberid+ "/" + memberpw);
		let loginVal = {
					"memberid":memberid,
					"memberpw":memberpw
		}
		
		if(memberid==""|| memberpw==""){
			alert("ID 및 PW를 확인해주세요.");
		}
		else{
			$.ajax({
				type:"post",
				url:"ajaxlogin.do",
				data:JSON.stringify(loginVal),
				contentType:"application/json",
				dataType:"json",
				success:function(msg){
					/*console.log(msg);*/
					if(msg.check==true){
						location.href="list.do";
					}
					else{
						$("#loginChk").show();
						$("#loginChk").html("ID 혹은 PW가 잘못되었습니다.");
						
					}
					
				},
				error:function(){
					alert("통신 실패");
				}
			});
		}
	}
</script>
</head>
<body>
	<h1>login</h1>
	<table>
		<tr>
			<th>ID</th>
			<td><input type="text" id="memberid"></td>
		
		</tr>
		<tr>
			<th>PW</th>
			<td><input type="text" id="memberpw"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="button" value="login" onclick="login();"></td>
		</tr>
		<tr>
			<td colspan="2" align="center" id="loginChk"></td>
		</tr>
	</table>

</body>
</html>