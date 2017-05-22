<!DOCTYPE html>
<html>
<head>
<title>测试RequestForm</title>
<script type="text/javascript" src="/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$(".btn-f-action").click(function(){
			var action = $(this).data("action");
			if(action){
				$("form").attr("action", action).submit();
			}
		});
	});
</script>
</head>
<body>
	<h1>测试RequestForm</h1>
	<div>
		<form action="/req/form" method="post" autocomplete="off">
			<div>
				<label for="name">姓名：</label><input name="name" type="text" />
			</div>
			<div>
				<label for="password">密码：</label><input name="password" type="password" />
			</div>
			<div>
				<label for="age">年龄：</label><input name="age" type="number" min="1" max="150" />
			</div>
			<div><button class="btn-f-action" data-action="/req/form">提交</button>&nbsp;<button class="btn-f-action" data-action="/req/form/body">提交（body）</button></div>
		</form>
	</div>
</body>
</html>