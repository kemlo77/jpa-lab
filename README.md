# jpa-lab
This repo contains an example of a JPA setup using EclipseLink, MySQL, Docker and Gradle.
It was created mostly to serve as an exercise while learning JPA. 
But hopefully it can be handy for someone as a reference.



## Links with inspiration
* [JPA tutorial at JavaTPoint](https://www.javatpoint.com/jpa-tutorial)
* [JPA tutorial at TutorialsPoint](https://www.tutorialspoint.com/jpa/index.htm)


## MySQL database using Docker
Using docker is a fast way to deploy a new database. 
This is the command used (see start_mysql_container.sh). \
Note the '-v' parameter to persist data from the container locally on the host.
So that information is kept even after the Docker container is restarted.
```
sudo docker run \
--name mysql-db \
-p 3306:3306 \
-e MYSQL_ROOT_PASSWORD=rootpassword2018 \
-e MYSQL_DATABASE=phonebook \
-e MYSQL_USER=dbuser \
-e MYSQL_PASSWORD=pwd2018 \
-v /storage/docker/mysql-datadir:/var/lib/mysql \
-d mysql:8.0.15
```
More info at the [MySQL Docker page](https://hub.docker.com/_/mysql). 

Also the phpMyAdmin can be used as a web interface to administer the MySQL database. \
See [phpMyAdmin Docker page](https://hub.docker.com/r/phpmyadmin/phpmyadmin).