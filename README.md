Build project

```shell
./mvnw clean install
```

Docker build
```shell
docker build -t crisaltmann/poc-avro-spring .
```

Docker run:
 ```shell
docker run -p 8080:8080 crisaltmann/poc-avro-spring
```
