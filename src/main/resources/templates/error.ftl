<!DOCTYPE html>
<html>
<head>
    <title>错误页面</title>
</head>
<body>
	<div>错误页面</div>
	<table>
      <thead>
        <tr><td>属性</td><td>值</td></tr>
      </thead>
      <tbody>
        <tr><td>timestamp</td><td>${timestamp?string("yyyy-MM-dd HH:mm:ss.SSS zzzz")}</td></tr>
        <tr><td>status</td><td>${status}</td></tr>
        <tr><td>error</td><td>${error}</td></tr>
        <tr><td>message</td><td>${message}</td></tr>
        <tr><td>path</td><td>${path}</td></tr>
      </tbody>
    </table>
</body>
</html>