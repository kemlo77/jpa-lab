#!/usr/bin/env bash
sudo docker run \
--name myadmin \
-d \
--link mysql-db:db \
-p 8080:80 \
phpmyadmin/phpmyadmin