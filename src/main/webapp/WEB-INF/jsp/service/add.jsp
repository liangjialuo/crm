<%@ page language="java" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="../css/style.css" rel="stylesheet" type="text/css">
<script src="../js/common.js"></script>
</head>
<body>

<div class="page_title">客户服务管理 > 服务创建</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="add('add.html');">保存</button>  
</div>
<table class="query_form_table">
	<tr>
		<th>编号</th>
		<td><input disabled /></td>
		<th>服务类型</th>
		<td>
			<select>
				<option>请选择...</option>
				<option>咨询</option>
				<option>投诉</option>
				<option>建议</option>
			</select><span class="red_star">*</span>
		</td>
	</tr>
	<tr>
		<th>概要</th>
		<td colspan="3"><input size="53" /><span class="red_star">*</span></td>
	</tr>	
	<tr>
		<th>客户</th>
		<td><input name="T20" size="20" /><span class="red_star">*</span></td>
		<th>状态</th>
		<td>新创建</td>
	</tr>	
	<tr>
		<th>服务请求</th>
		<td colspan="3"><textarea rows="6" cols="50"></textarea><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>创建人</th>
		<td><input name="T19" value="刘颖" readonly size="20" /><span class="red_star">*</span></td>
		<th>创建时间</th>
		<td><input id="t1" name="T15" readonly size="20" /><span class="red_star">*</span></td>
	</tr>
	</table>
<br />
<script>
	setCurTime('t1');
	setCurTime('t2');
	setCurTime('t3');
</script>
</body>
</html>