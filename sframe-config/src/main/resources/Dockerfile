FROM registry.cn-qingdao.aliyuncs.com/docker_loooswc/sframe-java:jdk1.8

MAINTAINER cxy <c.9u@outlook.com>

# 将指定的jar文件复制到容器中
COPY sframe-config /usr/local/sframe-config

WORKDIR /usr/local/sframe-config

#执行jar文件

ENTRYPOINT ["java" ,"-Dloader.path=file:///usr/local/sframe-config/config","-jar","/usr/local/sframe-config/sframe-config-0.0.1-SNAPSHOT.jar"]