#!/usr/bin/env bash
sudo docker run \
--name mysql-db \
-p 3306:3306 \
-e MYSQL_ROOT_PASSWORD=rootpassword2018 \
-e MYSQL_DATABASE=phonebook \
-e MYSQL_USER=dbuser \
-e MYSQL_PASSWORD=pwd2018 \
-v /storage/docker/mysql-datadir:/var/lib/mysql \
-d mysql:8.0.15
