使用spring data jpa开发api 接口

maven项目，运行之前，请先安装maven
jdk使用的是1.8，如果改为其他版本的jdk,请修改pom.xml的编译级别

安装postgres数据库（当然了，也可以换成其他的数据库），创建用户admin/admin, 创建db_cloud数据库
创建users表，字段请参照com.lala.myapi.User

直接运行com.lala.myapi.App，启动成功之后，会在9060端口监听

打开浏览器，输入http://127.0.0.1:9060/api/v1/user/find_by_id?id=123 即可查看

后续会加上其他高级用法