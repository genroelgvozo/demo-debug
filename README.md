Запрашиваем кандидата
```
curl 'localhost:8080/candidates/1'
```

Запуск для удаленного дебага
```
java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=\*:8083 -jar target/demo-0.0.1-SNAPSHOT.jar
```