
#!/bin/bash

docker build -t arc-transfer/xxl-job-admin:2.4.1-SNAPSHOT .

docker rm -f xxl-job-admin
docker run -p 8700:8700 \
--name xxl-job-admin \
-v /etc/localtime:/etc/localtime \
-d arc-transfer/xxl-job-admin:2.4.1-SNAPSHOT
