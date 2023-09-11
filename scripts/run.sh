docker run -d --rm
--name cdn
-e TZ="Asia/Shanghai"
-v /docker/jar:/opt/jar
-v /docker/log:/opt/log
openjdk:17 java -jar /opt/jar/aliyun-cdn-service-0.0.1.jar
--userconfig.aliyun.cdn.end-point=cdn.aliyuncs.com
--userconfig.aliyun.cdn.access-key-id=xxx
--userconfig.aliyun.cdn.access-key-secret=xxx
--userconfig.task.period=30
--log-opt max-size=1000m --log-opt max-file=30