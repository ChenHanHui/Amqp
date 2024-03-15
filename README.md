# 模块

spring-boot-amqp-receiver  消息消费者

spring-boot-amqp-sender    消息生产者

# 步骤

修改 spring-boot-amqp-receiver 中 application.yaml 的 rabbitmq.username 和 rabbitmq.password 为rabbitmq的用户名和密码，修改 rabbitmq.host 为虚拟机或者服务器的IP地址。

将 spring-boot-amqp-receiver 打包发布到虚拟机或者服务器上。

请自行安装 RabbitMQ Web 界面

访问服务器部署的 RabbitMQ Web 界面管理：http://IP:15672/

在本机启动 spring-boot-amqp-sender，访问：http://localhost:8080/amqp/mq

之后查看 RabbitMQ Web 界面的数据。