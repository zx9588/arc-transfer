
#!/bin/bash

docker build -t arc-transfer/xxl-job-executor-sample-springboot:2.4.1-SNAPSHOT .

docker rm -f xxl-job-executor-sample-springboot
docker run -p 8701:8701 \
--name xxl-job-executor-sample-springboot \
-v /etc/localtime:/etc/localtime \
-d arc-transfer/xxl-job-executor-sample-springboot:2.4.1-SNAPSHOT
