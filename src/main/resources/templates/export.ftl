<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
<title>导出表</title>
</head>
<body>
  <h1>导出表</h1>
  <form action="${base}/export/table" method="POST" target="_blank">
    <p><label>表名：</label><input name="tableName" value="device_agent_rel"/></p>
    <p><label>字段：</label><input name="cols" value="device_id,device_name,agent_id,bind_time"/></p>
    <p><label>字段名：</label><input name="colNames" value="设备号,设备名称,机构ID,激活时间"/></p>
    <p><label>导出文件名：</label><input name="exportName" value="test.xlsx"/></p>
    <input type="submit" value="导出"/>
  </form>
</body>
</html>