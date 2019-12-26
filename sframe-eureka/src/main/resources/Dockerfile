FROM registry.cn-qingdao.aliyuncs.com/docker_loooswc/sframe-java:jdk1.8

MAINTAINER cxy <c.9u@outlook.com>

# 将指定的jar文件复制到容器中
COPY sframe-eureka /usr/local/sframe-eureka

WORKDIR /usr/local/sframe-eureka

#执行jar文件

ENTRYPOINT ["java" ,"-Dloader.path=file:///usr/local/sframe-eureka/config","-jar","/usr/local/sframe-eureka/sframe-eureka-0.0.1-SNAPSHOT.jar"]