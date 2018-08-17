# SPRING + MONGODB

This project i start a adventure with database noSQL.

**Phase 1: Starting MongoDB**

For ease let's use docker container.

-	Download the image

```
docker pull mongo

```

-	start container 

```
docker run --name my_mongo -d -p 127.0.0.1:27017:27017 mongo:latest

```

Hey, is done, now let's download the *Mongo Compass*, see this page [Document](https://docs.mongodb.com/compass/master/install/#install-on-ubuntu)

With *Mongo Compass* we can manager collections in mongodb instance.

Hey man,very good, phase 1 completed.


**Phase 2: Using Spring**

Added magic dependency


```
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-mongodb</artifactId>
</dependency>

```

and added configuration to connected in **application.properties**

```
spring.data.mongodb.uri=mongodb://localhost:27017/ws-mongo
```

Now see the entity **User**, main annotations are:

-	@Document

Register Class as document in mongodb

-	@Id

Register identification of document in mongodb

---

to more see [wiki](https://github.com/cassunde/spring-mongodb/wiki)
