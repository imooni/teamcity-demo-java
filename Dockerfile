FROM openjdk:11

# 复制 jar 文件到镜像中
COPY ./target/java-app-0.0.1-SNAPSHOT.jar /java-app-0.0.1-SNAPSHOT.jar

# 设置 jar 文件为可执行文件
RUN chmod +x /java-app-0.0.1-SNAPSHOT.jar

# 运行 jar 文件
CMD ["java", "-jar", "/java-app-0.0.1-SNAPSHOT.jar"]